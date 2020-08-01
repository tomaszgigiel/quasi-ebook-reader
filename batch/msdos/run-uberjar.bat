md "%HOMEPATH%\_delete_content\"
pushd %~dp0\..\..
if not exist ".\target\uberjar\quasi-ebook-reader-uberjar.jar" (
  rmdir /s /q target
  call lein do clean, uberjar
)
call java -cp .\target\uberjar\quasi-ebook-reader-uberjar.jar pl.tomaszgigiel.quasi-ebook-reader.core
pause
popd

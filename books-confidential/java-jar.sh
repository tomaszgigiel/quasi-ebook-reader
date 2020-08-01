# http://stackoverflow.com/questions/59895/getting-the-source-directory-of-a-bash-script-from-within
DIR_PROJECT="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"/.. #
# (cd $DIR_PROJECT; lein do clean, uberjar; java -jar target/uberjar/quasi-ebook-reader-uberjar.jar books-confidential/quasi-ebook-reader.edn;cd -) #
(cd $DIR_PROJECT; java -jar target/uberjar/quasi-ebook-reader-uberjar.jar books-confidential/quasi-ebook-reader.edn;cd -) #

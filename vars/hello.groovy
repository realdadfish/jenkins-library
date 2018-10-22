import static com.example.Util.*

def call(String name) {
    echo "Hello $name at " + serverTime(this)
}

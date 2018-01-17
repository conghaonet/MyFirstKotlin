import android.content.Context
import android.widget.Toast

/**
 * Created by CongHao on 2017/10/12.
 * E-mail: hao.cong@app2m.com
 */
fun showToast(context: Context, content: String) {
    Toast.makeText(context, content, Toast.LENGTH_SHORT).show()
}


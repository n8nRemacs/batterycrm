package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes2.dex */
public final class j5b {
    public final Context a;
    public final f7b b;

    public j5b(Context context, f7b f7bVar) {
        this.a = context;
        this.b = f7bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence a(String str, List list, boolean z, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            CharSequence charSequenceG = "";
            f7b f7bVar = this.b;
            if (i >= length) {
                return (!z || strArr.length == 0) ? "" : TextUtils.concat(f7bVar.j.e(str), " ", ys.v(strArr));
            }
            String str2 = strArr[i];
            if (str2 != null && str2.length() != 0 && uzi.i(str2, list)) {
                CharSequence charSequenceE = f7bVar.j.e(str);
                if (uzi.i(str2.toString(), list)) {
                    String string = str2.toString();
                    charSequenceG = uzi.g(string, y4e.a.i().d(string.toString(), list), a93.s0.x(this.a).k());
                }
                return TextUtils.concat(charSequenceE, " ", charSequenceG);
            }
            i++;
        }
    }
}

package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public final class hl4 {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public hl4(String str, String str2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Object[] objArr = {str, 23};
                if (!(str.length() <= 23)) {
                    throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
                }
                this.b = str;
                this.c = (str2 == null || str2.length() <= 0) ? null : str2;
                return;
            default:
                this.b = str;
                this.c = str2;
                return;
        }
    }

    public void a(String str, String str2, Exception exc) {
        if (Log.isLoggable(this.b, 6)) {
            Log.e(str, b(str2), exc);
        }
    }

    public String b(String str) {
        String str2 = this.c;
        return str2 == null ? str : str2.concat(str);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.b);
                sb.append("(");
                return ho7.l(sb, this.c, ")");
            default:
                return super.toString();
        }
    }
}

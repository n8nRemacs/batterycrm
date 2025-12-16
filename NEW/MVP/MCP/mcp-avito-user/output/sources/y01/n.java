package y01;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.div2.D8;
import o01.C44501b;

/* compiled from: PushClientSp.java */
/* loaded from: classes7.dex */
public class n extends C44501b {

    /* renamed from: b, reason: collision with root package name */
    public Context f442830b;

    public static n g(Context context) {
        n nVar = new n(context, "push_client_self_info");
        nVar.f442830b = context;
        return nVar;
    }

    public final String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Context context = this.f442830b;
            String strC = c(str);
            if (TextUtils.isEmpty(strC)) {
                return "";
            }
            String strE = j.e(context);
            if (!TextUtils.isEmpty(strC) && !TextUtils.isEmpty(strE)) {
                byte[] bArrB = S01.c.b(strE);
                return bArrB.length < 16 ? "" : N01.a.a(strC, bArrB);
            }
            return "";
        } catch (Exception e12) {
            D8.q(e12, new StringBuilder("getSecureData"), "i");
            return "";
        }
    }

    public final boolean h(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Context context = this.f442830b;
            String strC = "";
            if (!TextUtils.isEmpty(str2)) {
                String strE = j.e(context);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(strE)) {
                    byte[] bArrB = S01.c.b(strE);
                    if (bArrB.length >= 16) {
                        strC = N01.a.c(str2, bArrB);
                    }
                }
            }
            return e(str, strC);
        } catch (Exception e12) {
            D8.q(e12, new StringBuilder("saveSecureData"), "i");
            return false;
        }
    }

    public final String i(String str) {
        try {
            return TextUtils.isEmpty(str) ? f("token_info_v2") : f(str);
        } catch (Exception e12) {
            D8.q(e12, new StringBuilder("getSecureData"), "i");
            return "";
        }
    }

    public final void j(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                h("token_info_v2", str2);
            } else {
                h(str, str2);
            }
        } catch (Exception e12) {
            D8.q(e12, new StringBuilder("saveSecureData"), "i");
        }
    }
}

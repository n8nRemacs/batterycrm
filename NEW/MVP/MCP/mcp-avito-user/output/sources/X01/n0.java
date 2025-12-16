package x01;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes7.dex */
public class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static n0 f442049b;

    /* renamed from: a, reason: collision with root package name */
    public Context f442050a;

    public static class a extends AbstractC49718c {

        /* renamed from: a, reason: collision with root package name */
        public String f442051a;

        /* renamed from: b, reason: collision with root package name */
        public String f442052b;

        public final int a() {
            String str = this.f442051a;
            String str2 = this.f442052b;
            AbstractC49719d.a(str, str2);
            AbstractC49719d.a(str, str2);
            AbstractC49719d.a(str, str2);
            return 0;
        }
    }

    public static n0 b() {
        n0 n0Var;
        synchronized (n0.class) {
            try {
                if (f442049b == null) {
                    f442049b = new n0();
                }
                n0Var = f442049b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n0Var;
    }

    public final String a(boolean z12) {
        if (!z12) {
            return "";
        }
        String strB = C49714A.a().f441939a.f441972e;
        if (TextUtils.isEmpty(strB)) {
            strB = C49733s.b(this.f442050a, "global_v2", "uuid");
            if (TextUtils.isEmpty(strB)) {
                strB = UUID.randomUUID().toString().replace("-", "");
                C49733s.e(this.f442050a, "global_v2", "uuid", strB);
            }
            C49714A.a().f441939a.f441972e = strB;
        }
        return strB;
    }
}

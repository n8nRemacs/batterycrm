package x01;

import android.text.TextUtils;

/* renamed from: x01.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49726k {

    /* renamed from: c, reason: collision with root package name */
    public static C49726k f442035c;

    /* renamed from: a, reason: collision with root package name */
    public String f442036a;

    /* renamed from: b, reason: collision with root package name */
    public String f442037b;

    public static boolean b(String str) {
        m0.b("refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            m0.b("refreshLocalKey(): encrypted key is empty");
            return false;
        }
        C49733s.e(AbstractC49722g.b(), "Privacy_MY", "PrivacyData", str);
        C49733s.d(AbstractC49722g.b(), System.currentTimeMillis(), "flashKeyTime");
        return true;
    }

    public static C49726k c() {
        if (f442035c == null) {
            synchronized (C49726k.class) {
                if (f442035c == null) {
                    f442035c = new C49726k();
                }
            }
        }
        return f442035c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7 A[LOOP:0: B:28:0x00d5->B:29:0x00d7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x01.C49726k.a():java.lang.String");
    }
}

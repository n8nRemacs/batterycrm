package defpackage;

/* loaded from: classes2.dex */
public final class hmg extends ki4 {
    public static final hmg b;
    public static final gi4 c;
    public static final gi4 d;
    public static final gi4 e;
    public static final gi4 f;
    public static final gi4 g;

    static {
        hmg hmgVar = new hmg();
        b = hmgVar;
        c = ki4.b(hmgVar, ":settings/privacy/onboarding-twofa", new String[]{"state"}, null, 14);
        d = ki4.b(hmgVar, ":settings/privacy/creation-twofa", new String[]{"track_id", "src"}, null, 14);
        e = ki4.b(hmgVar, ":settings/privacy/profile-deletion", new String[0], null, 14);
        f = ki4.b(hmgVar, ":twofa/password/check", new String[0], null, 14);
        g = ki4.b(hmgVar, ":twofa/auth/password/check", new String[]{"track_id", "phone"}, null, 2);
    }
}

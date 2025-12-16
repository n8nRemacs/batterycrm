package defpackage;

/* loaded from: classes2.dex */
public final class qdc extends ki4 {
    public static final qdc b;
    public static final gi4 c;
    public static final gi4 d;
    public static final gi4 e;
    public static final gi4 f;
    public static final gi4 g;
    public static final gi4 h;
    public static final gi4 i;
    public static final gi4 j;

    static {
        qdc qdcVar = new qdc();
        b = qdcVar;
        c = ki4.b(qdcVar, ":profile/avatars", new String[]{"id", "type"}, null, 14);
        d = ki4.b(qdcVar, ":profile", new String[]{"id", "type"}, null, 14);
        e = ki4.b(qdcVar, ":profile/attaches", new String[]{"id"}, null, 14);
        f = ki4.b(qdcVar, ":profile/members", new String[]{"id", "type"}, null, 14);
        g = ki4.b(qdcVar, ":profile/invite", new String[]{"id"}, null, 14);
        h = ki4.b(qdcVar, ":profile/add-admins", new String[]{"chat_id"}, null, 14);
        i = ki4.b(qdcVar, ":profile/add-members", new String[]{"chat_id", "is_chat"}, null, 14);
        j = ki4.b(qdcVar, ":profile/change-owner", new String[]{"chat_id"}, null, 14);
    }
}

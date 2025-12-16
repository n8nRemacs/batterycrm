package defpackage;

/* loaded from: classes.dex */
public final class ko2 extends i3 {
    public static final ko2 c = new ko2(11);

    public static ei4 L0(long j, Long l) {
        if (l == null) {
            return new ei4(vb9.e(j, ":chats/forward?messages_ids="));
        }
        return new ei4(":chats/forward?messages_ids=" + j + "&attach_id=" + l + "&is_forward_attach=true");
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class k0c extends i3 {
    public static final k0c c = new k0c(11);

    public static ei4 L0(long j, long j2, boolean z) {
        StringBuilder sbN = ho7.n(":chats?id=", j, "&type=", z ? "local" : "server");
        sbN.append("&message_id=");
        sbN.append(j2);
        return new ei4(sbN.toString());
    }
}

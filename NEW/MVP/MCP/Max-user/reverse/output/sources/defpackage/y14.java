package defpackage;

/* loaded from: classes2.dex */
public final class y14 extends i3 {
    public static final y14 c = new y14(11);

    public final void L0(long j, boolean z) {
        ii4 ii4VarP0 = p0();
        StringBuilder sbJ = xc0.j(j, ":call-user?opponent_id=", "&video_enabled=", z);
        sbJ.append("&microphone_enabled=true");
        ii4VarP0.b(sbJ.toString(), null);
    }
}

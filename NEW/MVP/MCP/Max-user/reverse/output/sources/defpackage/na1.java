package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class na1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ na1(int i, Object obj, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                o37 o37Var = (o37) this.c;
                ca1 ca1Var = ca1.c;
                long j = ((m37) o37Var).a;
                ii4 ii4VarP0 = ca1Var.p0();
                StringBuilder sbJ = xc0.j(j, ":call-user?opponent_id=", "&video_enabled=", this.b);
                sbJ.append("&microphone_enabled=true");
                ii4VarP0.b(sbJ.toString(), null);
                break;
            default:
                ur1.w((ur1) this.c, this.b);
                break;
        }
        return qqg.a;
    }
}

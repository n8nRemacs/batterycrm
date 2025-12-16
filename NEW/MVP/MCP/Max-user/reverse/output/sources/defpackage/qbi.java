package defpackage;

/* loaded from: classes.dex */
public final class qbi implements vbi {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds4 b;

    public /* synthetic */ qbi(ds4 ds4Var, int i) {
        this.a = i;
        this.b = ds4Var;
    }

    @Override // defpackage.vbi
    public final int a() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // defpackage.vbi
    public final void b() {
        switch (this.a) {
            case 0:
                ((y38) this.b.a).m();
                break;
            default:
                ((y38) this.b.a).i();
                break;
        }
    }
}

package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class fz1 implements wta {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fz1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wta
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((gz1) this.b).k(obj);
                break;
            case 1:
                ((pac) ((sac) this.b)).g(obj);
                break;
            default:
                ((qh6) this.b).k(obj);
                break;
        }
    }
}

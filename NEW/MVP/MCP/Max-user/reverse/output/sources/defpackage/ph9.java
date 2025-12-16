package defpackage;

/* loaded from: classes2.dex */
public final class ph9 extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ qh9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ph9(Object obj, qh9 qh9Var, int i) {
        super(12, obj);
        this.c = i;
        this.d = qh9Var;
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!fni.a(obj, obj2)) {
                    qh9 qh9Var = this.d;
                    qh9Var.d((int[]) obj2, qh9Var.getBounds());
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    qh9 qh9Var2 = this.d;
                    qh9Var2.e((int[]) obj2, qh9Var2.getBounds());
                    break;
                }
                break;
        }
    }
}

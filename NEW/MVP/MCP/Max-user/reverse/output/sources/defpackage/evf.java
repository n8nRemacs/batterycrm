package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class evf implements sm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gvf b;

    public /* synthetic */ evf(gvf gvfVar, int i) {
        this.a = i;
        this.b = gvfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float fFloatValue = ((Float) obj).floatValue();
        Float f = (Float) obj2;
        switch (i) {
            case 0:
                f.getClass();
                gvf.a(this.b, fFloatValue);
                break;
            default:
                gvf.b(this.b, fFloatValue, f.floatValue());
                break;
        }
        return qqg.a;
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class h6c implements sm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6c b;

    public /* synthetic */ h6c(o6c o6cVar, int i) {
        this.a = i;
        this.b = o6cVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float fFloatValue = ((Float) obj).floatValue();
        Float f = (Float) obj2;
        switch (i) {
            case 0:
                f.getClass();
                o6c.b(this.b, fFloatValue);
                break;
            case 1:
                o6c.c(this.b, fFloatValue, f.floatValue());
                break;
            default:
                f.getClass();
                o6c.a(this.b, fFloatValue);
                break;
        }
        return qqg.a;
    }
}

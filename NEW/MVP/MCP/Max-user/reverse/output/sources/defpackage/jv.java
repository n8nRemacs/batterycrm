package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class jv implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xw b;

    public /* synthetic */ jv(xw xwVar, int i) {
        this.a = i;
        this.b = xwVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.h().c();
            case 1:
                xw xwVar = this.b;
                Object value = xwVar.B.getValue();
                x9f x9fVar = xwVar.t;
                return wmf.e("loadNext: try offer LoadingNext after remote call. \n                                |Current state " + value + ",\n                                |Pipeline observing job is active " + (x9fVar != null ? Boolean.valueOf(x9fVar.isActive()) : null) + "\n                                |");
            default:
                xw xwVar2 = this.b;
                Object value2 = xwVar2.B.getValue();
                x9f x9fVar2 = xwVar2.t;
                return wmf.e("loadPrev: try offer LoadingPrev after remote call. \n                                |Current state " + value2 + ",\n                                |Pipeline observing job is active " + (x9fVar2 != null ? Boolean.valueOf(x9fVar2.isActive()) : null) + "\n                                |");
        }
    }
}

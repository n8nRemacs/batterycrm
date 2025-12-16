package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class d4b implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4b b;

    public /* synthetic */ d4b(g4b g4bVar, int i) {
        this.a = i;
        this.b = g4bVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.b;
            case 1:
                g4b g4bVar = this.b;
                return new b4b(new gge(g4bVar.c, g4bVar.d, new d4b(g4bVar, 0)));
            default:
                return this.b.c();
        }
    }
}

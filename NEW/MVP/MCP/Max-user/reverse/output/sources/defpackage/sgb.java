package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class sgb implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vgb b;

    public /* synthetic */ sgb(vgb vgbVar, int i) {
        this.a = i;
        this.b = vgbVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.s;
            case 1:
                this.b.getClass();
                return null;
            default:
                return this.b.D;
        }
    }
}

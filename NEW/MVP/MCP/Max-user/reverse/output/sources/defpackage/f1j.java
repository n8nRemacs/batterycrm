package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class f1j implements rpc {
    public final /* synthetic */ int a;
    public final /* synthetic */ jig b;

    public /* synthetic */ f1j(jig jigVar, int i) {
        this.a = i;
        this.b = jigVar;
    }

    @Override // defpackage.rpc
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new gf5("json"), uha.C0);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new gf5("proto"), tha.z0);
            case 2:
                return this.b.a("FIREBASE_ML_SDK", new gf5("json"), new cwf());
            default:
                return this.b.a("FIREBASE_ML_SDK", new gf5("proto"), new osf());
        }
    }
}

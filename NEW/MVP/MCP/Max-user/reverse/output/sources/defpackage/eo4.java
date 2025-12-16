package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class eo4 implements crf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eo4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.crf
    public final Object get() {
        switch (this.a) {
            case 0:
                try {
                    return (b99) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (ao4) this.b;
            case 2:
                return (b99) this.b;
            case 3:
                return (vld) this.b;
            case 4:
                return (zq4) this.b;
            case 5:
                return (fde) this.b;
            case 6:
                return (jb8) this.b;
            case 7:
                return (ar4) this.b;
            default:
                return (qgb) this.b;
        }
    }
}

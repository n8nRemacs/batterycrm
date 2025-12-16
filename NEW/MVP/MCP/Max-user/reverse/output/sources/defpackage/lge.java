package defpackage;

/* loaded from: classes2.dex */
public final class lge extends fhe {
    public final /* synthetic */ int g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lge(long j, Object obj, int i) {
        super(j);
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.fhe
    public final ghe a() {
        switch (this.g) {
            case 0:
                return new mge(this);
            case 1:
                return new mge(this, (byte) 0);
            default:
                return new ihe(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lge(eh9 eh9Var) {
        super(0L);
        this.g = 0;
        this.h = eh9Var;
    }
}

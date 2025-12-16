package defpackage;

/* loaded from: classes2.dex */
public final class xge extends fhe {
    public final /* synthetic */ int g;
    public final long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xge(int i, long j, long j2) {
        super(j);
        this.g = i;
        this.h = j2;
    }

    @Override // defpackage.fhe
    public final ghe a() {
        switch (this.g) {
            case 0:
                return new yge(this.a, this.h);
            default:
                return new yge(this);
        }
    }
}

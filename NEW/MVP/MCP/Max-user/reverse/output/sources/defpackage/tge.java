package defpackage;

/* loaded from: classes2.dex */
public final class tge extends fhe {
    public final long g;
    public final long h;
    public final long i;

    public tge(long j, long j2, long j3) {
        super(0L);
        this.g = j;
        this.h = j2;
        this.i = j3;
    }

    @Override // defpackage.fhe
    public final ghe a() {
        return new uge(this);
    }
}

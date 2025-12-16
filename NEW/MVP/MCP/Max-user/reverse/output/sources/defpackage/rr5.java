package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class rr5 implements p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ rr5(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.p6
    public final void run() {
        int i = this.a;
        boolean z = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                wqi.c("vr5", "markAsFavorite: complete for setId=%d favorite=%b", Long.valueOf(j), Boolean.valueOf(z));
                break;
            default:
                wqi.c("ps5", "markAsFavorite: complete for stickerId=%d favorite=%b", Long.valueOf(j), Boolean.valueOf(z));
                break;
        }
    }
}

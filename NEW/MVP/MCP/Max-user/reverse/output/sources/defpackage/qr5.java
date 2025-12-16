package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class qr5 implements p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ qr5(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.p6
    public final void run() {
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                wqi.c("vr5", "onNotifAdded: added sticker set %d to cache", Long.valueOf(j));
                break;
            case 1:
                wqi.c("vr5", "loadFromMarker: success marker=d", Long.valueOf(j));
                break;
            case 2:
                wqi.c("gs5", "assetsUpdate: queued on api, sync=%d", Long.valueOf(j));
                break;
            case 3:
                wqi.c("ps5", "onNotifAdded: added sticker %d to cache", Long.valueOf(j));
                break;
            default:
                wqi.c("ps5", "loadFromMarker: success marker=d", Long.valueOf(j));
                break;
        }
    }
}

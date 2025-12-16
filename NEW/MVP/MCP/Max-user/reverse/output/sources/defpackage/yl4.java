package defpackage;

import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class yl4 implements p6 {
    public final /* synthetic */ int a;

    public /* synthetic */ yl4(int i) {
        this.a = i;
    }

    @Override // defpackage.p6
    public final void run() {
        switch (this.a) {
            case 0:
                wqi.c("zl4", "clear: cleared repository", new Object[0]);
                break;
            case 1:
                wqi.c("vr5", "onAssetsUpdate: stored fav sticker sets", new Object[0]);
                break;
            case 2:
                wqi.c("vr5", "clear: cleared fav stickers repository", new Object[0]);
                break;
            case 3:
                wqi.c("js5", "assetsUpdate: queued on api, sync=%d", 0L);
                break;
            case 4:
                wqi.c("ps5", "clear: cleared repository", new Object[0]);
                break;
            case 5:
                wqi.c("vcd", "clearRecentSearch: success", new Object[0]);
                break;
            case 6:
                wqi.c("kdd", "RECENT ADDED update handle success", new Object[0]);
                break;
            case 7:
                wqi.c("kdd", "RECENT REMOVED update handle success", new Object[0]);
                break;
            case 8:
                wqi.c("kdd", "Add to recents success", new Object[0]);
                break;
            case 9:
                awd awdVar = bwd.a;
                break;
            case 10:
                wqi.c("tef", "clear: cleared repository", new Object[0]);
                break;
            case 11:
                wqi.c("tef", "Success update recents", new Object[0]);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                wqi.c("igf", "clear: repository cleared", new Object[0]);
                break;
            case 13:
                wqi.c("aug", "clear: cleared upload repository", new Object[0]);
                break;
            default:
                wqi.c("u2h", "clear: success", new Object[0]);
                break;
        }
    }
}

package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class mr5 implements p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ mr5(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.p6
    public final void run() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                wqi.c("vr5", "onNotifRemoved: removed sticker sets %s from cache", list);
                break;
            case 1:
                wqi.c("vr5", "onListUpdated: success store stickers sets=%s", list);
                break;
            case 2:
                wqi.c("ps5", "onAssetsUpdate: success store stickers %s", list);
                break;
            case 3:
                wqi.c("ps5", "removeFromFavorites: ids=%s", list);
                break;
            case 4:
                wqi.c("ps5", "onListUpdated: success store stickers %s", list);
                break;
            case 5:
                wqi.c("ps5", "onNotifRemoved: removed stickers %s from cache", list);
                break;
            case 6:
                wqi.c("igf", "storeStickerSets: success for sets = %s", list);
                break;
            case 7:
                wqi.c("igf", "storeStickerSetsFromServer: success: %s", list);
                break;
            default:
                wqi.c("a3g", "awaitNoTasksByTypes: finished for types=%s", list);
                break;
        }
    }
}

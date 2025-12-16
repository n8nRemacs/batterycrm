package com.avito.android.vas_performance.ui.stickers.buy;

import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.util.P2;
import com.avito.android.vas_performance.ui.stickers.buy.StickersBuyVasFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: StickersBuyVasFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class e extends H implements Y41.l<P2<? super DeepLinkResponse>, G0> {
    @Override // Y41.l
    public final G0 invoke(P2<? super DeepLinkResponse> p22) {
        P2<? super DeepLinkResponse> p23 = p22;
        StickersBuyVasFragment stickersBuyVasFragment = (StickersBuyVasFragment) this.receiver;
        StickersBuyVasFragment.a aVar = StickersBuyVasFragment.f321919K0;
        stickersBuyVasFragment.getClass();
        if (p23 instanceof P2.c) {
            stickersBuyVasFragment.q5().setLoading(true);
        } else if (p23 instanceof P2.b) {
            stickersBuyVasFragment.q5().setLoading(false);
        } else if (p23 instanceof P2.a) {
            stickersBuyVasFragment.t5().a("");
            stickersBuyVasFragment.q5().setLoading(false);
        }
        return G0.f406611a;
    }
}

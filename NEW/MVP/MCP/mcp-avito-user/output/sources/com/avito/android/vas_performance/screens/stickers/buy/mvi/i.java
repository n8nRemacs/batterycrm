package com.avito.android.vas_performance.screens.stickers.buy.mvi;

import KL0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StickersBuyOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "LKL0/b;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements t<StickersBuyInternalAction, KL0.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final KL0.b b(StickersBuyInternalAction stickersBuyInternalAction) {
        StickersBuyInternalAction stickersBuyInternalAction2 = stickersBuyInternalAction;
        if (stickersBuyInternalAction2 instanceof StickersBuyInternalAction.OpenDeepLink) {
            DeepLink deepLink = ((StickersBuyInternalAction.OpenDeepLink) stickersBuyInternalAction2).f320737b;
            if (deepLink != null) {
                return new b.C0567b(deepLink);
            }
            return null;
        }
        if (stickersBuyInternalAction2 instanceof StickersBuyInternalAction.ShowStickerDescription) {
            return new b.c(((StickersBuyInternalAction.ShowStickerDescription) stickersBuyInternalAction2).f320738b);
        }
        if (stickersBuyInternalAction2 instanceof StickersBuyInternalAction.CloseScreen) {
            return new b.a(((StickersBuyInternalAction.CloseScreen) stickersBuyInternalAction2).f320733b);
        }
        return null;
    }
}

package com.avito.android.vas_performance.screens.stickers.buy;

import KL0.a;
import com.avito.android.vas_performance.screens.stickers.buy.StickersBuyFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersBuyFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StickersBuyFragment f320659l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a f320660m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StickersBuyFragment stickersBuyFragment, com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a aVar) {
        super(0);
        this.f320659l = stickersBuyFragment;
        this.f320660m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        StickersBuyFragment.a aVar = StickersBuyFragment.f320573L0;
        StickersBuyFragment stickersBuyFragment = this.f320659l;
        stickersBuyFragment.u5().accept(new a.e(this.f320660m));
        a aVar2 = stickersBuyFragment.f320582H0;
        if (aVar2 != null) {
            aVar2.r();
        }
        return G0.f406611a;
    }
}

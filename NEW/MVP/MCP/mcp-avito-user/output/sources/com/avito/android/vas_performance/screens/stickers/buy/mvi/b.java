package com.avito.android.vas_performance.screens.stickers.buy.mvi;

import KL0.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StickersBuyActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LKL0/a;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "LKL0/c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.arch.mvi.a<KL0.a, StickersBuyInternalAction, KL0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.c f320701a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.a f320702b;

    @Inject
    public b(@Y61.k com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.c cVar, @Y61.k com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.a aVar) {
        this.f320701a = cVar;
        this.f320702b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StickersBuyInternalAction> b(KL0.a aVar, KL0.c cVar) {
        KL0.a aVar2 = aVar;
        KL0.c cVar2 = cVar;
        if (aVar2 instanceof a.b) {
            return C43175k.G(new a(cVar2, this, aVar2, null));
        }
        if (aVar2 instanceof a.e) {
            return new C43210w(new StickersBuyInternalAction.StickerSelected(((a.e) aVar2).f9399a));
        }
        if (aVar2 instanceof a.d) {
            return new C43210w(new StickersBuyInternalAction.ShowStickerDescription(((a.d) aVar2).f9398a));
        }
        if (aVar2.equals(a.c.f9397a)) {
            return this.f320702b.a();
        }
        if (aVar2.equals(a.C0566a.f9395a)) {
            return new C43210w(new StickersBuyInternalAction.CloseScreen(false, 1, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}

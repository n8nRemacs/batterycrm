package com.avito.android.vas_performance.ui.stickers.buy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersBuyVasFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/stickers/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_performance/ui/items/stickers/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<com.avito.android.vas_performance.ui.items.stickers.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StickersBuyVasFragment f321955l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(StickersBuyVasFragment stickersBuyVasFragment) {
        super(1);
        this.f321955l = stickersBuyVasFragment;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.vas_performance.ui.items.stickers.a aVar) {
        com.avito.android.vas_performance.ui.items.stickers.a aVar2 = aVar;
        StickersBuyVasFragment stickersBuyVasFragment = this.f321955l;
        UL0.a aVar3 = stickersBuyVasFragment.f321929I0;
        if (aVar3 != null) {
            aVar3.r();
        }
        Context contextRequireContext = stickersBuyVasFragment.requireContext();
        ScreenPerformanceTracker screenPerformanceTracker = stickersBuyVasFragment.f321938u0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker != null ? screenPerformanceTracker : null;
        k kVar = new k(stickersBuyVasFragment, aVar2);
        UL0.a aVar4 = new UL0.a(contextRequireContext, 0, 2, null);
        aVar4.f16352E = kVar;
        screenPerformanceTracker2.m(screenPerformanceTracker2.getF90716d());
        com.avito.android.lib.design.bottom_sheet.j.c(aVar4, aVar2.f321723c, true, 0, 0, 0, 120);
        com.avito.android.lib.design.bottom_sheet.q qVar = aVar4.f178530x;
        if (qVar != null) {
            qVar.D(true);
        }
        View viewInflate = LayoutInflater.from(contextRequireContext).inflate(R.layout.dialog_vas_sticker_buyer_description, (ViewGroup) null, false);
        aVar4.setContentView(viewInflate);
        D6.c(aVar4.findViewById(R.id.bottom_sheet_right_cross_header), null, Integer.valueOf(y6.b(18)), null, null, 13);
        View viewFindViewById = viewInflate.findViewById(R.id.description);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(aVar2.f321725e);
        View viewFindViewById2 = viewInflate.findViewById(R.id.select);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById2).setOnClickListener(new A91.p(aVar4, 16));
        ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, null, null, 7);
        stickersBuyVasFragment.f321929I0 = aVar4;
        com.avito.android.lib.util.g.a(aVar4);
        return G0.f406611a;
    }
}

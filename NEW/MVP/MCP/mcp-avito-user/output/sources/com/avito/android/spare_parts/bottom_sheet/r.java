package com.avito.android.spare_parts.bottom_sheet;

import com.avito.android.recycler.layout_manager.UnpredictiveStaticHeightLayoutManager;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41816g;
import kotlin.Metadata;

/* compiled from: SparePartsBottomSheetView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(I)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f284829b;

    public r(p pVar) {
        this.f284829b = pVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        p pVar = this.f284829b;
        UnpredictiveStaticHeightLayoutManager unpredictiveStaticHeightLayoutManager = pVar.f284826e;
        int i12 = unpredictiveStaticHeightLayoutManager.f252357I;
        unpredictiveStaticHeightLayoutManager.f252356H = false;
        return pVar.f284824c ? AbstractC41768a.o(new IllegalStateException()) : new C41816g(new n(i12, iIntValue, 150L, new u(pVar)));
    }
}

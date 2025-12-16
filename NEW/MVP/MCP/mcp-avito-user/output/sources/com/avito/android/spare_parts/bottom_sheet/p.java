package com.avito.android.spare_parts.bottom_sheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.recycler.layout_manager.UnpredictiveStaticHeightLayoutManager;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SparePartsBottomSheetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/p;", "Lcom/avito/android/spare_parts/bottom_sheet/m;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d f284822a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f284823b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f284824c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.subjects.h<Integer> f284825d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final UnpredictiveStaticHeightLayoutManager f284826e;

    /* compiled from: SparePartsBottomSheetView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Integer, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            io.reactivex.rxjava3.subjects.h<Integer> hVar = p.this.f284825d;
            if (hVar != null) {
                hVar.onSuccess(Integer.valueOf(iIntValue));
            }
            return G0.f406611a;
        }
    }

    public p(@Y61.k View view, @Y61.k com.avito.android.lib.design.bottom_sheet.d dVar, @Y61.k com.avito.konveyor.adapter.j jVar) {
        this.f284822a = dVar;
        view.getContext();
        RecyclerView recyclerView = (RecyclerView) view;
        this.f284823b = recyclerView;
        UnpredictiveStaticHeightLayoutManager unpredictiveStaticHeightLayoutManager = new UnpredictiveStaticHeightLayoutManager();
        this.f284826e = unpredictiveStaticHeightLayoutManager;
        unpredictiveStaticHeightLayoutManager.f252358J = new a();
        recyclerView.setLayoutManager(unpredictiveStaticHeightLayoutManager);
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
    }

    public final void a() {
        RecyclerView recyclerView = this.f284823b;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.height = -2;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setTranslationX(0.0f);
        this.f284826e.f252356H = false;
    }
}

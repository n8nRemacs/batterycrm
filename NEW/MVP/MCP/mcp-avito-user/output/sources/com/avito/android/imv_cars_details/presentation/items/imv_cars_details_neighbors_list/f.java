package com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import com.avito.konveyor.adapter.j;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: ImvCarsDetailsNeighborsListView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_neighbors_list/f;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_neighbors_list/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f170133b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f170134c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.lib.util.recycler_wrap_height_calculator.c f170135d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public m f170136e;

    /* compiled from: ImvCarsDetailsNeighborsListView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "maxHeight", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int iIntValue = ((Number) obj).intValue();
            RecyclerView recyclerView = f.this.f170134c;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            layoutParams.height = iIntValue;
            recyclerView.setLayoutParams(layoutParams);
        }
    }

    /* compiled from: ImvCarsDetailsNeighborsListView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f170138b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Bad request of highest item", (Throwable) obj);
        }
    }

    public f(@k View view, @k j jVar) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.imv_cars_details_neighbors_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170133b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.imv_cars_details_neighbors_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f170134c = recyclerView;
        this.f170135d = new com.avito.android.lib.util.recycler_wrap_height_calculator.c();
        recyclerView.setAdapter(jVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list.e
    public final void b(@l String str) {
        I5.a(this.f170133b, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        m mVar = this.f170136e;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list.e
    public final void oZ() {
        m mVar = this.f170136e;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f170136e = (m) com.avito.android.lib.util.recycler_wrap_height_calculator.c.a(this.f170135d, this.f170134c, null, null, null, 30).x(new a(), b.f170138b);
    }
}

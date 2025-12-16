package com.avito.android.favorite_sellers.adapter.recommendation;

import android.content.res.Resources;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RecommendationItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/B;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorite_sellers/adapter/recommendation/A;", "a", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class B extends com.avito.konveyor.adapter.b implements A {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f155582i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f155583b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f155584c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f155585d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f155586e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f155587f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f155588g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C f155589h;

    /* compiled from: RecommendationItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/B$a;", "Landroidx/recyclerview/widget/z;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23434z {
        @Override // androidx.recyclerview.widget.C23434z
        public final float j(@Y61.k DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* compiled from: RecommendationItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/favorite_sellers/adapter/recommendation/B$b", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.reactivex.rxjava3.core.B<Parcelable> f155590b;

        public b(io.reactivex.rxjava3.core.B<Parcelable> b12) {
            this.f155590b = b12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            RecyclerView.m layoutManager;
            Parcelable parcelableY0;
            if (i12 != 0 || (layoutManager = recyclerView.getLayoutManager()) == null || (parcelableY0 = layoutManager.Y0()) == null) {
                return;
            }
            this.f155590b.onNext(parcelableY0);
        }
    }

    public B(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        super(view);
        this.f155583b = aVar2;
        Resources resources = view.getResources();
        View viewFindViewById = view.findViewById(R.id.carousel);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f155584c = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f155585d = (TextView) viewFindViewById2;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar2, aVar);
        this.f155586e = jVar;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f155587f = linearLayoutManager;
        jVar.setHasStableIds(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(jVar);
        recyclerView.setScrollingTouchSlop(0);
        new SV.a(8388613, 0).b(recyclerView);
        recyclerView.l(new g(resources.getDimensionPixelOffset(R.dimen.recommendation_carousel_item_padding)), -1);
        this.f155589h = new io.reactivex.rxjava3.internal.operators.observable.C(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 20));
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.A
    public final void EB(int i12) {
        this.f155586e.notifyItemChanged(i12);
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.A
    @Y61.k
    /* renamed from: GH, reason: from getter */
    public final io.reactivex.rxjava3.internal.operators.observable.C getF155589h() {
        return this.f155589h;
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.A
    public final void Nz(@Y61.k UV0.c cVar) {
        this.f155583b.c(cVar);
        RecyclerView recyclerView = this.f155584c;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        D6.G(recyclerView, !cVar.f16399b.isEmpty());
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.A
    public final void T7(@Y61.k Parcelable parcelable) {
        RecyclerView.m layoutManager = this.f155584c.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.X0(parcelable);
        }
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.A
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f155588g = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f155588g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.A
    public final void sQ() {
        RecyclerView recyclerView = this.f155584c;
        if (recyclerView.getScrollState() == 0) {
            LinearLayoutManager linearLayoutManager = this.f155587f;
            int iL1 = linearLayoutManager.L1();
            int i12 = iL1 + 1;
            if (iL1 == -1 || i12 >= this.f155586e.f338513c.getCount()) {
                return;
            }
            linearLayoutManager.l1(iL1);
            a aVar = new a(recyclerView.getContext());
            aVar.f53878a = i12;
            linearLayoutManager.x1(aVar);
        }
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.A
    public final void setTitle(@Y61.l CharSequence charSequence) {
        I5.a(this.f155585d, charSequence, false);
    }
}

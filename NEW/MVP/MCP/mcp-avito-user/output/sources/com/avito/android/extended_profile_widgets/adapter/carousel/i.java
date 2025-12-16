package com.avito.android.extended_profile_widgets.adapter.carousel;

import Y41.l;
import Y61.k;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.extended_profile_widgets.adapter.carousel.h;
import com.avito.android.util.I5;
import com.avito.android.util.X1;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/carousel/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/carousel/h;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f154303f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f154304b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f154305c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f154306d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f154307e;

    /* compiled from: CarouselItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile_widgets/adapter/carousel/i$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<h.a, G0> f154309c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super h.a, G0> lVar) {
            this.f154309c = lVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @k RecyclerView recyclerView) {
            int i13 = i.f154303f;
            if (i.this.f154306d.getScrollState() != 0) {
                return;
            }
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                ((e) this.f154309c).invoke(new h.a(linearLayoutManager.L1(), (LinearLayoutManager.SavedState) linearLayoutManager.Y0()));
            }
        }
    }

    public i(@k View view, @k com.avito.konveyor.a aVar, @k com.avito.konveyor.adapter.h hVar) {
        super(view);
        this.f154304b = hVar;
        View viewFindViewById = view.findViewById(R.id.extended_carousel_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154305c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_carousel_adverts);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f154306d = recyclerView;
        j jVar = new j(hVar, aVar);
        this.f154307e = jVar;
        recyclerView.setAdapter(jVar);
        int iB2 = kotlin.math.b.b(view.getContext().getResources().getDimension(R.dimen.extended_profile_widget_horizontal_margin));
        recyclerView.l(new X1(iB2, iB2, 0, 4, null), -1);
        recyclerView.l(new com.avito.android.extended_profile_widgets.adapter.carousel.a(view.getResources()), -1);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.carousel.h
    public final void XJ(@k CarouselItem carouselItem, @k l<? super h.a, G0> lVar) {
        I5.a(this.f154305c, carouselItem.f154285d, false);
        RecyclerView recyclerView = this.f154306d;
        recyclerView.s();
        this.f154304b.f338510e = new UV0.c(carouselItem.f154286e);
        this.f154307e.notifyDataSetChanged();
        if (recyclerView.getScrollState() == 0) {
            Parcelable parcelable = carouselItem.f154287f;
            if (parcelable != null) {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.X0(parcelable);
                }
            } else {
                RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 != null) {
                    layoutManager2.l1(0);
                }
            }
        }
        recyclerView.o(new a(lVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154306d.s();
    }
}

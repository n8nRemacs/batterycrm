package com.avito.android.extended_profile_widgets.adapter.universal.carousel;

import Y41.p;
import Y61.k;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.y6;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalWidgetCarouselContainerItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/universal/carousel/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/universal/carousel/h;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f154981f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f154982b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f154983c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final j f154984d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayoutManager f154985e;

    /* compiled from: UniversalWidgetCarouselContainerItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile_widgets/adapter/universal/carousel/i$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<Integer, Parcelable, G0> f154987c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super Integer, ? super Parcelable, G0> pVar) {
            this.f154987c = pVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @k RecyclerView recyclerView) {
            int i13 = i.f154981f;
            i iVar = i.this;
            if (iVar.f154983c.getScrollState() != 0) {
                return;
            }
            LinearLayoutManager linearLayoutManager = iVar.f154985e;
            ((e) this.f154987c).invoke(Integer.valueOf(linearLayoutManager.L1()), linearLayoutManager.Y0());
        }
    }

    public i(@k View view, @k com.avito.konveyor.a aVar, @k com.avito.konveyor.adapter.a aVar2) {
        super(view);
        this.f154982b = aVar2;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.extended_profile_universal_widget_carousel_container_recycler);
        this.f154983c = recyclerView;
        j jVar = new j(aVar2, aVar);
        this.f154984d = jVar;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f154985e = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(jVar);
        int dimension = (int) recyclerView.getResources().getDimension(R.dimen.extended_profile_widget_horizontal_image_margin);
        recyclerView.l(new com.avito.android.profile.horizontal_scroll_widget.a(dimension, dimension, y6.b(2)), -1);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.universal.carousel.h
    public final void gr(@k UniversalWidgetCarouselContainerItem universalWidgetCarouselContainerItem, @k p<? super Integer, ? super Parcelable, G0> pVar) {
        RecyclerView recyclerView = this.f154983c;
        recyclerView.s();
        this.f154982b.c(new UV0.c(universalWidgetCarouselContainerItem.f154967d));
        this.f154984d.notifyDataSetChanged();
        if (recyclerView.getScrollState() == 0) {
            Parcelable parcelable = universalWidgetCarouselContainerItem.f154968e;
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
        recyclerView.o(new a(pVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154983c.s();
    }
}

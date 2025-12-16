package com.avito.android.advert.item.brandingGallery.block;

import Oi0.C14700d;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.brandingGallery.items.BrandingGalleryBlockElementItem;
import com.avito.android.util.L0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.l;

/* compiled from: BrandingGalleryBlockView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/brandingGallery/block/e;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f74139j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f74140b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14700d f74141c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final L0 f74142d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f74143e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f74144f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final UV0.c<BrandingGalleryBlockElementItem> f74145g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final RecyclerView f74146h;

    /* renamed from: i, reason: collision with root package name */
    public final int f74147i;

    /* compiled from: BrandingGalleryBlockView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/brandingGallery/block/e$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @k RecyclerView recyclerView) {
            if (i12 == 0) {
                int i13 = e.f74139j;
                e eVar = e.this;
                eVar.getClass();
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null) {
                    return;
                }
                eVar.f74143e.j7(C42745f0.M0(new l(linearLayoutManager.K1(), linearLayoutManager.M1(), 1)));
            }
        }
    }

    public e(@k View view, @k com.avito.konveyor.adapter.a aVar, @k C14700d c14700d, @k L0 l02, @k com.avito.android.advert_core.analytics.a aVar2) {
        super(view);
        this.f74140b = aVar;
        this.f74141c = c14700d;
        this.f74142d = l02;
        this.f74143e = aVar2;
        ArrayList arrayList = new ArrayList();
        this.f74144f = arrayList;
        this.f74145g = new UV0.c<>(arrayList);
        View viewFindViewById = view.findViewById(R.id.advert_details_branding_gallery_block_elements);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f74146h = recyclerView;
        this.f74147i = view.getResources().getDimensionPixelSize(R.dimen.branding_gallery_max_item_width);
        recyclerView.setAdapter(c14700d);
        recyclerView.l(new J4.a(), -1);
        recyclerView.o(new a());
    }
}

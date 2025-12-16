package com.avito.android.serp.adapter.images_and_links_item.view;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.konveyor.adapter.j;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImagesWithLinksHorizontal.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/images_and_links_item/view/b;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RecyclerView f270218a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f270219b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f270220c = C42727D.c(new a());

    /* renamed from: d, reason: collision with root package name */
    @k
    public final j f270221d;

    /* compiled from: ImagesWithLinksHorizontal.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/GridLayoutManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<GridLayoutManager> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final GridLayoutManager invoke() {
            b.this.f270218a.getContext();
            return new GridLayoutManager(2, 1);
        }
    }

    public b(@k RecyclerView recyclerView, @k com.avito.konveyor.adapter.a aVar, @k com.avito.konveyor.a aVar2, int i12) {
        this.f270218a = recyclerView;
        this.f270219b = aVar;
        this.f270221d = new j(aVar, aVar2);
    }
}

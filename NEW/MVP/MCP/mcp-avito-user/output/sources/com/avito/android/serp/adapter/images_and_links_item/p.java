package com.avito.android.serp.adapter.images_and_links_item;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.images_and_links_item.item.ImageWithLinkItem;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.internal.operators.observable.C;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImagesWithLinksItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/images_and_links_item/p;", "Lcom/avito/android/serp/adapter/images_and_links_item/l;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f270209i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f270210b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f270211c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f270212d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f270213e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f270214f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.serp.adapter.images_and_links_item.view.a f270215g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.serp.adapter.images_and_links_item.view.b f270216h;

    public p(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        super(view);
        this.f270210b = view;
        this.f270211c = aVar;
        this.f270212d = aVar2;
        View viewFindViewById = view.findViewById(R.id.images_with_links_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f270213e = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270214f = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.serp.adapter.images_and_links_item.l
    @Y61.k
    public final C PH() {
        return new C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.serp.adapter.images_and_links_item.m
            @Override // io.reactivex.rxjava3.core.C
            public final void f(B b12) {
                final com.avito.android.serp.adapter.images_and_links_item.view.a aVar = this.f270206b.f270215g;
                b12.f(new l41.f() { // from class: com.avito.android.serp.adapter.images_and_links_item.n
                    @Override // l41.f
                    public final void cancel() {
                        int i12 = p.f270209i;
                        com.avito.android.serp.adapter.images_and_links_item.view.a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.f132081p = null;
                        }
                    }
                });
                if (aVar != null) {
                    aVar.f132081p = new o(b12);
                }
            }
        });
    }

    @Override // com.avito.android.serp.adapter.images_and_links_item.l
    public final void W0(int i12) {
        com.avito.android.serp.adapter.images_and_links_item.view.a aVar = this.f270215g;
        if (aVar != null) {
            aVar.f132070e.A0(i12);
        }
    }

    @Override // com.avito.android.serp.adapter.images_and_links_item.l
    public final void Wv(@Y61.k List<ImageWithLinkItem> list, boolean z12) {
        D6.w(this.f270214f);
        View view = this.f270210b;
        if (z12) {
            if (this.f270215g == null) {
                this.f270215g = new com.avito.android.serp.adapter.images_and_links_item.view.a(this.f270213e, this.f270212d, this.f270211c, null, false, Integer.valueOf(D6.j(view, 11)), null, false, 192, null);
            }
            com.avito.android.serp.adapter.images_and_links_item.view.a aVar = this.f270215g;
            if (aVar != null) {
                aVar.f270217w = list;
                aVar.h();
                return;
            }
            return;
        }
        if (this.f270216h == null) {
            RecyclerView recyclerView = this.f270213e;
            D6.f(recyclerView, 0, 0, recyclerView.getPaddingRight() - D6.j(view, 11), 0, 11);
            int iJ2 = D6.j(view, 11);
            com.avito.android.serp.adapter.images_and_links_item.view.b bVar = new com.avito.android.serp.adapter.images_and_links_item.view.b(recyclerView, this.f270212d, this.f270211c, iJ2);
            this.f270216h = bVar;
            com.avito.konveyor.adapter.j jVar = bVar.f270221d;
            jVar.setHasStableIds(true);
            recyclerView.l(new com.avito.android.cyclic_gallery_widget.image_carousel.k(iJ2), -1);
            recyclerView.setLayoutManager((GridLayoutManager) bVar.f270220c.getValue());
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setScrollingTouchSlop(1);
            recyclerView.setHasFixedSize(true);
            recyclerView.setItemAnimator(null);
            recyclerView.setAdapter(jVar);
        }
        com.avito.android.serp.adapter.images_and_links_item.view.b bVar2 = this.f270216h;
        if (bVar2 != null) {
            bVar2.f270219b.c(new UV0.c(list));
            bVar2.f270221d.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.serp.adapter.images_and_links_item.l
    public final void setTitle(@Y61.k String str) {
        D6.f(this.f270210b, 0, y6.b(14), 0, 0, 13);
        TextView textView = this.f270214f;
        I5.a(textView, str, false);
        D6.H(textView);
    }
}

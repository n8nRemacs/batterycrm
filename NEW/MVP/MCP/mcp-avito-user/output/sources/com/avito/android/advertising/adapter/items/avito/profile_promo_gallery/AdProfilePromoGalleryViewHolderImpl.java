package com.avito.android.advertising.adapter.items.avito.profile_promo_gallery;

import SV.b;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ProfilePromoGalleryViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/profile_promo_gallery/AdProfilePromoGalleryViewHolderImpl;", "Lcom/avito/android/advertising/adapter/items/avito/profile_promo_gallery/a;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/advertising/kebab/e;", "Lcom/avito/android/advertising/kebab/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdProfilePromoGalleryViewHolderImpl extends com.avito.android.serp.c implements com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.a, com.avito.android.advertising.kebab.e, com.avito.android.advertising.kebab.a {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f87208t = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f87209b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<TV0.b<?, ?>> f87210c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final io.reactivex.rxjava3.subjects.b<G0> f87211d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<WV0.a> f87212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advertising.kebab.d f87213f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f87214g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f87215h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f87216i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f87217j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f87218k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public List<? extends TV0.a> f87219l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final com.avito.konveyor.item_visibility_tracker.d f87220m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.subjects.b<G0> f87221n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final U9.f f87222o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final c f87223p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Parcelable, G0> f87224q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f87225r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f87226s;

    /* compiled from: ProfilePromoGalleryViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Rect;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Rect> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ WeakReference<AdProfilePromoGalleryViewHolderImpl> f87228l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeakReference<AdProfilePromoGalleryViewHolderImpl> weakReference) {
            super(0);
            this.f87228l = weakReference;
        }

        @Override // Y41.a
        public final Rect invoke() {
            AdProfilePromoGalleryViewHolderImpl adProfilePromoGalleryViewHolderImpl = this.f87228l.get();
            if (adProfilePromoGalleryViewHolderImpl == null) {
                return null;
            }
            RecyclerView recyclerView = adProfilePromoGalleryViewHolderImpl.f87216i;
            int top = recyclerView.getTop();
            View view = adProfilePromoGalleryViewHolderImpl.f87209b;
            while (!(view instanceof RecyclerView)) {
                if (view == null) {
                    return null;
                }
                top += view.getTop();
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
                if (view == null) {
                    return null;
                }
            }
            int height = recyclerView.getHeight() + top;
            RecyclerView recyclerView2 = (RecyclerView) view;
            return new Rect(0, top < 0 ? -top : 0, 0, recyclerView2.getHeight() < height ? height - recyclerView2.getHeight() : 0);
        }
    }

    /* compiled from: ProfilePromoGalleryViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advertising/adapter/items/avito/profile_promo_gallery/AdProfilePromoGalleryViewHolderImpl$b", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public boolean f87229b;

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            Parcelable parcelableY0;
            Y41.l<? super Parcelable, G0> lVar;
            if (i12 == 1) {
                this.f87229b = true;
            }
            if (i12 == 0) {
                boolean z12 = this.f87229b;
                AdProfilePromoGalleryViewHolderImpl adProfilePromoGalleryViewHolderImpl = AdProfilePromoGalleryViewHolderImpl.this;
                if (z12) {
                    RecyclerView.m layoutManager = adProfilePromoGalleryViewHolderImpl.f87216i.getLayoutManager();
                    if (layoutManager != null && (parcelableY0 = layoutManager.Y0()) != null && (lVar = adProfilePromoGalleryViewHolderImpl.f87224q) != null) {
                        ((j) lVar).invoke(parcelableY0);
                    }
                } else {
                    int i13 = AdProfilePromoGalleryViewHolderImpl.f87208t;
                    adProfilePromoGalleryViewHolderImpl.getClass();
                }
                this.f87229b = false;
            }
        }
    }

    /* compiled from: ProfilePromoGalleryViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advertising/adapter/items/avito/profile_promo_gallery/AdProfilePromoGalleryViewHolderImpl$c", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public y f87231b;

        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            io.reactivex.rxjava3.disposables.d dVarT0;
            int i12 = AdProfilePromoGalleryViewHolderImpl.f87208t;
            AdProfilePromoGalleryViewHolderImpl adProfilePromoGalleryViewHolderImpl = AdProfilePromoGalleryViewHolderImpl.this;
            com.avito.konveyor.item_visibility_tracker.d dVar = adProfilePromoGalleryViewHolderImpl.f87220m;
            if (dVar != null) {
                dVar.c(new UV0.c(adProfilePromoGalleryViewHolderImpl.f87219l));
            }
            y yVar = this.f87231b;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            io.reactivex.rxjava3.subjects.b<G0> bVar = adProfilePromoGalleryViewHolderImpl.f87211d;
            if (bVar != null) {
                dVarT0 = bVar.v0(new com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.b(adProfilePromoGalleryViewHolderImpl), com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.c.f87234b, io.reactivex.rxjava3.internal.functions.a.f401993c);
            } else {
                adProfilePromoGalleryViewHolderImpl.f87209b.getViewTreeObserver().addOnScrollChangedListener(adProfilePromoGalleryViewHolderImpl.f87222o);
                io.reactivex.rxjava3.subjects.b<G0> bVarN0 = adProfilePromoGalleryViewHolderImpl.f87221n;
                if (bVarN0 == null) {
                    bVarN0 = io.reactivex.rxjava3.subjects.b.N0();
                    adProfilePromoGalleryViewHolderImpl.f87221n = bVarN0;
                }
                dVarT0 = bVarN0.n0(200L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new d(adProfilePromoGalleryViewHolderImpl));
            }
            this.f87231b = (y) dVarT0;
            com.avito.konveyor.item_visibility_tracker.d dVar2 = adProfilePromoGalleryViewHolderImpl.f87220m;
            if (dVar2 != null) {
                dVar2.a(adProfilePromoGalleryViewHolderImpl.f87216i, null);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            AdProfilePromoGalleryViewHolderImpl adProfilePromoGalleryViewHolderImpl = AdProfilePromoGalleryViewHolderImpl.this;
            adProfilePromoGalleryViewHolderImpl.f87209b.getViewTreeObserver().removeOnScrollChangedListener(adProfilePromoGalleryViewHolderImpl.f87222o);
            y yVar = this.f87231b;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            this.f87231b = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdProfilePromoGalleryViewHolderImpl(@Y61.k View view, @Y61.k List<? extends TV0.b<?, ?>> list, @Y61.l io.reactivex.rxjava3.subjects.b<G0> bVar, @Y61.l List<? extends WV0.a> list2) throws BlueprintCollisionException {
        super(view);
        this.f87209b = view;
        this.f87210c = list;
        this.f87211d = bVar;
        this.f87212e = list2;
        this.f87213f = new com.avito.android.advertising.kebab.d(view.getContext());
        this.f87215h = true;
        View viewFindViewById = view.findViewById(R.id.gallery);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f87216i = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f87217j = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title_placeholder);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f87218k = viewFindViewById3;
        this.f87219l = C42784z0.f406748b;
        b.a aVar = null;
        Object[] objArr = 0;
        com.avito.konveyor.item_visibility_tracker.d dVar = list2 != 0 ? new com.avito.konveyor.item_visibility_tracker.d(list2, false) : null;
        this.f87220m = dVar;
        this.f87222o = new U9.f(this, 2);
        this.f87223p = new c();
        final WeakReference weakReference = new WeakReference(this);
        if (dVar != null) {
            dVar.f338540d = new a(weakReference);
        }
        a.C10493a c10493a = new a.C10493a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f87214g = hVar;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVarA);
        jVar.setHasStableIds(true);
        RecyclerView recyclerView = this.f87216i;
        this.f87209b.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.AdProfilePromoGalleryViewHolderImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
            public final boolean I() {
                AdProfilePromoGalleryViewHolderImpl adProfilePromoGalleryViewHolderImpl = weakReference.get();
                if (adProfilePromoGalleryViewHolderImpl != null) {
                    return adProfilePromoGalleryViewHolderImpl.f87215h;
                }
                return false;
            }
        });
        this.f87216i.l(new e(), -1);
        new SV.b(this.f87216i.getPaddingLeft(), aVar, 2, objArr == true ? 1 : 0).b(this.f87216i);
        this.f87216i.setAdapter(jVar);
        this.f87216i.addOnAttachStateChangeListener(this.f87223p);
        this.f87216i.o(new b());
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.a
    public final void Gl(@Y61.k List<? extends TV0.a> list, @Y61.l Parcelable parcelable) {
        RecyclerView.m layoutManager;
        this.f87219l = list;
        com.avito.konveyor.item_visibility_tracker.d dVar = this.f87220m;
        if (dVar != null) {
            dVar.c(new UV0.c(list));
        }
        com.avito.konveyor.util.a.a(this.f87214g, list);
        RecyclerView recyclerView = this.f87216i;
        recyclerView.K0(recyclerView.getAdapter(), false);
        if (parcelable == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.X0(parcelable);
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.a
    public final com.avito.konveyor.item_visibility_tracker.b Me() {
        return this.f87220m;
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.a
    public final void bA(@Y61.l Y41.l<? super Integer, G0> lVar) {
        this.f87225r = lVar;
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.a
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f87226s = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f87226s;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f87226s = null;
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.a
    public final void kO(@Y61.l Y41.l<? super Parcelable, G0> lVar) {
        this.f87224q = lVar;
    }

    @Override // com.avito.android.advertising.kebab.e
    public final void sK(int i12) {
        RecyclerView.Adapter adapter = this.f87216i.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(i12);
        }
    }

    @Override // com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.a
    public final void setTitle(@Y61.k String str) {
        this.f87217j.setText(str);
    }

    @Override // com.avito.android.advertising.kebab.a
    public final void vm(@Y61.l AvitoNetworkBanner.MarkInfo markInfo, @Y61.k List list, @Y61.k com.avito.android.advertising.kebab.g gVar, @Y61.k BannerInfo bannerInfo) {
        this.f87213f.vm(markInfo, list, gVar, bannerInfo);
    }
}

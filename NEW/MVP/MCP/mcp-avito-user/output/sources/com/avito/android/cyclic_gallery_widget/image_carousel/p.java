package com.avito.android.cyclic_gallery_widget.image_carousel;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.cyclic_gallery_widget.image_carousel.l;
import com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.SellerInfoParams;
import com.avito.android.image_loader.From;
import com.avito.android.remote.model.ImageV2GalleryItemModel;
import com.avito.android.remote.model.Video;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import hw.InterfaceC41177b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageCarousel.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/p;", "", "a", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class p {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f132065v = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f132066a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f132067b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f132068c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f132069d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f132070e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f132071f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public Set<com.avito.android.cyclic_gallery_widget.image_carousel.a> f132072g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public List<? extends com.avito.android.image_loader.k> f132073h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public Object f132074i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public List<Video> f132075j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public List<com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b> f132076k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b f132077l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public SellerInfoParams.SellerInfoBlockPosition f132078m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final SV.a f132079n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super RecyclerView, G0> f132080o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public N f132081p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f132082q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f132083r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Boolean f132084s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final k f132085t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final k f132086u;

    /* compiled from: ImageCarousel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/p$a;", "", "<init>", "()V", "", "ZOOM_ONBOARDING_POSITION", "I", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public p(View view, com.avito.konveyor.adapter.a aVar, com.avito.konveyor.a aVar2, RecyclerView.t tVar, boolean z12, Integer num, Integer num2, boolean z13, int i12, C42822w c42822w) throws Resources.NotFoundException {
        RecyclerView.t tVar2 = (i12 & 8) != 0 ? null : tVar;
        boolean z14 = (i12 & 16) != 0 ? false : z12;
        Integer num3 = (i12 & 32) != 0 ? null : num;
        Integer num4 = (i12 & 64) != 0 ? null : num2;
        boolean z15 = (i12 & 128) != 0 ? false : z13;
        this.f132066a = view;
        this.f132067b = aVar;
        this.f132068c = num4;
        this.f132069d = z15;
        RecyclerView recyclerView = (RecyclerView) view;
        this.f132070e = recyclerView;
        this.f132072g = B0.f406639b;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f132073h = c42784z0;
        this.f132074i = c42784z0;
        this.f132075j = c42784z0;
        this.f132076k = c42784z0;
        this.f132078m = SellerInfoParams.SellerInfoBlockPosition.f132111d;
        D6.f(recyclerView, 0, 0, view.getResources().getDimensionPixelSize(R.dimen.rich_snippet_padding_right), 0, 11);
        C35976x4.a(recyclerView);
        recyclerView.s();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f132071f = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(jVar);
        int iIntValue = num3 != null ? num3.intValue() : z14 ? view.getResources().getDimensionPixelSize(R.dimen.advert_details_gallery_padding) : view.getResources().getDimensionPixelSize(R.dimen.serp_gallery_padding);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.serp_gallery_padding_redesign);
        D6.f(recyclerView, 0, 0, recyclerView.getPaddingRight() - iIntValue, 0, 11);
        recyclerView.setScrollingTouchSlop(1);
        recyclerView.setRecycledViewPool(tVar2);
        recyclerView.setHasFixedSize(true);
        if (recyclerView.getOnFlingListener() == null) {
            SV.a aVar3 = new SV.a(8388611, 0, 2, null);
            this.f132079n = aVar3;
            aVar3.b(recyclerView);
        }
        k kVar = new k(iIntValue);
        this.f132085t = kVar;
        this.f132086u = new k(dimensionPixelSize);
        recyclerView.l(kVar, -1);
        recyclerView.o(new o(this));
    }

    public final void a(@Y61.k RecyclerView.l lVar) {
        this.f132070e.l(lVar, -1);
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.util.List] */
    public void b(@Y61.k ArrayList arrayList) {
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3 = new ArrayList();
        int i12 = 1;
        if (this.f132073h.isEmpty() && this.f132074i.isEmpty() && this.f132075j.isEmpty() && this.f132076k.isEmpty()) {
            arrayList3.add(new q("empty_image_id", null, null, null, null, false, false, null, null, 508, null));
        } else {
            boolean zIsEmpty = ((Collection) this.f132074i).isEmpty();
            boolean z12 = this.f132069d;
            if (zIsEmpty) {
                List<? extends com.avito.android.image_loader.k> list = this.f132073h;
                arrayList2 = new ArrayList(C42745f0.q(list, 10));
                int i13 = 0;
                for (Object obj : list) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    com.avito.android.image_loader.k kVar = (com.avito.android.image_loader.k) obj;
                    arrayList2.add(new q(kVar.toString(), kVar, null, ((kVar instanceof com.avito.android.image_loader.m) && L.f(((com.avito.android.image_loader.m) kVar).f169557b, Boolean.FALSE)) ? From.f169443c : From.f169444d, null, this.f132083r, this.f132083r && z12 && (i13 == 1) && L.f(this.f132084s, Boolean.FALSE), Integer.valueOf(i13), null, 276, null));
                    i13 = i14;
                }
            } else {
                Iterable iterable = (Iterable) this.f132074i;
                arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
                int i15 = 0;
                for (Object obj2 : iterable) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    ImageV2GalleryItemModel imageV2GalleryItemModel = (ImageV2GalleryItemModel) obj2;
                    com.avito.android.image_loader.a aVarA = com.avito.android.image_loader.b.a(imageV2GalleryItemModel.getImage());
                    Boolean bool = Boolean.FALSE;
                    arrayList2.add(new q(aVarA.toString(), aVarA, null, L.f(aVarA.f169557b, bool) ? From.f169443c : From.f169444d, null, this.f132083r, this.f132083r && z12 && (i15 == 1) && L.f(this.f132084s, bool), Integer.valueOf(i15), imageV2GalleryItemModel.getConfig(), 20, null));
                    i15 = i16;
                }
            }
            Integer num = this.f132068c;
            int size = num == null ? arrayList2.size() : Math.min(arrayList2.size(), num.intValue());
            arrayList3.addAll(this.f132076k);
            arrayList3.addAll(arrayList2);
            List<Video> list2 = this.f132075j;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(list2, 10));
            for (Video video : list2) {
                arrayList4.add(new q(video.toString(), com.avito.android.image_loader.b.b(video.getPreviewImage()), video.getVideoUrl(), null, null, false, false, null, null, 504, null));
            }
            arrayList3.addAll(size, arrayList4);
        }
        int size2 = arrayList3.size();
        Set<com.avito.android.cyclic_gallery_widget.image_carousel.a> set = this.f132072g;
        ArrayList arrayList5 = new ArrayList(C42745f0.q(set, 10));
        for (com.avito.android.cyclic_gallery_widget.image_carousel.a aVar : set) {
            arrayList5.add(new b(aVar.toString(), aVar, null, 4, null));
        }
        arrayList3.addAll(arrayList5);
        com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b bVar = this.f132077l;
        if (bVar != null) {
            SellerInfoParams.SellerInfoBlockPosition sellerInfoBlockPosition = this.f132078m;
            if (sellerInfoBlockPosition == SellerInfoParams.SellerInfoBlockPosition.f132109b) {
                arrayList3.add(size2, bVar);
            } else if (sellerInfoBlockPosition == SellerInfoParams.SellerInfoBlockPosition.f132110c) {
                arrayList3.add(bVar);
            }
        }
        if (!this.f132082q) {
            arrayList.addAll(arrayList3);
            return;
        }
        ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        int i17 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                C42745f0.H0();
                throw null;
            }
            TV0.a bVar2 = (TV0.a) next;
            l lVar = arrayList3.size() == i12 ? l.e.f132039h : i17 == 0 ? l.b.f132036h : i17 == arrayList3.size() - i12 ? l.c.f132037h : l.d.f132038h;
            if (bVar2 instanceof q) {
                q qVar = (q) bVar2;
                it = it2;
                bVar2 = new q(qVar.f132087b, qVar.f132088c, qVar.f132089d, qVar.f132090e, lVar, qVar.f132092g, qVar.f132093h, qVar.f132094i, qVar.f132095j);
            } else if (bVar2 instanceof com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b) {
                com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b bVar3 = (com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b) bVar2;
                it = it2;
                bVar2 = new com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b(bVar3.f132047b, bVar3.f132048c, bVar3.f132049d, lVar, bVar3.f132051f);
            } else if (bVar2 instanceof b) {
                b bVar4 = (b) bVar2;
                it = it2;
                bVar2 = new b(bVar4.f131998b, bVar4.f131999c, lVar);
            } else if (bVar2 instanceof com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b) {
                com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b bVar5 = (com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b) bVar2;
                it = it2;
                bVar2 = new com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b(bVar5.f132117b, bVar5.f132118c, bVar5.f132119d, bVar5.f132120e, bVar5.f132121f, bVar5.f132122g, bVar5.f132123h, bVar5.f132124i, bVar5.f132125j, bVar5.f132126k, lVar, bVar5.f132128m);
            } else {
                it = it2;
            }
            arrayList6.add(bVar2);
            i17 = i18;
            it2 = it;
            i12 = 1;
        }
        arrayList.addAll(arrayList6);
    }

    @Y61.k
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_scroll_state", this.f132071f.Y0());
        return bundle;
    }

    public final void d(@Y61.k RecyclerView.l lVar) {
        this.f132070e.r0(lVar);
    }

    public final void e() {
        if (this.f132070e.getScrollState() != 0) {
            return;
        }
        this.f132071f.l1(0);
    }

    public final void f(@Y61.k Parcelable parcelable) {
        if (this.f132070e.getScrollState() == 0 && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(getClass().getClassLoader());
            this.f132071f.X0(bundle.getParcelable("key_scroll_state"));
        }
    }

    public final void g(@Y61.k List<? extends com.avito.android.image_loader.k> list, boolean z12) {
        if (!L.f(this.f132073h, list) || this.f132067b.isEmpty()) {
            this.f132073h = list;
            this.f132083r = z12;
            h();
        }
    }

    public final void h() {
        ArrayList arrayList = new ArrayList();
        b(arrayList);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(Long.valueOf(((TV0.a) next).getF189215e()))) {
                arrayList2.add(next);
            }
        }
        this.f132067b.c(new UV0.c(arrayList2));
        RecyclerView recyclerView = this.f132070e;
        k kVar = this.f132085t;
        recyclerView.r0(kVar);
        k kVar2 = this.f132086u;
        recyclerView.r0(kVar2);
        if (this.f132082q) {
            recyclerView.l(kVar2, -1);
        } else {
            recyclerView.l(kVar, -1);
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}

package com.avito.android.adapter.gallery;

import Y41.p;
import com.avito.android.W1;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.tns_gallery.t;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: GalleryItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adapter/gallery/i;", "Lcom/avito/android/adapter/gallery/c;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final W1 f68455b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p<GalleryItem, Integer, G0> f68456c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f68457d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Pv0.b f68458e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f68459f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C43238h f68460g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public GalleryItem f68461h;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k W1 w12, @Y61.k p<? super GalleryItem, ? super Integer, G0> pVar, @O3.b @Y61.k Y41.a<G0> aVar, @Y61.k Pv0.b bVar, @Y61.k R0 r02) {
        this.f68455b = w12;
        this.f68456c = pVar;
        this.f68457d = aVar;
        this.f68458e = bVar;
        this.f68460g = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        GalleryItem galleryItem = (GalleryItem) aVar;
        GalleryItem galleryItem2 = this.f68458e.read();
        if (galleryItem2 != null) {
            GalleryItem.GalleyReview galleyReview = (GalleryItem.GalleyReview) C42745f0.G(galleryItem2.f68403e);
            Long l12 = galleyReview != null ? galleyReview.f68427b : null;
            GalleryItem.GalleyReview galleyReview2 = (GalleryItem.GalleyReview) C42745f0.G(galleryItem.f68403e);
            if (!L.f(l12, galleyReview2 != null ? galleyReview2.f68427b : null)) {
                galleryItem2 = null;
            }
            if (galleryItem2 != null) {
                galleryItem = galleryItem2;
            }
        }
        this.f68461h = galleryItem;
        t f68468c = kVar.getF68468c();
        if (galleryItem.f68403e.isEmpty()) {
            f68468c.c();
            return;
        }
        List<GalleryItem.GalleryImage> list = galleryItem.f68405g;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((GalleryItem.GalleryImage) it.next()).f68425b);
        }
        f68468c.b(arrayList, new d(this), new e(galleryItem));
        f68468c.a(galleryItem.f68408j);
        kVar.yn(galleryItem.f68406h);
        kVar.k3(galleryItem.f68407i);
        kVar.SS(new f(this, kVar));
        this.f68457d.invoke();
    }
}

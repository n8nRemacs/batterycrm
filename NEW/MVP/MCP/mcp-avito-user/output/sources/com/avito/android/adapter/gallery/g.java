package com.avito.android.adapter.gallery;

import Y41.p;
import android.net.Uri;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.tns_gallery.t;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: GalleryItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.adapter.gallery.GalleryItemPresenterImpl$loadMoreItems$1", f = "GalleryItemPresenter.kt", i = {0}, l = {64}, m = "invokeSuspend", n = {"item"}, s = {"L$2"})
/* loaded from: classes10.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public i f68448q;

    /* renamed from: r, reason: collision with root package name */
    public k f68449r;

    /* renamed from: s, reason: collision with root package name */
    public GalleryItem f68450s;

    /* renamed from: t, reason: collision with root package name */
    public int f68451t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f68452u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f68453v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, k kVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f68452u = iVar;
        this.f68453v = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f68452u, this.f68453v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Uri uri;
        Object objA;
        GalleryItem galleryItem;
        i iVar;
        k kVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f68451t;
        if (i12 == 0) {
            C42729a0.b(obj);
            i iVar2 = this.f68452u;
            iVar2.f68459f = true;
            GalleryItem galleryItem2 = iVar2.f68461h;
            if (galleryItem2 != null && (uri = galleryItem2.f68409k) != null) {
                this.f68448q = iVar2;
                k kVar2 = this.f68453v;
                this.f68449r = kVar2;
                this.f68450s = galleryItem2;
                this.f68451t = 1;
                objA = iVar2.f68455b.a(uri, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                galleryItem = galleryItem2;
                iVar = iVar2;
                kVar = kVar2;
            }
            return G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        galleryItem = this.f68450s;
        kVar = this.f68449r;
        i iVar3 = this.f68448q;
        C42729a0.b(obj);
        iVar = iVar3;
        objA = obj;
        m mVar = (m) objA;
        if (mVar != null) {
            t f68468c = kVar.getF68468c();
            List<GalleryItem.GalleryImage> list = galleryItem.f68405g;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((GalleryItem.GalleryImage) it.next()).f68425b);
            }
            ?? r52 = mVar.f68472b;
            Iterable iterable = (Iterable) r52;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((GalleryItem.GalleryImage) it2.next()).f68425b);
            }
            List<GalleryItem.GalleryImage> list2 = galleryItem.f68405g;
            int size = list2.size();
            com.avito.konveyor.adapter.a aVar = f68468c.f301563c;
            if (aVar == null) {
                aVar = null;
            }
            ArrayList arrayListB = O2.b(arrayList, arrayList2);
            int size2 = arrayListB.size();
            ArrayList arrayList3 = new ArrayList(size2);
            int i13 = 0;
            while (i13 < size2) {
                arrayList3.add(new com.avito.android.tns_gallery.a(i13, arrayListB));
                i13++;
                galleryItem = galleryItem;
            }
            GalleryItem galleryItem3 = galleryItem;
            aVar.c(new UV0.c(arrayList3));
            com.avito.konveyor.adapter.j jVar = f68468c.f301562b;
            (jVar != null ? jVar : null).notifyItemRangeInserted(size, arrayList2.size());
            iVar.f68461h = GalleryItem.a(galleryItem3, O2.b(galleryItem3.f68403e, mVar.f68471a), O2.b(list2, r52), mVar.f68473c);
        }
        return G0.f406611a;
    }
}

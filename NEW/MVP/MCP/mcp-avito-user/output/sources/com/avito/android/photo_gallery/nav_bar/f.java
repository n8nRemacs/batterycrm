package com.avito.android.photo_gallery.nav_bar;

import Y41.p;
import com.avito.android.R;
import com.avito.android.favorite.AbstractC30569c;
import com.avito.android.util.L5;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PhotoGalleryNavBarDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorite/c;", "event", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/favorite/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBarDelegate$init$6", f = "PhotoGalleryNavBarDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class f extends SuspendLambda implements p<AbstractC30569c, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f217558q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f217559r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.view.d f217560s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, androidx.appcompat.view.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f217559r = aVar;
        this.f217560s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f217559r, this.f217560s, continuation);
        fVar.f217558q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(AbstractC30569c abstractC30569c, Continuation<? super G0> continuation) {
        return ((f) create(abstractC30569c, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        AbstractC30569c abstractC30569c = (AbstractC30569c) this.f217558q;
        a aVar = this.f217559r;
        aVar.f217539r = PhotoGalleryNavBarState.a(aVar.f217539r, null, null, abstractC30569c instanceof AbstractC30569c.a, false, null, null, 0L, 123);
        a.a(aVar);
        aVar.d();
        if (!aVar.f217523b.b()) {
            boolean z12 = aVar.f217539r.f217514d;
            androidx.appcompat.view.d dVar = this.f217560s;
            if (z12) {
                L5.b(dVar, dVar.getString(R.string.photo_gallery_advert_added_to_fav), 0);
            } else {
                L5.b(dVar, dVar.getString(R.string.photo_gallery_advert_removed_from_fav), 0);
            }
        }
        return G0.f406611a;
    }
}

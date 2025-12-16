package com.avito.android.photo_gallery.nav_bar;

import Y41.p;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.reactive.A;

/* compiled from: PhotoGalleryNavBarDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBarDelegate$onRightButtonClick$1", f = "PhotoGalleryNavBarDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class h extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a f217562q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f217563r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, String str, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f217562q = aVar;
        this.f217563r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f217562q, this.f217563r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        PhotoGalleryNavBarFeatures photoGalleryNavBarFeatures;
        PhotoGalleryNavBarFavoriteFeature photoGalleryNavBarFavoriteFeature;
        PhotoGalleryNavBarFeatures photoGalleryNavBarFeatures2;
        PhotoGalleryNavBarFavoriteFeature photoGalleryNavBarFavoriteFeature2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        a aVar = this.f217562q;
        com.avito.android.favorite.h hVar = aVar.f217530i;
        AbstractC30567a.j jVar = new AbstractC30567a.j(aVar.f217539r.f217517g);
        PhotoGalleryNavBarState photoGalleryNavBarState = aVar.f217539r;
        boolean z12 = photoGalleryNavBarState.f217514d;
        PhotoGalleryNavBar photoGalleryNavBar = photoGalleryNavBarState.f217516f;
        AdvertisementVerticalAlias advertisementVerticalAlias = (photoGalleryNavBar == null || (photoGalleryNavBarFeatures2 = photoGalleryNavBar.f217474d) == null || (photoGalleryNavBarFavoriteFeature2 = photoGalleryNavBarFeatures2.f217496b) == null) ? null : photoGalleryNavBarFavoriteFeature2.f217494c;
        Double d12 = (photoGalleryNavBar == null || (photoGalleryNavBarFeatures = photoGalleryNavBar.f217474d) == null || (photoGalleryNavBarFavoriteFeature = photoGalleryNavBarFeatures.f217496b) == null) ? null : photoGalleryNavBarFavoriteFeature.f217495d;
        ScreenIdField screenIdField = ScreenIdField.f90251c;
        C43175k.K(C43175k.I(aVar.f217529h.a(), A.a(hVar.g(this.f217563r, jVar, z12, advertisementVerticalAlias, d12, (2016 & 32) != 0 ? null : "item_gallery", (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : null, (2016 & 1024) != 0).D())), aVar.f217534m);
        aVar.f217524c.b(this.f217563r, aVar.f217539r.f217514d);
        return G0.f406611a;
    }
}

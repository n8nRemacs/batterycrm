package com.avito.android;

import Mg0.InterfaceC14487a;
import android.net.Uri;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryEntry;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryReview;
import com.avito.android.util.C35936s;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RatingDetailsGalleryInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/adapter/gallery/m;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/adapter/gallery/m;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.RatingDetailsGalleryInteractorImpl$loadGalleryReviews$2", f = "RatingDetailsGalleryInteractor.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class X1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super com.avito.android.adapter.gallery.m>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f67585q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y1 f67586r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Uri f67587s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1(Y1 y12, Uri uri, Continuation<? super X1> continuation) {
        super(2, continuation);
        this.f67586r = y12;
        this.f67587s = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new X1(this.f67586r, this.f67587s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super com.avito.android.adapter.gallery.m> continuation) {
        return ((X1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ?? arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f67585q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC14487a interfaceC14487a = this.f67586r.f67588a;
            String string = this.f67587s.toString();
            this.f67585q = 1;
            obj = interfaceC14487a.h(string, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            C35936s.a(error.getError(), error.getCause());
            return null;
        }
        PhotoGalleryEntry photoGalleryEntry = (PhotoGalleryEntry) ((TypedResult.Success) typedResult).getResult();
        List<PhotoGalleryReview> reviews = photoGalleryEntry.getReviews();
        if (reviews != null) {
            List<PhotoGalleryReview> list = reviews;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C27637a2.b((PhotoGalleryReview) it.next()));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        return new com.avito.android.adapter.gallery.m(arrayList, C27637a2.c(photoGalleryEntry), photoGalleryEntry.getNextPage());
    }
}

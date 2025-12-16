package com.avito.android.publish.slots.images_groups_recommendations;

import Y41.q;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.photo_list_view.G;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ImagesGroupsRecommendationsSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lcom/avito/android/photo_list_view/G;", "", "ex", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.images_groups_recommendations.ImagesGroupsRecommendationsSlotWrapper$subscribeToPhotos$2", f = "ImagesGroupsRecommendationsSlotWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class k extends SuspendLambda implements q<InterfaceC43172j<? super List<? extends G>>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f244247q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f244248r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, Continuation<? super k> continuation) {
        super(3, continuation);
        this.f244248r = iVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super List<? extends G>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        k kVar = new k(this.f244248r, continuation);
        kVar.f244247q = th2;
        return kVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f244248r.f244173c.c(new NonFatalErrorEvent("ImagesGroupsRecommendationsSlotWrapper.subscribeToPhotos_error", this.f244247q, null, null, 12, null));
        return G0.f406611a;
    }
}

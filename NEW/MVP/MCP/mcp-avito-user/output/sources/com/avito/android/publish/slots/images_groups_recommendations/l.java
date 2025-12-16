package com.avito.android.publish.slots.images_groups_recommendations;

import Y41.q;
import com.avito.android.Q1;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.photo_list_view.G;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ImagesGroupsRecommendationsSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lcom/avito/android/photo_list_view/G;", "", "ex", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.images_groups_recommendations.ImagesGroupsRecommendationsSlotWrapper$subscribeToPhotos$3", f = "ImagesGroupsRecommendationsSlotWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class l extends SuspendLambda implements q<InterfaceC43172j<? super List<? extends G>>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f244249q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f244250r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, Continuation<? super l> continuation) {
        super(3, continuation);
        this.f244250r = iVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super List<? extends G>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        l lVar = new l(this.f244250r, continuation);
        lVar.f244249q = th2;
        return lVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Throwable th2 = this.f244249q;
        i iVar = this.f244250r;
        Q1 q12 = iVar.f244176f;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[6];
        if (((Boolean) q12.f67488h.a().invoke()).booleanValue() && !(th2 instanceof CancellationException)) {
            int i12 = iVar.f244185o;
            if (i12 < 20) {
                iVar.f244185o = i12 + 1;
                iVar.l();
            } else {
                iVar.f244173c.c(new NonFatalErrorEvent("ImagesGroupsRecommendationsSlotWrapper.resubscribeToPhotos_limitReached", null, null, null, 14, null));
            }
        }
        return G0.f406611a;
    }
}

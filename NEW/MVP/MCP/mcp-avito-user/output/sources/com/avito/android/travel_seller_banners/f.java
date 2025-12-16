package com.avito.android.travel_seller_banners;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yF0.InterfaceC50107a;

/* compiled from: TravelSellerBannersInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LyF0/a;", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_seller_banners.TravelSellerBannersInteractorImpl$getBannerForPageAsFlow$3", f = "TravelSellerBannersInteractorImpl.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class f extends SuspendLambda implements q<InterfaceC43172j<? super InterfaceC50107a>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f303299q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f303300r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f303301s;

    public f() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super InterfaceC50107a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        f fVar = new f(3, continuation);
        fVar.f303300r = interfaceC43172j;
        fVar.f303301s = th2;
        return fVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f303299q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f303300r;
            Throwable th2 = this.f303301s;
            V2.f318762a.f(th2);
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            InterfaceC50107a.C12895a c12895a = new InterfaceC50107a.C12895a(new ApiError.UnknownError(message, null, null, 6, null));
            this.f303300r = null;
            this.f303299q = 1;
            if (interfaceC43172j.emit(c12895a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

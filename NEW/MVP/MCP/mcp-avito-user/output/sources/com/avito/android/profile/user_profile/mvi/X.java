package com.avito.android.profile.user_profile.mvi;

import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.util.ApiException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserProfileActor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "", "cause", "", "attempt", "", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$updatePhones$2", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class X extends SuspendLambda implements Y41.r<InterfaceC43172j<? super UserProfileInternalAction>, Throwable, Long, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f226273q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ long f226274r;

    public X() {
        throw null;
    }

    @Override // Y41.r
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Throwable th2, Long l12, Continuation<? super Boolean> continuation) {
        long jLongValue = l12.longValue();
        X x12 = new X(4, continuation);
        x12.f226273q = th2;
        x12.f226274r = jLongValue;
        return x12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return Boxing.boxBoolean((this.f226273q instanceof ApiException) && this.f226274r <= 5);
    }
}

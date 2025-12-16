package com.avito.android.profile.user_profile.mvi;

import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.remote.model.Session;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$sessionChangedFlow$$inlined$flatMapLatest$1", f = "UserProfileActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class P extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserProfileInternalAction>, Session, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226255q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f226256r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f226257s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33388a f226258t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C33388a c33388a, Continuation continuation) {
        super(3, continuation);
        this.f226258t = c33388a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Session session, Continuation<? super G0> continuation) {
        P p12 = new P(this.f226258t, continuation);
        p12.f226256r = interfaceC43172j;
        p12.f226257s = session;
        return p12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226255q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f226256r;
            InterfaceC43160i interfaceC43160iD = C33388a.d(this.f226258t, 3);
            this.f226255q = 1;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
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

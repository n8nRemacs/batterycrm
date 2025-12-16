package com.avito.android.verification.verification_passport.mvi;

import Y41.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.verification.verification_passport.mvi.entity.PassportInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.cyberity.cbr.core.data.model.CBRSDKState;

/* compiled from: PassportActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_passport.mvi.PassportActor$onSDKError$1", f = "PassportActor.kt", i = {}, l = {63, 66}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super PassportInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f325711q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f325712r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f325713s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CBRSDKState f325714t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Throwable f325715u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, CBRSDKState cBRSDKState, Throwable th2, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f325713s = fVar;
        this.f325714t = cBRSDKState;
        this.f325715u = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f325713s, this.f325714t, this.f325715u, continuation);
        aVar.f325712r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PassportInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f325711q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f325712r;
            InterfaceC28373a interfaceC28373a = this.f325713s.f325728a;
            StringBuilder sb2 = new StringBuilder("state: ");
            CBRSDKState cBRSDKState = this.f325714t;
            sb2.append(cBRSDKState);
            sb2.append(" | message: ");
            sb2.append(this.f325715u);
            interfaceC28373a.c(new com.avito.android.verification.verification_passport.a(sb2.toString()));
            if (cBRSDKState instanceof CBRSDKState.Initial ? true : cBRSDKState instanceof CBRSDKState.Incomplete) {
                PassportInternalAction.SetErrorAndFinish setErrorAndFinish = new PassportInternalAction.SetErrorAndFinish(false);
                this.f325711q = 1;
                if (interfaceC43172j.emit(setErrorAndFinish, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                PassportInternalAction.SetErrorAndFinish setErrorAndFinish2 = new PassportInternalAction.SetErrorAndFinish(true);
                this.f325711q = 2;
                if (interfaceC43172j.emit(setErrorAndFinish2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

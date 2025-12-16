package com.avito.android.passport.profile_add.merge.code_confirm.mvi;

import Y41.p;
import b60.InterfaceC25416a;
import com.avito.android.passport.profile_add.merge.code_confirm.mvi.entity.CodeConfirmInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CodeConfirmActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_confirm.mvi.CodeConfirmActor$onCodeInput$1", f = "CodeConfirmActor.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super CodeConfirmInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f212739q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f212740r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b60.c f212741s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25416a.C1991a f212742t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f212743u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b60.c cVar, InterfaceC25416a.C1991a c1991a, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f212741s = cVar;
        this.f212742t = c1991a;
        this.f212743u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f212741s, this.f212742t, this.f212743u, continuation);
        aVar.f212740r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CodeConfirmInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f212739q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f212740r;
            if (this.f212741s.f56916c != null) {
                CodeConfirmInternalAction.ClearValidationError clearValidationError = CodeConfirmInternalAction.ClearValidationError.f212748b;
                this.f212740r = interfaceC43172j;
                this.f212739q = 1;
                if (interfaceC43172j.emit(clearValidationError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f212740r;
            C42729a0.b(obj);
        }
        InterfaceC25416a.C1991a c1991a = this.f212742t;
        if (c1991a.f56908b.length() == 5) {
            InterfaceC43160i<CodeConfirmInternalAction> interfaceC43160iC = this.f212743u.f212744a.c(c1991a.f56907a, c1991a.f56908b);
            this.f212740r = null;
            this.f212739q = 2;
            if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}

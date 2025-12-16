package com.avito.android.ab_tests;

import Uj0.InterfaceC15529a;
import Vj0.C15687a;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AbTestsReloadTask.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "", "", "LVj0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ab_tests.AbTestsReloadTask$loadWithContracts$1", f = "AbTestsReloadTask.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.ab_tests.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27651n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<Map<String, ? extends C15687a>>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f68003q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f68004r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C27653p f68005s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27651n(C27653p c27653p, Continuation<? super C27651n> continuation) {
        super(2, continuation);
        this.f68005s = c27653p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C27651n c27651n = new C27651n(this.f68005s, continuation);
        c27651n.f68004r = obj;
        return c27651n;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<Map<String, ? extends C15687a>>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C27651n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f68003q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f68004r;
            InterfaceC15529a interfaceC15529a = this.f68005s.f68006a;
            this.f68004r = interfaceC43172j;
            this.f68003q = 1;
            obj = interfaceC15529a.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f68004r;
            C42729a0.b(obj);
        }
        this.f68004r = null;
        this.f68003q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

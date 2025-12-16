package com.avito.android.auto_select.booking.data;

import Y41.p;
import Y61.k;
import Y61.l;
import Ye.InterfaceC18256a;
import Ze.C19546a;
import cf.InterfaceC27185b;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutoSelectRepository.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcf/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.auto_select.booking.data.AutoSelectRepositoryImpl$cancelBooking$1", f = "AutoSelectRepository.kt", i = {0}, l = {22, 23}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC27185b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f95812q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f95813r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f95814s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f95815t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, String str, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f95814s = eVar;
        this.f95815t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f95814s, this.f95815t, continuation);
        bVar.f95813r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC27185b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC43172j interfaceC43172j;
        InterfaceC27185b dVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f95812q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f95813r;
            InterfaceC18256a interfaceC18256a = this.f95814s.f95821a.get();
            this.f95813r = interfaceC43172j;
            this.f95812q = 1;
            obj = interfaceC18256a.a(this.f95815t, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f95813r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            dVar = new InterfaceC27185b.a(((C19546a) ((TypedResult.Success) typedResult).getResult()).a());
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = new InterfaceC27185b.d(((TypedResult.Error) typedResult).getError(), null, null, 6, null);
        }
        this.f95813r = null;
        this.f95812q = 2;
        if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

package com.avito.android.sbc.create.mvi;

import com.avito.android.arch.mvi.utils.c;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.sbc.create.mvi.C34469a;
import com.avito.android.util.C35936s;
import ep0.C40143a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CreateDiscountDispatchActor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lep0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$getForecastForAutoDispatchFlow$1", f = "CreateDiscountDispatchActor.kt", i = {0}, l = {3201, 3207}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.sbc.create.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34479f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super C40143a>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259792q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f259793r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34469a f259794s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34469a.b f259795t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34479f(C34469a c34469a, C34469a.b bVar, Continuation<? super C34479f> continuation) {
        super(2, continuation);
        this.f259794s = c34469a;
        this.f259795t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34479f c34479f = new C34479f(this.f259794s, this.f259795t, continuation);
        c34479f.f259793r = obj;
        return c34479f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super C40143a> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C34479f) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259792q;
        try {
        } catch (Throwable th2) {
            kotlinx.coroutines.Q0.e(getF411447c());
            new c.b(th2);
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f259793r;
            C34469a c34469a = this.f259794s;
            C34469a.b bVar = this.f259795t;
            com.avito.android.sbc.create.c cVar = c34469a.f259542c;
            long j12 = Long.parseLong(c34469a.f259554o);
            long j13 = bVar.f259562c;
            Long l12 = bVar.f259561b;
            Long lBoxLong = Boxing.boxLong(bVar.f259560a);
            this.f259793r = interfaceC43172j;
            this.f259792q = 1;
            obj = cVar.d(j13, l12, lBoxLong, j12, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                new c.C2712c(kotlin.G0.f406611a);
                return kotlin.G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f259793r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            C40143a c40143a = (C40143a) ((TypedResult.Success) typedResult).getResult();
            this.f259793r = null;
            this.f259792q = 2;
            if (interfaceC43172j.emit(c40143a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            C35936s.a(((TypedResult.Error) typedResult).getError(), ((TypedResult.Error) typedResult).getCause());
        }
        new c.C2712c(kotlin.G0.f406611a);
        return kotlin.G0.f406611a;
    }
}

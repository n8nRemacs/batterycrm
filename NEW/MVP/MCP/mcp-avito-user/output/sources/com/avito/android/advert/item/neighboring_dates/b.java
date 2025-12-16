package com.avito.android.advert.item.neighboring_dates;

import Y41.p;
import Y61.k;
import Y61.l;
import ba.C25604a;
import com.avito.android.advert.item.neighboring_dates.a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: NeighboringDatesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert/item/neighboring_dates/a$a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.neighboring_dates.NeighboringDatesInteractor$load$1", f = "NeighboringDatesInteractor.kt", i = {0}, l = {31, 33, 34}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super a.InterfaceC2298a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f77749q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f77750r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f77751s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f77752t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f77753u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, long j12, String str, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f77751s = aVar;
        this.f77752t = j12;
        this.f77753u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f77751s, this.f77752t, this.f77753u, continuation);
        bVar.f77750r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super a.InterfaceC2298a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f77749q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f77750r;
            Z9.a aVar = this.f77751s.f77745a.get();
            this.f77750r = interfaceC43172j;
            this.f77749q = 1;
            obj = aVar.b(this.f77752t, this.f77753u, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f77750r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            a.InterfaceC2298a.b bVar = new a.InterfaceC2298a.b((C25604a) ((TypedResult.Success) typedResult).getResult());
            this.f77750r = null;
            this.f77749q = 2;
            if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            C35936s.a(error.getError(), error.getCause());
            a.InterfaceC2298a.C2299a c2299a = a.InterfaceC2298a.C2299a.f77746a;
            this.f77750r = null;
            this.f77749q = 3;
            if (interfaceC43172j.emit(c2299a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}

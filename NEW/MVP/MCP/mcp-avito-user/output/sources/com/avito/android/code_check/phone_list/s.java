package com.avito.android.code_check.phone_list;

import Qo.C14915b;
import Qo.InterfaceC14914a;
import Ro.InterfaceC15066a;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.code_check.phone_list.mvi.entity.PhoneListInternalAction;
import com.avito.android.code_check.phone_request.mvi.entity.PhoneRequestInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: PhoneListViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_check/phone_list/s;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "", "Lcom/avito/android/code_check/phone_list/u;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class s extends M0 implements com.avito.android.arch.mvi.android.k<Object, u, Object> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final R0 f119017E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.c<InterfaceC15066a, PhoneRequestInternalAction, Ro.c, Ro.b> f119018J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.c<InterfaceC14914a, PhoneListInternalAction, C14915b, G0> f119019K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final n2<u> f119020L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<Object> f119021M;

    /* compiled from: PhoneListViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.code_check.phone_list.PhoneListViewModel$accept$1", f = "PhoneListViewModel.kt", i = {}, l = {45, 46}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f119022q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f119023r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ s f119024s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, s sVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f119023r = obj;
            this.f119024s = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f119023r, this.f119024s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f119022q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Object obj2 = this.f119023r;
                boolean z12 = obj2 instanceof InterfaceC15066a;
                s sVar = this.f119024s;
                if (z12) {
                    com.avito.android.arch.mvi.c<InterfaceC15066a, PhoneRequestInternalAction, Ro.c, Ro.b> cVar = sVar.f119018J;
                    this.f119022q = 1;
                    if (cVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (obj2 instanceof InterfaceC14914a) {
                    com.avito.android.arch.mvi.c<InterfaceC14914a, PhoneListInternalAction, C14915b, G0> cVar2 = sVar.f119019K;
                    this.f119022q = 2;
                    if (cVar2.ya(obj2, this) == coroutine_suspended) {
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

    /* compiled from: PhoneListViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements Y41.q<Ro.c, C14915b, Continuation<? super u>, Object>, SuspendFunction {
        @Override // Y41.q
        public final Object invoke(Ro.c cVar, C14915b c14915b, Continuation<? super u> continuation) {
            ((v) this.receiver).getClass();
            return new u(c14915b.f14011b, cVar.f14631b);
        }
    }

    @Inject
    public s(@Y61.k com.avito.android.code_check.phone_list.mvi.d dVar, @Y61.k com.avito.android.code_check.phone_request.mvi.k kVar, @Y61.k v vVar, @Y61.k R0 r02) {
        this.f119017E = r02;
        com.avito.android.arch.mvi.c<InterfaceC15066a, PhoneRequestInternalAction, Ro.c, Ro.b> cVarB = com.avito.android.arch.mvi.q.b(kVar, null, null, 3);
        this.f119018J = cVarB;
        com.avito.android.arch.mvi.c<InterfaceC14914a, PhoneListInternalAction, C14915b, G0> cVarB2 = com.avito.android.arch.mvi.q.b(dVar, null, null, 3);
        this.f119019K = cVarB2;
        C1 c12 = new C1(cVarB, cVarB2, new b(3, vVar, v.class, "mapToViewState", "mapToViewState(Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestState;Lcom/avito/android/code_check/phone_list/mvi/entity/PhoneListState;)Lcom/avito/android/code_check/phone_list/PhoneListViewState;", 4));
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411433c;
        Ro.c cVar = cVarB.f91929r.get();
        C14915b c14915b = cVarB2.f91929r.get();
        vVar.getClass();
        this.f119020L = C43175k.U(c12, aVarA, i2Var, new u(c14915b.f14011b, cVar.f14631b));
        this.f119021M = cVarB.f91928q;
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(@Y61.k Object obj) {
        C43259k.d(N0.a(this), this.f119017E.b(), null, new a(obj, this, null), 2);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<Object> getEvents() {
        return this.f119021M;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<u> getState() {
        return this.f119020L;
    }
}

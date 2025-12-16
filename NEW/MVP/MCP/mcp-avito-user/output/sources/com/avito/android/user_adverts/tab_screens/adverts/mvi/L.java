package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import eJ0.C40014a;
import eJ0.C40016c;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsListActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LeJ0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$userAdvertSource$1", f = "UserAdvertsListActor.kt", i = {}, l = {772, 772}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class L extends SuspendLambda implements Y41.p<InterfaceC43172j<? super C40016c>, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f315224A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C35670a f315225B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f315226C;

    /* renamed from: q, reason: collision with root package name */
    public int f315227q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f315228r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f315229s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f315230t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f315231u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f315232v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f315233w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f315234x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f315235y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f315236z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(String str, boolean z12, Map<String, ? extends Object> map, String str2, int i12, String str3, String str4, boolean z13, int i13, C35670a c35670a, Map<String, ? extends Object> map2, Continuation<? super L> continuation) {
        super(2, continuation);
        this.f315229s = str;
        this.f315230t = z12;
        this.f315231u = map;
        this.f315232v = str2;
        this.f315233w = i12;
        this.f315234x = str3;
        this.f315235y = str4;
        this.f315236z = z13;
        this.f315224A = i13;
        this.f315225B = c35670a;
        this.f315226C = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        L l12 = new L(this.f315229s, this.f315230t, this.f315231u, this.f315232v, this.f315233w, this.f315234x, this.f315235y, this.f315236z, this.f315224A, this.f315225B, this.f315226C, continuation);
        l12.f315228r = obj;
        return l12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super C40016c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((L) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315227q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f315228r;
            String str = this.f315229s;
            String str2 = !C43066x.K(str) ? str : null;
            Boolean boolBoxBoolean = Boxing.boxBoolean(this.f315230t);
            boolBoxBoolean.getClass();
            Boolean bool = !C43066x.K(str) ? boolBoxBoolean : null;
            Map<String, Object> map = this.f315231u;
            C40014a c40014a = new C40014a(this.f315232v, str2, this.f315233w, bool, this.f315234x, this.f315235y, (map.isEmpty() || map.equals(this.f315226C)) ? null : map, this.f315236z, this.f315224A);
            com.avito.android.user_adverts.tab_screens.adverts.domain.a aVar = this.f315225B.f315272a;
            this.f315228r = interfaceC43172j;
            this.f315227q = 1;
            objA = aVar.a(c40014a, this);
            if (objA == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f315228r;
            C42729a0.b(obj);
            objA = obj;
        }
        this.f315228r = null;
        this.f315227q = 2;
        if (interfaceC43172j.emit(objA, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

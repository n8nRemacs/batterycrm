package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.user_adverts.tab_screens.UserAdvertsListParams;
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
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$userAdvertSource$2", f = "UserAdvertsListActor.kt", i = {}, l = {799, 799}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class M extends SuspendLambda implements Y41.p<InterfaceC43172j<? super C40016c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315237q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f315238r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListParams f315239s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f315240t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f315241u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f315242v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C35670a f315243w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(UserAdvertsListParams userAdvertsListParams, String str, String str2, int i12, C35670a c35670a, Continuation<? super M> continuation) {
        super(2, continuation);
        this.f315239s = userAdvertsListParams;
        this.f315240t = str;
        this.f315241u = str2;
        this.f315242v = i12;
        this.f315243w = c35670a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        M m12 = new M(this.f315239s, this.f315240t, this.f315241u, this.f315242v, this.f315243w, continuation);
        m12.f315238r = obj;
        return m12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super C40016c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((M) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315237q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f315238r;
            UserAdvertsListParams userAdvertsListParams = this.f315239s;
            String str = userAdvertsListParams.f314697c.f314714b.f314193b;
            int i13 = userAdvertsListParams.f314696b.f314711d;
            UserAdvertsListParams.SearchInfo searchInfo = userAdvertsListParams.f314698d;
            String str2 = searchInfo.f314700b;
            String str3 = !C43066x.K(str2) ? str2 : null;
            Boolean boolBoxBoolean = Boxing.boxBoolean(searchInfo.f314701c);
            boolBoxBoolean.getClass();
            Boolean bool = !C43066x.K(searchInfo.f314700b) ? boolBoxBoolean : null;
            Map<String, Object> map = searchInfo.f314702d;
            C40014a c40014a = new C40014a(this.f315240t, str3, i13, bool, str, this.f315241u, (map.isEmpty() || kotlin.jvm.internal.L.f(searchInfo.f314702d, searchInfo.f314703e)) ? null : map, userAdvertsListParams.f314697c.f314715c, this.f315242v);
            com.avito.android.user_adverts.tab_screens.adverts.domain.a aVar = this.f315243w.f315272a;
            this.f315238r = interfaceC43172j;
            this.f315237q = 1;
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
            interfaceC43172j = (InterfaceC43172j) this.f315238r;
            C42729a0.b(obj);
            objA = obj;
        }
        this.f315238r = null;
        this.f315237q = 2;
        if (interfaceC43172j.emit(objA, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

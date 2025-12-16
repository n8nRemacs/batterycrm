package com.avito.android.publish.slots.salary_range;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import dl0.InterfaceC39749a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.channels.I0;
import ql0.C47414a;

/* compiled from: MarketSalaryInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/remote/model/TypedResult;", "Lql0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.salary_range.MarketSalaryInteractor$loadMarketSalary$1", f = "MarketSalaryInteractor.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 38}, m = "invokeSuspend", n = {"$this$rxObservable"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<I0<? super TypedResult<C47414a>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f244747q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f244748r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f244749s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f244750t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f244751u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f244752v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Long f244753w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Long f244754x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Double f244755y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Double f244756z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, String str2, String str3, Long l12, Long l13, Double d12, Double d13, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f244749s = bVar;
        this.f244750t = str;
        this.f244751u = str2;
        this.f244752v = str3;
        this.f244753w = l12;
        this.f244754x = l13;
        this.f244755y = d12;
        this.f244756z = d13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f244749s, this.f244750t, this.f244751u, this.f244752v, this.f244753w, this.f244754x, this.f244755y, this.f244756z, continuation);
        aVar.f244748r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super TypedResult<C47414a>> i02, Continuation<? super G0> continuation) {
        return ((a) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        I0 i02;
        Object objD;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f244747q;
        if (i12 == 0) {
            C42729a0.b(obj);
            i02 = (I0) this.f244748r;
            InterfaceC39749a interfaceC39749a = this.f244749s.f244758b.get();
            String str = this.f244750t;
            Long lZ02 = str != null ? C43066x.z0(str) : null;
            this.f244748r = i02;
            this.f244747q = 1;
            objD = interfaceC39749a.d(this.f244751u, this.f244752v, this.f244753w, this.f244754x, lZ02, this.f244755y, this.f244756z, null, null, this);
            if (objD == coroutine_suspended) {
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
            I0 i03 = (I0) this.f244748r;
            C42729a0.b(obj);
            i02 = i03;
            objD = obj;
        }
        this.f244748r = null;
        this.f244747q = 2;
        if (i02.send((TypedResult) objD, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

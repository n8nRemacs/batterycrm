package com.avito.android.autoteka.data.order;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.UtmParamsV2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yj0.InterfaceC50257a;

/* compiled from: AutotekaLoadPaymentInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LBj0/c;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.data.order.AutotekaLoadPaymentInteractorImpl$invoke$result$1", f = "AutotekaLoadPaymentInteractor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class m extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<Bj0.c>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f96174q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f96175r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f96176s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UtmParamsV2 f96177t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Long f96178u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f96179v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f96180w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f96181x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, String str, UtmParamsV2 utmParamsV2, Long l12, String str2, String str3, String str4, Continuation<? super m> continuation) {
        super(1, continuation);
        this.f96175r = nVar;
        this.f96176s = str;
        this.f96177t = utmParamsV2;
        this.f96178u = l12;
        this.f96179v = str2;
        this.f96180w = str3;
        this.f96181x = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new m(this.f96175r, this.f96176s, this.f96177t, this.f96178u, this.f96179v, this.f96180w, this.f96181x, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super TypedResult<Bj0.c>> continuation) {
        return ((m) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f96174q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return obj;
        }
        C42729a0.b(obj);
        InterfaceC50257a interfaceC50257a = this.f96175r.f96182a;
        UtmParamsV2 utmParamsV2 = this.f96177t;
        String str = utmParamsV2.f318756d;
        this.f96174q = 1;
        Object objG = interfaceC50257a.g(this.f96176s, str, utmParamsV2.f318757e, utmParamsV2.f318754b, utmParamsV2.f318755c, utmParamsV2.f318758f, this.f96178u, this.f96179v, this.f96180w, this.f96181x, this);
        return objG == coroutine_suspended ? coroutine_suspended : objG;
    }
}

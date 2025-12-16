package com.avito.android.captcha.deeplink;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.captcha.K;
import com.avito.android.captcha.t;
import com.avito.android.captcha.y;
import com.avito.android.captcha.z;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;

/* compiled from: CaptchaDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.captcha.deeplink.CaptchaDeeplinkHandler$launchTokenVerification$1", f = "CaptchaDeeplinkHandler.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f115009q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f115010r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f115011s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f115012t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l<z, G0> f115013u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(d dVar, y yVar, Y41.a<G0> aVar, l<? super z, G0> lVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f115010r = dVar;
        this.f115011s = yVar;
        this.f115012t = aVar;
        this.f115013u = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new e(this.f115010r, this.f115011s, this.f115012t, this.f115013u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f115009q;
        if (i12 == 0) {
            C42729a0.b(obj);
            t tVar = this.f115010r.f114993g;
            this.f115009q = 1;
            obj = tVar.b(this.f115011s, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        K k12 = (K) obj;
        if (L.f(k12, K.b.f114950a)) {
            ((b) this.f115012t).invoke();
        } else if (k12 instanceof K.a) {
            ((c) this.f115013u).invoke(((K.a) k12).f114949a);
        }
        return G0.f406611a;
    }
}

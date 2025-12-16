package com.avito.android.captcha.deeplink;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.captcha.deeplink.i;
import com.avito.android.error.z;
import com.avito.android.remote.captcha.model.CaptchaDeeplink;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* compiled from: CaptchaDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.captcha.deeplink.CaptchaDeeplinkHandler$doHandle$1", f = "CaptchaDeeplinkHandler.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114980q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f114981r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CaptchaDeeplink f114982s;

    /* compiled from: CaptchaDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/captcha/p;", "captcha", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/captcha/p;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.captcha.deeplink.a$a, reason: collision with other inner class name */
    public static final class C3353a extends N implements l<com.avito.android.captcha.p, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f114983l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CaptchaDeeplink f114984m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3353a(d dVar, CaptchaDeeplink captchaDeeplink) {
            super(1);
            this.f114983l = dVar;
            this.f114984m = captchaDeeplink;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.captcha.p pVar) {
            d dVar = this.f114983l;
            dVar.l();
            dVar.k(pVar, this.f114984m);
            return G0.f406611a;
        }
    }

    /* compiled from: CaptchaDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f114985l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(1);
            this.f114985l = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            d dVar = this.f114985l;
            dVar.l();
            dVar.m(i.c.f115032b);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, CaptchaDeeplink captchaDeeplink, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f114981r = dVar;
        this.f114982s = captchaDeeplink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f114981r, this.f114982s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114980q;
        d dVar = this.f114981r;
        if (i12 == 0) {
            C42729a0.b(obj);
            dVar.f114997k.g(null, true);
            this.f114980q = 1;
            obj = dVar.f114993g.a(false, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        z.o((TypedResult) obj, new C3353a(dVar, this.f114982s), new b(dVar), null, 60);
        return G0.f406611a;
    }
}

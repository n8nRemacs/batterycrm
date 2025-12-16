package com.avito.android.captcha.interceptor;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.captcha.interceptor.g;
import com.avito.android.captcha.r;
import com.avito.android.captcha.s;
import com.avito.android.captcha.y;
import com.avito.android.captcha.z;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: TooManyRequestsInterceptorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/captcha/interceptor/g$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/captcha/interceptor/g$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.captcha.interceptor.TooManyRequestsInterceptorImpl$showCaptchaChallenge$1", f = "TooManyRequestsInterceptorImpl.kt", i = {}, l = {338}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class h extends SuspendLambda implements p<T, Continuation<? super g.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public r f115081q;

    /* renamed from: r, reason: collision with root package name */
    public int f115082r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f115083s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f115084t;

    /* compiled from: TooManyRequestsInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/captcha/y;", "token", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/captcha/y;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<y, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f115085l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlinx.coroutines.r rVar) {
            super(1);
            this.f115085l = rVar;
        }

        @Override // Y41.l
        public final G0 invoke(y yVar) {
            y yVar2 = yVar;
            kotlinx.coroutines.r rVar = this.f115085l;
            if (rVar.isActive()) {
                int i12 = Z.f406624c;
                rVar.resumeWith(new g.a.e(yVar2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TooManyRequestsInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/captcha/z;", "error", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/captcha/z;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<z, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f115086l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.r rVar) {
            super(1);
            this.f115086l = rVar;
        }

        @Override // Y41.l
        public final G0 invoke(z zVar) {
            z zVar2 = zVar;
            kotlinx.coroutines.r rVar = this.f115086l;
            if (rVar.isActive()) {
                int i12 = Z.f406624c;
                rVar.resumeWith(new g.a.c(zVar2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TooManyRequestsInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f115087l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.r rVar) {
            super(0);
            this.f115087l = rVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            kotlinx.coroutines.r rVar = this.f115087l;
            if (rVar.isActive()) {
                int i12 = Z.f406624c;
                rVar.resumeWith(g.a.f.f115074a);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, g gVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f115083s = rVar;
        this.f115084t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new h(this.f115083s, this.f115084t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super g.a> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f115082r;
        if (i12 == 0) {
            C42729a0.b(obj);
            r rVar = this.f115083s;
            this.f115081q = rVar;
            g gVar = this.f115084t;
            this.f115082r = 1;
            kotlinx.coroutines.r rVar2 = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
            rVar2.p();
            s sVarB = rVar.b();
            if (L.f(sVarB, s.c.f115135a)) {
                gVar.f115064g.a();
                rVar.c(new c(rVar2), new a(rVar2), new b(rVar2));
            } else if (L.f(sVarB, s.a.f115133a)) {
                if (rVar2.isActive()) {
                    int i13 = Z.f406624c;
                    rVar2.resumeWith(g.a.b.f115070a);
                }
            } else if (L.f(sVarB, s.b.f115134a) && rVar2.isActive()) {
                int i14 = Z.f406624c;
                rVar2.resumeWith(g.a.C3354a.f115069a);
            }
            obj = rVar2.o();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}

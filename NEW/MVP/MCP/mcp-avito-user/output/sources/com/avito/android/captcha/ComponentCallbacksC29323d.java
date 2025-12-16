package com.avito.android.captcha;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import com.avito.android.captcha.q;
import com.avito.android.captcha.s;
import com.avito.android.captcha.z;
import com.avito.android.remote.captcha.model.CaptchaType;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;

/* compiled from: AvitoCaptchaHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/d;", "Landroid/content/ComponentCallbacks;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.captcha.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ComponentCallbacksC29323d implements ComponentCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C29327h f114974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f114975c;

    /* compiled from: AvitoCaptchaHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.captcha.AvitoCaptchaHandler$registerComponentCallbacks$1$onConfigurationChanged$1", f = "AvitoCaptchaHandler.kt", i = {0}, l = {219}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: com.avito.android.captcha.d$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114976q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114977r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C29327h f114978s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Activity f114979t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C29327h c29327h, Activity activity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f114978s = c29327h;
            this.f114979t = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f114978s, this.f114979t, continuation);
            aVar.f114977r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r1v3, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r2v1, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r6v5, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            T t12;
            ?? r12;
            ?? r22;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114976q;
            if (i12 == 0) {
                C42729a0.b(obj);
                t12 = (T) this.f114977r;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t12 = (T) this.f114977r;
                C42729a0.b(obj);
            }
            do {
                U.d(t12);
                C29327h c29327h = this.f114978s;
                Activity activity = c29327h.f115040b.get();
                if (activity != null && activity != this.f114979t) {
                    ?? r02 = c29327h.f115048j;
                    if (r02 == 0 || (r12 = c29327h.f115049k) == 0 || (r22 = c29327h.f115050l) == 0) {
                        c29327h.destroy();
                    } else {
                        c29327h.destroy();
                        if (kotlin.jvm.internal.L.f(c29327h.b(), s.c.f115135a)) {
                            c29327h.c(r22, r02, r12);
                        } else {
                            ?? r62 = c29327h.f115049k;
                            if (r62 != 0) {
                                r62.invoke(new z.d(new q.b("Challenge relaunch failed", CaptchaType.AVITO_CAPTCHA)));
                            }
                        }
                    }
                    return G0.f406611a;
                }
                this.f114977r = t12;
                this.f114976q = 1;
            } while (C43131e0.b(100L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    public ComponentCallbacksC29323d(C29327h c29327h, Activity activity) {
        this.f114974b = c29327h;
        this.f114975c = activity;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@Y61.k Configuration configuration) {
        C29327h c29327h = this.f114974b;
        N0 n02 = c29327h.f115044f;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        c29327h.f115044f = C43259k.d(c29327h, null, null, new a(c29327h, this.f114975c, null), 3);
    }

    @Override // android.content.ComponentCallbacks
    @InterfaceC42830m
    public final void onLowMemory() {
    }
}

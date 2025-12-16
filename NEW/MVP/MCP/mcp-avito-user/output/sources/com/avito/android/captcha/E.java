package com.avito.android.captcha;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import com.avito.android.captcha.s;
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

/* compiled from: GeetestCaptchaHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/E;", "Landroid/content/ComponentCallbacks;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class E implements ComponentCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f114937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f114938c;

    /* compiled from: GeetestCaptchaHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.captcha.GeetestCaptchaHandler$registerComponentCallbacks$1$onConfigurationChanged$1", f = "GeetestCaptchaHandler.kt", i = {0}, l = {160}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114939q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114940r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ B f114941s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Activity f114942t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B b12, Activity activity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f114941s = b12;
            this.f114942t = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f114941s, this.f114942t, continuation);
            aVar.f114940r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r1v3, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            T t12;
            ?? r12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114939q;
            if (i12 == 0) {
                C42729a0.b(obj);
                t12 = (T) this.f114940r;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t12 = (T) this.f114940r;
                C42729a0.b(obj);
            }
            do {
                U.d(t12);
                B b12 = this.f114941s;
                Activity activity = b12.f114915c.get();
                if (activity != null && activity != this.f114942t) {
                    ?? r02 = b12.f114923k;
                    if (r02 == 0 || (r12 = b12.f114924l) == 0) {
                        b12.destroy();
                    } else {
                        b12.destroy();
                        if (kotlin.jvm.internal.L.f(b12.b(), s.c.f115135a)) {
                            b12.c(D.f114936l, r02, r12);
                        } else {
                            b12.f(B.i("Challenge relaunch failed"));
                        }
                    }
                    return G0.f406611a;
                }
                this.f114940r = t12;
                this.f114939q = 1;
            } while (C43131e0.b(100L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    public E(B b12, Activity activity) {
        this.f114937b = b12;
        this.f114938c = activity;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@Y61.k Configuration configuration) {
        B b12 = this.f114937b;
        N0 n02 = b12.f114918f;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        b12.f114918f = C43259k.d(b12, null, null, new a(b12, this.f114938c, null), 3);
    }

    @Override // android.content.ComponentCallbacks
    @InterfaceC42830m
    public final void onLowMemory() {
    }
}

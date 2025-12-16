package com.avito.android.deeplink_handler.handler.base.coroutines;

import Ju.InterfaceC14249c;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import j.InterfaceC42153i;
import j.K;
import j.k0;
import java.util.Arrays;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: BaseAsyncCoroutinesDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "D", "Lev/a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class a<D extends DeepLink> extends AbstractC40161a<D> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C43238h f134492f;

    /* compiled from: BaseAsyncCoroutinesDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "D", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.deeplink_handler.handler.base.coroutines.BaseAsyncCoroutinesDeeplinkHandler$doHandle$1", f = "BaseAsyncCoroutinesDeeplinkHandler.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.deeplink_handler.handler.base.coroutines.a$a, reason: collision with other inner class name */
    public static final class C4045a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f134493q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ a<DeepLink> f134494r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ DeepLink f134495s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f134496t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Bundle f134497u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4045a(a<DeepLink> aVar, DeepLink deepLink, String str, Bundle bundle, Continuation<? super C4045a> continuation) {
            super(2, continuation);
            this.f134494r = aVar;
            this.f134495s = deepLink;
            this.f134496t = str;
            this.f134497u = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C4045a(this.f134494r, this.f134495s, this.f134496t, this.f134497u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C4045a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f134493q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f134493q = 1;
                if (this.f134494r.m(this.f134495s, this.f134496t, this.f134497u, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BaseAsyncCoroutinesDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "D", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.deeplink_handler.handler.base.coroutines.BaseAsyncCoroutinesDeeplinkHandler$onCreate$1", f = "BaseAsyncCoroutinesDeeplinkHandler.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f134498q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ a<D> f134499r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<D> aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f134499r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new b(this.f134499r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f134498q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f134498q = 1;
                if (this.f134499r.n(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BaseAsyncCoroutinesDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "D", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.deeplink_handler.handler.base.coroutines.BaseAsyncCoroutinesDeeplinkHandler$onScreenRecreate$1", f = "BaseAsyncCoroutinesDeeplinkHandler.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f134500q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ a<D> f134501r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a<D> aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f134501r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new c(this.f134501r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f134500q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f134500q = 1;
                this.f134501r.getClass();
                if (G0.f406611a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BaseAsyncCoroutinesDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "D", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.deeplink_handler.handler.base.coroutines.BaseAsyncCoroutinesDeeplinkHandler$setIntermediateResult$1", f = "BaseAsyncCoroutinesDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ a<D> f134502q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14249c.a f134503r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f134504s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ DeepLink[] f134505t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a<D> aVar, InterfaceC14249c.a aVar2, com.avito.android.deeplink_handler.handler.composite.a aVar3, DeepLink[] deepLinkArr, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f134502q = aVar;
            this.f134503r = aVar2;
            this.f134504s = aVar3;
            this.f134505t = deepLinkArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new d(this.f134502q, this.f134503r, this.f134504s, this.f134505t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            DeepLink[] deepLinkArr = this.f134505t;
            DeepLink[] deepLinkArr2 = (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length);
            a.super.i(this.f134503r, this.f134504s, deepLinkArr2);
            return G0.f406611a;
        }
    }

    /* compiled from: BaseAsyncCoroutinesDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "D", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.deeplink_handler.handler.base.coroutines.BaseAsyncCoroutinesDeeplinkHandler$setTerminalResult$1", f = "BaseAsyncCoroutinesDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ a<D> f134506q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14249c.b f134507r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a<D> aVar, InterfaceC14249c.b bVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f134506q = aVar;
            this.f134507r = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new e(this.f134506q, this.f134507r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a.super.j(this.f134507r);
            return G0.f406611a;
        }
    }

    public a(@k R0 r02) {
        this.f134492f = U.a(r02.b().plus(t1.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(@l Bundle bundle, @k DeepLink deepLink, @l String str) {
        C43259k.d(this.f134492f, null, null, new C4045a(this, deepLink, str, bundle, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43259k.d(this.f134492f, null, null, new b(this, null), 3);
    }

    @Override // ev.AbstractC40161a
    @InterfaceC42153i
    public void g() {
        U.b(this.f134492f, null);
    }

    @Override // ev.AbstractC40161a
    @k0
    public final void i(@k InterfaceC14249c.a aVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k DeepLink... deepLinkArr) {
        C43259k.d(this.f134492f, null, null, new d(this, aVar, aVar2, deepLinkArr, null), 3);
    }

    @Override // ev.AbstractC40161a
    @k0
    public final void j(@k InterfaceC14249c.b bVar) {
        C43259k.d(this.f134492f, null, null, new e(this, bVar, null), 3);
    }

    @l
    @K
    public abstract Object m(@k D d12, @l String str, @l Bundle bundle, @k Continuation<? super G0> continuation);

    @l
    @K
    public Object n(@k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }

    @Override // ev.AbstractC40161a, com.avito.android.deeplink_handler.handler.lifecycle.c
    public final void nc() {
        C43259k.d(this.f134492f, null, null, new c(this, null), 3);
    }
}

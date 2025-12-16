package com.avito.android.iac_avcalls.impl_module.platform;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCallState;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCameraPosition;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCreateCallMetaInfo;
import com.avito.android.iac_avcalls.public_module.models.AvCallsEvent;
import com.avito.android.iac_avcalls.public_module.models.AvCallsTerminateReason;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.Q;
import kotlinx.coroutines.rx3.y;

/* compiled from: AvCallsPlatformImplV2.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/a;", "LHJ/a;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements HJ.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.iac_avcalls.impl_module.platform.c f164349a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f164350b;

    /* compiled from: AvCallsPlatformImplV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_avcalls.impl_module.platform.AvCallsPlatformImplV2$acceptIncomingCall$1", f = "AvCallsPlatformImplV2.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.iac_avcalls.impl_module.platform.a$a, reason: collision with other inner class name */
    public static final class C4805a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164351q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f164353s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4805a(String str, Continuation<? super C4805a> continuation) {
            super(2, continuation);
            this.f164353s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new C4805a(this.f164353s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C4805a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164351q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.iac_avcalls.impl_module.platform.c cVar = a.this.f164349a;
                this.f164351q = 1;
                if (cVar.j(this.f164353s, this) == coroutine_suspended) {
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

    /* compiled from: AvCallsPlatformImplV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_avcalls.impl_module.platform.AvCallsPlatformImplV2$createOutgoingCall$1", f = "AvCallsPlatformImplV2.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super AvCallsCallState>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164354q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f164356s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f164357t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f164358u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f164359v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ AvCallsCreateCallMetaInfo f164360w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, boolean z12, AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f164356s = str;
            this.f164357t = str2;
            this.f164358u = str3;
            this.f164359v = z12;
            this.f164360w = avCallsCreateCallMetaInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new b(this.f164356s, this.f164357t, this.f164358u, this.f164359v, this.f164360w, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super AvCallsCallState> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164354q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.iac_avcalls.impl_module.platform.c cVar = a.this.f164349a;
                this.f164354q = 1;
                obj = cVar.f(this.f164356s, this.f164357t, this.f164358u, this.f164359v, this.f164360w, this);
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

    /* compiled from: AvCallsPlatformImplV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent;", "invoke", "()Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<z<AvCallsEvent>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final z<AvCallsEvent> invoke() {
            return y.b(a.this.f164349a.i());
        }
    }

    /* compiled from: AvCallsPlatformImplV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_avcalls.impl_module.platform.AvCallsPlatformImplV2$handleCallDeliveredByPush$1", f = "AvCallsPlatformImplV2.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164362q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IacPiiString f164364s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IacPiiString iacPiiString, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f164364s = iacPiiString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new d(this.f164364s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164362q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.iac_avcalls.impl_module.platform.c cVar = a.this.f164349a;
                this.f164362q = 1;
                if (cVar.l(this.f164364s, this) == coroutine_suspended) {
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

    /* compiled from: AvCallsPlatformImplV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_avcalls.impl_module.platform.AvCallsPlatformImplV2$handleSocketMessage$1", f = "AvCallsPlatformImplV2.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164365q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IacPiiString f164367s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(IacPiiString iacPiiString, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f164367s = iacPiiString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new e(this.f164367s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164365q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.iac_avcalls.impl_module.platform.c cVar = a.this.f164349a;
                this.f164365q = 1;
                if (cVar.m(this.f164367s, this) == coroutine_suspended) {
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

    /* compiled from: AvCallsPlatformImplV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_avcalls.impl_module.platform.AvCallsPlatformImplV2$sendRingingForIncomingCall$1", f = "AvCallsPlatformImplV2.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164368q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f164370s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f164370s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new f(this.f164370s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164368q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.iac_avcalls.impl_module.platform.c cVar = a.this.f164349a;
                this.f164368q = 1;
                if (cVar.k(this.f164370s, this) == coroutine_suspended) {
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

    /* compiled from: AvCallsPlatformImplV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_avcalls.impl_module.platform.AvCallsPlatformImplV2$startOutgoingCall$1", f = "AvCallsPlatformImplV2.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164371q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f164373s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f164373s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new g(this.f164373s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164371q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.iac_avcalls.impl_module.platform.c cVar = a.this.f164349a;
                this.f164371q = 1;
                if (cVar.n(this.f164373s, this) == coroutine_suspended) {
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

    /* compiled from: AvCallsPlatformImplV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_avcalls.impl_module.platform.AvCallsPlatformImplV2$terminateCall$1", f = "AvCallsPlatformImplV2.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164374q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f164376s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AvCallsTerminateReason f164377t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, AvCallsTerminateReason avCallsTerminateReason, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f164376s = str;
            this.f164377t = avCallsTerminateReason;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new h(this.f164376s, this.f164377t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164374q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.iac_avcalls.impl_module.platform.c cVar = a.this.f164349a;
                this.f164374q = 1;
                if (cVar.h(this.f164376s, this.f164377t, this) == coroutine_suspended) {
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

    @Inject
    public a(@k com.avito.android.iac_avcalls.impl_module.platform.c cVar) {
        this.f164349a = cVar;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d("AvCallsPlatform", "AvCallsPlatformV2 instance is initialized", null);
        this.f164350b = C42727D.c(new c());
    }

    @Override // HJ.a
    public final void a(@k String str, boolean z12) {
        this.f164349a.a(str, z12);
    }

    @Override // HJ.a
    public final boolean b(@k String str, @k String str2) {
        return this.f164349a.b(str, str2);
    }

    @Override // HJ.a
    public final void c(@k String str, boolean z12) {
        this.f164349a.c(str, z12);
    }

    @Override // HJ.a
    public final void d(@k AvCallsCameraPosition avCallsCameraPosition) {
        this.f164349a.d(avCallsCameraPosition);
    }

    @Override // HJ.a
    public final void e(@k String str, boolean z12, @k MJ.a aVar) {
        this.f164349a.e(str, z12, aVar);
    }

    @Override // HJ.a
    @k
    public final z<AvCallsEvent> f() {
        return (z) this.f164350b.getValue();
    }

    @Override // HJ.a
    public final void g(@k String str, boolean z12, @k MJ.a aVar) {
        this.f164349a.g(str, z12, aVar);
    }

    @Override // HJ.a
    @k
    public final JJ.b getConfig() {
        return this.f164349a.getConfig();
    }

    @Override // HJ.a
    @k
    public final I<G0> h(@k String str, @k AvCallsTerminateReason avCallsTerminateReason) {
        return Q.a(EmptyCoroutineContext.INSTANCE, new h(str, avCallsTerminateReason, null));
    }

    @Override // HJ.a
    @k
    public final I<G0> i(@k String str) {
        return Q.a(EmptyCoroutineContext.INSTANCE, new C4805a(str, null));
    }

    @Override // HJ.a
    @k
    public final I<G0> j(@k String str) {
        return Q.a(EmptyCoroutineContext.INSTANCE, new g(str, null));
    }

    @Override // HJ.a
    @k
    public final I<G0> k(@k IacPiiString iacPiiString) {
        return Q.a(EmptyCoroutineContext.INSTANCE, new e(iacPiiString, null));
    }

    @Override // HJ.a
    @k
    public final I<G0> l(@k String str) {
        return Q.a(EmptyCoroutineContext.INSTANCE, new f(str, null));
    }

    @Override // HJ.a
    @k
    public final I<G0> m(@k IacPiiString iacPiiString) {
        return Q.a(EmptyCoroutineContext.INSTANCE, new d(iacPiiString, null));
    }

    @Override // HJ.a
    @k
    public final I<AvCallsCallState> n(@k String str, @k String str2, @k String str3, boolean z12, @k AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo) {
        return Q.a(EmptyCoroutineContext.INSTANCE, new b(str, str2, str3, z12, avCallsCreateCallMetaInfo, null));
    }
}

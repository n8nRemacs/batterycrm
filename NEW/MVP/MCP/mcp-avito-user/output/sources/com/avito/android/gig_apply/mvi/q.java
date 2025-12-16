package com.avito.android.gig_apply.mvi;

import Ju.InterfaceC14249c;
import SK0.b;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gig_apply.GigSlotConfirmDeeplink;
import com.avito.android.gig_apply.GigSlotReceivePaymentDeeplink;
import com.avito.android.gig_apply.GigSlotRefreshDeeplink;
import com.avito.android.gig_apply.GigSlotRetryDeeplink;
import com.avito.android.gig_shift_action.GigShiftActionDeeplink;
import com.avito.android.gig_shift_cancel.GigShiftCancelDeeplink;
import com.avito.android.gig_shift_start.GigShiftStartDeeplink;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;
import pH.k;
import qH.C47294a;
import qH.C47295b;

/* compiled from: GigSlotBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "it", "Lkotlinx/coroutines/flow/i;", "LpH/k;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigSlotBootstrap$observeDeeplinkResult$1", f = "GigSlotBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class q extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends pH.k>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f159754q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f159755r;

    /* compiled from: GigSlotBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigSlotBootstrap$observeDeeplinkResult$1$10", f = "GigSlotBootstrap.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super pH.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159756q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159757r;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(2, continuation);
            aVar.f159757r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pH.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159756q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f159757r;
                k.g gVar = k.g.f428403a;
                this.f159756q = 1;
                if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
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

    /* compiled from: GigSlotBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigSlotBootstrap$observeDeeplinkResult$1$11", f = "GigSlotBootstrap.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super pH.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159758q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159759r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f159759r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pH.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159758q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f159759r;
                k.b bVar = k.b.f428377a;
                this.f159758q = 1;
                if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
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

    /* compiled from: GigSlotBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigSlotBootstrap$observeDeeplinkResult$1$12", f = "GigSlotBootstrap.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super pH.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159760q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159761r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14249c f159762s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC14249c interfaceC14249c, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f159762s = interfaceC14249c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f159762s, continuation);
            cVar.f159761r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pH.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159760q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f159761r;
                k.f fVar = new k.f(((GigSlotRetryDeeplink.b.a) this.f159762s).f159531b);
                this.f159760q = 1;
                if (interfaceC43172j.emit(fVar, this) == coroutine_suspended) {
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

    /* compiled from: GigSlotBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigSlotBootstrap$observeDeeplinkResult$1$1", f = "GigSlotBootstrap.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super pH.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159763q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159764r;

        public d() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(2, continuation);
            dVar.f159764r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pH.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159763q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f159764r;
                k.g gVar = k.g.f428403a;
                this.f159763q = 1;
                if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
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

    /* compiled from: GigSlotBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigSlotBootstrap$observeDeeplinkResult$1$2", f = "GigSlotBootstrap.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super pH.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159765q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159766r;

        public e() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(2, continuation);
            eVar.f159766r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pH.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159765q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f159766r;
                k.i iVar = k.i.f428406a;
                this.f159765q = 1;
                if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
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

    /* compiled from: GigSlotBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigSlotBootstrap$observeDeeplinkResult$1$3", f = "GigSlotBootstrap.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super pH.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159767q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159768r;

        public f() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(2, continuation);
            fVar.f159768r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pH.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159767q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f159768r;
                k.g gVar = k.g.f428403a;
                this.f159767q = 1;
                if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
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

    /* compiled from: GigSlotBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigSlotBootstrap$observeDeeplinkResult$1$5", f = "GigSlotBootstrap.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super pH.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159769q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159770r;

        public g() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(2, continuation);
            gVar.f159770r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pH.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159769q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f159770r;
                k.g gVar = k.g.f428403a;
                this.f159769q = 1;
                if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
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

    /* compiled from: GigSlotBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigSlotBootstrap$observeDeeplinkResult$1$6", f = "GigSlotBootstrap.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super pH.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159771q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159772r;

        public h() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = new h(2, continuation);
            hVar.f159772r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pH.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159771q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f159772r;
                k.g gVar = k.g.f428403a;
                this.f159771q = 1;
                if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
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

    /* compiled from: GigSlotBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigSlotBootstrap$observeDeeplinkResult$1$7", f = "GigSlotBootstrap.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super pH.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159773q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159774r;

        public i() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i iVar = new i(2, continuation);
            iVar.f159774r = obj;
            return iVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pH.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159773q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f159774r;
                k.g gVar = k.g.f428403a;
                this.f159773q = 1;
                if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
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

    /* compiled from: GigSlotBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigSlotBootstrap$observeDeeplinkResult$1$9", f = "GigSlotBootstrap.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super pH.k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159775q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f159776r;

        public j() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            j jVar = new j(2, continuation);
            jVar.f159776r = obj;
            return jVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pH.k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159775q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f159776r;
                k.g gVar = k.g.f428403a;
                this.f159775q = 1;
                if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f159755r = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f159755r, continuation);
        qVar.f159754q = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends pH.k>> continuation) {
        return ((q) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f159754q).f413261b;
        boolean z12 = interfaceC14249c instanceof GigSlotRefreshDeeplink.b.a;
        r rVar = this.f159755r;
        if (z12) {
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new d(2, null)), rVar.f159778b.b(rVar.f159777a.f159882b)));
        }
        if (interfaceC14249c instanceof GigSlotReceivePaymentDeeplink.b.C4658b) {
            b.a.a(rVar.f159779c, ((GigSlotReceivePaymentDeeplink.b.C4658b) interfaceC14249c).f159528b, null, null, 6);
            return C43175k.w();
        }
        if (interfaceC14249c instanceof GigSlotReceivePaymentDeeplink.b.a) {
            return C43175k.G(new e(2, null));
        }
        if (interfaceC14249c instanceof GigShiftCancelDeeplink.b.a) {
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new f(2, null)), rVar.f159778b.b(rVar.f159777a.f159882b)));
        }
        if (interfaceC14249c instanceof GigShiftActionDeeplink.b.c) {
            b.a.a(rVar.f159779c, ((GigShiftActionDeeplink.b.c) interfaceC14249c).f160391b, null, null, 6);
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new g(2, null)), rVar.f159778b.b(rVar.f159777a.f159882b)));
        }
        if (interfaceC14249c instanceof GigShiftActionDeeplink.b.d) {
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new h(2, null)), rVar.f159778b.b(rVar.f159777a.f159882b)));
        }
        if (interfaceC14249c instanceof GigShiftStartDeeplink.b.a) {
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new i(2, null)), rVar.f159778b.b(rVar.f159777a.f159882b)));
        }
        if (interfaceC14249c instanceof GigShiftActionDeeplink.b.C4686b) {
            b.a.a(rVar.f159779c, ((GigShiftActionDeeplink.b.C4686b) interfaceC14249c).f160390b, null, null, 6);
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new j(2, null)), rVar.f159778b.b(rVar.f159777a.f159882b)));
        }
        if (interfaceC14249c instanceof com.avito.android.beduin.v2.page.m) {
            if (interfaceC14249c instanceof m.c) {
                b.a.a(rVar.f159780d, new C47295b(), null, null, null, 14);
            }
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new a(2, null)), rVar.f159778b.b(rVar.f159777a.f159882b)));
        }
        if (interfaceC14249c instanceof GigSlotConfirmDeeplink.b.a) {
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new b(2, null)), rVar.f159778b.a(rVar.f159777a.f159882b)));
        }
        if (interfaceC14249c instanceof WebViewLink.a) {
            b.a.a(rVar.f159780d, new C47294a(), null, null, null, 14);
            return C43175k.w();
        }
        if (!(interfaceC14249c instanceof GigSlotRetryDeeplink.b.C4659b)) {
            return interfaceC14249c instanceof GigSlotRetryDeeplink.b.a ? C43175k.G(new c(interfaceC14249c, null)) : C43175k.w();
        }
        b.a.a(rVar.f159779c, ((GigSlotRetryDeeplink.b.C4659b) interfaceC14249c).f159532b, null, null, 6);
        return C43175k.w();
    }
}

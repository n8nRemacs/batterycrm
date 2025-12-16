package com.avito.android.advert_collection_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.H;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;

/* compiled from: AdvertCollectionListBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/k;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements com.avito.android.arch.mvi.b<AdvertCollectionListInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_list.f f82239a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f82240b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f82241c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final H f82242d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f82243e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public volatile String f82244f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f82245g;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<String> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f82246b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f82247c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.advert_collection_list.mvi.k$a$a, reason: collision with other inner class name */
        public static final class C2440a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f82248b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f82249c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.advert_collection_list.mvi.AdvertCollectionListBootstrap$produce$$inlined$filter$1$2", f = "AdvertCollectionListBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.advert_collection_list.mvi.k$a$a$a, reason: collision with other inner class name */
            public static final class C2441a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f82250q;

                /* renamed from: r, reason: collision with root package name */
                public int f82251r;

                public C2441a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f82250q = obj;
                    this.f82251r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C2440a.this.emit(null, this);
                }
            }

            public C2440a(InterfaceC43172j interfaceC43172j, k kVar) {
                this.f82248b = interfaceC43172j;
                this.f82249c = kVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.advert_collection_list.mvi.k.a.C2440a.C2441a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.advert_collection_list.mvi.k$a$a$a r0 = (com.avito.android.advert_collection_list.mvi.k.a.C2440a.C2441a) r0
                    int r1 = r0.f82251r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f82251r = r1
                    goto L18
                L13:
                    com.avito.android.advert_collection_list.mvi.k$a$a$a r0 = new com.avito.android.advert_collection_list.mvi.k$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f82250q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f82251r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    kotlinx.coroutines.flow.j r7 = r5.f82248b
                    r2 = r6
                    java.lang.String r2 = (java.lang.String) r2
                    com.avito.android.advert_collection_list.mvi.k r4 = r5.f82249c
                    java.lang.String r4 = r4.f82244f
                    boolean r2 = kotlin.jvm.internal.L.f(r2, r4)
                    if (r2 != 0) goto L4c
                    r0.f82251r = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_collection_list.mvi.k.a.C2440a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, k kVar) {
            this.f82246b = interfaceC43160i;
            this.f82247c = kVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super String> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f82246b).collect(new C2440a(interfaceC43172j, this.f82247c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.mvi.AdvertCollectionListBootstrap$produce$$inlined$flatMapLatest$1", f = "AdvertCollectionListBootstrap.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AdvertCollectionListInternalAction>, G0, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f82253q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f82254r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f82255s;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionListInternalAction> interfaceC43172j, G0 g02, Continuation<? super G0> continuation) {
            b bVar = k.this.new b(continuation);
            bVar.f82254r = interfaceC43172j;
            bVar.f82255s = g02;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82253q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f82254r;
                k kVar = k.this;
                InterfaceC43160i interfaceC43160iG = C43175k.G(new g(kVar.f82239a.a(), null, kVar));
                this.f82253q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<G0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43197r1 f82257b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f82258b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.advert_collection_list.mvi.AdvertCollectionListBootstrap$produce$$inlined$map$1$2", f = "AdvertCollectionListBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.advert_collection_list.mvi.k$c$a$a, reason: collision with other inner class name */
            public static final class C2442a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f82259q;

                /* renamed from: r, reason: collision with root package name */
                public int f82260r;

                public C2442a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f82259q = obj;
                    this.f82260r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f82258b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.advert_collection_list.mvi.k.c.a.C2442a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.advert_collection_list.mvi.k$c$a$a r0 = (com.avito.android.advert_collection_list.mvi.k.c.a.C2442a) r0
                    int r1 = r0.f82260r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f82260r = r1
                    goto L18
                L13:
                    com.avito.android.advert_collection_list.mvi.k$c$a$a r0 = new com.avito.android.advert_collection_list.mvi.k$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f82259q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f82260r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    java.lang.String r5 = (java.lang.String) r5
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    r0.f82260r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f82258b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_collection_list.mvi.k.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(C43197r1 c43197r1) {
            this.f82257b = c43197r1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super G0> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f82257b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionListBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.mvi.AdvertCollectionListBootstrap$produce$2", f = "AdvertCollectionListBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f82262q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = k.this.new d(continuation);
            dVar.f82262q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((d) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            k.this.f82244f = (String) this.f82262q;
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionListBootstrap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.mvi.AdvertCollectionListBootstrap$produce$4", f = "AdvertCollectionListBootstrap.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super G0>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f82264q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f82265r;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = k.this.new e(continuation);
            eVar.f82265r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super G0> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82264q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f82265r;
                if (!k.this.f82245g && !k.this.f82243e) {
                    G0 g02 = G0.f406611a;
                    this.f82264q = 1;
                    if (interfaceC43172j.emit(g02, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: AdvertCollectionListBootstrap.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.mvi.AdvertCollectionListBootstrap$produce$5", f = "AdvertCollectionListBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {
        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return k.this.new f(continuation);
        }

        @Override // Y41.p
        public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
            return ((f) create(g02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            k.this.f82245g = true;
            return G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_list.mvi.AdvertCollectionListBootstrap$produce$lambda$3$$inlined$transform$1", f = "AdvertCollectionListBootstrap.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f82268q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f82269r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f82270s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ k f82271t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<AdvertCollectionListInternalAction> f82272b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f82273c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.advert_collection_list.mvi.AdvertCollectionListBootstrap$produce$lambda$3$$inlined$transform$1$1", f = "AdvertCollectionListBootstrap.kt", i = {0, 0, 0}, l = {219, 221}, m = "emit", n = {"this", "it", "$this$produce_u24lambda_u243_u24lambda_u242"}, s = {"L$0", "L$1", "L$2"})
            /* renamed from: com.avito.android.advert_collection_list.mvi.k$g$a$a, reason: collision with other inner class name */
            public static final class C2443a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f82274q;

                /* renamed from: r, reason: collision with root package name */
                public int f82275r;

                /* renamed from: t, reason: collision with root package name */
                public a f82277t;

                /* renamed from: u, reason: collision with root package name */
                public AdvertCollectionListInternalAction f82278u;

                /* renamed from: v, reason: collision with root package name */
                public InterfaceC43172j f82279v;

                public C2443a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f82274q = obj;
                    this.f82275r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, k kVar) {
                this.f82273c = kVar;
                this.f82272b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.avito.android.advert_collection_list.mvi.k.g.a.C2443a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.avito.android.advert_collection_list.mvi.k$g$a$a r0 = (com.avito.android.advert_collection_list.mvi.k.g.a.C2443a) r0
                    int r1 = r0.f82275r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f82275r = r1
                    goto L18
                L13:
                    com.avito.android.advert_collection_list.mvi.k$g$a$a r0 = new com.avito.android.advert_collection_list.mvi.k$g$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f82274q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f82275r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C42729a0.b(r8)
                    goto L87
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    kotlinx.coroutines.flow.j r7 = r0.f82279v
                    com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction r2 = r0.f82278u
                    com.avito.android.advert_collection_list.mvi.k$g$a r4 = r0.f82277t
                    kotlin.C42729a0.b(r8)
                    goto L56
                L3e:
                    kotlin.C42729a0.b(r8)
                    r2 = r7
                    com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction r2 = (com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction) r2
                    r0.f82277t = r6
                    r0.f82278u = r2
                    kotlinx.coroutines.flow.j<com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction> r7 = r6.f82272b
                    r0.f82279v = r7
                    r0.f82275r = r4
                    java.lang.Object r8 = r7.emit(r2, r0)
                    if (r8 != r1) goto L55
                    return r1
                L55:
                    r4 = r6
                L56:
                    boolean r8 = r2 instanceof com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction.CollectionListLoaded
                    if (r8 == 0) goto L87
                    com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction$SendCollectionListViewEvent r8 = new com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction$SendCollectionListViewEvent
                    com.avito.android.advert_collection_list.mvi.k r5 = r4.f82273c
                    com.avito.android.account.E r5 = r5.f82241c
                    java.lang.String r5 = r5.a()
                    com.avito.android.advert_collection_list.mvi.k r4 = r4.f82273c
                    com.avito.android.remote.H r4 = r4.f82242d
                    java.lang.String r4 = r4.getF253025a()
                    com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction$CollectionListLoaded r2 = (com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction.CollectionListLoaded) r2
                    java.util.ArrayList r2 = r2.f82200b
                    int r2 = r2.size()
                    r8.<init>(r5, r4, r2)
                    r2 = 0
                    r0.f82277t = r2
                    r0.f82278u = r2
                    r0.f82279v = r2
                    r0.f82275r = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L87
                    return r1
                L87:
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_collection_list.mvi.k.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC43160i interfaceC43160i, Continuation continuation, k kVar) {
            super(2, continuation);
            this.f82270s = interfaceC43160i;
            this.f82271t = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f82270s, continuation, this.f82271t);
            gVar.f82269r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82268q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f82269r, this.f82271t);
                this.f82268q = 1;
                if (this.f82270s.collect(aVar, this) == coroutine_suspended) {
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
    public k(@Y61.k com.avito.android.advert_collection_list.f fVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k E e12, @Y61.k H h12, @com.avito.android.advert_collection_list.di.n boolean z12, @com.avito.android.advert_collection_list.di.o @Y61.l String str) {
        this.f82239a = fVar;
        this.f82240b = aVar;
        this.f82241c = e12;
        this.f82242d = h12;
        this.f82243e = z12;
        this.f82244f = str == null ? e12.a() : str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionListInternalAction> a() {
        return C43175k.N(C43175k.Y(new C43197r1(new f(null), new C43137a0(new e(null), new c(new C43197r1(new d(null), new a(y.a(this.f82241c.m()), this))))), new b(null)), new j(y.a(this.f82240b.d9())));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

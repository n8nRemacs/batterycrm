package com.avito.android.virtual_deal_room_client_creation.clients;

import NN0.a;
import NN0.b;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.layout.W2;
import androidx.compose.foundation.lazy.A0;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ClientsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "showScrollButton", "_avito_virtual-deal-room-client-creation_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36101l {

    /* compiled from: ClientsScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.clients.ClientsScreenKt$ClientsScreen$1", f = "ClientsScreen.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f326578q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<NN0.b> f326579r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f326580s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.l<PN0.a, G0> f326581t;

        /* compiled from: ClientsScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNN0/b;", "event", "Lkotlin/G0;", "emit", "(LNN0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$a$a, reason: collision with other inner class name */
        public static final class C10101a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y41.a<G0> f326582b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Y41.l<PN0.a, G0> f326583c;

            /* JADX WARN: Multi-variable type inference failed */
            public C10101a(Y41.a<G0> aVar, Y41.l<? super PN0.a, G0> lVar) {
                this.f326582b = aVar;
                this.f326583c = lVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                NN0.b bVar = (NN0.b) obj;
                if (kotlin.jvm.internal.L.f(bVar, b.a.f11399a)) {
                    this.f326582b.invoke();
                } else {
                    boolean zF2 = kotlin.jvm.internal.L.f(bVar, b.C0733b.f11400a);
                    Y41.l<PN0.a, G0> lVar = this.f326583c;
                    if (zF2) {
                        lVar.invoke(null);
                    } else if (bVar instanceof b.c) {
                        lVar.invoke(((b.c) bVar).f11401a);
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, Y41.l lVar, Continuation continuation, InterfaceC43160i interfaceC43160i) {
            super(2, continuation);
            this.f326579r = interfaceC43160i;
            this.f326580s = aVar;
            this.f326581t = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f326580s, this.f326581t, continuation, this.f326579r);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f326578q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C10101a c10101a = new C10101a(this.f326580s, this.f326581t);
                this.f326578q = 1;
                if (this.f326579r.collect(c10101a, this) == coroutine_suspended) {
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

    /* compiled from: ClientsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.clients.ClientsScreenKt$ClientsScreen$2$1", f = "ClientsScreen.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$b */
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f326584q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ w0 f326585r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ NN0.c f326586s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.l<NN0.a, G0> f326587t;

        /* compiled from: ClientsScreen.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$b$a */
        public static final class a extends N implements Y41.a<Integer> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ w0 f326588l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w0 w0Var) {
                super(0);
                this.f326588l = w0Var;
            }

            @Override // Y41.a
            public final Integer invoke() {
                androidx.compose.foundation.lazy.K k12 = (androidx.compose.foundation.lazy.K) C42745f0.S(this.f326588l.j().h());
                return Integer.valueOf(k12 != null ? k12.getF29645a() : -1);
            }
        }

        /* compiled from: ClientsScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$b$b, reason: collision with other inner class name */
        public static final class C10102b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y41.l<NN0.a, G0> f326589b;

            /* JADX WARN: Multi-variable type inference failed */
            public C10102b(Y41.l<? super NN0.a, G0> lVar) {
                this.f326589b = lVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                ((Boolean) obj).booleanValue();
                this.f326589b.invoke(a.d.f11397a);
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$b$c */
        public static final class c implements InterfaceC43160i<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f326590b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$b$c$a */
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f326591b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.clients.ClientsScreenKt$ClientsScreen$2$1$invokeSuspend$$inlined$filter$1$2", f = "ClientsScreen.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$b$c$a$a, reason: collision with other inner class name */
                public static final class C10103a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f326592q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f326593r;

                    public C10103a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f326592q = obj;
                        this.f326593r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j) {
                    this.f326591b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.virtual_deal_room_client_creation.clients.C36101l.b.c.a.C10103a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.virtual_deal_room_client_creation.clients.l$b$c$a$a r0 = (com.avito.android.virtual_deal_room_client_creation.clients.C36101l.b.c.a.C10103a) r0
                        int r1 = r0.f326593r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f326593r = r1
                        goto L18
                    L13:
                        com.avito.android.virtual_deal_room_client_creation.clients.l$b$c$a$a r0 = new com.avito.android.virtual_deal_room_client_creation.clients.l$b$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f326592q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f326593r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        r6 = r5
                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                        boolean r6 = r6.booleanValue()
                        if (r6 == 0) goto L48
                        r0.f326593r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f326591b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.clients.C36101l.b.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public c(InterfaceC43160i interfaceC43160i) {
                this.f326590b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f326590b.collect(new a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$b$d */
        public static final class d implements InterfaceC43160i<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f326595b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w0 f326596c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ NN0.c f326597d;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$b$d$a */
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f326598b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w0 f326599c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ NN0.c f326600d;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.clients.ClientsScreenKt$ClientsScreen$2$1$invokeSuspend$$inlined$map$1$2", f = "ClientsScreen.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$b$d$a$a, reason: collision with other inner class name */
                public static final class C10104a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f326601q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f326602r;

                    public C10104a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f326601q = obj;
                        this.f326602r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j, w0 w0Var, NN0.c cVar) {
                    this.f326598b = interfaceC43172j;
                    this.f326599c = w0Var;
                    this.f326600d = cVar;
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
                        boolean r0 = r6 instanceof com.avito.android.virtual_deal_room_client_creation.clients.C36101l.b.d.a.C10104a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.virtual_deal_room_client_creation.clients.l$b$d$a$a r0 = (com.avito.android.virtual_deal_room_client_creation.clients.C36101l.b.d.a.C10104a) r0
                        int r1 = r0.f326602r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f326602r = r1
                        goto L18
                    L13:
                        com.avito.android.virtual_deal_room_client_creation.clients.l$b$d$a$a r0 = new com.avito.android.virtual_deal_room_client_creation.clients.l$b$d$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f326601q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f326602r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L62
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        java.lang.Number r5 = (java.lang.Number) r5
                        int r5 = r5.intValue()
                        androidx.compose.foundation.lazy.w0 r6 = r4.f326599c
                        androidx.compose.foundation.lazy.Y r6 = r6.j()
                        int r6 = r6.getF28948n()
                        int r6 = r6 + (-3)
                        NN0.c r2 = r4.f326600d
                        NN0.d r2 = r2.f11409g
                        boolean r2 = r2.f11414d
                        if (r2 == 0) goto L52
                        if (r5 < r6) goto L52
                        r5 = r3
                        goto L53
                    L52:
                        r5 = 0
                    L53:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r0.f326602r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f326598b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L62
                        return r1
                    L62:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.clients.C36101l.b.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public d(InterfaceC43160i interfaceC43160i, w0 w0Var, NN0.c cVar) {
                this.f326595b = interfaceC43160i;
                this.f326596c = w0Var;
                this.f326597d = cVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f326595b.collect(new a(interfaceC43172j, this.f326596c, this.f326597d), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(w0 w0Var, NN0.c cVar, Y41.l<? super NN0.a, G0> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f326585r = w0Var;
            this.f326586s = cVar;
            this.f326587t = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f326585r, this.f326586s, this.f326587t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f326584q;
            if (i12 == 0) {
                C42729a0.b(obj);
                w0 w0Var = this.f326585r;
                c cVar = new c(C43175k.r(new d(C22126m3.n(new a(w0Var)), w0Var, this.f326586s)));
                C10102b c10102b = new C10102b(this.f326587t);
                this.f326584q = 1;
                if (cVar.collect(c10102b, this) == coroutine_suspended) {
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

    /* compiled from: ClientsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.clients.ClientsScreenKt$ClientsScreen$3$1", f = "ClientsScreen.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$c */
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f326604q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ w0 f326605r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f326606s;

        /* compiled from: ClientsScreen.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$c$a */
        public static final class a extends N implements Y41.a<Integer> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ w0 f326607l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w0 w0Var) {
                super(0);
                this.f326607l = w0Var;
            }

            @Override // Y41.a
            public final Integer invoke() {
                androidx.compose.foundation.lazy.K k12 = (androidx.compose.foundation.lazy.K) C42745f0.G(this.f326607l.j().h());
                return Integer.valueOf(k12 != null ? k12.getF29645a() : -1);
            }
        }

        /* compiled from: ClientsScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$c$b */
        public static final class b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1<Boolean> f326608b;

            public b(InterfaceC22204y1<Boolean> interfaceC22204y1) {
                this.f326608b = interfaceC22204y1;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f326608b.setValue(bool);
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$c$c, reason: collision with other inner class name */
        public static final class C10105c implements InterfaceC43160i<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f326609b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$c$c$a */
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f326610b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.clients.ClientsScreenKt$ClientsScreen$3$1$invokeSuspend$$inlined$map$1$2", f = "ClientsScreen.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$c$c$a$a, reason: collision with other inner class name */
                public static final class C10106a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f326611q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f326612r;

                    public C10106a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f326611q = obj;
                        this.f326612r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j) {
                    this.f326610b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.virtual_deal_room_client_creation.clients.C36101l.c.C10105c.a.C10106a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.virtual_deal_room_client_creation.clients.l$c$c$a$a r0 = (com.avito.android.virtual_deal_room_client_creation.clients.C36101l.c.C10105c.a.C10106a) r0
                        int r1 = r0.f326612r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f326612r = r1
                        goto L18
                    L13:
                        com.avito.android.virtual_deal_room_client_creation.clients.l$c$c$a$a r0 = new com.avito.android.virtual_deal_room_client_creation.clients.l$c$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f326611q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f326612r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        java.lang.Number r5 = (java.lang.Number) r5
                        int r5 = r5.intValue()
                        if (r5 <= r3) goto L3e
                        r5 = r3
                        goto L3f
                    L3e:
                        r5 = 0
                    L3f:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r0.f326612r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f326610b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4e
                        return r1
                    L4e:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.clients.C36101l.c.C10105c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public C10105c(InterfaceC43160i interfaceC43160i) {
                this.f326609b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f326609b.collect(new a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w0 w0Var, InterfaceC22204y1<Boolean> interfaceC22204y1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f326605r = w0Var;
            this.f326606s = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f326605r, this.f326606s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f326604q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i interfaceC43160iR = C43175k.r(new C10105c(C22126m3.n(new a(this.f326605r))));
                b bVar = new b(this.f326606s);
                this.f326604q = 1;
                if (interfaceC43160iR.collect(bVar, this) == coroutine_suspended) {
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

    /* compiled from: ClientsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$d */
    public static final class d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<NN0.a, G0> f326614l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ NN0.c f326615m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(NN0.c cVar, Y41.l lVar) {
            super(2);
            this.f326614l = lVar;
            this.f326615m = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0291  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r41, java.lang.Integer r42) {
            /*
                Method dump skipped, instructions count: 750
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.clients.C36101l.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ClientsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$e */
    public static final class e extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f326616l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T f326617m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ w0 f326618n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC22204y1<Boolean> interfaceC22204y1, T t12, w0 w0Var) {
            super(2);
            this.f326616l = interfaceC22204y1;
            this.f326617m = t12;
            this.f326618n = w0Var;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarJ = R1.j(C20588k2.d(aVar, 1.0f), 16, 6);
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarJ);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                a13.C(1255730976);
                if (this.f326616l.getF42167b().booleanValue()) {
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    com.akita.compose.foundation.p pVar2 = com.akita.compose.theme.re23.b.f63984b.f63851H1;
                    com.akita.compose.foundation.ui.n.a(c20644z.d(C20588k2.o(aVar, 44), InterfaceC22215f.a.f39081g), androidx.compose.foundation.shape.o.f30153a, 3, pVar2, null, androidx.compose.runtime.internal.r.c(-685966448, new s(this.f326618n, this.f326617m), a13), a13, 1573248, 48);
                }
                a13.h();
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$f */
    public static final class f extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ NN0.c f326619l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ w0 f326620m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<NN0.a, G0> f326621n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(NN0.c cVar, w0 w0Var, Y41.l<? super NN0.a, G0> lVar) {
            super(3);
            this.f326619l = cVar;
            this.f326620m = w0Var;
            this.f326621n = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x014d  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r17, androidx.compose.runtime.A r18, java.lang.Integer r19) {
            /*
                Method dump skipped, instructions count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.clients.C36101l.f.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ClientsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.l$g */
    public static final class g extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ NN0.c f326622l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<NN0.a, G0> f326623m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<PN0.a, G0> f326624n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f326625o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<NN0.b> f326626p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(NN0.c cVar, Y41.l<? super NN0.a, G0> lVar, Y41.l<? super PN0.a, G0> lVar2, Y41.a<G0> aVar, InterfaceC43160i<? extends NN0.b> interfaceC43160i, int i12) {
            super(2);
            this.f326622l = cVar;
            this.f326623m = lVar;
            this.f326624n = lVar2;
            this.f326625o = aVar;
            this.f326626p = interfaceC43160i;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(32769);
            Y41.l<NN0.a, G0> lVar = this.f326623m;
            Y41.l<PN0.a, G0> lVar2 = this.f326624n;
            C36101l.a(this.f326622l, lVar, lVar2, this.f326625o, this.f326626p, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k NN0.c cVar, @Y61.k Y41.l<? super NN0.a, G0> lVar, @Y61.k Y41.l<? super PN0.a, G0> lVar2, @Y61.k Y41.a<G0> aVar, @Y61.k InterfaceC43160i<? extends NN0.b> interfaceC43160i, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1344039350);
        bE2.C(-2084072667);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22126m3.g(Boolean.FALSE);
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        bE2.X(false);
        Object objT2 = bE2.t();
        if (objT2 == c1651a) {
            objT2 = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
            bE2.H(objT2);
        }
        T t12 = (T) objT2;
        w0 w0VarA = A0.a(0, 0, 3, bE2);
        C22187u0.f(interfaceC43160i, lVar2, aVar, new a(aVar, lVar2, null, interfaceC43160i), bE2);
        bE2.C(-2084055438);
        boolean zB2 = bE2.B(w0VarA) | bE2.B(cVar) | bE2.B(lVar);
        Object objT3 = bE2.t();
        if (zB2 || objT3 == c1651a) {
            objT3 = new b(w0VarA, cVar, lVar, null);
            bE2.H(objT3);
        }
        bE2.X(false);
        C22187u0.f(w0VarA, cVar, lVar, (Y41.p) objT3, bE2);
        bE2.C(-2084040783);
        boolean zB3 = bE2.B(w0VarA);
        Object objT4 = bE2.t();
        if (zB3 || objT4 == c1651a) {
            objT4 = new c(w0VarA, interfaceC22204y1, null);
            bE2.H(objT4);
        }
        bE2.X(false);
        C22187u0.d((Y41.p) objT4, bE2, w0VarA);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar2.getClass();
        com.akita.compose.component.scaffold.g.a(W2.a(fillElement), androidx.compose.runtime.internal.r.c(489110130, new d(cVar, lVar), bE2), null, null, null, null, androidx.compose.runtime.internal.r.c(1362925901, new e(interfaceC22204y1, t12, w0VarA), bE2), androidx.compose.runtime.internal.r.c(504594953, new f(cVar, w0VarA, lVar), bE2), bE2, 14155824, 60);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(cVar, lVar, lVar2, aVar, interfaceC43160i, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r22, Y41.a r23, androidx.compose.runtime.A r24, androidx.compose.ui.v.a r25) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.clients.C36101l.b(int, Y41.a, androidx.compose.runtime.A, androidx.compose.ui.v$a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(PN0.a r28, Y41.a r29, androidx.compose.ui.v.a r30, androidx.compose.runtime.A r31, int r32) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.clients.C36101l.c(PN0.a, Y41.a, androidx.compose.ui.v$a, androidx.compose.runtime.A, int):void");
    }
}

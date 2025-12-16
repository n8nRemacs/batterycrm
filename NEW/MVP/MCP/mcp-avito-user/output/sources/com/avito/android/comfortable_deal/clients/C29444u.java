package com.avito.android.comfortable_deal.clients;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kp.C43476b;
import kp.InterfaceC43479e;

/* compiled from: ClientsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003¨\u0006\b²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "onRequestNewPage", "", "wasScrolledUp", "", "previousIndex", "previousScrollOffset", "_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.comfortable_deal.clients.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29444u {

    /* compiled from: ClientsScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.comfortable_deal.clients.u$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120378l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f120378l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.a<G0> aVar = this.f120378l;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.clients.u$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f120379l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f120380m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f120381n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f120382o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120383p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f120384q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f120385r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, androidx.compose.ui.v vVar, String str3, Y41.a<G0> aVar, int i12, int i13) {
            super(2);
            this.f120379l = str;
            this.f120380m = str2;
            this.f120381n = vVar;
            this.f120382o = str3;
            this.f120383p = aVar;
            this.f120384q = i12;
            this.f120385r = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f120384q | 1);
            androidx.compose.ui.v vVar = this.f120381n;
            String str = this.f120382o;
            C29444u.a(this.f120379l, this.f120380m, vVar, str, this.f120383p, a12, iA2, this.f120385r);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.clients.ClientsScreenKt$Clients$1$1", f = "ClientsScreen.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.comfortable_deal.clients.u$c */
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f120386q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ w0 f120387r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43479e.a f120388s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f120389t;

        /* compiled from: ClientsScreen.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.comfortable_deal.clients.u$c$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<Integer> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ w0 f120390l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w0 w0Var) {
                super(0);
                this.f120390l = w0Var;
            }

            @Override // Y41.a
            public final Integer invoke() {
                androidx.compose.foundation.lazy.K k12 = (androidx.compose.foundation.lazy.K) C42745f0.S(this.f120390l.j().h());
                return Integer.valueOf(k12 != null ? k12.getF29645a() : -1);
            }
        }

        /* compiled from: ClientsScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.clients.u$c$b */
        public static final class b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f120391b;

            public b(InterfaceC22204y1 interfaceC22204y1) {
                this.f120391b = interfaceC22204y1;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                ((Boolean) obj).getClass();
                ((Y41.a) this.f120391b.getF42167b()).invoke();
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.comfortable_deal.clients.u$c$c, reason: collision with other inner class name */
        public static final class C3535c implements InterfaceC43160i<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f120392b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.comfortable_deal.clients.u$c$c$a */
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f120393b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.comfortable_deal.clients.ClientsScreenKt$Clients$1$1$invokeSuspend$$inlined$filter$1$2", f = "ClientsScreen.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.comfortable_deal.clients.u$c$c$a$a, reason: collision with other inner class name */
                public static final class C3536a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f120394q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f120395r;

                    public C3536a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f120394q = obj;
                        this.f120395r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j) {
                    this.f120393b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.comfortable_deal.clients.C29444u.c.C3535c.a.C3536a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.comfortable_deal.clients.u$c$c$a$a r0 = (com.avito.android.comfortable_deal.clients.C29444u.c.C3535c.a.C3536a) r0
                        int r1 = r0.f120395r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f120395r = r1
                        goto L18
                    L13:
                        com.avito.android.comfortable_deal.clients.u$c$c$a$a r0 = new com.avito.android.comfortable_deal.clients.u$c$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f120394q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f120395r
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
                        r0.f120395r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f120393b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.C29444u.c.C3535c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public C3535c(InterfaceC43160i interfaceC43160i) {
                this.f120392b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f120392b.collect(new a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.comfortable_deal.clients.u$c$d */
        public static final class d implements InterfaceC43160i<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f120397b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w0 f120398c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43479e.a f120399d;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.comfortable_deal.clients.u$c$d$a */
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f120400b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w0 f120401c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43479e.a f120402d;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.comfortable_deal.clients.ClientsScreenKt$Clients$1$1$invokeSuspend$$inlined$map$1$2", f = "ClientsScreen.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.comfortable_deal.clients.u$c$d$a$a, reason: collision with other inner class name */
                public static final class C3537a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f120403q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f120404r;

                    public C3537a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f120403q = obj;
                        this.f120404r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j, w0 w0Var, InterfaceC43479e.a aVar) {
                    this.f120400b = interfaceC43172j;
                    this.f120401c = w0Var;
                    this.f120402d = aVar;
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
                        boolean r0 = r6 instanceof com.avito.android.comfortable_deal.clients.C29444u.c.d.a.C3537a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.comfortable_deal.clients.u$c$d$a$a r0 = (com.avito.android.comfortable_deal.clients.C29444u.c.d.a.C3537a) r0
                        int r1 = r0.f120404r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f120404r = r1
                        goto L18
                    L13:
                        com.avito.android.comfortable_deal.clients.u$c$d$a$a r0 = new com.avito.android.comfortable_deal.clients.u$c$d$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f120403q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f120404r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L60
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        java.lang.Number r5 = (java.lang.Number) r5
                        int r5 = r5.intValue()
                        androidx.compose.foundation.lazy.w0 r6 = r4.f120401c
                        androidx.compose.foundation.lazy.Y r6 = r6.j()
                        int r6 = r6.getF28948n()
                        int r6 = r6 + (-3)
                        kp.e$a r2 = r4.f120402d
                        boolean r2 = r2.f413198c
                        if (r2 == 0) goto L50
                        if (r5 < r6) goto L50
                        r5 = r3
                        goto L51
                    L50:
                        r5 = 0
                    L51:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r0.f120404r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f120400b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L60
                        return r1
                    L60:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.C29444u.c.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public d(InterfaceC43160i interfaceC43160i, w0 w0Var, InterfaceC43479e.a aVar) {
                this.f120397b = interfaceC43160i;
                this.f120398c = w0Var;
                this.f120399d = aVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f120397b.collect(new a(interfaceC43172j, this.f120398c, this.f120399d), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w0 w0Var, InterfaceC43479e.a aVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f120387r = w0Var;
            this.f120388s = aVar;
            this.f120389t = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f120387r, this.f120388s, this.f120389t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f120386q;
            if (i12 == 0) {
                C42729a0.b(obj);
                w0 w0Var = this.f120387r;
                C3535c c3535c = new C3535c(C43175k.r(new d(C22126m3.n(new a(w0Var)), w0Var, this.f120388s)));
                b bVar = new b(this.f120389t);
                this.f120386q = 1;
                if (c3535c.collect(bVar, this) == coroutine_suspended) {
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
    /* renamed from: com.avito.android.comfortable_deal.clients.u$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ w0 f120406l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43479e.a f120407m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ClientCardData, G0> f120408n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120409o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C43476b f120410p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f120411q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(w0 w0Var, InterfaceC43479e.a aVar, Y41.l<? super ClientCardData, G0> lVar, Y41.a<G0> aVar2, C43476b c43476b, Y41.l<? super DeepLink, G0> lVar2) {
            super(2);
            this.f120406l = w0Var;
            this.f120407m = aVar;
            this.f120408n = lVar;
            this.f120409o = aVar2;
            this.f120410p = c43476b;
            this.f120411q = lVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0188  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r22, java.lang.Integer r23) {
            /*
                Method dump skipped, instructions count: 495
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.C29444u.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ClientsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.clients.u$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43479e.a f120412l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C43476b f120413m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120414n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120415o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ClientCardData, G0> f120416p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f120417q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f120418r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(InterfaceC43479e.a aVar, C43476b c43476b, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.l<? super ClientCardData, G0> lVar, Y41.l<? super DeepLink, G0> lVar2, int i12) {
            super(2);
            this.f120412l = aVar;
            this.f120413m = c43476b;
            this.f120414n = aVar2;
            this.f120415o = aVar3;
            this.f120416p = lVar;
            this.f120417q = lVar2;
            this.f120418r = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f120418r | 1);
            Y41.l<ClientCardData, G0> lVar = this.f120416p;
            Y41.l<DeepLink, G0> lVar2 = this.f120417q;
            C29444u.c(this.f120412l, this.f120413m, this.f120414n, this.f120415o, lVar, lVar2, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.comfortable_deal.clients.u$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120419l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f120420m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120421n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar, Y41.a aVar2, boolean z12) {
            super(3);
            this.f120419l = aVar;
            this.f120420m = z12;
            this.f120421n = aVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01dc  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J r22, androidx.compose.runtime.A r23, java.lang.Integer r24) {
            /*
                Method dump skipped, instructions count: 521
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.C29444u.f.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ClientsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.clients.u$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f120422l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120423m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120424n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z12, Y41.a<G0> aVar, Y41.a<G0> aVar2, int i12) {
            super(2);
            this.f120422l = z12;
            this.f120423m = aVar;
            this.f120424n = aVar2;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            Y41.a<G0> aVar = this.f120424n;
            C29444u.e(this.f120422l, this.f120423m, aVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.comfortable_deal.clients.u$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f120425l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f120426m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.l lVar, boolean z12) {
            super(3);
            this.f120425l = z12;
            this.f120426m = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0128  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J r18, androidx.compose.runtime.A r19, java.lang.Integer r20) {
            /*
                Method dump skipped, instructions count: 323
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.C29444u.h.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ClientsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.clients.u$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f120427l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f120428m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f120429n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i12, Y41.a aVar, Y41.l lVar, boolean z12) {
            super(2);
            this.f120427l = z12;
            this.f120428m = aVar;
            this.f120429n = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            Y41.l<Boolean, G0> lVar = this.f120429n;
            boolean z12 = this.f120427l;
            C29444u.f(iA2, this.f120428m, lVar, a12, z12);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r30, java.lang.String r31, androidx.compose.ui.v r32, java.lang.String r33, Y41.a<kotlin.G0> r34, androidx.compose.runtime.A r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.C29444u.a(java.lang.String, java.lang.String, androidx.compose.ui.v, java.lang.String, Y41.a, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.foundation.layout.C20644z r17, kp.C43476b r18, Y41.l r19, androidx.compose.ui.v.a r20, androidx.compose.runtime.A r21, int r22) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.C29444u.b(androidx.compose.foundation.layout.z, kp.b, Y41.l, androidx.compose.ui.v$a, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(kp.InterfaceC43479e.a r16, kp.C43476b r17, Y41.a<kotlin.G0> r18, Y41.a<kotlin.G0> r19, Y41.l<? super com.avito.android.comfortable_deal.common.view.client.ClientCardData, kotlin.G0> r20, Y41.l<? super com.avito.android.deep_linking.links.DeepLink, kotlin.G0> r21, androidx.compose.runtime.A r22, int r23) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.C29444u.c(kp.e$a, kp.b, Y41.a, Y41.a, Y41.l, Y41.l, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d9  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@Y61.k kp.C43481g r31, @Y61.k Y41.a r32, @Y61.k Y41.l r33, @Y61.k Y41.l r34, @Y61.k Y41.a r35, @Y61.k Y41.a r36, @Y61.k Y41.l r37, @Y61.k Y41.l r38, @Y61.k Y41.a r39, @Y61.k Y41.l r40, @Y61.k Y41.a r41, @Y61.k Y41.l r42, @Y61.k Y41.l r43, @Y61.k Y41.l r44, @Y61.l androidx.compose.runtime.A r45, int r46) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.C29444u.d(kp.g, Y41.a, Y41.l, Y41.l, Y41.a, Y41.a, Y41.l, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.l, Y41.l, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void e(boolean z12, Y41.a<G0> aVar, Y41.a<G0> aVar2, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(1170694761);
        int i13 = i12 | (bE2.j(z12) ? 4 : 2) | (bE2.u(aVar) ? 32 : 16) | (bE2.u(aVar2) ? 256 : 128);
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            b12 = bE2;
            com.akita.compose.component.bottom_sheet.H.a(aVar, null, null, null, null, null, null, false, false, null, null, null, androidx.compose.runtime.internal.r.c(283108681, new f(aVar2, aVar, z12), bE2), b12, (i13 >> 3) & 14, 384, 4094);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(z12, aVar, aVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void f(int i12, Y41.a aVar, Y41.l lVar, androidx.compose.runtime.A a12, boolean z12) {
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-627258819);
        int i13 = (bE2.j(z12) ? 4 : 2) | i12 | (bE2.u(aVar) ? 32 : 16) | (bE2.u(lVar) ? 256 : 128);
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            b12 = bE2;
            com.akita.compose.component.bottom_sheet.H.a(aVar, null, null, null, null, null, null, false, false, null, null, null, androidx.compose.runtime.internal.r.c(-1716636835, new h(lVar, z12), bE2), b12, (i13 >> 3) & 14, 384, 4094);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(i12, aVar, lVar, z12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void g(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1183270243);
        if ((i12 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
            com.avito.android.comfortable_deal.common.view.client.e.b(false, bE2, 0);
            float f12 = 24;
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            com.avito.android.comfortable_deal.common.view.client.e.b(false, bE2, 0);
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            com.avito.android.comfortable_deal.common.view.client.e.b(false, bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h0(vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(int r11, Y41.a r12, androidx.compose.runtime.A r13, java.lang.String r14, boolean r15) {
        /*
            r0 = -525844295(0xffffffffe0a840b9, float:-9.699115E19)
            androidx.compose.runtime.B r13 = r13.E(r0)
            r0 = r11 & 14
            if (r0 != 0) goto L16
            boolean r0 = r13.B(r14)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r11
            goto L17
        L16:
            r0 = r11
        L17:
            r1 = r11 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L27
            boolean r1 = r13.j(r15)
            if (r1 == 0) goto L24
            r1 = 32
            goto L26
        L24:
            r1 = 16
        L26:
            r0 = r0 | r1
        L27:
            r1 = r11 & 896(0x380, float:1.256E-42)
            r2 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L38
            boolean r1 = r13.u(r12)
            if (r1 == 0) goto L35
            r1 = r2
            goto L37
        L35:
            r1 = 128(0x80, float:1.8E-43)
        L37:
            r0 = r0 | r1
        L38:
            r1 = r0 & 731(0x2db, float:1.024E-42)
            r3 = 146(0x92, float:2.05E-43)
            if (r1 != r3) goto L49
            boolean r1 = r13.c()
            if (r1 != 0) goto L45
            goto L49
        L45:
            r13.f()
            goto L96
        L49:
            com.akita.compose.theme.re23.b r1 = com.akita.compose.theme.re23.b.f63983a
            com.akita.compose.component.list_item.s r3 = com.avito.android.bxcontent.mvi.entity.f.g(r1, r13)
            androidx.compose.ui.v$a r1 = androidx.compose.ui.v.f42878y1
            r4 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.v r5 = androidx.compose.foundation.layout.C20588k2.d(r1, r4)
            r1 = -996527436(0xffffffffc49a32b4, float:-1233.5845)
            r13.C(r1)
            r1 = r0 & 896(0x380, float:1.256E-42)
            r4 = 0
            if (r1 != r2) goto L64
            r1 = 1
            goto L65
        L64:
            r1 = r4
        L65:
            java.lang.Object r2 = r13.t()
            if (r1 != 0) goto L74
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L7c
        L74:
            com.avito.android.comfortable_deal.clients.x r2 = new com.avito.android.comfortable_deal.clients.x
            r2.<init>(r12)
            r13.H(r2)
        L7c:
            r9 = r2
            Y41.a r9 = (Y41.a) r9
            r13.X(r4)
            r6 = 0
            r10 = 7
            r7 = 0
            r8 = 0
            androidx.compose.ui.v r4 = androidx.compose.foundation.C21086w0.c(r5, r6, r7, r8, r9, r10)
            r8 = r0 & 126(0x7e, float:1.77E-43)
            r6 = 0
            r9 = 48
            r5 = 0
            r1 = r14
            r2 = r15
            r7 = r13
            com.akita.compose.component.list_item.h.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L96:
            androidx.compose.runtime.c2 r13 = r13.Z()
            if (r13 == 0) goto La3
            com.avito.android.comfortable_deal.clients.y r0 = new com.avito.android.comfortable_deal.clients.y
            r0.<init>(r11, r12, r14, r15)
            r13.f38184d = r0
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.C29444u.h(int, Y41.a, androidx.compose.runtime.A, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(kp.InterfaceC43479e r20, kp.C43476b r21, Y41.a r22, Y41.l r23, Y41.a r24, Y41.l r25, Y41.l r26, androidx.compose.runtime.A r27, int r28) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.C29444u.i(kp.e, kp.b, Y41.a, Y41.l, Y41.a, Y41.l, Y41.l, androidx.compose.runtime.A, int):void");
    }
}

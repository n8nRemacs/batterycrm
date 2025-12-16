package com.avito.android.delivery_tarifikator.presentation.main_screen.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.delivery_tarifikator.domain.J;
import com.avito.android.delivery_tarifikator.domain.N;
import com.avito.android.delivery_tarifikator.domain.O;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;

/* compiled from: TariffEditorHandler.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/domain/b;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/domain/a;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Sv.h
/* loaded from: classes12.dex */
public final class b implements com.avito.android.delivery_tarifikator.presentation.main_screen.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f135558a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final J f135559b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final O f135560c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC43160i<N> f135561d;

    /* compiled from: TariffEditorHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/domain/b$a;", "", "<init>", "()V", "", "CUSTOM_TARIFF_EDITOR_DEEPLINK_REQUEST_KEY", "Ljava/lang/String;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b$b, reason: collision with other inner class name */
    public static final class C4101b implements InterfaceC43160i<C43501a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f135562b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b$b$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f135563b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.domain.TariffEditorHandlerImpl$special$$inlined$filter$1$2", f = "TariffEditorHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b$b$a$a, reason: collision with other inner class name */
            public static final class C4102a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f135564q;

                /* renamed from: r, reason: collision with root package name */
                public int f135565r;

                public C4102a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f135564q = obj;
                    this.f135565r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f135563b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b.C4101b.a.C4102a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b$b$a$a r0 = (com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b.C4101b.a.C4102a) r0
                    int r1 = r0.f135565r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135565r = r1
                    goto L18
                L13:
                    com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b$b$a$a r0 = new com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f135564q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f135565r
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
                    r6 = r5
                    kv.a r6 = (kv.C43501a) r6
                    com.avito.android.deeplink_handler.handler.bundle.a r6 = r6.f413260a
                    java.lang.String r2 = "tarifikator.custom_tariff.editor.request.key"
                    java.lang.String r6 = r6.f134521b
                    boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                    if (r6 == 0) goto L4e
                    r0.f135565r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f135563b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b.C4101b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C4101b(InterfaceC43160i interfaceC43160i) {
            this.f135562b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C43501a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f135562b).collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.domain.TariffEditorHandlerImpl$special$$inlined$transform$1", f = "TariffEditorHandler.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super N>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f135567q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f135568r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C4101b f135569s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f135570t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<N> f135571b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f135572c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.domain.TariffEditorHandlerImpl$special$$inlined$transform$1$1", f = "TariffEditorHandler.kt", i = {}, l = {220}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b$c$a$a, reason: collision with other inner class name */
            public static final class C4103a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f135573q;

                /* renamed from: r, reason: collision with root package name */
                public int f135574r;

                public C4103a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f135573q = obj;
                    this.f135574r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, b bVar) {
                this.f135572c = bVar;
                this.f135571b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b.c.a.C4103a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b$c$a$a r0 = (com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b.c.a.C4103a) r0
                    int r1 = r0.f135574r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135574r = r1
                    goto L18
                L13:
                    com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b$c$a$a r0 = new com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f135573q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f135574r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    kv.a r5 = (kv.C43501a) r5
                    com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b r6 = r4.f135572c
                    com.avito.android.delivery_tarifikator.domain.O r6 = r6.f135560c
                    Ju.c r5 = r5.f413261b
                    com.avito.android.delivery_tarifikator.domain.N r5 = r6.a(r5)
                    r0.f135574r = r3
                    kotlinx.coroutines.flow.j<com.avito.android.delivery_tarifikator.domain.N> r6 = r4.f135571b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_tarifikator.presentation.main_screen.domain.b.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4101b c4101b, Continuation continuation, b bVar) {
            super(2, continuation);
            this.f135569s = c4101b;
            this.f135570t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(this.f135569s, continuation, this.f135570t);
            cVar.f135568r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super N> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f135567q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f135568r, this.f135570t);
                this.f135567q = 1;
                if (this.f135569s.collect(aVar, this) == coroutine_suspended) {
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

    static {
        new a(null);
    }

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k J j12, @k O o12) {
        this.f135558a = aVar;
        this.f135559b = j12;
        this.f135560c = o12;
        this.f135561d = C43175k.G(new c(new C4101b(y.a(aVar.d9())), null, this));
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.domain.a
    public final void a(long j12) {
        BeduinUniversalPageLink beduinUniversalPageLinkC = this.f135559b.c(j12);
        if (beduinUniversalPageLinkC != null) {
            b.a.a(this.f135558a, beduinUniversalPageLinkC, "tarifikator.custom_tariff.editor.request.key", null, 4);
        }
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.domain.a
    @k
    public final InterfaceC43160i<N> b() {
        return this.f135561d;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.domain.a
    public final void c() {
        BeduinUniversalPageLink beduinUniversalPageLinkB = this.f135559b.b();
        if (beduinUniversalPageLinkB != null) {
            b.a.a(this.f135558a, beduinUniversalPageLinkB, "tarifikator.custom_tariff.editor.request.key", null, 4);
        }
    }
}

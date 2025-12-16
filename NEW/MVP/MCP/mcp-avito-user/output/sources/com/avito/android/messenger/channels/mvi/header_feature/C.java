package com.avito.android.messenger.channels.mvi.header_feature;

import androidx.compose.runtime.internal.P;
import com.avito.android.C30277e1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.messenger.channels.mvi.interactor.InterfaceC31763a;
import com.avito.android.messenger.channels.mvi.interactor.InterfaceC31766d;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.messenger.w0;
import com.avito.android.util.R0;
import hz.InterfaceC41196a;
import iz.C42140a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsHeaderBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/header_feature/C;", "Lcom/avito/android/arch/mvi/b;", "LFY/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class C implements com.avito.android.arch.mvi.b<FY.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w0 f187460a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f187461b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31766d f187462c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.blacklist_reasons.y f187463d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final cZ.b f187464e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32208e f187465f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31763a f187466g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f187467h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final R0 f187468i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f187469j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.filter.j f187470k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final JY.a f187471l;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<MessengerUserHashInfo> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f187472b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.channels.mvi.header_feature.C$a$a, reason: collision with other inner class name */
        public static final class C5493a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f187473b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderBootstrap$userInfoChangesFlow$$inlined$filter$1$2", f = "ChannelsHeaderBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.messenger.channels.mvi.header_feature.C$a$a$a, reason: collision with other inner class name */
            public static final class C5494a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f187474q;

                /* renamed from: r, reason: collision with root package name */
                public int f187475r;

                public C5494a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f187474q = obj;
                    this.f187475r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C5493a.this.emit(null, this);
                }
            }

            public C5493a(InterfaceC43172j interfaceC43172j) {
                this.f187473b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.messenger.channels.mvi.header_feature.C.a.C5493a.C5494a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.messenger.channels.mvi.header_feature.C$a$a$a r0 = (com.avito.android.messenger.channels.mvi.header_feature.C.a.C5493a.C5494a) r0
                    int r1 = r0.f187475r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f187475r = r1
                    goto L18
                L13:
                    com.avito.android.messenger.channels.mvi.header_feature.C$a$a$a r0 = new com.avito.android.messenger.channels.mvi.header_feature.C$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f187474q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f187475r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    ru.avito.messenger.MessengerUserHashInfo r6 = (ru.avito.messenger.MessengerUserHashInfo) r6
                    java.lang.String r6 = r6.f430682d
                    boolean r6 = ru.avito.messenger.o0.a(r6)
                    if (r6 == 0) goto L4a
                    r0.f187475r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f187473b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.header_feature.C.a.C5493a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f187472b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super MessengerUserHashInfo> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f187472b).collect(new C5493a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public C(@Y61.k w0 w0Var, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC31766d interfaceC31766d, @Y61.k com.avito.android.messenger.blacklist_reasons.y yVar, @Y61.k cZ.b bVar, @Y61.k InterfaceC32208e interfaceC32208e, @Y61.k InterfaceC31763a interfaceC31763a, @Y61.k C30277e1 c30277e1, @Y61.k R0 r02, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k com.avito.android.messenger.channels.filter.j jVar, @Y61.k JY.a aVar) {
        this.f187460a = w0Var;
        this.f187461b = interfaceC47842z;
        this.f187462c = interfaceC31766d;
        this.f187463d = yVar;
        this.f187464e = bVar;
        this.f187465f = interfaceC32208e;
        this.f187466g = interfaceC31763a;
        this.f187467h = c30277e1;
        this.f187468i = r02;
        this.f187469j = interfaceC41196a;
        this.f187470k = jVar;
        this.f187471l = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<FY.b> a() {
        InterfaceC43160i interfaceC43160iW;
        JY.a aVar = this.f187471l;
        boolean zI2 = aVar.i();
        R0 r02 = this.f187468i;
        InterfaceC43160i interfaceC43160iI = zI2 ? C43175k.I(r02.a(), new C43152f0(new C31758j(C43175k.Y(c(), new C31757i(null, this))), new C31759k(3, null))) : C43175k.w();
        boolean zA2 = aVar.a();
        InterfaceC47842z interfaceC47842z = this.f187461b;
        InterfaceC43160i interfaceC43160iI2 = zA2 ? C43175k.I(r02.a(), new C43152f0(C43175k.Y(C43175k.N(new s(c()), new t(kotlinx.coroutines.rx3.y.a(interfaceC47842z.A()))), new r(null, this)), new v(3, null))) : C43175k.w();
        InterfaceC43160i interfaceC43160iI3 = aVar.a() ? C43175k.I(r02.c(), new q(C43175k.r(new p(kotlinx.coroutines.rx3.y.a(this.f187465f.M0()))))) : C43175k.w();
        if (aVar.n()) {
            C30277e1 c30277e1 = this.f187467h;
            c30277e1.getClass();
            kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[88];
            interfaceC43160iW = ((Boolean) c30277e1.f144964I0.a().invoke()).booleanValue() ? C43175k.I(r02.a(), new C43152f0(new C31762n(C43175k.Y(c(), new C31761m(null, this))), new o(3, null))) : C43175k.w();
        } else {
            interfaceC43160iW = C43175k.w();
        }
        InterfaceC43160i interfaceC43160iI4 = C43175k.I(r02.c(), new x(new C43152f0(C43175k.r(kotlinx.coroutines.rx3.y.a(interfaceC47842z.state())), new y(3, null))));
        InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(this.f187462c.I1());
        e.a aVar2 = kotlin.time.e.f410651c;
        return C43175k.N(interfaceC43160iI4, interfaceC43160iI, interfaceC43160iI2, interfaceC43160iI3, interfaceC43160iW, C43175k.I(r02.c(), new z(new C43152f0(com.avito.android.arch.mvi.utils.h.f(interfaceC43160iA, kotlin.time.g.h(2000L, DurationUnit.f410633e)), new A(3, null)))), C43175k.I(r02.c(), C43175k.G(new B(kotlinx.coroutines.rx3.y.a(this.f187463d.g7()), null))), C43175k.G(new C31760l(this.f187469j.g(new C42140a(false, false, 3, null)), null, this)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }

    public final InterfaceC43160i<MessengerUserHashInfo> c() {
        return C43175k.r(new a(kotlinx.coroutines.rx3.y.a(this.f187460a.g())));
    }
}

package com.avito.android.user_adverts.root_screen.adverts_host;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListParams;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class S implements InterfaceC43160i<UserAdvertsListParams.ShortcutInfo> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f312276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f312277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f312278d;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f312279b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ P f312280c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f312281d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostListParamsProvider$provideShortcutInfo$$inlined$mapNotNull$1$2", f = "UserAdvertsHostListParamsProvider.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.S$a$a, reason: collision with other inner class name */
        public static final class C9533a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f312282q;

            /* renamed from: r, reason: collision with root package name */
            public int f312283r;

            public C9533a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f312282q = obj;
                this.f312283r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, P p12, String str) {
            this.f312279b = interfaceC43172j;
            this.f312280c = p12;
            this.f312281d = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r11, @Y61.k kotlin.coroutines.Continuation r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof com.avito.android.user_adverts.root_screen.adverts_host.S.a.C9533a
                if (r0 == 0) goto L13
                r0 = r12
                com.avito.android.user_adverts.root_screen.adverts_host.S$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.S.a.C9533a) r0
                int r1 = r0.f312283r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f312283r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.root_screen.adverts_host.S$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.S$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f312282q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f312283r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r12)
                goto L92
            L2a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L32:
                kotlin.C42729a0.b(r12)
                TI0.c r11 = (TI0.c) r11
                com.avito.android.user_adverts.root_screen.adverts_host.P r12 = r10.f312280c
                r12.getClass()
                java.util.List<TI0.c$a> r12 = r11.f15557f
                java.util.Iterator r12 = r12.iterator()
                r2 = 0
                r5 = r2
            L44:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto L84
                int r4 = r5 + 1
                java.lang.Object r6 = r12.next()
                TI0.c$a r6 = (TI0.c.a) r6
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts$Shortcut r7 = r6.f15564c
                java.lang.String r7 = r7.f313853c
                java.lang.String r8 = r10.f312281d
                boolean r7 = kotlin.jvm.internal.L.f(r7, r8)
                if (r7 == 0) goto L82
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$ShortcutInfo r12 = new com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$ShortcutInfo
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts$Shortcut r4 = r6.f15564c
                int r7 = r4.f313852b
                UI0.a r11 = r11.f15555d
                boolean r8 = r11.f16332c
                if (r8 == 0) goto L76
                java.lang.String r11 = r11.f16330a
                java.lang.String r4 = r4.f313853c
                boolean r11 = kotlin.jvm.internal.L.f(r11, r4)
                if (r11 == 0) goto L76
                r9 = r3
                goto L77
            L76:
                r9 = r2
            L77:
                java.lang.String r11 = r6.f15562a
                java.lang.String r8 = r6.f15563b
                r4 = r12
                r6 = r7
                r7 = r11
                r4.<init>(r5, r6, r7, r8, r9)
                goto L85
            L82:
                r5 = r4
                goto L44
            L84:
                r12 = 0
            L85:
                if (r12 == 0) goto L92
                r0.f312283r = r3
                kotlinx.coroutines.flow.j r11 = r10.f312279b
                java.lang.Object r11 = r11.emit(r12, r0)
                if (r11 != r1) goto L92
                return r1
            L92:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.S.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public S(n2 n2Var, P p12, String str) {
        this.f312276b = n2Var;
        this.f312277c = p12;
        this.f312278d = str;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super UserAdvertsListParams.ShortcutInfo> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f312276b.collect(new a(interfaceC43172j, this.f312277c, this.f312278d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

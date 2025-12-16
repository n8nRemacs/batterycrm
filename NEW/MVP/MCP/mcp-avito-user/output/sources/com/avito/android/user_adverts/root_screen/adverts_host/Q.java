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
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Q implements InterfaceC43160i<UserAdvertsListParams.SearchInfo> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f312269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f312270c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f312271b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ P f312272c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostListParamsProvider$provideSearchInfo$$inlined$map$1$2", f = "UserAdvertsHostListParamsProvider.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.Q$a$a, reason: collision with other inner class name */
        public static final class C9532a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f312273q;

            /* renamed from: r, reason: collision with root package name */
            public int f312274r;

            public C9532a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f312273q = obj;
                this.f312274r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, P p12) {
            this.f312271b = interfaceC43172j;
            this.f312272c = p12;
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
                boolean r0 = r12 instanceof com.avito.android.user_adverts.root_screen.adverts_host.Q.a.C9532a
                if (r0 == 0) goto L13
                r0 = r12
                com.avito.android.user_adverts.root_screen.adverts_host.Q$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.Q.a.C9532a) r0
                int r1 = r0.f312274r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f312274r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.root_screen.adverts_host.Q$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.Q$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f312273q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f312274r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r12)
                goto L98
            L2a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L32:
                kotlin.C42729a0.b(r12)
                BI0.d r11 = (BI0.d) r11
                com.avito.android.user_adverts.root_screen.adverts_host.P r12 = r10.f312272c
                r12.getClass()
                boolean r12 = r11 instanceof BI0.d.b
                if (r12 == 0) goto L42
                r12 = r3
                goto L44
            L42:
                boolean r12 = r11 instanceof BI0.d.c
            L44:
                if (r12 == 0) goto L5f
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$SearchInfo$a r11 = com.avito.android.user_adverts.tab_screens.UserAdvertsListParams.SearchInfo.f314699g
                r11.getClass()
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$SearchInfo r11 = new com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$SearchInfo
                java.util.Map r7 = kotlin.collections.P0.c()
                java.util.Map r8 = kotlin.collections.P0.c()
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$SearchInfo$StartType r9 = com.avito.android.user_adverts.tab_screens.UserAdvertsListParams.SearchInfo.StartType.f314705b
                java.lang.String r5 = ""
                r6 = 0
                r4 = r11
                r4.<init>(r5, r6, r7, r8, r9)
                goto L8d
            L5f:
                boolean r12 = r11 instanceof BI0.d.C0052d
                if (r12 == 0) goto L9b
                BI0.d$d r11 = (BI0.d.C0052d) r11
                BI0.d$e r11 = r11.f1334k
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$SearchInfo r12 = new com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$SearchInfo
                java.lang.String r5 = r11.f1342a
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.UserAdvertsSearchStartFromType r2 = r11.f1346e
                int r2 = r2.ordinal()
                if (r2 == 0) goto L7f
                if (r2 != r3) goto L79
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$SearchInfo$StartType r2 = com.avito.android.user_adverts.tab_screens.UserAdvertsListParams.SearchInfo.StartType.f314706c
            L77:
                r9 = r2
                goto L82
            L79:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            L7f:
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$SearchInfo$StartType r2 = com.avito.android.user_adverts.tab_screens.UserAdvertsListParams.SearchInfo.StartType.f314705b
                goto L77
            L82:
                boolean r6 = r11.f1343b
                java.util.Map<java.lang.String, java.lang.Object> r7 = r11.f1344c
                java.util.Map<java.lang.String, java.lang.Object> r8 = r11.f1345d
                r4 = r12
                r4.<init>(r5, r6, r7, r8, r9)
                r11 = r12
            L8d:
                r0.f312274r = r3
                kotlinx.coroutines.flow.j r12 = r10.f312271b
                java.lang.Object r11 = r12.emit(r11, r0)
                if (r11 != r1) goto L98
                return r1
            L98:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            L9b:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.Q.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public Q(n2 n2Var, P p12) {
        this.f312269b = n2Var;
        this.f312270c = p12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super UserAdvertsListParams.SearchInfo> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f312269b.collect(new a(interfaceC43172j, this.f312270c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

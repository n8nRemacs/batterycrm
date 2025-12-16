package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a;
import fJ0.InterfaceC40301a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35690v implements InterfaceC43160i<InterfaceC40301a.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35688t f315500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C35670a.b f315501c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C35670a f315502d;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.v$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f315503b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C35670a.b f315504c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C35670a f315505d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processParamsAction$$inlined$map$2$2", f = "UserAdvertsListActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.v$a$a, reason: collision with other inner class name */
        public static final class C9772a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f315506q;

            /* renamed from: r, reason: collision with root package name */
            public int f315507r;

            public C9772a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f315506q = obj;
                this.f315507r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C35670a.b bVar, C35670a c35670a) {
            this.f315503b = interfaceC43172j;
            this.f315504c = bVar;
            this.f315505d = c35670a;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.C35690v.a.C9772a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.user_adverts.tab_screens.adverts.mvi.v$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35690v.a.C9772a) r0
                int r1 = r0.f315507r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f315507r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_screens.adverts.mvi.v$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.v$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f315506q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f315507r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r8)
                goto Lb2
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L32:
                kotlin.C42729a0.b(r8)
                com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b$a$c r7 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.b.InterfaceC9754a.c) r7
                com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b r8 = r6.f315504c
                com.avito.android.arch.mvi.utils.o r8 = r8.f315281b
                com.avito.android.arch.mvi.utils.o$a r2 = r8.f92114c
                java.lang.Object r2 = r2.getValue()
                com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b$a r2 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.b.InterfaceC9754a) r2
                boolean r4 = r2 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.b.InterfaceC9754a.c
                r5 = 0
                if (r4 == 0) goto L4b
                com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b$a$c r2 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.b.InterfaceC9754a.c) r2
                goto L4c
            L4b:
                r2 = r5
            L4c:
                if (r2 == 0) goto L50
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams r5 = r2.f315285b
            L50:
                kotlinx.coroutines.flow.Z1<ValueT> r8 = r8.f92113b
            L52:
                java.lang.Object r2 = r8.getValue()
                r4 = r2
                com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b$a r4 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.b.InterfaceC9754a) r4
                boolean r2 = r8.N3(r2, r7)
                if (r2 == 0) goto L52
                if (r5 == 0) goto La5
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams r7 = r7.f315285b
                int r8 = com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.f315271j
                com.avito.android.user_adverts.tab_screens.adverts.mvi.a r8 = r6.f315505d
                r8.getClass()
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$UserInfo r8 = r7.f314697c
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$UserInfo r2 = r5.f314697c
                boolean r8 = kotlin.jvm.internal.L.f(r8, r2)
                if (r8 == 0) goto La5
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$SearchInfo r8 = r7.f314698d
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$SearchInfo r2 = r5.f314698d
                boolean r8 = kotlin.jvm.internal.L.f(r8, r2)
                if (r8 == 0) goto La5
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$ShortcutInfo r7 = r7.f314696b
                java.lang.String r8 = r7.f314709b
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$ShortcutInfo r2 = r5.f314696b
                java.lang.String r4 = r2.f314709b
                boolean r8 = kotlin.jvm.internal.L.f(r8, r4)
                if (r8 == 0) goto La5
                int r8 = r7.f314711d
                int r4 = r2.f314711d
                if (r8 != r4) goto La5
                int r8 = r7.f314712e
                int r4 = r2.f314712e
                if (r8 != r4) goto La5
                java.lang.String r7 = r7.f314710c
                java.lang.String r8 = r2.f314710c
                boolean r7 = kotlin.jvm.internal.L.f(r7, r8)
                if (r7 != 0) goto La5
                fJ0.a$b$d r7 = fJ0.InterfaceC40301a.b.d.f395817a
                goto La7
            La5:
                fJ0.a$b$e r7 = fJ0.InterfaceC40301a.b.e.f395818a
            La7:
                r0.f315507r = r3
                kotlinx.coroutines.flow.j r8 = r6.f315503b
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto Lb2
                return r1
            Lb2:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.mvi.C35690v.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C35690v(C35688t c35688t, C35670a.b bVar, C35670a c35670a) {
        this.f315500b = c35688t;
        this.f315501c = bVar;
        this.f315502d = c35670a;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC40301a.b> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f315500b.collect(new a(interfaceC43172j, this.f315501c, this.f315502d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

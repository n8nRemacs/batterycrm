package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class A implements InterfaceC43160i<ShortcutsInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1 f313865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TI0.c f313866c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f313867b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TI0.c f313868c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$processRefresh$$inlined$map$1$2", f = "ShortcutsActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.A$a$a, reason: collision with other inner class name */
        public static final class C9660a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f313869q;

            /* renamed from: r, reason: collision with root package name */
            public int f313870r;

            public C9660a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f313869q = obj;
                this.f313870r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, TI0.c cVar) {
            this.f313867b = interfaceC43172j;
            this.f313868c = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.A.a.C9660a
                if (r0 == 0) goto L13
                r0 = r9
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.A$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.A.a.C9660a) r0
                int r1 = r0.f313870r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f313870r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.A$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.A$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f313869q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f313870r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r9)
                goto Lbd
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L32:
                kotlin.C42729a0.b(r9)
                kotlin.Q r8 = (kotlin.Q) r8
                A r9 = r8.f406619b
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                B r8 = r8.f406620c
                UI0.c r8 = (UI0.c) r8
                boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto L53
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction$RefreshError r8 = new com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction$RefreshError
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r2 = r9.getError()
                java.lang.Throwable r9 = r9.getCause()
                r8.<init>(r2, r9)
                goto Lb2
            L53:
                boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r2 == 0) goto Lc0
                TI0.c r2 = r7.f313868c
                java.util.List<TI0.c$a> r4 = r2.f15557f
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.C42745f0.q(r4, r6)
                r5.<init>(r6)
                java.util.Iterator r4 = r4.iterator()
            L6c:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L7e
                java.lang.Object r6 = r4.next()
                TI0.c$a r6 = (TI0.c.a) r6
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts$Shortcut r6 = r6.f15564c
                r5.add(r6)
                goto L6c
            L7e:
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r4 = r9.getResult()
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts r4 = (com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts) r4
                java.util.ArrayList r4 = r4.f313851b
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto La5
                UI0.c r4 = r2.f15553b
                boolean r4 = kotlin.jvm.internal.L.f(r8, r4)
                if (r4 != 0) goto L97
                goto La5
            L97:
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction$RefreshResult r8 = new com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction$RefreshResult
                java.lang.Object r9 = r9.getResult()
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts r9 = (com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts) r9
                UI0.a r2 = r2.f15555d
                r8.<init>(r2, r9)
                goto Lb2
            La5:
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction$LoadingResult r2 = new com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction$LoadingResult
                java.lang.Object r9 = r9.getResult()
                com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts r9 = (com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts) r9
                r4 = 0
                r2.<init>(r9, r4, r8)
                r8 = r2
            Lb2:
                r0.f313870r = r3
                kotlinx.coroutines.flow.j r9 = r7.f313867b
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto Lbd
                return r1
            Lbd:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            Lc0:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.A.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public A(C1 c12, TI0.c cVar) {
        this.f313865b = c12;
        this.f313866c = cVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super ShortcutsInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f313865b.collect(new a(interfaceC43172j, this.f313866c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

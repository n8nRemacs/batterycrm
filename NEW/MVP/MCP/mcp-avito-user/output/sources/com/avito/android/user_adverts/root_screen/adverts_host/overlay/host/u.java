package com.avito.android.user_adverts.root_screen.adverts_host.overlay.host;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
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
public final class u implements InterfaceC43160i<EI0.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f313235b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f313236b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.PanelSoaOverlayKt$queueOverlay$$inlined$map$1$2", f = "PanelSoaOverlay.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.u$a$a, reason: collision with other inner class name */
        public static final class C9612a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f313237q;

            /* renamed from: r, reason: collision with root package name */
            public int f313238r;

            public C9612a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f313237q = obj;
                this.f313238r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f313236b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                boolean r0 = r6 instanceof com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.u.a.C9612a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.u$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.u.a.C9612a) r0
                int r1 = r0.f313238r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f313238r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.u$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.u$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f313237q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f313238r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L6e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                MI0.d r5 = (MI0.d) r5
                MI0.d$a r5 = r5.f10579c
                boolean r6 = r5 instanceof MI0.d.a.c
                if (r6 == 0) goto L3f
                MI0.d$a$c r5 = (MI0.d.a.c) r5
                goto L40
            L3f:
                r5 = 0
            L40:
                if (r5 != 0) goto L4a
                EI0.b$c r5 = new EI0.b$c
                com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j$h r6 = com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j.h.f313199a
                r5.<init>(r6)
                goto L63
            L4a:
                LI0.a r5 = r5.f10583a
                com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem$b r6 = r5.f9899e
                if (r6 == 0) goto L5c
                boolean r5 = r5.f9898d
                if (r5 != 0) goto L5c
                EI0.b$b r5 = new EI0.b$b
                com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j$h r6 = com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j.h.f313199a
                r5.<init>(r6)
                goto L63
            L5c:
                EI0.b$c r5 = new EI0.b$c
                com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j$h r6 = com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j.h.f313199a
                r5.<init>(r6)
            L63:
                r0.f313238r = r3
                kotlinx.coroutines.flow.j r6 = r4.f313236b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L6e
                return r1
            L6e:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.u.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public u(n2 n2Var) {
        this.f313235b = n2Var;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super EI0.b> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f313235b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

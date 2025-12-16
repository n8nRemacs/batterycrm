package Ki;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.beduin.v2.interaction.navigation.flow.u;
import com.facebook.imageutils.JfifUtil;
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
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC43160i<b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f9633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f9634c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f9635b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u f9636c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.beduin.v2.page.navigation.StateUpdates$forKey$$inlined$mapNotNull$1$2", f = "StateUpdates.kt", i = {}, l = {JfifUtil.MARKER_APP1}, m = "emit", n = {}, s = {})
        /* renamed from: Ki.c$a$a, reason: collision with other inner class name */
        public static final class C0593a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f9637q;

            /* renamed from: r, reason: collision with root package name */
            public int f9638r;

            public C0593a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f9637q = obj;
                this.f9638r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, u uVar) {
            this.f9635b = interfaceC43172j;
            this.f9636c = uVar;
        }

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
                boolean r0 = r8 instanceof Ki.c.a.C0593a
                if (r0 == 0) goto L13
                r0 = r8
                Ki.c$a$a r0 = (Ki.c.a.C0593a) r0
                int r1 = r0.f9638r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f9638r = r1
                goto L18
            L13:
                Ki.c$a$a r0 = new Ki.c$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f9637q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f9638r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r8)
                goto L78
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                kotlin.C42729a0.b(r8)
                eT.c r7 = (kotlin.AbstractC40048c) r7
                boolean r8 = r7 instanceof kotlin.AbstractC40048c.a.b
                r2 = 0
                if (r8 == 0) goto L3f
                r8 = r7
                eT.c$a$b r8 = (kotlin.AbstractC40048c.a.b) r8
                goto L40
            L3f:
                r8 = r2
            L40:
                if (r8 == 0) goto L5c
                eT.d r8 = r8.f395215e
                if (r8 == 0) goto L5c
                com.avito.beduin.v2.interaction.navigation.flow.u r4 = r6.f9636c
                java.lang.String r4 = r4.f337550a
                com.avito.beduin.v2.interaction.navigation.flow.u$a r5 = com.avito.beduin.v2.interaction.navigation.flow.u.f337549b
                r5.getClass()
                com.avito.beduin.v2.interaction.navigation.flow.u r4 = com.avito.beduin.v2.interaction.navigation.flow.u.a.a(r4)
                java.util.Map<com.avito.beduin.v2.interaction.navigation.flow.u, com.avito.beduin.v2.engine.D> r8 = r8.f395220a
                java.lang.Object r8 = r8.get(r4)
                com.avito.beduin.v2.engine.D r8 = (com.avito.beduin.v2.engine.D) r8
                goto L5d
            L5c:
                r8 = r2
            L5d:
                if (r8 == 0) goto L6b
                Ki.b r2 = new Ki.b
                r2.<init>(r8)
                com.avito.android.analytics.screens.mvi.r r7 = r7.getPerfTrackerParams()
                r2.setPerfTrackerParams(r7)
            L6b:
                if (r2 == 0) goto L78
                r0.f9638r = r3
                kotlinx.coroutines.flow.j r7 = r6.f9635b
                java.lang.Object r7 = r7.emit(r2, r0)
                if (r7 != r1) goto L78
                return r1
            L78:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Ki.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public c(InterfaceC43160i interfaceC43160i, u uVar) {
        this.f9633b = interfaceC43160i;
        this.f9634c = uVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super b> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = this.f9633b.collect(new a(interfaceC43172j, this.f9634c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

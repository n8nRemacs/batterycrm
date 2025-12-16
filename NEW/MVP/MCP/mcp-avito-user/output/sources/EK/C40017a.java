package eK;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
/* renamed from: eK.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40017a implements InterfaceC43160i<Object> {

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    /* renamed from: eK.a$a, reason: collision with other inner class name */
    public static final class C11067a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f395109q;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f395109q = obj;
            throw null;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: eK.a$b */
    public static final class b<T> implements InterfaceC43172j {

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
        @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap$Companion$releaseWaiterOnSubscriptionTo$$inlined$filterIsInstance$1$2", f = "IacBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: eK.a$b$a, reason: collision with other inner class name */
        public static final class C11068a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f395110q;

            /* renamed from: r, reason: collision with root package name */
            public int f395111r;

            public C11068a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f395110q = obj;
                this.f395111r |= BeduinInputModel.MIN_TEXT_VERSION;
                return b.this.emit(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r4, @Y61.k kotlin.coroutines.Continuation r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof eK.C40017a.b.C11068a
                if (r4 == 0) goto L13
                r4 = r5
                eK.a$b$a r4 = (eK.C40017a.b.C11068a) r4
                int r0 = r4.f395111r
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.f395111r = r0
                goto L18
            L13:
                eK.a$b$a r4 = new eK.a$b$a
                r4.<init>(r5)
            L18:
                java.lang.Object r5 = r4.f395110q
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r4 = r4.f395111r
                if (r4 == 0) goto L32
                r0 = 1
                if (r4 != r0) goto L2a
                kotlin.C42729a0.b(r5)
                kotlin.G0 r4 = kotlin.G0.f406611a
                return r4
            L2a:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L32:
                kotlin.C42729a0.b(r5)
                kotlin.jvm.internal.L.l()
                r4 = 0
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: eK.C40017a.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super Object> interfaceC43172j, @k Continuation continuation) {
        L.l();
        throw null;
    }
}

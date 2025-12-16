package Mw;

import Y61.k;
import Y61.l;
import com.avito.android.avito_map.AvitoMapPoint;
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
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14536a implements InterfaceC43160i<AvitoMapPoint> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f11096b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: Mw.a$a, reason: collision with other inner class name */
    public static final class C0707a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f11097b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.use_case.FindCurrentLocationUseCase$invoke$$inlined$map$1$2", f = "FindCurrentLocationUseCase.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: Mw.a$a$a, reason: collision with other inner class name */
        public static final class C0708a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f11098q;

            /* renamed from: r, reason: collision with root package name */
            public int f11099r;

            public C0708a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f11098q = obj;
                this.f11099r |= BeduinInputModel.MIN_TEXT_VERSION;
                return C0707a.this.emit(null, this);
            }
        }

        public C0707a(InterfaceC43172j interfaceC43172j) {
            this.f11097b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r13, @Y61.k kotlin.coroutines.Continuation r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof Mw.C14536a.C0707a.C0708a
                if (r0 == 0) goto L13
                r0 = r14
                Mw.a$a$a r0 = (Mw.C14536a.C0707a.C0708a) r0
                int r1 = r0.f11099r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f11099r = r1
                goto L18
            L13:
                Mw.a$a$a r0 = new Mw.a$a$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f11098q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f11099r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r14)
                goto L52
            L29:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L31:
                kotlin.C42729a0.b(r14)
                android.location.Location r13 = (android.location.Location) r13
                com.avito.android.avito_map.AvitoMapPoint r14 = new com.avito.android.avito_map.AvitoMapPoint
                double r5 = r13.getLatitude()
                double r7 = r13.getLongitude()
                r11 = 0
                r9 = 0
                r10 = 4
                r4 = r14
                r4.<init>(r5, r7, r9, r10, r11)
                r0.f11099r = r3
                kotlinx.coroutines.flow.j r13 = r12.f11097b
                java.lang.Object r13 = r13.emit(r14, r0)
                if (r13 != r1) goto L52
                return r1
            L52:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: Mw.C14536a.C0707a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C14536a(InterfaceC43160i interfaceC43160i) {
        this.f11096b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super AvitoMapPoint> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f11096b).collect(new C0707a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

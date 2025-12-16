package coil.compose;

import coil.view.C27253g;
import coil.view.InterfaceC27254h;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AsyncImagePainter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcoil/size/g;", "size", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h implements InterfaceC27254h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C27242f f58226b;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<C27253g> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f58227b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: coil.compose.h$a$a, reason: collision with other inner class name */
        public static final class C2066a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f58228b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", i = {}, l = {JfifUtil.MARKER_APP1}, m = "emit", n = {}, s = {})
            /* renamed from: coil.compose.h$a$a$a, reason: collision with other inner class name */
            public static final class C2067a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f58229q;

                /* renamed from: r, reason: collision with root package name */
                public int f58230r;

                public C2067a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f58229q = obj;
                    this.f58230r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C2066a.this.emit(null, this);
                }
            }

            public C2066a(InterfaceC43172j interfaceC43172j) {
                this.f58228b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, @Y61.k kotlin.coroutines.Continuation r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof coil.compose.h.a.C2066a.C2067a
                    if (r0 == 0) goto L13
                    r0 = r10
                    coil.compose.h$a$a$a r0 = (coil.compose.h.a.C2066a.C2067a) r0
                    int r1 = r0.f58230r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f58230r = r1
                    goto L18
                L13:
                    coil.compose.h$a$a$a r0 = new coil.compose.h$a$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f58229q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f58230r
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.C42729a0.b(r10)
                    goto Lb4
                L2a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L32:
                    kotlin.C42729a0.b(r10)
                    l0.n r9 = (l0.n) r9
                    long r9 = r9.f413404a
                    coil.compose.i$a r2 = coil.compose.i.f58232a
                    l0.n$a r2 = l0.n.f413402b
                    r2.getClass()
                    long r4 = l0.n.f413403c
                    int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                    if (r2 != 0) goto L49
                    coil.size.g r9 = coil.view.C27253g.f58764c
                    goto La7
                L49:
                    coil.size.e r2 = coil.compose.G.f58164b
                    float r2 = l0.n.e(r9)
                    double r4 = (double) r2
                    r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                    int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r2 < 0) goto La6
                    float r2 = l0.n.c(r9)
                    double r4 = (double) r2
                    int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r2 < 0) goto La6
                    coil.size.g r2 = new coil.size.g
                    float r4 = l0.n.e(r9)
                    boolean r5 = java.lang.Float.isInfinite(r4)
                    if (r5 != 0) goto L7f
                    boolean r4 = java.lang.Float.isNaN(r4)
                    if (r4 != 0) goto L7f
                    float r4 = l0.n.e(r9)
                    int r4 = kotlin.math.b.b(r4)
                    coil.size.c$a r5 = new coil.size.c$a
                    r5.<init>(r4)
                    goto L81
                L7f:
                    coil.size.c$b r5 = coil.view.AbstractC27249c.b.f58760a
                L81:
                    float r4 = l0.n.c(r9)
                    boolean r6 = java.lang.Float.isInfinite(r4)
                    if (r6 != 0) goto L9f
                    boolean r4 = java.lang.Float.isNaN(r4)
                    if (r4 != 0) goto L9f
                    float r9 = l0.n.c(r9)
                    int r9 = kotlin.math.b.b(r9)
                    coil.size.c$a r10 = new coil.size.c$a
                    r10.<init>(r9)
                    goto La1
                L9f:
                    coil.size.c$b r10 = coil.view.AbstractC27249c.b.f58760a
                La1:
                    r2.<init>(r5, r10)
                    r9 = r2
                    goto La7
                La6:
                    r9 = 0
                La7:
                    if (r9 == 0) goto Lb4
                    r0.f58230r = r3
                    kotlinx.coroutines.flow.j r10 = r8.f58228b
                    java.lang.Object r9 = r10.emit(r9, r0)
                    if (r9 != r1) goto Lb4
                    return r1
                Lb4:
                    kotlin.G0 r9 = kotlin.G0.f406611a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: coil.compose.h.a.C2066a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f58227b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C27253g> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f58227b.collect(new C2066a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    public h(C27242f c27242f) {
        this.f58226b = c27242f;
    }

    @Override // coil.view.InterfaceC27254h
    @Y61.l
    public final Object a(@Y61.k Continuation<? super C27253g> continuation) {
        return C43175k.y(new a(this.f58226b.f58197h), continuation);
    }
}

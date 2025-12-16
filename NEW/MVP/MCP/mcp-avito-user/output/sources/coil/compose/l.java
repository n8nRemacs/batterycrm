package coil.compose;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.N;
import androidx.compose.ui.unit.C22712b;
import coil.view.C27253g;
import coil.view.InterfaceC27254h;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: ConstraintsSizeResolver.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/compose/l;", "Lcoil/size/h;", "Landroidx/compose/ui/layout/N;", "<init>", "()V", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l implements InterfaceC27254h, N {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<C22712b> f58237b = p2.a(C22712b.a(G.f58163a));

    /* compiled from: ConstraintsSizeResolver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f58238l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K0 k02) {
            super(1);
            this.f58238l = k02;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            aVar.e(this.f58238l, 0, 0, 0.0f);
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<C27253g> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f58239b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f58240b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "ConstraintsSizeResolver.kt", i = {}, l = {JfifUtil.MARKER_APP1}, m = "emit", n = {}, s = {})
            /* renamed from: coil.compose.l$b$a$a, reason: collision with other inner class name */
            public static final class C2068a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f58241q;

                /* renamed from: r, reason: collision with root package name */
                public int f58242r;

                public C2068a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f58241q = obj;
                    this.f58242r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f58240b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof coil.compose.l.b.a.C2068a
                    if (r0 == 0) goto L13
                    r0 = r7
                    coil.compose.l$b$a$a r0 = (coil.compose.l.b.a.C2068a) r0
                    int r1 = r0.f58242r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f58242r = r1
                    goto L18
                L13:
                    coil.compose.l$b$a$a r0 = new coil.compose.l$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f58241q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f58242r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L78
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    androidx.compose.ui.unit.b r6 = (androidx.compose.ui.unit.C22712b) r6
                    long r6 = r6.f42843a
                    coil.size.e r2 = coil.compose.G.f58164b
                    boolean r2 = androidx.compose.ui.unit.C22712b.m(r6)
                    if (r2 == 0) goto L42
                    r6 = 0
                    goto L6b
                L42:
                    boolean r2 = androidx.compose.ui.unit.C22712b.f(r6)
                    if (r2 == 0) goto L52
                    int r2 = androidx.compose.ui.unit.C22712b.j(r6)
                    coil.size.c$a r4 = new coil.size.c$a
                    r4.<init>(r2)
                    goto L54
                L52:
                    coil.size.c$b r4 = coil.view.AbstractC27249c.b.f58760a
                L54:
                    boolean r2 = androidx.compose.ui.unit.C22712b.e(r6)
                    if (r2 == 0) goto L64
                    int r6 = androidx.compose.ui.unit.C22712b.i(r6)
                    coil.size.c$a r7 = new coil.size.c$a
                    r7.<init>(r6)
                    goto L66
                L64:
                    coil.size.c$b r7 = coil.view.AbstractC27249c.b.f58760a
                L66:
                    coil.size.g r6 = new coil.size.g
                    r6.<init>(r4, r7)
                L6b:
                    if (r6 == 0) goto L78
                    r0.f58242r = r3
                    kotlinx.coroutines.flow.j r7 = r5.f58240b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L78
                    return r1
                L78:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: coil.compose.l.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f58239b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C27253g> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f58239b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Override // coil.view.InterfaceC27254h
    @Y61.l
    public final Object a(@Y61.k Continuation<? super C27253g> continuation) {
        return C43175k.y(new b(this.f58237b), continuation);
    }

    @Override // androidx.compose.ui.layout.N
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        this.f58237b.setValue(C22712b.a(j12));
        K0 k0I = interfaceC22363h0.I(j12);
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, P0.c(), new a(k0I));
    }
}

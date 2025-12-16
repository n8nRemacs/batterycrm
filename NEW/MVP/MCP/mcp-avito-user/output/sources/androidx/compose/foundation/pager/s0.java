package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.G1;
import androidx.compose.foundation.gestures.InterfaceC20432a1;
import androidx.compose.foundation.gestures.InterfaceC20481m2;
import androidx.compose.runtime.C22061e3;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/s0;", "Landroidx/compose/foundation/gestures/a1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class s0 implements InterfaceC20432a1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20481m2 f30031a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m0 f30032b;

    /* compiled from: LazyLayoutPager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", i = {0}, l = {386}, m = "performFling", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f30033q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f30034r;

        /* renamed from: t, reason: collision with root package name */
        public int f30036t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f30034r = obj;
            this.f30036t |= BeduinInputModel.MIN_TEXT_VERSION;
            return s0.this.a(null, 0.0f, this);
        }
    }

    /* compiled from: LazyLayoutPager.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "remainingScrollOffset", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Float, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ G1 f30038m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(G1 g12) {
            super(1);
            this.f30038m = g12;
        }

        @Override // Y41.l
        public final G0 invoke(Float f12) {
            float fFloatValue = f12.floatValue();
            s0 s0Var = s0.this;
            int iO2 = s0Var.f30032b.o();
            m0 m0Var = s0Var.f30032b;
            ((C22061e3) m0Var.f29982s).L3(m0Var.i(m0Var.j() + kotlin.math.b.b(iO2 != 0 ? fFloatValue / m0Var.o() : 0.0f)));
            return G0.f406611a;
        }
    }

    public s0(@Y61.k InterfaceC20481m2 interfaceC20481m2, @Y61.k m0 m0Var) {
        this.f30031a = interfaceC20481m2;
        this.f30032b = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.InterfaceC20432a1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k androidx.compose.foundation.gestures.G1 r6, float r7, @Y61.k kotlin.coroutines.Continuation<? super java.lang.Float> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.s0.a
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.s0$a r0 = (androidx.compose.foundation.pager.s0.a) r0
            int r1 = r0.f30036t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30036t = r1
            goto L1a
        L13:
            androidx.compose.foundation.pager.s0$a r0 = new androidx.compose.foundation.pager.s0$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r0.<init>(r8)
        L1a:
            java.lang.Object r8 = r0.f30034r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f30036t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f30033q
            androidx.compose.foundation.pager.s0 r6 = (androidx.compose.foundation.pager.s0) r6
            kotlin.C42729a0.b(r8)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C42729a0.b(r8)
            androidx.compose.foundation.pager.s0$b r8 = new androidx.compose.foundation.pager.s0$b
            r8.<init>(r6)
            r0.f30033q = r5
            r0.f30036t = r3
            androidx.compose.foundation.gestures.m2 r2 = r5.f30031a
            java.lang.Object r8 = r2.b(r6, r7, r8, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r6 = r5
        L4d:
            java.lang.Number r8 = (java.lang.Number) r8
            float r7 = r8.floatValue()
            androidx.compose.foundation.pager.m0 r8 = r6.f30032b
            float r8 = r8.k()
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            androidx.compose.foundation.pager.m0 r6 = r6.f30032b
            if (r8 != 0) goto L61
            goto L9a
        L61:
            float r8 = r6.k()
            float r8 = java.lang.Math.abs(r8)
            double r1 = (double) r8
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L9a
            int r8 = r6.j()
            androidx.compose.foundation.gestures.U1 r1 = r6.f29974k
            boolean r1 = r1.a()
            if (r1 == 0) goto L95
            androidx.compose.runtime.y1<androidx.compose.foundation.pager.Z> r1 = r6.f29979p
            androidx.compose.runtime.i3 r1 = (androidx.compose.runtime.C22082i3) r1
            java.lang.Object r1 = r1.getF42167b()
            androidx.compose.foundation.pager.Z r1 = (androidx.compose.foundation.pager.Z) r1
            kotlinx.coroutines.T r1 = r1.f29885t
            androidx.compose.foundation.pager.n0 r2 = new androidx.compose.foundation.pager.n0
            r3 = 0
            r2.<init>(r6, r3)
            r4 = 3
            kotlinx.coroutines.C43259k.d(r1, r3, r3, r2, r4)
        L95:
            r1 = 0
            r6.t(r8, r0, r1)
            goto L9d
        L9a:
            r6.k()
        L9d:
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.s0.a(androidx.compose.foundation.gestures.G1, float, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

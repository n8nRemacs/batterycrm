package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/z3;", "Landroidx/compose/ui/input/nestedscroll/a;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.z3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21428z3 implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: b, reason: collision with root package name */
    public final Orientation f34425b = Orientation.f27425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C21398x<?> f34426c;

    /* compiled from: Drawer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "Drawer.kt", i = {0}, l = {826}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
    /* renamed from: androidx.compose.material.z3$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public long f34427q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f34428r;

        /* renamed from: t, reason: collision with root package name */
        public int f34430t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34428r = obj;
            this.f34430t |= BeduinInputModel.MIN_TEXT_VERSION;
            return C21428z3.this.U0(0L, 0L, this);
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "Drawer.kt", i = {0}, l = {817}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
    /* renamed from: androidx.compose.material.z3$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public long f34431q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f34432r;

        /* renamed from: t, reason: collision with root package name */
        public int f34434t;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34432r = obj;
            this.f34434t |= BeduinInputModel.MIN_TEXT_VERSION;
            return C21428z3.this.k0(0L, this);
        }
    }

    public C21428z3(C21398x<?> c21398x) {
        this.f34426c = c21398x;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U0(long r3, long r5, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.B> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.material.C21428z3.a
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.material.z3$a r3 = (androidx.compose.material.C21428z3.a) r3
            int r4 = r3.f34430t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f34430t = r4
            goto L1a
        L13:
            androidx.compose.material.z3$a r3 = new androidx.compose.material.z3$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r3.<init>(r7)
        L1a:
            java.lang.Object r4 = r3.f34428r
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.f34430t
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            long r5 = r3.f34427q
            kotlin.C42729a0.b(r4)
            goto L54
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L35:
            kotlin.C42729a0.b(r4)
            androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.f27426c
            androidx.compose.foundation.gestures.Orientation r0 = r2.f34425b
            if (r0 != r4) goto L43
            float r4 = androidx.compose.ui.unit.B.c(r5)
            goto L47
        L43:
            float r4 = androidx.compose.ui.unit.B.d(r5)
        L47:
            r3.f34427q = r5
            r3.f34430t = r1
            androidx.compose.material.x<?> r0 = r2.f34426c
            java.lang.Object r3 = r0.j(r4, r3)
            if (r3 != r7) goto L54
            return r7
        L54:
            androidx.compose.ui.unit.B r3 = androidx.compose.ui.unit.B.a(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21428z3.U0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        Orientation orientation = Orientation.f27426c;
        Orientation orientation2 = this.f34425b;
        float fG2 = orientation2 == orientation ? l0.g.g(j12) : l0.g.h(j12);
        if (fG2 < 0.0f) {
            androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
            if (androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40106c)) {
                float fD2 = this.f34426c.d(fG2);
                return l0.h.a(orientation2 == orientation ? fD2 : 0.0f, orientation2 == Orientation.f27425b ? fD2 : 0.0f);
            }
        }
        l0.g.f413384b.getClass();
        return 0L;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
        if (!androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40106c)) {
            l0.g.f413384b.getClass();
            return 0L;
        }
        C21398x<?> c21398x = this.f34426c;
        Orientation orientation = Orientation.f27426c;
        Orientation orientation2 = this.f34425b;
        float fD2 = c21398x.d(orientation2 == orientation ? l0.g.g(j13) : l0.g.h(j13));
        float f12 = orientation2 == orientation ? fD2 : 0.0f;
        if (orientation2 != Orientation.f27425b) {
            fD2 = 0.0f;
        }
        return l0.h.a(f12, fD2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(long r7, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.B> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material.C21428z3.b
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material.z3$b r0 = (androidx.compose.material.C21428z3.b) r0
            int r1 = r0.f34434t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34434t = r1
            goto L1a
        L13:
            androidx.compose.material.z3$b r0 = new androidx.compose.material.z3$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r9 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r9
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.f34432r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34434t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r7 = r0.f34431q
            kotlin.C42729a0.b(r9)
            goto L70
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.C42729a0.b(r9)
            androidx.compose.foundation.gestures.Orientation r9 = androidx.compose.foundation.gestures.Orientation.f27426c
            androidx.compose.foundation.gestures.Orientation r2 = r6.f34425b
            if (r2 != r9) goto L43
            float r9 = androidx.compose.ui.unit.B.c(r7)
            goto L47
        L43:
            float r9 = androidx.compose.ui.unit.B.d(r7)
        L47:
            androidx.compose.material.x<?> r2 = r6.f34426c
            float r4 = r2.g()
            r5 = 0
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L69
            androidx.compose.material.e3 r5 = r2.e()
            float r5 = r5.e()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L69
            r0.f34431q = r7
            r0.f34434t = r3
            java.lang.Object r9 = r2.j(r9, r0)
            if (r9 != r1) goto L70
            return r1
        L69:
            androidx.compose.ui.unit.B$a r7 = androidx.compose.ui.unit.B.f42836b
            r7.getClass()
            r7 = 0
        L70:
            androidx.compose.ui.unit.B r7 = androidx.compose.ui.unit.B.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21428z3.k0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

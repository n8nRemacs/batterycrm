package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/E0;", "Landroidx/compose/ui/input/nestedscroll/a;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E0 implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C21398x<?> f32552b;

    /* compiled from: BackdropScaffold.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", f = "BackdropScaffold.kt", i = {0}, l = {680}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public long f32553q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f32554r;

        /* renamed from: t, reason: collision with root package name */
        public int f32556t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32554r = obj;
            this.f32556t |= BeduinInputModel.MIN_TEXT_VERSION;
            return E0.this.U0(0L, 0L, this);
        }
    }

    /* compiled from: BackdropScaffold.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", f = "BackdropScaffold.kt", i = {0}, l = {671}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public long f32557q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f32558r;

        /* renamed from: t, reason: collision with root package name */
        public int f32560t;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32558r = obj;
            this.f32560t |= BeduinInputModel.MIN_TEXT_VERSION;
            return E0.this.k0(0L, this);
        }
    }

    public E0(C21398x c21398x) {
        Orientation orientation = Orientation.f27425b;
        this.f32552b = c21398x;
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
            boolean r3 = r7 instanceof androidx.compose.material.E0.a
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.material.E0$a r3 = (androidx.compose.material.E0.a) r3
            int r4 = r3.f32556t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f32556t = r4
            goto L1a
        L13:
            androidx.compose.material.E0$a r3 = new androidx.compose.material.E0$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r3.<init>(r7)
        L1a:
            java.lang.Object r4 = r3.f32554r
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.f32556t
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            long r5 = r3.f32553q
            kotlin.C42729a0.b(r4)
            goto L4b
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L35:
            kotlin.C42729a0.b(r4)
            androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.f27425b
            float r4 = androidx.compose.ui.unit.B.d(r5)
            r3.f32553q = r5
            r3.f32556t = r1
            androidx.compose.material.x<?> r0 = r2.f32552b
            java.lang.Object r3 = r0.j(r4, r3)
            if (r3 != r7) goto L4b
            return r7
        L4b:
            androidx.compose.ui.unit.B r3 = androidx.compose.ui.unit.B.a(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.E0.U0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        Orientation orientation = Orientation.f27425b;
        float fH2 = l0.g.h(j12);
        if (fH2 < 0.0f) {
            androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
            if (androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40106c)) {
                return l0.h.a(0.0f, this.f32552b.d(fH2));
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
        C21398x<?> c21398x = this.f32552b;
        Orientation orientation = Orientation.f27425b;
        return l0.h.a(0.0f, c21398x.d(l0.g.h(j13)));
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
            boolean r0 = r9 instanceof androidx.compose.material.E0.b
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material.E0$b r0 = (androidx.compose.material.E0.b) r0
            int r1 = r0.f32560t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32560t = r1
            goto L1a
        L13:
            androidx.compose.material.E0$b r0 = new androidx.compose.material.E0$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r9 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r9
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.f32558r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f32560t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r7 = r0.f32557q
            kotlin.C42729a0.b(r9)
            goto L67
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.C42729a0.b(r9)
            androidx.compose.foundation.gestures.Orientation r9 = androidx.compose.foundation.gestures.Orientation.f27425b
            float r9 = androidx.compose.ui.unit.B.d(r7)
            androidx.compose.material.x<?> r2 = r6.f32552b
            float r4 = r2.g()
            r5 = 0
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L60
            androidx.compose.material.e3 r5 = r2.e()
            float r5 = r5.e()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L60
            r0.f32557q = r7
            r0.f32560t = r3
            java.lang.Object r9 = r2.j(r9, r0)
            if (r9 != r1) goto L67
            return r1
        L60:
            androidx.compose.ui.unit.B$a r7 = androidx.compose.ui.unit.B.f42836b
            r7.getClass()
            r7 = 0
        L67:
            androidx.compose.ui.unit.B r7 = androidx.compose.ui.unit.B.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.E0.k0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

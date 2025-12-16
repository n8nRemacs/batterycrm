package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/E1;", "Landroidx/compose/ui/input/nestedscroll/a;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E1 implements androidx.compose.ui.input.nestedscroll.a {

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "BottomSheetScaffold.kt", i = {0}, l = {581}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public long f32561q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f32562r;

        /* renamed from: t, reason: collision with root package name */
        public int f32564t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32562r = obj;
            this.f32564t |= BeduinInputModel.MIN_TEXT_VERSION;
            return E1.this.U0(0L, 0L, this);
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "BottomSheetScaffold.kt", i = {0}, l = {572}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public long f32565q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f32566r;

        /* renamed from: t, reason: collision with root package name */
        public int f32568t;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32566r = obj;
            this.f32568t |= BeduinInputModel.MIN_TEXT_VERSION;
            return E1.this.k0(0L, this);
        }
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
            boolean r3 = r7 instanceof androidx.compose.material.E1.a
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.material.E1$a r3 = (androidx.compose.material.E1.a) r3
            int r4 = r3.f32564t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f32564t = r4
            goto L1a
        L13:
            androidx.compose.material.E1$a r3 = new androidx.compose.material.E1$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r3.<init>(r7)
        L1a:
            java.lang.Object r4 = r3.f32562r
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r7 = r3.f32564t
            r0 = 1
            if (r7 == 0) goto L38
            if (r7 != r0) goto L30
            long r5 = r3.f32561q
            kotlin.C42729a0.b(r4)
            androidx.compose.ui.unit.B r3 = androidx.compose.ui.unit.B.a(r5)
            return r3
        L30:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L38:
            kotlin.C42729a0.b(r4)
            androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.f27425b
            androidx.compose.ui.unit.B.d(r5)
            r3.f32561q = r5
            r3.f32564t = r0
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.E1.U0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        Orientation orientation = Orientation.f27425b;
        if (l0.g.h(j12) < 0.0f) {
            androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
            if (androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40106c)) {
                throw null;
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
        Orientation orientation = Orientation.f27425b;
        l0.g.h(j13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(long r5, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.B> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material.E1.b
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.E1$b r0 = (androidx.compose.material.E1.b) r0
            int r1 = r0.f32568t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32568t = r1
            goto L1a
        L13:
            androidx.compose.material.E1$b r0 = new androidx.compose.material.E1$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.f32566r
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f32568t
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            long r5 = r0.f32565q
            kotlin.C42729a0.b(r7)
            androidx.compose.ui.unit.B r5 = androidx.compose.ui.unit.B.a(r5)
            return r5
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.C42729a0.b(r7)
            androidx.compose.foundation.gestures.Orientation r7 = androidx.compose.foundation.gestures.Orientation.f27425b
            androidx.compose.ui.unit.B.d(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.E1.k0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

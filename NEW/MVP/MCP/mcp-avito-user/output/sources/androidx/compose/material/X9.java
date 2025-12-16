package androidx.compose.material;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/X9;", "Landroidx/compose/ui/input/nestedscroll/a;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X9 implements androidx.compose.ui.input.nestedscroll.a {

    /* compiled from: Swipeable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", i = {0}, l = {868}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public long f33355q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f33356r;

        /* renamed from: t, reason: collision with root package name */
        public int f33358t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33356r = obj;
            this.f33358t |= BeduinInputModel.MIN_TEXT_VERSION;
            return X9.this.U0(0L, 0L, this);
        }
    }

    /* compiled from: Swipeable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", i = {0}, l = {859}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f33359q;

        /* renamed from: s, reason: collision with root package name */
        public int f33361s;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33359q = obj;
            this.f33361s |= BeduinInputModel.MIN_TEXT_VERSION;
            return X9.this.k0(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U0(long r4, long r6, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.B> r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof androidx.compose.material.X9.a
            if (r4 == 0) goto L13
            r4 = r8
            androidx.compose.material.X9$a r4 = (androidx.compose.material.X9.a) r4
            int r5 = r4.f33358t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.f33358t = r5
            goto L1a
        L13:
            androidx.compose.material.X9$a r4 = new androidx.compose.material.X9$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r4.<init>(r8)
        L1a:
            java.lang.Object r5 = r4.f33356r
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r8 = r4.f33358t
            r0 = 1
            if (r8 == 0) goto L38
            if (r8 != r0) goto L30
            long r6 = r4.f33355q
            kotlin.C42729a0.b(r5)
            androidx.compose.ui.unit.B r4 = androidx.compose.ui.unit.B.a(r6)
            return r4
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.C42729a0.b(r5)
            float r5 = androidx.compose.ui.unit.B.c(r6)
            float r8 = androidx.compose.ui.unit.B.d(r6)
            long r1 = l0.h.a(r5, r8)
            l0.g.h(r1)
            r4.f33355q = r6
            r4.f33358t = r0
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.X9.U0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
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
        if (androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40106c)) {
            l0.g.h(j13);
            throw null;
        }
        l0.g.f413384b.getClass();
        return 0L;
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
            boolean r0 = r7 instanceof androidx.compose.material.X9.b
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.X9$b r0 = (androidx.compose.material.X9.b) r0
            int r1 = r0.f33361s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33361s = r1
            goto L1a
        L13:
            androidx.compose.material.X9$b r0 = new androidx.compose.material.X9$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.f33359q
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r0.f33361s
            if (r0 == 0) goto L32
            r5 = 1
            if (r0 != r5) goto L2a
            kotlin.C42729a0.b(r7)
            goto L4f
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.C42729a0.b(r7)
            float r7 = androidx.compose.ui.unit.B.c(r5)
            float r5 = androidx.compose.ui.unit.B.d(r5)
            long r5 = l0.h.a(r7, r5)
            float r5 = l0.g.h(r5)
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L56
            androidx.compose.ui.unit.B$a r5 = androidx.compose.ui.unit.B.f42836b
            r5.getClass()
        L4f:
            r5 = 0
            androidx.compose.ui.unit.B r5 = androidx.compose.ui.unit.B.a(r5)
            return r5
        L56:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.X9.k0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

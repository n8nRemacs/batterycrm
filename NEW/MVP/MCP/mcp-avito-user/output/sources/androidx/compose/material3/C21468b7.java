package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/b7;", "Landroidx/compose/ui/input/nestedscroll/a;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.b7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21468b7 implements androidx.compose.ui.input.nestedscroll.a {

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", i = {0, 0}, l = {1540, 1541}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
    /* renamed from: androidx.compose.material3.b7$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public long f36082q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f36083r;

        /* renamed from: t, reason: collision with root package name */
        public int f36085t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f36083r = obj;
            this.f36085t |= BeduinInputModel.MIN_TEXT_VERSION;
            return C21468b7.this.U0(0L, 0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U0(long r8, long r10, @Y61.k kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.B> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.material3.C21468b7.a
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.material3.b7$a r0 = (androidx.compose.material3.C21468b7.a) r0
            int r1 = r0.f36085t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f36085t = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            androidx.compose.material3.b7$a r0 = new androidx.compose.material3.b7$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r12 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r12
            r0.<init>(r12)
            goto L12
        L1c:
            java.lang.Object r12 = r6.f36083r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f36085t
            r2 = 1
            if (r1 == 0) goto L4a
            if (r1 == r2) goto L46
            r8 = 2
            if (r1 != r8) goto L3e
            long r8 = r6.f36082q
            kotlin.C42729a0.b(r12)
            androidx.compose.ui.unit.B r12 = (androidx.compose.ui.unit.B) r12
            long r10 = r12.f42837a
            long r8 = androidx.compose.ui.unit.B.f(r8, r10)
            androidx.compose.ui.unit.B r8 = androidx.compose.ui.unit.B.a(r8)
            return r8
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L46:
            kotlin.C42729a0.b(r12)
            goto L5b
        L4a:
            kotlin.C42729a0.b(r12)
            r6.f36082q = r10
            r6.f36085t = r2
            r1 = r7
            r2 = r8
            r4 = r10
            java.lang.Object r12 = super.U0(r2, r4, r6)
            if (r12 != r0) goto L5b
            return r0
        L5b:
            androidx.compose.ui.unit.B r12 = (androidx.compose.ui.unit.B) r12
            long r8 = r12.f42837a
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21468b7.U0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        throw null;
    }
}

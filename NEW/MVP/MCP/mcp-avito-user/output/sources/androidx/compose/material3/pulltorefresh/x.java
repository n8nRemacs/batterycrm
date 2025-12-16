package androidx.compose.material3.pulltorefresh;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PullToRefresh.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/pulltorefresh/x;", "Landroidx/compose/ui/input/nestedscroll/a;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x implements androidx.compose.ui.input.nestedscroll.a {

    /* compiled from: PullToRefresh.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$nestedScrollConnection$1", f = "PullToRefresh.kt", i = {}, l = {341}, m = "onPreFling-QWom1Mo", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f37113q;

        /* renamed from: s, reason: collision with root package name */
        public int f37115s;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f37113q = obj;
            this.f37115s |= BeduinInputModel.MIN_TEXT_VERSION;
            return x.this.k0(0L, this);
        }
    }

    public x() {
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(long r5, @Y61.k kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.B> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.pulltorefresh.x.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.pulltorefresh.x$a r0 = (androidx.compose.material3.pulltorefresh.x.a) r0
            int r1 = r0.f37115s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37115s = r1
            goto L1a
        L13:
            androidx.compose.material3.pulltorefresh.x$a r0 = new androidx.compose.material3.pulltorefresh.x$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.f37113q
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f37115s
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 != r2) goto L39
            kotlin.C42729a0.b(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            r6 = 0
            long r5 = androidx.compose.ui.unit.C.a(r6, r5)
            androidx.compose.ui.unit.B r5 = androidx.compose.ui.unit.B.a(r5)
            return r5
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.C42729a0.b(r7)
            androidx.compose.ui.unit.B.d(r5)
            r0.f37115s = r2
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.x.k0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

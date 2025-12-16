package androidx.compose.material.pullrefresh;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PullRefresh.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/pullrefresh/q;", "Landroidx/compose/ui/input/nestedscroll/a;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class q implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Float, Float> f33955b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Float, Continuation<? super Float>, Object> f33956c;

    /* compiled from: PullRefresh.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", i = {}, l = {98}, m = "onPreFling-QWom1Mo", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f33957q;

        /* renamed from: s, reason: collision with root package name */
        public int f33959s;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f33957q = obj;
            this.f33959s |= BeduinInputModel.MIN_TEXT_VERSION;
            return q.this.k0(0L, this);
        }
    }

    public q(@Y61.k Y41.l lVar, @Y61.k Y41.p pVar) {
        this.f33955b = lVar;
        this.f33956c = pVar;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
        if (!androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40106c) || l0.g.h(j12) >= 0.0f) {
            l0.g.f413384b.getClass();
            return 0L;
        }
        return l0.h.a(0.0f, ((Number) ((n) this.f33955b).invoke(Float.valueOf(l0.g.h(j12)))).floatValue());
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
        if (!androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40106c) || l0.g.h(j13) <= 0.0f) {
            l0.g.f413384b.getClass();
            return 0L;
        }
        return l0.h.a(0.0f, ((Number) ((n) this.f33955b).invoke(Float.valueOf(l0.g.h(j13)))).floatValue());
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
            boolean r0 = r7 instanceof androidx.compose.material.pullrefresh.q.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.pullrefresh.q$a r0 = (androidx.compose.material.pullrefresh.q.a) r0
            int r1 = r0.f33959s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33959s = r1
            goto L1a
        L13:
            androidx.compose.material.pullrefresh.q$a r0 = new androidx.compose.material.pullrefresh.q$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.f33957q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f33959s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C42729a0.b(r7)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r7)
            float r5 = androidx.compose.ui.unit.B.d(r5)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r5)
            r0.f33959s = r3
            Y41.p<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> r6 = r4.f33956c
            androidx.compose.material.pullrefresh.o r6 = (androidx.compose.material.pullrefresh.o) r6
            java.lang.Object r7 = r6.invoke(r5, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            r6 = 0
            long r5 = androidx.compose.ui.unit.C.a(r6, r5)
            androidx.compose.ui.unit.B r5 = androidx.compose.ui.unit.B.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.q.k0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

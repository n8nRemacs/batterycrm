package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/N1;", "Landroidx/compose/ui/input/nestedscroll/a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class N1 implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C20433a2 f27378b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27379c;

    /* compiled from: Scrollable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", i = {0, 1}, l = {898, 901}, m = "onPostFling-RZ2iAVY", n = {"available", "available"}, s = {"J$0", "J$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public long f27380q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27381r;

        /* renamed from: t, reason: collision with root package name */
        public int f27383t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f27381r = obj;
            this.f27383t |= BeduinInputModel.MIN_TEXT_VERSION;
            return N1.this.U0(0L, 0L, this);
        }
    }

    public N1(@Y61.k C20433a2 c20433a2, boolean z12) {
        this.f27378b = c20433a2;
        this.f27379c = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U0(long r6, long r8, @Y61.k kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.B> r10) {
        /*
            r5 = this;
            boolean r6 = r10 instanceof androidx.compose.foundation.gestures.N1.a
            if (r6 == 0) goto L13
            r6 = r10
            androidx.compose.foundation.gestures.N1$a r6 = (androidx.compose.foundation.gestures.N1.a) r6
            int r7 = r6.f27383t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r7 & r0
            if (r1 == 0) goto L13
            int r7 = r7 - r0
            r6.f27383t = r7
            goto L1a
        L13:
            androidx.compose.foundation.gestures.N1$a r6 = new androidx.compose.foundation.gestures.N1$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r10 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r10
            r6.<init>(r10)
        L1a:
            java.lang.Object r7 = r6.f27381r
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.f27383t
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3e
            if (r0 == r2) goto L38
            if (r0 != r1) goto L30
            long r8 = r6.f27380q
            kotlin.C42729a0.b(r7)
            goto L72
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            long r8 = r6.f27380q
            kotlin.C42729a0.b(r7)
            goto L62
        L3e:
            kotlin.C42729a0.b(r7)
            boolean r7 = r5.f27379c
            r3 = 0
            if (r7 == 0) goto L7b
            boolean r7 = androidx.compose.foundation.N0.f26803a
            androidx.compose.foundation.gestures.a2 r0 = r5.f27378b
            if (r7 == 0) goto L67
            boolean r7 = r0.f27555h
            if (r7 == 0) goto L57
            androidx.compose.ui.unit.B$a r6 = androidx.compose.ui.unit.B.f42836b
            r6.getClass()
            goto L76
        L57:
            r6.f27380q = r8
            r6.f27383t = r2
            java.lang.Object r7 = r0.b(r8, r6)
            if (r7 != r10) goto L62
            return r10
        L62:
            androidx.compose.ui.unit.B r7 = (androidx.compose.ui.unit.B) r7
            long r3 = r7.f42837a
            goto L76
        L67:
            r6.f27380q = r8
            r6.f27383t = r1
            java.lang.Object r7 = r0.b(r8, r6)
            if (r7 != r10) goto L72
            return r10
        L72:
            androidx.compose.ui.unit.B r7 = (androidx.compose.ui.unit.B) r7
            long r3 = r7.f42837a
        L76:
            long r3 = androidx.compose.ui.unit.B.e(r8, r3)
            goto L80
        L7b:
            androidx.compose.ui.unit.B$a r6 = androidx.compose.ui.unit.B.f42836b
            r6.getClass()
        L80:
            androidx.compose.ui.unit.B r6 = androidx.compose.ui.unit.B.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.N1.U0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        if (!this.f27379c) {
            l0.g.f413384b.getClass();
            return 0L;
        }
        C20433a2 c20433a2 = this.f27378b;
        if (!c20433a2.f27548a.a()) {
            return c20433a2.h(c20433a2.d(c20433a2.f27548a.c(c20433a2.d(c20433a2.g(j13)))));
        }
        l0.g.f413384b.getClass();
        return 0L;
    }
}

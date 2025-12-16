package androidx.compose.ui.text.font;

import androidx.collection.C20212g0;
import androidx.collection.R0;
import androidx.collection.i1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/font/t;", "", "<init>", "()V", "a", "b", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.font.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22625t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20212g0<b, a> f42308a = new C20212g0<>(16);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0<b, a> f42309b = i1.b();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.platform.A f42310c = new androidx.compose.ui.text.platform.A();

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/font/t$a;", "", "result", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.font.t$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Object f42311a;

        private /* synthetic */ a(Object obj) {
            this.f42311a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return kotlin.jvm.internal.L.f(this.f42311a, ((a) obj).f42311a);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f42311a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.f42311a + ')';
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/t$b;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.font.t$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final D f42312a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Object f42313b;

        public b(@Y61.k D d12, @Y61.l Object obj) {
            this.f42312a = d12;
            this.f42313b = obj;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f42312a, bVar.f42312a) && kotlin.jvm.internal.L.f(this.f42313b, bVar.f42313b);
        }

        public final int hashCode() {
            int iHashCode = this.f42312a.hashCode() * 31;
            Object obj = this.f42313b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Key(font=");
            sb2.append(this.f42312a);
            sb2.append(", loaderKey=");
            return androidx.compose.foundation.H.n(sb2, this.f42313b, ')');
        }
    }

    public static void a(C22625t c22625t, D d12, m0 m0Var, Object obj) {
        c22625t.getClass();
        b bVar = new b(d12, m0Var.getF42323b());
        synchronized (c22625t.f42310c) {
            try {
                if (obj == null) {
                    c22625t.f42309b.m(bVar, a.a(null));
                    G0 g02 = G0.f406611a;
                } else {
                    c22625t.f42308a.put(bVar, a.a(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k androidx.compose.ui.text.font.D r6, @Y61.k androidx.compose.ui.text.font.m0 r7, boolean r8, @Y61.k Y41.l r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.text.font.C22626u
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.text.font.u r0 = (androidx.compose.ui.text.font.C22626u) r0
            int r1 = r0.f42319v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42319v = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.u r0 = new androidx.compose.ui.text.font.u
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f42317t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f42319v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r8 = r0.f42316s
            androidx.compose.ui.text.font.t$b r6 = r0.f42315r
            androidx.compose.ui.text.font.t r7 = r0.f42314q
            kotlin.C42729a0.b(r10)
            goto L77
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C42729a0.b(r10)
            androidx.compose.ui.text.font.t$b r10 = new androidx.compose.ui.text.font.t$b
            java.lang.Object r7 = r7.getF42323b()
            r10.<init>(r6, r7)
            androidx.compose.ui.text.platform.A r6 = r5.f42310c
            monitor-enter(r6)
            androidx.collection.g0<androidx.compose.ui.text.font.t$b, androidx.compose.ui.text.font.t$a> r7 = r5.f42308a     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L59
            androidx.compose.ui.text.font.t$a r7 = (androidx.compose.ui.text.font.C22625t.a) r7     // Catch: java.lang.Throwable -> L59
            if (r7 != 0) goto L5b
            androidx.collection.R0<androidx.compose.ui.text.font.t$b, androidx.compose.ui.text.font.t$a> r7 = r5.f42309b     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.e(r10)     // Catch: java.lang.Throwable -> L59
            androidx.compose.ui.text.font.t$a r7 = (androidx.compose.ui.text.font.C22625t.a) r7     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r7 = move-exception
            goto La4
        L5b:
            if (r7 == 0) goto L61
            java.lang.Object r7 = r7.f42311a     // Catch: java.lang.Throwable -> L59
            monitor-exit(r6)
            return r7
        L61:
            kotlin.G0 r7 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L59
            monitor-exit(r6)
            r0.f42314q = r5
            r0.f42315r = r10
            r0.f42316s = r8
            r0.f42319v = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L73
            return r1
        L73:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L77:
            androidx.compose.ui.text.platform.A r9 = r7.f42310c
            monitor-enter(r9)
            if (r10 != 0) goto L89
            androidx.collection.R0<androidx.compose.ui.text.font.t$b, androidx.compose.ui.text.font.t$a> r7 = r7.f42309b     // Catch: java.lang.Throwable -> L87
            r8 = 0
            androidx.compose.ui.text.font.t$a r8 = androidx.compose.ui.text.font.C22625t.a.a(r8)     // Catch: java.lang.Throwable -> L87
            r7.m(r6, r8)     // Catch: java.lang.Throwable -> L87
            goto L9e
        L87:
            r6 = move-exception
            goto La2
        L89:
            if (r8 == 0) goto L95
            androidx.collection.R0<androidx.compose.ui.text.font.t$b, androidx.compose.ui.text.font.t$a> r7 = r7.f42309b     // Catch: java.lang.Throwable -> L87
            androidx.compose.ui.text.font.t$a r8 = androidx.compose.ui.text.font.C22625t.a.a(r10)     // Catch: java.lang.Throwable -> L87
            r7.m(r6, r8)     // Catch: java.lang.Throwable -> L87
            goto L9e
        L95:
            androidx.collection.g0<androidx.compose.ui.text.font.t$b, androidx.compose.ui.text.font.t$a> r7 = r7.f42308a     // Catch: java.lang.Throwable -> L87
            androidx.compose.ui.text.font.t$a r8 = androidx.compose.ui.text.font.C22625t.a.a(r10)     // Catch: java.lang.Throwable -> L87
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L87
        L9e:
            kotlin.G0 r6 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L87
            monitor-exit(r9)
            return r10
        La2:
            monitor-exit(r9)
            throw r6
        La4:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.C22625t.b(androidx.compose.ui.text.font.D, androidx.compose.ui.text.font.m0, boolean, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

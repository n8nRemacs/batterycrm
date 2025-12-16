package androidx.compose.runtime;

import androidx.compose.runtime.A;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: Effects.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22187u0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22128n0 f38775a = new C22128n0();

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.l java.lang.Object r1, @Y61.k Y41.l r2, @Y61.l androidx.compose.runtime.A r3) {
        /*
            boolean r1 = r3.B(r1)
            java.lang.Object r0 = r3.t()
            if (r1 != 0) goto L13
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r0 != r1) goto L1b
        L13:
            androidx.compose.runtime.k0 r0 = new androidx.compose.runtime.k0
            r0.<init>(r2)
            r3.H(r0)
        L1b:
            androidx.compose.runtime.k0 r0 = (androidx.compose.runtime.C22113k0) r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22187u0.a(java.lang.Object, Y41.l, androidx.compose.runtime.A):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.l java.lang.Object r0, @Y61.l java.lang.Object r1, @Y61.k Y41.l r2, @Y61.l androidx.compose.runtime.A r3) {
        /*
            boolean r0 = r3.B(r0)
            boolean r1 = r3.B(r1)
            r0 = r0 | r1
            java.lang.Object r1 = r3.t()
            if (r0 != 0) goto L18
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto L20
        L18:
            androidx.compose.runtime.k0 r1 = new androidx.compose.runtime.k0
            r1.<init>(r2)
            r3.H(r1)
        L20:
            androidx.compose.runtime.k0 r1 = (androidx.compose.runtime.C22113k0) r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22187u0.b(java.lang.Object, java.lang.Object, Y41.l, androidx.compose.runtime.A):void");
    }

    @InterfaceC22132o
    public static final void c(@Y61.k Object[] objArr, @Y61.k Y41.l lVar, @Y61.l A a12) {
        boolean zB2 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zB2 |= a12.B(obj);
        }
        Object objT = a12.t();
        if (!zB2) {
            A.f37866a.getClass();
            if (objT != A.a.f37868b) {
                return;
            }
        }
        a12.H(new C22113k0(lVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@Y61.k Y41.p r2, @Y61.l androidx.compose.runtime.A r3, @Y61.l java.lang.Object r4) {
        /*
            kotlin.coroutines.CoroutineContext r0 = r3.G()
            boolean r4 = r3.B(r4)
            java.lang.Object r1 = r3.t()
            if (r4 != 0) goto L17
            androidx.compose.runtime.A$a r4 = androidx.compose.runtime.A.f37866a
            r4.getClass()
            androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r4) goto L1f
        L17:
            androidx.compose.runtime.R0 r1 = new androidx.compose.runtime.R0
            r1.<init>(r0, r2)
            r3.H(r1)
        L1f:
            androidx.compose.runtime.R0 r1 = (androidx.compose.runtime.R0) r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22187u0.d(Y41.p, androidx.compose.runtime.A, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@Y61.l java.lang.Object r1, @Y61.l java.lang.Object r2, @Y61.k Y41.p r3, @Y61.l androidx.compose.runtime.A r4) {
        /*
            kotlin.coroutines.CoroutineContext r0 = r4.G()
            boolean r1 = r4.B(r1)
            boolean r2 = r4.B(r2)
            r1 = r1 | r2
            java.lang.Object r2 = r4.t()
            if (r1 != 0) goto L1c
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L24
        L1c:
            androidx.compose.runtime.R0 r2 = new androidx.compose.runtime.R0
            r2.<init>(r0, r3)
            r4.H(r2)
        L24:
            androidx.compose.runtime.R0 r2 = (androidx.compose.runtime.R0) r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22187u0.e(java.lang.Object, java.lang.Object, Y41.p, androidx.compose.runtime.A):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@Y61.l java.lang.Object r1, @Y61.l java.lang.Object r2, @Y61.l java.lang.Object r3, @Y61.k Y41.p r4, @Y61.l androidx.compose.runtime.A r5) {
        /*
            kotlin.coroutines.CoroutineContext r0 = r5.G()
            boolean r1 = r5.B(r1)
            boolean r2 = r5.B(r2)
            r1 = r1 | r2
            boolean r2 = r5.B(r3)
            r1 = r1 | r2
            java.lang.Object r2 = r5.t()
            if (r1 != 0) goto L21
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L29
        L21:
            androidx.compose.runtime.R0 r2 = new androidx.compose.runtime.R0
            r2.<init>(r0, r4)
            r5.H(r2)
        L29:
            androidx.compose.runtime.R0 r2 = (androidx.compose.runtime.R0) r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22187u0.f(java.lang.Object, java.lang.Object, java.lang.Object, Y41.p, androidx.compose.runtime.A):void");
    }

    @InterfaceC22132o
    public static final void g(@Y61.k Object[] objArr, @Y61.k Y41.p pVar, @Y61.l A a12) {
        CoroutineContext coroutineContextG = a12.G();
        boolean zB2 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zB2 |= a12.B(obj);
        }
        Object objT = a12.t();
        if (!zB2) {
            A.f37866a.getClass();
            if (objT != A.a.f37868b) {
                return;
            }
        }
        a12.H(new R0(coroutineContextG, pVar));
    }

    @kotlin.X
    @Y61.k
    public static final kotlinx.coroutines.T h(@Y61.k EmptyCoroutineContext emptyCoroutineContext, @Y61.k A a12) {
        if (emptyCoroutineContext.get(kotlinx.coroutines.N0.f410716u2) == null) {
            return new D2(a12.G(), emptyCoroutineContext);
        }
        kotlinx.coroutines.P0 p0A = kotlinx.coroutines.Q0.a();
        p0A.b(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return kotlinx.coroutines.U.a(p0A);
    }
}

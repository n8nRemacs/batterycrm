package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FontFamilyResolver.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/M;", "Landroidx/compose/ui/text/font/E$b;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M implements E.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m0 f42183a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n0 f42184b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final B0 f42185c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T f42186d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final l0 f42187e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<z0, Object> f42188f;

    public M(m0 m0Var, n0 n0Var, B0 b02, T t12, l0 l0Var, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            n0.f42275a.getClass();
            n0Var = n0.a.f42277b;
        }
        b02 = (i12 & 4) != 0 ? N.f42189a : b02;
        t12 = (i12 & 8) != 0 ? new T(N.f42190b, null, 2, null) : t12;
        l0Var = (i12 & 16) != 0 ? new l0() : l0Var;
        this.f42183a = m0Var;
        this.f42184b = n0Var;
        this.f42185c = b02;
        this.f42186d = t12;
        this.f42187e = l0Var;
        this.f42188f = new G(this);
    }

    @Override // androidx.compose.ui.text.font.E.b
    @Y61.k
    public final C0 a(@Y61.l E e12, @Y61.k e0 e0Var, int i12, int i13) {
        n0 n0Var = this.f42184b;
        n0Var.getClass();
        n0.a aVar = n0.f42275a;
        return c(new z0(e12, n0Var.a(e0Var), i12, i13, this.f42183a.getF42323b(), null));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.text.font.C0 c(androidx.compose.ui.text.font.z0 r6) {
        /*
            r5 = this;
            androidx.compose.ui.text.font.B0 r0 = r5.f42185c
            androidx.compose.ui.text.font.L r1 = new androidx.compose.ui.text.font.L
            r1.<init>(r5, r6)
            androidx.compose.ui.text.platform.A r2 = r0.f42164a
            monitor-enter(r2)
            androidx.collection.g0<androidx.compose.ui.text.font.z0, androidx.compose.ui.text.font.C0> r3 = r0.f42165b     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.Throwable -> L25
            androidx.compose.ui.text.font.C0 r3 = (androidx.compose.ui.text.font.C0) r3     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L27
            boolean r4 = r3.getF42168c()     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L1c
            monitor-exit(r2)
            goto L50
        L1c:
            androidx.collection.g0<androidx.compose.ui.text.font.z0, androidx.compose.ui.text.font.C0> r3 = r0.f42165b     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = r3.remove(r6)     // Catch: java.lang.Throwable -> L25
            androidx.compose.ui.text.font.C0 r3 = (androidx.compose.ui.text.font.C0) r3     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r6 = move-exception
            goto L5c
        L27:
            monitor-exit(r2)
            androidx.compose.ui.text.font.A0 r2 = new androidx.compose.ui.text.font.A0     // Catch: java.lang.Exception -> L53
            r2.<init>(r0, r6)     // Catch: java.lang.Exception -> L53
            java.lang.Object r1 = r1.invoke(r2)     // Catch: java.lang.Exception -> L53
            r3 = r1
            androidx.compose.ui.text.font.C0 r3 = (androidx.compose.ui.text.font.C0) r3     // Catch: java.lang.Exception -> L53
            androidx.compose.ui.text.platform.A r1 = r0.f42164a
            monitor-enter(r1)
            androidx.collection.g0<androidx.compose.ui.text.font.z0, androidx.compose.ui.text.font.C0> r2 = r0.f42165b     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto L4d
            boolean r2 = r3.getF42168c()     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L4d
            androidx.collection.g0<androidx.compose.ui.text.font.z0, androidx.compose.ui.text.font.C0> r0 = r0.f42165b     // Catch: java.lang.Throwable -> L4b
            r0.put(r6, r3)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r6 = move-exception
            goto L51
        L4d:
            kotlin.G0 r6 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r1)
        L50:
            return r3
        L51:
            monitor-exit(r1)
            throw r6
        L53:
            r6 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not load font"
            r0.<init>(r1, r6)
            throw r0
        L5c:
            monitor-exit(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.M.c(androidx.compose.ui.text.font.z0):androidx.compose.ui.text.font.C0");
    }
}

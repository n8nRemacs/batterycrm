package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class D0 implements P0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q0 f358103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f358104b;

    public /* synthetic */ D0(Q0 q02, int i12) {
        this.f358103a = q02;
        this.f358104b = i12;
    }

    @Override // com.google.android.play.core.assetpacks.P0
    public final Object a() {
        Q0 q02 = this.f358103a;
        int i12 = this.f358104b;
        N0 n0B = q02.b(i12);
        M0 m02 = n0B.f358186c;
        int i13 = m02.f358180d;
        if (i13 != 5 && i13 != 6 && i13 != 4) {
            throw new C37184v0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i12)), i12);
        }
        Q q12 = q02.f358216a;
        String str = m02.f358177a;
        int i14 = n0B.f358185b;
        long j12 = m02.f358178b;
        if (q12.d(i14, j12, str).exists()) {
            Q.h(q12.d(i14, j12, str));
        }
        int i15 = m02.f358180d;
        if ((i15 != 5 && i15 != 6) || !q12.j(i14, j12, str).exists()) {
            return null;
        }
        Q.h(q12.j(i14, j12, str));
        return null;
    }
}

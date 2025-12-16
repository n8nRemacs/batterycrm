package com.google.android.play.core.assetpacks;

import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class F0 implements P0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q0 f358124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f358125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f358126c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f358127d;

    public /* synthetic */ F0(Q0 q02, String str, int i12, long j12) {
        this.f358124a = q02;
        this.f358125b = str;
        this.f358126c = i12;
        this.f358127d = j12;
    }

    @Override // com.google.android.play.core.assetpacks.P0
    public final Object a() {
        int i12;
        Q0 q02 = this.f358124a;
        q02.getClass();
        String str = this.f358125b;
        N0 n02 = (N0) ((Map) q02.c(new C0(q02, Arrays.asList(str)))).get(str);
        if (n02 == null || (i12 = n02.f358186c.f358180d) == 5 || i12 == 6 || i12 == 4) {
            Q0.f358215g.b(AK.c.k("Could not find pack ", str, " while trying to complete it"), new Object[0]);
        }
        Q q12 = q02.f358216a;
        int i13 = this.f358126c;
        long j12 = this.f358127d;
        if (q12.d(i13, j12, str).exists()) {
            Q.h(q12.d(i13, j12, str));
        }
        n02.f358186c.f358180d = 4;
        return null;
    }
}

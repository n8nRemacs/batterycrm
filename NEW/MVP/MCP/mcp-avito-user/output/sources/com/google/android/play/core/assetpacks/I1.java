package com.google.android.play.core.assetpacks;

import java.io.IOException;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class I1 implements N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N1 f358148a;

    @Override // com.google.android.play.core.assetpacks.N
    public final int a(int i12, String str) {
        Q q12 = this.f358148a.f358188a;
        q12.getClass();
        boolean z12 = false;
        try {
            if (q12.m(str) != null) {
                z12 = true;
            }
        } catch (IOException unused) {
        }
        if (!z12 && i12 == 4) {
            return 8;
        }
        try {
            if (q12.m(str) == null || i12 == 4) {
                return i12;
            }
            return 4;
        } catch (IOException unused2) {
            return i12;
        }
    }
}

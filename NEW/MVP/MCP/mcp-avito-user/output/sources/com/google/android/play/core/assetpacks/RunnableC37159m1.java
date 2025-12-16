package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.C37028k;
import java.io.IOException;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.m1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC37159m1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N1 f358434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f358435c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37028k f358436d;

    public /* synthetic */ RunnableC37159m1(N1 n12, String str, C37028k c37028k) {
        this.f358434b = n12;
        this.f358435c = str;
        this.f358436d = c37028k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N1 n12 = this.f358434b;
        Q q12 = n12.f358188a;
        String str = this.f358435c;
        boolean zH2 = !q12.c(str).exists() ? true : Q.h(q12.c(str));
        C37028k c37028k = this.f358436d;
        if (!zH2) {
            c37028k.a(new IOException(AK.c.k("Failed to remove pack ", str, ".")));
        } else {
            c37028k.b(null);
            ((a2) n12.f358191d.a()).g(str);
        }
    }
}

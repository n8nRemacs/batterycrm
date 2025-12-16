package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ThumbnailSizeChecker.java */
@Nullsafe
/* loaded from: classes15.dex */
public final class D0 {
    public static boolean a(int i12, int i13, @I41.h UW0.d dVar) {
        return dVar == null ? ((float) ((int) (((float) i12) * 1.3333334f))) >= 2048.0f && ((int) (((float) i13) * 1.3333334f)) >= 2048 : ((int) (((float) i12) * 1.3333334f)) >= dVar.f16412a && ((int) (((float) i13) * 1.3333334f)) >= dVar.f16413b;
    }

    public static boolean b(@I41.h YW0.d dVar, @I41.h UW0.d dVar2) throws Throwable {
        if (dVar == null) {
            return false;
        }
        dVar.m();
        int i12 = dVar.f19500d;
        if (i12 == 90 || i12 == 270) {
            dVar.m();
            int i13 = dVar.f19503g;
            dVar.m();
            return a(i13, dVar.f19502f, dVar2);
        }
        dVar.m();
        int i14 = dVar.f19502f;
        dVar.m();
        return a(i14, dVar.f19503g, dVar2);
    }
}

package com.google.android.material.transition;

import android.graphics.RectF;

/* compiled from: FitModeEvaluators.java */
/* loaded from: classes6.dex */
class k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f357769a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f357770b = new b();

    /* compiled from: FitModeEvaluators.java */
    public class a implements j {
        @Override // com.google.android.material.transition.j
        public final l a(float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
            float fD2 = D.d(f15, f17, f13, f14, f12, true);
            float f19 = fD2 / f15;
            float f22 = fD2 / f17;
            return new l(f19, f22, fD2, f16 * f19, fD2, f18 * f22);
        }

        @Override // com.google.android.material.transition.j
        public final boolean b(l lVar) {
            return lVar.f357774d > lVar.f357776f;
        }

        @Override // com.google.android.material.transition.j
        public final void c(RectF rectF, float f12, l lVar) {
            rectF.bottom -= Math.abs(lVar.f357776f - lVar.f357774d) * f12;
        }
    }

    /* compiled from: FitModeEvaluators.java */
    public class b implements j {
        @Override // com.google.android.material.transition.j
        public final l a(float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
            float fD2 = D.d(f16, f18, f13, f14, f12, true);
            float f19 = fD2 / f16;
            float f22 = fD2 / f18;
            return new l(f19, f22, f15 * f19, fD2, f17 * f22, fD2);
        }

        @Override // com.google.android.material.transition.j
        public final boolean b(l lVar) {
            return lVar.f357773c > lVar.f357775e;
        }

        @Override // com.google.android.material.transition.j
        public final void c(RectF rectF, float f12, l lVar) {
            float fAbs = (Math.abs(lVar.f357775e - lVar.f357773c) / 2.0f) * f12;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }
    }
}

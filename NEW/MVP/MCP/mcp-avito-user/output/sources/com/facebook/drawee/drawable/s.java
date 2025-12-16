package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ScalingUtils.java */
@Nullsafe
/* loaded from: classes10.dex */
public class s {

    /* compiled from: ScalingUtils.java */
    public static abstract class a implements c {
        @Override // com.facebook.drawee.drawable.s.c
        public final Matrix a(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13) {
            b(matrix, rect, i12, i13, f12, f13, rect.width() / i12, rect.height() / i13);
            return matrix;
        }

        public abstract void b(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13, float f14, float f15);
    }

    /* compiled from: ScalingUtils.java */
    public static class b implements c, o {
        @Override // com.facebook.drawee.drawable.s.c
        public final Matrix a(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13) {
            throw null;
        }

        @Override // com.facebook.drawee.drawable.s.o
        public final Float getState() {
            return Float.valueOf(0.0f);
        }

        public final String toString() {
            throw null;
        }
    }

    /* compiled from: ScalingUtils.java */
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f340129a = l.f340148l;

        /* renamed from: b, reason: collision with root package name */
        public static final c f340130b = k.f340147l;

        /* renamed from: c, reason: collision with root package name */
        public static final c f340131c = m.f340149l;

        /* renamed from: d, reason: collision with root package name */
        public static final c f340132d = j.f340146l;

        /* renamed from: e, reason: collision with root package name */
        public static final c f340133e = h.f340144l;

        /* renamed from: f, reason: collision with root package name */
        public static final c f340134f = i.f340145l;

        /* renamed from: g, reason: collision with root package name */
        public static final c f340135g = d.f340140l;

        /* renamed from: h, reason: collision with root package name */
        public static final c f340136h = f.f340142l;

        /* renamed from: i, reason: collision with root package name */
        public static final c f340137i = e.f340141l;

        /* renamed from: j, reason: collision with root package name */
        public static final c f340138j = n.f340150l;

        /* renamed from: k, reason: collision with root package name */
        public static final c f340139k = g.f340143l;

        Matrix a(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13);
    }

    /* compiled from: ScalingUtils.java */
    public static class d extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final c f340140l = new d();

        @Override // com.facebook.drawee.drawable.s.a
        public final void b(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
            matrix.setTranslate((int) (((rect.width() - i12) * 0.5f) + rect.left + 0.5f), (int) (((rect.height() - i13) * 0.5f) + rect.top + 0.5f));
        }

        public final String toString() {
            return "center";
        }
    }

    /* compiled from: ScalingUtils.java */
    public static class e extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final c f340141l = new e();

        @Override // com.facebook.drawee.drawable.s.a
        public final void b(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
            float fWidth;
            float fHeight;
            if (f15 > f14) {
                fWidth = ((rect.width() - (i12 * f15)) * 0.5f) + rect.left;
                fHeight = rect.top;
                f14 = f15;
            } else {
                fWidth = rect.left;
                fHeight = ((rect.height() - (i13 * f14)) * 0.5f) + rect.top;
            }
            matrix.setScale(f14, f14);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public final String toString() {
            return "center_crop";
        }
    }

    /* compiled from: ScalingUtils.java */
    public static class f extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final c f340142l = new f();

        @Override // com.facebook.drawee.drawable.s.a
        public final void b(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
            float fMin = Math.min(Math.min(f14, f15), 1.0f);
            float fWidth = ((rect.width() - (i12 * fMin)) * 0.5f) + rect.left;
            float fHeight = ((rect.height() - (i13 * fMin)) * 0.5f) + rect.top;
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public final String toString() {
            return "center_inside";
        }
    }

    /* compiled from: ScalingUtils.java */
    public static class g extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final c f340143l = new g();

        @Override // com.facebook.drawee.drawable.s.a
        public final void b(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
            float fMin = Math.min(f14, f15);
            float f16 = rect.left;
            float fHeight = (rect.height() - (i13 * fMin)) + rect.top;
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (f16 + 0.5f), (int) (fHeight + 0.5f));
        }

        public final String toString() {
            return "fit_bottom_start";
        }
    }

    /* compiled from: ScalingUtils.java */
    public static class h extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final c f340144l = new h();

        @Override // com.facebook.drawee.drawable.s.a
        public final void b(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
            float fMin = Math.min(f14, f15);
            float fWidth = ((rect.width() - (i12 * fMin)) * 0.5f) + rect.left;
            float fHeight = ((rect.height() - (i13 * fMin)) * 0.5f) + rect.top;
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public final String toString() {
            return "fit_center";
        }
    }

    /* compiled from: ScalingUtils.java */
    public static class i extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final c f340145l = new i();

        @Override // com.facebook.drawee.drawable.s.a
        public final void b(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
            float fMin = Math.min(f14, f15);
            float fWidth = (rect.width() - (i12 * fMin)) + rect.left;
            float fHeight = (rect.height() - (i13 * fMin)) + rect.top;
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public final String toString() {
            return "fit_end";
        }
    }

    /* compiled from: ScalingUtils.java */
    public static class j extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final c f340146l = new j();

        @Override // com.facebook.drawee.drawable.s.a
        public final void b(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
            float fMin = Math.min(f14, f15);
            float f16 = rect.left;
            float f17 = rect.top;
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (f16 + 0.5f), (int) (f17 + 0.5f));
        }

        public final String toString() {
            return "fit_start";
        }
    }

    /* compiled from: ScalingUtils.java */
    public static class k extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final c f340147l = new k();

        @Override // com.facebook.drawee.drawable.s.a
        public final void b(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
            float f16 = rect.left;
            float fHeight = ((rect.height() - (i13 * f14)) * 0.5f) + rect.top;
            matrix.setScale(f14, f14);
            matrix.postTranslate((int) (f16 + 0.5f), (int) (fHeight + 0.5f));
        }

        public final String toString() {
            return "fit_x";
        }
    }

    /* compiled from: ScalingUtils.java */
    public static class l extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final c f340148l = new l();

        @Override // com.facebook.drawee.drawable.s.a
        public final void b(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
            float f16 = rect.left;
            float f17 = rect.top;
            matrix.setScale(f14, f15);
            matrix.postTranslate((int) (f16 + 0.5f), (int) (f17 + 0.5f));
        }

        public final String toString() {
            return "fit_xy";
        }
    }

    /* compiled from: ScalingUtils.java */
    public static class m extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final c f340149l = new m();

        @Override // com.facebook.drawee.drawable.s.a
        public final void b(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
            float fWidth = ((rect.width() - (i12 * f15)) * 0.5f) + rect.left;
            float f16 = rect.top;
            matrix.setScale(f15, f15);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (f16 + 0.5f));
        }

        public final String toString() {
            return "fit_y";
        }
    }

    /* compiled from: ScalingUtils.java */
    public static class n extends a {

        /* renamed from: l, reason: collision with root package name */
        public static final c f340150l = new n();

        @Override // com.facebook.drawee.drawable.s.a
        public final void b(Matrix matrix, Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
            float fMax;
            float fMax2;
            if (f15 > f14) {
                float f16 = i12 * f15;
                fMax = Math.max(Math.min((rect.width() * 0.5f) - (f12 * f16), 0.0f), rect.width() - f16) + rect.left;
                fMax2 = rect.top;
                f14 = f15;
            } else {
                fMax = rect.left;
                float f17 = i13 * f14;
                fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f13 * f17), 0.0f), rect.height() - f17) + rect.top;
            }
            matrix.setScale(f14, f14);
            matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
        }

        public final String toString() {
            return "focus_crop";
        }
    }

    /* compiled from: ScalingUtils.java */
    public interface o {
        Float getState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @I41.h
    public static r a(@I41.h Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof r) {
            return (r) drawable;
        }
        if (drawable instanceof com.facebook.drawee.drawable.e) {
            return a(((com.facebook.drawee.drawable.e) drawable).a());
        }
        if (drawable instanceof com.facebook.drawee.drawable.b) {
            com.facebook.drawee.drawable.b bVar = (com.facebook.drawee.drawable.b) drawable;
            int length = bVar.f340041d.length;
            for (int i12 = 0; i12 < length; i12++) {
                r rVarA = a(bVar.a(i12));
                if (rVarA != null) {
                    return rVarA;
                }
            }
        }
        return null;
    }
}

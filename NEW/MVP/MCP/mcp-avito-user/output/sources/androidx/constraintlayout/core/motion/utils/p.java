package androidx.constraintlayout.core.motion.utils;

import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: SplineSet.java */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public androidx.constraintlayout.core.motion.utils.b f43327a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f43328b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    public float[] f43329c = new float[10];

    /* renamed from: d, reason: collision with root package name */
    public int f43330d;

    /* renamed from: e, reason: collision with root package name */
    public String f43331e;

    /* compiled from: SplineSet.java */
    public static class a extends p {
    }

    /* compiled from: SplineSet.java */
    public static class b extends p {
        @Override // androidx.constraintlayout.core.motion.utils.p
        public final void b(float f12, int i12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.p
        public final void c(int i12) {
            throw null;
        }
    }

    /* compiled from: SplineSet.java */
    public static class c extends p {
        @Override // androidx.constraintlayout.core.motion.utils.p
        public final void b(float f12, int i12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.p
        public final void c(int i12) {
            throw null;
        }
    }

    /* compiled from: SplineSet.java */
    public static class d {
    }

    public final float a(float f12) {
        return (float) this.f43327a.b(f12);
    }

    public void b(float f12, int i12) {
        int[] iArr = this.f43328b;
        if (iArr.length < this.f43330d + 1) {
            this.f43328b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f43329c;
            this.f43329c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f43328b;
        int i13 = this.f43330d;
        iArr2[i13] = i12;
        this.f43329c[i13] = f12;
        this.f43330d = i13 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r18) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.p.c(int):void");
    }

    public final String toString() {
        String string = this.f43331e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i12 = 0; i12 < this.f43330d; i12++) {
            StringBuilder sbZ = androidx.appcompat.app.r.z(string, "[");
            sbZ.append(this.f43328b[i12]);
            sbZ.append(" , ");
            sbZ.append(decimalFormat.format(this.f43329c[i12]));
            sbZ.append("] ");
            string = sbZ.toString();
        }
        return string;
    }
}

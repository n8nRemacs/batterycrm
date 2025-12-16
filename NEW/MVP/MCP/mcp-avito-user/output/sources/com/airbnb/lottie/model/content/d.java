package com.airbnb.lottie.model.content;

import java.util.Arrays;

/* compiled from: GradientColor.java */
/* loaded from: classes10.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f59724a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f59725b;

    public d(float[] fArr, int[] iArr) {
        this.f59724a = fArr;
        this.f59725b = iArr;
    }

    public final void a(d dVar) {
        int i12 = 0;
        while (true) {
            int[] iArr = dVar.f59725b;
            if (i12 >= iArr.length) {
                return;
            }
            this.f59724a[i12] = dVar.f59724a[i12];
            this.f59725b[i12] = iArr[i12];
            i12++;
        }
    }

    public final d b(float[] fArr) {
        int iC2;
        int[] iArr = new int[fArr.length];
        for (int i12 = 0; i12 < fArr.length; i12++) {
            float f12 = fArr[i12];
            float[] fArr2 = this.f59724a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f12);
            int[] iArr2 = this.f59725b;
            if (iBinarySearch >= 0) {
                iC2 = iArr2[iBinarySearch];
            } else {
                int i13 = -(iBinarySearch + 1);
                if (i13 == 0) {
                    iC2 = iArr2[0];
                } else if (i13 == iArr2.length - 1) {
                    iC2 = iArr2[iArr2.length - 1];
                } else {
                    int i14 = i13 - 1;
                    float f13 = fArr2[i14];
                    iC2 = com.airbnb.lottie.utils.c.c((f12 - f13) / (fArr2[i13] - f13), iArr2[i14], iArr2[i13]);
                }
            }
            iArr[i12] = iC2;
        }
        return new d(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return Arrays.equals(this.f59724a, dVar.f59724a) && Arrays.equals(this.f59725b, dVar.f59725b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f59725b) + (Arrays.hashCode(this.f59724a) * 31);
    }
}

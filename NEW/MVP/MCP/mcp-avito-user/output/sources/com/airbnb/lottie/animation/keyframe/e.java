package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class e extends g<com.airbnb.lottie.model.content.d> {

    /* renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.d f59330i;

    public e(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d>> list) {
        super(list);
        int iMax = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            com.airbnb.lottie.model.content.d dVar = list.get(i12).f60134b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f59725b.length);
            }
        }
        this.f59330i = new com.airbnb.lottie.model.content.d(new float[iMax], new int[iMax]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.a
    public final Object g(com.airbnb.lottie.value.a aVar, float f12) {
        int[] iArr;
        float[] fArr;
        com.airbnb.lottie.model.content.d dVar = (com.airbnb.lottie.model.content.d) aVar.f60134b;
        com.airbnb.lottie.model.content.d dVar2 = (com.airbnb.lottie.model.content.d) aVar.f60135c;
        com.airbnb.lottie.model.content.d dVar3 = this.f59330i;
        dVar3.getClass();
        if (dVar.equals(dVar2) || f12 <= 0.0f) {
            dVar3.a(dVar);
        } else if (f12 >= 1.0f) {
            dVar3.a(dVar2);
        } else {
            int[] iArr2 = dVar.f59725b;
            int length = iArr2.length;
            int[] iArr3 = dVar2.f59725b;
            if (length != iArr3.length) {
                StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                sb2.append(iArr2.length);
                sb2.append(" vs ");
                throw new IllegalArgumentException(AK.c.i(iArr3.length, ")", sb2));
            }
            int i12 = 0;
            while (true) {
                int length2 = iArr2.length;
                iArr = dVar3.f59725b;
                fArr = dVar3.f59724a;
                if (i12 >= length2) {
                    break;
                }
                fArr[i12] = com.airbnb.lottie.utils.j.f(dVar.f59724a[i12], dVar2.f59724a[i12], f12);
                iArr[i12] = com.airbnb.lottie.utils.c.c(f12, iArr2[i12], iArr3[i12]);
                i12++;
            }
            for (int length3 = iArr2.length; length3 < fArr.length; length3++) {
                fArr[length3] = fArr[iArr2.length - 1];
                iArr[length3] = iArr[iArr2.length - 1];
            }
        }
        return dVar3;
    }
}

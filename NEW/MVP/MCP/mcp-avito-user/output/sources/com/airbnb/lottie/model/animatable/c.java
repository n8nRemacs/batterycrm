package com.airbnb.lottie.model.animatable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: AnimatableGradientColorValue.java */
/* loaded from: classes10.dex */
public class c extends p<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> {
    /* JADX WARN: Multi-variable type inference failed */
    public c(ArrayList arrayList) {
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            com.airbnb.lottie.value.a aVar = (com.airbnb.lottie.value.a) arrayList.get(i12);
            com.airbnb.lottie.model.content.d dVar = (com.airbnb.lottie.model.content.d) aVar.f60134b;
            com.airbnb.lottie.model.content.d dVar2 = (com.airbnb.lottie.model.content.d) aVar.f60135c;
            if (dVar != null && dVar2 != null) {
                float[] fArr = dVar.f59724a;
                int length = fArr.length;
                float[] fArr2 = dVar2.f59724a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f12 = Float.NaN;
                    int i13 = 0;
                    for (int i14 = 0; i14 < length2; i14++) {
                        float f13 = fArr3[i14];
                        if (f13 != f12) {
                            fArr3[i13] = f13;
                            i13++;
                            f12 = fArr3[i14];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i13);
                    aVar = new com.airbnb.lottie.value.a(dVar.b(fArrCopyOfRange), dVar2.b(fArrCopyOfRange));
                }
            }
            arrayList.set(i12, aVar);
        }
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.o
    public final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> c() {
        return new com.airbnb.lottie.animation.keyframe.e(this.f59655a);
    }

    @Override // com.airbnb.lottie.model.animatable.p, com.airbnb.lottie.model.animatable.o
    public final List d() {
        return this.f59655a;
    }
}

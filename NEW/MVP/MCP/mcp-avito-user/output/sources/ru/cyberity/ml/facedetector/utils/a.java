package ru.cyberity.ml.facedetector.utils;

import Y61.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

/* compiled from: AnchorGenerator.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000f"}, d2 = {"Lru/cyberity/ml/facedetector/utils/a;", "", "", "minScale", "maxScale", "", "strideIndex", "numStrides", "a", "Lru/cyberity/ml/facedetector/models/b;", "options", "", "Lru/cyberity/ml/facedetector/models/a;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f436291a = new a();

    private a() {
    }

    private final double a(double minScale, double maxScale, int strideIndex, int numStrides) {
        return numStrides == 1 ? (minScale + maxScale) * 0.5d : minScale + ((((maxScale - minScale) * 1.0d) * strideIndex) / (numStrides - 1.0f));
    }

    @k
    public final List<ru.cyberity.ml.facedetector.models.a> a(@k ru.cyberity.ml.facedetector.models.b options) {
        double d12;
        int iCeil;
        int iCeil2;
        int i12;
        double dDoubleValue;
        ArrayList arrayList;
        ArrayList arrayList2;
        double dDoubleValue2;
        if (options.getNumLayers() <= 0) {
            throw new IllegalArgumentException(("NumLayers must be greater than 0, numLayers: " + options.getNumLayers()).toString());
        }
        int numLayers = options.getNumLayers();
        List<Integer> listL = options.l();
        Objects.requireNonNull(listL);
        if (numLayers != listL.size()) {
            throw new IllegalArgumentException("Strides size must equal to NumLayers");
        }
        ArrayList arrayList3 = new ArrayList();
        int i13 = 0;
        while (i13 < options.getNumLayers()) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            int i14 = i13;
            while (true) {
                if (i14 >= options.l().size() || options.l().get(i14).intValue() != options.l().get(i13).intValue()) {
                    break;
                }
                double dA2 = a(options.getMinScale(), options.getMaxScale(), i14, options.l().size());
                if (i14 == 0 && options.getIsReduceBoxesInLowestLayer()) {
                    arrayList6.add(Double.valueOf(1.0d));
                    arrayList6.add(Double.valueOf(2.0d));
                    arrayList6.add(Double.valueOf(0.5d));
                    arrayList7.add(Double.valueOf(0.1d));
                    arrayList7.add(Double.valueOf(dA2));
                    arrayList7.add(Double.valueOf(dA2));
                } else {
                    int size = options.c().size();
                    for (int i15 = 0; i15 < size; i15++) {
                        arrayList6.add(options.c().get(i15));
                        arrayList7.add(Double.valueOf(dA2));
                    }
                    if (options.getInterpolatedScaleAspectRatio() > 0.0d) {
                        arrayList7.add(Double.valueOf(Math.sqrt(dA2 * (i14 != options.l().size() - 1 ? a(options.getMinScale(), options.getMaxScale(), i14, options.l().size()) : 1.0d))));
                        arrayList6.add(Double.valueOf(options.getInterpolatedScaleAspectRatio()));
                    }
                }
                i14++;
            }
            int size2 = arrayList6.size();
            for (int i16 = 0; i16 < size2; i16++) {
                double dSqrt = Math.sqrt(((Number) arrayList6.get(i16)).doubleValue());
                arrayList4.add(Double.valueOf(((Number) arrayList7.get(i16)).doubleValue() / dSqrt));
                arrayList5.add(Double.valueOf(((Number) arrayList7.get(i16)).doubleValue() * dSqrt));
            }
            if (options.d().isEmpty()) {
                double dIntValue = options.l().get(i13).intValue();
                iCeil = (int) Math.ceil((options.getInputSizeHeight() * 1.0d) / dIntValue);
                iCeil2 = (int) Math.ceil((options.getInputSizeWidth() * 1.0d) / dIntValue);
            } else {
                iCeil = options.d().get(i13).intValue();
                iCeil2 = options.e().get(i13).intValue();
            }
            int i17 = 0;
            while (i17 < iCeil) {
                int i18 = 0;
                while (i18 < iCeil2) {
                    int size3 = arrayList4.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        double anchorOffsetX = ((options.getAnchorOffsetX() + i18) * d12) / iCeil2;
                        double anchorOffsetY = ((options.getAnchorOffsetY() + i17) * d12) / iCeil;
                        if (options.getIsFixedAnchorSize()) {
                            i12 = iCeil2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            dDoubleValue = d12;
                            dDoubleValue2 = dDoubleValue;
                        } else {
                            i12 = iCeil2;
                            dDoubleValue = ((Number) arrayList5.get(i19)).doubleValue();
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            dDoubleValue2 = ((Number) arrayList4.get(i19)).doubleValue();
                        }
                        arrayList3.add(new ru.cyberity.ml.facedetector.models.a((float) anchorOffsetX, (float) anchorOffsetY, (float) dDoubleValue, (float) dDoubleValue2));
                        i19++;
                        arrayList4 = arrayList;
                        arrayList5 = arrayList2;
                        iCeil2 = i12;
                        d12 = 1.0d;
                    }
                    i18++;
                    d12 = 1.0d;
                }
                i17++;
                d12 = 1.0d;
            }
            i13 = i14;
        }
        return arrayList3;
    }
}

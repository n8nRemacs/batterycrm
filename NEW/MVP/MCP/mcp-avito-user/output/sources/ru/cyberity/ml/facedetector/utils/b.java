package ru.cyberity.ml.facedetector.utils;

import Y61.k;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.impl.r0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.cyberity.ml.facedetector.models.c;
import ru.cyberity.ml.facedetector.models.f;

/* compiled from: TensorToFaces.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!JM\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u000e\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\bH\u0002J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002JY\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u000e\u0010\u001f¨\u0006\""}, d2 = {"Lru/cyberity/ml/facedetector/utils/b;", "", "Lru/cyberity/ml/facedetector/models/f;", "options", "", "", "rawBoxes", "", "", "detectionScores", "Lru/cyberity/ml/facedetector/models/a;", AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS, "", "Lru/cyberity/ml/facedetector/models/c;", "a", "(Lru/cyberity/ml/facedetector/models/f;[[[FLjava/util/List;Ljava/util/List;)Ljava/util/List;", "", "i", "([[FILjava/util/List;Lru/cyberity/ml/facedetector/models/f;)[F", "decodedBox", "detectionScore", "faces", "threshold", "Landroid/graphics/RectF;", "boundingBox1", "boundingBox2", "boundingBox", "maxNumberOfFaces", "Landroid/util/Size;", "imageSize", "rawScores", "(Landroid/util/Size;Lru/cyberity/ml/facedetector/models/f;[[[F[[[FLjava/util/List;)Ljava/util/List;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(c cVar, c cVar2) {
        return Float.compare(cVar2.getScore(), cVar.getScore());
    }

    @k
    public final List<c> a(@k Size imageSize, @k f options, @k float[][][] rawScores, @k float[][][] rawBoxes, @k List<ru.cyberity.ml.facedetector.models.a> anchors) {
        if (rawBoxes.length != 1 || rawBoxes[0].length != options.getNumBoxes() || rawBoxes[0][0].length != options.getNumCoordinates()) {
            throw new IllegalArgumentException("RawBoxes dimensions is not correct");
        }
        if (rawScores.length != 1 || rawScores[0].length != options.getNumBoxes() || rawScores[0][0].length != options.getNumClasses()) {
            throw new IllegalArgumentException("RawScores dimensions is not correct");
        }
        if (options.getMaxNumberOfFaces() == 0 || options.getMaxNumberOfFaces() < -1) {
            throw new IllegalArgumentException("MaxNumberOfFaces must be greater than 0 or -1");
        }
        ArrayList arrayList = new ArrayList(options.getNumBoxes());
        int numBoxes = options.getNumBoxes();
        for (int i12 = 0; i12 < numBoxes; i12++) {
            float scoreClippingThreshold = rawScores[0][i12][0];
            float f12 = Float.MIN_VALUE;
            if (options.getScoreClippingThreshold() > 0.0d) {
                if (scoreClippingThreshold < (-options.getScoreClippingThreshold())) {
                    scoreClippingThreshold = -((float) options.getScoreClippingThreshold());
                }
                if (scoreClippingThreshold > options.getScoreClippingThreshold()) {
                    scoreClippingThreshold = (float) options.getScoreClippingThreshold();
                }
                float fExp = 1.0f / (((float) Math.exp(-scoreClippingThreshold)) + 1.0f);
                if (fExp > Float.MIN_VALUE) {
                    f12 = fExp;
                }
            }
            arrayList.add(Float.valueOf(f12));
        }
        List<c> listA = a(a(options, rawBoxes, arrayList, anchors), options.getIouThreshold());
        if (options.getMaxNumberOfFaces() != -1) {
            listA = a(listA, options.getMaxNumberOfFaces());
        }
        return a(listA, imageSize);
    }

    private final List<c> a(f options, float[][][] rawBoxes, List<Float> detectionScores, List<ru.cyberity.ml.facedetector.models.a> anchors) {
        ArrayList arrayList = new ArrayList();
        int numBoxes = options.getNumBoxes();
        for (int i12 = 0; i12 < numBoxes; i12++) {
            if (detectionScores.get(i12).floatValue() >= options.getMinScoreThreshold()) {
                arrayList.add(a(a(rawBoxes[0], i12, anchors, options), detectionScores.get(i12).floatValue()));
            }
        }
        return arrayList;
    }

    private final float[] a(float[][] rawBoxes, int i12, List<ru.cyberity.ml.facedetector.models.a> anchors, f options) {
        float[] fArr = new float[options.getNumCoordinates()];
        float[] fArr2 = rawBoxes[i12];
        float f12 = fArr2[0];
        float f13 = fArr2[1];
        float f14 = fArr2[2];
        float f15 = fArr2[3];
        float xCenter = anchors.get(i12).getXCenter() + (anchors.get(i12).getWidth() * (f12 / options.getXScale()));
        float yCenter = anchors.get(i12).getYCenter() + (anchors.get(i12).getHeight() * (f13 / options.getYScale()));
        float height = anchors.get(i12).getHeight() * (f15 / options.getHeightScale());
        float width = anchors.get(i12).getWidth() * (f14 / options.getWidthScale());
        float f16 = 2;
        float f17 = height / f16;
        float f18 = width / f16;
        fArr[0] = yCenter - f17;
        fArr[1] = xCenter - f18;
        fArr[2] = yCenter + f17;
        fArr[3] = xCenter + f18;
        if (options.getNumKeyPoints() > 0) {
            int numKeyPoints = options.getNumKeyPoints();
            for (int i13 = 0; i13 < numKeyPoints; i13++) {
                int numValuesPerKeypoint = (options.getNumValuesPerKeypoint() * i13) + options.getKeypointCoordinateOffset();
                float[] fArr3 = rawBoxes[i12];
                float f19 = fArr3[numValuesPerKeypoint];
                float f22 = fArr3[numValuesPerKeypoint + 1];
                fArr[(options.getNumValuesPerKeypoint() * i13) + 4] = anchors.get(i12).getXCenter() + (anchors.get(i12).getWidth() * (f19 / options.getXScale()));
                fArr[(options.getNumValuesPerKeypoint() * i13) + 5] = anchors.get(i12).getYCenter() + (anchors.get(i12).getHeight() * (f22 / options.getYScale()));
            }
        }
        return fArr;
    }

    private final c a(float[] decodedBox, float detectionScore) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 4; i12 < decodedBox.length - 1; i12 += 2) {
            arrayList.add(new PointF(decodedBox[i12], decodedBox[i12 + 1]));
        }
        return new c(detectionScore, new RectF(decodedBox[1], decodedBox[0], decodedBox[3], decodedBox[2]), arrayList);
    }

    private final List<c> a(List<c> faces, float threshold) {
        if (faces.size() == 0) {
            return faces;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C42745f0.z0(faces, new r0(16));
        while (!faces.isEmpty()) {
            int size = faces.size();
            arrayList3.clear();
            arrayList2.clear();
            int i12 = 0;
            c cVar = faces.get(0);
            for (c cVar2 : faces) {
                if (a(cVar2.getRelativeCoordinate(), cVar.getRelativeCoordinate()) > threshold) {
                    arrayList3.add(cVar2);
                } else {
                    arrayList2.add(cVar2);
                }
            }
            if (!arrayList3.isEmpty()) {
                RectF rectF = new RectF();
                ArrayList arrayList4 = new ArrayList(cVar.b().size());
                int size2 = cVar.b().size();
                for (int i13 = 0; i13 < size2; i13++) {
                    arrayList4.add(new PointF());
                }
                Iterator it = arrayList3.iterator();
                float score = 0.0f;
                while (it.hasNext()) {
                    c cVar3 = (c) it.next();
                    score += cVar3.getScore();
                    rectF.top = (cVar3.getScore() * cVar3.getRelativeCoordinate().top) + rectF.top;
                    rectF.bottom = (cVar3.getScore() * cVar3.getRelativeCoordinate().bottom) + rectF.bottom;
                    rectF.left = (cVar3.getScore() * cVar3.getRelativeCoordinate().left) + rectF.left;
                    rectF.right = (cVar3.getScore() * cVar3.getRelativeCoordinate().right) + rectF.right;
                    int size3 = arrayList4.size();
                    int i14 = i12;
                    while (i14 < size3) {
                        PointF pointF = (PointF) arrayList4.get(i14);
                        pointF.x = (cVar3.getScore() * cVar3.b().get(i14).x) + pointF.x;
                        PointF pointF2 = (PointF) arrayList4.get(i14);
                        pointF2.y = (cVar3.getScore() * cVar3.b().get(i14).y) + pointF2.y;
                        i14++;
                        i12 = 0;
                    }
                }
                rectF.top /= score;
                rectF.bottom /= score;
                rectF.left /= score;
                rectF.right /= score;
                int size4 = arrayList4.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    ((PointF) arrayList4.get(i15)).x /= score;
                    ((PointF) arrayList4.get(i15)).y /= score;
                }
                cVar = new c(score / arrayList3.size(), rectF, arrayList4);
            }
            arrayList.add(cVar);
            if (size == arrayList2.size()) {
                break;
            }
            faces.clear();
            faces.addAll(arrayList2);
        }
        return arrayList;
    }

    private final float a(RectF boundingBox1, RectF boundingBox2) {
        float fMax = Math.max(boundingBox1.left, boundingBox2.left);
        float fMax2 = Math.max(boundingBox1.top, boundingBox2.top);
        float fMin = Math.min(boundingBox1.right, boundingBox2.right);
        float fMax3 = Math.max(0.0f, fMin - fMax) * Math.max(0.0f, Math.min(boundingBox1.bottom, boundingBox2.bottom) - fMax2);
        return fMax3 / ((a(boundingBox1) + a(boundingBox2)) - fMax3);
    }

    private final float a(RectF boundingBox) {
        return (boundingBox.bottom - boundingBox.top) * (boundingBox.right - boundingBox.left);
    }

    private final List<c> a(List<c> faces, int maxNumberOfFaces) {
        if (faces.size() == 0) {
            return faces;
        }
        C42745f0.z0(faces, new r0(17));
        return faces.subList(0, Math.min(maxNumberOfFaces, faces.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(c cVar, c cVar2) {
        return Float.compare(cVar2.getScore(), cVar.getScore());
    }

    private final List<c> a(List<c> faces, Size imageSize) {
        float width;
        float width2;
        if (imageSize.getWidth() == imageSize.getHeight()) {
            return faces;
        }
        float height = 0.0f;
        float height2 = 1.0f;
        if (imageSize.getWidth() < imageSize.getHeight()) {
            width2 = (1.0f - (imageSize.getWidth() / imageSize.getHeight())) / 2.0f;
            height2 = imageSize.getHeight() / imageSize.getWidth();
            width = 1.0f;
        } else {
            width = imageSize.getWidth() / imageSize.getHeight();
            height = (1.0f - (imageSize.getHeight() / imageSize.getWidth())) / 2.0f;
            width2 = 0.0f;
        }
        for (c cVar : faces) {
            cVar.getRelativeCoordinate().left -= width2;
            cVar.getRelativeCoordinate().left *= height2;
            cVar.getRelativeCoordinate().right -= width2;
            cVar.getRelativeCoordinate().right *= height2;
            cVar.getRelativeCoordinate().top -= height;
            cVar.getRelativeCoordinate().top *= width;
            cVar.getRelativeCoordinate().bottom -= height;
            cVar.getRelativeCoordinate().bottom *= width;
            int size = cVar.b().size();
            for (int i12 = 0; i12 < size; i12++) {
                cVar.b().get(i12).x -= width2;
                cVar.b().get(i12).x *= height2;
                cVar.b().get(i12).y -= height;
                cVar.b().get(i12).y *= width;
            }
        }
        return faces;
    }
}

package ru.cyberity.cbr.camera.photo.presentation.document;

import Y61.k;
import android.graphics.Rect;
import android.graphics.RectF;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.ranges.s;
import ru.cyberity.cbr.camera.photo.presentation.document.CheckDetectionResult;

/* compiled from: AutoCaptureResultProcessor.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0010J/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\f\u001a\u00020\u0017¢\u0006\u0004\b\f\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/a;", "", "Lru/cyberity/ml/autocapture/a;", "autoCaptureFeature", "<init>", "(Lru/cyberity/ml/autocapture/a;)V", "", "scaleX", "scaleY", "Lru/cyberity/ml/docdetector/a;", "detectionResult", "", "a", "(FFLru/cyberity/ml/docdetector/a;)Z", "Landroid/graphics/Rect;", "photoFrameRect", "(FFLandroid/graphics/Rect;Lru/cyberity/ml/docdetector/a;)Z", "Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult$SizeCheckResult;", "b", "(FFLandroid/graphics/Rect;Lru/cyberity/ml/docdetector/a;)Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult$SizeCheckResult;", "Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult;", "c", "(FFLandroid/graphics/Rect;Lru/cyberity/ml/docdetector/a;)Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult;", "Lkotlin/G0;", "()V", "Lru/cyberity/ml/autocapture/a;", "Z", "isInPhotoFrame", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.ml.autocapture.a autoCaptureFeature;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isInPhotoFrame;

    public a(@k ru.cyberity.ml.autocapture.a aVar) {
        this.autoCaptureFeature = aVar;
    }

    private final boolean a(float scaleX, float scaleY, ru.cyberity.ml.docdetector.a detectionResult) {
        int cx2 = detectionResult.getCx() - (detectionResult.getWidth() / 2);
        int cy2 = detectionResult.getCy() - (detectionResult.getHeight() / 2);
        int width = (int) (detectionResult.getWidth() * scaleX);
        int height = (int) (detectionResult.getHeight() * scaleY);
        int i12 = (int) (cx2 * scaleX);
        int i13 = (int) (cy2 * scaleY);
        Rect rect = new Rect(i12, i13, width + i12, height + i13);
        BigDecimal bigDecimal = new BigDecimal(rect.width() / rect.height());
        RoundingMode roundingMode = RoundingMode.FLOOR;
        bigDecimal.setScale(2, roundingMode);
        BigDecimal bigDecimal2 = new BigDecimal(this.autoCaptureFeature.getFrameAspectRatio());
        BigDecimal bigDecimal3 = new BigDecimal(0.2d);
        return bigDecimal.compareTo(bigDecimal2.subtract(bigDecimal2.multiply(bigDecimal3)).setScale(2, roundingMode)) >= 0 && bigDecimal.compareTo(bigDecimal2.add(bigDecimal2.multiply(bigDecimal3)).setScale(2, roundingMode)) <= 0;
    }

    private final CheckDetectionResult.SizeCheckResult b(float scaleX, float scaleY, Rect photoFrameRect, ru.cyberity.ml.docdetector.a detectionResult) {
        Rect rectA = f.a(detectionResult.m(), scaleX, scaleY);
        boolean z12 = false;
        boolean z13 = ((float) (rectA.height() * rectA.width())) / ((float) (photoFrameRect.height() * photoFrameRect.width())) >= this.autoCaptureFeature.getRequiredFrameFillRatio();
        RectF rectF = new RectF(rectA);
        RectF rectF2 = new RectF(photoFrameRect);
        boolean z14 = rectF.width() < rectF2.width() && 1.0f - s.c(rectF.width() / rectF2.width(), 1.0f) <= this.autoCaptureFeature.getRequiredLargestSizeOffsetRatio();
        if (rectF.width() < rectF2.width() && rectF.height() > rectF2.height()) {
            return CheckDetectionResult.SizeCheckResult.BIG;
        }
        if (rectF.height() < rectF2.height() && s.c(1.0f - (rectF.height() / rectF2.height()), 1.0f) <= this.autoCaptureFeature.getRequiredLargestSizeOffsetRatio()) {
            z12 = true;
        }
        if (rectA.height() > rectA.width()) {
            z14 = z12;
        }
        if (rectF.height() < rectF2.height() && rectF.width() > rectF2.width()) {
            return CheckDetectionResult.SizeCheckResult.BIG;
        }
        CheckDetectionResult.SizeCheckResult sizeCheckResult = CheckDetectionResult.SizeCheckResult.OK;
        if (!z13 || !z14) {
            sizeCheckResult = null;
        }
        return sizeCheckResult == null ? CheckDetectionResult.SizeCheckResult.SMALL : sizeCheckResult;
    }

    @k
    public final CheckDetectionResult c(float scaleX, float scaleY, @k Rect photoFrameRect, @k ru.cyberity.ml.docdetector.a detectionResult) {
        CheckDetectionResult checkDetectionResult = new CheckDetectionResult(a(scaleX, scaleY, photoFrameRect, detectionResult), b(scaleX, scaleY, photoFrameRect, detectionResult), a(scaleX, scaleY, detectionResult));
        e.a(e.f432410a, "DocCapture", "processor result -> " + checkDetectionResult, null, 4, null);
        return checkDetectionResult;
    }

    private final boolean a(float scaleX, float scaleY, Rect photoFrameRect, ru.cyberity.ml.docdetector.a detectionResult) {
        boolean zContains = photoFrameRect.contains(f.a(detectionResult.m(), scaleX, scaleY));
        if (zContains && !this.isInPhotoFrame) {
            e.a(e.f432410a, "DocCapture", "Documents hits the frame", null, 4, null);
        }
        if (!zContains && this.isInPhotoFrame) {
            e.a(e.f432410a, "DocCapture", "Documents is NOT in the frame", null, 4, null);
        }
        this.isInPhotoFrame = zContains;
        return zContains;
    }

    public final void a() {
        this.isInPhotoFrame = false;
    }
}

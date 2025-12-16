package ru.cyberity.ml.facedetector.models;

import Y61.k;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Face.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lru/cyberity/ml/facedetector/models/c;", "", "", "a", "F", "c", "()F", "score", "Landroid/graphics/RectF;", "b", "Landroid/graphics/RectF;", "()Landroid/graphics/RectF;", "relativeCoordinate", "", "Landroid/graphics/PointF;", "Ljava/util/List;", "()Ljava/util/List;", "relativeKeyPoints", "<init>", "(FLandroid/graphics/RectF;Ljava/util/List;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float score;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final RectF relativeCoordinate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<PointF> relativeKeyPoints;

    /* JADX WARN: Multi-variable type inference failed */
    public c(float f12, @k RectF rectF, @k List<? extends PointF> list) {
        this.score = f12;
        this.relativeCoordinate = rectF;
        this.relativeKeyPoints = list;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final RectF getRelativeCoordinate() {
        return this.relativeCoordinate;
    }

    @k
    public final List<PointF> b() {
        return this.relativeKeyPoints;
    }

    /* renamed from: c, reason: from getter */
    public final float getScore() {
        return this.score;
    }
}

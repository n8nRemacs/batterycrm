package ru.cyberity.ml.badphotos.models;

import Y61.k;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: BadPhotosDetectorResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0004\u0010\u0010¨\u0006\u0014"}, d2 = {"Lru/cyberity/ml/badphotos/models/a;", "", "", "toString", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "modelName", "", "F", "c", "()F", "score", "", "J", "()J", "executionTimeMs", "<init>", "(Ljava/lang/String;FJ)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final String modelName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float score;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long executionTimeMs;

    public a(@k String str, float f12, long j12) {
        this.modelName = str;
        this.score = f12;
        this.executionTimeMs = j12;
    }

    /* renamed from: a, reason: from getter */
    public final long getExecutionTimeMs() {
        return this.executionTimeMs;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getModelName() {
        return this.modelName;
    }

    /* renamed from: c, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    @k
    public String toString() {
        return r.k(')', this.score, new StringBuilder("UnsatisfactoryPhotosDetectorResult(res="));
    }
}

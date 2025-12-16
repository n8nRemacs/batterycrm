package ru.cyberity.ml.facedetector.models;

import Y61.k;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FaceDetectionResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/cyberity/ml/facedetector/models/e;", "", "", "Lru/cyberity/ml/facedetector/models/c;", "faces", "", "executionTimeMs", "<init>", "(Ljava/util/List;J)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "J", "()J", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<c> faces;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long executionTimeMs;

    public e(@k List<c> list, long j12) {
        this.faces = list;
        this.executionTimeMs = j12;
    }

    @k
    public final List<c> b() {
        return this.faces;
    }
}

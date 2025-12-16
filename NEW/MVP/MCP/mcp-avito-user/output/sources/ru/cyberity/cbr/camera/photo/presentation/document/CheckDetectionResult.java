package ru.cyberity.cbr.camera.photo.presentation.document;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CheckDetectionResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0012\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001d"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult;", "", "", "frameHit", "Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult$SizeCheckResult;", "sizeCheck", "aspectRatio", "<init>", "(ZLru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult$SizeCheckResult;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Z", "e", "()Z", "b", "Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult$SizeCheckResult;", "f", "()Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult$SizeCheckResult;", "c", "d", "SizeCheckResult", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class CheckDetectionResult {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean frameHit;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final SizeCheckResult sizeCheck;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean aspectRatio;

    /* compiled from: CheckDetectionResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult$SizeCheckResult;", "", "(Ljava/lang/String;I)V", "SMALL", "OK", "BIG", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum SizeCheckResult {
        SMALL,
        OK,
        BIG
    }

    /* compiled from: CheckDetectionResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult$a;", "", "Lru/cyberity/cbr/camera/photo/presentation/document/CheckDetectionResult;", "a", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.camera.photo.presentation.document.CheckDetectionResult$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final CheckDetectionResult a() {
            return new CheckDetectionResult(false, SizeCheckResult.SMALL, false);
        }

        private Companion() {
        }
    }

    public CheckDetectionResult(boolean z12, @k SizeCheckResult sizeCheckResult, boolean z13) {
        this.frameHit = z12;
        this.sizeCheck = sizeCheckResult;
        this.aspectRatio = z13;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getFrameHit() {
        return this.frameHit;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckDetectionResult)) {
            return false;
        }
        CheckDetectionResult checkDetectionResult = (CheckDetectionResult) other;
        return this.frameHit == checkDetectionResult.frameHit && this.sizeCheck == checkDetectionResult.sizeCheck && this.aspectRatio == checkDetectionResult.aspectRatio;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final SizeCheckResult getSizeCheck() {
        return this.sizeCheck;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        boolean z12 = this.frameHit;
        ?? r02 = z12;
        if (z12) {
            r02 = 1;
        }
        int iHashCode = (this.sizeCheck.hashCode() + (r02 * 31)) * 31;
        boolean z13 = this.aspectRatio;
        return iHashCode + (z13 ? 1 : z13 ? 1 : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CheckDetectionResult(frameHit=");
        sb2.append(this.frameHit);
        sb2.append(", sizeCheck=");
        sb2.append(this.sizeCheck);
        sb2.append(", aspectRatio=");
        return r.x(sb2, this.aspectRatio, ')');
    }
}

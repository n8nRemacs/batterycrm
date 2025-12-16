package ru.cyberity.ml.docdetector;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: DetectionResult.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJV\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/cyberity/ml/docdetector/a;", "", "", "cx", "cy", "width", "height", "", "confidence", "", "inferenceTimeMs", "timeMs", "<init>", "(IIIIFJJ)V", "a", "(IIIIFJJ)Lru/cyberity/ml/docdetector/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "I", "i", "b", "j", "c", "o", "d", "k", "e", "F", "h", "()F", "f", "J", "l", "()J", "g", "n", "Landroid/graphics/Rect;", "m", "()Landroid/graphics/Rect;", "rect", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int cx;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int cy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float confidence;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long inferenceTimeMs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long timeMs;

    public a(int i12, int i13, int i14, int i15, float f12, long j12, long j13) {
        this.cx = i12;
        this.cy = i13;
        this.width = i14;
        this.height = i15;
        this.confidence = f12;
        this.inferenceTimeMs = j12;
        this.timeMs = j13;
    }

    @k
    public final a a(int cx2, int cy2, int width, int height, float confidence, long inferenceTimeMs, long timeMs) {
        return new a(cx2, cy2, width, height, confidence, inferenceTimeMs, timeMs);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return this.cx == aVar.cx && this.cy == aVar.cy && this.width == aVar.width && this.height == aVar.height && Float.valueOf(this.confidence).equals(Float.valueOf(aVar.confidence)) && this.inferenceTimeMs == aVar.inferenceTimeMs && this.timeMs == aVar.timeMs;
    }

    /* renamed from: h, reason: from getter */
    public final float getConfidence() {
        return this.confidence;
    }

    public int hashCode() {
        return Long.hashCode(this.timeMs) + r.g(r.d(this.confidence, r.e(this.height, r.e(this.width, r.e(this.cy, Integer.hashCode(this.cx) * 31, 31), 31), 31), 31), 31, this.inferenceTimeMs);
    }

    /* renamed from: i, reason: from getter */
    public final int getCx() {
        return this.cx;
    }

    /* renamed from: j, reason: from getter */
    public final int getCy() {
        return this.cy;
    }

    /* renamed from: k, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: l, reason: from getter */
    public final long getInferenceTimeMs() {
        return this.inferenceTimeMs;
    }

    @k
    public final Rect m() {
        int i12 = this.cx - (this.width / 2);
        int i13 = this.cy - (this.height / 2);
        return new Rect(i12, i13, this.width + i12, this.height + i13);
    }

    /* renamed from: o, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DetectionResult(cx=");
        sb2.append(this.cx);
        sb2.append(", cy=");
        sb2.append(this.cy);
        sb2.append(", width=");
        sb2.append(this.width);
        sb2.append(", height=");
        sb2.append(this.height);
        sb2.append(", confidence=");
        sb2.append(this.confidence);
        sb2.append(", inferenceTimeMs=");
        sb2.append(this.inferenceTimeMs);
        sb2.append(", timeMs=");
        return r.u(sb2, this.timeMs, ')');
    }
}

package ru.cyberity.cbr.core.domain.camera;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CameraX.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/core/domain/camera/b;", "", "", "current", "min", "max", "<init>", "(FFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "d", "()F", "b", "f", "c", "e", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float current;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float min;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float max;

    public b() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    /* renamed from: d, reason: from getter */
    public final float getCurrent() {
        return this.current;
    }

    /* renamed from: e, reason: from getter */
    public final float getMax() {
        return this.max;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return Float.valueOf(this.current).equals(Float.valueOf(bVar.current)) && Float.valueOf(this.min).equals(Float.valueOf(bVar.min)) && Float.valueOf(this.max).equals(Float.valueOf(bVar.max));
    }

    /* renamed from: f, reason: from getter */
    public final float getMin() {
        return this.min;
    }

    public int hashCode() {
        return Float.hashCode(this.max) + r.d(this.min, Float.hashCode(this.current) * 31, 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Exposure(current=");
        sb2.append(this.current);
        sb2.append(", min=");
        sb2.append(this.min);
        sb2.append(", max=");
        return r.k(')', this.max, sb2);
    }

    public b(float f12, float f13, float f14) {
        this.current = f12;
        this.min = f13;
        this.max = f14;
    }

    public /* synthetic */ b(float f12, float f13, float f14, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0.0f : f12, (i12 & 2) != 0 ? 0.0f : f13, (i12 & 4) != 0 ? 0.0f : f14);
    }
}

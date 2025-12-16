package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: TransformableState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/F;", "", "", "zoom", "Ll0/g;", "offset", "degrees", "<init>", "(FJFLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class F {

    /* renamed from: a, reason: collision with root package name */
    public final float f27234a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27235b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27236c;

    public F(float f12, long j12, float f13, C42822w c42822w) {
        this.f27234a = f12;
        this.f27235b = j12;
        this.f27236c = f13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f12 = (F) obj;
        return Float.compare(this.f27234a, f12.f27234a) == 0 && l0.g.d(this.f27235b, f12.f27235b) && Float.compare(this.f27236c, f12.f27236c) == 0;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f27234a) * 31;
        g.a aVar = l0.g.f413384b;
        return Float.hashCode(this.f27236c) + androidx.appcompat.app.r.g(iHashCode, 31, this.f27235b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnimationData(zoom=");
        sb2.append(this.f27234a);
        sb2.append(", offset=");
        sb2.append((Object) l0.g.l(this.f27235b));
        sb2.append(", degrees=");
        return androidx.appcompat.app.r.k(')', this.f27236c, sb2);
    }
}

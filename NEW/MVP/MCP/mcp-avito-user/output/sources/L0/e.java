package l0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MutableRect.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll0/e;", "", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public float f413380a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f413381b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f413382c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f413383d = 0.0f;

    public final void a(float f12, float f13, float f14, float f15) {
        this.f413380a = Math.max(f12, this.f413380a);
        this.f413381b = Math.max(f13, this.f413381b);
        this.f413382c = Math.min(f14, this.f413382c);
        this.f413383d = Math.min(f15, this.f413383d);
    }

    public final boolean b() {
        return (this.f413380a >= this.f413382c) | (this.f413381b >= this.f413383d);
    }

    @Y61.k
    public final String toString() {
        return "MutableRect(" + c.a(this.f413380a) + ", " + c.a(this.f413381b) + ", " + c.a(this.f413382c) + ", " + c.a(this.f413383d) + ')';
    }
}

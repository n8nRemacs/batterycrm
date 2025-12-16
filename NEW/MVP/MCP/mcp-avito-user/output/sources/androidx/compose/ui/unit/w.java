package androidx.compose.ui.unit;

import kotlin.Metadata;

/* compiled from: AndroidDensity.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/w;", "LC0/a;", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class w implements C0.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f42873a;

    public w(float f12) {
        this.f42873a = f12;
    }

    @Override // C0.a
    public final float a(float f12) {
        return f12 * this.f42873a;
    }

    @Override // C0.a
    public final float b(float f12) {
        return f12 / this.f42873a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Float.compare(this.f42873a, ((w) obj).f42873a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42873a);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.k(')', this.f42873a, new StringBuilder("LinearFontScaleConverter(fontScale="));
    }
}

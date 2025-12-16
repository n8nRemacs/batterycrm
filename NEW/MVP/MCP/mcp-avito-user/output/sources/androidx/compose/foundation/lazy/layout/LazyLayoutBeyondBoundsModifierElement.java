package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/lazy/layout/l;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends AbstractC22430p0<C20729l> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20731m f29313b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C20725j f29314c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29315d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Orientation f29316e;

    public LazyLayoutBeyondBoundsModifierElement(@Y61.k InterfaceC20731m interfaceC20731m, @Y61.k C20725j c20725j, boolean z12, @Y61.k Orientation orientation) {
        this.f29313b = interfaceC20731m;
        this.f29314c = c20725j;
        this.f29315d = z12;
        this.f29316e = orientation;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C20729l c20729l = new C20729l();
        c20729l.f29456p = this.f29313b;
        c20729l.f29457q = this.f29314c;
        c20729l.f29458r = this.f29315d;
        c20729l.f29459s = this.f29316e;
        return c20729l;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20729l c20729l = (C20729l) dVar;
        c20729l.f29456p = this.f29313b;
        c20729l.f29457q = this.f29314c;
        c20729l.f29458r = this.f29315d;
        c20729l.f29459s = this.f29316e;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return kotlin.jvm.internal.L.f(this.f29313b, lazyLayoutBeyondBoundsModifierElement.f29313b) && kotlin.jvm.internal.L.f(this.f29314c, lazyLayoutBeyondBoundsModifierElement.f29314c) && this.f29315d == lazyLayoutBeyondBoundsModifierElement.f29315d && this.f29316e == lazyLayoutBeyondBoundsModifierElement.f29316e;
    }

    public final int hashCode() {
        return this.f29316e.hashCode() + androidx.appcompat.app.r.i((this.f29314c.hashCode() + (this.f29313b.hashCode() * 31)) * 31, 31, this.f29315d);
    }
}

package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LegacyAdaptingPlatformTextInputModifierNode.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/text/input/internal/l0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends AbstractC22430p0<C20902l0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC20910p0 f30855b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C20985q1 f30856c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C21011f1 f30857d;

    public LegacyAdaptingPlatformTextInputModifier(@Y61.k AbstractC20910p0 abstractC20910p0, @Y61.k C20985q1 c20985q1, @Y61.k C21011f1 c21011f1) {
        this.f30855b = abstractC20910p0;
        this.f30856c = c20985q1;
        this.f30857d = c21011f1;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new C20902l0(this.f30855b, this.f30856c, this.f30857d);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20902l0 c20902l0 = (C20902l0) dVar;
        if (c20902l0.f42893o) {
            ((C20879a) c20902l0.f31165p).a();
            c20902l0.f31165p.j(c20902l0);
        }
        AbstractC20910p0 abstractC20910p0 = this.f30855b;
        c20902l0.f31165p = abstractC20910p0;
        if (c20902l0.f42893o) {
            if (abstractC20910p0.f31199a != null) {
                androidx.compose.foundation.internal.e.c("Expected textInputModifierNode to be null");
            }
            abstractC20910p0.f31199a = c20902l0;
        }
        c20902l0.f31166q = this.f30856c;
        c20902l0.f31167r = this.f30857d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return kotlin.jvm.internal.L.f(this.f30855b, legacyAdaptingPlatformTextInputModifier.f30855b) && kotlin.jvm.internal.L.f(this.f30856c, legacyAdaptingPlatformTextInputModifier.f30856c) && kotlin.jvm.internal.L.f(this.f30857d, legacyAdaptingPlatformTextInputModifier.f30857d);
    }

    public final int hashCode() {
        return this.f30857d.hashCode() + ((this.f30856c.hashCode() + (this.f30855b.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f30855b + ", legacyTextFieldState=" + this.f30856c + ", textFieldSelectionManager=" + this.f30857d + ')';
    }
}

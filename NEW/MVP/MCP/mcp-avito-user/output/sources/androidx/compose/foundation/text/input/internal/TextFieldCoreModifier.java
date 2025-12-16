package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.d2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: TextFieldCoreModifier.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/text/input/internal/O0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldCoreModifier extends AbstractC22430p0<O0> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30987b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30988c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p1 f30989d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final t1 f30990e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextFieldSelectionState f30991f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.k1 f30992g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30993h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final d2 f30994i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Orientation f30995j;

    public TextFieldCoreModifier(boolean z12, boolean z13, @Y61.k p1 p1Var, @Y61.k t1 t1Var, @Y61.k TextFieldSelectionState textFieldSelectionState, @Y61.k androidx.compose.ui.graphics.k1 k1Var, boolean z14, @Y61.k d2 d2Var, @Y61.k Orientation orientation) {
        this.f30987b = z12;
        this.f30988c = z13;
        this.f30989d = p1Var;
        this.f30990e = t1Var;
        this.f30991f = textFieldSelectionState;
        this.f30992g = k1Var;
        this.f30993h = z14;
        this.f30994i = d2Var;
        this.f30995j = orientation;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new O0(this.f30987b, this.f30988c, this.f30989d, this.f30990e, this.f30991f, this.f30992g, this.f30993h, this.f30994i, this.f30995j);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        kotlinx.coroutines.N0 andSet;
        O0 o02 = (O0) dVar;
        boolean zO2 = o02.o2();
        boolean z12 = o02.f30874r;
        t1 t1Var = o02.f30877u;
        p1 p1Var = o02.f30876t;
        TextFieldSelectionState textFieldSelectionState = o02.f30878v;
        d2 d2Var = o02.f30881y;
        boolean z13 = this.f30987b;
        o02.f30874r = z13;
        boolean z14 = this.f30988c;
        o02.f30875s = z14;
        p1 p1Var2 = this.f30989d;
        o02.f30876t = p1Var2;
        t1 t1Var2 = this.f30990e;
        o02.f30877u = t1Var2;
        TextFieldSelectionState textFieldSelectionState2 = this.f30991f;
        o02.f30878v = textFieldSelectionState2;
        o02.f30879w = this.f30992g;
        o02.f30880x = this.f30993h;
        d2 d2Var2 = this.f30994i;
        o02.f30881y = d2Var2;
        o02.f30882z = this.f30995j;
        o02.f30873F.n2(t1Var2, textFieldSelectionState2, p1Var2, z13 || z14);
        if (!o02.o2()) {
            kotlinx.coroutines.N0 n02 = o02.f30869B;
            if (n02 != null) {
                ((kotlinx.coroutines.V0) n02).c(null);
            }
            o02.f30869B = null;
            I i12 = o02.f30868A;
            if (i12 != null && (andSet = i12.f30839b.getAndSet(null)) != null) {
                andSet.c(null);
            }
        } else if (!z12 || !kotlin.jvm.internal.L.f(t1Var, t1Var2) || !zO2) {
            o02.p2();
        }
        if (kotlin.jvm.internal.L.f(t1Var, t1Var2) && kotlin.jvm.internal.L.f(p1Var, p1Var2) && kotlin.jvm.internal.L.f(textFieldSelectionState, textFieldSelectionState2) && kotlin.jvm.internal.L.f(d2Var, d2Var2)) {
            return;
        }
        C22421l.g(o02).Y();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.f30987b == textFieldCoreModifier.f30987b && this.f30988c == textFieldCoreModifier.f30988c && kotlin.jvm.internal.L.f(this.f30989d, textFieldCoreModifier.f30989d) && kotlin.jvm.internal.L.f(this.f30990e, textFieldCoreModifier.f30990e) && kotlin.jvm.internal.L.f(this.f30991f, textFieldCoreModifier.f30991f) && kotlin.jvm.internal.L.f(this.f30992g, textFieldCoreModifier.f30992g) && this.f30993h == textFieldCoreModifier.f30993h && kotlin.jvm.internal.L.f(this.f30994i, textFieldCoreModifier.f30994i) && this.f30995j == textFieldCoreModifier.f30995j;
    }

    public final int hashCode() {
        return this.f30995j.hashCode() + ((this.f30994i.hashCode() + androidx.appcompat.app.r.i((this.f30992g.hashCode() + ((this.f30991f.hashCode() + ((this.f30990e.hashCode() + ((this.f30989d.hashCode() + androidx.appcompat.app.r.i(Boolean.hashCode(this.f30987b) * 31, 31, this.f30988c)) * 31)) * 31)) * 31)) * 31, 31, this.f30993h)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.f30987b + ", isDragHovered=" + this.f30988c + ", textLayoutState=" + this.f30989d + ", textFieldState=" + this.f30990e + ", textFieldSelectionState=" + this.f30991f + ", cursorBrush=" + this.f30992g + ", writeable=" + this.f30993h + ", scrollState=" + this.f30994i + ", orientation=" + this.f30995j + ')';
    }
}

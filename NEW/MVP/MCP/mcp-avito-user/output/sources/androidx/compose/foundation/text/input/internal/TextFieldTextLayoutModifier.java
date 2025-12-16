package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C20981p1;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: TextFieldTextLayoutModifier.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/text/input/internal/m1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldTextLayoutModifier extends AbstractC22430p0<m1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p1 f30996b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final t1 f30997c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.x0 f30998d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30999e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C20981p1 f31000f;

    public TextFieldTextLayoutModifier(@Y61.k p1 p1Var, @Y61.k t1 t1Var, @Y61.k androidx.compose.ui.text.x0 x0Var, boolean z12, @Y61.k C20981p1 c20981p1) {
        this.f30996b = p1Var;
        this.f30997c = t1Var;
        this.f30998d = x0Var;
        this.f30999e = z12;
        this.f31000f = c20981p1;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        m1 m1Var = new m1();
        p1 p1Var = this.f30996b;
        m1Var.f31170p = p1Var;
        boolean z12 = this.f30999e;
        m1Var.f31171q = z12;
        p1Var.getClass();
        p1Var.e(this.f30997c, this.f30998d, z12, !z12, this.f31000f);
        return m1Var;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        m1 m1Var = (m1) dVar;
        p1 p1Var = this.f30996b;
        m1Var.f31170p = p1Var;
        p1Var.getClass();
        boolean z12 = this.f30999e;
        m1Var.f31171q = z12;
        p1Var.e(this.f30997c, this.f30998d, z12, !z12, this.f31000f);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return kotlin.jvm.internal.L.f(this.f30996b, textFieldTextLayoutModifier.f30996b) && kotlin.jvm.internal.L.f(this.f30997c, textFieldTextLayoutModifier.f30997c) && kotlin.jvm.internal.L.f(this.f30998d, textFieldTextLayoutModifier.f30998d) && this.f30999e == textFieldTextLayoutModifier.f30999e && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(this.f31000f, textFieldTextLayoutModifier.f31000f);
    }

    public final int hashCode() {
        return this.f31000f.hashCode() + androidx.appcompat.app.r.i(androidx.compose.foundation.H.c((this.f30997c.hashCode() + (this.f30996b.hashCode() * 31)) * 31, 31, this.f30998d), 961, this.f30999e);
    }

    @Y61.k
    public final String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.f30996b + ", textFieldState=" + this.f30997c + ", textStyle=" + this.f30998d + ", singleLine=" + this.f30999e + ", onTextLayout=null, keyboardOptions=" + this.f31000f + ')';
    }
}

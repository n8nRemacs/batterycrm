package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.text.input.C22655v;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: CoreTextFieldSemanticsModifier.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/text/input/internal/A;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CoreTextFieldSemanticsModifier extends AbstractC22430p0<A> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.j0 f30792b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.W f30793c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C20985q1 f30794d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30795e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30796f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30797g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.L f30798h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C21011f1 f30799i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C22655v f30800j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.focus.S f30801k;

    public CoreTextFieldSemanticsModifier(@Y61.k androidx.compose.ui.text.input.j0 j0Var, @Y61.k androidx.compose.ui.text.input.W w12, @Y61.k C20985q1 c20985q1, boolean z12, boolean z13, boolean z14, @Y61.k androidx.compose.ui.text.input.L l12, @Y61.k C21011f1 c21011f1, @Y61.k C22655v c22655v, @Y61.k androidx.compose.ui.focus.S s5) {
        this.f30792b = j0Var;
        this.f30793c = w12;
        this.f30794d = c20985q1;
        this.f30795e = z12;
        this.f30796f = z13;
        this.f30797g = z14;
        this.f30798h = l12;
        this.f30799i = c21011f1;
        this.f30800j = c22655v;
        this.f30801k = s5;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        A a12 = new A();
        a12.f30764r = this.f30792b;
        a12.f30765s = this.f30793c;
        a12.f30766t = this.f30794d;
        a12.f30767u = this.f30795e;
        a12.f30768v = this.f30796f;
        a12.f30769w = this.f30797g;
        a12.f30770x = this.f30798h;
        C21011f1 c21011f1 = this.f30799i;
        a12.f30771y = c21011f1;
        a12.f30772z = this.f30800j;
        a12.f30763A = this.f30801k;
        c21011f1.f31989g = new C20953z(a12);
        return a12;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    @Override // androidx.compose.ui.node.AbstractC22430p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.compose.ui.v.d r11) {
        /*
            r10 = this;
            androidx.compose.foundation.text.input.internal.A r11 = (androidx.compose.foundation.text.input.internal.A) r11
            boolean r0 = r11.f30768v
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            boolean r3 = r11.f30767u
            if (r3 != 0) goto Le
            r3 = r2
            goto Lf
        Le:
            r3 = r1
        Lf:
            androidx.compose.ui.text.input.v r4 = r11.f30772z
            androidx.compose.foundation.text.selection.f1 r5 = r11.f30771y
            boolean r6 = r10.f30795e
            boolean r7 = r10.f30796f
            if (r7 == 0) goto L1c
            if (r6 != 0) goto L1c
            r1 = r2
        L1c:
            androidx.compose.ui.text.input.j0 r2 = r10.f30792b
            r11.f30764r = r2
            androidx.compose.ui.text.input.W r2 = r10.f30793c
            r11.f30765s = r2
            androidx.compose.foundation.text.q1 r8 = r10.f30794d
            r11.f30766t = r8
            r11.f30767u = r6
            r11.f30768v = r7
            androidx.compose.ui.text.input.L r6 = r10.f30798h
            r11.f30770x = r6
            androidx.compose.foundation.text.selection.f1 r6 = r10.f30799i
            r11.f30771y = r6
            androidx.compose.ui.text.input.v r8 = r10.f30800j
            r11.f30772z = r8
            androidx.compose.ui.focus.S r9 = r10.f30801k
            r11.f30763A = r9
            if (r7 != r0) goto L54
            if (r1 != r3) goto L54
            boolean r0 = kotlin.jvm.internal.L.f(r8, r4)
            if (r0 == 0) goto L54
            boolean r0 = r11.f30769w
            boolean r1 = r10.f30797g
            if (r1 != r0) goto L54
            long r0 = r2.f42384b
            boolean r0 = androidx.compose.ui.text.v0.d(r0)
            if (r0 != 0) goto L5b
        L54:
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.C22421l.g(r11)
            r0.Z()
        L5b:
            boolean r0 = kotlin.jvm.internal.L.f(r6, r5)
            if (r0 != 0) goto L68
            androidx.compose.foundation.text.input.internal.B r0 = new androidx.compose.foundation.text.input.internal.B
            r0.<init>(r11)
            r6.f31989g = r0
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier.b(androidx.compose.ui.v$d):void");
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return kotlin.jvm.internal.L.f(this.f30792b, coreTextFieldSemanticsModifier.f30792b) && kotlin.jvm.internal.L.f(this.f30793c, coreTextFieldSemanticsModifier.f30793c) && kotlin.jvm.internal.L.f(this.f30794d, coreTextFieldSemanticsModifier.f30794d) && this.f30795e == coreTextFieldSemanticsModifier.f30795e && this.f30796f == coreTextFieldSemanticsModifier.f30796f && this.f30797g == coreTextFieldSemanticsModifier.f30797g && kotlin.jvm.internal.L.f(this.f30798h, coreTextFieldSemanticsModifier.f30798h) && kotlin.jvm.internal.L.f(this.f30799i, coreTextFieldSemanticsModifier.f30799i) && kotlin.jvm.internal.L.f(this.f30800j, coreTextFieldSemanticsModifier.f30800j) && kotlin.jvm.internal.L.f(this.f30801k, coreTextFieldSemanticsModifier.f30801k);
    }

    public final int hashCode() {
        return this.f30801k.hashCode() + ((this.f30800j.hashCode() + ((this.f30799i.hashCode() + ((this.f30798h.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f30794d.hashCode() + ((this.f30793c.hashCode() + (this.f30792b.hashCode() * 31)) * 31)) * 31, 31, this.f30795e), 31, this.f30796f), 31, this.f30797g)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f30792b + ", value=" + this.f30793c + ", state=" + this.f30794d + ", readOnly=" + this.f30795e + ", enabled=" + this.f30796f + ", isPassword=" + this.f30797g + ", offsetMapping=" + this.f30798h + ", manager=" + this.f30799i + ", imeOptions=" + this.f30800j + ", focusRequester=" + this.f30801k + ')';
    }
}

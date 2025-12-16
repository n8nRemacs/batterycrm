package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.Q2;
import androidx.compose.foundation.text.W1;
import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;
import p0.InterfaceC44967a;
import p0.b;

/* compiled from: TextFieldSelectionManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/g1;", "Landroidx/compose/foundation/text/W1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g1 implements W1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f32023a;

    public g1(C21011f1 c21011f1) {
        this.f32023a = c21011f1;
    }

    @Override // androidx.compose.foundation.text.W1
    public final void a(long j12) {
        Q2 q2D;
        C21011f1 c21011f1 = this.f32023a;
        long jA2 = C21021k0.a(c21011f1.l(true));
        C20985q1 c20985q1 = c21011f1.f31986d;
        if (c20985q1 == null || (q2D = c20985q1.d()) == null) {
            return;
        }
        long jE2 = q2D.e(jA2);
        c21011f1.f31997o = jE2;
        C21011f1.a(c21011f1, l0.g.a(jE2));
        l0.g.f413384b.getClass();
        c21011f1.f31999q = 0L;
        C21011f1.b(c21011f1, Handle.f30328b);
        c21011f1.u(false);
    }

    @Override // androidx.compose.foundation.text.W1
    public final void b() {
        C21011f1 c21011f1 = this.f32023a;
        C21011f1.b(c21011f1, null);
        C21011f1.a(c21011f1, null);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.compose.foundation.text.W1
    public final void d(long j12) {
        Q2 q2D;
        InterfaceC44967a interfaceC44967a;
        C21011f1 c21011f1 = this.f32023a;
        c21011f1.f31999q = l0.g.j(c21011f1.f31999q, j12);
        C20985q1 c20985q1 = c21011f1.f31986d;
        if (c20985q1 == null || (q2D = c20985q1.d()) == null) {
            return;
        }
        ((C22082i3) c21011f1.f32001s).setValue(l0.g.a(l0.g.j(c21011f1.f31997o, c21011f1.f31999q)));
        int iA2 = c21011f1.f31984b.a(q2D.b(c21011f1.i().f413387a, true));
        long jA2 = androidx.compose.ui.text.w0.a(iA2, iA2);
        if (androidx.compose.ui.text.v0.c(jA2, c21011f1.m().f42384b)) {
            return;
        }
        C20985q1 c20985q12 = c21011f1.f31986d;
        if ((c20985q12 == null || ((Boolean) ((C22082i3) c20985q12.f31794q).getF42167b()).booleanValue()) && (interfaceC44967a = c21011f1.f31993k) != null) {
            p0.b.f422385b.getClass();
            interfaceC44967a.a(b.a.b());
        }
        c21011f1.f31985c.invoke(C21011f1.e(c21011f1.m().f42383a, jA2));
    }

    @Override // androidx.compose.foundation.text.W1
    public final void onStop() {
        C21011f1 c21011f1 = this.f32023a;
        C21011f1.b(c21011f1, null);
        C21011f1.a(c21011f1, null);
    }

    @Override // androidx.compose.foundation.text.W1
    public final void c() {
    }

    @Override // androidx.compose.foundation.text.W1
    public final void onCancel() {
    }
}

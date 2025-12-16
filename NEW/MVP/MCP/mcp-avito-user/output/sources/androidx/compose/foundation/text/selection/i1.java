package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.Q2;
import androidx.compose.foundation.text.W1;
import androidx.compose.foundation.text.selection.InterfaceC21049z;
import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;

/* compiled from: TextFieldSelectionManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/i1;", "Landroidx/compose/foundation/text/W1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i1 implements W1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f32041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f32042b;

    public i1(C21011f1 c21011f1, boolean z12) {
        this.f32041a = c21011f1;
        this.f32042b = z12;
    }

    @Override // androidx.compose.foundation.text.W1
    public final void b() {
        C21011f1 c21011f1 = this.f32041a;
        C21011f1.b(c21011f1, null);
        C21011f1.a(c21011f1, null);
        c21011f1.u(true);
    }

    @Override // androidx.compose.foundation.text.W1
    public final void c() {
        Q2 q2D;
        boolean z12 = this.f32042b;
        Handle handle = z12 ? Handle.f30329c : Handle.f30330d;
        C21011f1 c21011f1 = this.f32041a;
        ((C22082i3) c21011f1.f32000r).setValue(handle);
        long jA2 = C21021k0.a(c21011f1.l(z12));
        C20985q1 c20985q1 = c21011f1.f31986d;
        if (c20985q1 == null || (q2D = c20985q1.d()) == null) {
            return;
        }
        long jE2 = q2D.e(jA2);
        c21011f1.f31997o = jE2;
        ((C22082i3) c21011f1.f32001s).setValue(l0.g.a(jE2));
        l0.g.f413384b.getClass();
        c21011f1.f31999q = 0L;
        c21011f1.f32002t = -1;
        C20985q1 c20985q12 = c21011f1.f31986d;
        if (c20985q12 != null) {
            ((C22082i3) c20985q12.f31794q).setValue(Boolean.TRUE);
        }
        c21011f1.u(false);
    }

    @Override // androidx.compose.foundation.text.W1
    public final void d(long j12) {
        C21011f1 c21011f1 = this.f32041a;
        long j13 = l0.g.j(c21011f1.f31999q, j12);
        c21011f1.f31999q = j13;
        ((C22082i3) c21011f1.f32001s).setValue(l0.g.a(l0.g.j(c21011f1.f31997o, j13)));
        androidx.compose.ui.text.input.W wM2 = c21011f1.m();
        l0.g gVarI = c21011f1.i();
        InterfaceC21049z.f32167a.getClass();
        C21011f1.c(c21011f1, wM2, gVarI.f413387a, false, this.f32042b, InterfaceC21049z.a.f32173f, true);
        c21011f1.u(false);
    }

    @Override // androidx.compose.foundation.text.W1
    public final void onStop() {
        C21011f1 c21011f1 = this.f32041a;
        C21011f1.b(c21011f1, null);
        C21011f1.a(c21011f1, null);
        c21011f1.u(true);
    }

    @Override // androidx.compose.foundation.text.W1
    public final void onCancel() {
    }

    @Override // androidx.compose.foundation.text.W1
    public final void a(long j12) {
    }
}

package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.InterfaceC21028o;
import androidx.compose.foundation.text.selection.InterfaceC21049z;
import androidx.compose.foundation.text.selection.V0;
import androidx.compose.foundation.text.selection.Z0;
import androidx.compose.ui.layout.A;
import kotlin.Metadata;

/* compiled from: SelectionController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/modifiers/m;", "Landroidx/compose/foundation/text/selection/o;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m implements InterfaceC21028o {

    /* renamed from: a, reason: collision with root package name */
    public long f31682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.a<A> f31683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V0 f31684c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f31685d;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Y41.a<? extends A> aVar, V0 v02, long j12) {
        this.f31683b = aVar;
        this.f31684c = v02;
        this.f31685d = j12;
        l0.g.f413384b.getClass();
        this.f31682a = 0L;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21028o
    public final boolean a(long j12, InterfaceC21049z interfaceC21049z) {
        A a12 = (A) ((j) this.f31683b).invoke();
        if (a12 == null) {
            return true;
        }
        if (!a12.m()) {
            return false;
        }
        long j13 = this.f31685d;
        V0 v02 = this.f31684c;
        if (!Z0.a(v02, j13)) {
            return false;
        }
        if (!v02.g(a12, j12, this.f31682a, interfaceC21049z, false)) {
            return true;
        }
        this.f31682a = j12;
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21028o
    public final void b() {
        this.f31684c.c();
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21028o
    public final boolean c(long j12, InterfaceC21049z interfaceC21049z) {
        A a12 = (A) ((j) this.f31683b).invoke();
        if (a12 == null || !a12.m()) {
            return false;
        }
        V0 v02 = this.f31684c;
        v02.i(a12, j12, interfaceC21049z, false);
        this.f31682a = j12;
        return Z0.a(v02, this.f31685d);
    }
}

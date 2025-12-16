package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.W1;
import androidx.compose.foundation.text.selection.InterfaceC21049z;
import androidx.compose.foundation.text.selection.V0;
import androidx.compose.foundation.text.selection.Z0;
import androidx.compose.ui.layout.A;
import kotlin.Metadata;

/* compiled from: SelectionController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/modifiers/l;", "Landroidx/compose/foundation/text/W1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements W1 {

    /* renamed from: a, reason: collision with root package name */
    public long f31677a;

    /* renamed from: b, reason: collision with root package name */
    public long f31678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a<A> f31679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V0 f31680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f31681e;

    /* JADX WARN: Multi-variable type inference failed */
    public l(Y41.a<? extends A> aVar, V0 v02, long j12) {
        this.f31679c = aVar;
        this.f31680d = v02;
        this.f31681e = j12;
        l0.g.f413384b.getClass();
        this.f31677a = 0L;
        this.f31678b = 0L;
    }

    @Override // androidx.compose.foundation.text.W1
    public final void a(long j12) {
        A a12 = (A) ((j) this.f31679c).invoke();
        if (a12 != null) {
            if (!a12.m()) {
                return;
            }
            InterfaceC21049z.f32167a.getClass();
            this.f31680d.i(a12, j12, InterfaceC21049z.a.f32171d, true);
            this.f31677a = j12;
        }
        if (Z0.a(this.f31680d, this.f31681e)) {
            l0.g.f413384b.getClass();
            this.f31678b = 0L;
        }
    }

    @Override // androidx.compose.foundation.text.W1
    public final void d(long j12) {
        A a12 = (A) ((j) this.f31679c).invoke();
        if (a12 == null || !a12.m()) {
            return;
        }
        long j13 = this.f31681e;
        V0 v02 = this.f31680d;
        if (Z0.a(v02, j13)) {
            long j14 = l0.g.j(this.f31678b, j12);
            this.f31678b = j14;
            long j15 = l0.g.j(this.f31677a, j14);
            long j16 = this.f31677a;
            InterfaceC21049z.f32167a.getClass();
            if (v02.g(a12, j15, j16, InterfaceC21049z.a.f32171d, true)) {
                this.f31677a = j15;
                l0.g.f413384b.getClass();
                this.f31678b = 0L;
            }
        }
    }

    @Override // androidx.compose.foundation.text.W1
    public final void onCancel() {
        long j12 = this.f31681e;
        V0 v02 = this.f31680d;
        if (Z0.a(v02, j12)) {
            v02.c();
        }
    }

    @Override // androidx.compose.foundation.text.W1
    public final void onStop() {
        long j12 = this.f31681e;
        V0 v02 = this.f31680d;
        if (Z0.a(v02, j12)) {
            v02.c();
        }
    }

    @Override // androidx.compose.foundation.text.W1
    public final void b() {
    }

    @Override // androidx.compose.foundation.text.W1
    public final void c() {
    }
}

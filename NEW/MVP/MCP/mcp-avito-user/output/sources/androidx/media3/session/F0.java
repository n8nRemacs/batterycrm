package androidx.media3.session;

import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.InterfaceC37564s0;

/* compiled from: MediaLibrarySessionImpl.java */
/* loaded from: classes.dex */
class F0 implements InterfaceC37564s0<O0.i> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.e1 f52043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23270w0.b f52044b;

    public F0(com.google.common.util.concurrent.e1 e1Var, AbstractServiceC23270w0.b bVar) {
        this.f52043a = e1Var;
        this.f52044b = bVar;
    }

    @Override // com.google.common.util.concurrent.InterfaceC37564s0
    public final void a(Throwable th2) {
        this.f52043a.n(C23252q.b(-1, this.f52044b));
        androidx.media3.common.util.s.d("Failed fetching recent media item at boot time: " + th2.getMessage(), th2);
    }

    @Override // com.google.common.util.concurrent.InterfaceC37564s0
    public final void onSuccess(O0.i iVar) {
        O0.i iVar2 = iVar;
        boolean zIsEmpty = iVar2.f52223a.isEmpty();
        AbstractServiceC23270w0.b bVar = this.f52044b;
        com.google.common.util.concurrent.e1 e1Var = this.f52043a;
        if (zIsEmpty) {
            e1Var.n(C23252q.b(-2, bVar));
            return;
        }
        e1Var.n(C23252q.g(AbstractC37401r1.E(iVar2.f52223a.get(Math.max(0, Math.min(iVar2.f52224b, r0.size() - 1)))), bVar));
    }
}

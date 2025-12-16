package androidx.media3.session;

import androidx.media3.session.O0;
import com.google.common.util.concurrent.InterfaceC37564s0;
import java.util.List;

/* compiled from: MediaSessionLegacyStub.java */
/* renamed from: androidx.media3.session.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C23209b1 implements InterfaceC37564s0<List<androidx.media3.common.z>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O0.g f52390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C23206a1 f52392c;

    public C23209b1(C23206a1 c23206a1, O0.g gVar, int i12) {
        this.f52392c = c23206a1;
        this.f52390a = gVar;
        this.f52391b = i12;
    }

    @Override // com.google.common.util.concurrent.InterfaceC37564s0
    public final void onSuccess(List<androidx.media3.common.z> list) {
        T0 t02 = this.f52392c.f52357b;
        androidx.media3.common.util.M.I(t02.f52297k, new RunnableC23253q0(t02, this.f52390a, new RunnableC23220f0(this, this.f52391b, list)));
    }

    @Override // com.google.common.util.concurrent.InterfaceC37564s0
    public final void a(Throwable th2) {
    }
}

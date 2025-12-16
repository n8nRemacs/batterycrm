package androidx.media3.session;

import android.os.Bundle;
import android.os.Looper;
import androidx.media3.common.H;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.common.util.r;
import androidx.media3.session.A1;
import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.BinderC23267v0;
import androidx.media3.session.J;
import androidx.media3.session.O0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23261t0 implements BinderC23267v0.a, InterfaceC23119j, A1.e, r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52636c;

    public /* synthetic */ C23261t0(int i12, int i13) {
        this.f52635b = i13;
        this.f52636c = i12;
    }

    @Override // androidx.media3.session.BinderC23267v0.a
    public void a(C23229i0 c23229i0) {
        int i12 = BinderC23267v0.f52647p;
        if (c23229i0.isConnected()) {
            J jC02 = c23229i0.c0();
            jC02.getClass();
            C23110a.g(Looper.myLooper() == jC02.f52080e.getLooper());
            jC02.f52079d.getClass();
            com.google.common.util.concurrent.D0 d0H = J.c.h();
            d0H.N(new RunnableC23220f0(c23229i0, d0H, this.f52636c), com.google.common.util.concurrent.Q0.a());
        }
    }

    @Override // androidx.media3.common.util.InterfaceC23119j
    public void accept(Object obj) {
        int i12 = this.f52636c;
        G1 g12 = (G1) obj;
        switch (this.f52635b) {
            case 1:
                int i13 = A1.f51915u;
                g12.P(i12);
                break;
            case 2:
                int i14 = A1.f51915u;
                g12.s(i12);
                break;
            case 3:
                int i15 = A1.f51915u;
                g12.setRepeatMode(i12);
                break;
            default:
                int i16 = A1.f51915u;
                g12.H(i12);
                break;
        }
    }

    @Override // androidx.media3.session.A1.e
    public Object d(T0 t02, O0.g gVar, int i12) {
        int i13 = A1.f51915u;
        ((G0) t02).getClass();
        throw null;
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        ((H.g) obj).onRepeatModeChanged(this.f52636c);
    }

    public /* synthetic */ C23261t0(int i12, K1 k12, Bundle bundle) {
        this.f52635b = 0;
        this.f52636c = i12;
    }

    public /* synthetic */ C23261t0(String str, int i12, int i13, AbstractServiceC23270w0.b bVar) {
        this.f52635b = 4;
        this.f52636c = i13;
    }
}

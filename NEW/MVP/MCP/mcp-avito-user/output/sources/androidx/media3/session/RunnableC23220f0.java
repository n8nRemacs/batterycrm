package androidx.media3.session;

import android.os.RemoteException;
import androidx.media3.common.util.C23110a;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC23220f0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52457b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52458c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f52460e;

    public /* synthetic */ RunnableC23220f0(C23229i0 c23229i0, com.google.common.util.concurrent.D0 d02, int i12) {
        this.f52459d = c23229i0;
        this.f52460e = d02;
        this.f52458c = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        O1 o12;
        switch (this.f52457b) {
            case 0:
                com.google.common.util.concurrent.D0 d02 = (com.google.common.util.concurrent.D0) this.f52460e;
                int i12 = this.f52458c;
                C23229i0 c23229i0 = (C23229i0) this.f52459d;
                c23229i0.getClass();
                try {
                    o12 = (O1) d02.get();
                    C23110a.e(o12, "SessionResult must not be null");
                } catch (InterruptedException e12) {
                    e = e12;
                    androidx.media3.common.util.s.h("Session operation failed", e);
                    o12 = new O1(-1);
                } catch (CancellationException e13) {
                    androidx.media3.common.util.s.h("Session operation cancelled", e13);
                    o12 = new O1(1);
                } catch (ExecutionException e14) {
                    e = e14;
                    androidx.media3.common.util.s.h("Session operation failed", e);
                    o12 = new O1(-1);
                }
                InterfaceC23246o interfaceC23246o = c23229i0.f52513v;
                if (interfaceC23246o != null) {
                    try {
                        interfaceC23246o.m1(c23229i0.f52494c, i12, o12.k());
                        break;
                    } catch (RemoteException unused) {
                        androidx.media3.common.util.s.g();
                        return;
                    }
                }
                break;
            default:
                C23206a1 c23206a1 = ((C23209b1) this.f52459d).f52392c;
                int i13 = this.f52458c;
                List<androidx.media3.common.z> list = (List) this.f52460e;
                if (i13 != -1) {
                    c23206a1.f52357b.f52302p.T(i13, list);
                    break;
                } else {
                    c23206a1.f52357b.f52302p.Y(list);
                    break;
                }
        }
    }

    public /* synthetic */ RunnableC23220f0(C23209b1 c23209b1, int i12, List list) {
        this.f52459d = c23209b1;
        this.f52458c = i12;
        this.f52460e = list;
    }
}

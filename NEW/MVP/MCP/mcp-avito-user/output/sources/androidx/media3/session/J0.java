package androidx.media3.session;

import android.os.RemoteException;
import androidx.media.C;
import androidx.media3.session.C23206a1;
import androidx.media3.session.O0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class J0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f52093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f52094f;

    public /* synthetic */ J0(int i12, Object obj, int i13, Object obj2, Object obj3) {
        this.f52090b = i13;
        this.f52092d = obj;
        this.f52091c = i12;
        this.f52093e = obj2;
        this.f52094f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f52094f;
        int i12 = this.f52091c;
        Object obj2 = this.f52093e;
        Object obj3 = this.f52092d;
        switch (this.f52090b) {
            case 0:
                M0 m02 = (M0) obj3;
                if (i12 == m02.f52139i) {
                    O0 o02 = (O0) obj2;
                    m02.d(o02, (H0) obj, m02.c(o02, false));
                    break;
                }
                break;
            default:
                C23206a1 c23206a1 = (C23206a1) obj3;
                T0 t02 = c23206a1.f52357b;
                if (!t02.f()) {
                    C.b bVar = (C.b) obj2;
                    if (!c23206a1.f52362g.isActive()) {
                        bVar.b();
                        androidx.media3.common.util.s.g();
                        break;
                    } else {
                        O0.g gVarF = c23206a1.f(bVar);
                        if (gVarF != null && c23206a1.f52356a.h(gVarF, i12)) {
                            t02.f52290d.getClass();
                            C23206a1.g gVar = (C23206a1.g) obj;
                            int i13 = T0.f52286w;
                            int i14 = C23206a1.f52355o;
                            try {
                                gVar.b(gVarF);
                                break;
                            } catch (RemoteException e12) {
                                androidx.media3.common.util.s.h("Exception in " + gVarF, e12);
                            }
                        }
                    }
                }
                break;
        }
    }
}

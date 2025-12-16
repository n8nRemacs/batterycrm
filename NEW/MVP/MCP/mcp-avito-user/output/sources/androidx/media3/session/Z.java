package androidx.media3.session;

import androidx.media3.session.AbstractServiceC23212c1;
import androidx.media3.session.C23229i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class Z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52348c;

    public /* synthetic */ Z(Object obj, int i12) {
        this.f52347b = i12;
        this.f52348c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractServiceC23212c1.c cVar;
        switch (this.f52347b) {
            case 0:
                C23229i0 c23229i0 = (C23229i0) this.f52348c;
                C23229i0.e eVar = c23229i0.f52503l;
                if (eVar != null) {
                    c23229i0.f52495d.unbindService(eVar);
                    c23229i0.f52503l = null;
                }
                c23229i0.f52494c.f52648b.clear();
                return;
            case 1:
                ((J1) this.f52348c).b();
                return;
            case 2:
                ((J) this.f52348c).release();
                return;
            default:
                AbstractServiceC23212c1 abstractServiceC23212c1 = (AbstractServiceC23212c1) this.f52348c;
                synchronized (abstractServiceC23212c1.f52403b) {
                    cVar = abstractServiceC23212c1.f52410i;
                }
                if (cVar != null) {
                    cVar.a();
                    return;
                }
                return;
        }
    }
}

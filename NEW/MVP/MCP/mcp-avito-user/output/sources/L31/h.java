package l31;

import c31.C26934a;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class h implements InterfaceC43538c {

    /* renamed from: a, reason: collision with root package name */
    public final C26934a f413444a;

    /* renamed from: b, reason: collision with root package name */
    public final S51.a f413445b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f413446c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Object f413447d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public f f413448e;

    public h(C26934a c26934a, S51.a aVar) {
        this.f413444a = c26934a;
        this.f413445b = aVar;
        b();
    }

    public final void a() {
        f fVar;
        synchronized (this.f413447d) {
            try {
                if (!this.f413446c.isEmpty() && (fVar = this.f413448e) != null) {
                    List listM0 = C42745f0.M0(this.f413446c);
                    this.f413446c.clear();
                    fVar.f413440a.w(listM0);
                }
                b();
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        long j12 = this.f413444a.f57630d;
        com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f fVar = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(this, 29);
        S51.b bVar = (S51.b) this.f413445b;
        bVar.getClass();
        bVar.removeMessages(1);
        bVar.f14820b.put(1, fVar);
        bVar.sendEmptyMessageDelayed(1, j12);
    }
}

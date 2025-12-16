package retrofit2;

import java.io.IOException;
import retrofit2.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f429997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.b.a f429998c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47648d f429999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f430000e;

    public /* synthetic */ h(g.b.a aVar, InterfaceC47648d interfaceC47648d, Object obj, int i12) {
        this.f429997b = i12;
        this.f429998c = aVar;
        this.f429999d = interfaceC47648d;
        this.f430000e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f429997b) {
            case 0:
                g.b bVar = this.f429998c.f429996c;
                boolean zIsCanceled = bVar.f429994c.isCanceled();
                InterfaceC47648d interfaceC47648d = this.f429999d;
                if (!zIsCanceled) {
                    interfaceC47648d.onResponse(bVar, (y) this.f430000e);
                    break;
                } else {
                    interfaceC47648d.onFailure(bVar, new IOException("Canceled"));
                    break;
                }
            default:
                this.f429999d.onFailure(this.f429998c.f429996c, (Throwable) this.f430000e);
                break;
        }
    }
}

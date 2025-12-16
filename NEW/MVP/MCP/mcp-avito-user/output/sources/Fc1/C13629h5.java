package Fc1;

import Fc1.F7;
import feedback.shared.sdk.api.network.entities.CampaignInfo;
import java.lang.ref.WeakReference;
import javax.inject.Inject;

/* renamed from: Fc1.h5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13629h5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E5 f5553a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public final io.reactivex.rxjava3.disposables.c f5554b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public final G0 f5555c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public final F4 f5556d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public final C13611f5 f5557e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public C13780y4 f5558f;

    /* JADX WARN: Multi-variable type inference failed */
    public C13629h5(@Y61.k WeakReference weakReference, @Y61.k CampaignInfo campaignInfo, @Y61.k Q q12) {
        D6 d62 = F7.a.f4960a;
        D6 d63 = (d62 == null ? null : d62).f4866e;
        E5 e52 = new E5(d63, new V5(), campaignInfo, q12);
        this.f5553a = e52;
        this.f5554b = (io.reactivex.rxjava3.disposables.c) e52.f4919d.get();
        this.f5555c = (G0) d63.f4859G.get();
        this.f5556d = (F4) e52.f4923h.get();
        this.f5557e = (C13611f5) d63.f4869h.get();
        F4 f42 = this.f5556d;
        (f42 == null ? null : f42).f4954a = weakReference;
        this.f5558f = new C13780y4(e52);
        try {
            G0 g02 = this.f5555c;
            if (g02 == null) {
                g02 = null;
            }
            g02.c(campaignInfo);
            C13780y4 c13780y4 = this.f5558f;
            if (c13780y4 != null) {
                InterfaceC13706q1 interfaceC13706q1 = c13780y4.f5900a;
                if (interfaceC13706q1 == null) {
                    interfaceC13706q1 = null;
                }
                U7 u72 = c13780y4.f5902c;
                if (u72 == null) {
                    u72 = null;
                }
                interfaceC13706q1.a(u72.f5239b);
                InterfaceC13706q1 interfaceC13706q12 = c13780y4.f5900a;
                if (interfaceC13706q12 == null) {
                    interfaceC13706q12 = null;
                }
                interfaceC13706q12.show();
            }
        } catch (Exception e12) {
            C13611f5 c13611f5 = this.f5557e;
            (c13611f5 != null ? c13611f5 : null).a(e12);
            a();
        }
    }

    public final void a() {
        try {
            io.reactivex.rxjava3.disposables.c cVar = this.f5554b;
            if (cVar == null) {
                cVar = null;
            }
            cVar.e();
            C13780y4 c13780y4 = this.f5558f;
            if (c13780y4 != null) {
                InterfaceC13706q1 interfaceC13706q1 = c13780y4.f5900a;
                (interfaceC13706q1 != null ? interfaceC13706q1 : null).cancel();
            }
        } catch (Exception unused) {
        }
    }
}

package rb;

import Y61.k;
import androidx.camera.camera2.internal.G;
import androidx.media3.common.C23088b;
import com.avito.android.C30828i;
import com.avito.android.P;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.NoAdException;
import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;
import kotlin.text.C43059p;

/* compiled from: AdsMonitoringInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrb/c;", "Lrb/b;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rb.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47629c implements InterfaceC47628b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f429886a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final H f429887b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C30828i f429888c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f429889d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f429890e;

    @Inject
    public C47629c(@k InterfaceC28373a interfaceC28373a, @k H h12, @k P p12, @k C30828i c30828i, @k BannerPageSource bannerPageSource) {
        this.f429886a = interfaceC28373a;
        this.f429887b = h12;
        this.f429888c = c30828i;
        this.f429889d = new C43059p("\\W").f(p12.f().invoke(), "_");
        this.f429890e = bannerPageSource.f87786b;
    }

    @Override // rb.InterfaceC47628b
    public final void a(@k C47627a c47627a, @k Throwable th2) {
        if (th2 instanceof NoAdException) {
            return;
        }
        f("error", c47627a);
        g("error", c47627a);
        C30828i c30828i = this.f429888c;
        c30828i.getClass();
        n<Object> nVar = C30828i.f164256k[3];
        if (((Boolean) c30828i.f164260e.a().invoke()).booleanValue()) {
            String message = th2.getMessage();
            if (message == null) {
                message = "unknown ads error msg";
            }
            this.f429886a.c(new NonFatalErrorEvent(message, th2, null, NonFatalErrorEvent.a.C4323a.f147930a, 4, null));
        }
    }

    @Override // rb.InterfaceC47628b
    public final void b(@k C47627a c47627a) {
        f("failure", c47627a);
    }

    @Override // rb.InterfaceC47628b
    public final void c(@k C47627a c47627a) {
        f("noAd", c47627a);
    }

    @Override // rb.InterfaceC47628b
    public final void d(@k C47627a c47627a) {
        f("success", c47627a);
        g("success", c47627a);
    }

    @Override // rb.InterfaceC47628b
    public final void e(@k String str, @k String str2, @k String str3, boolean z12) {
        this.f429886a.c(new y.a(G.g(C23088b.b("advertising.domain_result.", z12 ? "success" : "error", ".selling_system.", str, ".position."), str2, ".id.", str3), 0L, 2, null));
    }

    public final void f(String str, C47627a c47627a) {
        StringBuilder sb2 = new StringBuilder("advertising.ver." + this.f429889d + '.' + str + ".page." + this.f429890e + ".position." + c47627a.f429882a);
        if (!str.equals("failure")) {
            sb2.append(".order." + c47627a.f429884c + ".selling_system." + c47627a.f429883b.toLowerCase(Locale.getDefault()));
        }
        this.f429886a.c(new y.a(sb2.toString(), 0L, 2, null));
    }

    public final void g(String str, C47627a c47627a) {
        this.f429886a.c(new y.c("advertising.ver." + this.f429889d + ".page." + this.f429890e + ".position." + c47627a.f429882a + ".selling_system." + c47627a.f429883b.toLowerCase(Locale.getDefault()) + ".network_type." + this.f429887b.a() + ".result." + str, Long.valueOf(c47627a.f429885d), null));
    }
}

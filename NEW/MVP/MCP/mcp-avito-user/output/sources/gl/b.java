package GL;

import Y61.k;
import android.os.Bundle;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_enable.IacEnableDeeplink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacEnableDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LGL/b;", "Lev/a;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_enable/IacEnableDeeplink;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC40161a<IacEnableDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f6454f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final F f6455g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC28373a f6456h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final NL.e f6457i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final E f6458j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f6459k = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k F f12, @k InterfaceC28373a interfaceC28373a, @k NL.e eVar, @k E e12) {
        this.f6454f = aVar;
        this.f6455g = f12;
        this.f6456h = interfaceC28373a;
        this.f6457i = eVar;
        this.f6458j = e12;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        IacEnableDeeplink iacEnableDeeplink = (IacEnableDeeplink) deepLink;
        if (!this.f6458j.b()) {
            j(IacEnableDeeplink.b.a.f168397b);
        } else {
            this.f6459k.b(this.f6457i.e(true, false).r().k(new a(0, this, iacEnableDeeplink)).u());
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f6459k.dispose();
    }
}

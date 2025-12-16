package com.avito.android.deeplink_analytics.handling;

import Nu.InterfaceC14612b;
import Ru.InterfaceC15081a;
import Ru.b;
import Y61.k;
import com.avito.android.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_events.events.DeeplinkHandlingResultStatus;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: DeeplinkHandlingAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_analytics/handling/d;", "LNu/b;", "_avito_deeplinks_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class d implements InterfaceC14612b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f134114a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f134115b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final P f134116c;

    @Inject
    public d(@k InterfaceC28373a interfaceC28373a, @k b bVar, @k P p12) {
        this.f134114a = interfaceC28373a;
        this.f134115b = bVar;
        this.f134116c = p12;
    }

    @Override // Nu.InterfaceC14612b
    public final void a(@k InterfaceC15081a interfaceC15081a) {
        boolean zAdd;
        if (interfaceC15081a instanceof b.c) {
            P p12 = this.f134116c;
            p12.getClass();
            n<Object> nVar = P.f67370w0[70];
            if (((Boolean) p12.f67403d0.a().invoke()).booleanValue()) {
                b.c cVar = (b.c) interfaceC15081a;
                DeepLink f14716a = cVar.getF14716a();
                DeeplinkHandlingResultStatus f14715e = cVar.getF14715e();
                String path = f14716a.getPath();
                int version = f14716a.getVersion();
                String str = f14715e.f134144b;
                b bVar = this.f134115b;
                bVar.getClass();
                if (f14715e == DeeplinkHandlingResultStatus.f134138c) {
                    zAdd = bVar.f134112a.add(version + '/' + path);
                } else {
                    zAdd = true;
                }
                if (zAdd) {
                    this.f134114a.c(new a(str, path, version));
                }
            }
        }
    }
}

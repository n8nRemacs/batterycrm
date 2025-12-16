package xs;

import Y61.k;
import Y61.l;
import com.avito.android.B;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CreditPartnerEventAnalytics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxs/b;", "Lxs/a;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49989b implements InterfaceC49988a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f442670a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f442671b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.credits.credit_partner_screen.a f442672c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f442673d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f442674e;

    @Inject
    public C49989b(@k InterfaceC28373a interfaceC28373a, @k @InterfaceC30174s String str, @B @k Kundle kundle, @k com.avito.android.credits.credit_partner_screen.a aVar, @k com.avito.android.analytics.provider.a aVar2) {
        this.f442670a = interfaceC28373a;
        this.f442671b = str;
        this.f442672c = aVar;
        this.f442673d = kundle.g("key_session");
        this.f442674e = aVar2.a();
    }

    public final void a(int i12, @l String str) {
        this.f442670a.c(new d(i12, this.f442674e, this.f442671b, this.f442672c.f128769a, this.f442673d, str));
    }
}

package Va;

import Wa.C15735a;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: AdvertCollectionSharingAnalyticsInteractor.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVa/a;", "LM7/a;", "_avito_advert-collection-sharing-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Va.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15659a implements M7.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f17199a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public C15735a f17200b = new C15735a(null, null, null, null);

    @Inject
    public C15659a(@k InterfaceC28373a interfaceC28373a) {
        this.f17199a = interfaceC28373a;
    }

    @Override // M7.a
    public final void a(@k String str) {
        C15735a c15735a = this.f17200b;
        this.f17199a.c(new Wa.b(c15735a.f17949a, c15735a.f17950b, c15735a.f17951c, c15735a.f17952d, str));
    }

    @Override // M7.a
    public final void b(@k String str) {
        C15735a c15735a = this.f17200b;
        String str2 = c15735a.f17949a;
        String str3 = c15735a.f17950b;
        Boolean bool = c15735a.f17951c;
        c15735a.getClass();
        this.f17200b = new C15735a(str2, str3, bool, str);
    }

    @Override // M7.a
    public final void c(@l String str, @k String str2, @k String str3, boolean z12) {
        this.f17200b = new C15735a(str, str2, Boolean.valueOf(z12), str3);
    }
}

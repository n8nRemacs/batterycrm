package com.yandex.metrica.billing.v4.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.yandex.metrica.impl.ob.C38864i;
import com.yandex.metrica.impl.ob.InterfaceC38888j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/metrica/billing/v4/library/c;", "Lcom/android/billingclient/api/BillingClientStateListener;", "billing-v4_publicBinaryProdRelease"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class c implements BillingClientStateListener {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f377585d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final BillingClient f377586a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC38888j f377587b;

    /* renamed from: c, reason: collision with root package name */
    public final o f377588c;

    public c(@Y61.k C38864i c38864i, @Y61.k BillingClient billingClient, @Y61.k InterfaceC38888j interfaceC38888j) {
        o oVar = new o(billingClient, null, 2);
        this.f377586a = billingClient;
        this.f377587b = interfaceC38888j;
        this.f377588c = oVar;
    }
}

package com.avito.android.sx_address.list.analytics;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SxAddressListAnalyticsDataProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/analytics/g;", "", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    @l
    public volatile Long f293057b;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public volatile String f293056a = "";

    /* renamed from: c, reason: collision with root package name */
    public volatile long f293058c = -1;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public volatile FromPage f293059d = FromPage.f293046b;

    @Inject
    public g() {
    }

    @Y61.k
    public final String a() {
        if (this.f293056a.length() == 0) {
            V2.f318762a.e("SxAddressListAnalytics data is not setup", null);
        }
        return this.f293056a;
    }
}

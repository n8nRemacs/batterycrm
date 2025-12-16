package com.avito.android.sx_address.new_address.analytics;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SxNewAddressAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/analytics/f;", "Lcom/avito/android/sx_address/new_address/analytics/e;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f293578a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f293579b;

    @Inject
    public f(@k InterfaceC28373a interfaceC28373a, @k c cVar) {
        this.f293578a = interfaceC28373a;
        this.f293579b = cVar;
    }

    @Override // com.avito.android.sx_address.new_address.analytics.e
    public final void a(@l Long l12, @l Long l13, @l String str) {
        String str2 = this.f293579b.f293574a;
        if (str2 != null) {
            this.f293578a.c(new b(str2, l12, l13, str, this.f293579b.f293577d));
        }
    }

    @Override // com.avito.android.sx_address.new_address.analytics.e
    public final void b(@l Long l12, @l Long l13, @k FormInputFieldName formInputFieldName) {
        String str = this.f293579b.f293574a;
        if (str != null) {
            this.f293578a.c(new a(str, l12, l13, formInputFieldName.name().toLowerCase(Locale.ROOT), this.f293579b.f293577d));
        }
    }
}

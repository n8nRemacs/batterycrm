package com.avito.android.credits.credit_partner_screen.di;

import Y61.k;
import com.avito.android.analytics.screens.r;
import com.avito.android.credits.credit_partner_screen.CreditPartnerFragment;
import com.avito.android.credits.di.m;
import com.avito.android.credits.di.n;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.util.Kundle;
import h31.d;
import kotlin.Metadata;

/* compiled from: CreditPartnerComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/di/a;", "", "a", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CreditPartnerComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/di/a$a;", "", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.credits.credit_partner_screen.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3817a {
        @k
        a a(@k b bVar, @h31.b @k com.avito.android.credits.credit_partner_screen.a aVar, @m @h31.b @k String str, @h31.b @k @InterfaceC30174s String str2, @n @h31.b boolean z12, @h31.b @com.avito.android.B @k Kundle kundle, @h31.b @k r rVar);
    }

    void a(@k CreditPartnerFragment creditPartnerFragment);
}

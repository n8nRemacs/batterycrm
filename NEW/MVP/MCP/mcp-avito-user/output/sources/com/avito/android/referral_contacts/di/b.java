package com.avito.android.referral_contacts.di;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.referral_contacts.ui.ReferralContactsActivity;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: ReferralContactsComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/referral_contacts/di/b;", "", "a", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: ReferralContactsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_contacts/di/b$a;", "", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k Resources resources, @k c cVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k C28478k c28478k);
    }

    void a(@k ReferralContactsActivity referralContactsActivity);
}

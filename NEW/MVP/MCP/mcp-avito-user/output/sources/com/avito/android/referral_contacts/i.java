package com.avito.android.referral_contacts;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReferralContactsResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_contacts/i;", "Lcom/avito/android/referral_contacts/h;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f252500a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f252501b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f252502c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f252503d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f252504e;

    @Inject
    public i(@k Resources resources) throws Resources.NotFoundException {
        this.f252500a = resources.getString(R.string.search_bar_hint);
        resources.getString(R.string.share_button_text);
        this.f252501b = resources.getString(R.string.referral_contacts_permission_custom_dialog_title);
        this.f252502c = resources.getString(R.string.referral_contacts_permission_custom_dialog_text);
        this.f252503d = resources.getString(R.string.referral_contacts_permission_custom_dialog_positive_button);
        this.f252504e = resources.getString(R.string.referral_contacts_permission_custom_dialog_negative_button);
    }

    @Override // com.avito.android.referral_contacts.h
    @k
    /* renamed from: a, reason: from getter */
    public final String getF252500a() {
        return this.f252500a;
    }

    @Override // com.avito.android.referral_contacts.h
    @k
    /* renamed from: b, reason: from getter */
    public final String getF252504e() {
        return this.f252504e;
    }

    @Override // com.avito.android.referral_contacts.h
    @k
    /* renamed from: c, reason: from getter */
    public final String getF252503d() {
        return this.f252503d;
    }

    @Override // com.avito.android.referral_contacts.h
    @k
    /* renamed from: d, reason: from getter */
    public final String getF252502c() {
        return this.f252502c;
    }

    @Override // com.avito.android.referral_contacts.h
    @k
    /* renamed from: e, reason: from getter */
    public final String getF252501b() {
        return this.f252501b;
    }
}

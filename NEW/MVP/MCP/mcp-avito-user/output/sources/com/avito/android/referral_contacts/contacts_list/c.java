package com.avito.android.referral_contacts.contacts_list;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: ContactItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/referral_contacts/contacts_list/c;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f252404b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f252405c;

    public c(@k View view) {
        super(view);
        this.f252404b = (TextView) view.findViewById(R.id.contact_name);
        this.f252405c = (TextView) view.findViewById(R.id.contact_phone_number);
    }
}

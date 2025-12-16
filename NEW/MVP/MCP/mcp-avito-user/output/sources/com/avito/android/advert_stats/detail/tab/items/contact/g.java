package com.avito.android.advert_stats.detail.tab.items.contact;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: ContactsPerPeriodView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/contact/g;", "Lcom/avito/android/advert_stats/detail/tab/items/contact/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f86387b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f86388c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f86389d;

    public g(@k View view) {
        super(view);
        this.f86387b = view;
        this.f86388c = (TextView) view.findViewById(R.id.tv_contact_text_item);
        this.f86389d = (TextView) view.findViewById(R.id.tv_contact_count_item);
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.contact.f
    public final void Ht(@k ContactsPerPeriodItem contactsPerPeriodItem) {
        this.f86388c.setText(contactsPerPeriodItem.f86380c);
        this.f86389d.setText(contactsPerPeriodItem.f86381d);
    }
}

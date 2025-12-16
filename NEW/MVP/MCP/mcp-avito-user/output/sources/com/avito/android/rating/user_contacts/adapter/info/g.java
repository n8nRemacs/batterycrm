package com.avito.android.rating.user_contacts.adapter.info;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InfoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/user_contacts/adapter/info/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating/user_contacts/adapter/info/f;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f247722b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f247723c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.contacts_info_item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f247722b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.contacts_info_item_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f247723c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.rating.user_contacts.adapter.info.f
    public final void f(@l String str) {
        I5.a(this.f247723c, str, false);
    }

    @Override // com.avito.android.rating.user_contacts.adapter.info.f
    public final void setTitle(@k String str) {
        I5.a(this.f247722b, str, false);
    }
}

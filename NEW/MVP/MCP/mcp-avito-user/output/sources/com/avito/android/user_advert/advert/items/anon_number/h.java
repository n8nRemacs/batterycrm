package com.avito.android.user_advert.advert.items.anon_number;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: AnonNumberItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/anon_number/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/anon_number/g;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f309206b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f309207c;

    public h(@k View view) {
        super(view);
        this.f309206b = (TextView) view.findViewById(R.id.anonymous_number_title);
        this.f309207c = (TextView) view.findViewById(R.id.anonymous_number_subtitle);
    }

    @Override // com.avito.android.user_advert.advert.items.anon_number.g
    public final void b(@l String str) {
        I5.a(this.f309206b, str, false);
    }

    @Override // com.avito.android.user_advert.advert.items.anon_number.g
    public final void j(@l String str) {
        I5.a(this.f309207c, str, false);
    }
}

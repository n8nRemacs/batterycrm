package com.avito.android.user_advert.advert.items.safe_show;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafeShowItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_show/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/safe_show/h;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f310090c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f310091b;

    public i(@k View view) {
        super(view);
        this.f310091b = (TextView) view;
    }

    @Override // com.avito.android.user_advert.advert.items.safe_show.h
    public final void Sf(@k Y41.a<G0> aVar) {
        this.f310091b.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(28, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f310091b.setOnClickListener(null);
    }

    @Override // com.avito.android.user_advert.advert.items.safe_show.h
    public final void r50(@k String str) {
        this.f310091b.setText(str);
    }
}

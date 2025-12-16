package com.avito.android.user_advert.advert.items.address;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.messenger.channels.adapter.konveyor.channel.o;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AddressItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/address/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/address/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f309077d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f309078b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f309079c;

    public j(@k View view) {
        super(view);
        this.f309078b = view;
        this.f309079c = (TextView) view.findViewById(R.id.advert_address);
    }

    @Override // com.avito.android.user_advert.advert.items.address.i
    public final void B0(@k String str) {
        this.f309079c.setText(str);
    }

    @Override // com.avito.android.user_advert.advert.items.address.i
    public final void Ie(@k Y41.a<G0> aVar) {
        this.f309078b.setOnLongClickListener(new o(1, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        View view = this.f309078b;
        view.setOnClickListener(null);
        view.setOnLongClickListener(null);
    }

    @Override // com.avito.android.user_advert.advert.items.address.i
    public final void wG(@k Y41.a<G0> aVar) {
        this.f309078b.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(11, aVar));
    }
}

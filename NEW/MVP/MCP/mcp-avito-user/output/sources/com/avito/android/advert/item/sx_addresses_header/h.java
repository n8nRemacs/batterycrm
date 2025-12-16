package com.avito.android.advert.item.sx_addresses_header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSxAddressesHeaderView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/sx_addresses_header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/sx_addresses_header/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f80508b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f80509c;

    public h(@k View view) {
        super(view);
        this.f80508b = view;
        this.f80509c = (TextView) view;
    }

    @Override // com.avito.android.advert.item.sx_addresses_header.g
    public final void J2(@InterfaceC42150f int i12) {
        TextView textView = this.f80509c;
        textView.setTextAppearance(C35835l0.j(i12, textView.getContext()));
    }

    @Override // com.avito.android.advert.item.sx_addresses_header.g
    public final void M8(int i12) {
        this.f80509c.setTextAppearance(i12);
    }

    @Override // com.avito.android.advert.item.sx_addresses_header.g
    public final void k3(int i12) {
        D6.c(this.f80509c, null, Integer.valueOf(D6.j(this.f80508b, i12)), null, null, 13);
    }

    @Override // com.avito.android.advert.item.sx_addresses_header.g
    public final void setTitle(@k String str) {
        I5.a(this.f80509c, str, false);
    }
}

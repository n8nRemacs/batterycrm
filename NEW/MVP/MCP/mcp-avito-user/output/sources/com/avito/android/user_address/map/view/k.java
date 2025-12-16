package com.avito.android.user_address.map.view;

import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.user_address.map.mvi.UserAddressMapShortAddressMviState;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: UserAddressMapSellerAddAddressViewImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/map/view/k;", "Lcom/avito/android/user_address/map/view/d;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapShortAddressMviState;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends d<UserAddressMapShortAddressMviState> {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public Button f307985r;

    @Override // com.avito.android.user_address.map.view.h
    public final void G(@Y61.k Toolbar toolbar) {
        ((TextView) toolbar.findViewById(R.id.toolbar_title)).setText(R.string.new_address_title);
        D6.w(toolbar.findViewById(R.id.delete_image_button));
    }

    @Override // com.avito.android.user_address.map.view.d, com.avito.android.user_address.map.view.h
    public final void c(@Y61.k com.avito.android.user_address.map.e eVar) {
        super.c(eVar);
        Button button = this.f307985r;
        button.setText(R.string.button_continue);
        button.setOnClickListener(new a(eVar, 6));
    }
}

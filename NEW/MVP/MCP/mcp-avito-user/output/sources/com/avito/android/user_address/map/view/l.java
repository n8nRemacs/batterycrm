package com.avito.android.user_address.map.view;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.user_address.NavigationController;
import com.avito.android.user_address.map.mvi.UserAddressMapShortAddressMviState;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserAddressMapShortAddressViewImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/map/view/l;", "Lcom/avito/android/user_address/map/view/d;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapShortAddressMviState;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends d<UserAddressMapShortAddressMviState> {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final NavigationController.Mode f307986r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Button f307987s;

    /* compiled from: UserAddressMapShortAddressViewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[NavigationController.Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NavigationController.Mode mode = NavigationController.Mode.f307098b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public l(@Y61.k View view, @Y61.k NavigationController.Mode mode) {
        super(view, true);
        this.f307986r = mode;
        this.f307987s = (Button) view.findViewById(R.id.button);
    }

    @Override // com.avito.android.user_address.map.view.h
    public final void G(@Y61.k Toolbar toolbar) {
        int i12;
        int iOrdinal = this.f307986r.ordinal();
        if (iOrdinal == 0) {
            i12 = R.string.new_address_title;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.string.edit_address_title;
        }
        ((TextView) toolbar.findViewById(R.id.toolbar_title)).setText(i12);
        D6.w(toolbar.findViewById(R.id.delete_image_button));
    }

    @Override // com.avito.android.user_address.map.view.d, com.avito.android.user_address.map.view.h
    public final void c(@Y61.k com.avito.android.user_address.map.e eVar) {
        super.c(eVar);
        this.f307987s.setOnClickListener(new com.avito.android.user_address.map.view.a(eVar, 7));
    }
}

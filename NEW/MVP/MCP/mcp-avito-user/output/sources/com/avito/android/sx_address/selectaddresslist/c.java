package com.avito.android.sx_address.selectaddresslist;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectAddressListResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/c;", "Lcom/avito/android/sx_address/selectaddresslist/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f294032a;

    @Inject
    public c(@k Resources resources) throws Resources.NotFoundException {
        resources.getString(R.string.select_address_list_title);
        resources.getString(R.string.select_address_list_button_add_more);
        this.f294032a = resources.getString(R.string.select_address_list_button_select);
        resources.getString(R.string.sx_publish_add_address_business_title);
    }

    @Override // com.avito.android.sx_address.selectaddresslist.b
    @k
    /* renamed from: a, reason: from getter */
    public final String getF294032a() {
        return this.f294032a;
    }
}

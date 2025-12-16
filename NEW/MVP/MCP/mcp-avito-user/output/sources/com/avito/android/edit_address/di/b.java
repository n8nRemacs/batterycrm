package com.avito.android.edit_address.di;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.edit_address.EditAddressMviFragment;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import h31.d;
import kotlin.Metadata;

/* compiled from: EditAddressComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_address/di/b;", "", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: EditAddressComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/di/b$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k EditAddressMviFragment editAddressMviFragment, @h31.b @k String str, @h31.b @l ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress, @h31.b @k Resources resources, @h31.b boolean z12, @h31.b @k C28478k c28478k, @k InterfaceC29970g interfaceC29970g);
    }

    void a(@k EditAddressMviFragment editAddressMviFragment);
}

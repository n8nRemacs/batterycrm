package com.avito.android.edit_address;

import com.avito.android.edit_address.entity.AddressCoordinates;
import com.avito.android.edit_address.entity.AddressWorkSchedule;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import java.util.List;
import jy.InterfaceC42444b;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EditAddressInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/e;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface e {
    @Y61.k
    InterfaceC43160i<InterfaceC42444b> a(@Y61.k CommonValueId commonValueId, @Y61.k AddressCoordinates addressCoordinates, @Y61.l String str, @Y61.l String str2, @Y61.k List<AddressWorkSchedule> list);

    @Y61.k
    InterfaceC43160i<InterfaceC42444b> b(@Y61.k CommonValueId commonValueId, @Y61.k AddressCoordinates addressCoordinates, @Y61.l String str, @Y61.l String str2, @Y61.k List<AddressWorkSchedule> list);
}

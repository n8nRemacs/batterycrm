package com.avito.android.profile_settings_extended.phones;

import Y61.k;
import Y61.l;
import com.avito.android.profile_settings_extended.adapter.phones.ExtendedSettingsPhonesItem;
import com.avito.android.profile_settings_extended.adapter.phones.PhoneValue;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileSettingsPhonesInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/phones/a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: ExtendedProfileSettingsPhonesInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_extended.phones.a$a, reason: collision with other inner class name */
    public static final class C7020a {
    }

    @k
    C43210w a(@k PhoneValue phoneValue);

    @k
    InterfaceC43160i<ExtendedProfileSettingsInternalAction> b(@k String str, @k String str2, @k List<String> list);

    @k
    InterfaceC43160i<ExtendedProfileSettingsInternalAction> c(@k String str, @k String str2, @l PhoneValue phoneValue);

    @k
    InterfaceC43160i<ExtendedProfileSettingsInternalAction> d(@k ExtendedSettingsPhonesItem.Phone phone);
}

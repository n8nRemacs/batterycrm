package com.avito.android.profile_settings_basic.adapter.section_header;

import Y61.k;
import com.avito.android.profile_settings_basic.adapter.BasicSettingsListItem;
import com.avito.android.profile_settings_basic.adapter.section_header.SectionHeaderItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionHeaderItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-management_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {
    public static final int a(@k ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            BasicSettingsListItem basicSettingsListItem = (BasicSettingsListItem) it.next();
            if ((basicSettingsListItem instanceof SectionHeaderItem) && ((SectionHeaderItem) basicSettingsListItem).f228674e == SectionHeaderItem.Type.f228676c) {
                return i12;
            }
            i12++;
        }
        return -1;
    }
}

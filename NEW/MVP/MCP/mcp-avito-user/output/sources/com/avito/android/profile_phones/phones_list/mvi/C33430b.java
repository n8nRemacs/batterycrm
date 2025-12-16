package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PhonesDeviceListConverter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/b;", "Lcom/avito/android/profile_phones/phones_list/mvi/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_phones.phones_list.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33430b implements InterfaceC33429a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.H f227952a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_phones.phones_list.L f227953b;

    @Inject
    public C33430b(@Y61.k com.avito.android.remote.H h12, @Y61.k com.avito.android.profile_phones.phones_list.L l12) {
        this.f227952a = h12;
        this.f227953b = l12;
    }

    @Override // com.avito.android.profile_phones.phones_list.mvi.InterfaceC33429a
    @Y61.k
    public final ArrayList a(@Y61.k List list) {
        List<NL.b> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (NL.b bVar : list2) {
            String str = bVar.f11376b;
            Integer num = bVar.f11377c;
            int iIntValue = num != null ? num.intValue() : 0;
            int size = list.size();
            String str2 = bVar.f11376b;
            boolean zB2 = b(size, str2);
            String str3 = bVar.f11378d;
            com.avito.android.profile_phones.phones_list.L l12 = this.f227953b;
            String strF = str3 != null ? l12.f(str3) : null;
            if (str2.equals(this.f227952a.getValue())) {
                strF = strF != null ? l12.a(strF) : l12.getF227353g();
            }
            arrayList.add(new DeviceListItem(str, bVar.f11375a, strF, iIntValue, zB2));
        }
        return arrayList;
    }

    @Override // com.avito.android.profile_phones.phones_list.mvi.InterfaceC33429a
    public final boolean b(int i12, @Y61.k String str) {
        return i12 > 1 && !str.equals(this.f227952a.getValue());
    }
}

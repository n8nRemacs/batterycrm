package com.avito.android.edit_address.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.edit_address.entity.AddressCoordinates;
import com.avito.android.edit_address.entity.AddressWorkSchedule;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import com.avito.android.edit_address.entity.TimeInterval;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.util.InterfaceC35863o4;
import dy.InterfaceC39826b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jy.C42446d;
import jy.InterfaceC42444b;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EditAddressReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_address/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Ljy/b;", "Ljy/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements u<InterfaceC42444b, C42446d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f145969b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.adapter.geo.a f145970c;

    @Inject
    public m(@Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k com.avito.android.profile_settings_extended.adapter.geo.a aVar) {
        this.f145969b = interfaceC35863o4;
        this.f145970c = aVar;
    }

    public static C42446d.a c(C42446d.a aVar, String str, Y41.l lVar) {
        List<AddressWorkSchedule> list = aVar.f405942f;
        Iterator<AddressWorkSchedule> it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(it.next().f145895b, str)) {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            return aVar;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(i12, lVar.invoke(list.get(i12)));
        return C42446d.a.a(aVar, null, null, arrayList, false, false, 223);
    }

    @Override // com.avito.android.arch.mvi.u
    public final C42446d a(InterfaceC42444b interfaceC42444b, C42446d c42446d) {
        C42446d.a aVar;
        InterfaceC42444b interfaceC42444b2 = interfaceC42444b;
        C42446d c42446d2 = c42446d;
        boolean z12 = interfaceC42444b2 instanceof InterfaceC42444b.c;
        InterfaceC35863o4 interfaceC35863o4 = this.f145969b;
        if (z12) {
            InterfaceC42444b.c cVar = (InterfaceC42444b.c) interfaceC42444b2;
            ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress = cVar.f405903b;
            if (extendedProfilesSettingsAddress != null) {
                String str = extendedProfilesSettingsAddress.f145902d;
                if (str == null) {
                    str = extendedProfilesSettingsAddress.f145901c;
                }
                String str2 = str;
                ExtendedProfilesSettingsAddress.StatusField statusField = extendedProfilesSettingsAddress.f145906h;
                String str3 = statusField != null ? statusField.f145907b : null;
                List<AddressWorkSchedule> listSingletonList = extendedProfilesSettingsAddress.f145905g;
                List<AddressWorkSchedule> list = listSingletonList;
                if (list == null || list.isEmpty()) {
                    listSingletonList = Collections.singletonList(new AddressWorkSchedule(interfaceC35863o4.a(), null, null, null, null, 30, null));
                }
                aVar = new C42446d.a(extendedProfilesSettingsAddress.f145900b, str2, extendedProfilesSettingsAddress.f145904f, extendedProfilesSettingsAddress.f145903e, str3, listSingletonList, false, false, 192, null);
            } else {
                aVar = new C42446d.a(new CommonValueId(cVar.f405902a, interfaceC35863o4.a()), null, null, null, null, Collections.singletonList(new AddressWorkSchedule(interfaceC35863o4.a(), null, null, null, null, 30, null)), false, false, 222, null);
            }
            return b(aVar);
        }
        if (interfaceC42444b2 instanceof InterfaceC42444b.e) {
            return b(C42446d.a.a(c42446d2.f405936b, null, null, null, false, false, 97));
        }
        if (interfaceC42444b2 instanceof InterfaceC42444b.g) {
            AddressParameter.Value value = ((InterfaceC42444b.g) interfaceC42444b2).f405907a;
            AddressCoordinates addressCoordinates = new AddressCoordinates(value.getLat(), value.getLng());
            String text = value.getText();
            if (text == null) {
                text = "";
            }
            return b(C42446d.a.a(c42446d2.f405936b, text, addressCoordinates, null, false, false, 97));
        }
        if (interfaceC42444b2 instanceof InterfaceC42444b.a) {
            C42446d.a aVar2 = c42446d2.f405936b;
            return b(C42446d.a.a(aVar2, null, null, C42745f0.h0(Collections.singletonList(new AddressWorkSchedule(interfaceC35863o4.a(), null, null, null, null, 30, null)), aVar2.f405942f), false, false, 159));
        }
        boolean z13 = interfaceC42444b2 instanceof InterfaceC42444b.i;
        C42446d.a aVar3 = c42446d2.f405936b;
        if (z13) {
            List<AddressWorkSchedule> list2 = aVar3.f405942f;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!L.f(((AddressWorkSchedule) obj).f145895b, ((InterfaceC42444b.i) interfaceC42444b2).f405910a.f145796c)) {
                    arrayList.add(obj);
                }
            }
            return b(C42446d.a.a(aVar3, null, null, arrayList, false, false, 223));
        }
        if (interfaceC42444b2 instanceof InterfaceC42444b.p) {
            InterfaceC42444b.p pVar = (InterfaceC42444b.p) interfaceC42444b2;
            TimeInterval timeInterval = pVar.f405921a;
            C42446d.a aVarC = timeInterval != null ? c(aVar3, pVar.f405922b, new j(timeInterval)) : null;
            return aVarC != null ? b(aVarC) : c42446d2;
        }
        if (interfaceC42444b2 instanceof InterfaceC42444b.C11592b) {
            InterfaceC42444b.C11592b c11592b = (InterfaceC42444b.C11592b) interfaceC42444b2;
            TimeInterval timeInterval2 = c11592b.f405900a;
            C42446d.a aVarC2 = timeInterval2 != null ? c(aVar3, c11592b.f405901b, new k(timeInterval2)) : null;
            return aVarC2 != null ? b(aVarC2) : c42446d2;
        }
        if (interfaceC42444b2 instanceof InterfaceC42444b.h) {
            return b(c(aVar3, ((InterfaceC42444b.h) interfaceC42444b2).f405909b, new l(interfaceC42444b2)));
        }
        if (interfaceC42444b2 instanceof InterfaceC42444b.o) {
            return b(C42446d.a.a(aVar3, null, null, null, true, true, 63));
        }
        boolean z14 = interfaceC42444b2 instanceof InterfaceC42444b.j;
        List<InterfaceC39826b> list3 = c42446d2.f405935a.f405945a;
        return z14 ? C42446d.a(c42446d2, new C42446d.c(list3, true)) : interfaceC42444b2 instanceof InterfaceC42444b.m ? C42446d.a(c42446d2, new C42446d.c(list3, false)) : interfaceC42444b2 instanceof InterfaceC42444b.n ? C42446d.a(c42446d2, new C42446d.c(list3, false)) : c42446d2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jy.C42446d b(jy.C42446d.a r27) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_address.mvi.m.b(jy.d$a):jy.d");
    }
}

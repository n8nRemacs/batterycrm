package com.avito.android.profile_settings_basic.mvi;

import Pb0.C14765a;
import Qb0.InterfaceC14879b;
import Qb0.d;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_basic.adapter.BasicSettingsListItem;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.profile_settings_basic.adapter.error_item.ErrorItem;
import com.avito.android.profile_settings_basic.adapter.progress_item.ProgressItem;
import com.avito.android.profile_settings_basic.adapter.section_header.SectionHeaderItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: BasicProfileSettingsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_settings_basic/mvi/x;", "Lcom/avito/android/arch/mvi/u;", "LQb0/b;", "LQb0/d;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class x implements com.avito.android.arch.mvi.u<InterfaceC14879b, Qb0.d> {
    @Inject
    public x() {
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            BasicSettingsListItem basicSettingsListItem = (BasicSettingsListItem) obj;
            if (!(basicSettingsListItem instanceof ProgressItem) && !(basicSettingsListItem instanceof ErrorItem)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static BasicInfoItem c(List list) {
        BasicSettingsListItem basicSettingsListItem;
        Object next;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((BasicSettingsListItem) next) instanceof BasicInfoItem) {
                    break;
                }
            }
            basicSettingsListItem = (BasicSettingsListItem) next;
        } else {
            basicSettingsListItem = null;
        }
        if (basicSettingsListItem instanceof BasicInfoItem) {
            return (BasicInfoItem) basicSettingsListItem;
        }
        return null;
    }

    public static List d(List list, Y41.l lVar, InterfaceC14879b.h hVar) {
        BasicInfoItem basicInfoItemA;
        BasicInfoItem basicInfoItemC = c(list);
        if (basicInfoItemC == null) {
            return list;
        }
        Uri uri = basicInfoItemC.f228585e;
        if (hVar == null) {
            basicInfoItemA = BasicInfoItem.a(basicInfoItemC, null, null, (Uri) lVar.invoke(uri), null, 4087);
        } else {
            basicInfoItemA = BasicInfoItem.a(basicInfoItemC, hVar.f13879c, hVar.f13877a, (Uri) lVar.invoke(uri), hVar.f13878b, 2033);
        }
        if (list == null) {
            return list;
        }
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (((BasicSettingsListItem) it.next()) instanceof BasicInfoItem) {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(i12, basicInfoItemA);
        return arrayList;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Qb0.d a(InterfaceC14879b interfaceC14879b, Qb0.d dVar) {
        InterfaceC14879b interfaceC14879b2 = interfaceC14879b;
        Qb0.d dVar2 = dVar;
        if (interfaceC14879b2 instanceof InterfaceC14879b.k) {
            return ((InterfaceC14879b.k) interfaceC14879b2).f13882a ? Qb0.d.a(dVar2, null, false, null, null, 9) : Qb0.d.a(dVar2, null, true, null, null, 8);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.j) {
            return Qb0.d.a(dVar2, ((InterfaceC14879b.j) interfaceC14879b2).f13881a, false, null, null, 8);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.i) {
            return Qb0.d.a(dVar2, null, false, ((InterfaceC14879b.i) interfaceC14879b2).f13880a, null, 8);
        }
        boolean z12 = interfaceC14879b2 instanceof InterfaceC14879b.t;
        List<BasicSettingsListItem> list = dVar2.f13907a;
        if (z12) {
            if (list == null) {
                return dVar2;
            }
            ProgressItem progressItem = new ProgressItem(null, 1, null);
            ArrayList arrayList = new ArrayList(b(list));
            int iA2 = com.avito.android.profile_settings_basic.adapter.section_header.c.a(arrayList);
            if (iA2 != -1) {
                arrayList.add(iA2 + 1, progressItem);
                list = arrayList;
            }
            return Qb0.d.a(dVar2, list, false, null, null, 14);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.s) {
            if (list == null) {
                return dVar2;
            }
            InterfaceC14879b.s sVar = (InterfaceC14879b.s) interfaceC14879b2;
            ArrayList arrayList2 = new ArrayList(b(list));
            int iA3 = com.avito.android.profile_settings_basic.adapter.section_header.c.a(arrayList2);
            if (iA3 != -1) {
                C14765a c14765a = sVar.f13894a;
                String str = c14765a.f13145a;
                if (str != null && str.length() != 0) {
                    SectionHeaderItem sectionHeaderItem = (SectionHeaderItem) arrayList2.get(iA3);
                    arrayList2.set(iA3, new SectionHeaderItem(sectionHeaderItem.f228671b, sectionHeaderItem.f228672c, str, sectionHeaderItem.f228674e));
                }
                arrayList2.addAll(iA3 + 1, c14765a.f13146b);
                list = arrayList2;
            }
            return Qb0.d.a(dVar2, list, false, null, null, 14);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.r) {
            if (list == null) {
                return dVar2;
            }
            ErrorItem errorItem = new ErrorItem(null, 1, null);
            ArrayList arrayList3 = new ArrayList(b(list));
            int iA4 = com.avito.android.profile_settings_basic.adapter.section_header.c.a(arrayList3);
            if (iA4 != -1) {
                arrayList3.add(iA4 + 1, errorItem);
                list = arrayList3;
            }
            return Qb0.d.a(dVar2, list, false, null, null, 14);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.l) {
            return Qb0.d.a(dVar2, null, false, null, null, 7);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.o) {
            BasicInfoItem basicInfoItemC = c(list);
            return Qb0.d.a(dVar2, null, false, null, (basicInfoItemC == null || basicInfoItemC.f228593m.isEmpty()) ? null : new d.a(basicInfoItemC.f228583c, basicInfoItemC.f228586f, basicInfoItemC.f228593m, false, null), 7);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.g) {
            return Qb0.d.a(dVar2, d(list, new t(interfaceC14879b2), null), false, null, null, 6);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.h) {
            return Qb0.d.a(dVar2, d(list, u.f228912l, (InterfaceC14879b.h) interfaceC14879b2), false, null, null, 14);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.f) {
            return Qb0.d.a(dVar2, d(list, v.f228913l, null), false, null, null, 14);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.e) {
            return Qb0.d.a(dVar2, d(list, new w(interfaceC14879b2), null), false, null, null, 14);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.c) {
            Boolean boolValueOf = Boolean.valueOf(((InterfaceC14879b.c) interfaceC14879b2).f13871a);
            BasicInfoItem basicInfoItemC2 = c(list);
            return Qb0.d.a(dVar2, null, false, null, (basicInfoItemC2 == null || basicInfoItemC2.f228593m.isEmpty()) ? null : new d.a(basicInfoItemC2.f228583c, basicInfoItemC2.f228586f, basicInfoItemC2.f228593m, true, boolValueOf), 7);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.d) {
            return Qb0.d.a(dVar2, null, false, null, null, 7);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.C0914b) {
            BasicInfoItem basicInfoItemC3 = c(list);
            return Qb0.d.a(dVar2, null, false, null, (basicInfoItemC3 == null || basicInfoItemC3.f228593m.isEmpty()) ? null : new d.a(basicInfoItemC3.f228583c, basicInfoItemC3.f228586f, basicInfoItemC3.f228593m, false, null), 7);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.a) {
            return Qb0.d.a(dVar2, null, false, null, null, 7);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.m ? true : interfaceC14879b2 instanceof InterfaceC14879b.n ? true : interfaceC14879b2 instanceof InterfaceC14879b.p ? true : interfaceC14879b2 instanceof InterfaceC14879b.q) {
            return dVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}

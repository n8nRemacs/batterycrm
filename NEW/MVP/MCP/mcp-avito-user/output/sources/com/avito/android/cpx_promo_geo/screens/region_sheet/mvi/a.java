package com.avito.android.cpx_promo_geo.screens.region_sheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import us.C49106a;
import vs.InterfaceC49374a;

/* compiled from: RegionSheetActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lvs/a;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC49374a, RegionSheetInternalAction, RegionSheetState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpx_promo_geo.screens.region_sheet.domain.a f128322a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpx_promo_geo.screens.region_sheet.domain.c f128323b;

    /* compiled from: RegionSheetActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3810a {
        static {
            int[] iArr = new int[RegionSheetState.Location.CheckboxState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RegionSheetState.Location.CheckboxState checkboxState = RegionSheetState.Location.CheckboxState.f128405b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.cpx_promo_geo.screens.region_sheet.domain.a aVar, @Y61.k com.avito.android.cpx_promo_geo.screens.region_sheet.domain.c cVar) {
        this.f128322a = aVar;
        this.f128323b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction.ShowValidationError c(com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.a r3, com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState r4, long r5, java.lang.Long r7) {
        /*
            r3.getClass()
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$e r3 = r4.f128396g
            r0 = 0
            if (r3 != 0) goto L9
            goto L43
        L9:
            java.util.List r1 = e(r4)
            int r1 = r1.size()
            int r2 = r3.f128438c
            if (r1 <= r2) goto L43
            if (r7 == 0) goto L30
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.util.Map<java.lang.Long, com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location> r4 = r4.f128393d
            java.lang.Object r4 = r4.get(r5)
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location r4 = (com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState.Location) r4
            if (r4 == 0) goto L30
            java.util.Map<java.lang.Long, com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location> r4 = r4.f128401e
            if (r4 == 0) goto L30
            java.lang.Object r4 = r4.get(r7)
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location r4 = (com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState.Location) r4
            goto L31
        L30:
            r4 = r0
        L31:
            if (r4 == 0) goto L35
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location$CheckboxState r0 = r4.f128399c
        L35:
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location$CheckboxState r4 = com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState.Location.CheckboxState.f128408e
            if (r0 != r4) goto L3c
            java.lang.String r3 = r3.f128436a
            goto L3e
        L3c:
            java.lang.String r3 = r3.f128437b
        L3e:
            com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$ShowValidationError r0 = new com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$ShowValidationError
            r0.<init>(r3)
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.a.c(com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.a, com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState, long, java.lang.Long):com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction$ShowValidationError");
    }

    public static RegionSheetState.Location.CheckboxState d(RegionSheetState.Location location, RegionSheetState.Location.CheckboxState checkboxState) {
        return C42745f0.U(RegionSheetState.Location.CheckboxState.f128405b, RegionSheetState.Location.CheckboxState.f128409f).contains(location.f128399c) ? location.f128399c : checkboxState;
    }

    public static List e(RegionSheetState regionSheetState) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<Long, RegionSheetState.Location> entry : regionSheetState.f128393d.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            RegionSheetState.Location value = entry.getValue();
            if (value.f128400d == null) {
                f(linkedHashSet, jLongValue, value.b());
            } else {
                Map<Long, RegionSheetState.Location> map = value.f128401e;
                boolean zIsEmpty = map.isEmpty();
                RegionSheetState.Location.CheckboxState checkboxState = value.f128399c;
                if (zIsEmpty) {
                    int iOrdinal = checkboxState.ordinal();
                    if (iOrdinal == 1) {
                        f(linkedHashSet, jLongValue, true);
                    } else if (iOrdinal == 2) {
                        Iterator<T> it = value.f128402f.iterator();
                        while (it.hasNext()) {
                            f(linkedHashSet, ((Number) it.next()).longValue(), true);
                        }
                    }
                } else {
                    int iOrdinal2 = checkboxState.ordinal();
                    if (iOrdinal2 == 1) {
                        f(linkedHashSet, jLongValue, true);
                    } else if (iOrdinal2 == 2) {
                        for (Map.Entry<Long, RegionSheetState.Location> entry2 : map.entrySet()) {
                            f(linkedHashSet, entry2.getKey().longValue(), entry2.getValue().b());
                        }
                    }
                }
            }
        }
        return C42745f0.M0(linkedHashSet);
    }

    public static final void f(LinkedHashSet linkedHashSet, long j12, boolean z12) {
        if (z12) {
            linkedHashSet.add(Long.valueOf(j12));
        } else {
            linkedHashSet.remove(Long.valueOf(j12));
        }
    }

    public static LinkedHashMap g(RegionSheetState regionSheetState, long j12, Long l12) {
        RegionSheetState.Location.CheckboxState checkboxState;
        Map<Long, RegionSheetState.Location> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap(regionSheetState.f128393d);
        RegionSheetState.Location location = regionSheetState.f128393d.get(Long.valueOf(j12));
        RegionSheetState.Location.CheckboxState checkboxState2 = null;
        location = null;
        RegionSheetState.Location location2 = null;
        checkboxState2 = null;
        if (l12 != null) {
            if (location != null && (map = location.f128401e) != null) {
                location2 = map.get(l12);
            }
            RegionSheetState.Location location3 = location2;
            if (location3 != null) {
                RegionSheetState.Location.CheckboxState checkboxState3 = RegionSheetState.Location.CheckboxState.f128406c;
                if (location3.f128399c == checkboxState3) {
                    checkboxState3 = RegionSheetState.Location.CheckboxState.f128408e;
                }
                RegionSheetState.Location locationA = RegionSheetState.Location.a(location3, checkboxState3, null, null, false, false, 251);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(location.f128401e);
                linkedHashMap2.put(l12, locationA);
                linkedHashMap.put(Long.valueOf(j12), RegionSheetState.Location.a(location, C49106a.a(linkedHashMap2, location.f128399c), null, linkedHashMap2, false, false, 235));
            }
        } else {
            if (location != null && (checkboxState = location.f128399c) != null && checkboxState == (checkboxState2 = RegionSheetState.Location.CheckboxState.f128406c)) {
                checkboxState2 = RegionSheetState.Location.CheckboxState.f128408e;
            }
            if (checkboxState2 != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(location.f128401e);
                for (Map.Entry entry : linkedHashMap3.entrySet()) {
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    RegionSheetState.Location location4 = (RegionSheetState.Location) entry.getValue();
                    linkedHashMap3.put(Long.valueOf(jLongValue), RegionSheetState.Location.a(location4, d(location4, checkboxState2), null, null, false, false, 251));
                }
                linkedHashMap.put(Long.valueOf(j12), RegionSheetState.Location.a(location, C49106a.a(linkedHashMap3, checkboxState2), null, linkedHashMap3, false, false, 235));
            }
        }
        return linkedHashMap;
    }

    public static RegionSheetState h(RegionSheetState regionSheetState) {
        RegionSheetState.c cVarA;
        RegionSheetState.c cVar = regionSheetState.f128392c;
        if (cVar != null) {
            Collection<RegionSheetState.Location> collectionValues = regionSheetState.f128393d.values();
            boolean z12 = true;
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator<T> it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((RegionSheetState.Location) it.next()).b()) {
                        z12 = false;
                        break;
                    }
                }
            }
            cVarA = RegionSheetState.c.a(cVar, z12);
        } else {
            cVarA = null;
        }
        return RegionSheetState.a(regionSheetState, null, cVarA, null, 61);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<RegionSheetInternalAction> b(InterfaceC49374a interfaceC49374a, RegionSheetState regionSheetState) {
        InterfaceC49374a interfaceC49374a2 = interfaceC49374a;
        RegionSheetState regionSheetState2 = regionSheetState;
        if (interfaceC49374a2 instanceof InterfaceC49374a.C12794a) {
            return C43175k.G(new c(this, regionSheetState2, null, interfaceC49374a2));
        }
        if (interfaceC49374a2 instanceof InterfaceC49374a.f) {
            InterfaceC49374a.f fVar = (InterfaceC49374a.f) interfaceC49374a2;
            return C43175k.G(new d(this, h(RegionSheetState.a(regionSheetState2, null, null, g(regionSheetState2, fVar.f441011a, fVar.f441012b), 59)), null, interfaceC49374a2));
        }
        if (!(interfaceC49374a2 instanceof InterfaceC49374a.g)) {
            if (interfaceC49374a2 instanceof InterfaceC49374a.c) {
                return this.f128322a.a(((InterfaceC49374a.c) interfaceC49374a2).f441008a, e(regionSheetState2));
            }
            if (interfaceC49374a2.equals(InterfaceC49374a.d.f441009a)) {
                return new C43210w(new RegionSheetInternalAction.SaveSelection(e(regionSheetState2)));
            }
            boolean z12 = interfaceC49374a2 instanceof InterfaceC49374a.e;
            com.avito.android.cpx_promo_geo.screens.region_sheet.domain.c cVar = this.f128323b;
            if (z12) {
                return cVar.a(((InterfaceC49374a.e) interfaceC49374a2).f441010a, e(regionSheetState2), false);
            }
            if (interfaceC49374a2.equals(InterfaceC49374a.b.f441007a)) {
                return cVar.a(regionSheetState2.f128391b.f128412a.f128429b, e(regionSheetState2), true);
            }
            if (interfaceC49374a2 instanceof InterfaceC49374a.h) {
                return C43175k.G(new e(this, regionSheetState2, null, interfaceC49374a2));
            }
            throw new NoWhenBranchMatchedException();
        }
        RegionSheetState.c cVar2 = regionSheetState2.f128392c;
        RegionSheetState.Location.CheckboxState checkboxState = (cVar2 == null || !cVar2.f128432b) ? RegionSheetState.Location.CheckboxState.f128406c : RegionSheetState.Location.CheckboxState.f128408e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(regionSheetState2.f128393d);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            RegionSheetState.Location location = (RegionSheetState.Location) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(location.f128401e);
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                long jLongValue2 = ((Number) entry2.getKey()).longValue();
                RegionSheetState.Location location2 = (RegionSheetState.Location) entry2.getValue();
                linkedHashMap2.put(Long.valueOf(jLongValue2), RegionSheetState.Location.a(location2, d(location2, checkboxState), null, null, false, false, 251));
            }
            linkedHashMap.put(Long.valueOf(jLongValue), RegionSheetState.Location.a(location, d(location, C49106a.a(linkedHashMap2, checkboxState)), null, linkedHashMap2, false, false, 235));
        }
        return new C43210w(new RegionSheetInternalAction.UpdateState(RegionSheetState.a(regionSheetState2, null, cVar2 != null ? RegionSheetState.c.a(cVar2, !cVar2.f128432b) : null, linkedHashMap, 57)));
    }
}

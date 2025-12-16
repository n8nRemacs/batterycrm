package com.avito.android.settings.mvi;

import Nv0.InterfaceC14617b;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.Location;
import com.avito.android.settings.adapter.i0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SettingsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/settings/mvi/r;", "Lcom/avito/android/arch/mvi/u;", "LNv0/b;", "LNv0/d;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r implements u<InterfaceC14617b, Nv0.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f280959b;

    @Inject
    public r(@Y61.k l lVar) {
        this.f280959b = lVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Nv0.d a(InterfaceC14617b interfaceC14617b, Nv0.d dVar) {
        InterfaceC14617b interfaceC14617b2 = interfaceC14617b;
        Nv0.d dVar2 = dVar;
        if (interfaceC14617b2.equals(InterfaceC14617b.f.f11822a)) {
            return Nv0.d.a(dVar2, true, null, false, null, false, 30);
        }
        boolean zEquals = interfaceC14617b2.equals(InterfaceC14617b.e.f11821a);
        boolean z12 = dVar2.f11869e;
        l lVar = this.f280959b;
        Location location = dVar2.f11868d;
        boolean z13 = dVar2.f11867c;
        if (zEquals) {
            return Nv0.d.a(dVar2, false, lVar.a(location, z12, z13, null), false, null, false, 28);
        }
        if (interfaceC14617b2 instanceof InterfaceC14617b.g) {
            return Nv0.d.a(dVar2, false, lVar.a(location, z12, z13, ((InterfaceC14617b.g) interfaceC14617b2).f11823a), false, null, false, 28);
        }
        boolean z14 = interfaceC14617b2 instanceof InterfaceC14617b.h;
        com.avito.android.replace_main.toggle.d dVar3 = dVar2.f11870f;
        if (z14) {
            Location location2 = ((InterfaceC14617b.h) interfaceC14617b2).f11824a;
            return Nv0.d.a(dVar2, false, lVar.a(location2, z12, z13, dVar3), false, location2, false, 21);
        }
        if (interfaceC14617b2 instanceof InterfaceC14617b.y) {
            boolean z15 = !z13;
            return Nv0.d.a(dVar2, false, lVar.a(location, z12, z15, dVar3), z15, null, false, 25);
        }
        if (interfaceC14617b2 instanceof InterfaceC14617b.C0771b) {
            boolean z16 = ((InterfaceC14617b.C0771b) interfaceC14617b2).f11818a;
            return Nv0.d.a(dVar2, false, lVar.a(location, z16, z13, dVar3), false, null, z16, 13);
        }
        boolean z17 = interfaceC14617b2 instanceof InterfaceC14617b.z;
        List<i0> list = dVar2.f11866b;
        if (z17) {
            List<i0> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (com.avito.conveyor_item.a aVarA : list2) {
                if (aVarA instanceof i0.h) {
                    i0.h hVar = (i0.h) aVarA;
                    aVarA = i0.h.a(hVar, com.avito.android.replace_main.toggle.d.a(hVar.f280796b, ((InterfaceC14617b.z) interfaceC14617b2).f11843a, false, 62));
                }
                arrayList.add(aVarA);
            }
            return Nv0.d.a(dVar2, false, arrayList, false, null, false, 29);
        }
        if (interfaceC14617b2.equals(InterfaceC14617b.w.f11839a)) {
            List<i0> list3 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
            for (com.avito.conveyor_item.a aVarA2 : list3) {
                if (aVarA2 instanceof i0.h) {
                    i0.h hVar2 = (i0.h) aVarA2;
                    aVarA2 = i0.h.a(hVar2, com.avito.android.replace_main.toggle.d.a(hVar2.f280796b, null, true, 31));
                }
                arrayList2.add(aVarA2);
            }
            return Nv0.d.a(dVar2, false, arrayList2, false, null, false, 29);
        }
        if (interfaceC14617b2 instanceof InterfaceC14617b.v) {
            List<i0> list4 = list;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
            for (com.avito.conveyor_item.a aVarA3 : list4) {
                if (aVarA3 instanceof i0.h) {
                    i0.h hVar3 = (i0.h) aVarA3;
                    aVarA3 = i0.h.a(hVar3, com.avito.android.replace_main.toggle.d.a(hVar3.f280796b, null, false, 31));
                }
                arrayList3.add(aVarA3);
            }
            return Nv0.d.a(dVar2, false, arrayList3, false, null, false, 29);
        }
        if (!(interfaceC14617b2 instanceof InterfaceC14617b.x)) {
            if (interfaceC14617b2 instanceof InterfaceC14617b.m ? true : interfaceC14617b2 instanceof InterfaceC14617b.k ? true : interfaceC14617b2 instanceof InterfaceC14617b.o ? true : interfaceC14617b2 instanceof InterfaceC14617b.i ? true : interfaceC14617b2 instanceof InterfaceC14617b.u ? true : interfaceC14617b2 instanceof InterfaceC14617b.q ? true : interfaceC14617b2 instanceof InterfaceC14617b.s ? true : interfaceC14617b2 instanceof InterfaceC14617b.l ? true : interfaceC14617b2 instanceof InterfaceC14617b.p ? true : interfaceC14617b2 instanceof InterfaceC14617b.n ? true : interfaceC14617b2 instanceof InterfaceC14617b.t ? true : interfaceC14617b2 instanceof InterfaceC14617b.j ? true : interfaceC14617b2 instanceof InterfaceC14617b.r ? true : interfaceC14617b2 instanceof InterfaceC14617b.c ? true : interfaceC14617b2 instanceof InterfaceC14617b.a ? true : interfaceC14617b2 instanceof InterfaceC14617b.d) {
                return dVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        List<i0> list5 = list;
        ArrayList arrayList4 = new ArrayList(C42745f0.q(list5, 10));
        for (com.avito.conveyor_item.a aVarA4 : list5) {
            if (aVarA4 instanceof i0.h) {
                i0.h hVar4 = (i0.h) aVarA4;
                aVarA4 = i0.h.a(hVar4, com.avito.android.replace_main.toggle.d.a(hVar4.f280796b, null, false, 31));
            }
            arrayList4.add(aVarA4);
        }
        return Nv0.d.a(dVar2, false, arrayList4, false, null, false, 29);
    }
}

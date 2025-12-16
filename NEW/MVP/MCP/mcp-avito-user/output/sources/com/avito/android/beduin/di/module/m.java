package com.avito.android.beduin.di.module;

import Ti.InterfaceC15365a;
import Ui.InterfaceC15524c;
import ai.InterfaceC19892b;
import com.avito.android.AbstractC35201t;
import com.avito.android.C36132w;
import com.avito.android.beduin.common.component.cart_item.a;
import com.avito.android.beduin.common.component.conditional_group.component.AndCondition;
import com.avito.android.beduin.common.component.conditional_group.component.ContainsValueSubstringCondition;
import com.avito.android.beduin.common.component.conditional_group.component.FalseCondition;
import com.avito.android.beduin.common.component.conditional_group.component.IsPlatformInCondition;
import com.avito.android.beduin.common.component.conditional_group.component.IsScreenWidthAtLeastCondition;
import com.avito.android.beduin.common.component.conditional_group.component.IsTabletCondition;
import com.avito.android.beduin.common.component.conditional_group.component.LessCondition;
import com.avito.android.beduin.common.component.conditional_group.component.MoreCondition;
import com.avito.android.beduin.common.component.conditional_group.component.NotCondition;
import com.avito.android.beduin.common.component.conditional_group.component.OrCondition;
import com.avito.android.beduin.common.component.conditional_group.component.RegularExpressionCondition;
import com.avito.android.beduin.common.component.conditional_group.component.TrueCondition;
import com.avito.android.beduin.common.component.conditional_group.component.ValueIsEmptyCondition;
import com.avito.android.beduin.common.component.conditional_group.component.ValueIsEqualCondition;
import com.avito.android.beduin.common.component.p;
import com.avito.android.beduin.common.exception.BeduinActionAlreadyRegisteredException;
import com.avito.android.beduin.common.exception.BeduinComponentAlreadyRegisteredException;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import gi.C40685a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import vi.C49333b;
import vi.InterfaceC49334c;
import wi.C49627c;
import wi.InterfaceC49629e;

/* compiled from: BeduinModule_ProvideBeduinRegistryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<C40685a> {

    /* renamed from: a, reason: collision with root package name */
    public final C36132w f103951a;

    /* renamed from: b, reason: collision with root package name */
    public final A f103952b;

    public m(C36132w c36132w, A a12) {
        this.f103951a = c36132w;
        this.f103952b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BeduinComponentAlreadyRegisteredException, BeduinActionAlreadyRegisteredException {
        AbstractC35201t abstractC35201t = (AbstractC35201t) this.f103951a.get();
        Set set = (Set) this.f103952b.get();
        k.f103949a.getClass();
        C40685a c40685a = new C40685a();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(C42745f0.q(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Ui.d) it.next()).a());
        }
        Iterator it2 = C42745f0.H(arrayList).iterator();
        while (it2.hasNext()) {
            InterfaceC15524c interfaceC15524c = (InterfaceC15524c) it2.next();
            ArrayList arrayList2 = c40685a.f396728b;
            if (arrayList2.contains(interfaceC15524c)) {
                throw new BeduinActionAlreadyRegisteredException(interfaceC15524c.getAction().getSimpleName());
            }
            arrayList2.add(interfaceC15524c);
        }
        p.f101786a.getClass();
        List<com.avito.android.beduin.common.component.b> list = p.f101787b;
        a.b bVar = com.avito.android.beduin.common.component.cart_item.a.f100882j;
        if (!abstractC35201t.x().invoke().booleanValue()) {
            bVar = null;
        }
        for (com.avito.android.beduin.common.component.b bVar2 : C42745f0.h0(C42745f0.V(bVar), list)) {
            ArrayList arrayList3 = c40685a.f396727a;
            if (arrayList3.contains(bVar2)) {
                throw new BeduinComponentAlreadyRegisteredException(AK.c.k("Component with type ", bVar2.S().getSimpleName(), " has been registered before"));
            }
            arrayList3.add(bVar2);
        }
        com.avito.android.beduin.common.action.k.f100042a.getClass();
        for (InterfaceC19892b interfaceC19892b : com.avito.android.beduin.common.action.k.f100043b) {
            ArrayList arrayList4 = c40685a.f396729c;
            if (arrayList4.contains(interfaceC19892b)) {
                throw new BeduinActionAlreadyRegisteredException(interfaceC19892b.a().getSimpleName());
            }
            arrayList4.add(interfaceC19892b);
        }
        com.avito.android.beduin.common.form.transforms.a.f103416a.getClass();
        for (InterfaceC15365a interfaceC15365a : com.avito.android.beduin.common.form.transforms.a.f103417b) {
            ArrayList arrayList5 = c40685a.f396730d;
            if (arrayList5.contains(interfaceC15365a)) {
                throw new BeduinActionAlreadyRegisteredException(interfaceC15365a.a().getSimpleName());
            }
            arrayList5.add(interfaceC15365a);
        }
        p.a.f101788a.getClass();
        Iterator it3 = C42756l.B(new com.avito.android.beduin.common.component.conditional_group.component.b[]{new AndCondition.a(null, null, 3, null), new FalseCondition.b(null, null, 3, null), new NotCondition.b(null, null, 3, null), new OrCondition.b(null, null, 3, null), new TrueCondition.b(null, null, 3, null), new ValueIsEqualCondition.b(null, null, 3, null), new ValueIsEmptyCondition.b(null, null, 3, null), new IsTabletCondition.b(null, null, 3, null), new IsScreenWidthAtLeastCondition.b(null, null, 3, null), new IsPlatformInCondition.b(null, null, 3, null), MoreCondition.b.f101073a, LessCondition.b.f101068a, ContainsValueSubstringCondition.a.f101050a, RegularExpressionCondition.b.f101082a}).iterator();
        while (it3.hasNext()) {
            com.avito.android.beduin.common.component.conditional_group.component.b bVar3 = (com.avito.android.beduin.common.component.conditional_group.component.b) it3.next();
            ArrayList arrayList6 = c40685a.f396731e;
            if (arrayList6.contains(bVar3)) {
                throw new BeduinActionAlreadyRegisteredException(bVar3.getValue().getSimpleName());
            }
            arrayList6.add(bVar3);
        }
        com.avito.android.beduin.common.navigation_bar.e.f103441a.getClass();
        for (com.avito.android.beduin.common.navigation_bar.d dVar : com.avito.android.beduin.common.navigation_bar.e.f103442b) {
            ArrayList arrayList7 = c40685a.f396733g;
            if (arrayList7.contains(dVar)) {
                throw new BeduinActionAlreadyRegisteredException(dVar.getType());
            }
            arrayList7.add(dVar);
        }
        com.avito.android.beduin.common.component.params_source.c.f101800a.getClass();
        for (com.avito.android.beduin.common.component.params_source.a aVar : com.avito.android.beduin.common.component.params_source.c.f101801b) {
            ArrayList arrayList8 = c40685a.f396732f;
            if (arrayList8.contains(aVar)) {
                throw new BeduinActionAlreadyRegisteredException(aVar.getValue().getSimpleName());
            }
            arrayList8.add(aVar);
        }
        C49627c.f441751a.getClass();
        for (InterfaceC49629e interfaceC49629e : C49627c.f441752b) {
            ArrayList arrayList9 = c40685a.f396734h;
            if (arrayList9.contains(interfaceC49629e)) {
                throw new BeduinActionAlreadyRegisteredException(interfaceC49629e.getType());
            }
            arrayList9.add(interfaceC49629e);
        }
        C49333b.f440935a.getClass();
        for (InterfaceC49334c interfaceC49334c : C49333b.f440936b) {
            ArrayList arrayList10 = c40685a.f396735i;
            if (arrayList10.contains(interfaceC49334c)) {
                throw new BeduinActionAlreadyRegisteredException(interfaceC49334c.getType());
            }
            arrayList10.add(interfaceC49334c);
        }
        return c40685a;
    }
}

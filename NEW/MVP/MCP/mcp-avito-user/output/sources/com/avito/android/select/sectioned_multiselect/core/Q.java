package com.avito.android.select.sectioned_multiselect.core;

import Zp0.InterfaceC19587b;
import androidx.view.M0;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SectionedMultiselectStorage.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/core/Q;", "Lcom/avito/android/select/sectioned_multiselect/core/P;", "Landroidx/lifecycle/M0;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Q extends M0 implements P {

    /* renamed from: E, reason: collision with root package name */
    public SectionedMultiselectParameter f266516E;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f266517J;

    /* renamed from: K, reason: collision with root package name */
    public int f266518K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f266519L;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public String f266521N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public String f266522O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public Integer f266523P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public String f266524Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f266525R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f266526S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public InterfaceC19587b f266527T;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public LinkedHashSet f266529V;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public LinkedHashSet f266531X;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public List<String> f266520M = C42784z0.f406748b;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public ArrayList f266528U = new ArrayList();

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f266530W = new LinkedHashMap();

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Set<ParcelableEntity<String>>> f266532Y = new com.jakewharton.rxrelay3.b<>();

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Set<ParcelableEntity<String>>> f266533Z = new com.jakewharton.rxrelay3.b<>();

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ParcelableEntity<String>> f266534a0 = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.select.glow_animation.a> f266535b0 = new com.jakewharton.rxrelay3.c<>();

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    /* renamed from: Bb, reason: from getter */
    public final boolean getF266519L() {
        return this.f266519L;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.l
    /* renamed from: E2, reason: from getter */
    public final Integer getF266523P() {
        return this.f266523P;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.l
    /* renamed from: F3, reason: from getter */
    public final String getF266524Q() {
        return this.f266524Q;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    public final void Fd(@Y61.k SectionedMultiselectParameter sectionedMultiselectParameter, @Y61.k List<SectionedMultiselectParameter.Value> list) {
        List<SectionedMultiselectParameter.Tab> tabs;
        Object next;
        List<SectionedMultiselectParameter.Value> options;
        Boolean hideCounterOnEmptyTabSelection;
        this.f266516E = sectionedMultiselectParameter;
        this.f266517J = new ArrayList(list);
        SectionedMultiselectParameter.Displaying displaying = sectionedMultiselectParameter.getDisplaying();
        boolean zBooleanValue = false;
        this.f266519L = displaying != null ? kotlin.jvm.internal.L.f(displaying.getWithImages(), Boolean.TRUE) : false;
        SectionedMultiselectParameter.Displaying displaying2 = sectionedMultiselectParameter.getDisplaying();
        this.f266520M = displaying2 != null ? displaying2.getRadioIds() : null;
        this.f266522O = sectionedMultiselectParameter.getId();
        SectionedMultiselectParameter.Displaying displaying3 = sectionedMultiselectParameter.getDisplaying();
        this.f266523P = displaying3 != null ? displaying3.getLimit() : null;
        SectionedMultiselectParameter.Displaying displaying4 = sectionedMultiselectParameter.getDisplaying();
        this.f266524Q = displaying4 != null ? displaying4.getLimitMessage() : null;
        SectionedMultiselectParameter.Displaying displaying5 = sectionedMultiselectParameter.getDisplaying();
        if (displaying5 != null && (hideCounterOnEmptyTabSelection = displaying5.getHideCounterOnEmptyTabSelection()) != null) {
            zBooleanValue = hideCounterOnEmptyTabSelection.booleanValue();
        }
        this.f266526S = zBooleanValue;
        this.f266521N = sectionedMultiselectParameter.getTitle();
        LinkedHashMap linkedHashMap = this.f266530W;
        SectionedMultiselectParameter.Displaying displaying6 = sectionedMultiselectParameter.getDisplaying();
        if (displaying6 != null && (tabs = displaying6.getTabs()) != null) {
            for (SectionedMultiselectParameter.Tab tab : tabs) {
                List<String> groupIds = tab.getGroupIds();
                ArrayList arrayList = new ArrayList();
                for (String str : groupIds) {
                    Iterator<T> it = sectionedMultiselectParameter.getValues().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (kotlin.jvm.internal.L.f(((SectionedMultiselectParameter.Value) next).getId(), str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    SectionedMultiselectParameter.Value value = (SectionedMultiselectParameter.Value) next;
                    if (value == null || (options = value.getOptions()) == null) {
                        options = C42784z0.f406748b;
                    }
                    C42745f0.h(options, arrayList);
                }
                linkedHashMap.put(tab, C42745f0.P0(arrayList));
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<? extends String> value2 = sectionedMultiselectParameter.getValue();
        linkedHashSet.addAll(value2 != null ? C42745f0.O0(value2) : B0.f406639b);
        if (this.f266529V == null) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (linkedHashSet.contains(((SectionedMultiselectParameter.Value) obj).getId())) {
                    arrayList2.add(obj);
                }
            }
            linkedHashSet2.addAll(arrayList2);
            this.f266529V = linkedHashSet2;
        }
        if (this.f266531X == null) {
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            Collection collection = this.f266529V;
            if (collection == null) {
                collection = B0.f406639b;
            }
            linkedHashSet3.addAll(collection);
            this.f266531X = linkedHashSet3;
            this.f266532Y.accept(linkedHashSet3);
        }
        Set<ParcelableEntity<String>> set = this.f266531X;
        if (set == null) {
            set = B0.f406639b;
        }
        this.f266533Z.accept(set);
        this.f266518K = list.size();
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    public final void G6(@Y61.k List<SectionedMultiselectParameter.Value> list) {
        List<SectionedMultiselectParameter.Value> options;
        if (this.f266528U.isEmpty()) {
            this.f266528U = new ArrayList(list);
            return;
        }
        SectionedMultiselectParameter.Value value = (SectionedMultiselectParameter.Value) C42745f0.S(this.f266528U);
        if (value != null && (options = value.getOptions()) != null) {
            list = C42745f0.h0(list, options);
        }
        List<SectionedMultiselectParameter.Value> list2 = list;
        int iJ2 = C42745f0.J(this.f266528U);
        if (C42745f0.S(this.f266528U) != null) {
            ArrayList arrayList = this.f266528U;
            arrayList.set(iJ2, SectionedMultiselectParameter.Value.copy$default((SectionedMultiselectParameter.Value) C42745f0.Q(arrayList), null, null, null, null, list2, false, 47, null));
        }
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.k
    public final C41981q0 Gb() {
        com.jakewharton.rxrelay3.b<Set<ParcelableEntity<String>>> bVar = this.f266532Y;
        bVar.getClass();
        return new C41981q0(bVar);
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    public final void J9() {
        LinkedHashSet linkedHashSet = this.f266531X;
        if (linkedHashSet != null) {
            linkedHashSet.clear();
        }
        Set<ParcelableEntity<String>> set = this.f266531X;
        if (set == null) {
            set = B0.f406639b;
        }
        this.f266532Y.accept(set);
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.k
    public final C41981q0 K9() {
        com.jakewharton.rxrelay3.c<ParcelableEntity<String>> cVar = this.f266534a0;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    public final void Sb(@Y61.k String str) {
        LinkedHashSet linkedHashSet;
        ArrayList arrayList = this.f266517J;
        Object obj = null;
        if (arrayList == null) {
            arrayList = null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (kotlin.jvm.internal.L.f(((SectionedMultiselectParameter.Value) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        SectionedMultiselectParameter.Value value = (SectionedMultiselectParameter.Value) obj;
        if (value == null || (linkedHashSet = this.f266531X) == null) {
            return;
        }
        if (linkedHashSet.contains(value)) {
            linkedHashSet.remove(value);
        } else {
            List<String> list = this.f266520M;
            if (list != null) {
                List<String> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str2 = (String) it2.next();
                        LinkedHashSet linkedHashSet2 = this.f266529V;
                        if (linkedHashSet2 != null && !linkedHashSet2.isEmpty()) {
                            Iterator it3 = linkedHashSet2.iterator();
                            while (it3.hasNext()) {
                                if (kotlin.jvm.internal.L.f(((ParcelableEntity) it3.next()).getId(), str2)) {
                                    LinkedHashSet linkedHashSet3 = this.f266529V;
                                    if (linkedHashSet3 != null) {
                                        linkedHashSet3.clear();
                                    }
                                    linkedHashSet.clear();
                                }
                            }
                        }
                    }
                }
            }
            if (!o2()) {
                linkedHashSet.add(value);
            }
        }
        this.f266533Z.accept(linkedHashSet);
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    public final void T4(@Y61.l InterfaceC19587b interfaceC19587b) {
        if (!this.f266525R) {
            this.f266525R = true;
        }
        this.f266527T = interfaceC19587b;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.k
    public final C41981q0 Td() {
        com.jakewharton.rxrelay3.b<Set<ParcelableEntity<String>>> bVar = this.f266533Z;
        bVar.getClass();
        return new C41981q0(bVar);
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    /* renamed from: U8, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF266535b0() {
        return this.f266535b0;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.l
    /* renamed from: b7, reason: from getter */
    public final String getF266522O() {
        return this.f266522O;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.l
    /* renamed from: cd, reason: from getter */
    public final String getF266521N() {
        return this.f266521N;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    public final void f4(@Y61.k String str) {
        ArrayList arrayList = this.f266517J;
        Object obj = null;
        if (arrayList == null) {
            arrayList = null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (kotlin.jvm.internal.L.f(((SectionedMultiselectParameter.Value) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        SectionedMultiselectParameter.Value value = (SectionedMultiselectParameter.Value) obj;
        if (value == null) {
            return;
        }
        p6(true);
        this.f266534a0.accept(value);
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.k
    public final List<SectionedMultiselectParameter.Value> j8(@Y61.l String str) {
        List<SectionedMultiselectParameter.Tab> tabs;
        Object next;
        if (str == null) {
            if (!this.f266528U.isEmpty()) {
                return this.f266528U;
            }
            SectionedMultiselectParameter sectionedMultiselectParameter = this.f266516E;
            return (sectionedMultiselectParameter != null ? sectionedMultiselectParameter : null).getValues();
        }
        SectionedMultiselectParameter sectionedMultiselectParameter2 = this.f266516E;
        if (sectionedMultiselectParameter2 == null) {
            sectionedMultiselectParameter2 = null;
        }
        SectionedMultiselectParameter.Displaying displaying = sectionedMultiselectParameter2.getDisplaying();
        if (displaying != null && (tabs = displaying.getTabs()) != null) {
            Iterator<T> it = tabs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((SectionedMultiselectParameter.Tab) next).getId(), str)) {
                    break;
                }
            }
            SectionedMultiselectParameter.Tab tab = (SectionedMultiselectParameter.Tab) next;
            if (tab != null) {
                SectionedMultiselectParameter sectionedMultiselectParameter3 = this.f266516E;
                List<SectionedMultiselectParameter.Value> values = (sectionedMultiselectParameter3 != null ? sectionedMultiselectParameter3 : null).getValues();
                ArrayList arrayList = new ArrayList();
                for (Object obj : values) {
                    if (tab.getGroupIds().contains(((SectionedMultiselectParameter.Value) obj).getId())) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
        SectionedMultiselectParameter sectionedMultiselectParameter4 = this.f266516E;
        return (sectionedMultiselectParameter4 != null ? sectionedMultiselectParameter4 : null).getValues();
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.k
    /* renamed from: l7, reason: from getter */
    public final LinkedHashMap getF266530W() {
        return this.f266530W;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.l
    public final Set<ParcelableEntity<String>> m5() {
        return this.f266529V;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    public final boolean o2() {
        LinkedHashSet linkedHashSet;
        return (this.f266523P == null || (linkedHashSet = this.f266531X) == null || linkedHashSet.size() < this.f266523P.intValue()) ? false : true;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.l
    public final List<SectionedMultiselectParameter.Tab> p4() {
        SectionedMultiselectParameter sectionedMultiselectParameter = this.f266516E;
        if (sectionedMultiselectParameter == null) {
            sectionedMultiselectParameter = null;
        }
        SectionedMultiselectParameter.Displaying displaying = sectionedMultiselectParameter.getDisplaying();
        if (displaying != null) {
            return displaying.getTabs();
        }
        return null;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    public final void p6(boolean z12) {
        if (!z12) {
            this.f266528U.clear();
            T4(null);
            this.f266525R = false;
        }
        this.f266529V = null;
        this.f266531X = null;
        this.f266522O = null;
        this.f266523P = null;
        this.f266524Q = null;
        this.f266530W.clear();
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    /* renamed from: q9, reason: from getter */
    public final int getF266518K() {
        return this.f266518K;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.l
    public final Set<ParcelableEntity<String>> r8() {
        Set<ParcelableEntity<String>> set = this.f266532Y.f364266b.get();
        LinkedHashSet linkedHashSetO0 = set != null ? C42745f0.O0(set) : new LinkedHashSet();
        if (linkedHashSetO0.isEmpty()) {
            return B0.f406639b;
        }
        if (linkedHashSetO0.isEmpty()) {
            return null;
        }
        return linkedHashSetO0;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    public final void s5(@Y61.k List<SectionedMultiselectParameter.Value> list) {
        ArrayList arrayList = this.f266517J;
        if (arrayList == null) {
            arrayList = null;
        }
        arrayList.addAll(list);
        ArrayList arrayList2 = this.f266517J;
        C42745f0.P0(arrayList2 != null ? arrayList2 : null);
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    /* renamed from: sa, reason: from getter */
    public final boolean getF266525R() {
        return this.f266525R;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.l
    /* renamed from: sb, reason: from getter */
    public final InterfaceC19587b getF266527T() {
        return this.f266527T;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    /* renamed from: ta, reason: from getter */
    public final boolean getF266526S() {
        return this.f266526S;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.P
    @Y61.l
    public final List<String> y6() {
        return this.f266520M;
    }
}

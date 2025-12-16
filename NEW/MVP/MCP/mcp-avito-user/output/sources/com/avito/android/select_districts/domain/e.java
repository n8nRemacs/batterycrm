package com.avito.android.select_districts.domain;

import com.avito.android.remote.model.District;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import nq0.InterfaceC44466a;

/* compiled from: SelectDistrictsDataStore.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/domain/e;", "Lcom/avito/android/select_districts/domain/d;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Set<String> f266921a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f266922b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f266923c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f266924d;

    @Inject
    public e(@InterfaceC44466a @Y61.k Set<String> set) {
        this.f266921a = set;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        this.f266923c = linkedHashSet;
    }

    @Override // com.avito.android.select_districts.domain.d
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final ArrayList getF266922b() {
        return this.f266922b;
    }

    @Override // com.avito.android.select_districts.domain.d
    /* renamed from: b, reason: from getter */
    public final boolean getF266924d() {
        return this.f266924d;
    }

    @Override // com.avito.android.select_districts.domain.d
    public final void c(@Y61.k List<District> list) {
        ArrayList arrayList = this.f266922b;
        arrayList.clear();
        arrayList.addAll(list);
    }

    @Override // com.avito.android.select_districts.domain.d
    public final void clear() {
        this.f266923c.clear();
    }

    @Override // com.avito.android.select_districts.domain.d
    public final boolean d(@Y61.k String str) {
        return this.f266923c.contains(str);
    }

    @Override // com.avito.android.select_districts.domain.d
    public final void e(@Y61.k String str) {
        LinkedHashSet linkedHashSet = this.f266923c;
        if (linkedHashSet.contains(str)) {
            linkedHashSet.remove(str);
        } else {
            linkedHashSet.add(str);
        }
    }

    @Override // com.avito.android.select_districts.domain.d
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final LinkedHashSet getF266923c() {
        return this.f266923c;
    }

    @Override // com.avito.android.select_districts.domain.d
    @Y61.k
    public final ArrayList g() {
        ArrayList arrayList = this.f266922b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f266923c.contains(((District) next).getId())) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    @Override // com.avito.android.select_districts.domain.d
    public final void h(boolean z12) {
        this.f266924d = z12;
    }
}

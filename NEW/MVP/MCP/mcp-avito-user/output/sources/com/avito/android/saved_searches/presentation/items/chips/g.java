package com.avito.android.saved_searches.presentation.items.chips;

import Fo0.InterfaceC13822a;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.saved_searches.model.SavedSearchData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchChipsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/chips/g;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f258468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectStrategy f258469b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<SavedSearchData.Settings.SettingsDetails.Parameter.Option> f258470c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f258471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f258472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f258473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f258474g;

    public g(ArrayList arrayList, SelectStrategy selectStrategy, List list, boolean z12, boolean z13, boolean z14, h hVar) {
        this.f258469b = selectStrategy;
        this.f258470c = list;
        this.f258471d = z12;
        this.f258472e = z13;
        this.f258473f = z14;
        this.f258474g = hVar;
        this.f258468a = C42745f0.O0(arrayList);
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        String string = hVar.getF114848c().toString();
        LinkedHashSet linkedHashSet = this.f258468a;
        linkedHashSet.remove(string);
        List<SavedSearchData.Settings.SettingsDetails.Parameter.Option> list = this.f258470c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (linkedHashSet.contains(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) obj).getTitle())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) it.next()).getId());
        }
        InterfaceC13822a dVar = this.f258471d ? new InterfaceC13822a.d(arrayList2) : this.f258472e ? new InterfaceC13822a.b(arrayList2) : this.f258473f ? new InterfaceC13822a.f(arrayList2) : null;
        if (dVar != null) {
            this.f258474g.f258475b.invoke(dVar);
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        SelectStrategy selectStrategy = SelectStrategy.f178716b;
        SelectStrategy selectStrategy2 = this.f258469b;
        LinkedHashSet linkedHashSet = this.f258468a;
        if (selectStrategy2 == selectStrategy) {
            linkedHashSet.clear();
        }
        linkedHashSet.add(hVar.getF114848c().toString());
        List<SavedSearchData.Settings.SettingsDetails.Parameter.Option> list = this.f258470c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (linkedHashSet.contains(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) obj).getTitle())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) it.next()).getId());
        }
        InterfaceC13822a dVar = this.f258471d ? new InterfaceC13822a.d(arrayList2) : this.f258472e ? new InterfaceC13822a.b(arrayList2) : this.f258473f ? new InterfaceC13822a.f(arrayList2) : null;
        if (dVar != null) {
            this.f258474g.f258475b.invoke(dVar);
        }
    }
}

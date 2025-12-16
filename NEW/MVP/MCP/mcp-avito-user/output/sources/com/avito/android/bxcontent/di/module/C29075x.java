package com.avito.android.bxcontent.di.module;

import Gk.InterfaceC13892b;
import android.os.Bundle;
import com.avito.android.bx_beduin_native_items.d;
import com.avito.android.bx_beduin_native_items.info.TrackInfo;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;

/* compiled from: BxContentModule_ProvideBxBeduinItemVisibilityTracker$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.di.module.x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29075x implements dagger.internal.h<com.avito.android.bx_beduin_native_items.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.item_visibility_tracker.b> f111033a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.snippet.video.m> f111034b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f111035c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f111036d;

    public C29075x(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f111033a = provider;
        this.f111034b = provider2;
        this.f111035c = lVar;
        this.f111036d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ArrayList arrayList;
        Object next;
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f111033a.get();
        com.avito.android.snippet.video.m mVar = this.f111034b.get();
        Bundle bundle = (Bundle) this.f111035c.f393949a;
        R0 r02 = this.f111036d.get();
        C29070s.f111022a.getClass();
        d.a aVar = new d.a(bundle, r02);
        Iterator<T> it = bVar.getFilters().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = aVar.f108815c;
            if (!zHasNext) {
                break;
            }
            arrayList.add(new Gk.c((WV0.a) it.next()));
        }
        arrayList.add(mVar);
        com.avito.android.bx_beduin_native_items.d dVar = new com.avito.android.bx_beduin_native_items.d(arrayList, aVar.f108814b, null);
        Bundle bundle2 = aVar.f108813a;
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                ArrayList<TrackInfo> parcelableArrayList = bundle2.getParcelableArrayList(str);
                if (parcelableArrayList != null) {
                    HashMap<Long, List<TrackInfo>> map = dVar.f108809h;
                    Long lValueOf = Long.valueOf(Long.parseLong(str));
                    for (TrackInfo trackInfo : parcelableArrayList) {
                        Iterator<T> it2 = dVar.f108802a.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (kotlin.jvm.internal.L.f(((InterfaceC13892b) next).d(), trackInfo.r4())) {
                                break;
                            }
                        }
                        trackInfo.a6((InterfaceC13892b) next);
                    }
                    map.put(lValueOf, parcelableArrayList);
                }
            }
        }
        return dVar;
    }
}

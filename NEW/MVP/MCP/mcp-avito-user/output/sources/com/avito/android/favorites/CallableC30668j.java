package com.avito.android.favorites;

import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.favorites.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class CallableC30668j implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f157373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f157374c;

    public /* synthetic */ CallableC30668j(Object obj, int i12) {
        this.f157373b = i12;
        this.f157374c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f157373b) {
            case 0:
                return Boolean.valueOf(((C30700w) this.f157374c).f157568d.getCount() > 0);
            case 1:
                ((C30700w) this.f157374c).f157568d.wipe();
                return kotlin.G0.f406611a;
            default:
                C30684r0 c30684r0 = (C30684r0) this.f157374c;
                Iterable iterable = c30684r0.f157456a0;
                if (iterable == null) {
                    iterable = C42784z0.f406748b;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (obj instanceof FavoriteAdvertItem) {
                        arrayList.add(obj);
                    }
                }
                int iF2 = kotlin.collections.P0.f(C42745f0.q(arrayList, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = ((FavoriteAdvertItem) it.next()).f156404b;
                    linkedHashMap.put(str, c30684r0.f157495u.get(str));
                }
                return linkedHashMap;
        }
    }
}

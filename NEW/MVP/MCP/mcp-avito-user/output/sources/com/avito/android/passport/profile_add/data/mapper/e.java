package com.avito.android.passport.profile_add.data.mapper;

import Y61.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalMapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/data/mapper/e;", "Lcom/avito/android/passport/profile_add/data/mapper/d;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f212286a;

    @Inject
    public e(@k a aVar) {
        this.f212286a = aVar;
    }

    @Override // com.avito.android.passport.profile_add.data.mapper.d
    @k
    public final X50.e a(@k uA.d dVar) {
        int id2 = (int) dVar.getId();
        String title = dVar.getTitle();
        String description = dVar.getDescription();
        if (description == null) {
            description = "";
        }
        String str = description;
        List<uA.c> listF = dVar.f();
        if (listF == null) {
            listF = C42784z0.f406748b;
        }
        List<uA.c> list = listF;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f212286a.a((uA.c) it.next()));
        }
        Long defaultSpecificId = dVar.getDefaultSpecificId();
        return new X50.e(id2, title, str, arrayList, defaultSpecificId != null ? Integer.valueOf((int) defaultSpecificId.longValue()) : null, dVar.getDisabled(), dVar.getDisablingText());
    }
}

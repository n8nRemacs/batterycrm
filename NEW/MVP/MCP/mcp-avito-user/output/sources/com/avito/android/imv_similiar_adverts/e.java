package com.avito.android.imv_similiar_adverts;

import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import uk0.C49071a;

/* compiled from: ImvSerpElementItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/e;", "Lcom/avito/android/imv_similiar_adverts/d;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34904z0 f170853a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f170854b;

    public e(@Y61.k InterfaceC34904z0 interfaceC34904z0, @Y61.k a aVar) {
        this.f170853a = interfaceC34904z0;
        this.f170854b = aVar;
    }

    @Override // com.avito.android.imv_similiar_adverts.d
    @Y61.k
    public final ArrayList a(@Y61.k List list, @Y61.k C49071a c49071a, @Y61.k SerpDisplayType serpDisplayType) {
        List listSingletonList = Collections.singletonList(this.f170854b.a(c49071a));
        ArrayList arrayListB = C42745f0.B(list, SerpAdvert.class);
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListB, 10));
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            arrayList.add(InterfaceC34904z0.a.a(this.f170853a, (SerpAdvert) it.next(), false, false, serpDisplayType, null, 0, null, null, false, 2036));
        }
        return C42745f0.h0(arrayList, listSingletonList);
    }
}

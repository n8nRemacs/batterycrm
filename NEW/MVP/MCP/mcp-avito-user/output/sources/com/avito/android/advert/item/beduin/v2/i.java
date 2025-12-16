package com.avito.android.advert.item.beduin.v2;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.beduin.v2.g;
import com.avito.android.util.p6;
import com.avito.android.util.q6;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ItemCardNativeCellWrapperFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/i;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/android/advert/item/beduin/v2/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.beduin.v2.render.android_view.n<g> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<com.avito.konveyor.a> f73356c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final q f73357d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f73358e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f73359f;

    @Inject
    public i(@Y61.k Y41.a<com.avito.konveyor.a> aVar, @Y61.k q qVar) {
        super(p.f73369c);
        this.f73356c = aVar;
        this.f73357d = qVar;
        this.f73358e = new ArrayList();
        this.f73359f = "ItemCardNativeCellWrapper";
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @Y61.k
    public final InterfaceC36343m b(@Y61.k A a12) {
        g gVar = new g(this.f73356c.invoke(), this.f73357d);
        this.f73358e.add(gVar);
        return gVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final String getF73359f() {
        return this.f73359f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    @Y61.k
    public final ArrayList o() {
        ?? arrayList;
        ArrayList arrayList2 = this.f73358e;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            g.a aVar = ((g) it.next()).f73348p;
            if (aVar != null) {
                q6 q6Var = new q6(aVar.f73349a);
                arrayList = new ArrayList(C42745f0.q(q6Var, 10));
                Iterator<View> it2 = q6Var.iterator();
                while (true) {
                    p6 p6Var = (p6) it2;
                    if (p6Var.hasNext()) {
                        arrayList.add((g.b) ((View) p6Var.next()).getTag());
                    }
                }
            } else {
                arrayList = C42784z0.f406748b;
            }
            C42745f0.h((Iterable) arrayList, arrayList3);
        }
        return arrayList3;
    }
}

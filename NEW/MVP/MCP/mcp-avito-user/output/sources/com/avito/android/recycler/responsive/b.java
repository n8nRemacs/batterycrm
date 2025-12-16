package com.avito.android.recycler.responsive;

import Y61.k;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CallableResponsiveItemPresenterRegistry.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/recycler/responsive/b;", "Lcom/avito/android/recycler/responsive/a;", "<init>", "()V", "a", "_avito_recycler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.recycler.responsive.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f252359a = new ArrayList();

    /* compiled from: CallableResponsiveItemPresenterRegistry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recycler/responsive/b$a;", "", "_avito_recycler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.favorite_sellers.adapter.advert_list.d f252360a;

        public a(@k com.avito.android.favorite_sellers.adapter.advert_list.d dVar) {
            this.f252360a = dVar;
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.responsive.a
    public final void a(@k com.avito.konveyor.adapter.b bVar, int i12) {
        g gVarC = c(bVar);
        if (gVarC != null) {
            gVarC.r0(bVar, i12);
        }
    }

    @Override // com.avito.android.recycler.responsive.a
    public final void b(@k com.avito.konveyor.adapter.b bVar, int i12) {
        g gVarC = c(bVar);
        if (gVarC != null) {
            gVarC.t0(bVar, i12);
        }
    }

    public final g c(com.avito.konveyor.adapter.b bVar) {
        Object next;
        Iterator it = this.f252359a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ((a) next).getClass();
            if (com.avito.android.favorite_sellers.adapter.advert_list.g.class.isAssignableFrom(bVar.getClass())) {
                break;
            }
        }
        a aVar = (a) next;
        if (aVar != null) {
            return aVar.f252360a;
        }
        return null;
    }

    public final void d(@k com.avito.android.favorite_sellers.adapter.advert_list.d dVar) {
        this.f252359a.add(new a(dVar));
    }
}

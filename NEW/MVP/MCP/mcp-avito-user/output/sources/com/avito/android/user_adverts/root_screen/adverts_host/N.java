package com.avito.android.user_adverts.root_screen.adverts_host;

import com.avito.android.user_adverts.tab_screens.adverts.n;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsHostListActionListener.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/N;", "Lcom/avito/android/user_adverts/tab_screens/adverts/n;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class N implements com.avito.android.user_adverts.tab_screens.adverts.n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Set<com.avito.android.user_adverts.tab_screens.adverts.n> f312261a;

    @Inject
    public N(@Y61.k Set<com.avito.android.user_adverts.tab_screens.adverts.n> set) {
        this.f312261a = set;
    }

    @Override // com.avito.android.user_adverts.tab_screens.adverts.n
    public final void a(@Y61.k n.a aVar) {
        Iterator<T> it = this.f312261a.iterator();
        while (it.hasNext()) {
            ((com.avito.android.user_adverts.tab_screens.adverts.n) it.next()).a(aVar);
        }
    }
}

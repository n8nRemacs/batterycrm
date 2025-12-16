package com.avito.android.categories_global;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.view.C23302N;
import androidx.view.C23303N0;
import androidx.view.C23311S;
import androidx.view.C23326c0;
import androidx.view.C23375k;
import androidx.view.C23391s;
import androidx.view.compose.C23339e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CategoriesScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/categories_global/CategoriesScreen;", "Lcom/avito/android/lib/compose/design/shared/navigation/a;", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CategoriesScreen implements com.avito.android.lib.compose.design.shared.navigation.a {
    @Override // com.avito.android.lib.compose.design.shared.navigation.a
    public final void a(@Y61.k C23326c0 c23326c0) {
        i.f116385a.getClass();
        g gVar = g.f116383l;
        C23391s c23391s = new C23391s();
        gVar.invoke(c23391s);
        C23375k c23375k = new C23375k("categoryName", c23391s.f53179a.a());
        h hVar = h.f116384l;
        C23391s c23391s2 = new C23391s();
        hVar.invoke(c23391s2);
        List<C23375k> listU = C42745f0.U(c23375k, new C23375k("categoryId", c23391s2.f53179a.a()));
        n nVar = n.f116435l;
        C23311S c23311s = new C23311S();
        nVar.invoke(c23311s);
        String str = c23311s.f52870b;
        if (str == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.");
        }
        C23302N.a aVar = c23311s.f52869a;
        aVar.f52831a = str;
        List listSingletonList = Collections.singletonList(new C23302N(aVar.f52831a, aVar.f52832b, aVar.f52833c));
        C22096n c22096n = new C22096n(1025676211, new v(this), true);
        C23303N0 c23303n0 = c23326c0.f52912g;
        c23303n0.getClass();
        C23303N0.f52846b.getClass();
        C23339e.b bVar = new C23339e.b((C23339e) c23303n0.b(C23303N0.a.a(C23339e.class)), c22096n);
        bVar.t("globalCategories?categoryName={categoryName}&categoryId={categoryId}");
        for (C23375k c23375k2 : listU) {
            bVar.f52885h.put(c23375k2.f53166a, c23375k2.f53167b);
        }
        Iterator it = listSingletonList.iterator();
        while (it.hasNext()) {
            bVar.a((C23302N) it.next());
        }
        c23326c0.f52914i.add(bVar);
    }
}

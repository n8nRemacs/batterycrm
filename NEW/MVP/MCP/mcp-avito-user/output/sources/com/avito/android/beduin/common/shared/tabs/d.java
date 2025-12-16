package com.avito.android.beduin.common.shared.tabs;

import Y61.k;
import Y61.l;
import android.view.ViewGroup;
import com.avito.android.lib.deprecated_design.tab.adapter.g;
import com.avito.android.lib.deprecated_design.tab.adapter.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.H0;
import kotlin.collections.J0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTabLayoutWrapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/shared/tabs/d;", "", "tab1", "tab2", "", "areTabsEqual", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface d {

    /* compiled from: BeduinTabLayoutWrapper.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static boolean a(@l g gVar, @k List list) {
            j<T> jVar;
            com.avito.android.lib.deprecated_design.tab.a aVar;
            com.avito.android.lib.deprecated_design.tab.a aVar2;
            if (gVar == null || (jVar = gVar.f178152a) == 0 || jVar.getCount() != list.size()) {
                return false;
            }
            Iterable iterableS0 = C42745f0.S0(list);
            if (!(iterableS0 instanceof Collection) || !((Collection) iterableS0).isEmpty()) {
                Iterator it = iterableS0.iterator();
                do {
                    J0 j02 = (J0) it;
                    if (j02.f406646b.hasNext()) {
                        H0 h02 = (H0) j02.next();
                        int i12 = h02.f406643a;
                        aVar = (com.avito.android.lib.deprecated_design.tab.a) h02.f406644b;
                        Object item = jVar.getItem(i12);
                        if (aVar == null || !(item instanceof com.avito.android.lib.deprecated_design.tab.a)) {
                            return false;
                        }
                        aVar2 = (com.avito.android.lib.deprecated_design.tab.a) item;
                        if (!L.f(aVar.getF316857h(), aVar2.getF316857h())) {
                            return false;
                        }
                    }
                } while (L.f(aVar.getF245877d(), aVar2.getF245877d()));
                return false;
            }
            return true;
        }
    }

    void Qa(int i12);

    @k
    ViewGroup getView();

    void mc(@k List<? extends com.avito.android.lib.deprecated_design.tab.a> list);

    void nc(@l Y41.l<? super Integer, G0> lVar);
}

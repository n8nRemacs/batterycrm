package com.avito.android.bundles.ui.recycler;

import Y61.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasBundleContentComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bundles/ui/recycler/b;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.recycler.data_aware.b {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        return L.f(aVar != null ? Long.valueOf(aVar.getF94474b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF94474b()) : null) && (aVar instanceof com.avito.android.bundles.ui.recycler.item.bundle.c) && (aVar2 instanceof com.avito.android.bundles.ui.recycler.item.bundle.c) && L.f(((com.avito.android.bundles.ui.recycler.item.bundle.c) aVar).f108402e, ((com.avito.android.bundles.ui.recycler.item.bundle.c) aVar2).f108402e);
    }
}

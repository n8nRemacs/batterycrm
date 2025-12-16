package com.avito.android.recycler.data_aware;

import Y61.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SimpleEqualityComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recycler/data_aware/j;", "Lcom/avito/android/recycler/data_aware/f;", "<init>", "()V", "_avito_recycler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements f {
    @Inject
    public j() {
    }

    @Override // com.avito.android.recycler.data_aware.f
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        return L.f(aVar != null ? Long.valueOf(aVar.getId()) : null, aVar2 != null ? Long.valueOf(aVar2.getId()) : null);
    }
}

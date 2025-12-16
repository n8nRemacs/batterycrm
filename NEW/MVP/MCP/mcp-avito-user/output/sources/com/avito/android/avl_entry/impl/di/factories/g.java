package com.avito.android.avl_entry.impl.di.factories;

import Y61.k;
import Y61.l;
import com.avito.android.util.Kundle;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShortVideosItemStateProviderFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/di/factories/g;", "LKg/b;", "<init>", "()V", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements Kg.b {
    @Inject
    public g() {
    }

    @Override // Kg.b
    @k
    public final com.avito.android.avl_entry.impl.ui.external_item.i a(@l Kundle kundle) {
        com.avito.android.avl_entry.impl.ui.external_item.i iVar = new com.avito.android.avl_entry.impl.ui.external_item.i();
        if (kundle == null) {
            kundle = new Kundle();
        }
        iVar.f98549a = kundle;
        return iVar;
    }
}

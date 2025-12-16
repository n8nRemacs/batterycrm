package com.avito.android.avl_entry.impl.di.factories;

import Jg.InterfaceC14195a;
import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShortVideosItemBlueprintFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/di/factories/a;", "LJg/a;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC14195a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.avl_analytics.a f98474a;

    @Inject
    public a(@k com.avito.android.avl_analytics.a aVar) {
        this.f98474a = aVar;
    }

    @Override // Jg.InterfaceC14195a
    @k
    public final com.avito.android.avl_entry.impl.ui.external_item.a a(@k Jg.b bVar, @k Ig.f fVar, @k InterfaceC35745a5 interfaceC35745a5) {
        return new com.avito.android.avl_entry.impl.ui.external_item.a(bVar, fVar, interfaceC35745a5, this.f98474a);
    }
}

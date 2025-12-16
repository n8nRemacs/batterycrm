package com.avito.android.avl_entry.impl.di.factories;

import Kg.InterfaceC14312a;
import Y61.k;
import com.avito.android.C36135w2;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShortVideosItemPresenterFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/di/factories/d;", "LJg/c;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements Jg.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.player_holder.a f98475a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f98476b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C36135w2 f98477c;

    @Inject
    public d(@k com.avito.android.player_holder.a aVar, @k com.avito.android.serp.analytics.widgets_tracker.g gVar, @k C36135w2 c36135w2) {
        this.f98475a = aVar;
        this.f98476b = gVar;
        this.f98477c = c36135w2;
    }

    @Override // Jg.c
    @k
    public final com.avito.android.avl_entry.impl.ui.external_item.b a(@k InterfaceC14312a interfaceC14312a, @k InterfaceC35745a5 interfaceC35745a5, @k Ig.f fVar, @k com.avito.android.avl_analytics.a aVar) {
        return new com.avito.android.avl_entry.impl.ui.external_item.b(interfaceC14312a, interfaceC35745a5, aVar, fVar, this.f98475a, this.f98476b, this.f98477c);
    }
}

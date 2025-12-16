package com.avito.android.advert.item.beduin;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.advertising.loaders.beduin.H;
import com.avito.android.util.InterfaceC35745a5;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsBeduinViewModelProviderFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/m;", "Landroidx/lifecycle/P0$c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f73248a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f73249b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final B4.d f73250c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final H f73251d;

    @Inject
    public m(@Y61.k a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @B4.e @Y61.k B4.d dVar, @Y61.k H h12) {
        this.f73248a = aVar;
        this.f73249b = interfaceC35745a5;
        this.f73250c = dVar;
        this.f73251d = h12;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        return new l(this.f73248a, this.f73249b, (InterfaceC40691b) this.f73250c.get(), this.f73251d);
    }
}

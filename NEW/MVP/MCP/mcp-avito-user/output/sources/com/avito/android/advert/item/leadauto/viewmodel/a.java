package com.avito.android.advert.item.leadauto.viewmodel;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.util.R0;
import h30.InterfaceC40766a;
import h31.e;
import javax.inject.Inject;
import k30.InterfaceC42490a;
import kotlin.Metadata;

/* compiled from: AutoNewCarsLeadFormViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/leadauto/viewmodel/a;", "Landroidx/lifecycle/P0$c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC40766a> f77313a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42490a f77314b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f77315c;

    @Inject
    public a(@k e<InterfaceC40766a> eVar, @k InterfaceC42490a interfaceC42490a, @k R0 r02) {
        this.f77313a = eVar;
        this.f77314b = interfaceC42490a;
        this.f77315c = r02;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (!cls.isAssignableFrom(c.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new c(this.f77313a, this.f77314b, this.f77315c);
    }
}

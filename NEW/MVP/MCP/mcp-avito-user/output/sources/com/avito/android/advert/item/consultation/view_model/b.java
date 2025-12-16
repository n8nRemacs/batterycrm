package com.avito.android.advert.item.consultation.view_model;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import ow.InterfaceC44946a;

/* compiled from: ConsultationDataViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/consultation/view_model/b;", "Landroidx/lifecycle/P0$c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f74832a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44946a> f74833b;

    @Inject
    public b(@k InterfaceC35745a5 interfaceC35745a5, @k h31.e<InterfaceC44946a> eVar) {
        this.f74832a = interfaceC35745a5;
        this.f74833b = eVar;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (cls.isAssignableFrom(e.class)) {
            return new e(this.f74832a, this.f74833b);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}

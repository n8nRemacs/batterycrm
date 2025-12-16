package com.avito.android.rubricator.list.service;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.rubricator.list.service.model.ServiceListArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import wn0.InterfaceC49655a;

/* compiled from: ServiceListFragmentViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/list/service/b;", "Landroidx/lifecycle/P0$c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ServiceListArguments f255950a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC49655a f255951b;

    @Inject
    public b(@k ServiceListArguments serviceListArguments, @k InterfaceC49655a interfaceC49655a) {
        this.f255950a = serviceListArguments;
        this.f255951b = interfaceC49655a;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (cls.isAssignableFrom(i.class)) {
            return new i(this.f255950a, this.f255951b);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}

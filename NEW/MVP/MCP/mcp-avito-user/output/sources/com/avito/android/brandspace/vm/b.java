package com.avito.android.brandspace.vm;

import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor;
import com.avito.android.util.InterfaceC35745a5;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;
import pk.InterfaceC47104b;

/* compiled from: BrandspaceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brandspace/vm/b;", "Landroidx/lifecycle/P0$c;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f107809a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.brandspace.interactor.d f107810b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BrandspaceAnalyticsInteractor f107811c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC47104b f107812d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC40691b f107813e;

    @Inject
    public b(@k BrandspaceAnalyticsInteractor brandspaceAnalyticsInteractor, @k com.avito.android.brandspace.interactor.d dVar, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC40691b interfaceC40691b, @k InterfaceC47104b interfaceC47104b) {
        this.f107809a = interfaceC35745a5;
        this.f107810b = dVar;
        this.f107811c = brandspaceAnalyticsInteractor;
        this.f107812d = interfaceC47104b;
        this.f107813e = interfaceC40691b;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        BrandspaceAnalyticsInteractor brandspaceAnalyticsInteractor = this.f107811c;
        InterfaceC40691b interfaceC40691b = this.f107813e;
        return new d(brandspaceAnalyticsInteractor, this.f107810b, this.f107809a, interfaceC40691b, this.f107812d);
    }
}

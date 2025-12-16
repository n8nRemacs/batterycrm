package com.avito.android.brandspace.brandspace;

import Y61.k;
import com.avito.android.arch.mvi.android.j;
import com.avito.android.brandspace.brandspace.mvi.h;
import com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import jk.AbstractC42392c;
import jk.InterfaceC42390a;
import jk.InterfaceC42391b;
import kotlin.Metadata;
import pk.InterfaceC47104b;

/* compiled from: BrandspaceViewModelMvi.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/brandspace/brandspace/e;", "Lcom/avito/android/arch/mvi/android/j;", "Ljk/a;", "Ljk/c;", "Ljk/b;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends j<InterfaceC42390a, AbstractC42392c, InterfaceC42391b> {

    /* renamed from: N, reason: collision with root package name */
    @k
    public final BrandspaceAnalyticsInteractor f107613N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final InterfaceC40691b f107614O;

    /* renamed from: P, reason: collision with root package name */
    @k
    public final InterfaceC47104b f107615P;

    @Inject
    public e(@k h hVar, @k BrandspaceAnalyticsInteractor brandspaceAnalyticsInteractor, @k InterfaceC40691b interfaceC40691b, @k InterfaceC47104b interfaceC47104b) {
        super(hVar, null, 2, null);
        this.f107613N = brandspaceAnalyticsInteractor;
        this.f107614O = interfaceC40691b;
        this.f107615P = interfaceC47104b;
        accept(InterfaceC42390a.b.f405782a);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f107614O.onCleared();
    }
}

package com.avito.android.analytics.screens.touch;

import Y61.k;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import kotlin.Metadata;

/* compiled from: AppComesForegroundLastClickUpdater.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/touch/a;", "Landroidx/lifecycle/q;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f90698b;

    public a(b bVar) {
        this.f90698b = bVar;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStop(@k InterfaceC22983P interfaceC22983P) {
        this.f90698b.f90699b = true;
    }
}

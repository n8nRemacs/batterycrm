package com.avito.android.home.navbar;

import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: NavbarBusiness360StatusBarUpdatesProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/navbar/d;", "Lcom/avito/android/ui/status_bar/k;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.ui.status_bar.k {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f162440b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<com.avito.android.ui.status_bar.d> f162441c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> f162442d;

    public d(boolean z12) {
        this.f162440b = z12;
        Z1<com.avito.android.ui.status_bar.d> z1A = p2.a(null);
        this.f162441c = z1A;
        this.f162442d = C43175k.b(z1A);
    }

    @Override // com.avito.android.ui.status_bar.k
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> e2() {
        return this.f162442d;
    }
}

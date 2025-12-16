package com.avito.android.settings.adapter;

import Nv0.InterfaceC14616a;
import com.avito.android.settings.adapter.i0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InfoSettingsItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/adapter/s;", "Lcom/avito/android/settings/adapter/q;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.settings.adapter.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34960s implements InterfaceC34959q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14616a, G0> f280807b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public C34960s(@Y61.k Y41.l<? super InterfaceC14616a, G0> lVar) {
        this.f280807b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        InterfaceC34962u interfaceC34962u = (InterfaceC34962u) eVar;
        i0.d dVar = (i0.d) aVar;
        interfaceC34962u.g0(dVar.f280789c);
        interfaceC34962u.a(new r(this, dVar));
    }
}

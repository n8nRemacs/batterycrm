package com.avito.android.settings.adapter;

import Nv0.InterfaceC14616a;
import com.avito.android.settings.adapter.i0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InfoSettingsWithProgressItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/adapter/A;", "Lcom/avito/android/settings/adapter/y;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class A implements InterfaceC34966y {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14616a, G0> f280728b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public A(@Y61.k Y41.l<? super InterfaceC14616a, G0> lVar) {
        this.f280728b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        C c12 = (C) eVar;
        i0.e eVar2 = (i0.e) aVar;
        c12.setTitle(eVar2.f280790b);
        c12.UD(eVar2.f280791c);
        c12.a(new C34967z(this, eVar2));
    }
}

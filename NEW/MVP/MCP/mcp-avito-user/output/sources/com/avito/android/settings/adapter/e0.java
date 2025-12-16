package com.avito.android.settings.adapter;

import Nv0.InterfaceC14616a;
import com.avito.android.settings.adapter.i0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectSettingsItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/adapter/e0;", "Lcom/avito/android/settings/adapter/c0;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e0 implements c0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14616a, G0> f280777b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e0(@Y61.k Y41.l<? super InterfaceC14616a, G0> lVar) {
        this.f280777b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g0 g0Var = (g0) eVar;
        i0.i iVar = (i0.i) aVar;
        g0Var.m3(iVar.f280798c);
        g0Var.m(iVar.f280799d);
        g0Var.a(new d0(this, iVar));
    }
}

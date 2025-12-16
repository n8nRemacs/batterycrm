package com.avito.android.settings.adapter;

import Nv0.InterfaceC14616a;
import com.avito.android.settings.adapter.i0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LogoWithVersionSettingsItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/adapter/S;", "Lcom/avito/android/settings/adapter/O;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class S implements O {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14616a, G0> f280752b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public S(@Y61.k Y41.l<? super InterfaceC14616a, G0> lVar) {
        this.f280752b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        U u12 = (U) eVar;
        i0.g gVar = (i0.g) aVar;
        u12.q80(new P(this, gVar));
        u12.SE(new Q(this, gVar));
        u12.fg(gVar.f280795b);
    }
}

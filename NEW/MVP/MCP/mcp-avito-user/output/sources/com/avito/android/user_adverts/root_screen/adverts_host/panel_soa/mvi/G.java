package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import MI0.b;
import MI0.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PanelSoaOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/mvi/G;", "Lcom/avito/android/arch/mvi/t;", "LMI0/b;", "LMI0/c;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class G implements com.avito.android.arch.mvi.t<MI0.b, MI0.c> {
    @Inject
    public G() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final MI0.c b(MI0.b bVar) {
        MI0.b bVar2 = bVar;
        if (bVar2 instanceof b.e) {
            return new c.a(((b.e) bVar2).f10562a);
        }
        if (!(bVar2 instanceof b.f)) {
            return null;
        }
        b.f fVar = (b.f) bVar2;
        return new c.b(fVar.f10563a, fVar.f10564b);
    }
}

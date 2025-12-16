package com.avito.android.settings;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: SettingsView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class p extends H implements Y41.l<Nv0.d, G0> {
    @Override // Y41.l
    public final G0 invoke(Nv0.d dVar) {
        Nv0.d dVar2 = dVar;
        q qVar = (q) this.receiver;
        qVar.getClass();
        boolean z12 = dVar2.f11865a;
        qVar.f280968g.setVisibility(z12 ? 0 : 8);
        qVar.f280967f.setVisibility(!z12 ? 0 : 8);
        qVar.f280969h.setVisibility(dVar2.f11871g ? 0 : 8);
        qVar.f280964c.c(new UV0.c(dVar2.f11866b));
        qVar.f280966e.notifyDataSetChanged();
        return G0.f406611a;
    }
}

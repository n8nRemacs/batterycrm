package com.avito.android.recall_me.presentation;

import kotlin.G0;
import kotlin.Metadata;
import zi0.InterfaceC50573c;

/* compiled from: RecallMeView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class o extends kotlin.jvm.internal.H implements Y41.l<InterfaceC50573c, G0> {
    @Override // Y41.l
    public final G0 invoke(InterfaceC50573c interfaceC50573c) {
        InterfaceC50573c interfaceC50573c2 = interfaceC50573c;
        n nVar = (n) this.receiver;
        nVar.getClass();
        if (interfaceC50573c2 instanceof InterfaceC50573c.C12969c) {
            com.avito.android.progress_overlay.l lVar = nVar.f252025g;
            (lVar != null ? lVar : null).j();
            nVar.f252021c.c(new UV0.c(((InterfaceC50573c.C12969c) interfaceC50573c2).f444192a));
            nVar.f252020b.notifyDataSetChanged();
        } else if (interfaceC50573c2 instanceof InterfaceC50573c.d) {
            com.avito.android.progress_overlay.l lVar2 = nVar.f252025g;
            if (lVar2 == null) {
                lVar2 = null;
            }
            lVar2.k(null);
        } else if (interfaceC50573c2 instanceof InterfaceC50573c.b) {
            com.avito.android.progress_overlay.l lVar3 = nVar.f252025g;
            (lVar3 != null ? lVar3 : null).a(((InterfaceC50573c.b) interfaceC50573c2).f444191a);
        }
        return G0.f406611a;
    }
}

package com.avito.android.developments_agency_search.screen.help_center.mvi;

import Gw.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HelpCenterReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/help_center/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "LGw/b;", "LGw/d;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements u<Gw.b, Gw.d> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Gw.d a(Gw.b bVar, Gw.d dVar) {
        Gw.b bVar2 = bVar;
        Gw.d dVar2 = dVar;
        return bVar2 instanceof b.c.a ? Gw.d.a(dVar2, new P2.a(com.avito.android.remote.error.j.d(3, null)), false, 2) : bVar2 instanceof b.c.C0384b ? Gw.d.a(dVar2, new P2.b(((b.c.C0384b) bVar2).f6787a), false, 2) : bVar2 instanceof b.j ? Gw.d.a(dVar2, null, ((b.j) bVar2).f6793a, 1) : dVar2;
    }
}

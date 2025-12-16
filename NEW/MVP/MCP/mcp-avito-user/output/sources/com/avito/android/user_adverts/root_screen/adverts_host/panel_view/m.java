package com.avito.android.user_adverts.root_screen.adverts_host.panel_view;

import android.view.View;
import androidx.view.C22977J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.h;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.b;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.k;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.b;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.h;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.b;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.i;
import nE.C44240b;

/* compiled from: PanelView_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class m implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public final l f313772a;

    public m(l lVar) {
        this.f313772a = lVar;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.h.c
    public final h a(View view, h.g gVar, C22977J c22977j, h.d dVar) {
        l lVar = this.f313772a;
        ScreenPerformanceTracker screenPerformanceTracker = lVar.f313763a.get();
        C44240b c44240b = lVar.f313764b.get();
        lVar.f313765c.getClass();
        b.a aVar = new b.a();
        lVar.f313766d.getClass();
        k.a aVar2 = new k.a();
        lVar.f313767e.getClass();
        b.a aVar3 = new b.a();
        lVar.f313768f.getClass();
        h.a aVar4 = new h.a();
        lVar.f313769g.getClass();
        b.a aVar5 = new b.a();
        lVar.f313770h.getClass();
        return new h(view, gVar, screenPerformanceTracker, c44240b, aVar, aVar2, aVar3, aVar4, aVar5, new i.a(), lVar.f313771i.get(), c22977j, dVar);
    }
}

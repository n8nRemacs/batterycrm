package com.avito.android.travel_search.ui;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import cU0.C27106d;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.inline_filters.dialog.z;
import com.avito.android.travel_search.ui.n;
import com.avito.beduin.v2.engine.component.x;

/* compiled from: TravelSearchViewImpl_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class p implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public final o f303288a;

    public p(o oVar) {
        this.f303288a = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.travel_search.ui.n.a
    public final n a(View view, TravelSearchFragment travelSearchFragment, FragmentManager fragmentManager, x xVar, C27106d c27106d) {
        o oVar = this.f303288a;
        return new n(view, travelSearchFragment, fragmentManager, xVar, c27106d, (Y41.l) oVar.f303274a.f393949a, (Screen) oVar.f303275b.f393949a, oVar.f303276c.get(), oVar.f303277d.get(), oVar.f303278e.get(), oVar.f303279f.get(), oVar.f303280g.get(), oVar.f303281h.get(), oVar.f303282i.get(), (com.avito.android.onboarding_manager.a) oVar.f303283j.get(), (z) oVar.f303284k.get(), oVar.f303285l.get(), oVar.f303286m.get(), oVar.f303287n.get());
    }
}

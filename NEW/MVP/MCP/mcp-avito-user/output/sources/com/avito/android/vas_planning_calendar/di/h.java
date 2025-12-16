package com.avito.android.vas_planning_calendar.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.vas_planning_calendar.C36072f;
import com.avito.android.vas_planning_calendar.C36073g;
import com.avito.android.vas_planning_calendar.M;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPlanCalendarModule_ProvideCalendarViewModel$_avito_vas_planning_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<com.avito.android.vas_planning_calendar.y> {

    /* renamed from: a, reason: collision with root package name */
    public final l f322646a;

    /* renamed from: b, reason: collision with root package name */
    public final C36073g f322647b;

    public h(l lVar, C36073g c36073g) {
        this.f322646a = lVar;
        this.f322647b = c36073g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f322646a.f393949a;
        C36072f c36072f = (C36072f) this.f322647b.get();
        int i12 = f.f322643a;
        return (com.avito.android.vas_planning_calendar.y) new P0(fragment, c36072f).a(M.class);
    }
}

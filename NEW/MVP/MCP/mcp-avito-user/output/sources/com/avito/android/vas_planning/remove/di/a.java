package com.avito.android.vas_planning.remove.di;

import aM0.InterfaceC19791a;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_planning.remove.VasPlannerRemoveDialogFragment;
import com.avito.android.vas_planning.remove.VasPlannerRemoveInfo;
import com.avito.android.vas_planning.remove.di.b;
import com.avito.android.vas_planning.remove.m;
import com.avito.android.vas_planning.remove.o;
import com.avito.android.vas_planning.remove.r;
import dagger.internal.t;

/* compiled from: DaggerVasPlannerRemoveComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVasPlannerRemoveComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.vas_planning.remove.di.b.a
        public final com.avito.android.vas_planning.remove.di.b a(ActivityC22955m activityC22955m, VasPlannerRemoveInfo vasPlannerRemoveInfo, com.avito.android.vas_planning.remove.di.c cVar) {
            return new c(new d(), cVar, activityC22955m, vasPlannerRemoveInfo, null);
        }
    }

    /* compiled from: DaggerVasPlannerRemoveComponent.java */
    public static final class c implements com.avito.android.vas_planning.remove.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final d f322488a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.vas_planning.remove.di.c f322489b;

        /* renamed from: c, reason: collision with root package name */
        public final VasPlannerRemoveInfo f322490c;

        /* renamed from: d, reason: collision with root package name */
        public final ActivityC22955m f322491d;

        public c(d dVar, com.avito.android.vas_planning.remove.di.c cVar, ActivityC22955m activityC22955m, VasPlannerRemoveInfo vasPlannerRemoveInfo, C9969a c9969a) {
            this.f322488a = dVar;
            this.f322489b = cVar;
            this.f322490c = vasPlannerRemoveInfo;
            this.f322491d = activityC22955m;
        }

        @Override // com.avito.android.vas_planning.remove.di.b
        public final void a(VasPlannerRemoveDialogFragment vasPlannerRemoveDialogFragment) {
            com.avito.android.vas_planning.remove.di.c cVar = this.f322489b;
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            InterfaceC19791a interfaceC19791aW3 = cVar.W3();
            t.c(interfaceC19791aW3);
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            VasPlannerRemoveInfo vasPlannerRemoveInfo = this.f322490c;
            r rVar = new r(interfaceC19791aW3, interfaceC28373aA, interfaceC35745a5D, vasPlannerRemoveInfo);
            this.f322488a.getClass();
            ActivityC22955m activityC22955m = this.f322491d;
            vasPlannerRemoveDialogFragment.f322469h0 = (o) new P0(activityC22955m, rVar).a(o.class);
            vasPlannerRemoveDialogFragment.f322470i0 = new m(activityC22955m.getResources(), vasPlannerRemoveInfo);
        }
    }

    public static b.a a() {
        return new b();
    }
}

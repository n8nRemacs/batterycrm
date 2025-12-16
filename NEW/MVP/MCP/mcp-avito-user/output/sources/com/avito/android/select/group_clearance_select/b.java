package com.avito.android.select.group_clearance_select;

import aq0.InterfaceC23653b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.select.group_clearance_select.c;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerGroupClearanceComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: DaggerGroupClearanceComponent.java */
    /* renamed from: com.avito.android.select.group_clearance_select.b$b, reason: collision with other inner class name */
    public static final class C7928b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public C28478k f265485a;

        /* renamed from: b, reason: collision with root package name */
        public GroupClearanceParams f265486b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC23653b f265487c;

        public C7928b() {
        }
    }

    /* compiled from: DaggerGroupClearanceComponent.java */
    public static final class c implements com.avito.android.select.group_clearance_select.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.select.group_clearance_select.mvi.d f265488a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28373a> f265489b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f265490c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.select.group_clearance_select.mvi.l f265491d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f265492e;

        /* renamed from: f, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f265493f;

        /* renamed from: g, reason: collision with root package name */
        public final q f265494g;

        /* compiled from: DaggerGroupClearanceComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265495a;

            public a(InterfaceC23653b interfaceC23653b) {
                this.f265495a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f265495a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerGroupClearanceComponent.java */
        /* renamed from: com.avito.android.select.group_clearance_select.b$c$b, reason: collision with other inner class name */
        public static final class C7929b implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265496a;

            public C7929b(InterfaceC23653b interfaceC23653b) {
                this.f265496a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f265496a.v();
                t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerGroupClearanceComponent.java */
        /* renamed from: com.avito.android.select.group_clearance_select.b$c$c, reason: collision with other inner class name */
        public static final class C7930c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f265497a;

            public C7930c(InterfaceC23653b interfaceC23653b) {
                this.f265497a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f265497a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(InterfaceC23653b interfaceC23653b, C28478k c28478k, GroupClearanceParams groupClearanceParams, a aVar) {
            this.f265488a = new com.avito.android.select.group_clearance_select.mvi.d(new h(dagger.internal.l.a(groupClearanceParams)));
            this.f265491d = new com.avito.android.select.group_clearance_select.mvi.l(new a(interfaceC23653b), new C7929b(interfaceC23653b));
            this.f265492e = new C7930c(interfaceC23653b);
            this.f265493f = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f265492e);
            this.f265494g = new q(new com.avito.android.select.group_clearance_select.mvi.g(this.f265488a, com.avito.android.select.group_clearance_select.mvi.b.a(), com.avito.android.select.group_clearance_select.mvi.i.a(), this.f265491d, this.f265493f));
        }
    }
}

package com.avito.android.publish_limits_info.history.di;

import Mf0.C14482b;
import Mf0.C14485e;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.progress_overlay.h;
import com.avito.android.publish_limits_info.ItemId;
import com.avito.android.publish_limits_info.history.PublishLimitsHistoryActivity;
import com.avito.android.publish_limits_info.history.di.b;
import com.avito.android.publish_limits_info.history.k;
import com.avito.android.publish_limits_info.history.m;
import com.avito.android.publish_limits_info.history.o;
import com.avito.android.remote.K0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPublishLimitsHistoryComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerPublishLimitsHistoryComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.publish_limits_info.history.di.b.a
        public final com.avito.android.publish_limits_info.history.di.b a(PublishLimitsHistoryActivity publishLimitsHistoryActivity, ItemId itemId, PublishLimitsHistoryActivity publishLimitsHistoryActivity2, com.avito.android.publish_limits_info.history.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, publishLimitsHistoryActivity, itemId, publishLimitsHistoryActivity2, null);
        }
    }

    /* compiled from: DaggerPublishLimitsHistoryComponent.java */
    public static final class c implements com.avito.android.publish_limits_info.history.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish_limits_info.history.tab.a f245816a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.publish_limits_info.history.di.c f245817b;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f245818c;

        /* renamed from: d, reason: collision with root package name */
        public final l f245819d;

        /* renamed from: e, reason: collision with root package name */
        public final l f245820e;

        /* renamed from: f, reason: collision with root package name */
        public final u<K0> f245821f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35745a5> f245822g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f245823h;

        /* renamed from: i, reason: collision with root package name */
        public final k f245824i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC35863o4> f245825j;

        /* renamed from: k, reason: collision with root package name */
        public final u<P0.c> f245826k;

        /* renamed from: l, reason: collision with root package name */
        public final u<m> f245827l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.publish_limits_info.history.tab.d> f245828m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28373a> f245829n;

        /* renamed from: o, reason: collision with root package name */
        public final u<h> f245830o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.progress_overlay.b> f245831p;

        /* compiled from: DaggerPublishLimitsHistoryComponent.java */
        /* renamed from: com.avito.android.publish_limits_info.history.di.a$c$a, reason: collision with other inner class name */
        public static final class C7367a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish_limits_info.history.di.c f245832a;

            public C7367a(com.avito.android.publish_limits_info.history.di.c cVar) {
                this.f245832a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f245832a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPublishLimitsHistoryComponent.java */
        public static final class b implements u<K0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish_limits_info.history.di.c f245833a;

            public b(com.avito.android.publish_limits_info.history.di.c cVar) {
                this.f245833a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                K0 k0P6 = this.f245833a.p6();
                t.c(k0P6);
                return k0P6;
            }
        }

        /* compiled from: DaggerPublishLimitsHistoryComponent.java */
        /* renamed from: com.avito.android.publish_limits_info.history.di.a$c$c, reason: collision with other inner class name */
        public static final class C7368c implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish_limits_info.history.di.c f245834a;

            public C7368c(com.avito.android.publish_limits_info.history.di.c cVar) {
                this.f245834a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f245834a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerPublishLimitsHistoryComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish_limits_info.history.di.c f245835a;

            public d(com.avito.android.publish_limits_info.history.di.c cVar) {
                this.f245835a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f245835a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerPublishLimitsHistoryComponent.java */
        public static final class e implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish_limits_info.history.di.c f245836a;

            public e(com.avito.android.publish_limits_info.history.di.c cVar) {
                this.f245836a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f245836a.o();
            }
        }

        public c(com.avito.android.publish_limits_info.history.di.c cVar, cv.b bVar, ActivityC22955m activityC22955m, ItemId itemId, com.avito.android.publish_limits_info.history.tab.a aVar, C7366a c7366a) {
            this.f245816a = aVar;
            this.f245817b = cVar;
            this.f245818c = bVar;
            this.f245819d = l.a(activityC22955m);
            this.f245820e = l.a(itemId);
            b bVar2 = new b(cVar);
            d dVar = new d(cVar);
            this.f245822g = dVar;
            this.f245824i = new k(bVar2, dVar, new e(cVar));
            this.f245825j = new C7368c(cVar);
            u<P0.c> uVarD = dagger.internal.g.d(new o(this.f245820e, this.f245824i, this.f245822g, this.f245825j, l.a(aVar)));
            this.f245826k = uVarD;
            u<m> uVarD2 = dagger.internal.g.d(new g(this.f245819d, uVarD));
            this.f245827l = uVarD2;
            this.f245828m = dagger.internal.g.d(new f(uVarD2));
            this.f245829n = new C7367a(cVar);
            u<h> uVarD3 = dagger.internal.g.d(new com.avito.android.publish_limits_info.history.di.e(this.f245819d));
            this.f245830o = uVarD3;
            this.f245831p = dagger.internal.g.d(new com.avito.android.progress_overlay.d(this.f245829n, uVarD3));
        }

        @Override // com.avito.android.publish_limits_info.history.di.b
        public final void I8(PublishLimitsHistoryActivity publishLimitsHistoryActivity) {
            publishLimitsHistoryActivity.f245802m = this.f245827l.get();
            publishLimitsHistoryActivity.f245803n = this.f245831p.get();
            InterfaceC28373a interfaceC28373aA = this.f245817b.a();
            t.c(interfaceC28373aA);
            C14482b.f10982a.getClass();
            publishLimitsHistoryActivity.f245804o = new C14485e(interfaceC28373aA);
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f245818c.u4();
            t.c(aVarU4);
            publishLimitsHistoryActivity.f245805p = aVarU4;
        }

        @Override // com.avito.android.publish_limits_info.history.tab.di.h
        public final com.avito.android.publish_limits_info.history.tab.d fa() {
            return this.f245828m.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

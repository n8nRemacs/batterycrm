package com.avito.android.category_items_tree.screens.tree_screen.di;

import Tn.InterfaceC15379a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.category_items_tree.screens.tree_screen.TreeActivity;
import com.avito.android.category_items_tree.screens.tree_screen.TreeArguments;
import com.avito.android.category_items_tree.screens.tree_screen.di.b;
import com.avito.android.category_items_tree.screens.tree_screen.f;
import com.avito.android.category_items_tree.screens.tree_screen.i;
import com.avito.android.category_items_tree.screens.tree_screen.mvi.k;
import com.avito.android.category_items_tree.screens.tree_screen.mvi.m;
import com.avito.android.category_items_tree.screens.tree_screen.n;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTreeComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerTreeComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.category_items_tree.screens.tree_screen.di.b.a
        public final com.avito.android.category_items_tree.screens.tree_screen.di.b a(com.avito.android.category_items_tree.screens.tree_screen.di.c cVar, InterfaceC39417a interfaceC39417a, InterfaceC30106l7 interfaceC30106l7, C28478k c28478k, TreeArguments treeArguments) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, interfaceC30106l7, c28478k, treeArguments, null);
        }
    }

    /* compiled from: DaggerTreeComponent.java */
    public static final class c implements com.avito.android.category_items_tree.screens.tree_screen.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f117113a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC15379a> f117114b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f117115c;

        /* renamed from: d, reason: collision with root package name */
        public final u<f> f117116d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f117117e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f117118f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.category_items_tree.screens.tree_screen.mvi.d f117119g;

        /* renamed from: h, reason: collision with root package name */
        public final n f117120h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f117121i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f117122j;

        /* compiled from: DaggerTreeComponent.java */
        /* renamed from: com.avito.android.category_items_tree.screens.tree_screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C3414a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category_items_tree.screens.tree_screen.di.c f117123a;

            public C3414a(com.avito.android.category_items_tree.screens.tree_screen.di.c cVar) {
                this.f117123a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f117123a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerTreeComponent.java */
        public static final class b implements u<InterfaceC15379a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category_items_tree.screens.tree_screen.di.c f117124a;

            public b(com.avito.android.category_items_tree.screens.tree_screen.di.c cVar) {
                this.f117124a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC15379a interfaceC15379aG5 = this.f117124a.g5();
                t.c(interfaceC15379aG5);
                return interfaceC15379aG5;
            }
        }

        /* compiled from: DaggerTreeComponent.java */
        /* renamed from: com.avito.android.category_items_tree.screens.tree_screen.di.a$c$c, reason: collision with other inner class name */
        public static final class C3415c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f117125a;

            public C3415c(cv.b bVar) {
                this.f117125a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f117125a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTreeComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.category_items_tree.screens.tree_screen.di.c f117126a;

            public d(com.avito.android.category_items_tree.screens.tree_screen.di.c cVar) {
                this.f117126a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f117126a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTreeComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f117127a;

            public e(InterfaceC30106l7 interfaceC30106l7) {
                this.f117127a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f117127a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.category_items_tree.screens.tree_screen.di.c cVar, cv.b bVar, InterfaceC30106l7 interfaceC30106l7, C28478k c28478k, TreeArguments treeArguments, C3413a c3413a) {
            this.f117113a = l.a(treeArguments);
            u<f> uVarD = g.d(new i(new b(cVar), new d(cVar)));
            this.f117116d = uVarD;
            C3414a c3414a = new C3414a(cVar);
            l lVar = this.f117113a;
            com.avito.android.category_items_tree.screens.tree_screen.mvi.f fVar = new com.avito.android.category_items_tree.screens.tree_screen.mvi.f(lVar, uVarD, c3414a);
            this.f117119g = new com.avito.android.category_items_tree.screens.tree_screen.mvi.d(lVar, new C3415c(bVar), c3414a);
            this.f117120h = new n(new com.avito.android.category_items_tree.screens.tree_screen.mvi.i(fVar, k.a(), m.a(), this.f117119g));
            this.f117121i = new e(interfaceC30106l7);
            this.f117122j = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f117121i);
        }

        @Override // com.avito.android.category_items_tree.screens.tree_screen.di.b
        public final void a(TreeActivity treeActivity) {
            treeActivity.f117010m = this.f117120h;
            treeActivity.f117012o = this.f117122j.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

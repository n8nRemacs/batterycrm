package com.avito.android.personal_banner.feature.factory;

import W60.b;
import b70.InterfaceC25423a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.InterfaceC31136m0;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.android.personal_banner.feature.factory.a;
import com.avito.android.personal_banner.feature.factory.b;
import com.avito.android.personal_banner.feature.mvi.q;
import com.avito.android.personal_banner.feature.mvi.v;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import d70.C39526b;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.AbstractC40048c;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;

/* compiled from: DaggerBannerFeatureComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class i {

    /* compiled from: DaggerBannerFeatureComponent.java */
    public static final class b implements com.avito.android.personal_banner.feature.factory.a {

        /* renamed from: a, reason: collision with root package name */
        public final W60.a f215600a;

        /* renamed from: b, reason: collision with root package name */
        public final b.a f215601b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.personal_banner.feature.domain.a f215602c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC42726C<? extends x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> f215603d;

        /* renamed from: e, reason: collision with root package name */
        public final ScreenPerformanceTracker f215604e;

        /* renamed from: f, reason: collision with root package name */
        public final InterfaceC31136m0 f215605f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC25423a> f215606g;

        /* renamed from: h, reason: collision with root package name */
        public final l f215607h;

        /* compiled from: DaggerBannerFeatureComponent.java */
        public static final class a implements u<InterfaceC25423a> {

            /* renamed from: a, reason: collision with root package name */
            public final b.a f215608a;

            public a(b.a aVar) {
                this.f215608a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25423a interfaceC25423aU6 = this.f215608a.U6();
                t.c(interfaceC25423aU6);
                return interfaceC25423aU6;
            }
        }

        public b() {
            throw null;
        }

        public b(b.a aVar, InterfaceC31136m0 interfaceC31136m0, W60.a aVar2, InterfaceC42726C interfaceC42726C, ScreenPerformanceTracker screenPerformanceTracker, com.avito.android.personal_banner.feature.domain.a aVar3, a aVar4) {
            this.f215600a = aVar2;
            this.f215601b = aVar;
            this.f215602c = aVar3;
            this.f215603d = interfaceC42726C;
            this.f215604e = screenPerformanceTracker;
            this.f215605f = interfaceC31136m0;
            this.f215606g = new a(aVar);
            this.f215607h = l.a(interfaceC31136m0);
        }

        @Override // com.avito.android.personal_banner.feature.factory.b
        public final b.a a() {
            d70.d dVar = new d70.d(this.f215600a);
            b.a aVar = this.f215601b;
            R0 r0C = aVar.c();
            t.c(r0C);
            h31.e eVarA = dagger.internal.g.a(this.f215606g);
            h31.e eVarA2 = dagger.internal.g.a(this.f215607h);
            R0 r0C2 = aVar.c();
            t.c(r0C2);
            com.avito.android.personal_banner.feature.mvi.a aVar2 = new com.avito.android.personal_banner.feature.mvi.a(r0C, new com.avito.android.personal_banner.feature.domain.d(r0C2, eVarA, eVarA2), this.f215602c);
            v vVar = new v();
            q qVar = new q();
            R0 r0C3 = aVar.c();
            t.c(r0C3);
            return new b.a(new com.avito.android.personal_banner.feature.mvi.t(this.f215600a, dVar, aVar2, vVar, qVar, r0C3));
        }

        @Override // com.avito.android.personal_banner.feature.factory.b
        public final C39526b b() {
            d70.d dVar = new d70.d(this.f215600a);
            com.avito.android.lib.beduin_v2.beduin_item.stateless.c cVarH4 = this.f215601b.h4();
            InterfaceC31136m0 interfaceC31136m0 = this.f215605f;
            aU0.b bVarB = interfaceC31136m0.b();
            t.c(bVarB);
            B bE2 = interfaceC31136m0.e();
            t.c(bE2);
            f.f215599a.getClass();
            return new C39526b(cVarH4.a(dVar.f393708a, this.f215603d, this.f215604e, bVarB, bE2));
        }
    }

    /* compiled from: DaggerBannerFeatureComponent.java */
    public static final class c implements a.InterfaceC6451a {
        public c() {
        }

        @Override // com.avito.android.personal_banner.feature.factory.b.InterfaceC6452b
        public final com.avito.android.personal_banner.feature.factory.b a(W60.a aVar, InterfaceC42726C interfaceC42726C, ScreenPerformanceTracker screenPerformanceTracker, com.avito.android.personal_banner.feature.domain.a aVar2, b.a aVar3, H h12) {
            screenPerformanceTracker.getClass();
            aVar2.getClass();
            h12.getClass();
            return new b(aVar3, h12, aVar, interfaceC42726C, screenPerformanceTracker, aVar2, null);
        }
    }
}

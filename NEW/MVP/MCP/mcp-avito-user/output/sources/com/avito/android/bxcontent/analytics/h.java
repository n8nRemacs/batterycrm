package com.avito.android.bxcontent.analytics;

import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import arrow.core.AbstractC23662a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.C28493o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import is0.InterfaceC42103e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BxContentTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/analytics/h;", "Lcom/avito/android/bxcontent/analytics/g;", "Lcom/avito/android/analytics/screens/tracker/ScreenPerformanceTracker;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements g, ScreenPerformanceTracker {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PresentationType f109488a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC42103e> f109489b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<xI.e> f109490c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<ZX.a> f109491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f109492e;

    /* compiled from: BxContentTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109493a;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.SERP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresentationType.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PresentationType.PUSH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PresentationType.FULL_MAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PresentationType.SIMPLE_MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PresentationType.REGULAR_MAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f109493a = iArr;
        }
    }

    @Inject
    public h(@Y61.k PresentationType presentationType, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k h31.e<n> eVar, @Y61.k h31.e<InterfaceC42103e> eVar2, @Y61.k h31.e<xI.e> eVar3, @Y61.k h31.e<ZX.a> eVar4) {
        this.f109488a = presentationType;
        this.f109489b = eVar2;
        this.f109490c = eVar3;
        this.f109491d = eVar4;
        this.f109492e = screenPerformanceTracker;
        switch (a.f109493a[presentationType.ordinal()]) {
            case 1:
                eVar2.get();
                break;
            case 2:
                eVar3.get();
                break;
            case 3:
                eVar.get();
                break;
            case 4:
                eVar4.get();
                break;
            case 5:
                eVar4.get();
                break;
            case 6:
                eVar4.get();
                break;
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void A(@Y61.k String str, boolean z12) {
        this.f109492e.A(str, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void B(@Y61.k com.avito.android.analytics.screens.image.c cVar, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f109492e.B(cVar, interfaceC22983P);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void D(@Y61.k String str, boolean z12) {
        this.f109492e.D(str, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void E(@Y61.k String str, @Y61.k ScreenPerformanceTracker.LoadingType loadingType, @Y61.k J j12, long j13) {
        this.f109492e.E(str, loadingType, j12, j13);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @Y61.l
    public final C34244a F(@Y61.k String str, @Y61.l AbstractC23662a<? extends Throwable, ? extends ApiError> abstractC23662a, boolean z12) {
        return this.f109492e.F(str, abstractC23662a, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void G(@Y61.l SerpResultCategoryDetails serpResultCategoryDetails) {
        this.f109492e.G(serpResultCategoryDetails);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @Y61.l
    public final Long H(@Y61.k String str) {
        return this.f109492e.H(str);
    }

    @Override // xI.e
    public final void L(@Y61.l String str) {
        if (a.f109493a[this.f109488a.ordinal()] == 2) {
            this.f109490c.get().L(str);
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @Y61.k
    /* renamed from: O */
    public final String getF90716d() {
        return this.f109492e.getF90716d();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void P(@Y61.k String str, @Y61.k J j12, @Y61.l Integer num) {
        this.f109492e.P(str, j12, num);
    }

    @Override // is0.InterfaceC42103e, xI.e, ZX.a
    public final void a(long j12) {
        int i12 = a.f109493a[this.f109488a.ordinal()];
        if (i12 == 1) {
            this.f109489b.get().a(j12);
            return;
        }
        if (i12 == 2) {
            this.f109490c.get().a(j12);
            return;
        }
        h31.e<ZX.a> eVar = this.f109491d;
        if (i12 == 4) {
            eVar.get().a(j12);
        } else if (i12 == 5) {
            eVar.get().a(j12);
        } else {
            if (i12 != 6) {
                return;
            }
            eVar.get().a(j12);
        }
    }

    @Override // is0.InterfaceC42103e, xI.e, com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void b(@Y61.k RecyclerView recyclerView) {
        int i12 = a.f109493a[this.f109488a.ordinal()];
        if (i12 == 1) {
            this.f109489b.get().b(recyclerView);
        } else {
            if (i12 != 2) {
                return;
            }
            this.f109490c.get().b(recyclerView);
        }
    }

    @Override // is0.InterfaceC42103e, xI.e, ZX.a
    public final void c(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k f.a aVar) {
        int i12 = a.f109493a[this.f109488a.ordinal()];
        if (i12 == 1) {
            this.f109489b.get().c(interfaceC22983P, aVar);
            return;
        }
        if (i12 == 2) {
            this.f109490c.get().c(interfaceC22983P, aVar);
            return;
        }
        h31.e<ZX.a> eVar = this.f109491d;
        if (i12 == 4) {
            eVar.get().c(interfaceC22983P, aVar);
        } else if (i12 == 5) {
            eVar.get().c(interfaceC22983P, aVar);
        } else {
            if (i12 != 6) {
                return;
            }
            eVar.get().c(interfaceC22983P, aVar);
        }
    }

    @Override // is0.InterfaceC42103e, xI.e, ZX.a
    public final void d() {
        int i12 = a.f109493a[this.f109488a.ordinal()];
        if (i12 == 1) {
            this.f109489b.get().d();
            return;
        }
        if (i12 == 2) {
            this.f109490c.get().d();
            return;
        }
        h31.e<ZX.a> eVar = this.f109491d;
        if (i12 == 4) {
            eVar.get().d();
        } else if (i12 == 5) {
            eVar.get().d();
        } else {
            if (i12 != 6) {
                return;
            }
            eVar.get().d();
        }
    }

    @Override // is0.InterfaceC42103e, xI.e, ZX.a
    public final void e() {
        int i12 = a.f109493a[this.f109488a.ordinal()];
        if (i12 == 1) {
            this.f109489b.get().e();
            return;
        }
        if (i12 == 2) {
            this.f109490c.get().e();
            return;
        }
        h31.e<ZX.a> eVar = this.f109491d;
        if (i12 == 4) {
            eVar.get().e();
        } else if (i12 == 5) {
            eVar.get().e();
        } else {
            if (i12 != 6) {
                return;
            }
            eVar.get().e();
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void f() {
        this.f109492e.f();
    }

    @Override // CN.o
    public final void g() {
        int i12 = a.f109493a[this.f109488a.ordinal()];
        if (i12 == 1) {
            this.f109489b.get().g();
            return;
        }
        if (i12 == 2) {
            this.f109490c.get().g();
            return;
        }
        h31.e<ZX.a> eVar = this.f109491d;
        if (i12 == 4) {
            eVar.get().g();
        } else if (i12 == 5) {
            eVar.get().g();
        } else {
            if (i12 != 6) {
                return;
            }
            eVar.get().g();
        }
    }

    @Override // CN.o
    public final void h() {
        int i12 = a.f109493a[this.f109488a.ordinal()];
        if (i12 == 1) {
            this.f109489b.get().h();
            return;
        }
        if (i12 == 2) {
            this.f109490c.get().h();
            return;
        }
        h31.e<ZX.a> eVar = this.f109491d;
        if (i12 == 4) {
            eVar.get().h();
        } else if (i12 == 5) {
            eVar.get().h();
        } else {
            if (i12 != 6) {
                return;
            }
            eVar.get().h();
        }
    }

    @Override // CN.o
    public final void i() {
        int i12 = a.f109493a[this.f109488a.ordinal()];
        if (i12 == 1) {
            this.f109489b.get().i();
            return;
        }
        if (i12 == 2) {
            this.f109490c.get().i();
            return;
        }
        h31.e<ZX.a> eVar = this.f109491d;
        if (i12 == 4) {
            eVar.get().i();
        } else if (i12 == 5) {
            eVar.get().i();
        } else {
            if (i12 != 6) {
                return;
            }
            eVar.get().i();
        }
    }

    @Override // CN.o
    public final void j(@Y61.k Throwable th2) {
        int i12 = a.f109493a[this.f109488a.ordinal()];
        if (i12 == 1) {
            this.f109489b.get().j(th2);
            return;
        }
        if (i12 == 2) {
            this.f109490c.get().j(th2);
            return;
        }
        h31.e<ZX.a> eVar = this.f109491d;
        if (i12 == 4) {
            eVar.get().j(th2);
        } else if (i12 == 5) {
            eVar.get().j(th2);
        } else {
            if (i12 != 6) {
                return;
            }
            eVar.get().j(th2);
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void l() {
        this.f109492e.l();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void m(@Y61.k String str) {
        this.f109492e.m(str);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @Y61.k
    public final C28493o o(@Y61.l AbstractC23662a.b bVar) {
        return this.f109492e.o(bVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void p(@Y61.k com.avito.android.analytics.screens.tracker.fps.h hVar) {
        this.f109492e.p(hVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void r(@Y61.k String str, @Y61.k ScreenPerformanceTracker.LoadingType loadingType, @Y61.k J j12, @Y61.l Integer num) {
        this.f109492e.r(str, loadingType, j12, num);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void s(@Y61.k String str, @Y61.k ScreenPerformanceTracker.LoadingType loadingType) {
        this.f109492e.s(str, loadingType);
    }

    @Override // xI.e
    public final void stop() {
        if (a.f109493a[this.f109488a.ordinal()] == 2) {
            this.f109490c.get().stop();
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void t(long j12) {
        this.f109492e.t(j12);
    }
}

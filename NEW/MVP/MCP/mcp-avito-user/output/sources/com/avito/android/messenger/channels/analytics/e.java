package com.avito.android.messenger.channels.analytics;

import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.ChannelsScreen;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.statsd.y;
import com.avito.android.memory.consumption.f;
import com.avito.android.messenger.channels.mvi.sync.z0;
import com.avito.android.messenger.channels.mvi.view.ChannelsListFragment;
import com.avito.android.util.V2;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/e;", "Lcom/avito/android/messenger/channels/analytics/d;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f187097a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f187098b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final z0 f187099c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final MessengerStatsdEventFactory f187100d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f187101e;

    /* renamed from: h, reason: collision with root package name */
    public int f187104h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Long f187105i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f187106j;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public a f187102f = a.f187109d;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public UseCaseScenario f187103g = UseCaseScenario.f187089n;

    /* renamed from: k, reason: collision with root package name */
    public boolean f187107k = true;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.analytics.a f187108l = new com.avito.android.messenger.channels.analytics.a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/e$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final a f187109d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f187110e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f187111f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f187112g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f187113h;

        /* renamed from: i, reason: collision with root package name */
        public static final a f187114i;

        /* renamed from: j, reason: collision with root package name */
        public static final a f187115j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ a[] f187116k;

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f187117l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f187118b;

        /* renamed from: c, reason: collision with root package name */
        public final int f187119c;

        static {
            a aVar = new a("INIT", 0, "init", 0);
            f187109d = aVar;
            a aVar2 = new a("LOAD_STARTED", 1, "load_channels", 1);
            f187110e = aVar2;
            a aVar3 = new a("LOAD_COMPLETED", 2, "load_channels", 2);
            f187111f = aVar3;
            a aVar4 = new a("PREPARE_STARTED", 3, "prepare_channels", 3);
            f187112g = aVar4;
            a aVar5 = new a("PREPARE_COMPLETED", 4, "prepare_channels", 4);
            f187113h = aVar5;
            a aVar6 = new a("DRAW_STARTED", 5, "draw_channels", 5);
            f187114i = aVar6;
            a aVar7 = new a("DRAW_COMPLETED", 6, "draw_channels", 6);
            f187115j = aVar7;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
            f187116k = aVarArr;
            f187117l = kotlin.enums.c.a(aVarArr);
        }

        public a(String str, int i12, String str2, int i13) {
            this.f187118b = str2;
            this.f187119c = i13;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f187116k.clone();
        }
    }

    @Inject
    public e(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k b bVar, @Y61.k z0 z0Var, @Y61.k MessengerStatsdEventFactory messengerStatsdEventFactory, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f187097a = screenPerformanceTracker;
        this.f187098b = bVar;
        this.f187099c = z0Var;
        this.f187100d = messengerStatsdEventFactory;
        this.f187101e = interfaceC28373a;
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void a(long j12) {
        this.f187097a.a(j12);
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void b(@Y61.k RecyclerView recyclerView) {
        this.f187097a.b(recyclerView);
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void c() {
        a aVar = this.f187102f;
        int i12 = aVar.f187119c;
        a aVar2 = a.f187109d;
        if (i12 > 0 && i12 < 6) {
            this.f187107k = false;
            this.f187098b.b(aVar.f187118b, this.f187103g.f187092b);
        }
        this.f187102f = aVar2;
        this.f187103g = UseCaseScenario.f187089n;
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void d() {
        this.f187097a.d();
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void e() {
        this.f187097a.e();
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void f(int i12) {
        c();
        this.f187103g = UseCaseScenario.f187078c;
        if (i12 > 0) {
            i = (i12 % 10 > 0 ? 1 : 0) + (i12 / 10);
        }
        this.f187104h = i;
        this.f187105i = Long.valueOf(System.currentTimeMillis());
        V2 v22 = V2.f318762a;
        StringBuilder sbJ = G.j(i12, "startLoadMoreSession(curItemCount = ", ") => pageNo = ");
        sbJ.append(this.f187104h);
        v22.i("ChannelsTracker", sbJ.toString(), null);
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void g() {
        if (this.f187102f == a.f187112g) {
            ChannelsScreen.f90321d.getClass();
            ScreenPerformanceTracker.a.d(this.f187097a, ChannelsScreen.f90322e, ScreenPerformanceTracker.LoadingType.f90786c, null, Integer.valueOf(this.f187104h), 4);
            this.f187102f = a.f187113h;
            this.f187098b.d("prepare_channels", this.f187103g.f187092b);
        }
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void h(int i12, @Y61.k UseCaseScenario useCaseScenario) {
        c();
        this.f187103g = useCaseScenario;
        if (i12 > 0) {
            i = ((i12 / 10) + (i12 % 10 > 0 ? 1 : 0)) - 1;
        }
        this.f187104h = i;
        V2.f318762a.i("ChannelsTracker", "startReloadSession(scenario = " + useCaseScenario + ", curItemCount = " + i12 + ") => pageNo = " + this.f187104h, null);
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void i() {
        if (this.f187102f == a.f187113h) {
            boolean z12 = this.f187106j;
            ScreenPerformanceTracker screenPerformanceTracker = this.f187097a;
            if (z12) {
                ChannelsScreen.f90321d.getClass();
                screenPerformanceTracker.m(ChannelsScreen.f90323f);
            }
            ChannelsScreen.f90321d.getClass();
            screenPerformanceTracker.m(ChannelsScreen.f90322e);
            this.f187102f = a.f187114i;
            this.f187098b.e("draw_channels", this.f187103g.f187092b);
        }
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void j(@Y61.k n nVar) {
        if (this.f187102f == a.f187114i) {
            ChannelsScreen.f90321d.getClass();
            String str = ChannelsScreen.f90322e;
            int i12 = this.f187104h;
            this.f187097a.P(str, new J.a(nVar.f187140b), Integer.valueOf(i12));
            this.f187102f = a.f187115j;
            this.f187098b.a(this.f187103g.f187092b, nVar);
        }
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void k() {
        if (this.f187102f == a.f187110e) {
            ChannelsScreen.f90321d.getClass();
            String str = ChannelsScreen.f90322e;
            int i12 = this.f187104h;
            ScreenPerformanceTracker.a.d(this.f187097a, str, null, J.b.f90385a, Integer.valueOf(i12), 2);
            this.f187102f = a.f187111f;
            this.f187098b.d("load_channels", this.f187103g.f187092b);
        }
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void l() {
        if (this.f187102f == a.f187109d) {
            ChannelsScreen.f90321d.getClass();
            ScreenPerformanceTracker.a.b(this.f187097a, ChannelsScreen.f90322e, 2);
            this.f187102f = a.f187110e;
            this.f187098b.e("load_channels", this.f187103g.f187092b);
        }
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void m() {
        if (this.f187102f == a.f187114i) {
            if (this.f187103g == UseCaseScenario.f187078c) {
                Long l12 = this.f187105i;
                if (l12 != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - l12.longValue();
                    MessengerStatsdEventFactory messengerStatsdEventFactory = this.f187100d;
                    messengerStatsdEventFactory.getClass();
                    this.f187101e.c(new y.c(messengerStatsdEventFactory.e((String[]) Arrays.copyOf(new String[]{"pagination-delay", "chats", "dc", "app_version_placeholder"}, 4), false), Long.valueOf(jCurrentTimeMillis), null));
                }
                this.f187105i = null;
            }
            boolean z12 = this.f187107k;
            ScreenPerformanceTracker screenPerformanceTracker = this.f187097a;
            if (z12) {
                this.f187107k = false;
                ChannelsScreen.f90321d.getClass();
                this.f187099c.e(screenPerformanceTracker.H(ChannelsScreen.f90322e));
            }
            ChannelsScreen.f90321d.getClass();
            String str = ChannelsScreen.f90322e;
            int i12 = this.f187104h;
            J.b bVar = J.b.f90385a;
            screenPerformanceTracker.P(str, bVar, Integer.valueOf(i12));
            if (this.f187106j) {
                screenPerformanceTracker.P(ChannelsScreen.f90323f, bVar, Integer.valueOf(this.f187104h));
            }
            this.f187102f = a.f187115j;
            this.f187098b.d("draw_channels", this.f187103g.f187092b);
        }
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void n(@Y61.k Throwable th2) {
        if (this.f187102f == a.f187110e) {
            ChannelsScreen.f90321d.getClass();
            String str = ChannelsScreen.f90322e;
            int i12 = this.f187104h;
            ScreenPerformanceTracker.a.d(this.f187097a, str, null, new J.a(th2), Integer.valueOf(i12), 2);
            this.f187102f = a.f187111f;
            this.f187098b.c("load_channels", this.f187103g.f187092b, th2);
        }
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void o(@Y61.k f.a aVar, @Y61.k ChannelsListFragment channelsListFragment) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f187097a;
        screenPerformanceTracker.c(channelsListFragment, aVar);
        screenPerformanceTracker.B(this.f187108l, channelsListFragment);
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void p(@Y61.k Throwable th2) {
        if (this.f187102f == a.f187112g) {
            ChannelsScreen.f90321d.getClass();
            String str = ChannelsScreen.f90322e;
            ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90786c;
            int i12 = this.f187104h;
            J.a.f90383b.getClass();
            this.f187097a.r(str, loadingType, J.a.C2676a.d(), Integer.valueOf(i12));
            this.f187102f = a.f187113h;
            this.f187098b.c("prepare_channels", this.f187103g.f187092b, th2);
        }
    }

    @Override // com.avito.android.messenger.channels.analytics.d
    public final void q(boolean z12) {
        if (this.f187102f == a.f187111f) {
            ChannelsScreen.f90321d.getClass();
            this.f187097a.s(ChannelsScreen.f90322e, ScreenPerformanceTracker.LoadingType.f90786c);
            this.f187106j = z12;
            this.f187102f = a.f187112g;
            this.f187098b.e("prepare_channels", this.f187103g.f187092b);
        }
    }
}

package com.avito.android.messenger.conversation.analytics;

import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.ChannelScreen;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker;
import com.avito.android.messenger.channels.mvi.sync.z0;
import com.avito.android.messenger.conversation.ChannelActivityArguments;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.W1;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/analytics/c;", "Lcom/avito/android/messenger/conversation/analytics/b;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f189314a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final z0 f189315b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MessengerSuccessRateTracker f189316c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final W1 f189317d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.messenger.conversation.analytics.a f189318e = new com.avito.android.messenger.conversation.analytics.a();

    /* renamed from: f, reason: collision with root package name */
    @k
    public volatile a f189319f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public volatile a f189320g;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f189321h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f189322i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/analytics/c$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f189323b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f189324c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f189325d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f189326e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f189327f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f189328g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f189329h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ a[] f189330i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f189331j;

        static {
            a aVar = new a("INIT", 0);
            f189323b = aVar;
            a aVar2 = new a("LOAD_STARTED", 1);
            f189324c = aVar2;
            a aVar3 = new a("LOAD_COMPLETED", 2);
            f189325d = aVar3;
            a aVar4 = new a("PREPARE_STARTED", 3);
            f189326e = aVar4;
            a aVar5 = new a("PREPARE_COMPLETED", 4);
            f189327f = aVar5;
            a aVar6 = new a("DRAW_STARTED", 5);
            f189328g = aVar6;
            a aVar7 = new a("DRAW_COMPLETED", 6);
            f189329h = aVar7;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
            f189330i = aVarArr;
            f189331j = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f189330i.clone();
        }
    }

    @Inject
    public c(@k ScreenPerformanceTracker screenPerformanceTracker, @k z0 z0Var, @k MessengerSuccessRateTracker messengerSuccessRateTracker, @k W1 w12) {
        this.f189314a = screenPerformanceTracker;
        this.f189315b = z0Var;
        this.f189316c = messengerSuccessRateTracker;
        this.f189317d = w12;
        a aVar = a.f189323b;
        this.f189319f = aVar;
        this.f189320g = aVar;
        this.f189322i = true;
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void a(long j12) {
        this.f189314a.a(j12);
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void b(@l Long l12, @k MessengerStatsdEventFactory.Companion.ChannelType channelType) {
        this.f189315b.b(l12, channelType);
        this.f189316c.b(channelType);
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void c() {
        a aVar = a.f189323b;
        this.f189320g = aVar;
        this.f189319f = aVar;
        this.f189322i = false;
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void d() {
        this.f189314a.d();
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void e() {
        this.f189314a.e();
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void f(int i12) {
        c();
        if (i12 > 0) {
            i = (i12 == 101 ? -1 : 0) + (i12 / 100) + (i12 % 100 > 0 ? 1 : 0);
        }
        this.f189321h = i;
        V2 v22 = V2.f318762a;
        StringBuilder sbJ = G.j(i12, "startLoadMoreSession(curItemCount = ", ") => pageNo = ");
        sbJ.append(this.f189321h);
        v22.i("ChannelTracker", sbJ.toString(), null);
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void g(@l Throwable th2) {
        if (this.f189319f == a.f189324c) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            String str = ChannelScreen.f90320f;
            int i12 = this.f189321h;
            J.a.f90383b.getClass();
            ScreenPerformanceTracker.a.d(screenPerformanceTracker, str, null, J.a.C2676a.c(th2), Integer.valueOf(i12), 2);
            this.f189319f = a.f189325d;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void h() {
        if (this.f189320g == a.f189325d) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            screenPerformanceTracker.s(ChannelScreen.f90319e, ScreenPerformanceTracker.LoadingType.f90786c);
            this.f189320g = a.f189326e;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void i() {
        ChannelActivityArguments.PerformanceParams performanceParams;
        if (this.f189319f == a.f189328g) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            String str = ChannelScreen.f90320f;
            int i12 = this.f189321h;
            J.a.f90383b.getClass();
            screenPerformanceTracker.P(str, J.a.C2676a.d(), Integer.valueOf(i12));
            MessengerSuccessRateTracker messengerSuccessRateTracker = this.f189316c;
            W1 w12 = this.f189317d;
            MessengerStatsdEventFactory.Companion.ChannelType channelType = (w12 == null || (performanceParams = w12.f189245h) == null) ? null : performanceParams.f188907c;
            MessengerSuccessRateTracker.Result result = MessengerSuccessRateTracker.Result.f188366c;
            messengerSuccessRateTracker.d(channelType);
            this.f189319f = a.f189329h;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void j() {
        if (this.f189319f == a.f189323b) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            ScreenPerformanceTracker.a.b(screenPerformanceTracker, ChannelScreen.f90320f, 2);
            this.f189319f = a.f189324c;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void k(@k Throwable th2) {
        if (this.f189320g == a.f189324c) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            String str = ChannelScreen.f90319e;
            int i12 = this.f189321h;
            J.a.f90383b.getClass();
            ScreenPerformanceTracker.a.d(screenPerformanceTracker, str, null, J.a.C2676a.c(th2), Integer.valueOf(i12), 2);
            this.f189320g = a.f189325d;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void l() {
        if (this.f189319f == a.f189324c) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            ScreenPerformanceTracker.a.d(screenPerformanceTracker, ChannelScreen.f90320f, null, null, Integer.valueOf(this.f189321h), 6);
            this.f189319f = a.f189325d;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void m() {
        if (this.f189319f == a.f189325d) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            screenPerformanceTracker.m(ChannelScreen.f90320f);
            this.f189319f = a.f189328g;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void n() {
        if (this.f189320g == a.f189328g) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            ScreenPerformanceTracker.a.c(screenPerformanceTracker, ChannelScreen.f90319e, null, Integer.valueOf(this.f189321h), 2);
            this.f189320g = a.f189329h;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void o() {
        ChannelActivityArguments.PerformanceParams performanceParams;
        ChannelActivityArguments.PerformanceParams performanceParams2;
        ChannelActivityArguments.PerformanceParams performanceParams3;
        if (this.f189319f == a.f189328g) {
            if (this.f189322i) {
                this.f189322i = false;
                ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
                ChannelScreen.f90318d.getClass();
                this.f189315b.g(screenPerformanceTracker.H(ChannelScreen.f90320f));
                z0 z0Var = this.f189315b;
                W1 w12 = this.f189317d;
                z0Var.h((w12 == null || (performanceParams3 = w12.f189245h) == null) ? null : performanceParams3.f188906b, (w12 == null || (performanceParams2 = w12.f189245h) == null) ? null : performanceParams2.f188907c);
                MessengerSuccessRateTracker messengerSuccessRateTracker = this.f189316c;
                W1 w13 = this.f189317d;
                messengerSuccessRateTracker.a((w13 == null || (performanceParams = w13.f189245h) == null) ? null : performanceParams.f188907c);
            }
            ScreenPerformanceTracker screenPerformanceTracker2 = this.f189314a;
            ChannelScreen.f90318d.getClass();
            ScreenPerformanceTracker.a.c(screenPerformanceTracker2, ChannelScreen.f90320f, null, Integer.valueOf(this.f189321h), 2);
            this.f189319f = a.f189329h;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void p(@k com.avito.android.analytics.screens.tracker.fps.h hVar) {
        this.f189314a.p(hVar);
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void q() {
        if (this.f189320g == a.f189326e) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            ScreenPerformanceTracker.a.d(screenPerformanceTracker, ChannelScreen.f90319e, ScreenPerformanceTracker.LoadingType.f90786c, null, Integer.valueOf(this.f189321h), 4);
            this.f189320g = a.f189327f;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void r() {
        if (this.f189320g == a.f189323b) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            ScreenPerformanceTracker.a.b(screenPerformanceTracker, ChannelScreen.f90319e, 2);
            this.f189320g = a.f189324c;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void s() {
        c();
        this.f189321h = 0;
        V2.f318762a.i("ChannelTracker", "startReloadSession(curItemCount = 0) => pageNo = " + this.f189321h, null);
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void t() {
        if (this.f189320g == a.f189327f) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            screenPerformanceTracker.m(ChannelScreen.f90319e);
            this.f189320g = a.f189328g;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void u() {
        if (this.f189320g == a.f189326e) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            String str = ChannelScreen.f90319e;
            ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90786c;
            int i12 = this.f189321h;
            J.a.f90383b.getClass();
            screenPerformanceTracker.r(str, loadingType, J.a.C2676a.d(), Integer.valueOf(i12));
            this.f189320g = a.f189327f;
        }
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void v(@k f.a aVar, @k ChannelFragment channelFragment) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
        screenPerformanceTracker.c(channelFragment, aVar);
        screenPerformanceTracker.B(this.f189318e, channelFragment);
    }

    @Override // com.avito.android.messenger.conversation.analytics.b
    public final void w() {
        if (this.f189320g == a.f189324c) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f189314a;
            ChannelScreen.f90318d.getClass();
            ScreenPerformanceTracker.a.d(screenPerformanceTracker, ChannelScreen.f90319e, null, null, Integer.valueOf(this.f189321h), 6);
            this.f189320g = a.f189325d;
        }
    }
}

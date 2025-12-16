package com.avito.android.player.analytics;

import C80.c;
import C80.d;
import C80.f;
import C80.h;
import C80.i;
import C80.j;
import Y61.k;
import Y61.l;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.player.analytics.PlayerAnalyticsInteractor;
import com.avito.android.player.router.PlayerArguments;
import com.avito.android.rec.ScreenSource;
import javax.inject.Inject;
import kotlin.Metadata;
import mc.C44048a;
import mc.C44050c;
import mc.e;
import mc.g;

/* compiled from: PlayerAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/analytics/a;", "Lcom/avito/android/player/analytics/PlayerAnalyticsInteractor;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements PlayerAnalyticsInteractor {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PlayerArguments f220042a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f220043b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final E f220044c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PlayerAnalyticsInteractor.State f220045d;

    @Inject
    public a(@k PlayerArguments playerArguments, @k InterfaceC28373a interfaceC28373a, @k E e12, @l PlayerAnalyticsInteractor.State state) {
        this.f220042a = playerArguments;
        this.f220043b = interfaceC28373a;
        this.f220044c = e12;
        this.f220045d = state == null ? new PlayerAnalyticsInteractor.State(false, false, false, false, false, 31, null) : state;
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    @k
    /* renamed from: H, reason: from getter */
    public final PlayerAnalyticsInteractor.State getF220045d() {
        return this.f220045d;
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    public final void a() {
        String str;
        String str2;
        PlayerArguments playerArguments = this.f220042a;
        String str3 = playerArguments.f220215b;
        PlayerAnalyticsParameters playerAnalyticsParameters = playerArguments.f220222i;
        if (playerAnalyticsParameters == null || (str = playerAnalyticsParameters.f220028b) == null) {
            str = "";
        }
        this.f220043b.c(new e(str3, str, (playerAnalyticsParameters == null || (str2 = playerAnalyticsParameters.f220029c) == null) ? "" : str2, null, null, null, null, 96, null));
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    public final void b(@l Double d12, @l Double d13, @k VideoStopReason videoStopReason) {
        String str;
        String str2;
        if (d13 == null) {
            return;
        }
        PlayerArguments playerArguments = this.f220042a;
        String str3 = playerArguments.f220215b;
        String strA = this.f220044c.a();
        PlayerAnalyticsParameters playerAnalyticsParameters = playerArguments.f220222i;
        i iVar = new i(str3, playerArguments.f220220g, playerArguments.f220217d, playerArguments.f220216c, playerArguments.f220218e, strA, 4777, 9, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220030d : null, null, null, 3072, null);
        InterfaceC28373a interfaceC28373a = this.f220043b;
        interfaceC28373a.c(iVar);
        if (playerAnalyticsParameters == null || (str = playerAnalyticsParameters.f220028b) == null) {
            str = "";
        }
        interfaceC28373a.c(new g(playerArguments.f220215b, str, (playerAnalyticsParameters == null || (str2 = playerAnalyticsParameters.f220029c) == null) ? "" : str2, d13, d12, null, null, videoStopReason, null, 256, null));
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    public final void c() {
        String str;
        String str2;
        PlayerArguments playerArguments = this.f220042a;
        String str3 = playerArguments.f220215b;
        PlayerAnalyticsParameters playerAnalyticsParameters = playerArguments.f220222i;
        if (playerAnalyticsParameters == null || (str = playerAnalyticsParameters.f220028b) == null) {
            str = "";
        }
        this.f220043b.c(new C44048a(str3, str, (playerAnalyticsParameters == null || (str2 = playerAnalyticsParameters.f220029c) == null) ? "" : str2, null, null));
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    public final void d() {
        PlayerArguments playerArguments = this.f220042a;
        String str = playerArguments.f220215b;
        ScreenSource screenSource = playerArguments.f220220g;
        String str2 = playerArguments.f220217d;
        String str3 = playerArguments.f220216c;
        String str4 = playerArguments.f220218e;
        String strA = this.f220044c.a();
        PlayerAnalyticsParameters playerAnalyticsParameters = playerArguments.f220222i;
        this.f220043b.c(new j(str, screenSource, str2, str3, str4, strA, 4778, 8, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220030d : null, null, null, 3072, null));
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    public final void e(@l Double d12, @l Double d13) {
        String str;
        String str2;
        if (d13 == null) {
            return;
        }
        PlayerArguments playerArguments = this.f220042a;
        String str3 = playerArguments.f220215b;
        PlayerAnalyticsParameters playerAnalyticsParameters = playerArguments.f220222i;
        if (playerAnalyticsParameters == null || (str = playerAnalyticsParameters.f220028b) == null) {
            str = "";
        }
        this.f220043b.c(new g(str3, str, (playerAnalyticsParameters == null || (str2 = playerAnalyticsParameters.f220029c) == null) ? "" : str2, d13, d12, null, null, VideoStopReason.f90111b, null, 256, null));
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    public final void f() {
        PlayerArguments playerArguments = this.f220042a;
        String str = playerArguments.f220215b;
        ScreenSource screenSource = playerArguments.f220220g;
        String str2 = playerArguments.f220217d;
        String str3 = playerArguments.f220216c;
        String str4 = playerArguments.f220218e;
        String strA = this.f220044c.a();
        PlayerAnalyticsParameters playerAnalyticsParameters = playerArguments.f220222i;
        this.f220043b.c(new c(str, screenSource, str2, str3, str4, strA, 4828, 4, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220030d : null, null, null, 3072, null));
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    public final void g(boolean z12) {
        String str;
        String str2;
        PlayerAnalyticsParameters playerAnalyticsParameters = this.f220042a.f220222i;
        if (playerAnalyticsParameters == null || (str = playerAnalyticsParameters.f220028b) == null) {
            str = "";
        }
        this.f220043b.c(new C44050c(str, null, (playerAnalyticsParameters == null || (str2 = playerAnalyticsParameters.f220029c) == null) ? "" : str2, null, Boolean.valueOf(z12)));
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    public final void h(float f12) {
        InterfaceC28373a interfaceC28373a = this.f220043b;
        E e12 = this.f220044c;
        PlayerArguments playerArguments = this.f220042a;
        PlayerAnalyticsInteractor.State state = this.f220045d;
        if (f12 >= 0.25f && !state.f220038c) {
            state.f220038c = true;
            String str = playerArguments.f220215b;
            String strA = e12.a();
            PlayerAnalyticsParameters playerAnalyticsParameters = playerArguments.f220222i;
            interfaceC28373a.c(new C80.e(str, playerArguments.f220220g, playerArguments.f220217d, playerArguments.f220216c, playerArguments.f220218e, strA, 4784, 8, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220030d : null, null, null, 3072, null));
        }
        if (f12 >= 0.5f && !state.f220039d) {
            state.f220039d = true;
            String str2 = playerArguments.f220215b;
            String strA2 = e12.a();
            PlayerAnalyticsParameters playerAnalyticsParameters2 = playerArguments.f220222i;
            interfaceC28373a.c(new f(str2, playerArguments.f220220g, playerArguments.f220217d, playerArguments.f220216c, playerArguments.f220218e, strA2, 4785, 8, playerAnalyticsParameters2 != null ? playerAnalyticsParameters2.f220028b : null, playerAnalyticsParameters2 != null ? playerAnalyticsParameters2.f220030d : null, null, null, 3072, null));
        }
        if (f12 < 0.75f || state.f220040e) {
            return;
        }
        state.f220040e = true;
        String str3 = playerArguments.f220215b;
        String strA3 = e12.a();
        PlayerAnalyticsParameters playerAnalyticsParameters3 = playerArguments.f220222i;
        interfaceC28373a.c(new h(str3, playerArguments.f220220g, playerArguments.f220217d, playerArguments.f220216c, playerArguments.f220218e, strA3, 4786, 9, playerAnalyticsParameters3 != null ? playerAnalyticsParameters3.f220028b : null, playerAnalyticsParameters3 != null ? playerAnalyticsParameters3.f220030d : null, null, null, 3072, null));
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    public final void i() {
        PlayerAnalyticsInteractor.State state = this.f220045d;
        if (state.f220037b) {
            return;
        }
        state.f220037b = true;
        PlayerArguments playerArguments = this.f220042a;
        String str = playerArguments.f220215b;
        ScreenSource screenSource = playerArguments.f220220g;
        String str2 = playerArguments.f220217d;
        String str3 = playerArguments.f220216c;
        String str4 = playerArguments.f220218e;
        String strA = this.f220044c.a();
        PlayerAnalyticsParameters playerAnalyticsParameters = playerArguments.f220222i;
        this.f220043b.c(new C80.g(str, screenSource, str2, str3, str4, strA, 4774, 8, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220030d : null, null, null, 3072, null));
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    public final void j() {
        PlayerArguments playerArguments = this.f220042a;
        String str = playerArguments.f220215b;
        ScreenSource screenSource = playerArguments.f220220g;
        String str2 = playerArguments.f220217d;
        String str3 = playerArguments.f220216c;
        String str4 = playerArguments.f220218e;
        String strA = this.f220044c.a();
        PlayerAnalyticsParameters playerAnalyticsParameters = playerArguments.f220222i;
        this.f220043b.c(new C80.k(str, screenSource, str2, str3, str4, strA, 4827, 4, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220030d : null, null, null, 3072, null));
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    public final void k(@l Double d12, @l Double d13) {
        String str;
        String str2;
        if (d12 == null || d13 == null) {
            return;
        }
        PlayerArguments playerArguments = this.f220042a;
        String str3 = playerArguments.f220215b;
        ScreenSource screenSource = playerArguments.f220220g;
        String str4 = playerArguments.f220217d;
        String str5 = playerArguments.f220216c;
        String str6 = playerArguments.f220218e;
        String strA = this.f220044c.a();
        PlayerAnalyticsParameters playerAnalyticsParameters = playerArguments.f220222i;
        C80.a aVar = new C80.a(str3, screenSource, str4, str5, str6, strA, 4814, 5, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220030d : null, Integer.valueOf((int) d12.doubleValue()), Integer.valueOf((int) d13.doubleValue()));
        InterfaceC28373a interfaceC28373a = this.f220043b;
        interfaceC28373a.c(aVar);
        String str7 = playerArguments.f220215b;
        PlayerAnalyticsParameters playerAnalyticsParameters2 = playerArguments.f220222i;
        if (playerAnalyticsParameters2 == null || (str = playerAnalyticsParameters2.f220028b) == null) {
            str = "";
        }
        interfaceC28373a.c(new g(str7, str, (playerAnalyticsParameters2 == null || (str2 = playerAnalyticsParameters2.f220029c) == null) ? "" : str2, d13, d12, null, null, VideoStopReason.f90112c, null, 256, null));
    }

    @Override // com.avito.android.player.analytics.PlayerAnalyticsInteractor
    public final void l() {
        PlayerAnalyticsInteractor.State state = this.f220045d;
        if (state.f220041f) {
            return;
        }
        state.f220041f = true;
        PlayerArguments playerArguments = this.f220042a;
        String str = playerArguments.f220215b;
        ScreenSource screenSource = playerArguments.f220220g;
        String str2 = playerArguments.f220217d;
        String str3 = playerArguments.f220216c;
        String str4 = playerArguments.f220218e;
        String strA = this.f220044c.a();
        PlayerAnalyticsParameters playerAnalyticsParameters = playerArguments.f220222i;
        this.f220043b.c(new d(str, screenSource, str2, str3, str4, strA, 4787, 8, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220030d : null, null, null, 3072, null));
    }
}

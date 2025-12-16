package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class pe8 extends w4e {
    public static final /* synthetic */ yy7[] U0 = {new z8a(pe8.class, "phoneCode", "getPhoneCode()Ljava/lang/String;"), u45.h(vid.a, pe8.class, "phoneNumber", "getPhoneNumber()Ljava/lang/String;"), new z8a(pe8.class, "locationCountryCode", "getLocationCountryCode()Ljava/lang/String;"), new z8a(pe8.class, "serverHost", "getServerHost()Ljava/lang/String;"), new z8a(pe8.class, "serverPort", "getServerPort()Ljava/lang/String;"), new z8a(pe8.class, "useTls", "getUseTls()Z"), new z8a(pe8.class, "loginFailError", "getLoginFailError()Ljava/lang/String;"), new z8a(pe8.class, "isDraftsChanged", "isDraftsChanged()Z"), new z8a(pe8.class, "isDevOptionsRoaming", "isDevOptionsRoaming()Z"), new z8a(pe8.class, "dontShowAddUserToCallChatConfirmation", "getDontShowAddUserToCallChatConfirmation()Z"), new z8a(pe8.class, "tenorAnonId", "getTenorAnonId()Ljava/lang/String;"), new z8a(pe8.class, "videoPlayQuality", "getVideoPlayQuality()I"), new z8a(pe8.class, "lastPushAlertTime", "getLastPushAlertTime()J"), new z8a(pe8.class, "isFullContactsSyncCompleted", "isFullContactsSyncCompleted()Z"), new z8a(pe8.class, "isOkPushDisabled", "isOkPushDisabled()Z"), new z8a(pe8.class, "isDisableWebAppSsl", "isDisableWebAppSsl()Z"), new z8a(pe8.class, "isDisableInAppReviewTimeCondition", "isDisableInAppReviewTimeCondition()Z"), new z8a(pe8.class, "isEnableInAppReviewNotFromMarketBuild", "isEnableInAppReviewNotFromMarketBuild()Z"), new z8a(pe8.class, "isDebugProfileInfoEnabled", "isDebugProfileInfoEnabled()Z"), new z8a(pe8.class, "statSessionId", "getStatSessionId()J"), new z8a(pe8.class, "versionForceUpdateReceived", "getVersionForceUpdateReceived()Ljava/lang/String;"), new z8a(pe8.class, "isDebugFresco", "isDebugFresco()Z"), new z8a(pe8.class, "isWebAppFullscreen", "isWebAppFullscreen()Z"), new z8a(pe8.class, "isOnboardedAuthorVisibilityOnForward", "isOnboardedAuthorVisibilityOnForward()Z"), new z8a(pe8.class, "isAudioOnboardingEnded", "isAudioOnboardingEnded()Z"), new z8a(pe8.class, "isCallsDebugMenuEnabled", "isCallsDebugMenuEnabled()Z"), new z8a(pe8.class, "isProfileMigrationComplete", "isProfileMigrationComplete()Z"), new z8a(pe8.class, "lastPermissionRequestTime", "getLastPermissionRequestTime()J"), new z8a(pe8.class, "informerBannersShowDuration", "getInformerBannersShowDuration-UwyO8pc()J"), new z8a(pe8.class, "informerBannersSync", "getInformerBannersSync()J"), new z8a(pe8.class, "foldersSync", "getFoldersSync()J"), new z8a(pe8.class, "complainReasonsSync", "getComplainReasonsSync()J"), new z8a(pe8.class, "isVideoDebugViewAvailable", "isVideoDebugViewAvailable()Z"), new toc(pe8.class, "allowLogSensitiveData", "getAllowLogSensitiveData()Lkotlinx/coroutines/flow/MutableStateFlow;", 0), new z8a(pe8.class, "lastTimeUpdateDialogShowing", "getLastTimeUpdateDialogShowing()J")};
    public final fde A0;
    public final fde B0;
    public final fde C0;
    public final fde D0;
    public final fde E0;
    public final fde F0;
    public final fde G0;
    public final fde H0;
    public final fde I0;
    public final fde J0;
    public final fde K0;
    public final fde L0;
    public final fde M0;
    public final fde N0;
    public final fde O0;
    public final fde P0;
    public final fde Q0;
    public final fde R0;
    public final fde S0;
    public final b4 T0;
    public final fde n0;
    public final fde o0;
    public final fde p0;
    public final fde q0;
    public final fde r0;
    public final fde s0;
    public final fde t0;
    public final fde u0;
    public final fde v0;
    public final fde w0;
    public final fde x0;
    public final fde y0;
    public final fde z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe8(uv4 uv4Var, bx5 bx5Var, Context context) {
        super(uv4Var, bx5Var, context);
        long j = 0L;
        Object obj = null;
        this.n0 = new fde("user.Phone.Code", obj, this.g, vid.a(String.class));
        this.o0 = new fde("user.Phone", obj, this.g, vid.a(String.class));
        this.p0 = new fde("app.location.country.code", obj, this.g, vid.a(String.class));
        this.q0 = new fde("server.host", obj, this.g, vid.a(String.class));
        this.r0 = new fde("server.port", obj, this.g, vid.a(String.class));
        this.s0 = new fde("server.useTls", Boolean.TRUE, this.g, vid.a(Boolean.class));
        this.t0 = new fde("server.loginError", obj, this.g, vid.a(String.class));
        Boolean bool = Boolean.FALSE;
        this.u0 = new fde("app.draftsChanged", bool, this.g, vid.a(Boolean.class));
        new fde("user.dev.options.roaming", bool, this.g, vid.a(Boolean.class));
        this.v0 = new fde("app.call.add.dontshowconfirmation", bool, this.g, vid.a(Boolean.class));
        this.w0 = new fde("app.tenor.anon.id", "", this.g, vid.a(String.class));
        this.x0 = new fde("app.video.play.quality", -1, this.g, vid.a(Integer.class));
        this.y0 = new fde("app.last.push.alert.time", j, this.g, vid.a(Long.class));
        this.z0 = new fde("app.full.contacts.sync.completed", bool, this.g, vid.a(Boolean.class));
        this.A0 = new fde("ok_push_disabled", bool, this.g, vid.a(Boolean.class));
        this.B0 = new fde("web_app:ssl_check", bool, this.g, vid.a(Boolean.class));
        this.C0 = new fde("app.disable_in_app_review_time_condition", bool, this.g, vid.a(Boolean.class));
        this.D0 = new fde("app.enable_in_app_review_not_from_market_build", bool, this.g, vid.a(Boolean.class));
        this.E0 = new fde("app.debug.profile.info.enabled", bool, this.g, vid.a(Boolean.class));
        this.F0 = new fde("app.stats.session.id", j, this.g, vid.a(Long.class));
        this.G0 = new fde("version.force.update.received", obj, this.g, vid.a(String.class));
        this.H0 = new fde("app.debug.fresco", bool, this.g, vid.a(Boolean.class));
        this.I0 = new fde("app.toggle.webapp_fullscreen", bool, this.g, vid.a(Boolean.class));
        this.J0 = new fde("app.onboarding.author_visibility", bool, this.g, vid.a(Boolean.class));
        this.K0 = new fde("app.audio_onboarding_ended", bool, this.g, vid.a(Boolean.class));
        this.L0 = new fde("app.calls_sdk.debug.debug_menu", bool, this.g, vid.a(Boolean.class));
        this.M0 = new fde("app.profile_migration_complete", bool, this.g, vid.a(Boolean.class));
        this.N0 = new fde("app.calls.permission_request_time", -1L, this.g, vid.a(Long.class));
        int i = s65.d;
        this.O0 = new fde("app.informer_banners.show_duration", new s65(v9j.h(0, y65.NANOSECONDS)), this.g, vid.a(s65.class));
        this.P0 = new fde("app.informer_banners.sync", j, this.g, vid.a(Long.class));
        this.Q0 = new fde("folders_sync", j, this.g, vid.a(Long.class));
        this.R0 = new fde("app.complain_reasons.sync", j, this.g, vid.a(Long.class));
        this.S0 = new fde("app.video.debug.view", bool, this.g, vid.a(Boolean.class));
        n18 n18Var = this.g;
        jve jveVar = this.e;
        ca3 ca3VarA = vid.a(Boolean.class);
        b4 b4Var = new b4();
        b4Var.a = n18Var;
        b4Var.b = jveVar;
        b4Var.c = ca3VarA;
        b4Var.d = b4.class.getName();
        b4Var.o = new a4(b4Var);
        this.T0 = b4Var;
        vid.a(Long.class);
    }

    public final long H() {
        return ((Number) this.Q0.D(this, U0[30])).longValue();
    }

    public final String I() {
        return (String) this.q0.D(this, U0[3]);
    }

    public final String J() {
        return (String) this.r0.D(this, U0[4]);
    }

    public final long K() {
        return ((Number) this.F0.D(this, U0[19])).longValue();
    }

    public final boolean L() {
        return ((Boolean) this.s0.D(this, U0[5])).booleanValue();
    }

    public final boolean M() {
        return ((Boolean) this.L0.D(this, U0[25])).booleanValue();
    }

    public final boolean N() {
        return ((Boolean) this.C0.D(this, U0[16])).booleanValue();
    }

    public final boolean O() {
        return ((Boolean) this.B0.D(this, U0[15])).booleanValue();
    }

    public final boolean P() {
        return ((Boolean) this.A0.D(this, U0[14])).booleanValue();
    }

    public final void Q(long j) {
        this.Q0.O(this, U0[30], Long.valueOf(j));
    }

    public final void R(String str) {
        this.r0.O(this, U0[4], str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0118  */
    @Override // defpackage.w4e, defpackage.c4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe8.c():void");
    }
}

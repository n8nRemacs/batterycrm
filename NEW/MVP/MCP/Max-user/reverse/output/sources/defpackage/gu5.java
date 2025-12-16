package defpackage;

import android.content.Context;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class gu5 extends f5e implements rt5, yfe {
    public static final /* synthetic */ yy7[] S = {new toc(gu5.class, "isCallsSdkKwsEnabled", "isCallsSdkKwsEnabled()Z", 0), ho7.d(vid.a, gu5.class, "isCallsSdkRemoveNonOpusEnabled", "isCallsSdkRemoveNonOpusEnabled()Z", 0), new toc(gu5.class, "isCallsWebTransportEnabled", "isCallsWebTransportEnabled()Z", 0), new toc(gu5.class, "isWebRtcLoggingEnabled", "isWebRtcLoggingEnabled()Z", 0), new toc(gu5.class, "isCallsNoHostIceConnectionEnabled", "isCallsNoHostIceConnectionEnabled()Z", 0), new toc(gu5.class, "callsAudioJitterBufferMaxPackets", "getCallsAudioJitterBufferMaxPackets()J", 0), new toc(gu5.class, "isCallAudioManagerFixForSpeakerEnabled", "isCallAudioManagerFixForSpeakerEnabled()Z", 0), new toc(gu5.class, "isVideoGroupCalls", "isVideoGroupCalls()Z", 0), new toc(gu5.class, "devNullConfig", "getDevNullConfig()Lru/ok/tamtam/models/pms/DevNullServerConfig;", 0), new toc(gu5.class, "addUtmTagForTriggerShareLink", "getAddUtmTagForTriggerShareLink()Z", 0), new toc(gu5.class, "isMediaPlaylistEnabled", "isMediaPlaylistEnabled()Z", 0), new toc(gu5.class, "isUploadReusabilityEnabled", "isUploadReusabilityEnabled()Z", 0), new toc(gu5.class, "isMIUIMenuEnabled", "isMIUIMenuEnabled()Z", 0), new toc(gu5.class, "showWarningLinks", "getShowWarningLinks()Z", 0), new toc(gu5.class, "abStatus", "getAbStatus()J", 0), new toc(gu5.class, "isStreamableMp4Enabled", "isStreamableMp4Enabled()Z", 0), new toc(gu5.class, "isInformerBannerEnabled", "isInformerBannerEnabled()Z", 0), new toc(gu5.class, "isVideoMsgDownloadUrlsHackEnabled", "isVideoMsgDownloadUrlsHackEnabled()Z", 0), new toc(gu5.class, "isShowingUnknownContactBottomSheet", "isShowingUnknownContactBottomSheet()J", 0), new toc(gu5.class, "netStatConfig", "getNetStatConfig()Lru/ok/tamtam/models/pms/NetStatConfig;", 0), new toc(gu5.class, "cameraCaptureTimeout", "getCameraCaptureTimeout-UwyO8pc()J", 0), new toc(gu5.class, "isChatMediaScrollableCaptionEnabled", "isChatMediaScrollableCaptionEnabled()Z", 0), new toc(gu5.class, "isInlineEvPlayerEnabled", "isInlineEvPlayerEnabled()Z", 0), new toc(gu5.class, "ringtonePlayerFocus", "getRingtonePlayerFocus()J", 0), new toc(gu5.class, "useLocalBroadcastForPip", "getUseLocalBroadcastForPip()Z", 0), new toc(gu5.class, "hideNotificationOnIncomingScreen", "getHideNotificationOnIncomingScreen()Z", 0), new toc(gu5.class, "isAutoPlayEmbedForced", "isAutoPlayEmbedForced()Z", 0), new toc(gu5.class, "isNewLogoutLogicEnabled", "isNewLogoutLogicEnabled()Z", 0), new toc(gu5.class, "minSoundHearableLevel", "getMinSoundHearableLevel()J", 0), new toc(gu5.class, "isSuspendVideoConverterEnabled", "isSuspendVideoConverterEnabled()Z", 0), new toc(gu5.class, "videoContentCacheTtl", "getVideoContentCacheTtl()J", 0), new toc(gu5.class, "chatListSubtitleVersion", "getChatListSubtitleVersion()J", 0), new toc(gu5.class, "isNewYearThemesEnabled", "isNewYearThemesEnabled()Z", 0)};
    public final xt5 A;
    public final yt5 B;
    public final tt5 C;
    public final ut5 D;
    public final vt5 E;
    public final x6i F;
    public final yt5 G;
    public final tt5 H;
    public final ut5 I;
    public final vt5 J;
    public final wt5 K;
    public final xt5 L;
    public final yt5 M;
    public final tt5 N;
    public final ut5 O;
    public final vt5 P;
    public final xt5 Q;
    public final yt5 R;
    public final xt5 j;
    public final wt5 k;
    public final tt5 l;
    public final ut5 m;
    public final vt5 n;
    public final wt5 o;
    public final cu5 p;
    public final xt5 q;
    public final yt5 r;
    public k18 s;
    public final k5i t;
    public final cu5 u;
    public final tt5 v;
    public final tt5 w;
    public final ut5 x;
    public final vt5 y;
    public final wt5 z;

    public gu5(Context context, bx5 bx5Var, l5c l5cVar) {
        super(context, bx5Var, l5cVar);
        l5cVar.n.add(this);
        int i = 1;
        this.j = new xt5(this, PmsKey.f16callsloadkwsbysdkenabled, i);
        int i2 = 3;
        this.k = new wt5(this, PmsKey.f21callssdkremovenonopusaudiocodecs, i2);
        int i3 = 4;
        this.l = new tt5(this, PmsKey.f23callssdkwtenabled, i3);
        this.m = new ut5(this, PmsKey.f22callssdkwebrtclogs, i3);
        this.n = new vt5(this, PmsKey.f19callssdkenablenohost, i3);
        this.o = new wt5(this, PmsKey.f20callssdkmajb, i3);
        int i4 = 0;
        this.p = new cu5(this, PmsKey.f13callpermissionsinterval, i4);
        this.q = new xt5(this, PmsKey.f17callssdkamspeakerfix, i3);
        this.r = new yt5(this, PmsKey.f152videogroupcall, i3);
        this.s = new und(new st5(l5cVar, i4));
        PmsKey pmsKey = PmsKey.devnull;
        q85 q85Var = gv4.b;
        q85Var.getClass();
        this.t = new k5i(this, pmsKey, gv4.d, q85Var, 5);
        this.u = new cu5(this, PmsKey.landscape, i);
        this.v = new tt5(this, PmsKey.f149utmtagfortriggerlinkshare, 5);
        this.w = new tt5(this, PmsKey.f92mediaplaylistenabled, i4);
        this.x = new ut5(this, PmsKey.f147uploadreusability, i4);
        this.y = new vt5(this, PmsKey.f101miuimenuenabled, i4);
        this.z = new wt5(this, PmsKey.f139showwarninglinks, i4);
        this.A = new xt5(this, PmsKey.f0abstatus, i4);
        this.B = new yt5(this, PmsKey.f141streamablemp4, i4);
        this.C = new tt5(this, PmsKey.f66informerenabled, i);
        this.D = new ut5(this, PmsKey.f154videomsgdownloadurlshackenabled, i);
        this.E = new vt5(this, PmsKey.f46enableunknowncontactbottomsheet, i);
        int i5 = wda.a;
        this.F = new x6i(15, new wt5(this, PmsKey.f24camerafreezedetectortimeout, i));
        this.G = new yt5(this, PmsKey.f30chatmediascrollablecaptionenabled, i);
        int i6 = 2;
        this.H = new tt5(this, PmsKey.f67inlineevplayer, i6);
        this.I = new ut5(this, PmsKey.f129ringtoneplayerfocus, i6);
        this.J = new vt5(this, PmsKey.f74localpipbroadcast, i6);
        this.K = new wt5(this, PmsKey.f60hideincomingcallnotif, i6);
        this.L = new xt5(this, PmsKey.f55forceplayembed, i6);
        this.M = new yt5(this, PmsKey.f109newlogoutlogic, i6);
        this.N = new tt5(this, PmsKey.f99minsoundhearablelevel, i2);
        this.O = new ut5(this, PmsKey.f145suspendvideoconverter, i2);
        this.P = new vt5(this, PmsKey.f151videocontentcachettl, i2);
        this.Q = new xt5(this, PmsKey.f32chatlistsubtitlever, i2);
        this.R = new yt5(this, PmsKey.f112newyeartheme2026, i2);
    }

    @Override // defpackage.yfe
    public final void a() {
        k18 k18Var = this.s;
        tnd tndVar = k18Var instanceof tnd ? (tnd) k18Var : null;
        if (tndVar != null) {
            tndVar.reset();
        }
    }

    public final long n() {
        return ((Number) this.Q.D(this, S[31])).longValue();
    }

    public final gv4 o() {
        return (gv4) this.t.D(this, S[8]);
    }

    public final long p() {
        return ((Number) this.I.D(this, S[23])).longValue();
    }

    public final boolean q() {
        return ((Boolean) this.J.D(this, S[24])).booleanValue();
    }

    public final boolean r() {
        return j(PmsKey.f118onevideoplayer, false);
    }

    public final boolean s() {
        return ((Boolean) this.G.D(this, S[21])).booleanValue();
    }

    public final boolean t() {
        return j(PmsKey.gcas, false);
    }

    public final boolean u() {
        return j(PmsKey.gce, false);
    }

    public final boolean v() {
        return ((Boolean) this.C.D(this, S[16])).booleanValue();
    }

    public final boolean w() {
        return ((Boolean) this.H.D(this, S[22])).booleanValue();
    }

    public final boolean x() {
        return ((Boolean) this.w.D(this, S[10])).booleanValue();
    }

    public final boolean y() {
        return j(PmsKey.f28chatanim, false);
    }

    public final boolean z() {
        return j(PmsKey.f159webviewcacheenabled, false);
    }
}

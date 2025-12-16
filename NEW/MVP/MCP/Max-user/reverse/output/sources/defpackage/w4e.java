package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class w4e extends c4 implements pb3 {
    public static final /* synthetic */ yy7[] m0 = {new z8a(w4e.class, "_userId", "get_userId()J"), u45.h(vid.a, w4e.class, "contactsLastSync", "getContactsLastSync()J"), new z8a(w4e.class, "currentProxyList", "getCurrentProxyList()Ljava/lang/String;"), new z8a(w4e.class, "currentProxyListTtlInSec", "getCurrentProxyListTtlInSec()I"), new z8a(w4e.class, "pushProxyList", "getPushProxyList()Ljava/lang/String;"), new z8a(w4e.class, "lastSuccessProxy", "getLastSuccessProxy()Ljava/lang/String;"), new z8a(w4e.class, "lastProxyUpdateTime", "getLastProxyUpdateTime()J"), new z8a(w4e.class, "draftsLastSync", "getDraftsLastSync()J"), new z8a(w4e.class, "isDebugHostRotationEnabled", "isDebugHostRotationEnabled()Z"), new z8a(w4e.class, "isDebugUaDnsEmulationEnabled", "isDebugUaDnsEmulationEnabled()Z"), new z8a(w4e.class, "callsLastSync", "getCallsLastSync()J"), new z8a(w4e.class, "deviceAvatarPath", "getDeviceAvatarPath()Ljava/lang/String;"), new z8a(w4e.class, "serverTimeDelta", "getServerTimeDelta()J"), new z8a(w4e.class, "useTls", "getUseTls()Z"), new z8a(w4e.class, "unexpectedLogErrorCount", "getUnexpectedLogErrorCount()I"), new z8a(w4e.class, "lastLogSendTime", "getLastLogSendTime()J"), new z8a(w4e.class, "loginFailError", "getLoginFailError()Ljava/lang/String;"), new z8a(w4e.class, "stickersLastSync", "getStickersLastSync()J"), new z8a(w4e.class, "favoritesLastSync", "getFavoritesLastSync()J"), new z8a(w4e.class, "messageNotifIsVisible", "getMessageNotifIsVisible()Z"), new z8a(w4e.class, "forceConnection", "getForceConnection()Z"), new z8a(w4e.class, "lastSuccessfulRequestTime", "getLastSuccessfulRequestTime()J"), new z8a(w4e.class, "contactSortLastSync", "getContactSortLastSync()J"), new z8a(w4e.class, "phonesSortLastSync", "getPhonesSortLastSync()J"), new z8a(w4e.class, "pushToken", "getPushToken()Ljava/lang/String;"), new z8a(w4e.class, "pushDeviceType", "getPushDeviceType()Ljava/lang/String;"), new z8a(w4e.class, "okToken", "getOkToken()Ljava/lang/String;"), new z8a(w4e.class, "lastPushTime", "getLastPushTime()J"), new z8a(w4e.class, "okTokenRefreshTs", "getOkTokenRefreshTs()J"), new z8a(w4e.class, "isWriteContactsRequested", "isWriteContactsRequested()Z"), new z8a(w4e.class, "isPushNotificationsRequested", "isPushNotificationsRequested()Z"), new z8a(w4e.class, "alreadyInvitedFriends", "getAlreadyInvitedFriends()Z"), new z8a(w4e.class, "inviteFriendsTimesShown", "getInviteFriendsTimesShown()I"), new z8a(w4e.class, "inviteFriendsShowTime", "getInviteFriendsShowTime()J"), new z8a(w4e.class, "firstLoginTime", "getFirstLoginTime()J"), new z8a(w4e.class, "lastLoginTime", "getLastLoginTime()J"), new z8a(w4e.class, "lastChatMarker", "getLastChatMarker()J"), new z8a(w4e.class, "resetAtTime", "getResetAtTime()J"), new z8a(w4e.class, "favoriteStickersSectionUpdateTime", "getFavoriteStickersSectionUpdateTime()J"), new z8a(w4e.class, "favoriteStickerSetsSectionUpdateTime", "getFavoriteStickerSetsSectionUpdateTime()J"), new z8a(w4e.class, "deviceId", "getDeviceId()Ljava/lang/String;"), new z8a(w4e.class, "animojiSetsLastSync", "getAnimojiSetsLastSync()J"), new z8a(w4e.class, "reactionsLastSync", "getReactionsLastSync()J"), new z8a(w4e.class, "isFriendInvitedOnce", "isFriendInvitedOnce()Z"), new z8a(w4e.class, "lastPushStateTime", "getLastPushStateTime()J"), new z8a(w4e.class, "systemLang", "getSystemLang()Ljava/lang/String;"), new z8a(w4e.class, "lang", "getLang()Ljava/lang/String;"), new z8a(w4e.class, "fileOpenStats", "getFileOpenStats()Ljava/lang/String;"), new z8a(w4e.class, "phonebookSize", "getPhonebookSize()I"), new z8a(w4e.class, "imageCacheHitRate", "getImageCacheHitRate()F"), new z8a(w4e.class, "anrDetected", "getAnrDetected()Z"), new z8a(w4e.class, "caughtExceptionCount", "getCaughtExceptionCount()I"), new z8a(w4e.class, "crashDetected", "getCrashDetected()I"), new z8a(w4e.class, "_emulateRelease", "get_emulateRelease()Z"), new z8a(w4e.class, "_presenceLastSync", "get_presenceLastSync()J"), new z8a(w4e.class, "_chatsLastSync", "get_chatsLastSync()J")};
    public final fde A;
    public final fde B;
    public final fde C;
    public final fde D;
    public final fde E;
    public final fde F;
    public final fde G;
    public final fde H;
    public final fde I;
    public final fde J;
    public final fde K;
    public final fde L;
    public final fde M;
    public final fde N;
    public final fde O;
    public final fde P;
    public final fde Q;
    public final fde R;
    public final fde S;
    public final fde T;
    public final fde U;
    public final fde V;
    public final fde W;
    public final fde X;
    public final fde Y;
    public final fde Z;
    public final fde a0;
    public final fde b0;
    public final fde c0;
    public final fde d0;
    public final fde e0;
    public final fde f0;
    public final fde g0;
    public final uv4 h;
    public final fde h0;
    public volatile Locale i;
    public final fde i0;
    public volatile v32 j;
    public final fde j0;
    public final jve k;
    public final fde k0;
    public final fde l;
    public final fde l0;
    public final fde m;
    public final fde n;
    public final fde o;
    public final fde p;
    public final fde q;
    public final fde r;
    public final fde s;
    public final fde t;
    public final fde u;
    public final fde v;
    public final fde w;
    public final fde x;
    public final fde y;
    public final fde z;

    public w4e(uv4 uv4Var, bx5 bx5Var, Context context) {
        super(context, "user.prefs", bx5Var);
        this.h = uv4Var;
        int i = 0;
        this.k = kve.b(1, 0, 2);
        long j = -1L;
        this.l = new fde("user.Id", j, this.g, vid.a(Long.class));
        long j2 = 0L;
        this.m = new fde("user.contactsLastSync", j2, this.g, vid.a(Long.class));
        Object obj = null;
        this.n = new fde("app.currentProxyList", obj, this.g, vid.a(String.class));
        this.o = new fde("app.currentProxyListTtl", 299, this.g, vid.a(Integer.class));
        this.p = new fde("app.pushProxyList", obj, this.g, vid.a(String.class));
        this.q = new fde("app.lastSuccessProxy", obj, this.g, vid.a(String.class));
        new fde("app.lastProxyUpdateTime", j2, this.g, vid.a(Long.class));
        this.r = new fde("user.draftsLastSync", j, this.g, vid.a(Long.class));
        Boolean bool = Boolean.FALSE;
        this.s = new fde("app.debugHostRotation", bool, this.g, vid.a(Boolean.class));
        this.t = new fde("app.debugUaDnsEmulation", bool, this.g, vid.a(Boolean.class));
        this.u = new fde("user.callsLastSync", j2, this.g, vid.a(Long.class));
        this.v = new fde("user.deviceAvatarPath", obj, this.g, vid.a(String.class));
        this.w = new fde("server.timeDelta", j2, this.g, vid.a(Long.class));
        vid.a(Boolean.class);
        this.x = new fde("user.unexpectedLogErrorCount", i, this.g, vid.a(Integer.class));
        this.y = new fde("user.lastLogSendTime", j2, this.g, vid.a(Long.class));
        vid.a(String.class);
        this.z = new fde("user.stickersLastSync", j2, this.g, vid.a(Long.class));
        this.A = new fde("user.favoritesLastSync", j2, this.g, vid.a(Long.class));
        this.B = new fde("notif.isVisible", bool, this.g, vid.a(Boolean.class));
        this.C = new fde("app.forceConnection", bool, this.g, vid.a(Boolean.class));
        this.D = new fde("app.lastSuccessfulRequestTime", j2, this.g, vid.a(Long.class));
        this.E = new fde("user.contactSortLastSync", j2, this.g, vid.a(Long.class));
        this.F = new fde("user.phonesSortLastSync", j2, this.g, vid.a(Long.class));
        this.G = new fde("user.fcmToken", obj, this.g, vid.a(String.class));
        this.H = new fde("user.pushDeviceType", obj, this.g, vid.a(String.class));
        this.I = new fde("user.okToken", obj, this.g, vid.a(String.class));
        this.J = new fde("app.last.firebase_push_time", j2, this.g, vid.a(Long.class));
        this.K = new fde("app.ok.update_time", j2, this.g, vid.a(Long.class));
        this.L = new fde("app.writeConctatsRequested", bool, this.g, vid.a(Boolean.class));
        this.M = new fde("app.pushNotificationsRequested", bool, this.g, vid.a(Boolean.class));
        this.N = new fde("app.already.invited.friends", bool, this.g, vid.a(Boolean.class));
        this.O = new fde("app.invite.friends.times.shown", i, this.g, vid.a(Integer.class));
        this.P = new fde("app.first.invite.friends.time", j, this.g, vid.a(Long.class));
        this.Q = new fde("app.first.login.time", j2, this.g, vid.a(Long.class));
        this.R = new fde("app.last.login.time", j2, this.g, vid.a(Long.class));
        this.S = new fde("app.last.chat.marker", j2, this.g, vid.a(Long.class));
        this.T = new fde("app.reset.at.time", j2, this.g, vid.a(Long.class));
        this.U = new fde("user.favorites.stickers.updateTime", j2, this.g, vid.a(Long.class));
        this.V = new fde("user.favorites.stickerSets.updateTime", j2, this.g, vid.a(Long.class));
        this.W = new fde("device.id", obj, this.g, vid.a(String.class));
        this.X = new fde("user.animojiSetsLastSync", j2, this.g, vid.a(Long.class));
        this.Y = new fde("user.reactionsLastSync", j2, this.g, vid.a(Long.class));
        this.Z = new fde("user.inviteLinkClicked", bool, this.g, vid.a(Boolean.class));
        this.a0 = new fde("app.last.push.state.time", j2, this.g, vid.a(Long.class));
        this.b0 = new fde("user.systemLang", obj, this.g, vid.a(String.class));
        this.c0 = new fde("user.lang", "ru", this.g, vid.a(String.class));
        this.d0 = new fde("app.file.open_stats", "", this.g, vid.a(String.class));
        this.e0 = new fde("app.phonebook.size", i, this.g, vid.a(Integer.class));
        this.f0 = new fde("app.image_cache_hit_rate", Float.valueOf(Float.NaN), this.g, vid.a(Float.class));
        this.g0 = new fde("app.anr.detected", bool, this.g, vid.a(Boolean.class));
        this.h0 = new fde("app.crash.caught", i, this.g, vid.a(Integer.class));
        this.i0 = new fde("app.crash.detected", i, this.g, vid.a(Integer.class));
        this.j0 = new fde("app.emulate_release", bool, this.g, vid.a(Boolean.class));
        this.k0 = new fde("user.presenceLastSync", j2, this.g, vid.a(Long.class));
        this.l0 = new fde("user.chatsLastSync", j2, this.g, vid.a(Long.class));
    }

    public final void A(boolean z) {
        this.C.O(this, m0[20], Boolean.valueOf(z));
    }

    public final void B(String str) {
        this.G.O(this, m0[24], str);
    }

    public final void C(long j) {
        this.Y.O(this, m0[42], Long.valueOf(j));
    }

    public final void D(long j) {
        this.z.O(this, m0[17], Long.valueOf(j));
    }

    public final void E(int i) {
        this.x.O(this, m0[14], Integer.valueOf(i));
    }

    public final void F(long j) {
        this.l.O(this, m0[0], Long.valueOf(j));
        this.k.h(Long.valueOf(j));
    }

    public final void G() {
        this.L.O(this, m0[29], Boolean.TRUE);
    }

    @Override // defpackage.c4
    public void c() {
        super.c();
        this.j = null;
        this.k.h(Long.valueOf(s()));
    }

    public final long j() {
        return r() + System.currentTimeMillis();
    }

    public final synchronized long k() {
        v32 v32Var;
        try {
            if (this.j == null) {
                this.j = new v32(new prd(8, this), new u4e(0, this));
            }
            v32Var = this.j;
            if (v32Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return v32Var.b + ((AtomicInteger) v32Var.c).getAndIncrement();
    }

    public final long l() {
        return ((Number) this.u.D(this, m0[10])).longValue();
    }

    public final long m() {
        return ((Number) this.m.D(this, m0[1])).longValue();
    }

    public final String n() {
        return (String) this.v.D(this, m0[11]);
    }

    public final String o() {
        return (String) this.c0.D(this, m0[46]);
    }

    public final String p() {
        return (String) this.I.D(this, m0[26]);
    }

    public final long q() {
        return ((Number) this.K.D(this, m0[28])).longValue();
    }

    public final long r() {
        return ((Number) this.w.D(this, m0[12])).longValue();
    }

    public final long s() {
        return ((Number) this.l.D(this, m0[0])).longValue();
    }

    public final m36 t() {
        return new m36(new v4e(this, null), this.k);
    }

    public final Locale u() {
        Locale locale = this.i;
        if (locale != null) {
            return locale;
        }
        Locale locale2 = new Locale(o());
        this.i = locale2;
        return locale2;
    }

    public final long v() {
        return ((Number) this.l0.D(this, m0[55])).longValue();
    }

    public final long w() {
        return ((Number) this.k0.D(this, m0[54])).longValue();
    }

    public final void x(long j) {
        if (j > v()) {
            wqi.c(this.f, "setChatsLastSync %d", Long.valueOf(j));
            this.l0.O(this, m0[55], Long.valueOf(j));
        }
    }

    public final void y(long j) {
        this.r.O(this, m0[7], Long.valueOf(j));
    }

    public final void z(long j) {
        this.A.O(this, m0[18], Long.valueOf(j));
    }
}

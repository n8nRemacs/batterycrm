package ru.ok.tamtam.android.prefs;

import androidx.annotation.Keep;
import defpackage.bwf;
import defpackage.ho7;
import defpackage.k18;
import defpackage.k5c;
import defpackage.to8;
import defpackage.we3;
import defpackage.yg5;
import defpackage.zfb;
import defpackage.zg5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.apache.http.HttpStatus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b»\u0001\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001¨\u0006¿\u0001"}, d2 = {"Lru/ok/tamtam/android/prefs/PmsKey;", "", "<init>", "(Ljava/lang/String;I)V", "", "toString", "()Ljava/lang/String;", "fullContentString$prefs_release", "fullContentString", "Companion", "k5c", "set-unread-timeout", "proxy", "debug-mode", "min-log-level", "user-debug-report", "android-use-logcat-logger", "proxy-domains", "image-width", "image-height", "image-quality", "image-size", "max-msg-length", "max-participants", "max-audio-length", "max-theme-length", "max-description-length", "edit-timeout", "chats-page-size", "keep-connection", "invite-link", "invite-short", "invite-long", "invite-header", "file-upload-max-size", "file-upload-unsupported-types", "chats-preload-period", "max-favorite-chats", "disconnect-timeout", "max-attach-count", "support-account", "support-email", "wakelock-on-push", "mentions_entity_names_limit", "max-readmarks", "max-video-duration-download", "max-favorite-stickers", "max-favorite-sticker-sets", "min-sticker-size", "max-sticker-size", "default-sticker-size", "min-image-side-size", "min-duration-save-audio-start-time", "valid-interval-audio-start-time", "min-duration-playback-speed", "drafts-sync-enabled", "audio-transcription-locales", "scheduled-messages-enabled", "tracer-non-fatal-crashed-enabled", "subscription-timeout-seconds", "double-tap-reaction", "reactions-max", "react-errors", "msg-get-reactions-page-size", "wm-workers-limit", "wm-check-workers-count-interval-sec", "wm-backlog-worker-check-delay-sec", "wm-backlog-worker-backoff-delay-sec", "wm-workers-offset", "wm-analytics-enabled", "progress-diff-for-notify", "worker-progress-time-diff-for-notify-ms", "max-downloaded-size-for-notify-kb", "fb-exec-replace", "fb-exec-modifiers-names", "log-full", "log-sensitive", "anr-config", "debug-profile-info", "calls-endpoint", "fake-chats", "channels-enabled", "available-complaints", "in-app-review-triggers", "fake-in-app-review", "invite-friends-sheet-frequency", "welcome-sticker-ids", "money-transfer-botid", "non-contact-sync-time", "non-contact-max-chunk-size", "non-contact-collection-interval", "edit-chat-type-screen-enabled", "gce", "grse", "gcas", "gcwre", "gcmpe", "group-call-chat-support", "group-call-part-limit", "gc-from-p2p", "gc-link-pre-settings", "call-incoming-ab", "call-custom-ringtone", "account-nickname-enabled", "send-location-enabled", "reconnect-call-ringtone", "media-viewer-rotation-enabled", "new-uploader-enabled", "mytracker-enabled", "chat-video-autoplay-parallel-count", "bot-complaint-enabled", "calls-sdk-disable-init-tflite", "calls-sdk-remove-nonopus-audiocodecs", "calls-sdk-am-speaker-fix", "call-icons-reorder", "video-group-call", "calls-load-kws-by-sdk-enabled", "calls-sdk-wt-enabled", "calls-sdk-majb", "calls-sdk-webrtc-logs", "calls-sdk-enable-nohost", "call-permissions-interval", "cfs", "ab-status", "conn-timeouts", "media-transform", "call-rate", "send-queue-size", "webapp-ds-keys-count", "webapp-ss-keys-count", "chat-invite-link-permissions-enabled", "edit-channel-type-screen-enabled", "chat-anim", "saved-messages-aliases", "video-msg-config", "stat-session-background-threshold", "bot-start-param", "esia-enabled", "media-order", "bad-networ-indicator-config", "new-session-logic", "analytics-enabled", "mytracker-log-level", "search-webapps-showcase", "player-load-control", "settings-entry-banners", "folders-max-count", "net-client-dns-enabled", "creation-2fa-config", "one-video-player", "one-video-uploader", "y-map", "views-count-enabled", "official-bot-naming-enabled", "webview-cache-enabled", "quotes-enabled", "search-loader-v2-enabled", "upload-reusability", "devnull", "server-side-complains-enabled", "channels-complaint-enabled", "landscape", "location-map-widget-enabled", "utm-tag-for-trigger-link-share", "media-playlist-enabled", "miui-menu-enabled", "show-warning-links", "video-msg-download-urls-hack-enabled", "net-stat-config", "streamable-mp4", "informer-enabled", "camera-freeze-detector-timeout", "chat-media-scrollable-caption-enabled", "enable-unknown-contact-bottom-sheet", "inline-ev-player", "channel-statistics-botid", "ringtone-player-focus", "local-pip-broadcast", "hide-incoming-call-notif", "force-play-embed", "new-logout-logic", "reactions-sync-time", "min-sound-hearable-level", "suspend-video-converter", "push-delivery", "net-new-client-enabled", "official-org", "video-content-cache-ttl", "chatlist-subtitle-ver", "new-year-theme-2026", "white-list-links", "prefs_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PmsKey {
    private static final /* synthetic */ yg5 $ENTRIES;
    private static final /* synthetic */ PmsKey[] $VALUES;
    public static final k5c Companion;
    private static final k18 keys$delegate;

    /* renamed from: set-unread-timeout, reason: not valid java name */
    public static final PmsKey f137setunreadtimeout = new PmsKey("set-unread-timeout", 0);
    public static final PmsKey proxy = new PmsKey("proxy", 1);

    /* renamed from: debug-mode, reason: not valid java name */
    public static final PmsKey f37debugmode = new PmsKey("debug-mode", 2);

    /* renamed from: min-log-level, reason: not valid java name */
    public static final PmsKey f98minloglevel = new PmsKey("min-log-level", 3);

    /* renamed from: user-debug-report, reason: not valid java name */
    public static final PmsKey f148userdebugreport = new PmsKey("user-debug-report", 4);

    /* renamed from: android-use-logcat-logger, reason: not valid java name */
    public static final PmsKey f3androiduselogcatlogger = new PmsKey("android-use-logcat-logger", 5);

    /* renamed from: proxy-domains, reason: not valid java name */
    public static final PmsKey f122proxydomains = new PmsKey("proxy-domains", 6);

    /* renamed from: image-width, reason: not valid java name */
    public static final PmsKey f64imagewidth = new PmsKey("image-width", 7);

    /* renamed from: image-height, reason: not valid java name */
    public static final PmsKey f61imageheight = new PmsKey("image-height", 8);

    /* renamed from: image-quality, reason: not valid java name */
    public static final PmsKey f62imagequality = new PmsKey("image-quality", 9);

    /* renamed from: image-size, reason: not valid java name */
    public static final PmsKey f63imagesize = new PmsKey("image-size", 10);

    /* renamed from: max-msg-length, reason: not valid java name */
    public static final PmsKey f85maxmsglength = new PmsKey("max-msg-length", 11);

    /* renamed from: max-participants, reason: not valid java name */
    public static final PmsKey f86maxparticipants = new PmsKey("max-participants", 12);

    /* renamed from: max-audio-length, reason: not valid java name */
    public static final PmsKey f79maxaudiolength = new PmsKey("max-audio-length", 13);

    /* renamed from: max-theme-length, reason: not valid java name */
    public static final PmsKey f89maxthemelength = new PmsKey("max-theme-length", 14);

    /* renamed from: max-description-length, reason: not valid java name */
    public static final PmsKey f80maxdescriptionlength = new PmsKey("max-description-length", 15);

    /* renamed from: edit-timeout, reason: not valid java name */
    public static final PmsKey f45edittimeout = new PmsKey("edit-timeout", 16);

    /* renamed from: chats-page-size, reason: not valid java name */
    public static final PmsKey f33chatspagesize = new PmsKey("chats-page-size", 17);

    /* renamed from: keep-connection, reason: not valid java name */
    public static final PmsKey f73keepconnection = new PmsKey("keep-connection", 18);

    /* renamed from: invite-link, reason: not valid java name */
    public static final PmsKey f70invitelink = new PmsKey("invite-link", 19);

    /* renamed from: invite-short, reason: not valid java name */
    public static final PmsKey f72inviteshort = new PmsKey("invite-short", 20);

    /* renamed from: invite-long, reason: not valid java name */
    public static final PmsKey f71invitelong = new PmsKey("invite-long", 21);

    /* renamed from: invite-header, reason: not valid java name */
    public static final PmsKey f69inviteheader = new PmsKey("invite-header", 22);

    /* renamed from: file-upload-max-size, reason: not valid java name */
    public static final PmsKey f52fileuploadmaxsize = new PmsKey("file-upload-max-size", 23);

    /* renamed from: file-upload-unsupported-types, reason: not valid java name */
    public static final PmsKey f53fileuploadunsupportedtypes = new PmsKey("file-upload-unsupported-types", 24);

    /* renamed from: chats-preload-period, reason: not valid java name */
    public static final PmsKey f34chatspreloadperiod = new PmsKey("chats-preload-period", 25);

    /* renamed from: max-favorite-chats, reason: not valid java name */
    public static final PmsKey f82maxfavoritechats = new PmsKey("max-favorite-chats", 26);

    /* renamed from: disconnect-timeout, reason: not valid java name */
    public static final PmsKey f40disconnecttimeout = new PmsKey("disconnect-timeout", 27);

    /* renamed from: max-attach-count, reason: not valid java name */
    public static final PmsKey f78maxattachcount = new PmsKey("max-attach-count", 28);

    /* renamed from: support-account, reason: not valid java name */
    public static final PmsKey f143supportaccount = new PmsKey("support-account", 29);

    /* renamed from: support-email, reason: not valid java name */
    public static final PmsKey f144supportemail = new PmsKey("support-email", 30);

    /* renamed from: wakelock-on-push, reason: not valid java name */
    public static final PmsKey f156wakelockonpush = new PmsKey("wakelock-on-push", 31);
    public static final PmsKey mentions_entity_names_limit = new PmsKey("mentions_entity_names_limit", 32);

    /* renamed from: max-readmarks, reason: not valid java name */
    public static final PmsKey f87maxreadmarks = new PmsKey("max-readmarks", 33);

    /* renamed from: max-video-duration-download, reason: not valid java name */
    public static final PmsKey f90maxvideodurationdownload = new PmsKey("max-video-duration-download", 34);

    /* renamed from: max-favorite-stickers, reason: not valid java name */
    public static final PmsKey f84maxfavoritestickers = new PmsKey("max-favorite-stickers", 35);

    /* renamed from: max-favorite-sticker-sets, reason: not valid java name */
    public static final PmsKey f83maxfavoritestickersets = new PmsKey("max-favorite-sticker-sets", 36);

    /* renamed from: min-sticker-size, reason: not valid java name */
    public static final PmsKey f100minstickersize = new PmsKey("min-sticker-size", 37);

    /* renamed from: max-sticker-size, reason: not valid java name */
    public static final PmsKey f88maxstickersize = new PmsKey("max-sticker-size", 38);

    /* renamed from: default-sticker-size, reason: not valid java name */
    public static final PmsKey f39defaultstickersize = new PmsKey("default-sticker-size", 39);

    /* renamed from: min-image-side-size, reason: not valid java name */
    public static final PmsKey f97minimagesidesize = new PmsKey("min-image-side-size", 40);

    /* renamed from: min-duration-save-audio-start-time, reason: not valid java name */
    public static final PmsKey f96mindurationsaveaudiostarttime = new PmsKey("min-duration-save-audio-start-time", 41);

    /* renamed from: valid-interval-audio-start-time, reason: not valid java name */
    public static final PmsKey f150validintervalaudiostarttime = new PmsKey("valid-interval-audio-start-time", 42);

    /* renamed from: min-duration-playback-speed, reason: not valid java name */
    public static final PmsKey f95mindurationplaybackspeed = new PmsKey("min-duration-playback-speed", 43);

    /* renamed from: drafts-sync-enabled, reason: not valid java name */
    public static final PmsKey f42draftssyncenabled = new PmsKey("drafts-sync-enabled", 44);

    /* renamed from: audio-transcription-locales, reason: not valid java name */
    public static final PmsKey f5audiotranscriptionlocales = new PmsKey("audio-transcription-locales", 45);

    /* renamed from: scheduled-messages-enabled, reason: not valid java name */
    public static final PmsKey f131scheduledmessagesenabled = new PmsKey("scheduled-messages-enabled", 46);

    /* renamed from: tracer-non-fatal-crashed-enabled, reason: not valid java name */
    public static final PmsKey f146tracernonfatalcrashedenabled = new PmsKey("tracer-non-fatal-crashed-enabled", 47);

    /* renamed from: subscription-timeout-seconds, reason: not valid java name */
    public static final PmsKey f142subscriptiontimeoutseconds = new PmsKey("subscription-timeout-seconds", 48);

    /* renamed from: double-tap-reaction, reason: not valid java name */
    public static final PmsKey f41doubletapreaction = new PmsKey("double-tap-reaction", 49);

    /* renamed from: reactions-max, reason: not valid java name */
    public static final PmsKey f126reactionsmax = new PmsKey("reactions-max", 50);

    /* renamed from: react-errors, reason: not valid java name */
    public static final PmsKey f125reacterrors = new PmsKey("react-errors", 51);

    /* renamed from: msg-get-reactions-page-size, reason: not valid java name */
    public static final PmsKey f103msggetreactionspagesize = new PmsKey("msg-get-reactions-page-size", 52);

    /* renamed from: wm-workers-limit, reason: not valid java name */
    public static final PmsKey f166wmworkerslimit = new PmsKey("wm-workers-limit", 53);

    /* renamed from: wm-check-workers-count-interval-sec, reason: not valid java name */
    public static final PmsKey f165wmcheckworkerscountintervalsec = new PmsKey("wm-check-workers-count-interval-sec", 54);

    /* renamed from: wm-backlog-worker-check-delay-sec, reason: not valid java name */
    public static final PmsKey f164wmbacklogworkercheckdelaysec = new PmsKey("wm-backlog-worker-check-delay-sec", 55);

    /* renamed from: wm-backlog-worker-backoff-delay-sec, reason: not valid java name */
    public static final PmsKey f163wmbacklogworkerbackoffdelaysec = new PmsKey("wm-backlog-worker-backoff-delay-sec", 56);

    /* renamed from: wm-workers-offset, reason: not valid java name */
    public static final PmsKey f167wmworkersoffset = new PmsKey("wm-workers-offset", 57);

    /* renamed from: wm-analytics-enabled, reason: not valid java name */
    public static final PmsKey f162wmanalyticsenabled = new PmsKey("wm-analytics-enabled", 58);

    /* renamed from: progress-diff-for-notify, reason: not valid java name */
    public static final PmsKey f121progressdifffornotify = new PmsKey("progress-diff-for-notify", 59);

    /* renamed from: worker-progress-time-diff-for-notify-ms, reason: not valid java name */
    public static final PmsKey f168workerprogresstimedifffornotifyms = new PmsKey("worker-progress-time-diff-for-notify-ms", 60);

    /* renamed from: max-downloaded-size-for-notify-kb, reason: not valid java name */
    public static final PmsKey f81maxdownloadedsizefornotifykb = new PmsKey("max-downloaded-size-for-notify-kb", 61);

    /* renamed from: fb-exec-replace, reason: not valid java name */
    public static final PmsKey f51fbexecreplace = new PmsKey("fb-exec-replace", 62);

    /* renamed from: fb-exec-modifiers-names, reason: not valid java name */
    public static final PmsKey f50fbexecmodifiersnames = new PmsKey("fb-exec-modifiers-names", 63);

    /* renamed from: log-full, reason: not valid java name */
    public static final PmsKey f76logfull = new PmsKey("log-full", 64);

    /* renamed from: log-sensitive, reason: not valid java name */
    public static final PmsKey f77logsensitive = new PmsKey("log-sensitive", 65);

    /* renamed from: anr-config, reason: not valid java name */
    public static final PmsKey f4anrconfig = new PmsKey("anr-config", 66);

    /* renamed from: debug-profile-info, reason: not valid java name */
    public static final PmsKey f38debugprofileinfo = new PmsKey("debug-profile-info", 67);

    /* renamed from: calls-endpoint, reason: not valid java name */
    public static final PmsKey f15callsendpoint = new PmsKey("calls-endpoint", 68);

    /* renamed from: fake-chats, reason: not valid java name */
    public static final PmsKey f48fakechats = new PmsKey("fake-chats", 69);

    /* renamed from: channels-enabled, reason: not valid java name */
    public static final PmsKey f27channelsenabled = new PmsKey("channels-enabled", 70);

    /* renamed from: available-complaints, reason: not valid java name */
    public static final PmsKey f6availablecomplaints = new PmsKey("available-complaints", 71);

    /* renamed from: in-app-review-triggers, reason: not valid java name */
    public static final PmsKey f65inappreviewtriggers = new PmsKey("in-app-review-triggers", 72);

    /* renamed from: fake-in-app-review, reason: not valid java name */
    public static final PmsKey f49fakeinappreview = new PmsKey("fake-in-app-review", 73);

    /* renamed from: invite-friends-sheet-frequency, reason: not valid java name */
    public static final PmsKey f68invitefriendssheetfrequency = new PmsKey("invite-friends-sheet-frequency", 74);

    /* renamed from: welcome-sticker-ids, reason: not valid java name */
    public static final PmsKey f160welcomestickerids = new PmsKey("welcome-sticker-ids", 75);

    /* renamed from: money-transfer-botid, reason: not valid java name */
    public static final PmsKey f102moneytransferbotid = new PmsKey("money-transfer-botid", 76);

    /* renamed from: non-contact-sync-time, reason: not valid java name */
    public static final PmsKey f115noncontactsynctime = new PmsKey("non-contact-sync-time", 77);

    /* renamed from: non-contact-max-chunk-size, reason: not valid java name */
    public static final PmsKey f114noncontactmaxchunksize = new PmsKey("non-contact-max-chunk-size", 78);

    /* renamed from: non-contact-collection-interval, reason: not valid java name */
    public static final PmsKey f113noncontactcollectioninterval = new PmsKey("non-contact-collection-interval", 79);

    /* renamed from: edit-chat-type-screen-enabled, reason: not valid java name */
    public static final PmsKey f44editchattypescreenenabled = new PmsKey("edit-chat-type-screen-enabled", 80);
    public static final PmsKey gce = new PmsKey("gce", 81);
    public static final PmsKey grse = new PmsKey("grse", 82);
    public static final PmsKey gcas = new PmsKey("gcas", 83);
    public static final PmsKey gcwre = new PmsKey("gcwre", 84);
    public static final PmsKey gcmpe = new PmsKey("gcmpe", 85);

    /* renamed from: group-call-chat-support, reason: not valid java name */
    public static final PmsKey f58groupcallchatsupport = new PmsKey("group-call-chat-support", 86);

    /* renamed from: group-call-part-limit, reason: not valid java name */
    public static final PmsKey f59groupcallpartlimit = new PmsKey("group-call-part-limit", 87);

    /* renamed from: gc-from-p2p, reason: not valid java name */
    public static final PmsKey f56gcfromp2p = new PmsKey("gc-from-p2p", 88);

    /* renamed from: gc-link-pre-settings, reason: not valid java name */
    public static final PmsKey f57gclinkpresettings = new PmsKey("gc-link-pre-settings", 89);

    /* renamed from: call-incoming-ab, reason: not valid java name */
    public static final PmsKey f12callincomingab = new PmsKey("call-incoming-ab", 90);

    /* renamed from: call-custom-ringtone, reason: not valid java name */
    public static final PmsKey f10callcustomringtone = new PmsKey("call-custom-ringtone", 91);

    /* renamed from: account-nickname-enabled, reason: not valid java name */
    public static final PmsKey f1accountnicknameenabled = new PmsKey("account-nickname-enabled", 92);

    /* renamed from: send-location-enabled, reason: not valid java name */
    public static final PmsKey f134sendlocationenabled = new PmsKey("send-location-enabled", 93);

    /* renamed from: reconnect-call-ringtone, reason: not valid java name */
    public static final PmsKey f128reconnectcallringtone = new PmsKey("reconnect-call-ringtone", 94);

    /* renamed from: media-viewer-rotation-enabled, reason: not valid java name */
    public static final PmsKey f94mediaviewerrotationenabled = new PmsKey("media-viewer-rotation-enabled", 95);

    /* renamed from: new-uploader-enabled, reason: not valid java name */
    public static final PmsKey f111newuploaderenabled = new PmsKey("new-uploader-enabled", 96);

    /* renamed from: mytracker-enabled, reason: not valid java name */
    public static final PmsKey f104mytrackerenabled = new PmsKey("mytracker-enabled", 97);

    /* renamed from: chat-video-autoplay-parallel-count, reason: not valid java name */
    public static final PmsKey f31chatvideoautoplayparallelcount = new PmsKey("chat-video-autoplay-parallel-count", 98);

    /* renamed from: bot-complaint-enabled, reason: not valid java name */
    public static final PmsKey f8botcomplaintenabled = new PmsKey("bot-complaint-enabled", 99);

    /* renamed from: calls-sdk-disable-init-tflite, reason: not valid java name */
    public static final PmsKey f18callssdkdisableinittflite = new PmsKey("calls-sdk-disable-init-tflite", 100);

    /* renamed from: calls-sdk-remove-nonopus-audiocodecs, reason: not valid java name */
    public static final PmsKey f21callssdkremovenonopusaudiocodecs = new PmsKey("calls-sdk-remove-nonopus-audiocodecs", HttpStatus.SC_SWITCHING_PROTOCOLS);

    /* renamed from: calls-sdk-am-speaker-fix, reason: not valid java name */
    public static final PmsKey f17callssdkamspeakerfix = new PmsKey("calls-sdk-am-speaker-fix", HttpStatus.SC_PROCESSING);

    /* renamed from: call-icons-reorder, reason: not valid java name */
    public static final PmsKey f11calliconsreorder = new PmsKey("call-icons-reorder", 103);

    /* renamed from: video-group-call, reason: not valid java name */
    public static final PmsKey f152videogroupcall = new PmsKey("video-group-call", 104);

    /* renamed from: calls-load-kws-by-sdk-enabled, reason: not valid java name */
    public static final PmsKey f16callsloadkwsbysdkenabled = new PmsKey("calls-load-kws-by-sdk-enabled", 105);

    /* renamed from: calls-sdk-wt-enabled, reason: not valid java name */
    public static final PmsKey f23callssdkwtenabled = new PmsKey("calls-sdk-wt-enabled", 106);

    /* renamed from: calls-sdk-majb, reason: not valid java name */
    public static final PmsKey f20callssdkmajb = new PmsKey("calls-sdk-majb", 107);

    /* renamed from: calls-sdk-webrtc-logs, reason: not valid java name */
    public static final PmsKey f22callssdkwebrtclogs = new PmsKey("calls-sdk-webrtc-logs", 108);

    /* renamed from: calls-sdk-enable-nohost, reason: not valid java name */
    public static final PmsKey f19callssdkenablenohost = new PmsKey("calls-sdk-enable-nohost", 109);

    /* renamed from: call-permissions-interval, reason: not valid java name */
    public static final PmsKey f13callpermissionsinterval = new PmsKey("call-permissions-interval", 110);
    public static final PmsKey cfs = new PmsKey("cfs", 111);

    /* renamed from: ab-status, reason: not valid java name */
    public static final PmsKey f0abstatus = new PmsKey("ab-status", 112);

    /* renamed from: conn-timeouts, reason: not valid java name */
    public static final PmsKey f35conntimeouts = new PmsKey("conn-timeouts", 113);

    /* renamed from: media-transform, reason: not valid java name */
    public static final PmsKey f93mediatransform = new PmsKey("media-transform", 114);

    /* renamed from: call-rate, reason: not valid java name */
    public static final PmsKey f14callrate = new PmsKey("call-rate", 115);

    /* renamed from: send-queue-size, reason: not valid java name */
    public static final PmsKey f135sendqueuesize = new PmsKey("send-queue-size", 116);

    /* renamed from: webapp-ds-keys-count, reason: not valid java name */
    public static final PmsKey f157webappdskeyscount = new PmsKey("webapp-ds-keys-count", 117);

    /* renamed from: webapp-ss-keys-count, reason: not valid java name */
    public static final PmsKey f158webappsskeyscount = new PmsKey("webapp-ss-keys-count", 118);

    /* renamed from: chat-invite-link-permissions-enabled, reason: not valid java name */
    public static final PmsKey f29chatinvitelinkpermissionsenabled = new PmsKey("chat-invite-link-permissions-enabled", 119);

    /* renamed from: edit-channel-type-screen-enabled, reason: not valid java name */
    public static final PmsKey f43editchanneltypescreenenabled = new PmsKey("edit-channel-type-screen-enabled", 120);

    /* renamed from: chat-anim, reason: not valid java name */
    public static final PmsKey f28chatanim = new PmsKey("chat-anim", 121);

    /* renamed from: saved-messages-aliases, reason: not valid java name */
    public static final PmsKey f130savedmessagesaliases = new PmsKey("saved-messages-aliases", 122);

    /* renamed from: video-msg-config, reason: not valid java name */
    public static final PmsKey f153videomsgconfig = new PmsKey("video-msg-config", 123);

    /* renamed from: stat-session-background-threshold, reason: not valid java name */
    public static final PmsKey f140statsessionbackgroundthreshold = new PmsKey("stat-session-background-threshold", 124);

    /* renamed from: bot-start-param, reason: not valid java name */
    public static final PmsKey f9botstartparam = new PmsKey("bot-start-param", 125);

    /* renamed from: esia-enabled, reason: not valid java name */
    public static final PmsKey f47esiaenabled = new PmsKey("esia-enabled", 126);

    /* renamed from: media-order, reason: not valid java name */
    public static final PmsKey f91mediaorder = new PmsKey("media-order", 127);

    /* renamed from: bad-networ-indicator-config, reason: not valid java name */
    public static final PmsKey f7badnetworindicatorconfig = new PmsKey("bad-networ-indicator-config", 128);

    /* renamed from: new-session-logic, reason: not valid java name */
    public static final PmsKey f110newsessionlogic = new PmsKey("new-session-logic", 129);

    /* renamed from: analytics-enabled, reason: not valid java name */
    public static final PmsKey f2analyticsenabled = new PmsKey("analytics-enabled", 130);

    /* renamed from: mytracker-log-level, reason: not valid java name */
    public static final PmsKey f105mytrackerloglevel = new PmsKey("mytracker-log-level", 131);

    /* renamed from: search-webapps-showcase, reason: not valid java name */
    public static final PmsKey f133searchwebappsshowcase = new PmsKey("search-webapps-showcase", 132);

    /* renamed from: player-load-control, reason: not valid java name */
    public static final PmsKey f120playerloadcontrol = new PmsKey("player-load-control", 133);

    /* renamed from: settings-entry-banners, reason: not valid java name */
    public static final PmsKey f138settingsentrybanners = new PmsKey("settings-entry-banners", 134);

    /* renamed from: folders-max-count, reason: not valid java name */
    public static final PmsKey f54foldersmaxcount = new PmsKey("folders-max-count", 135);

    /* renamed from: net-client-dns-enabled, reason: not valid java name */
    public static final PmsKey f106netclientdnsenabled = new PmsKey("net-client-dns-enabled", 136);

    /* renamed from: creation-2fa-config, reason: not valid java name */
    public static final PmsKey f36creation2faconfig = new PmsKey("creation-2fa-config", 137);

    /* renamed from: one-video-player, reason: not valid java name */
    public static final PmsKey f118onevideoplayer = new PmsKey("one-video-player", 138);

    /* renamed from: one-video-uploader, reason: not valid java name */
    public static final PmsKey f119onevideouploader = new PmsKey("one-video-uploader", 139);

    /* renamed from: y-map, reason: not valid java name */
    public static final PmsKey f169ymap = new PmsKey("y-map", 140);

    /* renamed from: views-count-enabled, reason: not valid java name */
    public static final PmsKey f155viewscountenabled = new PmsKey("views-count-enabled", 141);

    /* renamed from: official-bot-naming-enabled, reason: not valid java name */
    public static final PmsKey f116officialbotnamingenabled = new PmsKey("official-bot-naming-enabled", 142);

    /* renamed from: webview-cache-enabled, reason: not valid java name */
    public static final PmsKey f159webviewcacheenabled = new PmsKey("webview-cache-enabled", 143);

    /* renamed from: quotes-enabled, reason: not valid java name */
    public static final PmsKey f124quotesenabled = new PmsKey("quotes-enabled", 144);

    /* renamed from: search-loader-v2-enabled, reason: not valid java name */
    public static final PmsKey f132searchloaderv2enabled = new PmsKey("search-loader-v2-enabled", 145);

    /* renamed from: upload-reusability, reason: not valid java name */
    public static final PmsKey f147uploadreusability = new PmsKey("upload-reusability", 146);
    public static final PmsKey devnull = new PmsKey("devnull", 147);

    /* renamed from: server-side-complains-enabled, reason: not valid java name */
    public static final PmsKey f136serversidecomplainsenabled = new PmsKey("server-side-complains-enabled", 148);

    /* renamed from: channels-complaint-enabled, reason: not valid java name */
    public static final PmsKey f26channelscomplaintenabled = new PmsKey("channels-complaint-enabled", 149);
    public static final PmsKey landscape = new PmsKey("landscape", 150);

    /* renamed from: location-map-widget-enabled, reason: not valid java name */
    public static final PmsKey f75locationmapwidgetenabled = new PmsKey("location-map-widget-enabled", 151);

    /* renamed from: utm-tag-for-trigger-link-share, reason: not valid java name */
    public static final PmsKey f149utmtagfortriggerlinkshare = new PmsKey("utm-tag-for-trigger-link-share", 152);

    /* renamed from: media-playlist-enabled, reason: not valid java name */
    public static final PmsKey f92mediaplaylistenabled = new PmsKey("media-playlist-enabled", 153);

    /* renamed from: miui-menu-enabled, reason: not valid java name */
    public static final PmsKey f101miuimenuenabled = new PmsKey("miui-menu-enabled", 154);

    /* renamed from: show-warning-links, reason: not valid java name */
    public static final PmsKey f139showwarninglinks = new PmsKey("show-warning-links", 155);

    /* renamed from: video-msg-download-urls-hack-enabled, reason: not valid java name */
    public static final PmsKey f154videomsgdownloadurlshackenabled = new PmsKey("video-msg-download-urls-hack-enabled", 156);

    /* renamed from: net-stat-config, reason: not valid java name */
    public static final PmsKey f108netstatconfig = new PmsKey("net-stat-config", 157);

    /* renamed from: streamable-mp4, reason: not valid java name */
    public static final PmsKey f141streamablemp4 = new PmsKey("streamable-mp4", 158);

    /* renamed from: informer-enabled, reason: not valid java name */
    public static final PmsKey f66informerenabled = new PmsKey("informer-enabled", 159);

    /* renamed from: camera-freeze-detector-timeout, reason: not valid java name */
    public static final PmsKey f24camerafreezedetectortimeout = new PmsKey("camera-freeze-detector-timeout", 160);

    /* renamed from: chat-media-scrollable-caption-enabled, reason: not valid java name */
    public static final PmsKey f30chatmediascrollablecaptionenabled = new PmsKey("chat-media-scrollable-caption-enabled", 161);

    /* renamed from: enable-unknown-contact-bottom-sheet, reason: not valid java name */
    public static final PmsKey f46enableunknowncontactbottomsheet = new PmsKey("enable-unknown-contact-bottom-sheet", 162);

    /* renamed from: inline-ev-player, reason: not valid java name */
    public static final PmsKey f67inlineevplayer = new PmsKey("inline-ev-player", 163);

    /* renamed from: channel-statistics-botid, reason: not valid java name */
    public static final PmsKey f25channelstatisticsbotid = new PmsKey("channel-statistics-botid", 164);

    /* renamed from: ringtone-player-focus, reason: not valid java name */
    public static final PmsKey f129ringtoneplayerfocus = new PmsKey("ringtone-player-focus", 165);

    /* renamed from: local-pip-broadcast, reason: not valid java name */
    public static final PmsKey f74localpipbroadcast = new PmsKey("local-pip-broadcast", 166);

    /* renamed from: hide-incoming-call-notif, reason: not valid java name */
    public static final PmsKey f60hideincomingcallnotif = new PmsKey("hide-incoming-call-notif", 167);

    /* renamed from: force-play-embed, reason: not valid java name */
    public static final PmsKey f55forceplayembed = new PmsKey("force-play-embed", 168);

    /* renamed from: new-logout-logic, reason: not valid java name */
    public static final PmsKey f109newlogoutlogic = new PmsKey("new-logout-logic", 169);

    /* renamed from: reactions-sync-time, reason: not valid java name */
    public static final PmsKey f127reactionssynctime = new PmsKey("reactions-sync-time", 170);

    /* renamed from: min-sound-hearable-level, reason: not valid java name */
    public static final PmsKey f99minsoundhearablelevel = new PmsKey("min-sound-hearable-level", 171);

    /* renamed from: suspend-video-converter, reason: not valid java name */
    public static final PmsKey f145suspendvideoconverter = new PmsKey("suspend-video-converter", 172);

    /* renamed from: push-delivery, reason: not valid java name */
    public static final PmsKey f123pushdelivery = new PmsKey("push-delivery", 173);

    /* renamed from: net-new-client-enabled, reason: not valid java name */
    public static final PmsKey f107netnewclientenabled = new PmsKey("net-new-client-enabled", 174);

    /* renamed from: official-org, reason: not valid java name */
    public static final PmsKey f117officialorg = new PmsKey("official-org", 175);

    /* renamed from: video-content-cache-ttl, reason: not valid java name */
    public static final PmsKey f151videocontentcachettl = new PmsKey("video-content-cache-ttl", 176);

    /* renamed from: chatlist-subtitle-ver, reason: not valid java name */
    public static final PmsKey f32chatlistsubtitlever = new PmsKey("chatlist-subtitle-ver", 177);

    /* renamed from: new-year-theme-2026, reason: not valid java name */
    public static final PmsKey f112newyeartheme2026 = new PmsKey("new-year-theme-2026", 178);

    /* renamed from: white-list-links, reason: not valid java name */
    public static final PmsKey f161whitelistlinks = new PmsKey("white-list-links", 179);

    private static final /* synthetic */ PmsKey[] $values() {
        return new PmsKey[]{f137setunreadtimeout, proxy, f37debugmode, f98minloglevel, f148userdebugreport, f3androiduselogcatlogger, f122proxydomains, f64imagewidth, f61imageheight, f62imagequality, f63imagesize, f85maxmsglength, f86maxparticipants, f79maxaudiolength, f89maxthemelength, f80maxdescriptionlength, f45edittimeout, f33chatspagesize, f73keepconnection, f70invitelink, f72inviteshort, f71invitelong, f69inviteheader, f52fileuploadmaxsize, f53fileuploadunsupportedtypes, f34chatspreloadperiod, f82maxfavoritechats, f40disconnecttimeout, f78maxattachcount, f143supportaccount, f144supportemail, f156wakelockonpush, mentions_entity_names_limit, f87maxreadmarks, f90maxvideodurationdownload, f84maxfavoritestickers, f83maxfavoritestickersets, f100minstickersize, f88maxstickersize, f39defaultstickersize, f97minimagesidesize, f96mindurationsaveaudiostarttime, f150validintervalaudiostarttime, f95mindurationplaybackspeed, f42draftssyncenabled, f5audiotranscriptionlocales, f131scheduledmessagesenabled, f146tracernonfatalcrashedenabled, f142subscriptiontimeoutseconds, f41doubletapreaction, f126reactionsmax, f125reacterrors, f103msggetreactionspagesize, f166wmworkerslimit, f165wmcheckworkerscountintervalsec, f164wmbacklogworkercheckdelaysec, f163wmbacklogworkerbackoffdelaysec, f167wmworkersoffset, f162wmanalyticsenabled, f121progressdifffornotify, f168workerprogresstimedifffornotifyms, f81maxdownloadedsizefornotifykb, f51fbexecreplace, f50fbexecmodifiersnames, f76logfull, f77logsensitive, f4anrconfig, f38debugprofileinfo, f15callsendpoint, f48fakechats, f27channelsenabled, f6availablecomplaints, f65inappreviewtriggers, f49fakeinappreview, f68invitefriendssheetfrequency, f160welcomestickerids, f102moneytransferbotid, f115noncontactsynctime, f114noncontactmaxchunksize, f113noncontactcollectioninterval, f44editchattypescreenenabled, gce, grse, gcas, gcwre, gcmpe, f58groupcallchatsupport, f59groupcallpartlimit, f56gcfromp2p, f57gclinkpresettings, f12callincomingab, f10callcustomringtone, f1accountnicknameenabled, f134sendlocationenabled, f128reconnectcallringtone, f94mediaviewerrotationenabled, f111newuploaderenabled, f104mytrackerenabled, f31chatvideoautoplayparallelcount, f8botcomplaintenabled, f18callssdkdisableinittflite, f21callssdkremovenonopusaudiocodecs, f17callssdkamspeakerfix, f11calliconsreorder, f152videogroupcall, f16callsloadkwsbysdkenabled, f23callssdkwtenabled, f20callssdkmajb, f22callssdkwebrtclogs, f19callssdkenablenohost, f13callpermissionsinterval, cfs, f0abstatus, f35conntimeouts, f93mediatransform, f14callrate, f135sendqueuesize, f157webappdskeyscount, f158webappsskeyscount, f29chatinvitelinkpermissionsenabled, f43editchanneltypescreenenabled, f28chatanim, f130savedmessagesaliases, f153videomsgconfig, f140statsessionbackgroundthreshold, f9botstartparam, f47esiaenabled, f91mediaorder, f7badnetworindicatorconfig, f110newsessionlogic, f2analyticsenabled, f105mytrackerloglevel, f133searchwebappsshowcase, f120playerloadcontrol, f138settingsentrybanners, f54foldersmaxcount, f106netclientdnsenabled, f36creation2faconfig, f118onevideoplayer, f119onevideouploader, f169ymap, f155viewscountenabled, f116officialbotnamingenabled, f159webviewcacheenabled, f124quotesenabled, f132searchloaderv2enabled, f147uploadreusability, devnull, f136serversidecomplainsenabled, f26channelscomplaintenabled, landscape, f75locationmapwidgetenabled, f149utmtagfortriggerlinkshare, f92mediaplaylistenabled, f101miuimenuenabled, f139showwarninglinks, f154videomsgdownloadurlshackenabled, f108netstatconfig, f141streamablemp4, f66informerenabled, f24camerafreezedetectortimeout, f30chatmediascrollablecaptionenabled, f46enableunknowncontactbottomsheet, f67inlineevplayer, f25channelstatisticsbotid, f129ringtoneplayerfocus, f74localpipbroadcast, f60hideincomingcallnotif, f55forceplayembed, f109newlogoutlogic, f127reactionssynctime, f99minsoundhearablelevel, f145suspendvideoconverter, f123pushdelivery, f107netnewclientenabled, f117officialorg, f151videocontentcachettl, f32chatlistsubtitlever, f112newyeartheme2026, f161whitelistlinks};
    }

    static {
        PmsKey[] pmsKeyArr$values = $values();
        $VALUES = pmsKeyArr$values;
        $ENTRIES = new zg5(pmsKeyArr$values);
        Companion = new k5c();
        keys$delegate = new bwf(new zfb(21));
    }

    private PmsKey(String str, int i) {
    }

    public static yg5 getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map keys_delegate$lambda$1() {
        yg5 entries = getEntries();
        int i = to8.i(we3.q(entries, 10));
        if (i < 16) {
            i = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        for (Object obj : entries) {
            linkedHashMap.put(((PmsKey) obj).name(), obj);
        }
        return linkedHashMap;
    }

    public static PmsKey valueOf(String str) {
        return (PmsKey) Enum.valueOf(PmsKey.class, str);
    }

    public static PmsKey[] values() {
        return (PmsKey[]) $VALUES.clone();
    }

    public final String fullContentString$prefs_release() {
        return ho7.i("\"", name(), "\"");
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }
}

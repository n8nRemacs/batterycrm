package ru.ok.android.externcalls.sdk;

import defpackage.aa9;
import defpackage.em6;
import defpackage.h32;
import defpackage.hu3;
import defpackage.i01;
import defpackage.k01;
import defpackage.k50;
import defpackage.l07;
import defpackage.m07;
import defpackage.mze;
import defpackage.qqg;
import defpackage.sze;
import defpackage.u08;
import defpackage.wi1;
import defpackage.xh;
import defpackage.yg5;
import defpackage.zg5;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.audio.KeywordSpotterManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionManager;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;

@Metadata(d1 = {"\u0000¼\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0006\u0096\u0002\u0097\u0002\u0098\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0015\u0010\u0016JA\u0010\u001d\u001a\u00020\u00042\n\u0010\n\u001a\u00060\u0017j\u0002`\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001d\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00022\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bH'¢\u0006\u0004\b\u001d\u0010\u001fJc\u0010&\u001a\u00020\u00042\u0010\u0010!\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u00180 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\"2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"H'¢\u0006\u0004\b&\u0010'J-\u0010*\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\t2\u0006\u0010$\u001a\u00020)2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020%0\u001bH&¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\u00042\n\u0010,\u001a\u00060\u0017j\u0002`\u0018H&¢\u0006\u0004\b-\u0010.J#\u0010-\u001a\u00020\u00042\n\u0010,\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010/\u001a\u00020\u0002H&¢\u0006\u0004\b-\u00100J!\u00103\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u00102\u001a\u000201H&¢\u0006\u0004\b3\u00104J#\u00107\u001a\u00020\u00042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t05H&¢\u0006\u0004\b7\u00108J-\u00107\u001a\u00020\u00042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t052\b\u0010:\u001a\u0004\u0018\u000109H&¢\u0006\u0004\b7\u0010;J\u0017\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<H&¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0004H&¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\bC\u0010DJ#\u0010F\u001a\u00020\u00042\n\u0010,\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010E\u001a\u00020\u0002H&¢\u0006\u0004\bF\u00100J7\u0010K\u001a\u00020\u00042\n\u0010\n\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010G\u001a\u00020\u00022\u0012\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u00020I0H\"\u00020IH&¢\u0006\u0004\bK\u0010LJ#\u0010N\u001a\u00020\u00042\n\u0010\n\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010M\u001a\u00020\u0002H&¢\u0006\u0004\bN\u00100J#\u0010P\u001a\u00020\u00042\n\u0010\n\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010O\u001a\u00020\u0002H&¢\u0006\u0004\bP\u00100J\u000f\u0010Q\u001a\u00020\u0004H&¢\u0006\u0004\bQ\u0010AJ\u000f\u0010R\u001a\u00020\u0004H&¢\u0006\u0004\bR\u0010AJ/\u0010W\u001a\u00020\u00042\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u00022\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bH&¢\u0006\u0004\bW\u0010XJ)\u0010Z\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00022\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bH&¢\u0006\u0004\bZ\u0010[J)\u0010\\\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u00022\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bH&¢\u0006\u0004\b\\\u0010[J)\u0010]\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u00022\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bH&¢\u0006\u0004\b]\u0010[J\u0017\u0010_\u001a\u00020\u00042\u0006\u0010:\u001a\u00020^H&¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020\u00042\u0006\u0010:\u001a\u00020^H&¢\u0006\u0004\ba\u0010`J+\u0010g\u001a\u00020\u00042\b\u0010c\u001a\u0004\u0018\u00010b2\b\u0010d\u001a\u0004\u0018\u00010b2\u0006\u0010f\u001a\u00020eH&¢\u0006\u0004\bg\u0010hJ+\u0010i\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020%0\u001bH&¢\u0006\u0004\bi\u0010jJ%\u0010k\u001a\u00020\u00042\u0006\u0010$\u001a\u00020)2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020%0\u001bH&¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u0004H&¢\u0006\u0004\bm\u0010AR\u001a\u0010r\u001a\u00020n8&X§\u0004¢\u0006\f\u0012\u0004\bq\u0010A\u001a\u0004\bo\u0010pR\u001a\u0010s\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\bt\u0010A\u001a\u0004\bs\u0010\bR\u001c\u0010y\u001a\u0004\u0018\u00010u8&X§\u0004¢\u0006\f\u0012\u0004\bx\u0010A\u001a\u0004\bv\u0010wR\u0014\u0010}\u001a\u00020z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u001a\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030ª\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010±\u0001\u001a\u00030®\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010µ\u0001\u001a\u00030²\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u0018\u0010¹\u0001\u001a\u00030¶\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0018\u0010½\u0001\u001a\u00030º\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u0018\u0010Á\u0001\u001a\u00030¾\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0018\u0010Å\u0001\u001a\u00030Â\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010É\u0001\u001a\u00030Æ\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0018\u0010Í\u0001\u001a\u00030Ê\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0018\u0010Ñ\u0001\u001a\u00030Î\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010Õ\u0001\u001a\u00030Ò\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0018\u0010Ù\u0001\u001a\u00030Ö\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0018\u0010Ý\u0001\u001a\u00030Ú\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Ü\u0001R\u0016\u0010Þ\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÞ\u0001\u0010\bR\u0016\u0010ß\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bß\u0001\u0010\bR\u0016\u0010à\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bà\u0001\u0010\bR\u0016\u0010á\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bá\u0001\u0010\bR\u0016\u0010â\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010\bR\u0017\u0010å\u0001\u001a\u00020\t8&X¦\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001R\u0016\u0010æ\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010\bR\u0016\u0010ç\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bç\u0001\u0010\bR\u0016\u0010è\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bè\u0001\u0010\bR\u0016\u0010é\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bé\u0001\u0010\bR\u0016\u0010ê\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bê\u0001\u0010\bR\u0017\u0010O\u001a\u00030ë\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bì\u0001\u0010í\u0001R\u0016\u0010î\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bî\u0001\u0010\bR\u0018\u0010ò\u0001\u001a\u00030ï\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bð\u0001\u0010ñ\u0001R\u001a\u0010ö\u0001\u001a\u0005\u0018\u00010ó\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010õ\u0001R\u0019\u0010ø\u0001\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\b\u001a\u0006\b÷\u0001\u0010ä\u0001R\u0019\u0010û\u0001\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\b\u001a\u0006\bù\u0001\u0010ú\u0001R\u0018\u0010ÿ\u0001\u001a\u00030ü\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bý\u0001\u0010þ\u0001R\u0019\u0010\u0081\u0002\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010ä\u0001R\u0016\u0010\u0082\u0002\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0002\u0010\bR\u001e\u0010\u0083\u0002\u001a\u00020\u00028&@&X¦\u000e¢\u0006\r\u001a\u0005\b\u0083\u0002\u0010\b\"\u0004\b\\\u0010\u0006R\u001e\u0010\u0084\u0002\u001a\u00020\u00028&@&X¦\u000e¢\u0006\r\u001a\u0005\b\u0084\u0002\u0010\b\"\u0004\bZ\u0010\u0006R\u001e\u0010\u0085\u0002\u001a\u00020\u00028&@&X¦\u000e¢\u0006\r\u001a\u0005\b\u0085\u0002\u0010\b\"\u0004\b]\u0010\u0006R\u0016\u0010\u0086\u0002\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0002\u0010\bR\u0017\u0010\u0088\u0002\u001a\u00020\u000f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010ú\u0001R\u0016\u0010\u0089\u0002\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0002\u0010\bR\u0016\u0010\u008a\u0002\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0002\u0010\bR\u0016\u0010\u008b\u0002\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0002\u0010\bR\u0017\u0010\u008e\u0002\u001a\u00020b8&X¦\u0004¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0016\u0010\u008f\u0002\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0002\u0010\bR\u0019\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010ú\u0001R\u0018\u0010\u0095\u0002\u001a\u00030\u0092\u00028&X¦\u0004¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0099\u0002À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/Conversation;", "", "", "enabled", "Lqqg;", "setAudioCaptureEnabled", "(Z)V", "hasRegisteredParticipnats", "()Z", "", "externalId", "isParticipantCreator", "(Ljava/lang/String;)Z", "isParticipantAdmin", "isParticipantCreatorOrAdmin", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "Laa9;", "getParticipantMediaStat", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Laa9;", "", "getAdjustedAudioLevel", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)F", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "unban", "isShowChatHistory", "Lhu3;", "onError", "addParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/Boolean;ZLhu3;)V", "(Ljava/lang/String;ZLhu3;)V", "", "participantIds", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsResult;", "onSuccess", "", "addParticipants", "(Ljava/util/Collection;Ljava/lang/Boolean;ZLem6;Lem6;)V", "link", "Ljava/lang/Runnable;", "addParticipantByLink", "(Ljava/lang/String;Ljava/lang/Runnable;Lhu3;)V", "participantExternalId", "removeParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "ban", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Z)V", "Lorg/json/JSONObject;", "data", "sendData", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Lorg/json/JSONObject;)V", "", "newState", "changeMyState", "(Ljava/util/Map;)V", "Lmze;", "listener", "(Ljava/util/Map;Lmze;)V", "Ll07;", "parameters", "hangup", "(Ll07;)V", "muteAll", "()V", "Lk50;", "getAudioLevel", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lk50;", "promote", "promoteParticipant", "revoke", "", "Lwi1;", "roles", "grantRoles", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Z[Lwi1;)V", "pin", "pinParticipant", "state", "setMuteState", "init", "connect", "Li01;", "option", "isEnabled", "onAnswer", "setCallOptionEnabled", "(Li01;ZLhu3;)V", "forbidden", "setAnonJoinForbidden", "(ZLhu3;)V", "setWaitingRoomEnabled", "setFeedbackEnabled", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "addEventsListener", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)V", "removeEventsListener", "", "offset", "count", "Lru/ok/android/externcalls/sdk/Conversation$ChatHistoryCallback;", "onResponse", "queryChatHistory", "(Ljava/lang/Integer;Ljava/lang/Integer;Lru/ok/android/externcalls/sdk/Conversation$ChatHistoryCallback;)V", ApiProtocol.PARAM_CREATE_JOIN_LINK, "(Lhu3;Lhu3;)V", "removeJoinLink", "(Ljava/lang/Runnable;Lhu3;)V", "release", "Lru/ok/android/externcalls/sdk/dev/DebugManager;", "getDebugManager", "()Lru/ok/android/externcalls/sdk/dev/DebugManager;", "getDebugManager$annotations", "debugManager", "isConditionAccepted", "isConditionAccepted$annotations", "Lm07;", "getRejectReason", "()Lm07;", "getRejectReason$annotations", "rejectReason", "Lru/ok/android/externcalls/sdk/asr/AsrManager;", "getAsrManager", "()Lru/ok/android/externcalls/sdk/asr/AsrManager;", "asrManager", "Lru/ok/android/externcalls/sdk/chat/ChatManager;", "getChatManager", "()Lru/ok/android/externcalls/sdk/chat/ChatManager;", "chatManager", "Lru/ok/android/externcalls/sdk/record/RecordManager;", "getRecordManager", "()Lru/ok/android/externcalls/sdk/record/RecordManager;", "recordManager", "Lxh;", "getAnimojiControl", "()Lxh;", "animojiControl", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager;", "getFeatureManager", "()Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager;", "featureManager", "Lru/ok/android/externcalls/sdk/feedback/FeedbackManager;", "getFeedbackManager", "()Lru/ok/android/externcalls/sdk/feedback/FeedbackManager;", "feedbackManager", "Lru/ok/android/externcalls/sdk/media/mute/MediaMuteManager;", "getMediaMuteManager", "()Lru/ok/android/externcalls/sdk/media/mute/MediaMuteManager;", "mediaMuteManager", "Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineManager;", "getAsrOnlineManager", "()Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineManager;", "asrOnlineManager", "Lru/ok/android/externcalls/sdk/stereo/StereoRoomManager;", "getStereoRoomManager", "()Lru/ok/android/externcalls/sdk/stereo/StereoRoomManager;", "stereoRoomManager", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingManager;", "getUrlSharingManager", "()Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingManager;", "urlSharingManager", "Lru/ok/android/externcalls/sdk/contacts/ContactCallManager;", "getContactCallManager", "()Lru/ok/android/externcalls/sdk/contacts/ContactCallManager;", "contactCallManager", "Lh32;", "getCameraStatProvider", "()Lh32;", "cameraStatProvider", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager;", "getSessionRoomManager", "()Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager;", "sessionRoomManager", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender;", "getDisplayLayoutSender", "()Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender;", "displayLayoutSender", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "getWatchTogetherPlayer", "()Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "watchTogetherPlayer", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;", "getParticipantStatesManager", "()Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;", "participantStatesManager", "Lru/ok/android/externcalls/sdk/audio/MicrophoneManager;", "getMicrophoneManager", "()Lru/ok/android/externcalls/sdk/audio/MicrophoneManager;", "microphoneManager", "Lru/ok/android/externcalls/sdk/video/CameraManager;", "getCameraManager", "()Lru/ok/android/externcalls/sdk/video/CameraManager;", "cameraManager", "Lru/ok/android/externcalls/sdk/video/VideoRenderManager;", "getVideoRenderManager", "()Lru/ok/android/externcalls/sdk/video/VideoRenderManager;", "videoRenderManager", "Lru/ok/android/externcalls/sdk/video/ScreenCaptureManager;", "getScreenCaptureManager", "()Lru/ok/android/externcalls/sdk/video/ScreenCaptureManager;", "screenCaptureManager", "Lru/ok/android/externcalls/sdk/net/NetworkConnectionManager;", "getNetworkConnectionManager", "()Lru/ok/android/externcalls/sdk/net/NetworkConnectionManager;", "networkConnectionManager", "Lru/ok/android/externcalls/sdk/audio/NoiseSuppressionManager;", "getNoiseSuppressionManager", "()Lru/ok/android/externcalls/sdk/audio/NoiseSuppressionManager;", "noiseSuppressionManager", "Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager;", "getKeywordSpotterManager", "()Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager;", "keywordSpotterManager", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionManager;", "getMediaConnectionManager", "()Lru/ok/android/externcalls/sdk/connection/MediaConnectionManager;", "mediaConnectionManager", "Lru/ok/android/externcalls/sdk/rate/RateManager;", "getRateManager", "()Lru/ok/android/externcalls/sdk/rate/RateManager;", "rateManager", "isPermissionsGranted", "isVideoPermissionGranted", "isPrepared", "isInited", "isAudioMixEnabled", "getConversationId", "()Ljava/lang/String;", ApiProtocol.PARAM_CONVERSATION_ID, "isConcurrent", "isRecurring", "isConnected", "isAnswered", "isDestroyed", "Lru/ok/android/externcalls/sdk/Conversation$State;", "getState", "()Lru/ok/android/externcalls/sdk/Conversation$State;", "isGroupCall", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "getCallType", "()Lru/ok/android/externcalls/sdk/Conversation$CallType;", "callType", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "getCallInfo", "()Lru/ok/android/externcalls/sdk/api/CallInfo;", "callInfo", "getJoinLink", ApiProtocol.PARAM_JOIN_LINK, "getOpponent", "()Lru/ok/android/externcalls/sdk/ConversationParticipant;", "opponent", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantCollection;", "getParticipants", "()Lru/ok/android/externcalls/sdk/participant/collection/ParticipantCollection;", "participants", "getDestroyReason", "destroyReason", "isMuteParticipantsPermitted", "isWaitingRoomEnabled", "isAnonJoinForbidden", "isFeedbackEnabled", "isFeatureAddParticipantEnabled", "getMe", "me", "isMeCreatorOrAdmin", "isMeInWaitingRoom", "isCaller", "getAudioLevelFrequencyMs", "()I", "audioLevelFrequencyMs", "isInitialVideoEnabled", "getPinnedParticipant", "pinnedParticipant", "Lk01;", "getUnderlyingCall", "()Lk01;", "underlyingCall", "CallType", "ChatHistoryCallback", "State", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Conversation {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/Conversation$CallType;", "", "(Ljava/lang/String;I)V", "Incoming", "Outgoing", "Join", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallType {
        private static final /* synthetic */ yg5 $ENTRIES;
        private static final /* synthetic */ CallType[] $VALUES;
        public static final CallType Incoming = new CallType("Incoming", 0);
        public static final CallType Outgoing = new CallType("Outgoing", 1);
        public static final CallType Join = new CallType("Join", 2);

        private static final /* synthetic */ CallType[] $values() {
            return new CallType[]{Incoming, Outgoing, Join};
        }

        static {
            CallType[] callTypeArr$values = $values();
            $VALUES = callTypeArr$values;
            $ENTRIES = new zg5(callTypeArr$values);
        }

        private CallType(String str, int i) {
        }

        public static yg5 getEntries() {
            return $ENTRIES;
        }

        public static CallType valueOf(String str) {
            return (CallType) Enum.valueOf(CallType.class, str);
        }

        public static CallType[] values() {
            return (CallType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/Conversation$ChatHistoryCallback;", "", "", "Lsze;", "data", "Lqqg;", "onResponse", "([Lsze;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ChatHistoryCallback {
        void onResponse(sze[] data);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/Conversation$State;", "", "order", "", "(Ljava/lang/String;II)V", "getOrder", "()I", "None", "Preparing", "Starting", "Connecting", "Connected", "Finished", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ yg5 $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        private final int order;
        public static final State None = new State("None", 0, 0);
        public static final State Preparing = new State("Preparing", 1, 1);
        public static final State Starting = new State("Starting", 2, 2);
        public static final State Connecting = new State("Connecting", 3, 3);
        public static final State Connected = new State("Connected", 4, 4);
        public static final State Finished = new State("Finished", 5, 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{None, Preparing, Starting, Connecting, Connected, Finished};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = new zg5(stateArr$values);
        }

        private State(String str, int i, int i2) {
            this.order = i2;
        }

        public static yg5 getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final int getOrder() {
            return this.order;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsResult;", "it", "Lqqg;", "invoke", "(Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.Conversation$addParticipants$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements em6 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(AddParticipantsResult addParticipantsResult) {
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AddParticipantsResult) obj);
            return qqg.a;
        }
    }

    static /* synthetic */ void addParticipant$default(Conversation conversation, ParticipantId participantId, Boolean bool, boolean z, hu3 hu3Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addParticipant");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            hu3Var = null;
        }
        conversation.addParticipant(participantId, bool, z, hu3Var);
    }

    static /* synthetic */ void addParticipants$default(Conversation conversation, Collection collection, Boolean bool, boolean z, em6 em6Var, em6 em6Var2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addParticipants");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            em6Var = AnonymousClass1.INSTANCE;
        }
        em6 em6Var3 = em6Var;
        if ((i & 16) != 0) {
            em6Var2 = null;
        }
        conversation.addParticipants(collection, bool, z2, em6Var3, em6Var2);
    }

    static /* synthetic */ void getDebugManager$annotations() {
    }

    static /* synthetic */ void getRejectReason$annotations() {
    }

    static /* synthetic */ void isConditionAccepted$annotations() {
    }

    static /* synthetic */ void setAnonJoinForbidden$default(Conversation conversation, boolean z, hu3 hu3Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnonJoinForbidden");
        }
        if ((i & 2) != 0) {
            hu3Var = null;
        }
        conversation.setAnonJoinForbidden(z, hu3Var);
    }

    static /* synthetic */ void setFeedbackEnabled$default(Conversation conversation, boolean z, hu3 hu3Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFeedbackEnabled");
        }
        if ((i & 2) != 0) {
            hu3Var = null;
        }
        conversation.setFeedbackEnabled(z, hu3Var);
    }

    static /* synthetic */ void setWaitingRoomEnabled$default(Conversation conversation, boolean z, hu3 hu3Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWaitingRoomEnabled");
        }
        if ((i & 2) != 0) {
            hu3Var = null;
        }
        conversation.setWaitingRoomEnabled(z, hu3Var);
    }

    void addEventsListener(ConversationEventsListener listener);

    void addParticipant(String externalId, boolean unban, hu3 onError);

    void addParticipant(ParticipantId externalId, Boolean unban, boolean isShowChatHistory, hu3 onError);

    void addParticipantByLink(String link, Runnable onSuccess, hu3 onError);

    void addParticipants(Collection<ParticipantId> participantIds, Boolean unban, boolean isShowChatHistory, em6 onSuccess, em6 onError);

    void changeMyState(Map<String, String> newState);

    void changeMyState(Map<String, String> newState, mze listener);

    void connect();

    void createJoinLink(hu3 onSuccess, hu3 onError);

    float getAdjustedAudioLevel(ConversationParticipant participant);

    xh getAnimojiControl();

    AsrManager getAsrManager();

    AsrOnlineManager getAsrOnlineManager();

    k50 getAudioLevel(ConversationParticipant participant);

    int getAudioLevelFrequencyMs();

    CallInfo getCallInfo();

    CallType getCallType();

    CameraManager getCameraManager();

    h32 getCameraStatProvider();

    ChatManager getChatManager();

    ContactCallManager getContactCallManager();

    String getConversationId();

    DebugManager getDebugManager();

    String getDestroyReason();

    DisplayLayoutSender getDisplayLayoutSender();

    ConversationFeatureManager getFeatureManager();

    FeedbackManager getFeedbackManager();

    String getJoinLink();

    KeywordSpotterManager getKeywordSpotterManager();

    ConversationParticipant getMe();

    MediaConnectionManager getMediaConnectionManager();

    MediaMuteManager getMediaMuteManager();

    MicrophoneManager getMicrophoneManager();

    NetworkConnectionManager getNetworkConnectionManager();

    NoiseSuppressionManager getNoiseSuppressionManager();

    ConversationParticipant getOpponent();

    aa9 getParticipantMediaStat(ConversationParticipant participant);

    ParticipantStatesManager getParticipantStatesManager();

    ParticipantCollection getParticipants();

    ConversationParticipant getPinnedParticipant();

    RateManager getRateManager();

    RecordManager getRecordManager();

    m07 getRejectReason();

    ScreenCaptureManager getScreenCaptureManager();

    SessionRoomsManager getSessionRoomManager();

    State getState();

    StereoRoomManager getStereoRoomManager();

    k01 getUnderlyingCall();

    UrlSharingManager getUrlSharingManager();

    VideoRenderManager getVideoRenderManager();

    WatchTogetherPlayer getWatchTogetherPlayer();

    void grantRoles(ParticipantId externalId, boolean revoke, wi1... roles);

    void hangup(l07 parameters);

    boolean hasRegisteredParticipnats();

    void init();

    boolean isAnonJoinForbidden();

    boolean isAnswered();

    boolean isAudioMixEnabled();

    boolean isCaller();

    boolean isConcurrent();

    boolean isConditionAccepted();

    boolean isConnected();

    boolean isDestroyed();

    boolean isFeatureAddParticipantEnabled();

    boolean isFeedbackEnabled();

    boolean isGroupCall();

    boolean isInited();

    boolean isInitialVideoEnabled();

    boolean isMeCreatorOrAdmin();

    boolean isMeInWaitingRoom();

    boolean isMuteParticipantsPermitted();

    boolean isParticipantAdmin(String externalId);

    boolean isParticipantCreator(String externalId);

    boolean isParticipantCreatorOrAdmin(String externalId);

    boolean isPermissionsGranted();

    boolean isPrepared();

    boolean isRecurring();

    boolean isVideoPermissionGranted();

    boolean isWaitingRoomEnabled();

    void muteAll();

    void pinParticipant(ParticipantId externalId, boolean pin);

    void promoteParticipant(ParticipantId participantExternalId, boolean promote);

    void queryChatHistory(Integer offset, Integer count, ChatHistoryCallback onResponse);

    void release();

    void removeEventsListener(ConversationEventsListener listener);

    void removeJoinLink(Runnable onSuccess, hu3 onError);

    void removeParticipant(ParticipantId participantExternalId);

    void removeParticipant(ParticipantId participantExternalId, boolean ban);

    void sendData(ConversationParticipant participant, JSONObject data);

    void setAnonJoinForbidden(boolean z);

    void setAnonJoinForbidden(boolean forbidden, hu3 onAnswer);

    void setAudioCaptureEnabled(boolean enabled);

    void setCallOptionEnabled(i01 option, boolean isEnabled, hu3 onAnswer);

    void setFeedbackEnabled(boolean z);

    void setFeedbackEnabled(boolean isEnabled, hu3 onAnswer);

    void setMuteState(ParticipantId externalId, boolean state);

    void setWaitingRoomEnabled(boolean z);

    void setWaitingRoomEnabled(boolean isEnabled, hu3 onAnswer);
}

package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import defpackage.cm6;
import defpackage.em6;
import defpackage.ev1;
import defpackage.fni;
import defpackage.fv1;
import defpackage.hn6;
import defpackage.ho7;
import defpackage.imb;
import defpackage.qqg;
import defpackage.tk4;
import defpackage.to8;
import defpackage.u08;
import defpackage.ue3;
import defpackage.ui;
import defpackage.we3;
import defpackage.wy1;
import defpackage.xc0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;
import ru.ok.android.externcalls.sdk.audio.internal.DeviceSwitchHelper;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;

@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 Ü\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Ü\u0001BQ\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u001a2\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0018\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u001a2\u0010\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0018\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0019\u0010 \u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b \u0010!J=\u0010)\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a\u0018\u00010&H\u0016¢\u0006\u0004\b)\u0010*J7\u0010,\u001a\u00020\u001a2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0&2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a0&H\u0016¢\u0006\u0004\b,\u0010-J7\u0010.\u001a\u00020\u001a2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0&2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a0&H\u0016¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u001aH\u0016¢\u0006\u0004\b/\u00100J5\u00101\u001a\u00020\u001a2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a\u0018\u00010&H\u0016¢\u0006\u0004\b1\u00102J=\u00105\u001a\u00020\u001a2\u0006\u00104\u001a\u0002032\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a\u0018\u00010&H\u0016¢\u0006\u0004\b5\u00106J=\u00108\u001a\u00020\u001a2\u0006\u00104\u001a\u0002072\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a\u0018\u00010&H\u0016¢\u0006\u0004\b8\u00109J\u0019\u0010<\u001a\u00020\u001a2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020>H\u0016¢\u0006\u0004\bA\u0010@JE\u0010D\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a\u0018\u00010&H\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u001aH\u0016¢\u0006\u0004\bF\u00100J\u0019\u0010H\u001a\u00020\b2\b\b\u0002\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u001aH\u0002¢\u0006\u0004\bJ\u00100J\u000f\u0010K\u001a\u00020\u001aH\u0002¢\u0006\u0004\bK\u00100J\u0017\u0010L\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\bN\u0010MJ\u001f\u0010O\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\bH\u0003¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u001aH\u0003¢\u0006\u0004\bQ\u00100J\u001f\u0010T\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u0002032\u0006\u0010S\u001a\u00020RH\u0003¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u000203H\u0003¢\u0006\u0004\bV\u0010WJ\u0019\u0010X\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u001aH\u0003¢\u0006\u0004\bZ\u00100J\u000f\u0010[\u001a\u00020\u001aH\u0003¢\u0006\u0004\b[\u00100J\u000f\u0010\\\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\\\u00100J\u000f\u0010]\u001a\u00020\u001aH\u0003¢\u0006\u0004\b]\u00100J\u000f\u0010^\u001a\u00020\u001aH\u0003¢\u0006\u0004\b^\u00100J\u000f\u0010_\u001a\u00020\u001aH\u0003¢\u0006\u0004\b_\u00100J\u000f\u0010`\u001a\u00020\u001aH\u0003¢\u0006\u0004\b`\u00100J\u000f\u0010a\u001a\u00020RH\u0002¢\u0006\u0004\ba\u0010bJ\u0019\u0010d\u001a\u00020R2\b\u0010c\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u0004\u0018\u0001032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\bf\u0010gJ\u0019\u0010h\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\bh\u0010!J\u0017\u0010j\u001a\u00020\u001a2\u0006\u0010i\u001a\u000203H\u0002¢\u0006\u0004\bj\u0010WJ\u0017\u0010k\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u000203H\u0003¢\u0006\u0004\bk\u0010WJ\u001d\u0010n\u001a\u00020\u001a2\f\u0010m\u001a\b\u0012\u0004\u0012\u0002030lH\u0003¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\u001aH\u0002¢\u0006\u0004\bp\u00100J\u000f\u0010q\u001a\u00020\u001aH\u0002¢\u0006\u0004\bq\u00100J\u000f\u0010r\u001a\u00020\u001aH\u0003¢\u0006\u0004\br\u00100J\u0017\u0010u\u001a\u00020\u001a2\u0006\u0010t\u001a\u00020sH\u0003¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u001aH\u0003¢\u0006\u0004\bw\u00100J\u000f\u0010x\u001a\u00020\u001aH\u0003¢\u0006\u0004\bx\u00100J\u000f\u0010y\u001a\u00020\u001aH\u0003¢\u0006\u0004\by\u00100J\u000f\u0010z\u001a\u00020\u001aH\u0002¢\u0006\u0004\bz\u00100J\u000f\u0010{\u001a\u00020\u001aH\u0003¢\u0006\u0004\b{\u00100JO\u0010~\u001a\u00020\u001a2\u0006\u0010|\u001a\u00020R2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001a0$2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010$2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a\u0018\u00010&H\u0002¢\u0006\u0004\b~\u0010\u007fJQ\u0010\u0080\u0001\u001a\u00020\u001a2\u0006\u0010|\u001a\u00020R2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001a0$2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010$2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a\u0018\u00010&H\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ\u001b\u0010\u0081\u0001\u001a\u00020\u001a2\b\u0010;\u001a\u0004\u0018\u00010:H\u0003¢\u0006\u0005\b\u0081\u0001\u0010=J\u0019\u0010\u0082\u0001\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020>H\u0003¢\u0006\u0005\b\u0082\u0001\u0010@J\u0019\u0010\u0083\u0001\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020>H\u0003¢\u0006\u0005\b\u0083\u0001\u0010@J\u0019\u0010\u0084\u0001\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u000203H\u0003¢\u0006\u0005\b\u0084\u0001\u0010WJ\u0019\u0010\u0085\u0001\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u000203H\u0003¢\u0006\u0005\b\u0085\u0001\u0010WJ\u0019\u0010\u0086\u0001\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u000203H\u0003¢\u0006\u0005\b\u0086\u0001\u0010WJ\u001b\u0010\u0088\u0001\u001a\u00020\u001a2\u0007\u0010\u0087\u0001\u001a\u00020\bH\u0003¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J(\u0010\u008c\u0001\u001a\u0002032\t\b\u0002\u0010\u008a\u0001\u001a\u00020\b2\t\b\u0002\u0010\u008b\u0001\u001a\u00020\bH\u0003¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0011\u0010\u008e\u0001\u001a\u00020\u001aH\u0003¢\u0006\u0005\b\u008e\u0001\u00100J\u0011\u0010\u008f\u0001\u001a\u00020\u001aH\u0003¢\u0006\u0005\b\u008f\u0001\u00100J)\u0010\u0091\u0001\u001a\u0011\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0090\u00012\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J%\u0010\u0093\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00180\u0090\u00010lH\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001d\u0010\u0096\u0001\u001a\u0004\u0018\u0001032\u0007\u0010\u0095\u0001\u001a\u000207H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0098\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0099\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u009a\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u009b\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u009c\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u009d\u0001R\u0015\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0099\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0099\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0099\u0001R\u0019\u0010 \u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0099\u0001R\u0018\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010§\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¦\u0001R\u0018\u0010©\u0001\u001a\u00030¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010«\u0001\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001e\u0010®\u0001\u001a\t\u0012\u0004\u0012\u0002030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R$\u0010±\u0001\u001a\u000f\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00180°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0019\u0010³\u0001\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0019\u0010µ\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0019\u0010·\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¶\u0001R\u0019\u0010¸\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u0099\u0001R\u0019\u0010¹\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010\u0099\u0001R\u0019\u0010º\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010\u0099\u0001R\u0019\u0010»\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010\u0099\u0001R\u0019\u0010¼\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010\u0099\u0001R\u001e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00020>0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001b\u0010À\u0001\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Ã\u0001\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010Å\u0001\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Ä\u0001R\u0018\u0010Æ\u0001\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ä\u0001R\u0018\u0010È\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0017\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010Ê\u0001R\u001e\u0010Ì\u0001\u001a\t\u0012\u0004\u0012\u0002030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u001d\u0010Ï\u0001\u001a\b\u0012\u0004\u0012\u0002030l8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010\u0094\u0001R\u0017\u0010Ò\u0001\u001a\u0002038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0017\u0010Ó\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0017\u0010Ö\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ô\u0001R\u0017\u0010Ø\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Ô\u0001R\u001d\u0010Û\u0001\u001a\u0004\u0018\u00010\u0018*\u0002038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001¨\u0006Ý\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl3/CallsAudioManagerV3Impl;", "Landroid/media/AudioDeviceCallback;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager;", "Landroid/media/AudioManager$OnCommunicationDeviceChangedListener;", "Landroid/content/Context;", "context", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "proximityTracker", "", "trackProximityWhenSpeakerEnabled", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "videoTracker", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "audioDeviceSelector", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;", "disabledAudioDeviceUsagePolicy", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "onMuteListener", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "awaitDeviceChangeConfirmation", "<init>", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/ProximityTracker;ZLru/ok/android/externcalls/sdk/audio/VideoTracker;Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;Lru/ok/android/externcalls/sdk/audio/Logger;Z)V", "", "Landroid/media/AudioDeviceInfo;", "addedDevices", "Lqqg;", "onAudioDevicesAdded", "([Landroid/media/AudioDeviceInfo;)V", "removedDevices", "onAudioDevicesRemoved", "device", "onCommunicationDeviceChanged", "(Landroid/media/AudioDeviceInfo;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "state", "Lkotlin/Function0;", "onComplete", "Lkotlin/Function1;", "", "onError", "changeStateAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;Lcm6;Lem6;)V", "onSuccess", "hasBluetoothHeadsetAsync", "(Lem6;Lem6;)V", "hasWiredHeadsetAsync", "notifyBluetoothPermissionGranted", "()V", "releaseAsync", "(Lcm6;Lem6;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "audioDevice", "setAudioDeviceAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;Lcm6;Lem6;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "setAudioDeviceTypeAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;Lcm6;Lem6;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "listener", "setOnAudioDeviceChangeListener", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceListChangeListener;", "addOnAudioDeviceListChangeListener", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceListChangeListener;)V", "removeOnAudioDeviceListChangeListener", "enabled", "byVideoTurnedOn", "setSpeakerEnabledAsync", "(ZZLcm6;Lem6;)V", "requestAudioFocusAsync", "byStopRinging", "updateAvailableDeviceList", "(Z)Z", "maybeSyncAudioDeviceList", "syncAudioDeviceList", "changeState", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;)V", "onCallStateChangedInternal", "setSpeakerEnabled", "(ZZ)V", "startTrackingAudioDevices", "", IceCandidatePairChangedStat.KEY_REASON, "selectAudioDevice", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;Ljava/lang/String;)V", "selectAudioDeviceImpl", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)V", "setCommunicationDevice", "(Landroid/media/AudioDeviceInfo;)Z", "cancelScheduledTrySetCommunicationDeviceAgain", "scheduleTryToSetCommunicationDeviceAgain", "trySetCommunicationDeviceAgain", "trySetCommunicationDeviceAgainUnsafe", "cancelScheduledSyncWithSystemCommunicationDevice", "scheduleSyncWithSystemCommunicationDevice", "syncWithSystemCommunicationDevice", "getAudioManagerStateDetails", "()Ljava/lang/String;", "info", "androidDeviceToString", "(Landroid/media/AudioDeviceInfo;)Ljava/lang/String;", "getDeviceForAndroidDevice", "(Landroid/media/AudioDeviceInfo;)Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "handleCurrentCommunicationDevice", "selectedDevice", "applyCurrentDevice", "reportCurrentCallsAudioDevice", "", "devices", "reportNewDeviceList", "(Ljava/util/List;)V", "start", "requestAudioFocus", "releaseAudioFocus", "", "mode", "setAudioManagerModeSafe", "(I)V", "release", "rememberUtilizedDeviceType", "maybeRecoverUtilizedDeviceType", "cancelUtilizedDeviceTypeRecovery", "recoverPreviouslyUtilizedDeviceType", "action", "block", "doOnOwnThread", "(Ljava/lang/String;Lcm6;Lcm6;Lem6;)V", "doOnOwnThreadUnsafe", "setOnAudioDeviceChangeListenerImpl", "addOnAudioDeviceListChangeListenerImpl", "removeOnAudioDeviceListChangeListenerImpl", "setAudioDevice", "reportAudioDeviceOnMainThread", "reportAudioDeviceOnMainThreadImpl", "speakerOn", "updateProximityTrackingState", "(Z)V", "bluetooth", "respectSpeakerEnabled", "getPreferredAudioDevice", "(ZZ)Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "savePreviousState", "restorePreviousAudioState", "Limb;", "mapAndroidDeviceToCallsDevice", "(Landroid/media/AudioDeviceInfo;)Limb;", "getAvailableDevices", "()Ljava/util/List;", "type", "firstOfType", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "Z", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "isDestroyed", "isStarted", "isInCall", "Landroid/os/HandlerThread;", "backgroundHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "workerThreadHandler", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "lastKnownAudioDeviceType", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "", "callsAudioDevices", "Ljava/util/List;", "", "audioDeviceByCallsDevice", "Ljava/util/Map;", "audioDeviceSyncCount", "I", "usedDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "reportedAudioDevice", "disabledBluetoothOnce", "disabledSpeakerOnce", "savedPreviousState", "savedIsSpeakerPhoneOn", "savedIsMicrophoneMute", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onAudioDeviceListChangeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onAudioDeviceChangeListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "Ljava/lang/Runnable;", "recoverDeviceByTypeRunnable", "Ljava/lang/Runnable;", "syncWithSystemCommunicationDeviceRunnable", "tryAgainRunnable", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "audioFocusRequestHelper", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "Lru/ok/android/externcalls/sdk/audio/internal/DeviceSwitchHelper;", "deviceSwitchHelper", "Lru/ok/android/externcalls/sdk/audio/internal/DeviceSwitchHelper;", "getAvailableAudioDevices", "availableAudioDevices", "getCurrentDevice", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "currentDevice", "isHeadsetConnected", "()Z", "getHasWiredHeadset", "hasWiredHeadset", "getHasEarpiece", "hasEarpiece", "getAudioDeviceInfo", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)Landroid/media/AudioDeviceInfo;", "audioDeviceInfo", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(31)
/* loaded from: classes2.dex */
public final class CallsAudioManagerV3Impl extends AudioDeviceCallback implements CallsAudioManager, AudioManager$OnCommunicationDeviceChangedListener {
    private static final int MESSAGE_REPORT_DEVICE = 311;

    @Deprecated
    public static final long ROLLBACK_TO_ACTUAL_DEVICE_TIMEOUT_MS = 2000;

    @Deprecated
    public static final String TAG = "CallsAudioManagerV3Impl";

    @Deprecated
    public static final long TRY_AGAIN_TIMEOUT_MS = 2000;

    @Deprecated
    public static final long USED_DEVICE_RECOVER_TIMEOUT_MS = 3000;
    private final Map<CallsAudioDeviceInfo, AudioDeviceInfo> audioDeviceByCallsDevice;
    private final AudioDeviceSelector audioDeviceSelector;
    private int audioDeviceSyncCount;
    private final AudioFocusRequestHelper audioFocusRequestHelper;
    private final AudioManager audioManager;
    private final boolean awaitDeviceChangeConfirmation;
    private final HandlerThread backgroundHandlerThread;
    private final List<CallsAudioDeviceInfo> callsAudioDevices;
    private final DeviceSwitchHelper<CallsAudioDeviceInfo> deviceSwitchHelper;
    private final CallsAudioManager.DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy;
    private boolean disabledBluetoothOnce;
    private boolean disabledSpeakerOnce;
    private boolean isDestroyed;
    private boolean isInCall;
    private boolean isStarted;
    private CallsAudioManager.AudioDeviceType lastKnownAudioDeviceType;
    private final Logger logger;
    private final Handler mainHandler;
    private volatile CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceChangeListener;
    private final CopyOnWriteArrayList<CallsAudioManager.OnAudioDeviceListChangeListener> onAudioDeviceListChangeListeners;
    private final ProximityTracker proximityTracker;
    private final Runnable recoverDeviceByTypeRunnable;
    private CallsAudioDeviceInfo reportedAudioDevice;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private boolean savedPreviousState;
    private CallsAudioManager.State state;
    private final Runnable syncWithSystemCommunicationDeviceRunnable;
    private final boolean trackProximityWhenSpeakerEnabled;
    private final Runnable tryAgainRunnable;
    private CallsAudioDeviceInfo usedDevice;
    private final VideoTracker videoTracker;
    private final Handler workerThreadHandler;
    private static final Companion Companion = new Companion(null);
    private static final CallsAudioDeviceInfo NO_DEVICE = new CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType.NONE, "");

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends hn6 implements cm6 {
        public AnonymousClass2(Object obj) {
            super(0, 0, CallsAudioManagerV3Impl.class, obj, "maybeRecoverUtilizedDeviceType", "maybeRecoverUtilizedDeviceType()V");
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m120invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m120invoke() {
            ((CallsAudioManagerV3Impl) this.receiver).maybeRecoverUtilizedDeviceType();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$3, reason: invalid class name */
    public /* synthetic */ class AnonymousClass3 extends hn6 implements cm6 {
        public AnonymousClass3(Object obj) {
            super(0, 0, CallsAudioManagerV3Impl.class, obj, "rememberUtilizedDeviceType", "rememberUtilizedDeviceType()V");
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m121invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m121invoke() {
            ((CallsAudioManagerV3Impl) this.receiver).rememberUtilizedDeviceType();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$4, reason: invalid class name */
    public static final class AnonymousClass4 extends u08 implements cm6 {
        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.cm6
        public final Boolean invoke() {
            return Boolean.valueOf(CallsAudioManagerV3Impl.this.isDestroyed);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl3/CallsAudioManagerV3Impl$Companion;", "", "()V", "MESSAGE_REPORT_DEVICE", "", "NO_DEVICE", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "getNO_DEVICE", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "ROLLBACK_TO_ACTUAL_DEVICE_TIMEOUT_MS", "", "TAG", "", "TRY_AGAIN_TIMEOUT_MS", "USED_DEVICE_RECOVER_TIMEOUT_MS", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        public final CallsAudioDeviceInfo getNO_DEVICE() {
            return CallsAudioManagerV3Impl.NO_DEVICE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallsAudioManager.State.values().length];
            try {
                iArr[CallsAudioManager.State.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallsAudioManager.State.RINGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallsAudioManager.State.DIALING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CallsAudioManager.State.CONVERSATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$addOnAudioDeviceListChangeListener$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00271 extends u08 implements cm6 {
        final /* synthetic */ CallsAudioManager.OnAudioDeviceListChangeListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00271(CallsAudioManager.OnAudioDeviceListChangeListener onAudioDeviceListChangeListener) {
            super(0);
            this.$listener = onAudioDeviceListChangeListener;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m122invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m122invoke() {
            CallsAudioManagerV3Impl.this.addOnAudioDeviceListChangeListenerImpl(this.$listener);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$changeStateAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00281 extends u08 implements cm6 {
        final /* synthetic */ CallsAudioManager.State $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00281(CallsAudioManager.State state) {
            super(0);
            this.$state = state;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() throws IOException {
            m123invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m123invoke() throws IOException {
            CallsAudioManagerV3Impl.this.changeState(this.$state);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/media/AudioDeviceInfo;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$getAudioManagerStateDetails$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00291 extends u08 implements em6 {
        public C00291() {
            super(1);
        }

        @Override // defpackage.em6
        public final CharSequence invoke(AudioDeviceInfo audioDeviceInfo) {
            return CallsAudioManagerV3Impl.this.androidDeviceToString(audioDeviceInfo);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$hasBluetoothHeadsetAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00301 extends u08 implements cm6 {
        final /* synthetic */ em6 $onSuccess;
        final /* synthetic */ CallsAudioManagerV3Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00301(em6 em6Var, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
            super(0);
            this.$onSuccess = em6Var;
            this.this$0 = callsAudioManagerV3Impl;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m124invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m124invoke() {
            Object next;
            em6 em6Var = this.$onSuccess;
            Iterator it = this.this$0.callsAudioDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((CallsAudioDeviceInfo) next).getDeviceType() == CallsAudioManager.AudioDeviceType.BLUETOOTH) {
                        break;
                    }
                }
            }
            em6Var.invoke(Boolean.valueOf(next != null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$hasWiredHeadsetAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00311 extends u08 implements cm6 {
        final /* synthetic */ em6 $onSuccess;
        final /* synthetic */ CallsAudioManagerV3Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00311(em6 em6Var, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
            super(0);
            this.$onSuccess = em6Var;
            this.this$0 = callsAudioManagerV3Impl;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m125invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m125invoke() {
            Object next;
            em6 em6Var = this.$onSuccess;
            Iterator it = this.this$0.callsAudioDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((CallsAudioDeviceInfo) next).getDeviceType() == CallsAudioManager.AudioDeviceType.WIRED_HEADSET) {
                        break;
                    }
                }
            }
            em6Var.invoke(Boolean.valueOf(next != null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$onCommunicationDeviceChanged$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00321 extends u08 implements cm6 {
        final /* synthetic */ AudioDeviceInfo $device;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00321(AudioDeviceInfo audioDeviceInfo) {
            super(0);
            this.$device = audioDeviceInfo;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() throws IOException {
            m126invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m126invoke() throws IOException {
            CallsAudioManagerV3Impl.this.cancelScheduledSyncWithSystemCommunicationDevice();
            CallsAudioDeviceInfo deviceForAndroidDevice = CallsAudioManagerV3Impl.this.getDeviceForAndroidDevice(this.$device);
            if (deviceForAndroidDevice != null) {
                CallsAudioManager.AudioDeviceType deviceType = deviceForAndroidDevice.getDeviceType();
                CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                if (deviceType != audioDeviceType && CallsAudioManagerV3Impl.this.usedDevice.getDeviceType() == audioDeviceType) {
                    Logger logger = CallsAudioManagerV3Impl.this.logger;
                    AudioDeviceInfo audioDeviceInfo = this.$device;
                    Integer numValueOf = audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getId()) : null;
                    AudioDeviceInfo audioDeviceInfo2 = this.$device;
                    Integer numValueOf2 = audioDeviceInfo2 != null ? Integer.valueOf(audioDeviceInfo2.getType()) : null;
                    AudioDeviceInfo audioDeviceInfo3 = this.$device;
                    logger.d(CallsAudioManagerV3Impl.TAG, "Unexpected device reported by system " + numValueOf + ":" + numValueOf2 + ":" + ((Object) (audioDeviceInfo3 != null ? audioDeviceInfo3.getProductName() : null)));
                    CallsAudioManagerV3Impl.this.scheduleSyncWithSystemCommunicationDevice();
                    return;
                }
            }
            CallsAudioManagerV3Impl.this.cancelScheduledTrySetCommunicationDeviceAgain();
            Logger logger2 = CallsAudioManagerV3Impl.this.logger;
            AudioDeviceInfo audioDeviceInfo4 = this.$device;
            Integer numValueOf3 = audioDeviceInfo4 != null ? Integer.valueOf(audioDeviceInfo4.getId()) : null;
            AudioDeviceInfo audioDeviceInfo5 = this.$device;
            Integer numValueOf4 = audioDeviceInfo5 != null ? Integer.valueOf(audioDeviceInfo5.getType()) : null;
            AudioDeviceInfo audioDeviceInfo6 = this.$device;
            logger2.d(CallsAudioManagerV3Impl.TAG, "Communication device did change to " + numValueOf3 + ":" + numValueOf4 + ":" + ((Object) (audioDeviceInfo6 != null ? audioDeviceInfo6.getProductName() : null)));
            CallsAudioManagerV3Impl.this.handleCurrentCommunicationDevice(this.$device);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$releaseAsync$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C00331 extends hn6 implements cm6 {
        public C00331(Object obj) {
            super(0, 0, CallsAudioManagerV3Impl.class, obj, "release", "release()V");
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m127invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m127invoke() {
            ((CallsAudioManagerV3Impl) this.receiver).release();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$removeOnAudioDeviceListChangeListener$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00341 extends u08 implements cm6 {
        final /* synthetic */ CallsAudioManager.OnAudioDeviceListChangeListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00341(CallsAudioManager.OnAudioDeviceListChangeListener onAudioDeviceListChangeListener) {
            super(0);
            this.$listener = onAudioDeviceListChangeListener;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m128invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m128invoke() {
            CallsAudioManagerV3Impl.this.removeOnAudioDeviceListChangeListenerImpl(this.$listener);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$requestAudioFocusAsync$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C00351 extends hn6 implements cm6 {
        public C00351(Object obj) {
            super(0, 0, CallsAudioManagerV3Impl.class, obj, "requestAudioFocus", "requestAudioFocus()V");
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m129invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m129invoke() {
            ((CallsAudioManagerV3Impl) this.receiver).requestAudioFocus();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$requestAudioFocusAsync$2, reason: invalid class name and case insensitive filesystem */
    public static final class C00362 extends u08 implements cm6 {
        public C00362() {
            super(0);
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m130invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m130invoke() {
            CallsAudioManagerV3Impl.this.logger.d(CallsAudioManagerV3Impl.TAG, "audio focus request proceeded");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lqqg;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$requestAudioFocusAsync$3, reason: invalid class name and case insensitive filesystem */
    public static final class C00373 extends u08 implements em6 {
        public C00373() {
            super(1);
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return qqg.a;
        }

        public final void invoke(Throwable th) {
            CallsAudioManagerV3Impl.this.logger.e(CallsAudioManagerV3Impl.TAG, "audio focus request failed", th);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$setAudioDeviceAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00381 extends u08 implements cm6 {
        final /* synthetic */ CallsAudioDeviceInfo $audioDevice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00381(CallsAudioDeviceInfo callsAudioDeviceInfo) {
            super(0);
            this.$audioDevice = callsAudioDeviceInfo;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m131invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m131invoke() {
            CallsAudioManagerV3Impl.this.setAudioDevice(this.$audioDevice);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$setAudioDeviceTypeAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00391 extends u08 implements cm6 {
        final /* synthetic */ CallsAudioManager.AudioDeviceType $audioDevice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00391(CallsAudioManager.AudioDeviceType audioDeviceType) {
            super(0);
            this.$audioDevice = audioDeviceType;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m132invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m132invoke() {
            CallsAudioDeviceInfo callsAudioDeviceInfoFirstOfType = CallsAudioManagerV3Impl.this.firstOfType(this.$audioDevice);
            if (callsAudioDeviceInfoFirstOfType != null) {
                CallsAudioManagerV3Impl.this.setAudioDevice(callsAudioDeviceInfoFirstOfType);
                return;
            }
            CallsAudioManagerV3Impl.this.logger.e(CallsAudioManagerV3Impl.TAG, "Device not found for type " + this.$audioDevice);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$setOnAudioDeviceChangeListener$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00401 extends u08 implements cm6 {
        final /* synthetic */ CallsAudioManager.OnAudioDeviceInfoChangeListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00401(CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
            super(0);
            this.$listener = onAudioDeviceInfoChangeListener;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m133invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m133invoke() {
            CallsAudioManagerV3Impl.this.setOnAudioDeviceChangeListenerImpl(this.$listener);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$setSpeakerEnabledAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00411 extends u08 implements cm6 {
        final /* synthetic */ boolean $byVideoTurnedOn;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00411(boolean z, boolean z2) {
            super(0);
            this.$enabled = z;
            this.$byVideoTurnedOn = z2;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() throws IOException {
            m134invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m134invoke() throws IOException {
            CallsAudioManagerV3Impl.this.setSpeakerEnabled(this.$enabled, this.$byVideoTurnedOn);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$syncAudioDeviceList$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00421 extends u08 implements em6 {
        public static final C00421 INSTANCE = new C00421();

        public C00421() {
            super(1);
        }

        @Override // defpackage.em6
        public final CharSequence invoke(CallsAudioDeviceInfo callsAudioDeviceInfo) {
            return callsAudioDeviceInfo.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$syncAudioDeviceList$2, reason: invalid class name and case insensitive filesystem */
    public static final class C00432 extends u08 implements em6 {
        public static final C00432 INSTANCE = new C00432();

        public C00432() {
            super(1);
        }

        @Override // defpackage.em6
        public final CharSequence invoke(CallsAudioDeviceInfo callsAudioDeviceInfo) {
            return callsAudioDeviceInfo.toString();
        }
    }

    public CallsAudioManagerV3Impl(Context context, ProximityTracker proximityTracker, boolean z, VideoTracker videoTracker, AudioDeviceSelector audioDeviceSelector, CallsAudioManager.DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy, CallsAudioManager.OnMuteListener onMuteListener, Logger logger, boolean z2) {
        this.proximityTracker = proximityTracker;
        this.trackProximityWhenSpeakerEnabled = z;
        this.videoTracker = videoTracker;
        this.audioDeviceSelector = audioDeviceSelector;
        this.disabledAudioDeviceUsagePolicy = disabledAudioDeviceUsagePolicy;
        this.logger = logger;
        this.awaitDeviceChangeConfirmation = z2;
        HandlerThread handlerThread = new HandlerThread("CallsAudioManagerV3Thread");
        this.backgroundHandlerThread = handlerThread;
        this.lastKnownAudioDeviceType = CallsAudioManager.AudioDeviceType.NONE;
        this.callsAudioDevices = new ArrayList();
        this.audioDeviceByCallsDevice = new LinkedHashMap();
        CallsAudioDeviceInfo.Companion companion = CallsAudioDeviceInfo.INSTANCE;
        this.usedDevice = companion.getNONE();
        this.reportedAudioDevice = companion.getNONE();
        this.onAudioDeviceListChangeListeners = new CopyOnWriteArrayList<>();
        final int i = 2;
        this.recoverDeviceByTypeRunnable = new Runnable(this) { // from class: dv1
            public final /* synthetic */ CallsAudioManagerV3Impl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.syncWithSystemCommunicationDevice();
                        break;
                    case 1:
                        this.b.trySetCommunicationDeviceAgain();
                        break;
                    default:
                        CallsAudioManagerV3Impl.recoverDeviceByTypeRunnable$lambda$0(this.b);
                        break;
                }
            }
        };
        final int i2 = 0;
        this.syncWithSystemCommunicationDeviceRunnable = new Runnable(this) { // from class: dv1
            public final /* synthetic */ CallsAudioManagerV3Impl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.syncWithSystemCommunicationDevice();
                        break;
                    case 1:
                        this.b.trySetCommunicationDeviceAgain();
                        break;
                    default:
                        CallsAudioManagerV3Impl.recoverDeviceByTypeRunnable$lambda$0(this.b);
                        break;
                }
            }
        };
        final int i3 = 1;
        this.tryAgainRunnable = new Runnable(this) { // from class: dv1
            public final /* synthetic */ CallsAudioManagerV3Impl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.syncWithSystemCommunicationDevice();
                        break;
                    case 1:
                        this.b.trySetCommunicationDeviceAgain();
                        break;
                    default:
                        CallsAudioManagerV3Impl.recoverDeviceByTypeRunnable$lambda$0(this.b);
                        break;
                }
            }
        };
        this.state = CallsAudioManager.State.IDLE;
        this.deviceSwitchHelper = new DeviceSwitchHelper<>(z2, logger, TAG, new CallsAudioManagerV3Impl$deviceSwitchHelper$1(this));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.workerThreadHandler = handler;
        Handler handler2 = new Handler(Looper.getMainLooper()) { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl.1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                if (msg.what == CallsAudioManagerV3Impl.MESSAGE_REPORT_DEVICE) {
                    Object obj = msg.obj;
                    CallsAudioDeviceInfo callsAudioDeviceInfo = obj instanceof CallsAudioDeviceInfo ? (CallsAudioDeviceInfo) obj : null;
                    if (callsAudioDeviceInfo != null) {
                        CallsAudioManagerV3Impl.this.reportAudioDeviceOnMainThreadImpl(callsAudioDeviceInfo);
                    }
                }
            }
        };
        this.mainHandler = handler2;
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.audioManager = audioManager;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this);
        this.audioFocusRequestHelper = new AudioFocusRequestHelper(audioManager, onMuteListener, handler2, handler, new AnonymousClass4(), logger, new AnonymousClass3(this), anonymousClass2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addOnAudioDeviceListChangeListenerImpl(CallsAudioManager.OnAudioDeviceListChangeListener listener) {
        if (this.isDestroyed) {
            return;
        }
        listener.onAudioDeviceListChanged(this.callsAudioDevices);
        this.onAudioDeviceListChangeListeners.add(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String androidDeviceToString(AudioDeviceInfo info) {
        if (info == null) {
            return "null";
        }
        try {
            return info.getId() + ":" + info.getType() + ":" + ((Object) info.getProductName());
        } catch (Throwable th) {
            return wy1.h("error: ", th.getMessage());
        }
    }

    private final void applyCurrentDevice(CallsAudioDeviceInfo selectedDevice) {
        this.logger.d(TAG, "Cancel try again schedule because of used device change to " + selectedDevice);
        cancelScheduledTrySetCommunicationDeviceAgain();
        this.usedDevice = selectedDevice;
        reportCurrentCallsAudioDevice(selectedDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelScheduledSyncWithSystemCommunicationDevice() {
        this.workerThreadHandler.removeCallbacks(this.syncWithSystemCommunicationDeviceRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelScheduledTrySetCommunicationDeviceAgain() {
        this.workerThreadHandler.removeCallbacks(this.tryAgainRunnable);
    }

    private final void cancelUtilizedDeviceTypeRecovery() {
        this.logger.d(TAG, "Cancelling audio device recovery by type " + this.lastKnownAudioDeviceType + " (maybe)");
        this.workerThreadHandler.removeCallbacks(this.recoverDeviceByTypeRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeState(CallsAudioManager.State state) throws IOException {
        if (this.isDestroyed) {
            return;
        }
        this.logger.v(TAG, "requested " + state);
        onCallStateChangedInternal(state);
    }

    private final void doOnOwnThread(String action, cm6 block, cm6 onComplete, em6 onError) {
        try {
            doOnOwnThreadUnsafe(action, block, onComplete, onError);
        } catch (Throwable th) {
            this.logger.e(TAG, ho7.i("error posting action ", action, " for execution"), th);
        }
    }

    public static /* synthetic */ void doOnOwnThread$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, cm6 cm6Var, cm6 cm6Var2, em6 em6Var, int i, Object obj) {
        if ((i & 4) != 0) {
            cm6Var2 = null;
        }
        if ((i & 8) != 0) {
            em6Var = null;
        }
        callsAudioManagerV3Impl.doOnOwnThread(str, cm6Var, cm6Var2, em6Var);
    }

    private final void doOnOwnThreadUnsafe(String action, cm6 block, cm6 onComplete, em6 onError) {
        this.workerThreadHandler.post(new ev1(block, onComplete, this, action, onError, 0));
    }

    public static /* synthetic */ void doOnOwnThreadUnsafe$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, cm6 cm6Var, cm6 cm6Var2, em6 em6Var, int i, Object obj) {
        if ((i & 4) != 0) {
            cm6Var2 = null;
        }
        if ((i & 8) != 0) {
            em6Var = null;
        }
        callsAudioManagerV3Impl.doOnOwnThreadUnsafe(str, cm6Var, cm6Var2, em6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doOnOwnThreadUnsafe$lambda$9(cm6 cm6Var, cm6 cm6Var2, CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, em6 em6Var) {
        try {
            cm6Var.invoke();
            if (cm6Var2 != null) {
                cm6Var2.invoke();
            }
        } catch (Throwable th) {
            callsAudioManagerV3Impl.logger.e(TAG, "error on executing action ".concat(str), th);
            if (em6Var != null) {
                em6Var.invoke(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallsAudioDeviceInfo firstOfType(CallsAudioManager.AudioDeviceType type) {
        Object next;
        Iterator<T> it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CallsAudioDeviceInfo) next).getDeviceType() == type) {
                break;
            }
        }
        return (CallsAudioDeviceInfo) next;
    }

    private final AudioDeviceInfo getAudioDeviceInfo(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        return this.audioDeviceByCallsDevice.get(callsAudioDeviceInfo);
    }

    private final String getAudioManagerStateDetails() {
        try {
            return ue3.N(this.audioManager.getAvailableCommunicationDevices(), ",", null, null, new C00291(), 30);
        } catch (Throwable th) {
            return wy1.h("audio manager error: ", th.getMessage());
        }
    }

    private final List<imb> getAvailableDevices() {
        List availableCommunicationDevices = this.audioManager.getAvailableCommunicationDevices();
        ArrayList arrayList = new ArrayList();
        Iterator it = availableCommunicationDevices.iterator();
        while (it.hasNext()) {
            imb imbVarMapAndroidDeviceToCallsDevice = mapAndroidDeviceToCallsDevice((AudioDeviceInfo) it.next());
            if (imbVarMapAndroidDeviceToCallsDevice != null) {
                arrayList.add(imbVarMapAndroidDeviceToCallsDevice);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallsAudioDeviceInfo getDeviceForAndroidDevice(AudioDeviceInfo device) throws IOException {
        Object next;
        Object next2;
        if (device == null) {
            this.logger.d(TAG, "NULL device mapped to null");
            return null;
        }
        Iterator<T> it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fni.a(getAudioDeviceInfo((CallsAudioDeviceInfo) next), device)) {
                break;
            }
        }
        CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) next;
        if (callsAudioDeviceInfo == null) {
            this.logger.e(TAG, "Not having a mirror for current communication device");
            syncAudioDeviceList();
            Iterator<T> it2 = this.callsAudioDevices.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (fni.a(getAudioDeviceInfo((CallsAudioDeviceInfo) next2), device)) {
                    break;
                }
            }
            callsAudioDeviceInfo = (CallsAudioDeviceInfo) next2;
        }
        if (callsAudioDeviceInfo == null) {
            this.logger.e(TAG, "After double-check still not having a mirror for current communication device");
            return null;
        }
        Logger logger = this.logger;
        int id = device.getId();
        int type = device.getType();
        CharSequence productName = device.getProductName();
        StringBuilder sbK = wy1.k("Device ", id, ":", type, ":");
        sbK.append((Object) productName);
        sbK.append(" mirrored to ");
        sbK.append(callsAudioDeviceInfo);
        logger.d(TAG, sbK.toString());
        return callsAudioDeviceInfo;
    }

    private final boolean getHasEarpiece() {
        return firstOfType(CallsAudioManager.AudioDeviceType.EARPIECE) != null;
    }

    private final boolean getHasWiredHeadset() {
        return firstOfType(CallsAudioManager.AudioDeviceType.WIRED_HEADSET) != null;
    }

    private final CallsAudioDeviceInfo getPreferredAudioDevice(boolean bluetooth, boolean respectSpeakerEnabled) throws IOException {
        boolean z;
        maybeSyncAudioDeviceList();
        AudioDeviceSelector audioDeviceSelector = this.audioDeviceSelector;
        CallsAudioManager.State state = this.state;
        boolean hasWiredHeadset = getHasWiredHeadset();
        boolean hasEarpiece = getHasEarpiece();
        boolean z2 = true;
        if (!this.disabledSpeakerOnce || this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE)) {
            z = true;
            z2 = false;
        } else {
            z = true;
        }
        boolean z3 = (!this.disabledBluetoothOnce || this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.BLUETOOTH)) ? false : z;
        List<CallsAudioDeviceInfo> list = this.callsAudioDevices;
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallsAudioDeviceInfo) it.next()).getDeviceType());
        }
        CallsAudioDeviceInfo callsAudioDeviceInfoFirstOfType = firstOfType(audioDeviceSelector.selectPreferableDevice(state, bluetooth, respectSpeakerEnabled, hasWiredHeadset, hasEarpiece, z2, z3, ue3.h0(arrayList), this.usedDevice.getDeviceType(), this.videoTracker, this.proximityTracker));
        return callsAudioDeviceInfoFirstOfType == null ? CallsAudioDeviceInfo.INSTANCE.getNONE() : callsAudioDeviceInfoFirstOfType;
    }

    public static /* synthetic */ CallsAudioDeviceInfo getPreferredAudioDevice$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return callsAudioManagerV3Impl.getPreferredAudioDevice(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCurrentCommunicationDevice(AudioDeviceInfo device) throws IOException {
        CallsAudioDeviceInfo deviceForAndroidDevice = getDeviceForAndroidDevice(device);
        if (deviceForAndroidDevice == null) {
            return;
        }
        this.logger.d(TAG, "Apply device " + deviceForAndroidDevice + " confirmed by system");
        applyCurrentDevice(deviceForAndroidDevice);
        this.deviceSwitchHelper.onDeviceSwitched();
    }

    private final imb mapAndroidDeviceToCallsDevice(AudioDeviceInfo device) {
        CallsAudioDeviceInfo callsAudioDeviceInfo;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        int type = device.getType();
        if (type == 1) {
            CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
            CharSequence productName = device.getProductName();
            if (productName == null || (string = productName.toString()) == null) {
                string = CallsAudioDeviceInfo.EARPIECE;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType, string);
        } else if (type == 2) {
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            CharSequence productName2 = device.getProductName();
            if (productName2 == null || (string2 = productName2.toString()) == null) {
                string2 = CallsAudioDeviceInfo.SPEAKERPHONE;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType2, string2);
        } else if (type == 3) {
            CallsAudioManager.AudioDeviceType audioDeviceType3 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
            CharSequence productName3 = device.getProductName();
            if (productName3 == null || (string3 = productName3.toString()) == null) {
                string3 = CallsAudioDeviceInfo.WIRED_HEADSET;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType3, string3);
        } else if (type != 4) {
            String str = CallsAudioDeviceInfo.BLUETOOTH;
            if (type == 7) {
                CallsAudioManager.AudioDeviceType audioDeviceType4 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName4 = device.getProductName();
                if (productName4 != null && (string5 = productName4.toString()) != null) {
                    str = string5;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType4, str);
            } else if (type == 8) {
                CallsAudioManager.AudioDeviceType audioDeviceType5 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName5 = device.getProductName();
                if (productName5 != null && (string6 = productName5.toString()) != null) {
                    str = string6;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType5, str);
            } else if (type == 22) {
                CallsAudioManager.AudioDeviceType audioDeviceType6 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
                CharSequence productName6 = device.getProductName();
                if (productName6 == null || (string7 = productName6.toString()) == null) {
                    string7 = CallsAudioDeviceInfo.USB_HEADSET;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType6, string7);
            } else if (type != 26) {
                this.logger.d(TAG, "Unknown available audio device " + device.getType() + ":" + ((Object) device.getProductName()));
                callsAudioDeviceInfo = null;
            } else {
                CallsAudioManager.AudioDeviceType audioDeviceType7 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName7 = device.getProductName();
                if (productName7 != null && (string8 = productName7.toString()) != null) {
                    str = string8;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType7, str);
            }
        } else {
            CallsAudioManager.AudioDeviceType audioDeviceType8 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
            CharSequence productName8 = device.getProductName();
            if (productName8 == null || (string4 = productName8.toString()) == null) {
                string4 = CallsAudioDeviceInfo.WIRED_HEADPHONES;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType8, string4);
        }
        Logger logger = this.logger;
        int id = device.getId();
        int type2 = device.getType();
        CharSequence productName9 = device.getProductName();
        StringBuilder sbK = wy1.k("Map ", id, ":", type2, ":");
        sbK.append((Object) productName9);
        sbK.append(" -> ");
        sbK.append(callsAudioDeviceInfo);
        logger.d(TAG, sbK.toString());
        if (callsAudioDeviceInfo != null) {
            return new imb(callsAudioDeviceInfo, device);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeRecoverUtilizedDeviceType() {
        if (this.lastKnownAudioDeviceType == CallsAudioManager.AudioDeviceType.NONE) {
            this.logger.d(TAG, "Previously used device type is not known, will not try to recover");
        }
        if (this.usedDevice.getDeviceType() == this.lastKnownAudioDeviceType) {
            this.logger.d(TAG, "Used device type matches type of device used before audio focus was lost. Nothing to do here");
            return;
        }
        this.logger.d(TAG, "Schedule previously utilized device recovery in 3000 ms");
        try {
            this.workerThreadHandler.postDelayed(this.recoverDeviceByTypeRunnable, USED_DEVICE_RECOVER_TIMEOUT_MS);
        } catch (Throwable th) {
            this.logger.e(TAG, "Unable to post recovery runnable", th);
        }
    }

    private final void maybeSyncAudioDeviceList() throws IOException {
        if (this.audioDeviceSyncCount > 0) {
            return;
        }
        syncAudioDeviceList();
    }

    private final void onCallStateChangedInternal(CallsAudioManager.State state) throws IOException {
        if (this.isDestroyed) {
            return;
        }
        boolean z = this.state == CallsAudioManager.State.RINGING && state == CallsAudioManager.State.CONVERSATION;
        this.isInCall = state == CallsAudioManager.State.CONVERSATION;
        this.state = state;
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            release();
            return;
        }
        if (i == 2 || i == 3 || i == 4) {
            start();
            if (z) {
                updateAvailableDeviceList(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recoverDeviceByTypeRunnable$lambda$0(CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        try {
            callsAudioManagerV3Impl.recoverPreviouslyUtilizedDeviceType();
        } catch (Throwable th) {
            callsAudioManagerV3Impl.logger.e(TAG, "Error on device recovery", th);
        }
    }

    private final void recoverPreviouslyUtilizedDeviceType() {
        if (this.isDestroyed) {
            return;
        }
        if (this.usedDevice.getDeviceType() != this.lastKnownAudioDeviceType) {
            this.logger.d(TAG, "It seems previously used device has been recovered by system. Nothing to do here");
            return;
        }
        if (updateAvailableDeviceList$default(this, false, 1, null)) {
            this.logger.d(TAG, "It seems better option was found during device list update. Keep it as it is");
            return;
        }
        CallsAudioDeviceInfo callsAudioDeviceInfoFirstOfType = firstOfType(this.lastKnownAudioDeviceType);
        if (callsAudioDeviceInfoFirstOfType == null) {
            this.logger.d(TAG, "No device found by requested type " + this.lastKnownAudioDeviceType);
            return;
        }
        this.logger.d(TAG, "Submitting request to select " + callsAudioDeviceInfoFirstOfType + " as current (recovery)");
        selectAudioDevice(callsAudioDeviceInfoFirstOfType, "recover");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void release() {
        if (this.isDestroyed) {
            this.logger.d(TAG, "Already released, ignore");
            return;
        }
        this.isDestroyed = true;
        AudioManager audioManager = this.audioManager;
        audioManager.unregisterAudioDeviceCallback(this);
        try {
            audioManager.removeOnCommunicationDeviceChangedListener(this);
        } catch (IllegalArgumentException unused) {
        }
        audioManager.clearCommunicationDevice();
        this.logger.d(TAG, "Audio manager cleanup completed");
        releaseAudioFocus();
        restorePreviousAudioState();
        this.backgroundHandlerThread.quit();
        this.onAudioDeviceChangeListener = null;
        this.onAudioDeviceListChangeListeners.clear();
        this.logger.d(TAG, "Release completed");
    }

    private final void releaseAudioFocus() {
        this.audioFocusRequestHelper.releaseFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rememberUtilizedDeviceType() {
        cancelUtilizedDeviceTypeRecovery();
        this.lastKnownAudioDeviceType = this.usedDevice.getDeviceType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeOnAudioDeviceListChangeListenerImpl(CallsAudioManager.OnAudioDeviceListChangeListener listener) {
        if (this.isDestroyed) {
            return;
        }
        this.onAudioDeviceListChangeListeners.remove(listener);
    }

    private final void reportAudioDeviceOnMainThread(CallsAudioDeviceInfo device) {
        this.mainHandler.removeMessages(MESSAGE_REPORT_DEVICE);
        Handler handler = this.mainHandler;
        handler.sendMessage(handler.obtainMessage(MESSAGE_REPORT_DEVICE, device));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportAudioDeviceOnMainThreadImpl(CallsAudioDeviceInfo device) {
        CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener = this.onAudioDeviceChangeListener;
        if (!fni.a(this.reportedAudioDevice, device) && onAudioDeviceInfoChangeListener != null) {
            this.logger.v(TAG, "reporting device change " + this.reportedAudioDevice + " -> " + device);
            onAudioDeviceInfoChangeListener.onAudioDeviceChanged(new CallsAudioManager.AudioDeviceInfoChangedEvent(this.reportedAudioDevice, device));
            this.reportedAudioDevice = device;
            return;
        }
        Logger logger = this.logger;
        CallsAudioDeviceInfo callsAudioDeviceInfo = this.reportedAudioDevice;
        logger.d(TAG, "Will not report audio device change from " + callsAudioDeviceInfo + " to " + device + " because of same device=" + fni.a(callsAudioDeviceInfo, device) + ", has listener=" + (onAudioDeviceInfoChangeListener != null));
    }

    private final void reportCurrentCallsAudioDevice(CallsAudioDeviceInfo device) {
        reportAudioDeviceOnMainThread(device);
        updateProximityTrackingState(device.getDeviceType() == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
    }

    private final void reportNewDeviceList(List<CallsAudioDeviceInfo> devices) {
        if (fni.a(devices, this.callsAudioDevices)) {
            return;
        }
        this.callsAudioDevices.clear();
        this.callsAudioDevices.addAll(devices);
        Iterator<T> it = this.onAudioDeviceListChangeListeners.iterator();
        while (it.hasNext()) {
            ((CallsAudioManager.OnAudioDeviceListChangeListener) it.next()).onAudioDeviceListChanged(devices);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAudioFocus() {
        this.audioFocusRequestHelper.requestFocus();
    }

    private final void restorePreviousAudioState() {
        Object next;
        if (this.savedPreviousState) {
            this.logger.v(TAG, "restoring state");
            this.savedPreviousState = false;
            try {
                AudioManager audioManager = this.audioManager;
                if (this.savedIsSpeakerPhoneOn) {
                    Iterator it = audioManager.getAvailableCommunicationDevices().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (((AudioDeviceInfo) next).getType() == 2) {
                                break;
                            }
                        }
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) next;
                    if (audioDeviceInfo != null) {
                        audioManager.setCommunicationDevice(audioDeviceInfo);
                    }
                }
                audioManager.setMicrophoneMute(this.savedIsMicrophoneMute);
            } catch (Exception e) {
                this.logger.e(TAG, "restorePreviousAudioState: failed", e);
            }
        }
    }

    private final void savePreviousState() {
        if (this.savedPreviousState) {
            return;
        }
        this.logger.v(TAG, "saving state");
        try {
            AudioManager audioManager = this.audioManager;
            this.savedIsMicrophoneMute = audioManager.isMicrophoneMute();
            AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
            boolean z = false;
            if (communicationDevice != null && communicationDevice.getType() == 2) {
                z = true;
            }
            this.savedIsSpeakerPhoneOn = z;
            this.savedPreviousState = true;
        } catch (Exception e) {
            this.logger.e(TAG, "savePreviousState: failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleSyncWithSystemCommunicationDevice() {
        if (this.isDestroyed) {
            return;
        }
        cancelScheduledSyncWithSystemCommunicationDevice();
        try {
            this.workerThreadHandler.postDelayed(this.syncWithSystemCommunicationDeviceRunnable, 2000L);
        } catch (Throwable th) {
            this.logger.d(TAG, "Can't schedule sync with system communication device", th);
        }
    }

    private final void scheduleTryToSetCommunicationDeviceAgain() {
        if (this.isDestroyed) {
            return;
        }
        cancelScheduledTrySetCommunicationDeviceAgain();
        this.logger.d(TAG, "Schedule try again with current device in 2000ms");
        try {
            this.workerThreadHandler.postDelayed(this.tryAgainRunnable, 2000L);
        } catch (Throwable th) {
            this.logger.e(TAG, "Unable to post try again runnable", th);
        }
    }

    private final void selectAudioDevice(CallsAudioDeviceInfo device, String reason) {
        this.logger.d(TAG, "Request to select devices " + device + ", by " + reason);
        this.deviceSwitchHelper.onDeviceSwitchRequested(device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectAudioDeviceImpl(CallsAudioDeviceInfo device) throws IOException {
        cancelUtilizedDeviceTypeRecovery();
        this.logger.d(TAG, "Selecting " + device);
        if (fni.a(this.usedDevice, device)) {
            this.logger.d(TAG, "An attempt to select same device " + this.usedDevice + ", ignore");
            this.deviceSwitchHelper.onDeviceSwitched();
            return;
        }
        AudioDeviceInfo audioDeviceInfo = getAudioDeviceInfo(device);
        if (audioDeviceInfo == null) {
            this.logger.d(TAG, "No known android device matches requested device " + device);
            this.audioManager.clearCommunicationDevice();
            this.deviceSwitchHelper.onDeviceSwitched();
            return;
        }
        if (device.getDeviceType() == CallsAudioManager.AudioDeviceType.NONE) {
            this.logger.d(TAG, "Empty device type, clear communication device");
            this.audioManager.clearCommunicationDevice();
            reportCurrentCallsAudioDevice(device);
            this.deviceSwitchHelper.onDeviceSwitched();
            return;
        }
        if (audioDeviceInfo.equals(this.audioManager.getCommunicationDevice())) {
            this.logger.d(TAG, "Device " + device + " mapped to currently used communication device");
            handleCurrentCommunicationDevice(audioDeviceInfo);
            return;
        }
        this.logger.d(TAG, "Submit request to set current communication device to " + device);
        try {
            this.logger.d(TAG, "Apply device " + device + " (just a promise to use)");
            applyCurrentDevice(device);
            if (setCommunicationDevice(audioDeviceInfo)) {
                return;
            }
            this.logger.d(TAG, "Can't set " + androidDeviceToString(audioDeviceInfo) + ": setCommunicationDevice() returned false");
            syncWithSystemCommunicationDevice();
        } catch (Throwable th) {
            this.logger.e(TAG, "Error setting communication device", new IllegalArgumentException("Proposed device was not able to set as current " + device + " (" + androidDeviceToString(audioDeviceInfo) + "), details: " + getAudioManagerStateDetails(), th));
            syncWithSystemCommunicationDevice();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAudioDevice(CallsAudioDeviceInfo device) {
        CallsAudioManager.AudioDeviceType deviceType;
        if (this.isDestroyed || (deviceType = this.usedDevice.getDeviceType()) == device.getDeviceType()) {
            return;
        }
        CallsAudioManager.State state = this.state;
        if (state == CallsAudioManager.State.RINGING) {
            this.logger.d(TAG, "Avoid audio device update in state " + state);
            return;
        }
        boolean z = this.disabledBluetoothOnce;
        CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        this.disabledBluetoothOnce = z | (deviceType == audioDeviceType);
        boolean z2 = this.disabledSpeakerOnce;
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        this.disabledSpeakerOnce = z2 | (deviceType == audioDeviceType2);
        this.logger.d(TAG, "Set audio device by external request: " + device);
        if (device.oneOf$calls_audiomanager_release(audioDeviceType2, CallsAudioManager.AudioDeviceType.WIRED_HEADSET, CallsAudioManager.AudioDeviceType.EARPIECE, audioDeviceType)) {
            selectAudioDevice(device, "user request");
        }
    }

    private final void setAudioManagerModeSafe(int mode) {
        try {
            this.audioManager.setMode(mode);
        } catch (Throwable th) {
            this.logger.reportError(TAG, "Can't set audio manager mode", th);
        }
    }

    private final boolean setCommunicationDevice(AudioDeviceInfo device) {
        if (device == null) {
            this.audioManager.clearCommunicationDevice();
            return true;
        }
        if (!this.audioManager.setCommunicationDevice(device)) {
            return false;
        }
        scheduleTryToSetCommunicationDeviceAgain();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnAudioDeviceChangeListenerImpl(CallsAudioManager.OnAudioDeviceInfoChangeListener listener) {
        if (this.isDestroyed) {
            return;
        }
        this.onAudioDeviceChangeListener = listener;
        if (listener == null) {
            return;
        }
        this.reportedAudioDevice = NO_DEVICE;
        reportAudioDeviceOnMainThread(this.usedDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSpeakerEnabled(boolean enabled, boolean byVideoTurnedOn) throws IOException {
        if (this.isDestroyed) {
            return;
        }
        this.logger.v(TAG, "requested speaker enable=" + enabled + " by video=" + byVideoTurnedOn);
        if (!enabled) {
            selectAudioDevice(getPreferredAudioDevice(true, false), "set speaker disabled, state=" + this.state);
            return;
        }
        if (byVideoTurnedOn || !this.disabledSpeakerOnce || this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE)) {
            CallsAudioDeviceInfo callsAudioDeviceInfo = this.usedDevice;
            CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            if (callsAudioDeviceInfo.oneOf$calls_audiomanager_release(audioDeviceType, audioDeviceType2) && this.proximityTracker.getCanUseSpeaker()) {
                CallsAudioDeviceInfo callsAudioDeviceInfoFirstOfType = firstOfType(audioDeviceType2);
                if (callsAudioDeviceInfoFirstOfType != null) {
                    selectAudioDevice(callsAudioDeviceInfoFirstOfType, "set speaker enabled");
                } else {
                    this.logger.e(TAG, "No speaker found");
                }
            }
        }
    }

    private final void start() {
        if (this.isStarted) {
            this.logger.d(TAG, "Already started, ignore");
            return;
        }
        this.logger.d(TAG, "Starting...");
        this.isStarted = true;
        savePreviousState();
        requestAudioFocus();
        startTrackingAudioDevices();
        setAudioManagerModeSafe(3);
        selectAudioDevice(getPreferredAudioDevice(true, false), "start");
    }

    private final void startTrackingAudioDevices() {
        AudioManager audioManager = this.audioManager;
        audioManager.registerAudioDeviceCallback(this, this.workerThreadHandler);
        audioManager.addOnCommunicationDeviceChangedListener(new fv1(0, this), this);
        updateAvailableDeviceList$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTrackingAudioDevices$lambda$4$lambda$3(CallsAudioManagerV3Impl callsAudioManagerV3Impl, Runnable runnable) {
        callsAudioManagerV3Impl.workerThreadHandler.post(runnable);
    }

    private final void syncAudioDeviceList() throws IOException {
        this.logger.d(TAG, " Sync audio device list (" + this.audioDeviceSyncCount + "). List before update: " + ue3.N(this.callsAudioDevices, null, null, null, C00421.INSTANCE, 31));
        this.audioDeviceByCallsDevice.clear();
        try {
            List<imb> availableDevices = getAvailableDevices();
            ArrayList arrayList = new ArrayList(we3.q(availableDevices, 10));
            Iterator<T> it = availableDevices.iterator();
            while (it.hasNext()) {
                arrayList.add((CallsAudioDeviceInfo) ((imb) it.next()).a);
            }
            to8.n(availableDevices, this.audioDeviceByCallsDevice);
            reportNewDeviceList(arrayList);
        } catch (Throwable th) {
            this.logger.e(TAG, "Error while getting available communication devices", th);
        }
        this.logger.d(TAG, " Sync audio device list (" + this.audioDeviceSyncCount + "). List after update: " + ue3.N(this.callsAudioDevices, null, null, null, C00432.INSTANCE, 31));
        this.audioDeviceSyncCount = this.audioDeviceSyncCount + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncWithSystemCommunicationDevice() {
        if (this.isDestroyed) {
            return;
        }
        this.logger.d(TAG, "Try to recover actual device audio device state");
        try {
            handleCurrentCommunicationDevice(this.audioManager.getCommunicationDevice());
        } catch (Throwable unused) {
            this.logger.e(TAG, "Can't recover current communication device from system state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trySetCommunicationDeviceAgain() {
        try {
            trySetCommunicationDeviceAgainUnsafe();
        } catch (Throwable th) {
            this.logger.e(TAG, "Failed to set communication device again", th);
            syncWithSystemCommunicationDevice();
        }
    }

    private final void trySetCommunicationDeviceAgainUnsafe() {
        if (this.isDestroyed) {
            return;
        }
        this.logger.d(TAG, "Try again with " + androidDeviceToString(getAudioDeviceInfo(this.usedDevice)));
        this.audioManager.clearCommunicationDevice();
        AudioDeviceInfo audioDeviceInfo = getAudioDeviceInfo(this.usedDevice);
        if (audioDeviceInfo == null) {
            this.logger.d(TAG, "No current device, ignore try again attempt, sync with system device instead");
            syncWithSystemCommunicationDevice();
            return;
        }
        if (this.audioManager.setCommunicationDevice(audioDeviceInfo)) {
            this.logger.d(TAG, "Try again with " + androidDeviceToString(audioDeviceInfo) + " passed, wait for a system confirmation or rollback in 2000ms");
            scheduleSyncWithSystemCommunicationDevice();
            return;
        }
        this.logger.d(TAG, "Try again with " + androidDeviceToString(audioDeviceInfo) + " did fail. Sync with system device immediately");
        syncWithSystemCommunicationDevice();
    }

    private final boolean updateAvailableDeviceList(boolean byStopRinging) throws IOException {
        CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
        boolean z = firstOfType(audioDeviceType) != null;
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        boolean z2 = firstOfType(audioDeviceType2) != null;
        this.logger.d(TAG, "update audio device list, had bt before=" + z2 + ", had headphones before=" + z);
        syncAudioDeviceList();
        Object obj = null;
        CallsAudioDeviceInfo callsAudioDeviceInfoFirstOfType = !z ? firstOfType(audioDeviceType) : null;
        CallsAudioDeviceInfo callsAudioDeviceInfoFirstOfType2 = !z2 ? firstOfType(audioDeviceType2) : null;
        Iterator<T> it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (fni.a((CallsAudioDeviceInfo) next, this.usedDevice)) {
                obj = next;
                break;
            }
        }
        if (obj == null || byStopRinging) {
            CallsAudioDeviceInfo preferredAudioDevice = getPreferredAudioDevice(true, !byStopRinging);
            if (byStopRinging) {
                this.logger.d(TAG, "Current device " + this.usedDevice + " replaced by " + preferredAudioDevice + " because of stop ringing");
            } else {
                this.logger.d(TAG, "Current device " + this.usedDevice + " disappeared, select " + preferredAudioDevice + " instead");
            }
            selectAudioDevice(preferredAudioDevice, xc0.f("auto select. stop ringing=", byStopRinging));
            return false;
        }
        if (callsAudioDeviceInfoFirstOfType != null && this.usedDevice.getDeviceType() != CallsAudioManager.AudioDeviceType.WIRED_HEADSET) {
            this.logger.d(TAG, "Wired headset did appear: " + callsAudioDeviceInfoFirstOfType + ", let us try to select it");
            selectAudioDevice(callsAudioDeviceInfoFirstOfType, "wired headset appeared");
            return true;
        }
        if (callsAudioDeviceInfoFirstOfType2 == null || this.usedDevice.getDeviceType().isHeadsetDevice()) {
            return false;
        }
        if (this.disabledBluetoothOnce && !this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.BLUETOOTH)) {
            this.logger.d(TAG, "Will not try to select bluetooth because user disable it once already");
            return true;
        }
        this.logger.d(TAG, "Bluetooth headset did appear: " + callsAudioDeviceInfoFirstOfType2 + ", let us try to select it");
        selectAudioDevice(callsAudioDeviceInfoFirstOfType2, "bt headset appeared");
        return true;
    }

    public static /* synthetic */ boolean updateAvailableDeviceList$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return callsAudioManagerV3Impl.updateAvailableDeviceList(z);
    }

    private final void updateProximityTrackingState(boolean speakerOn) {
        boolean z = this.usedDevice.getDeviceType() == CallsAudioManager.AudioDeviceType.BLUETOOTH || this.usedDevice.getDeviceType() == CallsAudioManager.AudioDeviceType.WIRED_HEADSET || (speakerOn && !this.trackProximityWhenSpeakerEnabled);
        this.logger.v(TAG, "proximity disabled? " + z + ", speaker? " + speakerOn);
        this.mainHandler.post(new ui(z, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProximityTrackingState$lambda$10(boolean z, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        try {
            if (z) {
                callsAudioManagerV3Impl.proximityTracker.stopTrackingProximity();
            } else {
                callsAudioManagerV3Impl.proximityTracker.startTrackingProximity();
            }
        } catch (Throwable th) {
            callsAudioManagerV3Impl.logger.e(TAG, "Proximity tracker error", th);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void addOnAudioDeviceListChangeListener(CallsAudioManager.OnAudioDeviceListChangeListener listener) {
        doOnOwnThread$default(this, "addOnAudioDeviceListChangeListener", new C00271(listener), null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void changeStateAsync(CallsAudioManager.State state, cm6 onComplete, em6 onError) {
        doOnOwnThread("changeStateAsync", new C00281(state), onComplete, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public List<CallsAudioDeviceInfo> getAvailableAudioDevices() {
        return this.callsAudioDevices;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public CallsAudioDeviceInfo getCurrentDevice() {
        return this.usedDevice;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void hasBluetoothHeadsetAsync(em6 onSuccess, em6 onError) {
        doOnOwnThread("hasBluetoothHeadsetAsync", new C00301(onSuccess, this), null, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void hasWiredHeadsetAsync(em6 onSuccess, em6 onError) {
        doOnOwnThread("hasWiredHeadsetAsync", new C00311(onSuccess, this), null, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public boolean isHeadsetConnected() {
        return this.usedDevice.getDeviceType().isHeadsetDevice();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void notifyBluetoothPermissionGranted() {
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(AudioDeviceInfo[] addedDevices) {
        this.logger.d(TAG, "Audio devices were added, update list");
        updateAvailableDeviceList$default(this, false, 1, null);
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(AudioDeviceInfo[] removedDevices) {
        this.logger.d(TAG, "Audio devices were removed, update list");
        updateAvailableDeviceList$default(this, false, 1, null);
    }

    public void onCommunicationDeviceChanged(AudioDeviceInfo device) {
        doOnOwnThread$default(this, "onCommunicationDeviceChanged", new C00321(device), null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void releaseAsync(cm6 onComplete, em6 onError) {
        doOnOwnThread("releaseAsync", new C00331(this), onComplete, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void removeOnAudioDeviceListChangeListener(CallsAudioManager.OnAudioDeviceListChangeListener listener) {
        doOnOwnThread$default(this, "removeOnAudioDeviceListChangeListener", new C00341(listener), null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void requestAudioFocusAsync() {
        doOnOwnThread("requestAudioFocus", new C00351(this), new C00362(), new C00373());
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setAudioDeviceAsync(CallsAudioDeviceInfo audioDevice, cm6 onComplete, em6 onError) {
        doOnOwnThread("setAudioDeviceAsync", new C00381(audioDevice), onComplete, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setAudioDeviceTypeAsync(CallsAudioManager.AudioDeviceType audioDevice, cm6 onComplete, em6 onError) {
        doOnOwnThread("setAudioDeviceAsync", new C00391(audioDevice), onComplete, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setOnAudioDeviceChangeListener(CallsAudioManager.OnAudioDeviceInfoChangeListener listener) {
        doOnOwnThread$default(this, "setOnAudioDeviceChangeListener", new C00401(listener), null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setSpeakerEnabledAsync(boolean enabled, boolean byVideoTurnedOn, cm6 onComplete, em6 onError) {
        doOnOwnThread("setSpeakerEnabledAsync", new C00411(enabled, byVideoTurnedOn), onComplete, onError);
    }
}

package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import defpackage.cm6;
import defpackage.cv1;
import defpackage.em6;
import defpackage.fni;
import defpackage.qqg;
import defpackage.rd5;
import defpackage.u08;
import defpackage.ue3;
import defpackage.we3;
import defpackage.xc0;
import defpackage.z7;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;

@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\"\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u0000 Ë\u00012\u00020\u00012\u00020\u0002:\u0002Ë\u0001BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010 H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010!\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010!\u001a\u00020$H\u0017¢\u0006\u0004\b'\u0010&J=\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0017¢\u0006\u0004\b*\u0010+J=\u0010-\u001a\u00020\u00172\u0006\u0010)\u001a\u00020,2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0017¢\u0006\u0004\b-\u0010.JE\u00101\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0017¢\u0006\u0004\b1\u00102J5\u00103\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0017¢\u0006\u0004\b3\u00104J7\u00106\u001a\u00020\u00172\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170\u0019H\u0017¢\u0006\u0004\b6\u00107J7\u00108\u001a\u00020\u00172\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170\u0019H\u0017¢\u0006\u0004\b8\u00107J\u000f\u00109\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u0010\u001fJ\u0019\u0010=\u001a\u00020\u00172\b\b\u0002\u0010:\u001a\u00020\u0007H\u0001¢\u0006\u0004\b;\u0010<J\u0017\u0010@\u001a\u00020\u00072\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00072\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bB\u0010AJ\u001f\u0010E\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0007H\u0001¢\u0006\u0004\bC\u0010DJ\u000f\u0010G\u001a\u00020\u0017H\u0001¢\u0006\u0004\bF\u0010\u001fJO\u0010M\u001a\u00020\u00172\u0006\u0010I\u001a\u00020H2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00192\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0001¢\u0006\u0004\bK\u0010LJW\u0010R\u001a\u00020\u00172\u0006\u0010I\u001a\u00020H2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00192\u0006\u0010O\u001a\u00020N2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0001¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u00172\u0006\u0010)\u001a\u00020,H\u0003¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0017H\u0003¢\u0006\u0004\bW\u0010\u001fJ\u0019\u0010X\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bX\u0010#J\u0017\u0010Y\u001a\u00020\u00172\u0006\u0010!\u001a\u00020$H\u0003¢\u0006\u0004\bY\u0010&J\u0017\u0010Z\u001a\u00020\u00172\u0006\u0010!\u001a\u00020$H\u0003¢\u0006\u0004\bZ\u0010&J\u0017\u0010[\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b[\u0010VJ\u0019\u0010]\u001a\u00020\u00172\b\b\u0002\u0010\\\u001a\u00020\u0007H\u0002¢\u0006\u0004\b]\u0010<J\u000f\u0010^\u001a\u00020\u0017H\u0002¢\u0006\u0004\b^\u0010\u001fJ\u000f\u0010_\u001a\u00020\u0017H\u0002¢\u0006\u0004\b_\u0010\u001fJ\u000f\u0010`\u001a\u00020\u0017H\u0003¢\u0006\u0004\b`\u0010\u001fJ\u0017\u0010c\u001a\u00020\u00172\u0006\u0010b\u001a\u00020aH\u0003¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u0017H\u0003¢\u0006\u0004\be\u0010\u001fJ\u000f\u0010f\u001a\u00020\u0017H\u0003¢\u0006\u0004\bf\u0010\u001fJ\u000f\u0010g\u001a\u00020\u0017H\u0003¢\u0006\u0004\bg\u0010\u001fJ\u000f\u0010h\u001a\u00020\u0017H\u0003¢\u0006\u0004\bh\u0010\u001fJ\u0017\u0010j\u001a\u00020\u00172\u0006\u0010i\u001a\u00020\u0007H\u0003¢\u0006\u0004\bj\u0010<J\u000f\u0010k\u001a\u00020\u0007H\u0003¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u0007H\u0003¢\u0006\u0004\bm\u0010lJ\u001f\u0010o\u001a\u00020\u00172\u0006\u0010?\u001a\u00020,2\u0006\u0010n\u001a\u00020HH\u0003¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u00172\u0006\u0010?\u001a\u00020,H\u0003¢\u0006\u0004\bq\u0010TJ\u0017\u0010G\u001a\u00020\u00172\u0006\u0010r\u001a\u00020\u0007H\u0003¢\u0006\u0004\bG\u0010<J\u000f\u0010s\u001a\u00020\u0017H\u0003¢\u0006\u0004\bs\u0010\u001fJ\u0017\u0010t\u001a\u00020\u00172\u0006\u0010?\u001a\u00020(H\u0003¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\u00172\u0006\u0010?\u001a\u00020(H\u0003¢\u0006\u0004\bv\u0010uJ\u001d\u0010y\u001a\u00020\u00172\f\u0010x\u001a\b\u0012\u0004\u0012\u00020(0wH\u0003¢\u0006\u0004\by\u0010zJ#\u0010}\u001a\u00020,2\b\b\u0002\u0010{\u001a\u00020\u00072\b\b\u0002\u0010|\u001a\u00020\u0007H\u0003¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u007f\u0010\u001fJ\u001a\u0010\u0080\u0001\u001a\u00020(2\u0006\u0010?\u001a\u00020,H\u0003¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u00172\u0006\u0010?\u001a\u00020(H\u0003¢\u0006\u0005\b\u0082\u0001\u0010uJ\u001a\u0010\u0083\u0001\u001a\u00020H2\u0006\u0010?\u001a\u00020,H\u0003¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0012\u0010\u0085\u0001\u001a\u00020NH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001a\u0010\u0088\u0001\u001a\u00020\u00172\u0007\u0010\u0087\u0001\u001a\u00020\u0007H\u0003¢\u0006\u0005\b\u0088\u0001\u0010<R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0089\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u008a\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u008b\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u008c\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010\u008d\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u008e\u0001R\u0015\u0010\u0011\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u008b\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u008b\u0001R\u0019\u0010\u009f\u0001\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0019\u0010¡\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u008b\u0001R\u0019\u0010¢\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u008b\u0001R\u0019\u0010£\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u008b\u0001R\u0019\u0010¤\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u008b\u0001R\u0017\u0010¥\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010\u008b\u0001R\u0017\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010¦\u0001R\u001e\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020(0§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010ª\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0019\u0010¬\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010®\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001e\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020$0°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0019\u0010³\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u008b\u0001R \u0010´\u0001\u001a\u00030\u0092\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010\u0094\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R*\u0010¸\u0001\u001a\u00020(2\u0007\u0010·\u0001\u001a\u00020(8\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b¸\u0001\u0010«\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010¼\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010¿\u0001\u001a\u00030¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u001e\u0010Â\u0001\u001a\t\u0012\u0004\u0012\u00020,0Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001e\u0010Ç\u0001\u001a\t\u0012\u0004\u0012\u00020(0Ä\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0016\u0010È\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010lR\u0015\u0010k\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010lR\u0015\u0010m\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010l¨\u0006Ì\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$Listener;", "Landroid/content/Context;", "context", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "proximityTracker", "", "trackProximityWhenSpeakerEnabled", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "videoTracker", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "audioDeviceSelector", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "onMuteListener", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "awaitDeviceChangeConfirmation", "<init>", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/ProximityTracker;ZLru/ok/android/externcalls/sdk/audio/VideoTracker;Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;Lru/ok/android/externcalls/sdk/audio/Logger;Z)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "state", "Lkotlin/Function0;", "Lqqg;", "onComplete", "Lkotlin/Function1;", "", "onError", "changeStateAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;Lcm6;Lem6;)V", "notifyBluetoothPermissionGranted", "()V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "listener", "setOnAudioDeviceChangeListener", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceListChangeListener;", "addOnAudioDeviceListChangeListener", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceListChangeListener;)V", "removeOnAudioDeviceListChangeListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "audioDevice", "setAudioDeviceAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;Lcm6;Lem6;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "setAudioDeviceTypeAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;Lcm6;Lem6;)V", "enabled", "byVideoTurnedOn", "setSpeakerEnabledAsync", "(ZZLcm6;Lem6;)V", "releaseAsync", "(Lcm6;Lem6;)V", "onSuccess", "hasWiredHeadsetAsync", "(Lem6;Lem6;)V", "hasBluetoothHeadsetAsync", "requestAudioFocusAsync", "withBluetooth", "selectPreferredAudioDevice$calls_audiomanager_release", "(Z)V", "selectPreferredAudioDevice", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$BluetoothDeviceIntent;", "device", "onDeviceAvailable", "(Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$BluetoothDeviceIntent;)Z", "onDeviceUnavailable", "setSpeakerEnabled$calls_audiomanager_release", "(ZZ)V", "setSpeakerEnabled", "updateAudioDeviceState$calls_audiomanager_release", "updateAudioDeviceState", "", "action", "block", "doOnOwnThread$calls_audiomanager_release", "(Ljava/lang/String;Lcm6;Lem6;Lcm6;)V", "doOnOwnThread", "", "delayMillis", "doOnOwnThreadWithDelay$calls_audiomanager_release", "(Ljava/lang/String;Lcm6;Lem6;JLcm6;)V", "doOnOwnThreadWithDelay", "setAudioDevice", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)V", "changeState", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;)V", "maybeRestartBluetoothManager", "setOnAudioDeviceChangeListenerImpl", "addOnAudioDeviceListChangeListenerImpl", "removeOnAudioDeviceListChangeListenerImpl", "onCallStateChangedInternal", "byStopRinging", "autoSelectAudioDevice", "requestAudioFocus", "releaseAudioFocus", "release", "", "mode", "setAudioManagerModeSafe", "(I)V", "clearDeviceSelection", "startTrackingAudioDevices", "savePreviousState", "restorePreviousAudioState", "speakerOn", "updateProximityTrackingState", "hasBluetoothHeadset", "()Z", "hasWiredHeadset", IceCandidatePairChangedStat.KEY_REASON, "selectAudioDevice", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;Ljava/lang/String;)V", "selectAudioDeviceImpl", "preferSelectedDevice", "applySelectedDevice", "reportAudioDeviceOnMainThread", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)V", "reportAudioDeviceOnMainThreadImpl", "", "devices", "reportNewDeviceList", "(Ljava/util/Set;)V", "bluetooth", "respectSpeakerEnabled", "getPreferredAudioDevice", "(ZZ)Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "updateAvailableAudioDevices", "getDeviceInfo", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "setAudioDeviceInternal", "getAudioDeviceReadableName", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)Ljava/lang/String;", "getAudioDeviceSwitchDelay", "()J", "isMute", "mute", "Landroid/content/Context;", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "Z", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "Landroid/os/HandlerThread;", "backgroundHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager;", "bluetoothManager", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager;", "wiredHeadsetManager", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager;", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "savedPreviousState", "savedAudioMode", "I", "savedIsSpeakerPhoneOn", "savedIsMicrophoneMute", "disabledBluetoothOnce", "disabledSpeakerOnce", "hasEarpiece", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "", "audioDevices", "Ljava/util/Set;", "reportedAudioDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "selectedDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "onAudioDeviceChangeListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onAudioDeviceListChangeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "isDestroyed", "workerThreadHandler", "getWorkerThreadHandler$calls_audiomanager_release", "()Landroid/os/Handler;", "<set-?>", "currentDevice", "getCurrentDevice", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner;", "bluetoothDeviceScanner", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner;", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "audioFocusRequestHelper", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "Lru/ok/android/externcalls/sdk/audio/internal/DeviceSwitchHelper;", "deviceSwitchHelper", "Lru/ok/android/externcalls/sdk/audio/internal/DeviceSwitchHelper;", "", "getAvailableAudioDevices", "()Ljava/util/List;", "availableAudioDevices", "isHeadsetConnected", "getHasBluetoothHeadset", "getHasWiredHeadset", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallsAudioManagerV2Impl implements CallsAudioManager, CallsBluethoothDeviceScanner.Listener {
    private static final long DELAY_USER_REQUEST_MS = 100;
    private static final String LOG_TAG = "CallsAudioManagerV2";
    private static final int MESSAGE_REPORT_DEVICE = 311;
    private final AudioDeviceSelector audioDeviceSelector;
    private final Set<CallsAudioDeviceInfo> audioDevices;
    private final AudioFocusRequestHelper audioFocusRequestHelper;
    private final AudioManager audioManager;
    private final boolean awaitDeviceChangeConfirmation;
    private final HandlerThread backgroundHandlerThread;
    private final CallsBluethoothDeviceScanner bluetoothDeviceScanner;
    private final CallsBluetoothManager bluetoothManager;
    private final Context context;
    private volatile CallsAudioDeviceInfo currentDevice;
    private final DeviceSwitchHelper<CallsAudioManager.AudioDeviceType> deviceSwitchHelper;
    private boolean disabledBluetoothOnce;
    private boolean disabledSpeakerOnce;
    private final boolean hasEarpiece;
    private volatile boolean isDestroyed;
    private final Logger logger;
    private final Handler mainHandler;
    private volatile CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceChangeListener;
    private final CopyOnWriteArrayList<CallsAudioManager.OnAudioDeviceListChangeListener> onAudioDeviceListChangeListeners;
    private final ProximityTracker proximityTracker;
    private CallsAudioDeviceInfo reportedAudioDevice;
    private int savedAudioMode;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private boolean savedPreviousState;
    private CallsAudioManager.AudioDeviceType selectedDevice;
    private CallsAudioManager.State state;
    private final boolean trackProximityWhenSpeakerEnabled;
    private final VideoTracker videoTracker;
    private final CallsWiredHeadsetManager wiredHeadsetManager;
    private final Handler workerThreadHandler;
    private static final CallsAudioDeviceInfo NO_DEVICE = new CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType.NONE, "");

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$3, reason: invalid class name */
    public static final class AnonymousClass3 extends u08 implements cm6 {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.cm6
        public final Boolean invoke() {
            return Boolean.valueOf(CallsAudioManagerV2Impl.this.isDestroyed);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[CallsAudioManager.AudioDeviceType.values().length];
            try {
                iArr2[CallsAudioManager.AudioDeviceType.BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.WIRED_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.EARPIECE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.SPEAKER_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$addOnAudioDeviceListChangeListener$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00131 extends u08 implements cm6 {
        final /* synthetic */ CallsAudioManager.OnAudioDeviceListChangeListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00131(CallsAudioManager.OnAudioDeviceListChangeListener onAudioDeviceListChangeListener) {
            super(0);
            this.$listener = onAudioDeviceListChangeListener;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m103invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m103invoke() {
            CallsAudioManagerV2Impl.this.addOnAudioDeviceListChangeListenerImpl(this.$listener);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$applySelectedDevice$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00141 extends u08 implements cm6 {
        public C00141() {
            super(0);
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m104invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m104invoke() {
            CallsAudioManagerV2Impl.this.deviceSwitchHelper.onDeviceSwitched();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$changeStateAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00151 extends u08 implements cm6 {
        final /* synthetic */ CallsAudioManager.State $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00151(CallsAudioManager.State state) {
            super(0);
            this.$state = state;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m105invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m105invoke() {
            CallsAudioManagerV2Impl.this.changeState(this.$state);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$hasBluetoothHeadsetAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00161 extends u08 implements cm6 {
        final /* synthetic */ em6 $onSuccess;
        final /* synthetic */ CallsAudioManagerV2Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00161(em6 em6Var, CallsAudioManagerV2Impl callsAudioManagerV2Impl) {
            super(0);
            this.$onSuccess = em6Var;
            this.this$0 = callsAudioManagerV2Impl;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m106invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m106invoke() {
            this.$onSuccess.invoke(Boolean.valueOf(this.this$0.hasBluetoothHeadset()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$hasWiredHeadsetAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00171 extends u08 implements cm6 {
        final /* synthetic */ em6 $onSuccess;
        final /* synthetic */ CallsAudioManagerV2Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00171(em6 em6Var, CallsAudioManagerV2Impl callsAudioManagerV2Impl) {
            super(0);
            this.$onSuccess = em6Var;
            this.this$0 = callsAudioManagerV2Impl;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m107invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m107invoke() {
            this.$onSuccess.invoke(Boolean.valueOf(this.this$0.hasWiredHeadset()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$notifyBluetoothPermissionGranted$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00181 extends u08 implements cm6 {
        public C00181() {
            super(0);
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m108invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m108invoke() {
            CallsAudioManagerV2Impl.this.maybeRestartBluetoothManager();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$releaseAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00191 extends u08 implements cm6 {
        public C00191() {
            super(0);
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m109invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m109invoke() {
            CallsAudioManagerV2Impl.this.release();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$removeOnAudioDeviceListChangeListener$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00201 extends u08 implements cm6 {
        final /* synthetic */ CallsAudioManager.OnAudioDeviceListChangeListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00201(CallsAudioManager.OnAudioDeviceListChangeListener onAudioDeviceListChangeListener) {
            super(0);
            this.$listener = onAudioDeviceListChangeListener;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m110invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m110invoke() {
            CallsAudioManagerV2Impl.this.removeOnAudioDeviceListChangeListenerImpl(this.$listener);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$requestAudioFocusAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00211 extends u08 implements cm6 {
        public C00211() {
            super(0);
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m111invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m111invoke() {
            CallsAudioManagerV2Impl.this.logger.e(CallsAudioManagerV2Impl.LOG_TAG, "audio focus request done");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lqqg;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$requestAudioFocusAsync$2, reason: invalid class name */
    public static final class AnonymousClass2 extends u08 implements em6 {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return qqg.a;
        }

        public final void invoke(Throwable th) {
            CallsAudioManagerV2Impl.this.logger.e(CallsAudioManagerV2Impl.LOG_TAG, "audio focus request failed", th);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$requestAudioFocusAsync$3, reason: invalid class name and case insensitive filesystem */
    public static final class C00223 extends u08 implements cm6 {
        public C00223() {
            super(0);
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m112invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m112invoke() {
            CallsAudioManagerV2Impl.this.requestAudioFocus();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$setAudioDeviceAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00231 extends u08 implements cm6 {
        final /* synthetic */ CallsAudioDeviceInfo $audioDevice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00231(CallsAudioDeviceInfo callsAudioDeviceInfo) {
            super(0);
            this.$audioDevice = callsAudioDeviceInfo;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m113invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m113invoke() {
            CallsAudioManagerV2Impl.this.setAudioDevice(this.$audioDevice.getDeviceType());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$setAudioDeviceTypeAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00241 extends u08 implements cm6 {
        final /* synthetic */ CallsAudioManager.AudioDeviceType $audioDevice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00241(CallsAudioManager.AudioDeviceType audioDeviceType) {
            super(0);
            this.$audioDevice = audioDeviceType;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m114invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m114invoke() {
            CallsAudioManagerV2Impl.this.setAudioDevice(this.$audioDevice);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$setOnAudioDeviceChangeListener$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00251 extends u08 implements cm6 {
        final /* synthetic */ CallsAudioManager.OnAudioDeviceInfoChangeListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00251(CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
            super(0);
            this.$listener = onAudioDeviceInfoChangeListener;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m115invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m115invoke() {
            CallsAudioManagerV2Impl.this.setOnAudioDeviceChangeListenerImpl(this.$listener);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$setSpeakerEnabledAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00261 extends u08 implements cm6 {
        final /* synthetic */ boolean $byVideoTurnedOn;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00261(boolean z, boolean z2) {
            super(0);
            this.$enabled = z;
            this.$byVideoTurnedOn = z2;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m116invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m116invoke() {
            CallsAudioManagerV2Impl.this.setSpeakerEnabled$calls_audiomanager_release(this.$enabled, this.$byVideoTurnedOn);
        }
    }

    public CallsAudioManagerV2Impl(Context context, ProximityTracker proximityTracker, boolean z, VideoTracker videoTracker, AudioDeviceSelector audioDeviceSelector, CallsAudioManager.OnMuteListener onMuteListener, Logger logger, boolean z2) {
        this.context = context;
        this.proximityTracker = proximityTracker;
        this.trackProximityWhenSpeakerEnabled = z;
        this.videoTracker = videoTracker;
        this.audioDeviceSelector = audioDeviceSelector;
        this.logger = logger;
        this.awaitDeviceChangeConfirmation = z2;
        HandlerThread handlerThread = new HandlerThread("CallsAudioManagerThread");
        this.backgroundHandlerThread = handlerThread;
        this.state = CallsAudioManager.State.IDLE;
        this.audioDevices = new LinkedHashSet();
        CallsAudioDeviceInfo callsAudioDeviceInfo = NO_DEVICE;
        this.reportedAudioDevice = callsAudioDeviceInfo;
        this.selectedDevice = CallsAudioManager.AudioDeviceType.NONE;
        this.onAudioDeviceListChangeListeners = new CopyOnWriteArrayList<>();
        this.currentDevice = callsAudioDeviceInfo;
        this.deviceSwitchHelper = new DeviceSwitchHelper<>(z2, logger, LOG_TAG, new CallsAudioManagerV2Impl$deviceSwitchHelper$1(this));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.workerThreadHandler = handler;
        Handler handler2 = new Handler(Looper.getMainLooper()) { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl.1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                if (msg.what == CallsAudioManagerV2Impl.MESSAGE_REPORT_DEVICE) {
                    Object obj = msg.obj;
                    CallsAudioDeviceInfo callsAudioDeviceInfo2 = obj instanceof CallsAudioDeviceInfo ? (CallsAudioDeviceInfo) obj : null;
                    if (callsAudioDeviceInfo2 != null) {
                        CallsAudioManagerV2Impl.this.reportAudioDeviceOnMainThreadImpl(callsAudioDeviceInfo2);
                    }
                }
            }
        };
        this.mainHandler = handler2;
        this.bluetoothManager = new CallsBluetoothManager(context, this, logger);
        this.wiredHeadsetManager = new CallsWiredHeadsetManager(context, this, logger);
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.audioManager = audioManager;
        CallsBluethoothDeviceScanner callsBluethoothDeviceScanner = new CallsBluethoothDeviceScanner(handler, this);
        callsBluethoothDeviceScanner.start(audioManager);
        this.bluetoothDeviceScanner = callsBluethoothDeviceScanner;
        this.hasEarpiece = context.getPackageManager().hasSystemFeature("android.hardware.telephony");
        this.audioFocusRequestHelper = new AudioFocusRequestHelper(audioManager, onMuteListener, handler2, handler, new AnonymousClass3(), logger, null, null, 192, null);
        logger.v(LOG_TAG, "CAM is created");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addOnAudioDeviceListChangeListenerImpl(CallsAudioManager.OnAudioDeviceListChangeListener listener) {
        if (this.isDestroyed) {
            return;
        }
        listener.onAudioDeviceListChanged(this.audioDevices);
        this.onAudioDeviceListChangeListeners.add(listener);
    }

    private final void applySelectedDevice() {
        CallsAudioDeviceInfo deviceInfo = getDeviceInfo(this.selectedDevice);
        reportAudioDeviceOnMainThread(deviceInfo);
        if (!fni.a(getCurrentDevice(), deviceInfo)) {
            setAudioDeviceInternal(deviceInfo);
        }
        doOnOwnThread$calls_audiomanager_release$default(this, "finalize device switch", null, null, new C00141(), 6, null);
    }

    private final void autoSelectAudioDevice(boolean byStopRinging) {
        selectAudioDevice(getPreferredAudioDevice(true, !byStopRinging), xc0.f("auto select (stop ringing=", byStopRinging));
    }

    public static /* synthetic */ void autoSelectAudioDevice$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        callsAudioManagerV2Impl.autoSelectAudioDevice(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeState(CallsAudioManager.State state) {
        if (this.isDestroyed) {
            return;
        }
        this.logger.v(LOG_TAG, "requested " + state);
        onCallStateChangedInternal(state);
    }

    private final void clearDeviceSelection() {
        this.logger.v(LOG_TAG, "clearing device");
        this.currentDevice = NO_DEVICE;
        this.selectedDevice = CallsAudioManager.AudioDeviceType.NONE;
        reportNewDeviceList(rd5.a);
    }

    public static /* synthetic */ void doOnOwnThread$calls_audiomanager_release$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, String str, cm6 cm6Var, em6 em6Var, cm6 cm6Var2, int i, Object obj) {
        if ((i & 2) != 0) {
            cm6Var = null;
        }
        if ((i & 4) != 0) {
            em6Var = null;
        }
        callsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release(str, cm6Var, em6Var, cm6Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doOnOwnThread$lambda$8(CallsAudioManagerV2Impl callsAudioManagerV2Impl, cm6 cm6Var, cm6 cm6Var2, String str, em6 em6Var) {
        if (callsAudioManagerV2Impl.isDestroyed) {
            return;
        }
        try {
            cm6Var.invoke();
            if (cm6Var2 != null) {
                cm6Var2.invoke();
            }
        } catch (Throwable th) {
            callsAudioManagerV2Impl.logger.e(LOG_TAG, "Error executing an action ".concat(str), th);
            if (em6Var != null) {
                em6Var.invoke(th);
            }
        }
    }

    public static /* synthetic */ void doOnOwnThreadWithDelay$calls_audiomanager_release$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, String str, cm6 cm6Var, em6 em6Var, long j, cm6 cm6Var2, int i, Object obj) {
        if ((i & 2) != 0) {
            cm6Var = null;
        }
        if ((i & 4) != 0) {
            em6Var = null;
        }
        callsAudioManagerV2Impl.doOnOwnThreadWithDelay$calls_audiomanager_release(str, cm6Var, em6Var, j, cm6Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doOnOwnThreadWithDelay$lambda$9(CallsAudioManagerV2Impl callsAudioManagerV2Impl, cm6 cm6Var, cm6 cm6Var2, String str, em6 em6Var) {
        if (callsAudioManagerV2Impl.isDestroyed) {
            return;
        }
        try {
            cm6Var.invoke();
            if (cm6Var2 != null) {
                cm6Var2.invoke();
            }
        } catch (Throwable th) {
            callsAudioManagerV2Impl.logger.e(LOG_TAG, "Error executing an action ".concat(str), th);
            if (em6Var != null) {
                em6Var.invoke(th);
            }
        }
    }

    private final String getAudioDeviceReadableName(CallsAudioManager.AudioDeviceType device) {
        int i = WhenMappings.$EnumSwitchMapping$1[device.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : CallsAudioDeviceInfo.SPEAKERPHONE : CallsAudioDeviceInfo.EARPIECE : this.wiredHeadsetManager.getConnectedDeviceName() : this.bluetoothManager.getConnectedDeviceName();
    }

    private final long getAudioDeviceSwitchDelay() {
        if (this.awaitDeviceChangeConfirmation) {
            return DELAY_USER_REQUEST_MS;
        }
        return 0L;
    }

    private final CallsAudioDeviceInfo getDeviceInfo(CallsAudioManager.AudioDeviceType device) {
        return new CallsAudioDeviceInfo(device, getAudioDeviceReadableName(device));
    }

    private final boolean getHasBluetoothHeadset() {
        return this.bluetoothManager.getHasBluetoothHeadset();
    }

    private final boolean getHasWiredHeadset() {
        return this.wiredHeadsetManager.isWiredHeadsetPlugged();
    }

    private final CallsAudioManager.AudioDeviceType getPreferredAudioDevice(boolean bluetooth, boolean respectSpeakerEnabled) {
        AudioDeviceSelector audioDeviceSelector = this.audioDeviceSelector;
        CallsAudioManager.State state = this.state;
        boolean hasWiredHeadset = getHasWiredHeadset();
        boolean z = this.hasEarpiece;
        boolean z2 = this.disabledSpeakerOnce;
        boolean z3 = this.disabledBluetoothOnce;
        Set<CallsAudioDeviceInfo> set = this.audioDevices;
        ArrayList arrayList = new ArrayList(we3.q(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallsAudioDeviceInfo) it.next()).getDeviceType());
        }
        return audioDeviceSelector.selectPreferableDevice(state, bluetooth, respectSpeakerEnabled, hasWiredHeadset, z, z2, z3, ue3.h0(arrayList), getCurrentDevice().getDeviceType(), this.videoTracker, this.proximityTracker);
    }

    public static /* synthetic */ CallsAudioManager.AudioDeviceType getPreferredAudioDevice$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return callsAudioManagerV2Impl.getPreferredAudioDevice(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final boolean hasBluetoothHeadset() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        return (Build.VERSION.SDK_INT < 31 || z7.b(this.context, "android.permission.BLUETOOTH_CONNECT") == 0) && defaultAdapter.getProfileConnectionState(1) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasWiredHeadset() {
        return this.wiredHeadsetManager.isWiredHeadsetPlugged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeRestartBluetoothManager() {
        if (this.isDestroyed) {
            return;
        }
        this.bluetoothManager.start();
    }

    private final void mute(boolean isMute) {
    }

    private final void onCallStateChangedInternal(CallsAudioManager.State state) {
        if (this.isDestroyed) {
            return;
        }
        boolean z = this.state == CallsAudioManager.State.RINGING && state == CallsAudioManager.State.CONVERSATION;
        this.state = state;
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            release();
            return;
        }
        if (i == 2 || i == 3 || i == 4) {
            if (this.audioManager.getMode() != 3) {
                savePreviousState();
                requestAudioFocus();
                startTrackingAudioDevices();
                autoSelectAudioDevice$default(this, false, 1, null);
                setAudioManagerModeSafe(3);
            }
            if (z) {
                autoSelectAudioDevice(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void release() {
        if (this.isDestroyed) {
            return;
        }
        this.logger.v(LOG_TAG, "release CAM");
        this.isDestroyed = true;
        this.proximityTracker.stopTrackingProximity();
        this.wiredHeadsetManager.stop();
        this.bluetoothManager.stop();
        this.bluetoothDeviceScanner.stop();
        clearDeviceSelection();
        restorePreviousAudioState();
        releaseAudioFocus();
        this.backgroundHandlerThread.quitSafely();
        this.onAudioDeviceChangeListener = null;
        this.onAudioDeviceListChangeListeners.clear();
    }

    private final void releaseAudioFocus() {
        this.audioFocusRequestHelper.releaseFocus();
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
        if (fni.a(this.reportedAudioDevice, device) || onAudioDeviceInfoChangeListener == null) {
            return;
        }
        this.logger.v(LOG_TAG, "reporting device change " + this.reportedAudioDevice + " -> " + device);
        onAudioDeviceInfoChangeListener.onAudioDeviceChanged(new CallsAudioManager.AudioDeviceInfoChangedEvent(this.reportedAudioDevice, device));
        this.reportedAudioDevice = device;
    }

    private final void reportNewDeviceList(Set<CallsAudioDeviceInfo> devices) {
        if (fni.a(devices, this.audioDevices)) {
            return;
        }
        this.audioDevices.clear();
        this.audioDevices.addAll(devices);
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
        if (this.savedPreviousState) {
            this.logger.v(LOG_TAG, "restoring state");
            this.savedPreviousState = false;
            try {
                AudioManager audioManager = this.audioManager;
                audioManager.setMode(this.savedAudioMode);
                audioManager.setSpeakerphoneOn(this.savedIsSpeakerPhoneOn);
                audioManager.setMicrophoneMute(this.savedIsMicrophoneMute);
            } catch (Exception e) {
                this.logger.reportError(LOG_TAG, "restorePreviousAudioState: failed", e);
            }
        }
    }

    private final void savePreviousState() {
        if (this.savedPreviousState) {
            return;
        }
        this.logger.v(LOG_TAG, "saving state");
        try {
            AudioManager audioManager = this.audioManager;
            this.savedAudioMode = audioManager.getMode();
            this.savedIsSpeakerPhoneOn = audioManager.isSpeakerphoneOn();
            this.savedIsMicrophoneMute = audioManager.isMicrophoneMute();
            this.savedPreviousState = true;
        } catch (Exception e) {
            this.logger.reportError(LOG_TAG, "savePreviousState: failed", e);
        }
    }

    private final void selectAudioDevice(CallsAudioManager.AudioDeviceType device, String reason) {
        this.logger.d(LOG_TAG, "device " + device + " requested by " + reason);
        this.deviceSwitchHelper.onDeviceSwitchRequested(device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectAudioDeviceImpl(CallsAudioManager.AudioDeviceType device) {
        Object next;
        if (device == CallsAudioManager.AudioDeviceType.BLUETOOTH_INTENT) {
            this.logger.e(LOG_TAG, "device " + device + " can never be selected. use it as trigger for permission request");
            return;
        }
        this.logger.v(LOG_TAG, "selecting " + device);
        Iterator<T> it = this.audioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((CallsAudioDeviceInfo) next).getDeviceType() == device) {
                    break;
                }
            }
        }
        if (next == null) {
            this.logger.e(LOG_TAG, "can't select " + device + " from available " + this.audioDevices);
        }
        this.selectedDevice = device;
        updateAudioDeviceState(true);
    }

    public static /* synthetic */ void selectPreferredAudioDevice$calls_audiomanager_release$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        callsAudioManagerV2Impl.selectPreferredAudioDevice$calls_audiomanager_release(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAudioDevice(CallsAudioManager.AudioDeviceType audioDevice) {
        CallsAudioManager.AudioDeviceType deviceType;
        this.logger.v(LOG_TAG, "requested " + audioDevice);
        if (this.isDestroyed || audioDevice == (deviceType = getCurrentDevice().getDeviceType())) {
            return;
        }
        CallsAudioManager.State state = this.state;
        if (state == CallsAudioManager.State.RINGING) {
            this.logger.d(LOG_TAG, "Avoid audio device update in state " + state);
            return;
        }
        boolean z = this.disabledBluetoothOnce;
        CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        this.disabledBluetoothOnce = z | (deviceType == audioDeviceType);
        boolean z2 = this.disabledSpeakerOnce;
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        this.disabledSpeakerOnce = z2 | (deviceType == audioDeviceType2);
        CallsAudioManager.AudioDeviceType audioDeviceType3 = CallsAudioManager.AudioDeviceType.NONE;
        if (deviceType == audioDeviceType3) {
            mute(false);
        }
        if (audioDevice.oneOf(audioDeviceType2, CallsAudioManager.AudioDeviceType.WIRED_HEADSET, CallsAudioManager.AudioDeviceType.EARPIECE, audioDeviceType)) {
            selectAudioDevice(audioDevice, "user request");
        }
        if (audioDevice == audioDeviceType3) {
            mute(true);
        }
    }

    private final void setAudioDeviceInternal(CallsAudioDeviceInfo device) {
        this.logger.v(LOG_TAG, "Setting " + device);
        if (this.isDestroyed) {
            return;
        }
        this.currentDevice = device;
        boolean z = device.getDeviceType() == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        AudioManager audioManager = this.audioManager;
        if (audioManager.isSpeakerphoneOn() != z) {
            audioManager.setSpeakerphoneOn(z);
        }
        updateProximityTrackingState(z);
    }

    private final void setAudioManagerModeSafe(int mode) {
        try {
            this.audioManager.setMode(mode);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't set audio manager mode", th);
        }
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
        reportAudioDeviceOnMainThread(getCurrentDevice());
    }

    private final void startTrackingAudioDevices() {
        this.logger.v(LOG_TAG, "start tracking devices");
        clearDeviceSelection();
        this.wiredHeadsetManager.start();
        this.bluetoothManager.start();
        updateAudioDeviceState(false);
    }

    private final void updateAudioDeviceState(boolean preferSelectedDevice) {
        CallsAudioManager.AudioDeviceType audioDeviceType;
        this.logger.v(LOG_TAG, "Updating device, prefer selection is " + preferSelectedDevice + "...");
        try {
            boolean hasBluetoothHeadset = this.bluetoothManager.getHasBluetoothHeadset();
            CallsAudioManager.AudioDeviceType deviceType = getCurrentDevice().getDeviceType();
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
            if (deviceType == audioDeviceType2 && !hasBluetoothHeadset) {
                this.logger.v(LOG_TAG, "BT is down, reselect");
                this.selectedDevice = getPreferredAudioDevice(false, false);
            }
            if (hasBluetoothHeadset && !preferSelectedDevice && (audioDeviceType = this.selectedDevice) != audioDeviceType2 && audioDeviceType != CallsAudioManager.AudioDeviceType.WIRED_HEADSET && !this.disabledBluetoothOnce) {
                this.logger.v(LOG_TAG, "suddenly, BT. " + audioDeviceType + " -> " + audioDeviceType2);
                this.selectedDevice = audioDeviceType2;
            }
            updateAvailableAudioDevices();
            this.logger.v(LOG_TAG, "current selected device is " + this.selectedDevice);
            CallsAudioManager.AudioDeviceType audioDeviceType3 = this.selectedDevice;
            if (audioDeviceType3 == audioDeviceType2) {
                if (!this.bluetoothManager.isBluetoothOn() && !this.bluetoothManager.startScoAudio()) {
                    CallsAudioManager.AudioDeviceType preferredAudioDevice = getPreferredAudioDevice(false, true);
                    this.selectedDevice = preferredAudioDevice;
                    this.logger.e(LOG_TAG, "failed to start bluetooth, so selected other preferred device: " + preferredAudioDevice);
                }
            } else if (audioDeviceType3 != CallsAudioManager.AudioDeviceType.NONE) {
                this.bluetoothManager.stopScoAudio();
            }
            applySelectedDevice();
        } catch (Throwable th) {
            applySelectedDevice();
            throw th;
        }
    }

    private final void updateAvailableAudioDevices() {
        this.logger.v(LOG_TAG, "updating available devices");
        EnumSet enumSetNoneOf = EnumSet.noneOf(CallsAudioManager.AudioDeviceType.class);
        if (getHasBluetoothHeadset()) {
            enumSetNoneOf.add(CallsAudioManager.AudioDeviceType.BLUETOOTH);
        }
        if (getHasWiredHeadset()) {
            enumSetNoneOf.add(CallsAudioManager.AudioDeviceType.WIRED_HEADSET);
        } else if (this.hasEarpiece) {
            enumSetNoneOf.add(CallsAudioManager.AudioDeviceType.EARPIECE);
        }
        enumSetNoneOf.add(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
        ArrayList arrayList = new ArrayList(we3.q(enumSetNoneOf, 10));
        Iterator it = enumSetNoneOf.iterator();
        while (it.hasNext()) {
            arrayList.add(getDeviceInfo((CallsAudioManager.AudioDeviceType) it.next()));
        }
        reportNewDeviceList(ue3.h0(arrayList));
        this.logger.v(LOG_TAG, "updated devices: " + enumSetNoneOf);
    }

    private final void updateProximityTrackingState(boolean speakerOn) {
        boolean z = getCurrentDevice().getDeviceType() == CallsAudioManager.AudioDeviceType.BLUETOOTH || getHasWiredHeadset() || (speakerOn && !this.trackProximityWhenSpeakerEnabled);
        this.logger.v(LOG_TAG, "proximity disabled? " + z + ", speaker? " + speakerOn);
        if (z) {
            this.proximityTracker.stopTrackingProximity();
        } else {
            this.proximityTracker.startTrackingProximity();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void addOnAudioDeviceListChangeListener(CallsAudioManager.OnAudioDeviceListChangeListener listener) {
        doOnOwnThread$calls_audiomanager_release$default(this, "addOnAudioDeviceListChangeListener", null, null, new C00131(listener), 6, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void changeStateAsync(CallsAudioManager.State state, cm6 onComplete, em6 onError) {
        doOnOwnThread$calls_audiomanager_release("changeState", onComplete, onError, new C00151(state));
    }

    public final void doOnOwnThread$calls_audiomanager_release(String action, cm6 onComplete, em6 onError, cm6 block) {
        if (this.isDestroyed) {
            return;
        }
        this.workerThreadHandler.post(new cv1(this, block, onComplete, action, onError, 1));
    }

    public final void doOnOwnThreadWithDelay$calls_audiomanager_release(String action, cm6 onComplete, em6 onError, long delayMillis, cm6 block) {
        if (this.isDestroyed) {
            return;
        }
        this.workerThreadHandler.postDelayed(new cv1(this, block, onComplete, action, onError, 0), delayMillis);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public List<CallsAudioDeviceInfo> getAvailableAudioDevices() {
        return ue3.d0(this.audioDevices);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public CallsAudioDeviceInfo getCurrentDevice() {
        return this.currentDevice;
    }

    /* renamed from: getWorkerThreadHandler$calls_audiomanager_release, reason: from getter */
    public final Handler getWorkerThreadHandler() {
        return this.workerThreadHandler;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void hasBluetoothHeadsetAsync(em6 onSuccess, em6 onError) {
        doOnOwnThread$calls_audiomanager_release$default(this, "hasBluetoothHeadset", null, onError, new C00161(onSuccess, this), 2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void hasWiredHeadsetAsync(em6 onSuccess, em6 onError) {
        doOnOwnThread$calls_audiomanager_release$default(this, "hasWiredHeadset", null, onError, new C00171(onSuccess, this), 2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public boolean isHeadsetConnected() {
        return getCurrentDevice().getDeviceType().isHeadsetDevice();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void notifyBluetoothPermissionGranted() {
        doOnOwnThread$calls_audiomanager_release$default(this, "refreshPermissions", null, null, new C00181(), 6, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner.Listener
    public boolean onDeviceAvailable(CallsBluethoothDeviceScanner.BluetoothDeviceIntent device) {
        this.logger.d(LOG_TAG, "Bluetooth device added: " + device);
        updateAvailableAudioDevices();
        return true;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner.Listener
    public boolean onDeviceUnavailable(CallsBluethoothDeviceScanner.BluetoothDeviceIntent device) {
        this.logger.d(LOG_TAG, "Bluetooth device removed: " + device);
        updateAvailableAudioDevices();
        return true;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void releaseAsync(cm6 onComplete, em6 onError) {
        doOnOwnThread$calls_audiomanager_release("release", onComplete, onError, new C00191());
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void removeOnAudioDeviceListChangeListener(CallsAudioManager.OnAudioDeviceListChangeListener listener) {
        doOnOwnThread$calls_audiomanager_release$default(this, "removeOnAudioDeviceListChangeListener", null, null, new C00201(listener), 6, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void requestAudioFocusAsync() {
        doOnOwnThread$calls_audiomanager_release("requestAudioFocus", new C00211(), new AnonymousClass2(), new C00223());
    }

    public final void selectPreferredAudioDevice$calls_audiomanager_release(boolean withBluetooth) {
        selectAudioDevice(getPreferredAudioDevice(withBluetooth, true), "set preferred device");
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setAudioDeviceAsync(CallsAudioDeviceInfo audioDevice, cm6 onComplete, em6 onError) {
        doOnOwnThreadWithDelay$calls_audiomanager_release("setAudioDevice", onComplete, onError, getAudioDeviceSwitchDelay(), new C00231(audioDevice));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setAudioDeviceTypeAsync(CallsAudioManager.AudioDeviceType audioDevice, cm6 onComplete, em6 onError) {
        doOnOwnThreadWithDelay$calls_audiomanager_release("setAudioDevice", onComplete, onError, getAudioDeviceSwitchDelay(), new C00241(audioDevice));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setOnAudioDeviceChangeListener(CallsAudioManager.OnAudioDeviceInfoChangeListener listener) {
        doOnOwnThread$calls_audiomanager_release$default(this, "setOnAudioDeviceChangeListener", null, null, new C00251(listener), 6, null);
    }

    public final void setSpeakerEnabled$calls_audiomanager_release(boolean enabled, boolean byVideoTurnedOn) {
        this.logger.v(LOG_TAG, xc0.g("requested speaker ", enabled, " (", byVideoTurnedOn, ")"));
        if (this.isDestroyed) {
            return;
        }
        if (enabled && (byVideoTurnedOn || !this.disabledSpeakerOnce)) {
            CallsAudioDeviceInfo currentDevice = getCurrentDevice();
            CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            if (currentDevice.oneOf$calls_audiomanager_release(audioDeviceType, audioDeviceType2) && this.proximityTracker.getCanUseSpeaker()) {
                selectAudioDevice(audioDeviceType2, "speaker enabled");
                return;
            }
        }
        selectAudioDevice(getPreferredAudioDevice(true, false), "speaker disabled");
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setSpeakerEnabledAsync(boolean enabled, boolean byVideoTurnedOn, cm6 onComplete, em6 onError) {
        doOnOwnThreadWithDelay$calls_audiomanager_release("setSpeakerEnabled", onComplete, onError, getAudioDeviceSwitchDelay(), new C00261(enabled, byVideoTurnedOn));
    }

    public final void updateAudioDeviceState$calls_audiomanager_release() {
        updateAudioDeviceState(false);
    }
}

package ru.ok.android.externcalls.sdk.audio.internal;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import defpackage.cm6;
import defpackage.j30;
import defpackage.qqg;
import defpackage.t30;
import defpackage.tk4;
import defpackage.u08;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0007¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\"\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "", "Landroid/media/AudioManager;", "audioManager", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "onMuteListener", "Landroid/os/Handler;", "mainThreadHandler", "workerThreadHandler", "Lkotlin/Function0;", "", "isDestroyed", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "Lqqg;", "onFocusLost", "onFocusGained", "<init>", "(Landroid/media/AudioManager;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;Landroid/os/Handler;Landroid/os/Handler;Lcm6;Lru/ok/android/externcalls/sdk/audio/Logger;Lcm6;Lcm6;)V", "T", "context", "", "requestResult", "handleAudioFocusRequestResult", "(Ljava/lang/Object;I)Ljava/lang/Object;", "mute", "()V", "muteForever", "unmute", "focusGained", "forever", "handleFocusUpdate", "(ZZ)V", "requestFocus", "releaseFocus", "Landroid/media/AudioManager;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "Landroid/os/Handler;", "Lcm6;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "Landroid/media/AudioFocusRequest;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "isFocusGained", "Z", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioFocusRequestHelper {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final long RE_REQUEST_FOCUS_DELAY_MILLIS = 2000;

    @Deprecated
    public static final String TAG = "AudioFocusRequestHelper";
    private AudioManager.OnAudioFocusChangeListener audioFocusListener;
    private AudioFocusRequest audioFocusRequest;
    private final AudioManager audioManager;
    private final cm6 isDestroyed;
    private boolean isFocusGained;
    private final Logger logger;
    private final Handler mainThreadHandler;
    private final cm6 onFocusGained;
    private final cm6 onFocusLost;
    private final CallsAudioManager.OnMuteListener onMuteListener;
    private final Handler workerThreadHandler;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements cm6 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m101invoke() {
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m101invoke();
            return qqg.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper$2, reason: invalid class name */
    public static final class AnonymousClass2 extends u08 implements cm6 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m102invoke() {
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m102invoke();
            return qqg.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper$Companion;", "", "()V", "RE_REQUEST_FOCUS_DELAY_MILLIS", "", "TAG", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    public AudioFocusRequestHelper(AudioManager audioManager, CallsAudioManager.OnMuteListener onMuteListener, Handler handler, Handler handler2, cm6 cm6Var, Logger logger, cm6 cm6Var2, cm6 cm6Var3) {
        this.audioManager = audioManager;
        this.onMuteListener = onMuteListener;
        this.mainThreadHandler = handler;
        this.workerThreadHandler = handler2;
        this.isDestroyed = cm6Var;
        this.logger = logger;
        this.onFocusLost = cm6Var2;
        this.onFocusGained = cm6Var3;
    }

    private final <T> T handleAudioFocusRequestResult(T context, int requestResult) {
        try {
            if (requestResult == 1) {
                handleFocusUpdate$default(this, true, false, 2, null);
                this.logger.d(TAG, "Audio focus request granted");
                return context;
            }
            this.workerThreadHandler.postDelayed(new t30(this, 3), 2000L);
            this.logger.d(TAG, "Audio focus request failed");
            handleFocusUpdate$default(this, false, false, 2, null);
            return null;
        } catch (Throwable th) {
            this.logger.e(TAG, "Audio focus request failed with error", th);
            handleFocusUpdate$default(this, false, false, 2, null);
            return null;
        }
    }

    private final void handleFocusUpdate(boolean focusGained, boolean forever) {
        if (this.isFocusGained == focusGained) {
            this.logger.d(TAG, "Focus state didn't change, ignore update to " + focusGained);
            return;
        }
        this.isFocusGained = focusGained;
        if (focusGained) {
            this.onFocusGained.invoke();
            unmute();
            return;
        }
        this.onFocusLost.invoke();
        if (forever) {
            muteForever();
        } else {
            mute();
        }
    }

    public static /* synthetic */ void handleFocusUpdate$default(AudioFocusRequestHelper audioFocusRequestHelper, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        audioFocusRequestHelper.handleFocusUpdate(z, z2);
    }

    private final void mute() {
        if (((Boolean) this.isDestroyed.invoke()).booleanValue()) {
            return;
        }
        this.mainThreadHandler.post(new t30(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mute$lambda$4(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener != null) {
            try {
                onMuteListener.onMute(true);
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise mute event", th);
            }
        }
    }

    private final void muteForever() {
        if (((Boolean) this.isDestroyed.invoke()).booleanValue()) {
            return;
        }
        this.mainThreadHandler.post(new t30(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void muteForever$lambda$6(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener != null) {
            try {
                onMuteListener.onMutedForever();
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise mute forever event", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestFocus$lambda$0(AudioFocusRequestHelper audioFocusRequestHelper, int i) {
        audioFocusRequestHelper.logger.d(TAG, i != -3 ? i != -2 ? i != -1 ? i != 1 ? String.valueOf(i) : "AUDIOFOCUS_GAIN" : "AUDIOFOCUS_LOSS" : "AUDIOFOCUS_LOSS_TRANSIENT" : "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
        if (i == -3 || i == -2) {
            handleFocusUpdate$default(audioFocusRequestHelper, false, false, 2, null);
            return;
        }
        if (i == -1) {
            audioFocusRequestHelper.handleFocusUpdate(false, true);
            return;
        }
        if (i == 1) {
            handleFocusUpdate$default(audioFocusRequestHelper, true, false, 2, null);
            return;
        }
        audioFocusRequestHelper.logger.e(TAG, "Unexpected audio focus change " + i);
    }

    private final void unmute() {
        if (((Boolean) this.isDestroyed.invoke()).booleanValue()) {
            return;
        }
        this.mainThreadHandler.post(new t30(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unmute$lambda$8(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener != null) {
            try {
                onMuteListener.onMute(false);
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise unmute event", th);
            }
        }
    }

    public final void releaseFocus() {
        this.logger.d(TAG, "Release audio focus");
        try {
            AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
            if (audioFocusRequest != null) {
                this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } catch (Throwable th) {
            this.logger.e(TAG, "Error while releasing audio focus request", th);
        }
        this.audioFocusRequest = null;
        this.audioFocusListener = null;
        this.isFocusGained = false;
    }

    public final void requestFocus() {
        if (this.isFocusGained) {
            this.logger.d(TAG, "Focus is already gained, ignore request");
            return;
        }
        this.logger.d(TAG, "Request audio focus. O+=true");
        releaseFocus();
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(2).setAcceptsDelayedFocusGain(false).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setOnAudioFocusChangeListener(new j30(1, this), this.workerThreadHandler).build();
        this.audioFocusRequest = (AudioFocusRequest) handleAudioFocusRequestResult(audioFocusRequestBuild, this.audioManager.requestAudioFocus(audioFocusRequestBuild));
    }

    public /* synthetic */ AudioFocusRequestHelper(AudioManager audioManager, CallsAudioManager.OnMuteListener onMuteListener, Handler handler, Handler handler2, cm6 cm6Var, Logger logger, cm6 cm6Var2, cm6 cm6Var3, int i, tk4 tk4Var) {
        this(audioManager, onMuteListener, handler, handler2, cm6Var, logger, (i & 64) != 0 ? AnonymousClass1.INSTANCE : cm6Var2, (i & 128) != 0 ? AnonymousClass2.INSTANCE : cm6Var3);
    }
}

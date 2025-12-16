package com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.h;
import com.squareup.anvil.annotations.ContributesBinding;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.webrtc.MediaStreamTrack;

/* compiled from: IacRingtonePlayer.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/h;", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/f;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class h implements f {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f165888d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final Uri f165889e = Settings.System.DEFAULT_RINGTONE_URI;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f165890a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public MediaPlayer f165891b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AudioManager f165892c;

    /* compiled from: IacRingtonePlayer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/h$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "ringtoneUri", "Landroid/net/Uri;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public h(@Y61.k Context context) {
        this.f165890a = context;
        this.f165892c = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.f
    public final void start() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        StringBuilder sb2 = new StringBuilder("Start playing ringtone. Volume=");
        AudioManager audioManager = this.f165892c;
        int streamVolume = audioManager.getStreamVolume(2);
        int streamMaxVolume = audioManager.getStreamMaxVolume(2);
        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(2) : 0;
        sb2.append((int) (((streamVolume - streamMinVolume) * 100.0d) / (streamMaxVolume - streamMinVolume)));
        bVar.a("IacRingtonePlayer", sb2.toString(), null);
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f165891b = mediaPlayer;
            mediaPlayer.setLooping(true);
            MediaPlayer mediaPlayer2 = this.f165891b;
            a aVar = f165888d;
            if (mediaPlayer2 != null) {
                aVar.getClass();
                mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setUsage(6).build());
            }
            MediaPlayer mediaPlayer3 = this.f165891b;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setDataSource(this.f165890a, f165889e);
            }
            MediaPlayer mediaPlayer4 = this.f165891b;
            if (mediaPlayer4 != null) {
                mediaPlayer4.prepareAsync();
            }
            MediaPlayer mediaPlayer5 = this.f165891b;
            if (mediaPlayer5 != null) {
                mediaPlayer5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.g
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer6) {
                        h hVar = this.f165887b;
                        h.a aVar2 = h.f165888d;
                        try {
                            MediaPlayer mediaPlayer7 = hVar.f165891b;
                            if (mediaPlayer7 != null) {
                                mediaPlayer7.start();
                            }
                        } catch (Throwable th2) {
                            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacRingtonePlayer", "Error on starting ringtone", th2);
                            MediaPlayer mediaPlayer8 = hVar.f165891b;
                            if (mediaPlayer8 != null) {
                                mediaPlayer8.release();
                            }
                            hVar.f165891b = null;
                        }
                    }
                });
            }
            AudioFocusRequest.Builder acceptsDelayedFocusGain = new AudioFocusRequest.Builder(1).setAcceptsDelayedFocusGain(false);
            aVar.getClass();
            audioManager.requestAudioFocus(acceptsDelayedFocusGain.setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setUsage(6).build()).build());
        } catch (Exception unused) {
            MediaPlayer mediaPlayer6 = this.f165891b;
            if (mediaPlayer6 != null) {
                mediaPlayer6.release();
            }
            this.f165891b = null;
        }
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.f
    public final void stop() throws IllegalStateException {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacRingtonePlayer", "Stop playing ringtone", null);
        try {
            MediaPlayer mediaPlayer = this.f165891b;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.f165891b;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.f165891b = null;
        } catch (Exception e12) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacRingtonePlayer", "Error on stopping player", e12);
        }
    }
}

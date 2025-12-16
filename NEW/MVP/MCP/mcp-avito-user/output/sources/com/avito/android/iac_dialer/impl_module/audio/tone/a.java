package com.avito.android.iac_dialer.impl_module.audio.tone;

import JK.e;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacToneMediaPlayerWrapper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/tone/a;", "", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AudioManager f165914a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f165915b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f165916c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f165917d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f165918e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final MediaPlayer f165919f;

    /* compiled from: IacToneMediaPlayerWrapper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/tone/a$a;", "", "<init>", "()V", "", "DELAY_BETWEEN_ATTEMPTS_MILLIS", "J", "", "MAX_ATTEMPTS_TO_START", "I", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.audio.tone.a$a, reason: collision with other inner class name */
    public static final class C4917a {
        public /* synthetic */ C4917a(C42822w c42822w) {
            this();
        }

        public C4917a() {
        }
    }

    static {
        new C4917a(null);
    }

    public a(@k Context context, @k AudioManager audioManager, @k InterfaceC35745a5 interfaceC35745a5) {
        IacToneType iacToneType = IacToneType.f165911c;
        this.f165914a = audioManager;
        this.f165915b = interfaceC35745a5;
        String str = "IacTonePlayer_" + iacToneType;
        this.f165916c = str;
        MediaPlayer mediaPlayerCreate = MediaPlayer.create(context, R.raw.iac_dialer_impl_tone_signal, new AudioAttributes.Builder().setContentType(4).setUsage(2).setLegacyStreamType(0).build(), 0);
        if (mediaPlayerCreate != null) {
            mediaPlayerCreate.setLooping(true);
        } else {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d(str, "MediaPlayer creation failed.", null);
            mediaPlayerCreate = null;
        }
        this.f165919f = mediaPlayerCreate;
    }

    public final void a(int i12) throws IllegalStateException {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        StringBuilder sbJ = G.j(i12, "startIfPossible(attempt=", "), isStartRequested=");
        sbJ.append(this.f165918e);
        String string = sbJ.toString();
        String str = this.f165916c;
        bVar.a(str, string, null);
        if (i12 == 1) {
            this.f165918e = true;
        } else if (!this.f165918e) {
            return;
        }
        MediaPlayer mediaPlayer = this.f165919f;
        if (mediaPlayer == null) {
            bVar.d(str, "Can't start playing cause player == null", null);
            return;
        }
        if (this.f165917d) {
            bVar.d(str, "Can't start playing cause player is already started", null);
            return;
        }
        AudioManager audioManager = this.f165914a;
        audioManager.setMode(3);
        int mode = audioManager.getMode();
        StringBuilder sb2 = new StringBuilder("audioMode=");
        e.f8872a.getClass();
        sb2.append(e.a(mode));
        bVar.a(str, sb2.toString(), null);
        if (mode != 3) {
            bVar.d(str, r.p("audioMode != MODE_IN_COMMUNICATION -> tone will not be started (attempt=", i12, ')'), null);
            if (i12 <= 6) {
                A1.g(I.q(G0.f406611a).g(250L, TimeUnit.MILLISECONDS, this.f165915b.c()), null, new b(this, i12 + 1), 1);
                return;
            }
            return;
        }
        if (i12 > 1) {
            bVar.a(str, r.p("audioMode == MODE_IN_COMMUNICATION -> tone will be started (attempt=", i12, ')'), null);
        }
        this.f165917d = true;
        mediaPlayer.start();
        bVar.a(str, "player.start()", null);
    }
}

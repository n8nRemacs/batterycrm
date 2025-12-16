package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.audio.AudioSink;
import j.InterfaceC42164u;
import j.P;
import j.X;
import org.webrtc.MediaStreamTrack;

/* compiled from: AudioCapabilitiesReceiver.java */
@J
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f48863a;

    /* renamed from: b, reason: collision with root package name */
    public final Ae0.c f48864b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f48865c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final c f48866d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final BroadcastReceiver f48867e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final d f48868f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public androidx.media3.exoplayer.audio.a f48869g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f48870h;

    /* compiled from: AudioCapabilitiesReceiver.java */
    @X
    /* renamed from: androidx.media3.exoplayer.audio.b$b, reason: collision with other inner class name */
    public static final class C1825b {
        @InterfaceC42164u
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            audioManager.getClass();
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        @InterfaceC42164u
        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            audioManager.getClass();
            audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    @X
    public final class c extends AudioDeviceCallback {
        public c(a aVar) {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            b bVar = b.this;
            b.a(bVar, androidx.media3.exoplayer.audio.a.b(bVar.f48863a));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            b bVar = b.this;
            b.a(bVar, androidx.media3.exoplayer.audio.a.b(bVar.f48863a));
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    public final class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f48872a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f48873b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f48872a = contentResolver;
            this.f48873b = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z12) {
            b bVar = b.this;
            b.a(bVar, androidx.media3.exoplayer.audio.a.b(bVar.f48863a));
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    public final class e extends BroadcastReceiver {
        public e(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            b.a(b.this, androidx.media3.exoplayer.audio.a.c(context, intent));
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    public interface f {
    }

    public b(Context context, Ae0.c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f48863a = applicationContext;
        this.f48864b = cVar;
        int i12 = M.f47887a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f48865c = handler;
        int i13 = M.f47887a;
        this.f48866d = i13 >= 23 ? new c(null) : null;
        this.f48867e = i13 >= 21 ? new e(null) : null;
        Uri uriFor = androidx.media3.exoplayer.audio.a.a() ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f48868f = uriFor != null ? new d(handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public static void a(b bVar, androidx.media3.exoplayer.audio.a aVar) {
        if (!bVar.f48870h || aVar.equals(bVar.f48869g)) {
            return;
        }
        bVar.f48869g = aVar;
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) bVar.f48864b.f547c;
        C23110a.g(defaultAudioSink.f48807f0 == Looper.myLooper());
        if (aVar.equals(defaultAudioSink.h())) {
            return;
        }
        defaultAudioSink.f48824w = aVar;
        AudioSink.a aVar2 = defaultAudioSink.f48819r;
        if (aVar2 != null) {
            aVar2.f();
        }
    }
}

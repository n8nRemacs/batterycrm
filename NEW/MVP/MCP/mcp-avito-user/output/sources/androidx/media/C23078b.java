package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import j.InterfaceC42164u;
import j.X;

/* compiled from: AudioManagerCompat.java */
/* renamed from: androidx.media.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23078b {

    /* compiled from: AudioManagerCompat.java */
    @X
    /* renamed from: androidx.media.b$a */
    public static class a {
        @InterfaceC42164u
        public static boolean a(AudioManager audioManager) {
            return audioManager.isVolumeFixed();
        }
    }

    /* compiled from: AudioManagerCompat.java */
    @X
    /* renamed from: androidx.media.b$b, reason: collision with other inner class name */
    public static class C1811b {
        @InterfaceC42164u
        public static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        @InterfaceC42164u
        public static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    /* compiled from: AudioManagerCompat.java */
    @X
    /* renamed from: androidx.media.b$c */
    public static class c {
        @InterfaceC42164u
        public static int a(AudioManager audioManager, int i12) {
            return audioManager.getStreamMinVolume(i12);
        }
    }
}

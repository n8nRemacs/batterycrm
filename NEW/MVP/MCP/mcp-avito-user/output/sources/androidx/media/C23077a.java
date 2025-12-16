package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;
import androidx.media.AudioAttributesCompat;
import j.InterfaceC42164u;
import j.X;
import java.util.Objects;

/* compiled from: AudioFocusRequestCompat.java */
/* renamed from: androidx.media.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23077a {

    /* compiled from: AudioFocusRequestCompat.java */
    @X
    /* renamed from: androidx.media.a$a, reason: collision with other inner class name */
    public static class C1809a {
        @InterfaceC42164u
        public static AudioFocusRequest a(int i12, AudioAttributes audioAttributes, boolean z12, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i12).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z12).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    /* compiled from: AudioFocusRequestCompat.java */
    /* renamed from: androidx.media.a$b */
    public static final class b {
    }

    /* compiled from: AudioFocusRequestCompat.java */
    /* renamed from: androidx.media.a$c */
    public static class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 2782386) {
                return false;
            }
            throw null;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i12) {
            Message.obtain(null, 2782386, i12, 0);
            throw null;
        }
    }

    static {
        AudioAttributesCompat.d dVar = new AudioAttributesCompat.d();
        dVar.e(1);
        dVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23077a)) {
            return false;
        }
        ((C23077a) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Objects.hash(0, null, null, null, Boolean.FALSE);
    }
}

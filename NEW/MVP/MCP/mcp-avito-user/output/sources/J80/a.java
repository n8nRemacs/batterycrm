package J80;

import Y61.k;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;

/* compiled from: AudioManagerUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_player-core_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {
    public static final void a(@k Context context) {
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            audioManager.requestAudioFocus(new AudioFocusRequest.Builder(4).build());
        }
    }

    public static final void b(@k Context context) {
        ((AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).abandonAudioFocusRequest(new AudioFocusRequest.Builder(4).build());
    }
}

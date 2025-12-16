package defpackage;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public final class qx8 extends MediaController.Callback {
    public final WeakReference a;

    public qx8(py8 py8Var) {
        this.a = new WeakReference(py8Var);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        py8 py8Var = (py8) this.a.get();
        if (py8Var == null || playbackInfo == null) {
            return;
        }
        int playbackType = playbackInfo.getPlaybackType();
        AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
        l20 l20Var = new l20();
        l20Var.a = audioAttributes;
        py8Var.a(new vx8(playbackType, new m20(l20Var), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        h79.w(bundle);
        py8 py8Var = (py8) this.a.get();
        if (py8Var != null) {
            py8Var.c(bundle);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        x19 x19VarCreateFromParcel;
        py8 py8Var = (py8) this.a.get();
        if (py8Var != null) {
            us usVar = x19.c;
            if (mediaMetadata != null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                x19VarCreateFromParcel = x19.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                x19VarCreateFromParcel.b = mediaMetadata;
            } else {
                x19VarCreateFromParcel = null;
            }
            py8Var.d(x19VarCreateFromParcel);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        py8 py8Var = (py8) this.a.get();
        if (py8Var == null || py8Var.c != null) {
            return;
        }
        py8Var.e(f3c.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        py8 py8Var = (py8) this.a.get();
        if (py8Var != null) {
            py8Var.f(e79.a(list));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        py8 py8Var = (py8) this.a.get();
        if (py8Var != null) {
            py8Var.g(charSequence);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        py8 py8Var = (py8) this.a.get();
        if (py8Var != null) {
            py8Var.e.b.w();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        h79.w(bundle);
        py8 py8Var = (py8) this.a.get();
        if (py8Var != null) {
            py8Var.h(str, bundle);
        }
    }
}

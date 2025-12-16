package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* loaded from: classes.dex */
public final class v20 extends AudioDeviceCallback {
    public final /* synthetic */ x20 a;

    public v20(x20 x20Var) {
        this.a = x20Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        x20 x20Var = this.a;
        x20Var.a(u20.b((Context) x20Var.b, (k20) x20Var.j, (ao6) x20Var.i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        x20 x20Var = this.a;
        if (zxg.l(audioDeviceInfoArr, (ao6) x20Var.i)) {
            x20Var.i = null;
        }
        x20Var.a(u20.b((Context) x20Var.b, (k20) x20Var.j, (ao6) x20Var.i));
    }
}

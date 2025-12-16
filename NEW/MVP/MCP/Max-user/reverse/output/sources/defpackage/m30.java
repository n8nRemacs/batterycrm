package defpackage;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class m30 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final /* synthetic */ n30 b;

    public m30(n30 n30Var, Handler handler) {
        this.b = n30Var;
        this.a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.a.post(new l30(this, i, 0));
    }
}

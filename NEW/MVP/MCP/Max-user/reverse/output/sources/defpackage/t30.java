package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;

/* loaded from: classes2.dex */
public final /* synthetic */ class t30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioFocusRequestHelper b;

    public /* synthetic */ t30(AudioFocusRequestHelper audioFocusRequestHelper, int i) {
        this.a = i;
        this.b = audioFocusRequestHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AudioFocusRequestHelper.muteForever$lambda$6(this.b);
                break;
            case 1:
                AudioFocusRequestHelper.mute$lambda$4(this.b);
                break;
            case 2:
                AudioFocusRequestHelper.unmute$lambda$8(this.b);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}

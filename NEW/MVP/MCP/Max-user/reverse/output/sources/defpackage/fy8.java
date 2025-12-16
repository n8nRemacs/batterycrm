package defpackage;

import androidx.media3.common.PlaybackException;

/* loaded from: classes.dex */
public final /* synthetic */ class fy8 implements pa8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlaybackException b;

    public /* synthetic */ fy8(int i, PlaybackException playbackException) {
        this.a = i;
        this.b = playbackException;
    }

    @Override // defpackage.pa8, defpackage.oa8
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((r3c) obj).C0(this.b);
                break;
            case 1:
                ((r3c) obj).L0(this.b);
                break;
            case 2:
                ((r3c) obj).C0(this.b);
                break;
            default:
                ((r3c) obj).L0(this.b);
                break;
        }
    }
}

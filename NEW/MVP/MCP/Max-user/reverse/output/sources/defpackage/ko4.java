package defpackage;

import android.media.MediaMuxer;
import androidx.media3.muxer.MuxerException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ko4 implements p9a {
    public final wha a = new wha(20);

    @Override // defpackage.p9a
    public final zjd a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.p9a
    public final s9a b(String str) throws MuxerException {
        try {
            return new lo4(new mk6(new MediaMuxer(str, 0)));
        } catch (IOException e) {
            throw new MuxerException("Error creating muxer", e);
        }
    }
}

package defpackage;

import androidx.media3.muxer.MuxerException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class oh7 implements p9a {
    @Override // defpackage.p9a
    public final zjd a(int i) {
        if (i == 2) {
            return w3a.Y;
        }
        if (i == 1) {
            return w3a.Z;
        }
        t76 t76Var = wg7.b;
        return zjd.o;
    }

    @Override // defpackage.p9a
    public final s9a b(String str) throws MuxerException {
        try {
            return new ph7(new w3a(new FileOutputStream(str)));
        } catch (FileNotFoundException e) {
            throw new MuxerException("Error creating file output stream", e);
        }
    }
}

package v21;

import j.N;

/* compiled from: DivImageLoader.java */
/* loaded from: classes7.dex */
public interface c {
    @N
    e loadImage(@N String str, @N b bVar);

    @N
    default e loadImage(@N String str, @N b bVar, int i12) {
        return loadImage(str, bVar);
    }

    @N
    e loadImageBytes(@N String str, @N b bVar);

    @N
    default e loadImageBytes(@N String str, @N b bVar, int i12) {
        return loadImageBytes(str, bVar);
    }
}

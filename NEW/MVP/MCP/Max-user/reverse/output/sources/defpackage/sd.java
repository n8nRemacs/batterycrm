package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* loaded from: classes.dex */
public final class sd implements jf7 {
    public final Image a;
    public final h08[] b;
    public final ja0 c;

    public sd(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new h08[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new h08(2, planes[i]);
            }
        } else {
            this.b = new h08[0];
        }
        this.c = new ja0(ryf.b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // defpackage.jf7
    public final Image V() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.jf7
    public final int getFormat() {
        return this.a.getFormat();
    }

    @Override // defpackage.jf7
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.jf7
    public final qe7 getImageInfo() {
        return this.c;
    }

    @Override // defpackage.jf7
    public final int getWidth() {
        return this.a.getWidth();
    }

    @Override // defpackage.jf7
    public final h08[] s() {
        return this.b;
    }
}

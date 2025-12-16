package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class ie7 {
    public static final ie7 c = new ie7(new i5i(22));
    public final Bitmap.Config a;
    public final Bitmap.Config b;

    public ie7(i5i i5iVar) {
        this.a = (Bitmap.Config) i5iVar.a;
        this.b = (Bitmap.Config) i5iVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ie7 ie7Var = (ie7) obj;
        return this.a == ie7Var.a && this.b == ie7Var.b;
    }

    public final int hashCode() {
        int iOrdinal = (this.a.ordinal() - 552645669) * 31;
        Bitmap.Config config = this.b;
        return (iOrdinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDecodeOptions{");
        hc8 hc8VarC = yyi.c(this);
        hc8VarC.c(100, "minDecodeIntervalMs");
        hc8VarC.c(Integer.MAX_VALUE, "maxDimensionPx");
        hc8VarC.p("decodePreviewFrame", false);
        hc8VarC.p("useLastFrameForPreview", false);
        hc8VarC.p("useEncodedImageForPreview", false);
        hc8VarC.p("decodeAllFrames", false);
        hc8VarC.p("forceStaticImage", false);
        hc8VarC.r(this.a.name(), "bitmapConfigName");
        hc8VarC.r(this.b.name(), "animatedBitmapConfigName");
        hc8VarC.r(null, "customImageDecoder");
        hc8VarC.r(null, "bitmapTransformation");
        hc8VarC.r(null, "colorSpace");
        return ho7.l(sb, hc8VarC.toString(), "}");
    }
}

package UW0;

import I41.h;
import android.graphics.Bitmap;
import com.facebook.common.internal.n;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ImageDecodeOptions.java */
@J41.b
@Nullsafe
/* loaded from: classes12.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f16407c = new b(new c());

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f16408a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f16409b;

    public b(c cVar) {
        this.f16408a = cVar.f16410a;
        this.f16409b = cVar.f16411b;
    }

    public final boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16408a == bVar.f16408a && this.f16409b == bVar.f16409b;
    }

    public final int hashCode() {
        int iOrdinal = (this.f16408a.ordinal() + 674909381) * 31;
        Bitmap.Config config = this.f16409b;
        return (iOrdinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageDecodeOptions{");
        n.b bVarB = n.b(this);
        bVarB.b(String.valueOf(100), "minDecodeIntervalMs");
        bVarB.b(String.valueOf(Integer.MAX_VALUE), "maxDimensionPx");
        bVarB.a("decodePreviewFrame", false);
        bVarB.a("useLastFrameForPreview", false);
        bVarB.a("decodeAllFrames", false);
        bVarB.a("forceStaticImage", false);
        bVarB.b(this.f16408a.name(), "bitmapConfigName");
        bVarB.b(this.f16409b.name(), "animatedBitmapConfigName");
        bVarB.b(null, "customImageDecoder");
        bVarB.b(null, "bitmapTransformation");
        bVarB.b(null, "colorSpace");
        return AK.c.s(sb2, bVarB.toString(), "}");
    }
}

package u80;

import Y61.k;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;

/* compiled from: ByteArrays.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_photo-camera-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: u80.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48862a {
    public static final float a(@k byte[] bArr) {
        int iE2 = new androidx.exifinterface.media.a(new ByteArrayInputStream(bArr)).e(1, "Orientation");
        if (iE2 == 3) {
            return 180.0f;
        }
        if (iE2 != 6) {
            return iE2 != 8 ? 0.0f : 270.0f;
        }
        return 90.0f;
    }
}

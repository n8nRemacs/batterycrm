package coil.decode;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: ExifUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Set<String> f58300a = C42756l.l0(new String[]{"image/jpeg", "image/webp", "image/heic", "image/heif"});

    /* compiled from: ExifUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ExifOrientationPolicy.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ExifOrientationPolicy exifOrientationPolicy = ExifOrientationPolicy.f58274b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ExifOrientationPolicy exifOrientationPolicy2 = ExifOrientationPolicy.f58274b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}

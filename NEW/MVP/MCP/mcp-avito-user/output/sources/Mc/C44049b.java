package mc;

import Y61.k;
import com.avito.android.analytics.event.native_video.VideoEventFromPage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoEventFromPage.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44049b {

    /* compiled from: VideoEventFromPage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mc.b$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[VideoEventFromPage.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VideoEventFromPage videoEventFromPage = VideoEventFromPage.f90106b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VideoEventFromPage videoEventFromPage2 = VideoEventFromPage.f90106b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @k
    public static final String a(@k VideoEventFromPage videoEventFromPage) {
        int iOrdinal = videoEventFromPage.ordinal();
        if (iOrdinal == 0) {
            return "gallery_fullscreen";
        }
        if (iOrdinal == 1) {
            return "snippet";
        }
        if (iOrdinal == 2) {
            return "gallery_item";
        }
        throw new NoWhenBranchMatchedException();
    }
}

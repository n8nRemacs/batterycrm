package gr0;

import Y61.k;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.serp.adapter.SerpViewType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: gr0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40724a {

    /* compiled from: AdUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gr0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C11231a {
        static {
            int[] iArr = new int[AdViewType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdViewType adViewType = AdViewType.f86908b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AdViewType adViewType2 = AdViewType.f86908b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AdViewType adViewType3 = AdViewType.f86908b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @k
    public static final SerpViewType a(@k AdViewType adViewType) {
        int iOrdinal = adViewType.ordinal();
        if (iOrdinal == 0) {
            return SerpViewType.f268582b;
        }
        if (iOrdinal == 1) {
            return SerpViewType.f268583c;
        }
        if (iOrdinal == 2) {
            return SerpViewType.f268584d;
        }
        if (iOrdinal == 3) {
            return SerpViewType.f268585e;
        }
        throw new NoWhenBranchMatchedException();
    }
}

package v70;

import Y61.k;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;

/* compiled from: GetApiPhoneProtectionInfoBannerResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lv70/a;", "", "Lv70/b;", AdFormat.BANNER, "", "shouldShowBanner", "<init>", "(Lv70/b;Z)V", "Lv70/b;", "a", "()Lv70/b;", "Z", "b", "()Z", "_avito_phone-protection-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v70.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49176a {

    @com.google.gson.annotations.c(AdFormat.BANNER)
    @k
    private final b banner;

    @com.google.gson.annotations.c("shouldShowBanner")
    private final boolean shouldShowBanner;

    public C49176a(@k b bVar, boolean z12) {
        this.banner = bVar;
        this.shouldShowBanner = z12;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final b getBanner() {
        return this.banner;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getShouldShowBanner() {
        return this.shouldShowBanner;
    }
}

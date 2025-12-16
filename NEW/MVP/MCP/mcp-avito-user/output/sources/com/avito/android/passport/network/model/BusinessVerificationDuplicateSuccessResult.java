package com.avito.android.passport.network.model;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BusinessVrfResult.kt */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/passport/network/model/BusinessVerificationDuplicateSuccessResult;", "", AdFormat.BANNER, "Lcom/avito/android/passport/network/model/Banner;", "(Lcom/avito/android/passport/network/model/Banner;)V", "getBanner", "()Lcom/avito/android/passport/network/model/Banner;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BusinessVerificationDuplicateSuccessResult {

    @k
    private final Banner banner;

    public BusinessVerificationDuplicateSuccessResult(@k Banner banner) {
        this.banner = banner;
    }

    public static /* synthetic */ BusinessVerificationDuplicateSuccessResult copy$default(BusinessVerificationDuplicateSuccessResult businessVerificationDuplicateSuccessResult, Banner banner, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            banner = businessVerificationDuplicateSuccessResult.banner;
        }
        return businessVerificationDuplicateSuccessResult.copy(banner);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    @k
    public final BusinessVerificationDuplicateSuccessResult copy(@k Banner banner) {
        return new BusinessVerificationDuplicateSuccessResult(banner);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BusinessVerificationDuplicateSuccessResult) && L.f(this.banner, ((BusinessVerificationDuplicateSuccessResult) other).banner);
    }

    @k
    public final Banner getBanner() {
        return this.banner;
    }

    public int hashCode() {
        return this.banner.hashCode();
    }

    @k
    public String toString() {
        return "BusinessVerificationDuplicateSuccessResult(banner=" + this.banner + ')';
    }
}

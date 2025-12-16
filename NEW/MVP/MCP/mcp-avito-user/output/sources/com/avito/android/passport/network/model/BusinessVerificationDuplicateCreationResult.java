package com.avito.android.passport.network.model;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BusinessVrfResult.kt */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/passport/network/model/BusinessVerificationDuplicateCreationResult;", "", "nextStepLink", "Lcom/avito/android/deep_linking/links/DeepLink;", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "getNextStepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BusinessVerificationDuplicateCreationResult {

    @k
    private final DeepLink nextStepLink;

    public BusinessVerificationDuplicateCreationResult(@k DeepLink deepLink) {
        this.nextStepLink = deepLink;
    }

    public static /* synthetic */ BusinessVerificationDuplicateCreationResult copy$default(BusinessVerificationDuplicateCreationResult businessVerificationDuplicateCreationResult, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            deepLink = businessVerificationDuplicateCreationResult.nextStepLink;
        }
        return businessVerificationDuplicateCreationResult.copy(deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final DeepLink getNextStepLink() {
        return this.nextStepLink;
    }

    @k
    public final BusinessVerificationDuplicateCreationResult copy(@k DeepLink nextStepLink) {
        return new BusinessVerificationDuplicateCreationResult(nextStepLink);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BusinessVerificationDuplicateCreationResult) && L.f(this.nextStepLink, ((BusinessVerificationDuplicateCreationResult) other).nextStepLink);
    }

    @k
    public final DeepLink getNextStepLink() {
        return this.nextStepLink;
    }

    public int hashCode() {
        return this.nextStepLink.hashCode();
    }

    @k
    public String toString() {
        return a.v(new StringBuilder("BusinessVerificationDuplicateCreationResult(nextStepLink="), this.nextStepLink, ')');
    }
}

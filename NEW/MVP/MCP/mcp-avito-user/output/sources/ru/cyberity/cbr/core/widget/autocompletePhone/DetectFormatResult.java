package ru.cyberity.cbr.core.widget.autocompletePhone;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetectFormatResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/DetectFormatResult;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "countryIsoCode", "Ljava/lang/String;", "getCountryIsoCode", "countryCode", "getCountryCode", "mask", "getMask", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DetectFormatResult {

    @l
    private final String countryCode;

    @l
    private final String countryIsoCode;

    @k
    private final String mask;

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetectFormatResult)) {
            return false;
        }
        DetectFormatResult detectFormatResult = (DetectFormatResult) other;
        return L.f(this.countryIsoCode, detectFormatResult.countryIsoCode) && L.f(this.countryCode, detectFormatResult.countryCode) && L.f(this.mask, detectFormatResult.mask);
    }

    public int hashCode() {
        String str = this.countryIsoCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        return this.mask.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DetectFormatResult(countryIsoCode=");
        sb2.append(this.countryIsoCode);
        sb2.append(", countryCode=");
        sb2.append(this.countryCode);
        sb2.append(", mask=");
        return C22026a.c(sb2, this.mask, ')');
    }
}

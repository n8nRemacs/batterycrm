package ru.mts.biometry.api.entity.locationSuggestion;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestionBody.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/mts/biometry/api/entity/locationSuggestion/SuggestionBody;", "", "", AddressParameter.TYPE, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SuggestionBody {

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    public SuggestionBody(@k String str) {
        this.address = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuggestionBody) && L.f(this.address, ((SuggestionBody) obj).address);
    }

    public final int hashCode() {
        return this.address.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("SuggestionBody(address="), this.address, ')');
    }
}

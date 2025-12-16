package qI;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressSuggestionV2.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LqI/e;", "", "", "title", "subtitle", "jsonWebToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "a", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class e {

    @com.google.gson.annotations.c(AddressParameter.Value.JSON_WEB_TOKEN)
    @k
    private final String jsonWebToken;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public e(@k String str, @k String str2, @k String str3) {
        this.title = str;
        this.subtitle = str2;
        this.jsonWebToken = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getJsonWebToken() {
        return this.jsonWebToken;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.title, eVar.title) && L.f(this.subtitle, eVar.subtitle) && L.f(this.jsonWebToken, eVar.jsonWebToken);
    }

    public final int hashCode() {
        return this.jsonWebToken.hashCode() + H.d(this.title.hashCode() * 31, 31, this.subtitle);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressSuggestionV2(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", jsonWebToken=");
        return C22026a.c(sb2, this.jsonWebToken, ')');
    }
}

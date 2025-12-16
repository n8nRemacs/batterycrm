package JO;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HistoricalSuggestsSection.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJO/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f8938a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f8939b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f8940c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AddressParameter.Value f8941d;

    public c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k AddressParameter.Value value) {
        this.f8938a = str;
        this.f8939b = str2;
        this.f8940c = str3;
        this.f8941d = value;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f8938a, cVar.f8938a) && L.f(this.f8939b, cVar.f8939b) && L.f(this.f8940c, cVar.f8940c) && L.f(this.f8941d, cVar.f8941d);
    }

    public final int hashCode() {
        return this.f8941d.hashCode() + H.d(H.d(this.f8938a.hashCode() * 31, 31, this.f8939b), 31, this.f8940c);
    }

    @Y61.k
    public final String toString() {
        return "HistoricalSuggestItem(stringId=" + this.f8938a + ", title=" + this.f8939b + ", subtitle=" + this.f8940c + ", value=" + this.f8941d + ')';
    }
}

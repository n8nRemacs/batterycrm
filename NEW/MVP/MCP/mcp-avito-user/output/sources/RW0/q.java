package rw0;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrustItemsViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/q;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f437245a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f437246b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f437247c;

    public q(@Y61.l UniversalImage universalImage, @Y61.l String str, @Y61.l String str2) {
        this.f437245a = universalImage;
        this.f437246b = str;
        this.f437247c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f437245a, qVar.f437245a) && L.f(this.f437246b, qVar.f437246b) && L.f(this.f437247c, qVar.f437247c);
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f437245a;
        int iHashCode = (universalImage == null ? 0 : universalImage.hashCode()) * 31;
        String str = this.f437246b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f437247c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrustItemViewState(icon=");
        sb2.append(this.f437245a);
        sb2.append(", title=");
        sb2.append(this.f437246b);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f437247c, ')');
    }
}

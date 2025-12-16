package JO;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJO/q;", "LJO/o;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class q implements o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f8986b;

    public q(@Y61.k String str) {
        this.f8986b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && L.f(this.f8986b, ((q) obj).f8986b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF171217b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF8986b() {
        return this.f8986b;
    }

    public final int hashCode() {
        return this.f8986b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("VerificationItemContinue(stringId="), this.f8986b, ')');
    }
}

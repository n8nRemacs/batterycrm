package K50;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BusinessVrfResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LK50/a;", "", "", "userIdFrom", "", "", "label", "<init>", "(ILjava/util/List;)V", "I", "b", "()I", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    @com.google.gson.annotations.c("label")
    @Y61.k
    private final List<String> label;

    @com.google.gson.annotations.c("userIdFrom")
    private final int userIdFrom;

    public a(int i12, @Y61.k List<String> list) {
        this.userIdFrom = i12;
        this.label = list;
    }

    @Y61.k
    public final List<String> a() {
        return this.label;
    }

    /* renamed from: b, reason: from getter */
    public final int getUserIdFrom() {
        return this.userIdFrom;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.userIdFrom == aVar.userIdFrom && L.f(this.label, aVar.label);
    }

    public final int hashCode() {
        return this.label.hashCode() + (Integer.hashCode(this.userIdFrom) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BusinessVrf(userIdFrom=");
        sb2.append(this.userIdFrom);
        sb2.append(", label=");
        return H.p(sb2, this.label, ')');
    }
}

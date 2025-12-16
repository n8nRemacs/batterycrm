package dX;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceAlertContent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LdX/h;", "", "", "LdX/g;", "list", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class h {

    @com.google.gson.annotations.c("alerts")
    @Y61.k
    private final List<g> list;

    public h(@Y61.k List<g> list) {
        this.list = list;
    }

    @Y61.k
    public final List<g> a() {
        return this.list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && L.f(this.list, ((h) obj).list);
    }

    public final int hashCode() {
        return this.list.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.p(new StringBuilder("QualityServiceAlertResponse(list="), this.list, ')');
    }
}

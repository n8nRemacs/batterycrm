package Vq;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeleteFromComparisonResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LVq/d;", "", "LVq/b;", "alert", "<init>", "(LVq/b;)V", "LVq/b;", "a", "()LVq/b;", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d {

    @com.google.gson.annotations.c("alert")
    @k
    private final b alert;

    public d(@k b bVar) {
        this.alert = bVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final b getAlert() {
        return this.alert;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.alert, ((d) obj).alert);
    }

    public final int hashCode() {
        return this.alert.hashCode();
    }

    @k
    public final String toString() {
        return "DeleteFromComparisonResponse(alert=" + this.alert + ')';
    }
}

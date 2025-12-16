package Vq;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddAdvertToComparisonResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LVq/c;", "", "LVq/b;", "alert", "", "LVq/e;", "items", "", "name", "<init>", "(LVq/b;Ljava/util/List;Ljava/lang/String;)V", "LVq/b;", "a", "()LVq/b;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c {

    @com.google.gson.annotations.c("alert")
    @k
    private final b alert;

    @com.google.gson.annotations.c("items")
    @k
    private final List<e> items;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    public c(@k b bVar, @k List<e> list, @k String str) {
        this.alert = bVar;
        this.items = list;
        this.name = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final b getAlert() {
        return this.alert;
    }

    @k
    public final List<e> b() {
        return this.items;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.alert, cVar.alert) && L.f(this.items, cVar.items) && L.f(this.name, cVar.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + H.e(this.alert.hashCode() * 31, 31, this.items);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Comparison(alert=");
        sb2.append(this.alert);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", name=");
        return C22026a.c(sb2, this.name, ')');
    }
}

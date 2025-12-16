package LZ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormItemOption.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LLZ/d;", "", "", "label", "", "shows", "value", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    @com.google.gson.annotations.c("label")
    @k
    private final String label;

    @com.google.gson.annotations.c("shows")
    @l
    private final List<String> shows;

    @com.google.gson.annotations.c("value")
    @k
    private final String value;

    public d(@k String str, @l List<String> list, @k String str2) {
        this.label = str;
        this.shows = list;
        this.value = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @l
    public final List<String> b() {
        return this.shows;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.label, dVar.label) && L.f(this.shows, dVar.shows) && L.f(this.value, dVar.value);
    }

    public final int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        List<String> list = this.shows;
        return this.value.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FormItemOption(label=");
        sb2.append(this.label);
        sb2.append(", shows=");
        sb2.append(this.shows);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }
}

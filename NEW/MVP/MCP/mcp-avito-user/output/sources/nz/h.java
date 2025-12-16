package NZ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculationProgramsItem.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNZ/h;", "LNZ/d;", "", "LNZ/g;", "options", "", "value", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class h implements d {

    @com.google.gson.annotations.c("options")
    @k
    private final List<g> options;

    @com.google.gson.annotations.c("value")
    @l
    private final String value;

    public h(@k List<g> list, @l String str) {
        this.options = list;
        this.value = str;
    }

    @k
    public final List<g> a() {
        return this.options;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.options, hVar.options) && L.f(this.value, hVar.value);
    }

    public final int hashCode() {
        int iHashCode = this.options.hashCode() * 31;
        String str = this.value;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalculationProgramsItem(options=");
        sb2.append(this.options);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }
}

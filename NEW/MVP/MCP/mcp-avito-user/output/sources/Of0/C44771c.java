package of0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImageWithLabelState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lof0/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: of0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C44771c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f419984a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f419985b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f419986c;

    public C44771c(@k String str, @l String str2, @l Integer num) {
        this.f419984a = str;
        this.f419985b = str2;
        this.f419986c = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44771c)) {
            return false;
        }
        C44771c c44771c = (C44771c) obj;
        return L.f(this.f419984a, c44771c.f419984a) && L.f(this.f419985b, c44771c.f419985b) && L.f(this.f419986c, c44771c.f419986c);
    }

    public final int hashCode() {
        int iHashCode = this.f419984a.hashCode() * 31;
        String str = this.f419985b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f419986c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LabelState(groupTitle=");
        sb2.append(this.f419984a);
        sb2.append(", longPostfixFormat=");
        sb2.append(this.f419985b);
        sb2.append(", count=");
        return s.j(sb2, this.f419986c, ')');
    }

    public /* synthetic */ C44771c(String str, String str2, Integer num, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : num);
    }
}

package hf0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySummaryFeeDetailsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhf0/e;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f397350a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f397351b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f397352c;

    public e(@l String str, @l String str2, @l String str3) {
        this.f397350a = str;
        this.f397351b = str2;
        this.f397352c = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f397350a, eVar.f397350a) && L.f(this.f397351b, eVar.f397351b) && L.f(this.f397352c, eVar.f397352c);
    }

    public final int hashCode() {
        String str = this.f397350a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f397351b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f397352c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliverySummaryFeeHelpContent(text=");
        sb2.append(this.f397350a);
        sb2.append(", buttonUrl=");
        sb2.append(this.f397351b);
        sb2.append(", buttonLabel=");
        return C22026a.c(sb2, this.f397352c, ')');
    }

    public /* synthetic */ e(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, str3);
    }
}

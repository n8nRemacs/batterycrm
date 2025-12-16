package Vb;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/k;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f17262a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f17263b;

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static k a(k kVar, String str, String str2, int i12) {
        if ((i12 & 1) != 0) {
            str = kVar.f17262a;
        }
        if ((i12 & 2) != 0) {
            str2 = kVar.f17263b;
        }
        kVar.getClass();
        return new k(str, str2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f17262a, kVar.f17262a) && L.f(this.f17263b, kVar.f17263b);
    }

    public final int hashCode() {
        String str = this.f17262a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17263b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IdempotentIds(discover=");
        sb2.append(this.f17262a);
        sb2.append(", send=");
        return C22026a.c(sb2, this.f17263b, ')');
    }

    public k(@Y61.l String str, @Y61.l String str2) {
        this.f17262a = str;
        this.f17263b = str2;
    }

    public /* synthetic */ k(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }
}

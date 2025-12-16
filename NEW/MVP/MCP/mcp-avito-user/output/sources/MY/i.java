package MY;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DTOs.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/i;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f10760a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f10761b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f10762c;

    public i(@Y61.k String str, @Y61.l String str2, @Y61.k String str3) {
        this.f10760a = str;
        this.f10761b = str2;
        this.f10762c = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f10760a, iVar.f10760a) && L.f(this.f10761b, iVar.f10761b) && L.f(this.f10762c, iVar.f10762c);
    }

    public final int hashCode() {
        int iHashCode = this.f10760a.hashCode() * 31;
        String str = this.f10761b;
        return this.f10762c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemMessageInfo(itemId=");
        sb2.append(this.f10760a);
        sb2.append(", itemOwnerId=");
        sb2.append(this.f10761b);
        sb2.append(", currentUserId=");
        return C22026a.c(sb2, this.f10762c, ')');
    }
}

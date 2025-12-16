package GV;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TimeLineItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGV/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f6515a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f6516b;

    public a(@InterfaceC42150f @l Integer num, @l String str) {
        this.f6515a = num;
        this.f6516b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f6515a, aVar.f6515a) && L.f(this.f6516b, aVar.f6516b);
    }

    public final int hashCode() {
        Integer num = this.f6515a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f6516b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeLineItem(iconAttr=");
        sb2.append(this.f6515a);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f6516b, ')');
    }

    public /* synthetic */ a(Integer num, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, str);
    }
}

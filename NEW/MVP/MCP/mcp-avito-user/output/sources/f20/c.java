package F20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: MultiSendContentData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF20/c;", "", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f4497a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f4498b;

    public c(@k b bVar, @k ArrayList arrayList) {
        this.f4497a = bVar;
        this.f4498b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4497a.equals(cVar.f4497a) && this.f4498b.equals(cVar.f4498b);
    }

    public final int hashCode() {
        return this.f4498b.hashCode() + (this.f4497a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSendContentData(anchorData=");
        sb2.append(this.f4497a);
        sb2.append(", itemsData=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f4498b, ')');
    }
}

package i80;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImageWithGroupContentStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li80/b;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f398364a;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f398364a, ((b) obj).f398364a);
    }

    public final int hashCode() {
        String str = this.f398364a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ImageWithGroupContentStyle(labelBackgroundColor="), this.f398364a, ')');
    }

    public b(@l String str) {
        this.f398364a = str;
    }

    public /* synthetic */ b(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }
}

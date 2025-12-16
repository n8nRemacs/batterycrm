package pH;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/z;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<AttributedText> f428483a;

    /* renamed from: b, reason: collision with root package name */
    public final int f428484b;

    public z(@Y61.k List<AttributedText> list, @InterfaceC42150f int i12) {
        this.f428483a = list;
        this.f428484b = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return L.f(this.f428483a, zVar.f428483a) && this.f428484b == zVar.f428484b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f428484b) + (this.f428483a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotWarning(title=");
        sb2.append(this.f428483a);
        sb2.append(", colorRes=");
        return androidx.appcompat.app.r.t(sb2, this.f428484b, ')');
    }
}

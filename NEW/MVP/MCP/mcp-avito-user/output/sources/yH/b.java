package Yh;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContainerPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYh/b;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<C18265a, Object> f19611a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<BeduinModel> f19612b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k Map<C18265a, ? extends Object> map, @k List<? extends BeduinModel> list) {
        this.f19611a = map;
        this.f19612b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f19611a, bVar.f19611a) && L.f(this.f19612b, bVar.f19612b);
    }

    public final int hashCode() {
        return this.f19612b.hashCode() + (this.f19611a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContainerPayload(childrenPayloads=");
        sb2.append(this.f19611a);
        sb2.append(", newModels=");
        return H.p(sb2, this.f19612b, ')');
    }
}

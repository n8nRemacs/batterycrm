package Zp0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RequestPageResult.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZp0/e;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<ParcelableEntity<String>> f20507a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final InterfaceC19587b f20508b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k List<? extends ParcelableEntity<String>> list, @l InterfaceC19587b interfaceC19587b) {
        this.f20507a = list;
        this.f20508b = interfaceC19587b;
    }

    public static e a(e eVar, List list) {
        InterfaceC19587b interfaceC19587b = eVar.f20508b;
        eVar.getClass();
        return new e(list, interfaceC19587b);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f20507a, eVar.f20507a) && L.f(this.f20508b, eVar.f20508b);
    }

    public final int hashCode() {
        int iHashCode = this.f20507a.hashCode() * 31;
        InterfaceC19587b interfaceC19587b = this.f20508b;
        return iHashCode + (interfaceC19587b == null ? 0 : interfaceC19587b.hashCode());
    }

    @k
    public final String toString() {
        return "RequestPageResult(items=" + this.f20507a + ", nextPageDetails=" + this.f20508b + ')';
    }
}

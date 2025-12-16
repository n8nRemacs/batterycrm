package JT0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UnregisteredComponentState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJT0/c;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f9000a;

    public c(@k String str) {
        this.f9000a = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> b() {
        return null;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> d() {
        return null;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return L.f(this.f9000a, ((c) obj).f9000a) && L.f(null, null) && L.f(null, null) && L.f(null, null);
        }
        return false;
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @l
    /* renamed from: getTag */
    public final String getF334995q() {
        return null;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible */
    public final boolean getF334992n() {
        return true;
    }

    public final int hashCode() {
        return r.i(this.f9000a.hashCode() * 31, 29791, true);
    }

    @k
    public final String toString() {
        return AK.c.s(new StringBuilder("UnregisteredComponentState(text="), this.f9000a, ", visible=true, onShow=null, onHide=null, tag=null)");
    }
}

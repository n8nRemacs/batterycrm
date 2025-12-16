package JT0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import java.util.Arrays;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;

/* compiled from: ExceptionState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJT0/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f8996a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f8997b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String[] f8998c;

    public a(@k String str, @l String str2, @k String[] strArr) {
        this.f8996a = str;
        this.f8997b = str2;
        this.f8998c = strArr;
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8996a.equals(aVar.f8996a) && L.f(this.f8997b, aVar.f8997b) && this.f8998c.equals(aVar.f8998c) && L.f(null, null) && L.f(null, null) && L.f(null, null);
    }

    @k
    public final String f() {
        List listG0 = C42756l.g0(this.f8998c);
        StringBuilder sb2 = new StringBuilder();
        if (!listG0.isEmpty()) {
            sb2.append("Error in " + ((String) C42745f0.E(listG0)));
            List listW = C42745f0.w(listG0, 1);
            if (!listW.isEmpty()) {
                sb2.append(C42745f0.O(listW, "\n\tcaused by ", "\n\tcaused by ", null, null, 60));
            }
        }
        return sb2.toString();
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @l
    /* renamed from: getTag */
    public final String getF336371l() {
        return null;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible */
    public final boolean getF336368i() {
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f8996a.hashCode() * 31;
        String str = this.f8997b;
        return r.i((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Arrays.hashCode(this.f8998c)) * 31, 29791, true);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExceptionComponentState(type=");
        sb2.append(this.f8996a);
        sb2.append(", property=");
        sb2.append(this.f8997b);
        sb2.append(", trace=");
        return AK.c.s(sb2, Arrays.toString(this.f8998c), ", visible=true, onShow=null, onHide=null, tag=null)");
    }
}

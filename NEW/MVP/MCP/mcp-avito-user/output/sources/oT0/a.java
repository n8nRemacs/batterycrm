package OT0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.component.InterfaceC36248h;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.component.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MetaState.kt */
@InterfaceC36248h
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOT0/a;", "Lcom/avito/beduin/v2/engine/component/n;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements n {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f12280a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f12281b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.engine.component.l f12282c;

    public a(@k String str, @l String str2, @k com.avito.beduin.v2.engine.component.l lVar) {
        this.f12280a = str;
        this.f12281b = str2;
        this.f12282c = lVar;
    }

    @Override // com.avito.beduin.v2.engine.component.n
    @k
    public final InterfaceC36249i c() {
        return this.f12282c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f12280a, aVar.f12280a) && L.f(this.f12281b, aVar.f12281b) && this.f12282c.equals(aVar.f12282c);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @l
    /* renamed from: getTag, reason: from getter */
    public final String getF333760m() {
        return this.f12281b;
    }

    public final int hashCode() {
        int iHashCode = this.f12280a.hashCode() * 31;
        String str = this.f12281b;
        return this.f12282c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "MetaState(name=" + this.f12280a + ", tag=" + this.f12281b + ", childComponent=" + this.f12282c + ')';
    }
}

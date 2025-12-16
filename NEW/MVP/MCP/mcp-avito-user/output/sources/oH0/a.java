package OH0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Action;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShortTermRentItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOH0/a;", "LOH0/c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12154b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Action f12155c;

    public a(@k String str, @k Action action) {
        this.f12154b = str;
        this.f12155c = action;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f12154b, aVar.f12154b) && L.f(this.f12155c, aVar.f12155c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF72786b() {
        return this.f12154b;
    }

    public final int hashCode() {
        return this.f12155c.hashCode() + (this.f12154b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ShortTermRentActionItem(stringId=" + this.f12154b + ", action=" + this.f12155c + ')';
    }
}

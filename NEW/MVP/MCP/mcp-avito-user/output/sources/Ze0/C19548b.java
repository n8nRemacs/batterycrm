package Ze0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.card_select.CardSelect;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CardSelectViewFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZe0/b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ze0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C19548b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CardSelect f20326a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalColor f20327b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalColor f20328c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.l<CardSelect, G0> f20329d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Y41.l<DeepLink, G0> f20330e;

    /* JADX WARN: Multi-variable type inference failed */
    public C19548b(@k CardSelect cardSelect, @l UniversalColor universalColor, @l UniversalColor universalColor2, @k Y41.l<? super CardSelect, G0> lVar, @k Y41.l<? super DeepLink, G0> lVar2) {
        this.f20326a = cardSelect;
        this.f20327b = universalColor;
        this.f20328c = universalColor2;
        this.f20329d = lVar;
        this.f20330e = lVar2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19548b)) {
            return false;
        }
        C19548b c19548b = (C19548b) obj;
        return L.f(this.f20326a, c19548b.f20326a) && L.f(this.f20327b, c19548b.f20327b) && L.f(this.f20328c, c19548b.f20328c) && L.f(this.f20329d, c19548b.f20329d) && L.f(this.f20330e, c19548b.f20330e);
    }

    public final int hashCode() {
        int iHashCode = this.f20326a.hashCode() * 31;
        UniversalColor universalColor = this.f20327b;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.f20328c;
        return this.f20330e.hashCode() + ((this.f20329d.hashCode() + ((iHashCode2 + (universalColor2 != null ? universalColor2.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CardSelectViewConfig(card=");
        sb2.append(this.f20326a);
        sb2.append(", checkedColor=");
        sb2.append(this.f20327b);
        sb2.append(", defaultColor=");
        sb2.append(this.f20328c);
        sb2.append(", cardClickListener=");
        sb2.append(this.f20329d);
        sb2.append(", linkButtonListener=");
        return H.l(sb2, this.f20330e, ')');
    }
}

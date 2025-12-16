package rp;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.comfortable_deal.data_source.model.ItemType;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp/d;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rp.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47701d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ItemType f430199a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430200b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f430201c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f430202d;

    public C47701d(@k ItemType itemType, @k String str, @InterfaceC42165v @l Integer num, @l Integer num2) {
        this.f430199a = itemType;
        this.f430200b = str;
        this.f430201c = num;
        this.f430202d = num2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47701d)) {
            return false;
        }
        C47701d c47701d = (C47701d) obj;
        return this.f430199a == c47701d.f430199a && L.f(this.f430200b, c47701d.f430200b) && L.f(this.f430201c, c47701d.f430201c) && L.f(this.f430202d, c47701d.f430202d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f430199a.hashCode() * 31, 31, this.f430200b);
        Integer num = this.f430201c;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f430202d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListItem(type=");
        sb2.append(this.f430199a);
        sb2.append(", text=");
        sb2.append(this.f430200b);
        sb2.append(", image=");
        sb2.append(this.f430201c);
        sb2.append(", number=");
        return s.j(sb2, this.f430202d, ')');
    }

    public /* synthetic */ C47701d(ItemType itemType, String str, Integer num, Integer num2, int i12, C42822w c42822w) {
        this(itemType, str, (i12 & 4) != 0 ? null : num, num2);
    }
}

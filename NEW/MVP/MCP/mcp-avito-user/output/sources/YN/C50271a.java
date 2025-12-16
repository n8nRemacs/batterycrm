package yn;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UpdateAdvertInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyn/a;", "", "", "itemId", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "I", "b", "()I", "_avito-discouraged_avito-network_cart-snippet-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C50271a {

    @c("itemId")
    @k
    private final String itemId;

    @c("quantity")
    private final int quantity;

    public C50271a(@k String str, int i12) {
        this.itemId = str;
        this.quantity = i12;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: b, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50271a)) {
            return false;
        }
        C50271a c50271a = (C50271a) obj;
        return L.f(this.itemId, c50271a.itemId) && this.quantity == c50271a.quantity;
    }

    public final int hashCode() {
        return Integer.hashCode(this.quantity) + (this.itemId.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateAdvertInfo(itemId=");
        sb2.append(this.itemId);
        sb2.append(", quantity=");
        return r.t(sb2, this.quantity, ')');
    }
}

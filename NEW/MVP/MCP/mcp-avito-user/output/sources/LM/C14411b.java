package Lm;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartIconInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LLm/b;", "", "", "quantity", "", "", "supportedCategories", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito-discouraged_avito-api_cart"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14411b {

    @com.google.gson.annotations.c("quantity")
    @l
    private final Integer quantity;

    @com.google.gson.annotations.c("cartCategories")
    @l
    private final List<String> supportedCategories;

    public C14411b(@l Integer num, @l List<String> list) {
        this.quantity = num;
        this.supportedCategories = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    @l
    public final List<String> b() {
        return this.supportedCategories;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14411b)) {
            return false;
        }
        C14411b c14411b = (C14411b) obj;
        return L.f(this.quantity, c14411b.quantity) && L.f(this.supportedCategories, c14411b.supportedCategories);
    }

    public final int hashCode() {
        Integer num = this.quantity;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.supportedCategories;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartIconInfo(quantity=");
        sb2.append(this.quantity);
        sb2.append(", supportedCategories=");
        return H.p(sb2, this.supportedCategories, ')');
    }
}

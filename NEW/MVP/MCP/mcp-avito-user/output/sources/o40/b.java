package O40;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderDetailsV2.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LO40/b;", "", "Lcom/google/gson/k;", "content", "Lcom/avito/android/remote/model/UniversalColor;", "statusBarColor", "<init>", "(Lcom/google/gson/k;Lcom/avito/android/remote/model/UniversalColor;)V", "Lcom/google/gson/k;", "a", "()Lcom/google/gson/k;", "Lcom/avito/android/remote/model/UniversalColor;", "b", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    @com.google.gson.annotations.c("content")
    @k
    private final com.google.gson.k content;

    @com.google.gson.annotations.c("statusBarColor")
    @l
    private final UniversalColor statusBarColor;

    public b(@k com.google.gson.k kVar, @l UniversalColor universalColor) {
        this.content = kVar;
        this.statusBarColor = universalColor;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final com.google.gson.k getContent() {
        return this.content;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final UniversalColor getStatusBarColor() {
        return this.statusBarColor;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.content, bVar.content) && L.f(this.statusBarColor, bVar.statusBarColor);
    }

    public final int hashCode() {
        int iHashCode = this.content.f362194b.hashCode() * 31;
        UniversalColor universalColor = this.statusBarColor;
        return iHashCode + (universalColor == null ? 0 : universalColor.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderDetailsV2(content=");
        sb2.append(this.content);
        sb2.append(", statusBarColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.statusBarColor, ')');
    }
}

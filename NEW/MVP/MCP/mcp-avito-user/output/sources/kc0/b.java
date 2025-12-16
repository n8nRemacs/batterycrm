package KC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ColoredIcon.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKC0/b;", "", "", "name", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "a", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    @com.google.gson.annotations.c("color")
    @Y61.l
    private final UniversalColor color;

    @com.google.gson.annotations.c("iconName")
    @Y61.k
    private final String name;

    public b(@Y61.k String str, @Y61.l UniversalColor universalColor) {
        this.name = str;
        this.color = universalColor;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.name, bVar.name) && L.f(this.color, bVar.color);
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        UniversalColor universalColor = this.color;
        return iHashCode + (universalColor == null ? 0 : universalColor.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColoredIcon(name=");
        sb2.append(this.name);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
    }
}

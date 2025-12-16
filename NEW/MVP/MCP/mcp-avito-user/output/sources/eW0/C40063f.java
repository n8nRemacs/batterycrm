package eW0;

import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TemplateUnit.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LeW0/f;", "LeW0/i;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "activeColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getActiveColor", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eW0.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40063f implements InterfaceC40066i {

    @com.google.gson.annotations.c("active_color")
    @Y61.k
    private final UniversalColor activeColor;

    @com.google.gson.annotations.c("color")
    @Y61.k
    private final UniversalColor color;

    public C40063f(@Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2) {
        this.color = universalColor;
        this.activeColor = universalColor2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40063f)) {
            return false;
        }
        C40063f c40063f = (C40063f) obj;
        return L.f(this.color, c40063f.color) && L.f(this.activeColor, c40063f.activeColor);
    }

    public final int hashCode() {
        return this.activeColor.hashCode() + (this.color.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InfographicsTemplate(color=");
        sb2.append(this.color);
        sb2.append(", activeColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.activeColor, ')');
    }
}

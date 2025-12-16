package KZ;

import androidx.compose.runtime.C22026a;
import com.avito.android.mortgage.api.model.items.application.ApplicationLegacyStatusType;
import kotlin.Metadata;

/* compiled from: ApplicationPersonalStatusItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LKZ/y;", "LKZ/p;", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationLegacyStatusType;", "type", "", "title", "subtitle", "<init>", "(Lcom/avito/android/mortgage/api/model/items/application/ApplicationLegacyStatusType;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationLegacyStatusType;", "c", "()Lcom/avito/android/mortgage/api/model/items/application/ApplicationLegacyStatusType;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class y implements InterfaceC14286p {

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("type")
    @Y61.k
    private final ApplicationLegacyStatusType type;

    public y(@Y61.k ApplicationLegacyStatusType applicationLegacyStatusType, @Y61.k String str, @Y61.l String str2) {
        this.type = applicationLegacyStatusType;
        this.title = str;
        this.subtitle = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final ApplicationLegacyStatusType getType() {
        return this.type;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.type == yVar.type && kotlin.jvm.internal.L.f(this.title, yVar.title) && kotlin.jvm.internal.L.f(this.subtitle, yVar.subtitle);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.type.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationPersonalStatusItemValue(type=");
        sb2.append(this.type);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.subtitle, ')');
    }
}

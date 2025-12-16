package KZ;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: ApplicationDisclaimerItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LKZ/r;", "LKZ/p;", "", "iconName", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "b", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class r implements InterfaceC14286p {

    @com.google.gson.annotations.c("iconName")
    @Y61.k
    private final String iconName;

    @com.google.gson.annotations.c("subtitle")
    @Y61.k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public r(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.iconName = str;
        this.title = str2;
        this.subtitle = str3;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.L.f(this.iconName, rVar.iconName) && kotlin.jvm.internal.L.f(this.title, rVar.title) && kotlin.jvm.internal.L.f(this.subtitle, rVar.subtitle);
    }

    public final int hashCode() {
        return this.subtitle.hashCode() + androidx.compose.foundation.H.d(this.iconName.hashCode() * 31, 31, this.title);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationDisclaimerItemValue(iconName=");
        sb2.append(this.iconName);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.subtitle, ')');
    }
}

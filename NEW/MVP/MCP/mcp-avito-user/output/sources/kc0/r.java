package KC0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoResult.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKC0/r;", "", "", "title", "icon", "LKC0/b;", "coloredIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;LKC0/b;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getIcon", "LKC0/b;", "getColoredIcon", "()LKC0/b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class r {

    @com.google.gson.annotations.c("coloredIcon")
    @Y61.l
    private final b coloredIcon;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final String icon;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public r(@Y61.k String str, @Y61.l String str2, @Y61.l b bVar) {
        this.title = str;
        this.icon = str2;
        this.coloredIcon = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.title, rVar.title) && L.f(this.icon, rVar.icon) && L.f(this.coloredIcon, rVar.coloredIcon);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.coloredIcon;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ServiceItem(title=" + this.title + ", icon=" + this.icon + ", coloredIcon=" + this.coloredIcon + ')';
    }
}

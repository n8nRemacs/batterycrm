package tM0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2Result.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LtM0/g;", "", "", "title", "LuZ/e;", "navBar", "", "LtM0/h;", "tabs", "Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "footer", "<init>", "(Ljava/lang/String;LuZ/e;Ljava/util/List;Lcom/avito/android/mnz_common/data/MnzFloatingFooter;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "LuZ/e;", "b", "()LuZ/e;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "a", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class g {

    @com.google.gson.annotations.c("footer")
    @k
    private final MnzFloatingFooter footer;

    @com.google.gson.annotations.c("navBar")
    @l
    private final uZ.e navBar;

    @com.google.gson.annotations.c("tabs")
    @k
    private final List<h> tabs;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public g(@k String str, @l uZ.e eVar, @k List<h> list, @k MnzFloatingFooter mnzFloatingFooter) {
        this.title = str;
        this.navBar = eVar;
        this.tabs = list;
        this.footer = mnzFloatingFooter;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final MnzFloatingFooter getFooter() {
        return this.footer;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final uZ.e getNavBar() {
        return this.navBar;
    }

    @k
    public final List<h> c() {
        return this.tabs;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.title, gVar.title) && L.f(this.navBar, gVar.navBar) && L.f(this.tabs, gVar.tabs) && L.f(this.footer, gVar.footer);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        uZ.e eVar = this.navBar;
        return this.footer.hashCode() + H.e((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.tabs);
    }

    @k
    public final String toString() {
        return "VasUnionV2Result(title=" + this.title + ", navBar=" + this.navBar + ", tabs=" + this.tabs + ", footer=" + this.footer + ')';
    }
}

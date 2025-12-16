package KC0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptLevelsResult.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LKC0/k;", "", "LKC0/j;", AdFormat.BANNER, "", "title", "", "LKC0/i;", "levels", "<init>", "(LKC0/j;Ljava/lang/String;Ljava/util/List;)V", "LKC0/j;", "getBanner", "()LKC0/j;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getLevels", "()Ljava/util/List;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class k {

    @com.google.gson.annotations.c(AdFormat.BANNER)
    @Y61.l
    private final j banner;

    @com.google.gson.annotations.c("levels")
    @Y61.k
    private final List<i> levels;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public k(@Y61.l j jVar, @Y61.k String str, @Y61.k List<i> list) {
        this.banner = jVar;
        this.title = str;
        this.levels = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.banner, kVar.banner) && L.f(this.title, kVar.title) && L.f(this.levels, kVar.levels);
    }

    public final int hashCode() {
        j jVar = this.banner;
        return this.levels.hashCode() + H.d((jVar == null ? 0 : jVar.hashCode()) * 31, 31, this.title);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptLevelsResult(banner=");
        sb2.append(this.banner);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", levels=");
        return H.p(sb2, this.levels, ')');
    }
}

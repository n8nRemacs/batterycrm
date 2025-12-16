package fW0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfigStatsV2.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0007\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"LfW0/z;", "", "", "", "groupingSlugs", "", "isEnabled", "isSelected", "isVisible", "name", "shortName", "slug", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "getGroupingSlugs", "()Ljava/util/List;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getShortName", "b", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class z {

    @com.google.gson.annotations.c("groupingSlugs")
    @Y61.l
    private final List<String> groupingSlugs;

    @com.google.gson.annotations.c("isEnabled")
    @Y61.l
    private final Boolean isEnabled;

    @com.google.gson.annotations.c("isSelected")
    @Y61.l
    private final Boolean isSelected;

    @com.google.gson.annotations.c("isVisible")
    @Y61.l
    private final Boolean isVisible;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String name;

    @com.google.gson.annotations.c("shortName")
    @Y61.l
    private final String shortName;

    @com.google.gson.annotations.c("slug")
    @Y61.k
    private final String slug;

    public z(@Y61.l List<String> list, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Boolean bool3, @Y61.k String str, @Y61.l String str2, @Y61.k String str3) {
        this.groupingSlugs = list;
        this.isEnabled = bool;
        this.isSelected = bool2;
        this.isVisible = bool3;
        this.name = str;
        this.shortName = str2;
        this.slug = str3;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return L.f(this.groupingSlugs, zVar.groupingSlugs) && L.f(this.isEnabled, zVar.isEnabled) && L.f(this.isSelected, zVar.isSelected) && L.f(this.isVisible, zVar.isVisible) && L.f(this.name, zVar.name) && L.f(this.shortName, zVar.shortName) && L.f(this.slug, zVar.slug);
    }

    public final int hashCode() {
        List<String> list = this.groupingSlugs;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSelected;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isVisible;
        int iD2 = H.d((iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31, this.name);
        String str = this.shortName;
        return this.slug.hashCode() + ((iD2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatReportMetric(groupingSlugs=");
        sb2.append(this.groupingSlugs);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", isSelected=");
        sb2.append(this.isSelected);
        sb2.append(", isVisible=");
        sb2.append(this.isVisible);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", shortName=");
        sb2.append(this.shortName);
        sb2.append(", slug=");
        return C22026a.c(sb2, this.slug, ')');
    }
}

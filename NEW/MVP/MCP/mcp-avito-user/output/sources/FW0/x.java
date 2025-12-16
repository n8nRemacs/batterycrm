package fW0;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfigStatsV2.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LfW0/x;", "", "", "slug", "name", "shortName", "", "isSelected", "isVisible", "isEnabled", "", "groupingSlugs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "c", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "g", "e", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class x {

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

    public x(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Boolean bool3, @Y61.l List<String> list) {
        this.slug = str;
        this.name = str2;
        this.shortName = str3;
        this.isSelected = bool;
        this.isVisible = bool2;
        this.isEnabled = bool3;
        this.groupingSlugs = list;
    }

    @Y61.l
    public final List<String> a() {
        return this.groupingSlugs;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return L.f(this.slug, xVar.slug) && L.f(this.name, xVar.name) && L.f(this.shortName, xVar.shortName) && L.f(this.isSelected, xVar.isSelected) && L.f(this.isVisible, xVar.isVisible) && L.f(this.isEnabled, xVar.isEnabled) && L.f(this.groupingSlugs, xVar.groupingSlugs);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    public final int hashCode() {
        int iD2 = H.d(this.slug.hashCode() * 31, 31, this.name);
        String str = this.shortName;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isSelected;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isVisible;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isEnabled;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<String> list = this.groupingSlugs;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricConfig(slug=");
        sb2.append(this.slug);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", shortName=");
        sb2.append(this.shortName);
        sb2.append(", isSelected=");
        sb2.append(this.isSelected);
        sb2.append(", isVisible=");
        sb2.append(this.isVisible);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", groupingSlugs=");
        return H.p(sb2, this.groupingSlugs, ')');
    }
}

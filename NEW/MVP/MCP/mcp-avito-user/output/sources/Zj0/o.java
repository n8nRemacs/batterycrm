package ZJ0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3SellersPrivateStatisticsGeneralConfigPostResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u00002\u00020\u0001BO\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"LZJ0/o;", "", "", "", "groupingSlugs", "", "isEnabled", "isSelected", "isVisible", "name", "shortName", "slug", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "f", "g", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o {

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

    public o(@Y61.l List<String> list, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Boolean bool3, @Y61.k String str, @Y61.l String str2, @Y61.k String str3) {
        this.groupingSlugs = list;
        this.isEnabled = bool;
        this.isSelected = bool2;
        this.isVisible = bool3;
        this.name = str;
        this.shortName = str2;
        this.slug = str3;
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
}

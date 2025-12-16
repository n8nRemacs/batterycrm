package ZJ0;

import kotlin.Metadata;

/* compiled from: Api3SellersPrivateStatisticsGeneralConfigPostResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"LZJ0/n;", "", "", "isDisabled", "isSelected", "", "name", "slug", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n {

    @com.google.gson.annotations.c("isDisabled")
    @Y61.l
    private final Boolean isDisabled;

    @com.google.gson.annotations.c("isSelected")
    @Y61.l
    private final Boolean isSelected;

    @com.google.gson.annotations.c("name")
    @Y61.l
    private final String name;

    @com.google.gson.annotations.c("slug")
    @Y61.l
    private final String slug;

    public n(@Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l String str, @Y61.l String str2) {
        this.isDisabled = bool;
        this.isSelected = bool2;
        this.name = str;
        this.slug = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }
}

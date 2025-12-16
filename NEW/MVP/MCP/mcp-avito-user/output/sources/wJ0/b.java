package WJ0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: Api1SellersPrivateStatisticsGeneralDynamicsCategoriesPostResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LWJ0/b;", "", "", "missingValueTooltip", "slug", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    @com.google.gson.annotations.c("missingValueTooltip")
    @l
    private final String missingValueTooltip;

    @com.google.gson.annotations.c("slug")
    @k
    private final String slug;

    @com.google.gson.annotations.c("value")
    @l
    private final Long value;

    public b(@l String str, @k String str2, @l Long l12) {
        this.missingValueTooltip = str;
        this.slug = str2;
        this.value = l12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getMissingValueTooltip() {
        return this.missingValueTooltip;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getValue() {
        return this.value;
    }
}

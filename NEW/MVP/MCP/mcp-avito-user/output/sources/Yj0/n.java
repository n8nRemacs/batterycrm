package YJ0;

import kotlin.Metadata;

/* compiled from: Api2SellersPrivateStatisticsGeneralDynamicsDatesPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LYJ0/n;", "", "", "slug", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n {

    @com.google.gson.annotations.c("slug")
    @Y61.k
    private final String slug;

    @com.google.gson.annotations.c("value")
    @Y61.l
    private final Long value;

    public n(@Y61.k String str, @Y61.l Long l12) {
        this.slug = str;
        this.value = l12;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Long getValue() {
        return this.value;
    }
}

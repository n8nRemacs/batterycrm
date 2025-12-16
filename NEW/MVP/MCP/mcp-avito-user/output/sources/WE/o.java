package We;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: GetMessengerByItemIdForApiv3Response.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B3\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"LWe/o;", "", "", "", "value", "valueDark", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "b", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o {

    @com.google.gson.annotations.c("value")
    @Y61.l
    private final Map<String, String> value;

    @com.google.gson.annotations.c("valueDark")
    @Y61.l
    private final Map<String, String> valueDark;

    public o(@Y61.l Map<String, String> map, @Y61.l Map<String, String> map2) {
        this.value = map;
        this.valueDark = map2;
    }

    @Y61.l
    public final Map<String, String> a() {
        return this.value;
    }

    @Y61.l
    public final Map<String, String> b() {
        return this.valueDark;
    }
}

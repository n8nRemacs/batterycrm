package We;

import com.avito.android.remote.model.Navigation;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: GetMessengerByItemIdForApiv3Response.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B1\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LWe/s;", "", "", "", "LWe/t;", Navigation.ATTRIBUTES, "text", "", "version", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/util/Map;", "getAttributes", "()Ljava/util/Map;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Ljava/lang/Long;", "getVersion", "()Ljava/lang/Long;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s {

    @com.google.gson.annotations.c(Navigation.ATTRIBUTES)
    @Y61.l
    private final Map<String, t> attributes;

    @com.google.gson.annotations.c("text")
    @Y61.l
    private final String text;

    @com.google.gson.annotations.c("version")
    @Y61.l
    private final Long version;

    public s(@Y61.l Map<String, t> map, @Y61.l String str, @Y61.l Long l12) {
        this.attributes = map;
        this.text = str;
        this.version = l12;
    }
}

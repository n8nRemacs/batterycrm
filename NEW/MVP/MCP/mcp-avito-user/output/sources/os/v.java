package os;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Los/v;", "", "", "maxLimit", "minLimit", ChannelContext.Item.PLACEHOLDER, "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "d", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class v {

    @com.google.gson.annotations.c("maxLimit")
    @Y61.k
    private final String maxLimit;

    @com.google.gson.annotations.c("minLimit")
    @Y61.k
    private final String minLimit;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @Y61.l
    private final String placeholder;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final String value;

    public v(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4) {
        this.maxLimit = str;
        this.minLimit = str2;
        this.placeholder = str3;
        this.value = str4;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getMaxLimit() {
        return this.maxLimit;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getMinLimit() {
        return this.minLimit;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}

package YF0;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: ApiTrxPromoConfigureV7Response.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LYF0/k;", "", "", "format", ChannelContext.Item.PLACEHOLDER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    @com.google.gson.annotations.c("format")
    @Y61.k
    private final String format;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @Y61.k
    private final String placeholder;

    public k(@Y61.k String str, @Y61.k String str2) {
        this.format = str;
        this.placeholder = str2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }
}

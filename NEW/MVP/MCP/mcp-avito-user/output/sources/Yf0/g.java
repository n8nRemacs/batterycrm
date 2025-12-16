package YF0;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.ApiDatesV3WithDateRangeOptionsItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTrxPromoConfigureV7Response.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LYF0/g;", "", "", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItem;", "options", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    @com.google.gson.annotations.c("options")
    @Y61.k
    private final List<ApiDatesV3WithDateRangeOptionsItem> options;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public g(@Y61.k List<ApiDatesV3WithDateRangeOptionsItem> list, @Y61.k AttributedText attributedText) {
        this.options = list;
        this.title = attributedText;
    }

    @Y61.k
    public final List<ApiDatesV3WithDateRangeOptionsItem> a() {
        return this.options;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}

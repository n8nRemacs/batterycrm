package YF0;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.OkResponseSuccessOkBannerButtonsItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTrxPromoConfigureV7Response.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"LYF0/p;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "agreement", "", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/OkResponseSuccessOkBannerButtonsItem;", "buttons", "LYF0/g;", "dates", "extraInfo", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;LYF0/g;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LYF0/g;", "c", "()LYF0/g;", "d", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p {

    @com.google.gson.annotations.c("agreement")
    @Y61.l
    private final AttributedText agreement;

    @com.google.gson.annotations.c("buttons")
    @Y61.l
    private final List<OkResponseSuccessOkBannerButtonsItem> buttons;

    @com.google.gson.annotations.c("dates")
    @Y61.l
    private final g dates;

    @com.google.gson.annotations.c("extraInfo")
    @Y61.l
    private final AttributedText extraInfo;

    public p(@Y61.l AttributedText attributedText, @Y61.l List<OkResponseSuccessOkBannerButtonsItem> list, @Y61.l g gVar, @Y61.l AttributedText attributedText2) {
        this.agreement = attributedText;
        this.buttons = list;
        this.dates = gVar;
        this.extraInfo = attributedText2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final AttributedText getAgreement() {
        return this.agreement;
    }

    @Y61.l
    public final List<OkResponseSuccessOkBannerButtonsItem> b() {
        return this.buttons;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final g getDates() {
        return this.dates;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AttributedText getExtraInfo() {
        return this.extraInfo;
    }
}

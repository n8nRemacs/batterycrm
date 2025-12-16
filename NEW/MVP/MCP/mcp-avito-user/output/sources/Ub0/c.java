package UB0;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.generated.api.api_tariff_cpx_info_v_4.OkResponseSuccessCardsItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTariffCpxInfoV4Response.kt */
@P
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"LUB0/c;", "", "LUB0/d;", "ab360Subscriptions", "", "Lcom/avito/android/tariff/generated/api/api_tariff_cpx_info_v_4/OkResponseSuccessCardsItem;", "cards", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LUB0/o;", "level", "LUB0/u;", "tabsGroup", "", "title", "LUB0/v;", "titleButton", "Lcom/avito/android/deep_linking/links/DeepLink;", "uxFeedbackUri", "<init>", "(LUB0/d;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;LUB0/o;Ljava/util/List;Ljava/lang/String;LUB0/v;Lcom/avito/android/deep_linking/links/DeepLink;)V", "LUB0/d;", "getAb360Subscriptions", "()LUB0/d;", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "LUB0/o;", "c", "()LUB0/o;", "d", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "LUB0/v;", "f", "()LUB0/v;", "Lcom/avito/android/deep_linking/links/DeepLink;", "g", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    @com.google.gson.annotations.c("ab360Subscriptions")
    @Y61.l
    private final d ab360Subscriptions;

    @com.google.gson.annotations.c("cards")
    @Y61.l
    private final List<OkResponseSuccessCardsItem> cards;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("level")
    @Y61.l
    private final o level;

    @com.google.gson.annotations.c("tabsGroup")
    @Y61.l
    private final List<u> tabsGroup;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("titleButton")
    @Y61.l
    private final v titleButton;

    @com.google.gson.annotations.c("uxFeedbackUri")
    @Y61.l
    private final DeepLink uxFeedbackUri;

    public c(@Y61.l d dVar, @Y61.l List<OkResponseSuccessCardsItem> list, @Y61.l AttributedText attributedText, @Y61.l o oVar, @Y61.l List<u> list2, @Y61.k String str, @Y61.l v vVar, @Y61.l DeepLink deepLink) {
        this.ab360Subscriptions = dVar;
        this.cards = list;
        this.description = attributedText;
        this.level = oVar;
        this.tabsGroup = list2;
        this.title = str;
        this.titleButton = vVar;
        this.uxFeedbackUri = deepLink;
    }

    @Y61.l
    public final List<OkResponseSuccessCardsItem> a() {
        return this.cards;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final o getLevel() {
        return this.level;
    }

    @Y61.l
    public final List<u> d() {
        return this.tabsGroup;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final v getTitleButton() {
        return this.titleButton;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final DeepLink getUxFeedbackUri() {
        return this.uxFeedbackUri;
    }
}

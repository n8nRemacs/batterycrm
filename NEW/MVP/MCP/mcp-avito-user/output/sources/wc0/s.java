package wC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTariffCptInfoV3Response.kt */
@P
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001Bq\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b&\u0010\u0019R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"LwC0/s;", "", "", "LwC0/e;", "cards", "LwC0/d;", "collapsedConditionsButton", "LwC0/u;", "conditionsButton", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LwC0/m;", "level", "LwC0/r;", "monthResultItems", "LwC0/t;", "tabsGroup", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "uxFeedbackUri", "<init>", "(Ljava/util/List;LwC0/d;LwC0/u;Lcom/avito/android/remote/model/text/AttributedText;LwC0/m;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LwC0/d;", "b", "()LwC0/d;", "LwC0/u;", "c", "()LwC0/u;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "LwC0/m;", "e", "()LwC0/m;", "getMonthResultItems", "f", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "h", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s {

    @com.google.gson.annotations.c("cards")
    @Y61.l
    private final List<e> cards;

    @com.google.gson.annotations.c("collapsedConditionsButton")
    @Y61.l
    private final d collapsedConditionsButton;

    @com.google.gson.annotations.c("conditionsButton")
    @Y61.l
    private final u conditionsButton;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("level")
    @Y61.l
    private final m level;

    @com.google.gson.annotations.c("monthResultItems")
    @Y61.l
    private final List<r> monthResultItems;

    @com.google.gson.annotations.c("tabsGroup")
    @Y61.l
    private final List<t> tabsGroup;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("uxFeedbackUri")
    @Y61.l
    private final DeepLink uxFeedbackUri;

    public s(@Y61.l List<e> list, @Y61.l d dVar, @Y61.l u uVar, @Y61.l AttributedText attributedText, @Y61.l m mVar, @Y61.l List<r> list2, @Y61.l List<t> list3, @Y61.k String str, @Y61.l DeepLink deepLink) {
        this.cards = list;
        this.collapsedConditionsButton = dVar;
        this.conditionsButton = uVar;
        this.description = attributedText;
        this.level = mVar;
        this.monthResultItems = list2;
        this.tabsGroup = list3;
        this.title = str;
        this.uxFeedbackUri = deepLink;
    }

    @Y61.l
    public final List<e> a() {
        return this.cards;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final d getCollapsedConditionsButton() {
        return this.collapsedConditionsButton;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final u getConditionsButton() {
        return this.conditionsButton;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final m getLevel() {
        return this.level;
    }

    @Y61.l
    public final List<t> f() {
        return this.tabsGroup;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final DeepLink getUxFeedbackUri() {
        return this.uxFeedbackUri;
    }
}

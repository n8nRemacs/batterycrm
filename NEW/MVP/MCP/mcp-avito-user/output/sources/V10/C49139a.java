package v10;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1MortgageCatalogCalculatorOffersGetResponse.kt */
@P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lv10/a;", "", "", "Lv10/d;", "offers", "Lv10/o;", "offersSummary", "Lv10/p;", "offersTeaser", "Lcom/avito/android/deep_linking/links/DeepLink;", "primaryActionLink", "Lv10/r;", "programsStaticDescriptions", "secondaryActionLink", "Lv10/l;", "snippet", "<init>", "(Ljava/util/List;Lv10/o;Lv10/p;Lcom/avito/android/deep_linking/links/DeepLink;Lv10/r;Lcom/avito/android/deep_linking/links/DeepLink;Lv10/l;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lv10/o;", "b", "()Lv10/o;", "Lv10/p;", "c", "()Lv10/p;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lv10/r;", "e", "()Lv10/r;", "f", "Lv10/l;", "g", "()Lv10/l;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49139a {

    @com.google.gson.annotations.c("offers")
    @Y61.k
    private final List<d> offers;

    @com.google.gson.annotations.c("offersSummary")
    @Y61.k
    private final o offersSummary;

    @com.google.gson.annotations.c("offersTeaser")
    @Y61.k
    private final p offersTeaser;

    @com.google.gson.annotations.c("primaryActionLink")
    @Y61.k
    private final DeepLink primaryActionLink;

    @com.google.gson.annotations.c("programsStaticDescriptions")
    @Y61.k
    private final r programsStaticDescriptions;

    @com.google.gson.annotations.c("secondaryActionLink")
    @Y61.l
    private final DeepLink secondaryActionLink;

    @com.google.gson.annotations.c("snippet")
    @Y61.k
    private final l snippet;

    public C49139a(@Y61.k List<d> list, @Y61.k o oVar, @Y61.k p pVar, @Y61.k DeepLink deepLink, @Y61.k r rVar, @Y61.l DeepLink deepLink2, @Y61.k l lVar) {
        this.offers = list;
        this.offersSummary = oVar;
        this.offersTeaser = pVar;
        this.primaryActionLink = deepLink;
        this.programsStaticDescriptions = rVar;
        this.secondaryActionLink = deepLink2;
        this.snippet = lVar;
    }

    @Y61.k
    public final List<d> a() {
        return this.offers;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final o getOffersSummary() {
        return this.offersSummary;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final p getOffersTeaser() {
        return this.offersTeaser;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final DeepLink getPrimaryActionLink() {
        return this.primaryActionLink;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final r getProgramsStaticDescriptions() {
        return this.programsStaticDescriptions;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final DeepLink getSecondaryActionLink() {
        return this.secondaryActionLink;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final l getSnippet() {
        return this.snippet;
    }
}

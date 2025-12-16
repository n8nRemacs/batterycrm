package JF;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig.esia_redirect_screen.generated.api.get_self_employement_esia_url.GetSelfEmploymentEsiaRespSuccessActionsItem;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetSelfEmployementEsiaUrlResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"LJF/a;", "", "", "Lcom/avito/android/gig/esia_redirect_screen/generated/api/get_self_employement_esia_url/GetSelfEmploymentEsiaRespSuccessActionsItem;", "actions", "", "disclaimers", "logoUrl", "Lcom/avito/android/deep_linking/links/DeepLink;", "supportDeeplink", "title", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "e", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    @c("actions")
    @k
    private final List<GetSelfEmploymentEsiaRespSuccessActionsItem> actions;

    @c("disclaimers")
    @k
    private final List<String> disclaimers;

    @c("logoUrl")
    @k
    private final String logoUrl;

    @c("supportDeeplink")
    @l
    private final DeepLink supportDeeplink;

    @c("title")
    @k
    private final String title;

    public a(@k List<GetSelfEmploymentEsiaRespSuccessActionsItem> list, @k List<String> list2, @k String str, @l DeepLink deepLink, @k String str2) {
        this.actions = list;
        this.disclaimers = list2;
        this.logoUrl = str;
        this.supportDeeplink = deepLink;
        this.title = str2;
    }

    @k
    public final List<GetSelfEmploymentEsiaRespSuccessActionsItem> a() {
        return this.actions;
    }

    @k
    public final List<String> b() {
        return this.disclaimers;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final DeepLink getSupportDeeplink() {
        return this.supportDeeplink;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}

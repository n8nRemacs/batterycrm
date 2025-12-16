package FF;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig.document_verification_status_screen.generated.api.get_self_employment_status.GetSelfEmploymentStatusRespSuccessActionsItem;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetSelfEmploymentStatusResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, d2 = {"LFF/a;", "", "", "Lcom/avito/android/gig/document_verification_status_screen/generated/api/get_self_employment_status/GetSelfEmploymentStatusRespSuccessActionsItem;", "actions", "", "description", "logoUrl", "status", "Lcom/avito/android/deep_linking/links/DeepLink;", "supportDeeplink", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "f", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    @c("actions")
    @k
    private final List<GetSelfEmploymentStatusRespSuccessActionsItem> actions;

    @c("description")
    @k
    private final String description;

    @c("logoUrl")
    @k
    private final String logoUrl;

    @c("status")
    @l
    private final String status;

    @c("supportDeeplink")
    @l
    private final DeepLink supportDeeplink;

    @c("title")
    @k
    private final String title;

    public a(@k List<GetSelfEmploymentStatusRespSuccessActionsItem> list, @k String str, @k String str2, @l String str3, @l DeepLink deepLink, @k String str4) {
        this.actions = list;
        this.description = str;
        this.logoUrl = str2;
        this.status = str3;
        this.supportDeeplink = deepLink;
        this.title = str4;
    }

    @k
    public final List<GetSelfEmploymentStatusRespSuccessActionsItem> a() {
        return this.actions;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DeepLink getSupportDeeplink() {
        return this.supportDeeplink;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}

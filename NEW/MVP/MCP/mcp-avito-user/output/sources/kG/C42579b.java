package kG;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig.registration_self_employment_redirect_screen.generated.api.get_self_employment_registration.GetSelfEmploymentRegistrationRespSuccessActionsItem;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetSelfEmploymentRegistrationResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"LkG/b;", "", "", "Lcom/avito/android/gig/registration_self_employment_redirect_screen/generated/api/get_self_employment_registration/GetSelfEmploymentRegistrationRespSuccessActionsItem;", "actions", "", "description", "LkG/a;", "steps", "Lcom/avito/android/deep_linking/links/DeepLink;", "supportDeeplink", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "e", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kG.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C42579b {

    @c("actions")
    @k
    private final List<GetSelfEmploymentRegistrationRespSuccessActionsItem> actions;

    @c("description")
    @k
    private final String description;

    @c("steps")
    @k
    private final List<C42578a> steps;

    @c("supportDeeplink")
    @l
    private final DeepLink supportDeeplink;

    @c("title")
    @k
    private final String title;

    public C42579b(@k List<GetSelfEmploymentRegistrationRespSuccessActionsItem> list, @k String str, @k List<C42578a> list2, @l DeepLink deepLink, @k String str2) {
        this.actions = list;
        this.description = str;
        this.steps = list2;
        this.supportDeeplink = deepLink;
        this.title = str2;
    }

    @k
    public final List<GetSelfEmploymentRegistrationRespSuccessActionsItem> a() {
        return this.actions;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    public final List<C42578a> c() {
        return this.steps;
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

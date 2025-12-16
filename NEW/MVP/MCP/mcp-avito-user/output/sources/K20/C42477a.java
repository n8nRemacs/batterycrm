package k20;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2MortgageFormParticipantCreatePostResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lk20/a;", "", "", "applicantId", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "Lk20/c;", "validation", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k20.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42477a {

    @com.google.gson.annotations.c("applicantId")
    @l
    private final String applicantId;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("validation")
    @l
    private final List<C42479c> validation;

    public C42477a(@l String str, @l DeepLink deepLink, @l List<C42479c> list) {
        this.applicantId = str;
        this.deeplink = deepLink;
        this.validation = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getApplicantId() {
        return this.applicantId;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final List<C42479c> c() {
        return this.validation;
    }
}

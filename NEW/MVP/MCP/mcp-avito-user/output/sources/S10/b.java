package S10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateApplicationResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LS10/b;", "", "", "applicationId", "Lcom/avito/android/deep_linking/links/DeepLink;", "applicationDeeplink", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @l
    private final DeepLink applicationDeeplink;

    @com.google.gson.annotations.c("applicationId")
    @l
    private final String applicationId;

    public b(@l String str, @l DeepLink deepLink) {
        this.applicationId = str;
        this.applicationDeeplink = deepLink;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DeepLink getApplicationDeeplink() {
        return this.applicationDeeplink;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.applicationId, bVar.applicationId) && L.f(this.applicationDeeplink, bVar.applicationDeeplink);
    }

    public final int hashCode() {
        String str = this.applicationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeepLink deepLink = this.applicationDeeplink;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateApplicationResponse(applicationId=");
        sb2.append(this.applicationId);
        sb2.append(", applicationDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.applicationDeeplink, ')');
    }
}

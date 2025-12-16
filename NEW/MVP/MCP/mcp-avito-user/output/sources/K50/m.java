package K50;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateProfileResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LK50/m;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "nextStepLink", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class m {

    @com.google.gson.annotations.c("nextStepLink")
    @Y61.k
    private final DeepLink nextStepLink;

    public m(@Y61.k DeepLink deepLink) {
        this.nextStepLink = deepLink;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final DeepLink getNextStepLink() {
        return this.nextStepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && L.f(this.nextStepLink, ((m) obj).nextStepLink);
    }

    public final int hashCode() {
        return this.nextStepLink.hashCode();
    }

    @Y61.k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("Success(nextStepLink="), this.nextStepLink, ')');
    }
}

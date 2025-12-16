package fW0;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommonStatsBasicIndicators.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LfW0/i;", "", "", "value", "Lcom/avito/android/deep_linking/links/DeepLink;", "descriptionDeeplink", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class i {

    @com.google.gson.annotations.c("descriptionDeeplink")
    @Y61.k
    private final DeepLink descriptionDeeplink;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final String value;

    public i(@Y61.k String str, @Y61.k DeepLink deepLink) {
        this.value = str;
        this.descriptionDeeplink = deepLink;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final DeepLink getDescriptionDeeplink() {
        return this.descriptionDeeplink;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.value, iVar.value) && L.f(this.descriptionDeeplink, iVar.descriptionDeeplink);
    }

    public final int hashCode() {
        return this.descriptionDeeplink.hashCode() + (this.value.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Conversion(value=");
        sb2.append(this.value);
        sb2.append(", descriptionDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.descriptionDeeplink, ')');
    }
}

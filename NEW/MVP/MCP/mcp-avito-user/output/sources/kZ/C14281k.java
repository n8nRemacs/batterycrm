package KZ;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: ApplicationAppealsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKZ/k;", "", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14281k {

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @Y61.k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14281k(@Y61.k String str, @Y61.k DeepLink deepLink) {
        this.title = str;
        this.deeplink = deepLink;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14281k)) {
            return false;
        }
        C14281k c14281k = (C14281k) obj;
        return kotlin.jvm.internal.L.f(this.title, c14281k.title) && kotlin.jvm.internal.L.f(this.deeplink, c14281k.deeplink);
    }

    public final int hashCode() {
        return this.deeplink.hashCode() + (this.title.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationAppealTextToManagerButton(title=");
        sb2.append(this.title);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
    }
}

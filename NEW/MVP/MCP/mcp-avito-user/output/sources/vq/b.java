package Vq;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddAdvertToComparisonResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"LVq/b;", "", "", "buttonTitle", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "d", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b {

    @com.google.gson.annotations.c("buttonTitle")
    @k
    private final String buttonTitle;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink link;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    public b(@k String str, @k String str2, @k DeepLink deepLink, @l String str3) {
        this.buttonTitle = str;
        this.title = str2;
        this.link = deepLink;
        this.url = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.buttonTitle, bVar.buttonTitle) && L.f(this.title, bVar.title) && L.f(this.link, bVar.link) && L.f(this.url, bVar.url);
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.link, H.d(this.buttonTitle.hashCode() * 31, 31, this.title), 31);
        String str = this.url;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Alert(buttonTitle=");
        sb2.append(this.buttonTitle);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", url=");
        return C22026a.c(sb2, this.url, ')');
    }
}

package eW0;

import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmptyScreenData.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LeW0/c;", "", "", "title", "description", "buttonText", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "getButtonText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eW0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40060c {

    @com.google.gson.annotations.c("button_text")
    @Y61.k
    private final String buttonText;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final String description;

    @com.google.gson.annotations.c("link")
    @Y61.k
    private final DeepLink link;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C40060c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink) {
        this.title = str;
        this.description = str2;
        this.buttonText = str3;
        this.link = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40060c)) {
            return false;
        }
        C40060c c40060c = (C40060c) obj;
        return L.f(this.title, c40060c.title) && L.f(this.description, c40060c.description) && L.f(this.buttonText, c40060c.buttonText) && L.f(this.link, c40060c.link);
    }

    public final int hashCode() {
        return this.link.hashCode() + H.d(H.d(this.title.hashCode() * 31, 31, this.description), 31, this.buttonText);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmptyScreenData(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", buttonText=");
        sb2.append(this.buttonText);
        sb2.append(", link=");
        return com.avito.android.actions_sheet.a.v(sb2, this.link, ')');
    }
}

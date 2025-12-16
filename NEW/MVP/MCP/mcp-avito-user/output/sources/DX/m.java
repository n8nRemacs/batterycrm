package dX;

import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceGrayResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LdX/m;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "", "LdX/n;", "sections", "LdX/q;", Constants.REFERRER_API_META, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;LdX/q;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LdX/q;", "a", "()LdX/q;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class m {

    @com.google.gson.annotations.c(Constants.REFERRER_API_META)
    @Y61.l
    private final q meta;

    @com.google.gson.annotations.c("sections")
    @Y61.k
    private final List<n> sections;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public m(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.k List<n> list, @Y61.l q qVar) {
        this.title = str;
        this.subtitle = attributedText;
        this.sections = list;
        this.meta = qVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final q getMeta() {
        return this.meta;
    }

    @Y61.k
    public final List<n> b() {
        return this.sections;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.title, mVar.title) && L.f(this.subtitle, mVar.subtitle) && L.f(this.sections, mVar.sections) && L.f(this.meta, mVar.meta);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iE2 = H.e((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.sections);
        q qVar = this.meta;
        return iE2 + (qVar != null ? qVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "QualityServiceGrayResult(title=" + this.title + ", subtitle=" + this.subtitle + ", sections=" + this.sections + ", meta=" + this.meta + ')';
    }
}

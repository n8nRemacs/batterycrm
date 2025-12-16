package fW0;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfigStatsV2.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LfW0/k;", "", "", "isExpanded", "isExtracted", "", "LfW0/z;", "metrics", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(ZZLjava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "Z", "c", "()Z", "d", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k {

    @com.google.gson.annotations.c("isExpanded")
    private final boolean isExpanded;

    @com.google.gson.annotations.c("isExtracted")
    private final boolean isExtracted;

    @com.google.gson.annotations.c("metrics")
    @Y61.k
    private final List<z> metrics;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public k(boolean z12, boolean z13, @Y61.k List<z> list, @Y61.k AttributedText attributedText) {
        this.isExpanded = z12;
        this.isExtracted = z13;
        this.metrics = list;
        this.title = attributedText;
    }

    @Y61.k
    public final List<z> a() {
        return this.metrics;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsExtracted() {
        return this.isExtracted;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.isExpanded == kVar.isExpanded && this.isExtracted == kVar.isExtracted && L.f(this.metrics, kVar.metrics) && L.f(this.title, kVar.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + H.e(androidx.appcompat.app.r.i(Boolean.hashCode(this.isExpanded) * 31, 31, this.isExtracted), 31, this.metrics);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataMetricGroupsItem(isExpanded=");
        sb2.append(this.isExpanded);
        sb2.append(", isExtracted=");
        sb2.append(this.isExtracted);
        sb2.append(", metrics=");
        sb2.append(this.metrics);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.title, ')');
    }
}

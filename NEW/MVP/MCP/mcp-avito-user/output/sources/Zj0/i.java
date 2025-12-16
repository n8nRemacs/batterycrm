package ZJ0;

import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3SellersPrivateStatisticsGeneralConfigPostResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LZJ0/i;", "", "", "isExpanded", "isExtracted", "", "LZJ0/o;", "metrics", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(ZZLjava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "Z", "c", "()Z", "d", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i {

    @com.google.gson.annotations.c("isExpanded")
    private final boolean isExpanded;

    @com.google.gson.annotations.c("isExtracted")
    private final boolean isExtracted;

    @com.google.gson.annotations.c("metrics")
    @Y61.k
    private final List<o> metrics;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public i(boolean z12, boolean z13, @Y61.k List<o> list, @Y61.k AttributedText attributedText) {
        this.isExpanded = z12;
        this.isExtracted = z13;
        this.metrics = list;
        this.title = attributedText;
    }

    @Y61.k
    public final List<o> a() {
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
}

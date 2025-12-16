package fW0;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommonStatsBasicIndicators.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LfW0/l;", "", "", "title", "", "value", "<init>", "(Ljava/lang/String;D)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "D", "b", "()D", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class l {

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("value")
    private final double value;

    public l(@Y61.k String str, double d12) {
        this.title = str;
        this.value = d12;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: b, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.title, lVar.title) && Double.compare(this.value, lVar.value) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.value) + (this.title.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DetailItem(title=");
        sb2.append(this.title);
        sb2.append(", value=");
        return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.value, ')');
    }
}

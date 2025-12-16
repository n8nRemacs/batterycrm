package fW0;

import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommonStatsBasicIndicators.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LfW0/u;", "", "", "title", "count", "LfW0/a;", "change", "description", "LfW0/i;", "conversion", "Lcom/avito/android/deep_linking/links/DeepLink;", "toolTip", "<init>", "(Ljava/lang/String;Ljava/lang/String;LfW0/a;Ljava/lang/String;LfW0/i;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "LfW0/a;", "a", "()LfW0/a;", "d", "LfW0/i;", "b", "()LfW0/i;", "Lcom/avito/android/deep_linking/links/DeepLink;", "f", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class u {

    @com.google.gson.annotations.c("change")
    @Y61.l
    private final C40348a change;

    @com.google.gson.annotations.c("conversion")
    @Y61.l
    private final i conversion;

    @com.google.gson.annotations.c("count")
    @Y61.k
    private final String count;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("toolTip")
    @Y61.l
    private final DeepLink toolTip;

    public u(@Y61.k String str, @Y61.k String str2, @Y61.l C40348a c40348a, @Y61.l String str3, @Y61.l i iVar, @Y61.l DeepLink deepLink) {
        this.title = str;
        this.count = str2;
        this.change = c40348a;
        this.description = str3;
        this.conversion = iVar;
        this.toolTip = deepLink;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C40348a getChange() {
        return this.change;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final i getConversion() {
        return this.conversion;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L.f(this.title, uVar.title) && L.f(this.count, uVar.count) && L.f(this.change, uVar.change) && L.f(this.description, uVar.description) && L.f(this.conversion, uVar.conversion) && L.f(this.toolTip, uVar.toolTip);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final DeepLink getToolTip() {
        return this.toolTip;
    }

    public final int hashCode() {
        int iD2 = H.d(this.title.hashCode() * 31, 31, this.count);
        C40348a c40348a = this.change;
        int iHashCode = (iD2 + (c40348a == null ? 0 : c40348a.hashCode())) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.conversion;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        DeepLink deepLink = this.toolTip;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Item(title=");
        sb2.append(this.title);
        sb2.append(", count=");
        sb2.append(this.count);
        sb2.append(", change=");
        sb2.append(this.change);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", conversion=");
        sb2.append(this.conversion);
        sb2.append(", toolTip=");
        return com.avito.android.actions_sheet.a.v(sb2, this.toolTip, ')');
    }
}

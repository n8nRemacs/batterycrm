package fW0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CommonStatsBasicIndicators.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LfW0/a;", "", "", "value", "description", "Lcom/avito/android/remote/model/UniversalColor;", "color", "Lcom/avito/android/deep_linking/links/DeepLink;", "detailsLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Lcom/avito/android/remote/model/UniversalColor;", "a", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fW0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40348a {

    @com.google.gson.annotations.c("color")
    @Y61.l
    private final UniversalColor color;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("detailsLink")
    @Y61.l
    private final DeepLink detailsLink;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final String value;

    public C40348a(@Y61.k String str, @Y61.l String str2, @Y61.l UniversalColor universalColor, @Y61.l DeepLink deepLink) {
        this.value = str;
        this.description = str2;
        this.color = universalColor;
        this.detailsLink = deepLink;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final DeepLink getDetailsLink() {
        return this.detailsLink;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40348a)) {
            return false;
        }
        C40348a c40348a = (C40348a) obj;
        return L.f(this.value, c40348a.value) && L.f(this.description, c40348a.description) && L.f(this.color, c40348a.color) && L.f(this.detailsLink, c40348a.detailsLink);
    }

    public final int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UniversalColor universalColor = this.color;
        int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        DeepLink deepLink = this.detailsLink;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Change(value=");
        sb2.append(this.value);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", detailsLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.detailsLink, ')');
    }

    public /* synthetic */ C40348a(String str, String str2, UniversalColor universalColor, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, universalColor, deepLink);
    }
}

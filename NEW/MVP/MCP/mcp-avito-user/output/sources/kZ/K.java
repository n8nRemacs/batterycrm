package KZ;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: ApplicationBorrowerItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LKZ/K;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "iconBadgeColor", "iconName", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "LKZ/L;", "context", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;LKZ/L;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LKZ/L;", "a", "()LKZ/L;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class K {

    @com.google.gson.annotations.c("context")
    @Y61.l
    private final L context;

    @com.google.gson.annotations.c("iconBadgeColor")
    @Y61.l
    private final String iconBadgeColor;

    @com.google.gson.annotations.c("iconName")
    @Y61.k
    private final String iconName;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.k
    private final DeepLink link;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public K(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l String str2, @Y61.k String str3, @Y61.k DeepLink deepLink, @Y61.l L l12) {
        this.title = str;
        this.subtitle = attributedText;
        this.iconBadgeColor = str2;
        this.iconName = str3;
        this.link = deepLink;
        this.context = l12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final L getContext() {
        return this.context;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getIconBadgeColor() {
        return this.iconBadgeColor;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k12 = (K) obj;
        return kotlin.jvm.internal.L.f(this.title, k12.title) && kotlin.jvm.internal.L.f(this.subtitle, k12.subtitle) && kotlin.jvm.internal.L.f(this.iconBadgeColor, k12.iconBadgeColor) && kotlin.jvm.internal.L.f(this.iconName, k12.iconName) && kotlin.jvm.internal.L.f(this.link, k12.link) && kotlin.jvm.internal.L.f(this.context, k12.context);
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.iconBadgeColor;
        int iE2 = com.avito.android.actions_sheet.a.e(this.link, androidx.compose.foundation.H.d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.iconName), 31);
        L l12 = this.context;
        return iE2 + (l12 != null ? l12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "BorrowerAction(title=" + this.title + ", subtitle=" + this.subtitle + ", iconBadgeColor=" + this.iconBadgeColor + ", iconName=" + this.iconName + ", link=" + this.link + ", context=" + this.context + ')';
    }
}

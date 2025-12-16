package JZ;

import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationBannerModel.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"LJZ/t;", "", "", "title", "", "isLoading", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "changeStatusTo", BeduinCartItemModel.DISABLED_STRING, "<init>", "(Ljava/lang/String;ZLcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Z)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Z", "e", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name */
    public final transient boolean f9040a;

    @com.google.gson.annotations.c("changeStatusTo")
    @Y61.l
    private final String changeStatusTo;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("isLoading")
    private final boolean isLoading;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public t(@Y61.k String str, boolean z12, @Y61.l DeepLink deepLink, @Y61.l String str2, boolean z13) {
        this.title = str;
        this.isLoading = z12;
        this.deeplink = deepLink;
        this.changeStatusTo = str2;
        this.f9040a = z13;
    }

    public static t a(t tVar, boolean z12) {
        return new t(tVar.title, tVar.isLoading, tVar.deeplink, tVar.changeStatusTo, z12);
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getChangeStatusTo() {
        return this.changeStatusTo;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.title, tVar.title) && this.isLoading == tVar.isLoading && L.f(this.deeplink, tVar.deeplink) && L.f(this.changeStatusTo, tVar.changeStatusTo) && this.f9040a == tVar.f9040a;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(this.title.hashCode() * 31, 31, this.isLoading);
        DeepLink deepLink = this.deeplink;
        int iHashCode = (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.changeStatusTo;
        return Boolean.hashCode(this.f9040a) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationBannerAction(title=");
        sb2.append(this.title);
        sb2.append(", isLoading=");
        sb2.append(this.isLoading);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", changeStatusTo=");
        sb2.append(this.changeStatusTo);
        sb2.append(", disabled=");
        return androidx.appcompat.app.r.x(sb2, this.f9040a, ')');
    }

    public /* synthetic */ t(String str, boolean z12, DeepLink deepLink, String str2, boolean z13, int i12, C42822w c42822w) {
        this(str, z12, deepLink, str2, (i12 & 16) != 0 ? false : z13);
    }
}

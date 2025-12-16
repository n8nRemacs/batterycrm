package KC0;

import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoResult.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKC0/t;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "LKC0/b;", "coloredIcon", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;LKC0/b;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LKC0/b;", "getColoredIcon", "()LKC0/b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class t {

    @com.google.gson.annotations.c("coloredIcon")
    @Y61.k
    private final b coloredIcon;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.k
    private final DeepLink deeplink;

    public t(@Y61.k DeepLink deepLink, @Y61.k b bVar) {
        this.deeplink = deepLink;
        this.coloredIcon = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.deeplink, tVar.deeplink) && L.f(this.coloredIcon, tVar.coloredIcon);
    }

    public final int hashCode() {
        return this.coloredIcon.hashCode() + (this.deeplink.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "Tooltip(deeplink=" + this.deeplink + ", coloredIcon=" + this.coloredIcon + ')';
    }
}

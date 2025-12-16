package pm;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleSaveSaleResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpm/d;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pm.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47113d {

    @com.google.gson.annotations.c("actions")
    @l
    private final List<BeduinAction> actions;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    /* JADX WARN: Multi-variable type inference failed */
    public C47113d(@k DeepLink deepLink, @l List<? extends BeduinAction> list) {
        this.deeplink = deepLink;
        this.actions = list;
    }

    @l
    public final List<BeduinAction> a() {
        return this.actions;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47113d)) {
            return false;
        }
        C47113d c47113d = (C47113d) obj;
        return L.f(this.deeplink, c47113d.deeplink) && L.f(this.actions, c47113d.actions);
    }

    public final int hashCode() {
        int iHashCode = this.deeplink.hashCode() * 31;
        List<BeduinAction> list = this.actions;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleSaveSaleResult(deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }
}

package AP0;

import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WalletPinBiometry.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LAP0/c;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "LAP0/d;", "resultParams", "", "Lcom/avito/android/beduin_models/BeduinAction;", "beduinActions", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;LAP0/d;Ljava/util/List;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LAP0/d;", "c", "()LAP0/d;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_wallet-biometry_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    @com.google.gson.annotations.c("beduinActions")
    @l
    private final List<BeduinAction> beduinActions;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("resultParams")
    @l
    private final d resultParams;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l DeepLink deepLink, @l d dVar, @l List<? extends BeduinAction> list) {
        this.deeplink = deepLink;
        this.resultParams = dVar;
        this.beduinActions = list;
    }

    @l
    public final List<BeduinAction> a() {
        return this.beduinActions;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final d getResultParams() {
        return this.resultParams;
    }

    public final boolean d() {
        d dVar;
        List<BeduinAction> list;
        DeepLink deepLink = this.deeplink;
        return !(deepLink == null || (deepLink instanceof NoMatchLink)) || ((dVar = this.resultParams) != null && dVar.c()) || !((list = this.beduinActions) == null || list.isEmpty());
    }
}

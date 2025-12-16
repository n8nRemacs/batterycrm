package hP0;

import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WalletSavePinResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LhP0/l;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "Lcom/avito/android/beduin_models/BeduinAction;", "beduinActions", "LAP0/a;", "biometry", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;LAP0/a;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "a", "()Ljava/util/List;", "LAP0/a;", "b", "()LAP0/a;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l {

    @com.google.gson.annotations.c("beduinActions")
    @Y61.l
    private final List<BeduinAction> beduinActions;

    @com.google.gson.annotations.c("biometry")
    @Y61.l
    private final AP0.a biometry;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @Y61.l
    private final DeepLink deeplink;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.l DeepLink deepLink, @Y61.l List<? extends BeduinAction> list, @Y61.l AP0.a aVar) {
        this.deeplink = deepLink;
        this.beduinActions = list;
        this.biometry = aVar;
    }

    @Y61.l
    public final List<BeduinAction> a() {
        return this.beduinActions;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AP0.a getBiometry() {
        return this.biometry;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }
}

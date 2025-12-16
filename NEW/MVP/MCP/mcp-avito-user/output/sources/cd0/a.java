package CD0;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.tariff_lf_constructor.configure.size.deeplink.TariffConfigureSizeLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: TariffConfigureSizeDeeplinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LCD0/a;", "LKu/a;", "Lcom/avito/android/tariff_lf_constructor/configure/size/deeplink/TariffConfigureSizeLink;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC14350a<TariffConfigureSizeLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new TariffConfigureSizeLink(i.n(uri, "context"), i.n(uri, "packageId"));
    }
}

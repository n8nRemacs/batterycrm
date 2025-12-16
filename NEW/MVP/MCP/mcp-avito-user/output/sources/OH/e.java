package oH;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.gig_apply.GigSlotMapDeeplink;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: GigSlotMapDeeplinkParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LoH/e;", "LKu/a;", "Lcom/avito/android/gig_apply/GigSlotMapDeeplink;", "<init>", "()V", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e extends AbstractC14350a<GigSlotMapDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("button_deeplink");
        String queryParameter2 = uri.getQueryParameter("title");
        String queryParameter3 = uri.getQueryParameter(AddressParameter.TYPE);
        String queryParameter4 = uri.getQueryParameter("lat");
        Double dW02 = queryParameter4 != null ? C43066x.w0(queryParameter4) : null;
        String queryParameter5 = uri.getQueryParameter(AddressParameter.Value.LNG);
        return new GigSlotMapDeeplink(queryParameter2, queryParameter3, dW02, queryParameter5 != null ? C43066x.w0(queryParameter5) : null, uri.getQueryParameter("button_name"), queryParameter != null ? xVar.b(queryParameter) : null);
    }
}

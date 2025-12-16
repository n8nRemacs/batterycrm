package q70;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.phone_confirmation.deep_linking.PhoneVerifyLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationLinkHandlerModule.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lq70/c;", "LKu/a;", "Lcom/avito/android/phone_confirmation/deep_linking/PhoneVerifyLink;", "<init>", "()V", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends AbstractC14350a<PhoneVerifyLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new PhoneVerifyLink(i.o(uri, "number"), Boolean.parseBoolean(uri.getQueryParameter("isCompany")));
    }
}

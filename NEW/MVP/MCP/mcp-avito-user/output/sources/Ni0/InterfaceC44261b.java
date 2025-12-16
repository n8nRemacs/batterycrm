package nI0;

import Y61.k;
import Y61.l;
import android.content.Intent;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.AdvertActionTransferData;
import kotlin.Metadata;

/* compiled from: UserAdvertsIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnI0/b;", "", "_avito_user-adverts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nI0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC44261b {

    /* compiled from: UserAdvertsIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nI0.b$a */
    public static final class a {
        public static /* synthetic */ Intent a(InterfaceC44261b interfaceC44261b, String str, AdvertActionTransferData advertActionTransferData, AdvertPublicationLink.Public r62, String str2, int i12) {
            String str3 = (i12 & 1) != 0 ? null : str;
            if ((i12 & 2) != 0) {
                advertActionTransferData = null;
            }
            AdvertPublicationLink.Public r42 = (i12 & 4) != 0 ? null : r62;
            boolean z12 = (i12 & 8) != 0;
            if ((i12 & 16) != 0) {
                str2 = null;
            }
            return interfaceC44261b.a(r42, advertActionTransferData, str3, str2, z12);
        }
    }

    @k
    Intent a(@l DeepLink deepLink, @l AdvertActionTransferData advertActionTransferData, @l String str, @l String str2, boolean z12);
}

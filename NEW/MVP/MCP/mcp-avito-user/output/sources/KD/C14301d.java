package Kd;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.AuctionDetails;
import com.avito.android.deep_linking.links.AuctionDetailsBottomSheetLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuctionDetailsBottomSheetLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LKd/d;", "LKu/a;", "Lcom/avito/android/deep_linking/links/AuctionDetailsBottomSheetLink;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Kd.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14301d extends AbstractC14350a<AuctionDetailsBottomSheetLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        C14299b c14299b = new C14299b(uri);
        try {
            Type type = new C14300c().getType();
            String queryParameter = uri.getQueryParameter("contentJson");
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE != null) {
                return new AuctionDetailsBottomSheetLink((AuctionDetails) objE);
            }
            c14299b.invoke(new IllegalArgumentException("Parameter contentJson is null!"));
            throw null;
        } catch (JsonParseException e12) {
            c14299b.invoke(e12);
            throw null;
        }
    }
}

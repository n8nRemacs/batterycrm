package wA0;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.support_bottom_sheet.SupportDialogDeeplink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: SupportDialogDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LwA0/e;", "LKu/a;", "Lcom/avito/android/support_bottom_sheet/SupportDialogDeeplink;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wA0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49479e extends AbstractC14350a<SupportDialogDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new SupportDialogDeeplink(i.p(uri, "supportPhone"), i.p(uri, "screenTag"), i.p(uri, "chatActionTitle"), uri.getQueryParameter("chatActionSubtitle"), i.p(uri, "phoneActionTitle"), uri.getQueryParameter("phoneActionSubtitle"));
    }
}

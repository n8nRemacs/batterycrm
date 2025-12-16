package com.avito.android.confirm_documents_bottom_sheet.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.confirm_documents_bottom_sheet.ConfirmDocumentsBottomSheetDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ConfirmDocumentsBottomSheetDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/deeplink/f;", "LKu/a;", "Lcom/avito/android/confirm_documents_bottom_sheet/ConfirmDocumentsBottomSheetDeeplink;", "<init>", "()V", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends AbstractC14350a<ConfirmDocumentsBottomSheetDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new ConfirmDocumentsBottomSheetDeeplink(uri.getQueryParameter("itemId"), uri.getQueryParameter("shiftId"), uri.getQueryParameter("fromPage"), uri.getQueryParameter("screenName"));
    }
}

package com.avito.android.select_bottom_sheet_dialog.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.select_bottom_sheet_dialog.deeplink.JobSelectBottomSheetDialogLink;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobSelectBottomSheetDialogDeeplinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/select_bottom_sheet_dialog/deeplink/h;", "LKu/a;", "Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink;", "<init>", "()V", "_avito_job_select-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends AbstractC14350a<JobSelectBottomSheetDialogLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        JobSelectBottomSheetDialogLink.Type typeValueOf;
        List list;
        try {
            typeValueOf = JobSelectBottomSheetDialogLink.Type.valueOf(uri.getQueryParameter("type").toUpperCase(Locale.ROOT));
        } catch (Exception e12) {
            V2.f318762a.a("DEFAULT_TAG", "Error when parse JobSelectBottomSheetDialogLink", e12);
            typeValueOf = JobSelectBottomSheetDialogLink.Type.f266860b;
        }
        String strP = i.p(uri, "title");
        String queryParameter = uri.getQueryParameter("selectedId");
        f fVar = new f(uri);
        try {
            Type type = new g().getType();
            String queryParameter2 = uri.getQueryParameter("options");
            if (queryParameter2 != null && (list = (List) gson.e(queryParameter2, type)) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    return new JobSelectBottomSheetDialogLink(typeValueOf, strP, list, queryParameter);
                }
            }
            fVar.invoke(new IllegalArgumentException("Parameter options is null!"));
            throw null;
        } catch (JsonParseException e13) {
            fVar.invoke(e13);
            throw null;
        }
    }
}

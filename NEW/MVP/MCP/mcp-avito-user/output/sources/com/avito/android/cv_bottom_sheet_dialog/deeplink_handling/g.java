package com.avito.android.cv_bottom_sheet_dialog.deeplink_handling;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.cv_bottom_sheet_dialog.deeplink.JobCvBottomSheetLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: CvBottomSheetDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cv_bottom_sheet_dialog/deeplink_handling/g;", "LKu/a;", "Lcom/avito/android/cv_bottom_sheet_dialog/deeplink/JobCvBottomSheetLink;", "<init>", "()V", "_avito_job_cv-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends AbstractC14350a<JobCvBottomSheetLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new JobCvBottomSheetLink(i.n(uri, "itemId"));
    }
}

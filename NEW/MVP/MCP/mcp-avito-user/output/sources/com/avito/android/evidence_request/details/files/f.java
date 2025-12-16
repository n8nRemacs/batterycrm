package com.avito.android.evidence_request.details.files;

import Rz.InterfaceC15097a;
import android.content.Context;
import android.content.res.Resources;
import android.text.format.Formatter;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: FileValidationErrorsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/files/f;", "", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f148442a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f148443b;

    public f(@Y61.k Context context, @Y61.k InterfaceC15097a interfaceC15097a) {
        Resources resources = context.getResources();
        this.f148442a = resources.getString(R.string.evidence_files_upload_failed);
        this.f148443b = resources.getString(R.string.evidence_file_exceeds_limit, Formatter.formatShortFileSize(context, interfaceC15097a.O0()));
    }
}

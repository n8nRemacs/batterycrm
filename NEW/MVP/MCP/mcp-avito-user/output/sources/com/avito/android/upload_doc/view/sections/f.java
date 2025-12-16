package com.avito.android.upload_doc.view.sections;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GigUploadDocSectionsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/view/sections/f;", "LTV0/e;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface f extends TV0.e {

    /* compiled from: GigUploadDocSectionsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void FB(@l DeepLink deepLink, @l String str);

    void rq(@k List<GigUploadDocDocumentItem> list);
}

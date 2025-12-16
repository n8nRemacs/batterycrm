package com.avito.android.confirm_documents_bottom_sheet.list;

import Y61.k;
import Y61.l;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentButtonItem;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentStatus;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DocumentButtonItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/list/e;", "LTV0/e;", "_avito_gig_confirm_documents_bottom_sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface e extends TV0.e {

    /* compiled from: DocumentButtonItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void FI(@l DocumentStatus documentStatus);

    void Iq(@k DocumentButtonItem documentButtonItem, @k Y41.l<? super DocumentButtonItem, G0> lVar);

    void b(@k String str);

    void n(@k String str);
}

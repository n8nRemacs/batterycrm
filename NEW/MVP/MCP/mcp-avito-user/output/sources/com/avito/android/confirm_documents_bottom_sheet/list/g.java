package com.avito.android.confirm_documents_bottom_sheet.list;

import Y41.l;
import Y61.k;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentButtonItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DocumentButtonsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/list/g;", "LTV0/d;", "Lcom/avito/android/confirm_documents_bottom_sheet/list/e;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/DocumentButtonItem;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements TV0.d<e, DocumentButtonItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DocumentButtonItem, G0> f125581b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super DocumentButtonItem, G0> lVar) {
        this.f125581b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        DocumentButtonItem documentButtonItem = (DocumentButtonItem) aVar;
        eVar2.b(documentButtonItem.f125589b);
        eVar2.n(documentButtonItem.f125590c);
        eVar2.FI(documentButtonItem.f125591d);
        eVar2.Iq(documentButtonItem, this.f125581b);
    }
}

package com.avito.android.upload_doc.view.document;

import Y41.l;
import Y61.k;
import android.net.Uri;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GigUploadDocDocumentPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/view/document/g;", "Lcom/avito/android/upload_doc/view/document/c;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<GigUploadDocDocumentItem, G0> f307030b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<GigUploadDocDocumentItem, G0> f307031c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<GigUploadDocDocumentItem, G0> f307032d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k @Named("ADD_DOC_CLICK") l<? super GigUploadDocDocumentItem, G0> lVar, @k @Named("DELETE_DOC_CLICK") l<? super GigUploadDocDocumentItem, G0> lVar2, @k @Named("RETRY_DOC_CLICK") l<? super GigUploadDocDocumentItem, G0> lVar3) {
        this.f307030b = lVar;
        this.f307031c = lVar2;
        this.f307032d = lVar3;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        GigUploadDocDocumentItem gigUploadDocDocumentItem = (GigUploadDocDocumentItem) aVar;
        iVar.setTitle(gigUploadDocDocumentItem.f307013d);
        Uri uri = gigUploadDocDocumentItem.f307015f;
        if (uri != null) {
            iVar.M4(uri);
            iVar.wb(new d(this, gigUploadDocDocumentItem));
        } else {
            iVar.N6();
            iVar.OO(new e(this, gigUploadDocDocumentItem), gigUploadDocDocumentItem.f307017h);
        }
        if (gigUploadDocDocumentItem.f307019j) {
            iVar.l9(new f(this, gigUploadDocDocumentItem));
        } else if (gigUploadDocDocumentItem.f307018i) {
            iVar.c0();
        } else {
            iVar.Zi();
        }
    }
}

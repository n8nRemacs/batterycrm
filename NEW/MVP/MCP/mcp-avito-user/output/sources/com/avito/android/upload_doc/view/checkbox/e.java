package com.avito.android.upload_doc.view.checkbox;

import Y41.p;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GigUploadDocCheckboxPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/view/checkbox/e;", "Lcom/avito/android/upload_doc/view/checkbox/c;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<Boolean, GigUploadDocCheckboxItem, G0> f306989b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k p<? super Boolean, ? super GigUploadDocCheckboxItem, G0> pVar) {
        this.f306989b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        GigUploadDocCheckboxItem gigUploadDocCheckboxItem = (GigUploadDocCheckboxItem) aVar;
        ((g) eVar).lQ(gigUploadDocCheckboxItem, new d(this, gigUploadDocCheckboxItem));
    }
}

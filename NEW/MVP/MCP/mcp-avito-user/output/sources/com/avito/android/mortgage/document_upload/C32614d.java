package com.avito.android.mortgage.document_upload;

import com.avito.android.mortgage.document_upload.DocumentUploadFragment;
import e00.C39840a;
import f00.InterfaceC40194a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DocumentUploadFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le00/a;", "it", "Lkotlin/G0;", "invoke", "(Le00/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage.document_upload.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32614d extends kotlin.jvm.internal.N implements Y41.l<C39840a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DocumentUploadFragment f199162l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32614d(DocumentUploadFragment documentUploadFragment) {
        super(1);
        this.f199162l = documentUploadFragment;
    }

    @Override // Y41.l
    public final G0 invoke(C39840a c39840a) {
        DocumentUploadFragment.a aVar = DocumentUploadFragment.f199027B0;
        this.f199162l.r5().accept(new InterfaceC40194a.f(c39840a));
        return G0.f406611a;
    }
}

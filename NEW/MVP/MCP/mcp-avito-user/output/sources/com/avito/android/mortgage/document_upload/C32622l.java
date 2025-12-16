package com.avito.android.mortgage.document_upload;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.document_upload.DocumentUploadFragment;
import f00.InterfaceC40194a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DocumentUploadFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage.document_upload.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32622l extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DocumentUploadFragment f199376l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32622l(DocumentUploadFragment documentUploadFragment) {
        super(1);
        this.f199376l = documentUploadFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DocumentUploadFragment.a aVar = DocumentUploadFragment.f199027B0;
        this.f199376l.r5().accept(new InterfaceC40194a.h(deepLink));
        return G0.f406611a;
    }
}

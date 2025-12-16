package com.avito.android.mortgage.document_upload;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DocumentUploadFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage.document_upload.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32623m extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DocumentUploadFragment f199377l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32623m(DocumentUploadFragment documentUploadFragment) {
        super(1);
        this.f199377l = documentUploadFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f199377l.f199034s0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink2, null, null, 6);
        return G0.f406611a;
    }
}

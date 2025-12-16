package com.avito.android.mortgage.document_upload;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import f00.d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DocumentUploadScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class C extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d.a f199022l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f199023m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C(d.a aVar, Y41.l<? super DeepLink, G0> lVar) {
        super(1);
        this.f199022l = aVar;
        this.f199023m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        AttributedText attributedTextCopy$default = AttributedText.copy$default(this.f199022l.f395569g, null, null, 0, 7, null);
        attributedTextCopy$default.setOnDeepLinkClickListener(new B(0, this.f199023m));
        com.avito.android.util.text.j.a(aVar, attributedTextCopy$default, null);
        return G0.f406611a;
    }
}

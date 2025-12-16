package com.avito.android.success.konveyor.charity;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import eA0.InterfaceC39979a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SuccessCharityBlockPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/success/konveyor/charity/g;", "LTV0/d;", "Lcom/avito/android/success/konveyor/charity/i;", "Lcom/avito/android/success/konveyor/charity/c;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements TV0.d<i, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f291631b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<InterfaceC39979a, G0> f291632c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k com.avito.android.util.text.a aVar, @k l<? super InterfaceC39979a, G0> lVar) {
        this.f291631b = aVar;
        this.f291632c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        d dVar = new d(this);
        AttributedText attributedText = cVar.f291623b;
        attributedText.setOnDeepLinkClickListener(dVar);
        AttributedText attributedText2 = cVar.f291624c;
        if (attributedText2 != null) {
            attributedText2.setOnDeepLinkClickListener(new e(this));
        }
        iVar.a(new f(this, cVar));
        com.avito.android.util.text.a aVar2 = this.f291631b;
        iVar.Wc(attributedText2, aVar2);
        iVar.O1(attributedText, aVar2);
        UniversalImage universalImage = cVar.f291625d;
        if (universalImage != null) {
            iVar.i(universalImage);
        }
    }
}

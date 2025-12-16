package com.avito.android.user_advert.advert.items.verification;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.VerificationButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerificationBlockItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f310383l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f310384m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, a aVar) {
        super(0);
        this.f310383l = eVar;
        this.f310384m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink uri;
        e eVar = this.f310383l;
        VerificationButton verificationButton = this.f310384m.f310377f;
        if (verificationButton != null && (uri = verificationButton.getUri()) != null) {
            b.a.a(eVar.f310387b, uri, null, null, 6);
        }
        return G0.f406611a;
    }
}

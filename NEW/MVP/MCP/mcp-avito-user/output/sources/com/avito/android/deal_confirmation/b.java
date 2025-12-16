package com.avito.android.deal_confirmation;

import Hq0.C14021c;
import com.avito.android.advert.deeplinks.delivery.p;
import com.avito.android.remote.InterfaceC34398y;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DealConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deal_confirmation/b;", "Lcom/avito/android/deal_confirmation/a;", "_avito_deal-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34398y> f132736a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f132737b;

    @Inject
    public b(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar) {
        this.f132736a = eVar;
        this.f132737b = interfaceC35745a5;
    }

    @Override // com.avito.android.deal_confirmation.a
    @Y61.k
    public final W a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return new C42007e(new C14021c(4, str, this, str2, str3)).z(this.f132737b.a());
    }

    @Override // com.avito.android.deal_confirmation.a
    @Y61.k
    public final W b(@Y61.k String str, @Y61.k String str2) {
        return new C42007e(new p(this, str, str2, 7)).z(this.f132737b.a());
    }
}

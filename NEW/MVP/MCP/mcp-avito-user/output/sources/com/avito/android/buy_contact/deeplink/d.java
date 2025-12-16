package com.avito.android.buy_contact.deeplink;

import com.avito.android.buy_contact_link.link.JobBuyContactLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: BuyContactDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f108778l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ JobBuyContactLink f108779m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, JobBuyContactLink jobBuyContactLink) {
        super(0);
        this.f108778l = eVar;
        this.f108779m = jobBuyContactLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f108778l;
        C43259k.d(eVar.f108783i, null, null, new c(eVar, this.f108779m, null), 3);
        return G0.f406611a;
    }
}

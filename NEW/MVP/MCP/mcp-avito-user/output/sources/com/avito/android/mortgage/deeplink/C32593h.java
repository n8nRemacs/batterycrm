package com.avito.android.mortgage.deeplink;

import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: MortgageApplicationProxyDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage.deeplink.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32593h extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32591f f198855l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MortgageApplicationProxyLink f198856m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32593h(C32591f c32591f, MortgageApplicationProxyLink mortgageApplicationProxyLink) {
        super(0);
        this.f198855l = c32591f;
        this.f198856m = mortgageApplicationProxyLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C32591f c32591f = this.f198855l;
        C43259k.d(c32591f.f198847k, null, null, new C32592g(c32591f, this.f198856m, null), 3);
        return G0.f406611a;
    }
}

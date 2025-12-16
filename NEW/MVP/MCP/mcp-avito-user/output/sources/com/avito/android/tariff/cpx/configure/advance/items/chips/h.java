package com.avito.android.tariff.cpx.configure.advance.items.chips;

import Y41.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpx.configure.advance.di.o;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CpxConfigureAdvanceChipsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/chips/h;", "Lcom/avito/android/tariff/cpx/configure/advance/items/chips/e;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<String, G0> f295710b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l<DeepLink, G0> f295711c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l<DeepLink, G0> f295712d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k l<? super String, G0> lVar, @o @Y61.k l<? super DeepLink, G0> lVar2, @Y61.k @YA0.b l<? super DeepLink, G0> lVar3) {
        this.f295710b = lVar;
        this.f295711c = lVar2;
        this.f295712d = lVar3;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        jVar.wa(new g(this, jVar), ((b) aVar).f295702c);
    }
}

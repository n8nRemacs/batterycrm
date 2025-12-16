package com.avito.android.publish.slots.fashion_authentication_check_banner.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import lf0.C43764a;

/* compiled from: FashionAuthenticationCheckBannerItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/fashion_authentication_check_banner/item/f;", "Lcom/avito/android/publish/slots/fashion_authentication_check_banner/item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.fashion_authentication_check_banner.interactor.a f243878b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f243879c;

    @Inject
    public f(@Y61.k com.avito.android.publish.slots.fashion_authentication_check_banner.interactor.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f243878b = aVar;
        this.f243879c = interfaceC35745a5;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, io.reactivex.rxjava3.disposables.d] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        jVar.hide();
        String str = ((i) aVar).f243886c;
        if (str == null) {
            return;
        }
        l0.h hVar = new l0.h();
        I<C43764a> iA2 = this.f243878b.a(str);
        InterfaceC35745a5 interfaceC35745a5 = this.f243879c;
        hVar.f406842b = new C42017o(iA2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).j(new c(jVar, hVar)), new C31684n(jVar, 12)).x(new d(jVar), new e(jVar));
    }
}

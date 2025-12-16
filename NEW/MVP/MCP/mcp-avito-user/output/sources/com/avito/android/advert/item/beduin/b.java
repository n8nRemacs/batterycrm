package com.avito.android.advert.item.beduin;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import fa.InterfaceC40383a;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsBeduinInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/b;", "Lcom/avito/android/advert/item/beduin/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40383a f73221a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f73222b;

    @Inject
    public b(@Y61.k InterfaceC40383a interfaceC40383a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f73221a = interfaceC40383a;
        this.f73222b = interfaceC35745a5;
    }

    @Override // com.avito.android.advert.item.beduin.a
    @Y61.k
    public final W B(@Y61.k String str) {
        return this.f73221a.i(str).z(this.f73222b.a());
    }
}

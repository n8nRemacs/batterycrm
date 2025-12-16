package com.avito.android.serp.adapter.suggest_address;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AddAddressSuggestItemInteractorImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/suggest_address/e;", "Lcom/avito/android/serp/adapter/suggest_address/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.g f272392a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f272393b;

    @Inject
    public e(@Y61.k com.avito.android.geo_common.interactor.g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f272392a = gVar;
        this.f272393b = interfaceC35745a5;
    }

    @Override // com.avito.android.serp.adapter.suggest_address.d
    @Y61.k
    public final I0 a(@Y61.k String str) {
        C cS2 = this.f272392a.s(str);
        InterfaceC35745a5 interfaceC35745a5 = this.f272393b;
        return cS2.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
    }
}

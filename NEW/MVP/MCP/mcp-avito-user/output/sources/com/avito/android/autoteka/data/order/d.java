package com.avito.android.autoteka.data.order;

import com.avito.android.account.G;
import com.avito.android.remote.InterfaceC34401z0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: AutotekaChangeEmailInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/data/order/d;", "Lcom/avito/android/autoteka/data/order/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f96154a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f96155b;

    @Inject
    public d(@Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k G g12) {
        this.f96154a = interfaceC34401z0;
        this.f96155b = g12;
    }

    @Override // com.avito.android.autoteka.data.order.a
    @Y61.l
    public final C43152f0 a(@Y61.k String str) {
        return new C43152f0(C43175k.G(new b(this, str, null)), new c(3, null));
    }
}

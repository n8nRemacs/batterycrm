package com.avito.android.installmentsblock.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import dO.InterfaceC39606b;
import dO.InterfaceC39607c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InstallmentsBlockOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installmentsblock/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "LdO/b;", "LdO/c;", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements t<InterfaceC39606b, InterfaceC39607c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.deeplink_handler.handler.composite.a> f173005b;

    @Inject
    public k(@Y61.k h31.e<com.avito.android.deeplink_handler.handler.composite.a> eVar) {
        this.f173005b = eVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC39607c b(InterfaceC39606b interfaceC39606b) {
        InterfaceC39606b interfaceC39606b2 = interfaceC39606b;
        if (interfaceC39606b2 instanceof InterfaceC39606b.a) {
            b.a.a(this.f173005b.get(), ((InterfaceC39606b.a) interfaceC39606b2).f393840a, null, null, 6);
        }
        return null;
    }
}

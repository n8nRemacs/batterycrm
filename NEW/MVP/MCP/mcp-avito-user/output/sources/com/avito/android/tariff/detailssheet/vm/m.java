package com.avito.android.tariff.detailssheet.vm;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffDetailsSheetViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/detailssheet/vm/m;", "Landroidx/lifecycle/P0$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeepLink f297455a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f297456b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f297457c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f297458d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f297459e;

    @Inject
    public m(@Y61.k DeepLink deepLink, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k e eVar, @Y61.k a aVar) {
        this.f297455a = deepLink;
        this.f297456b = interfaceC35745a5;
        this.f297457c = fVar;
        this.f297458d = eVar;
        this.f297459e = aVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(l.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new l(this.f297455a, this.f297456b, this.f297457c, this.f297458d, this.f297459e);
    }
}

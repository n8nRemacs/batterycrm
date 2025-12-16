package com.avito.android.advert.item.compatibility.v3;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.A;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CompatibilityClicksRelay.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/c;", "Lcom/avito/android/advert/item/compatibility/v3/b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43108m f74405a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<a> f74406b;

    @Inject
    public c() {
        C43108m c43108mA = A.a(1, BufferOverflow.f410778c, null, 4);
        this.f74405a = c43108mA;
        this.f74406b = C43175k.Q(c43108mA);
    }

    @Override // com.avito.android.advert.item.compatibility.v3.b
    @Y61.k
    public final InterfaceC43160i<a> g() {
        return this.f74406b;
    }

    @Override // com.avito.android.advert.item.compatibility.v3.b
    public final void h(@Y61.k a aVar) {
        this.f74405a.w(aVar);
    }
}

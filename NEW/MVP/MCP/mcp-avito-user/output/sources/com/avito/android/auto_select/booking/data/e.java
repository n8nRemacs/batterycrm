package com.avito.android.auto_select.booking.data;

import Y61.k;
import Ye.InterfaceC18256a;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: AutoSelectRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/booking/data/e;", "Lcom/avito/android/auto_select/booking/data/a;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC18256a> f95821a;

    @Inject
    public e(@k h31.e<InterfaceC18256a> eVar) {
        this.f95821a = eVar;
    }

    @Override // com.avito.android.auto_select.booking.data.a
    @k
    public final C43152f0 a(@k String str) {
        return new C43152f0(new C43137a0(new c(2, null), C43175k.G(new b(this, str, null))), new d(3, null));
    }
}

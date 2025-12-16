package com.avito.android.short_term_rent.toggle_booking;

import Y61.k;
import com.avito.android.remote.d1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrToggleBookingInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/toggle_booking/d;", "Lcom/avito/android/short_term_rent/toggle_booking/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d1 f283003a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f283004b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f283005c;

    @Inject
    public d(@k d1 d1Var, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.remote.error.f fVar) {
        this.f283003a = d1Var;
        this.f283004b = interfaceC35745a5;
        this.f283005c = fVar;
    }

    @Override // com.avito.android.short_term_rent.toggle_booking.a
    @k
    public final L0 a(@k String str, boolean z12) {
        return this.f283003a.a(str, z12).x0(this.f283004b.a()).d0(b.f283001b).r0(P2.c.f318721a).m0(new c(this));
    }
}

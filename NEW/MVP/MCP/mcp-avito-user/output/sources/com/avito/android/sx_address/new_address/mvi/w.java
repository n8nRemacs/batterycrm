package com.avito.android.sx_address.new_address.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.sx_address.SxAddressControl;
import com.avito.android.sx_address.new_address.mvi.InterfaceC35192g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SxNewAddressMviActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/w;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class w implements com.avito.android.arch.mvi.a<InterfaceC35192g, B, SxNewAddressMviState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SxAddressControl f293841a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.new_address.domain.a f293842b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.new_address.analytics.c f293843c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.new_address.analytics.e f293844d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.features.a f293845e;

    @Inject
    public w(@Y61.k SxAddressControl sxAddressControl, @Y61.k com.avito.android.sx_address.new_address.domain.a aVar, @Y61.k com.avito.android.sx_address.new_address.analytics.c cVar, @Y61.k com.avito.android.sx_address.new_address.analytics.e eVar, @Y61.k com.avito.android.sx_address.features.a aVar2) {
        this.f293841a = sxAddressControl;
        this.f293842b = aVar;
        this.f293843c = cVar;
        this.f293844d = eVar;
        this.f293845e = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<B> b(InterfaceC35192g interfaceC35192g, SxNewAddressMviState sxNewAddressMviState) {
        C43152f0 c43152f0;
        InterfaceC35192g interfaceC35192g2 = interfaceC35192g;
        SxNewAddressMviState sxNewAddressMviState2 = sxNewAddressMviState;
        if (interfaceC35192g2 instanceof InterfaceC35192g.i) {
            return C43175k.G(new o((InterfaceC35192g.i) interfaceC35192g2, null));
        }
        if (interfaceC35192g2 instanceof InterfaceC35192g.a) {
            return C43175k.G(new p((InterfaceC35192g.a) interfaceC35192g2, null));
        }
        if (interfaceC35192g2 instanceof InterfaceC35192g.m) {
            return C43175k.G(new q((InterfaceC35192g.m) interfaceC35192g2, null));
        }
        if (interfaceC35192g2 instanceof InterfaceC35192g.f) {
            return C43175k.G(new r(sxNewAddressMviState2.f293719g, (InterfaceC35192g.f) interfaceC35192g2, null));
        }
        if (interfaceC35192g2 instanceof InterfaceC35192g.j) {
            return C43175k.G(new s((InterfaceC35192g.j) interfaceC35192g2, null));
        }
        if (interfaceC35192g2 instanceof InterfaceC35192g.e) {
            return C43175k.G(new t((InterfaceC35192g.e) interfaceC35192g2, null));
        }
        if (interfaceC35192g2 instanceof InterfaceC35192g.l) {
            return C43175k.G(new u((InterfaceC35192g.l) interfaceC35192g2, null));
        }
        if (interfaceC35192g2 instanceof InterfaceC35192g.k) {
            return C43175k.G(new C35193h((InterfaceC35192g.k) interfaceC35192g2, null));
        }
        if (interfaceC35192g2 instanceof InterfaceC35192g.d) {
            c43152f0 = new C43152f0(C43175k.G(new i(sxNewAddressMviState2, this, null)), new j(3, null));
        } else {
            if (interfaceC35192g2 instanceof InterfaceC35192g.c) {
                return C43175k.G(new k(2, null));
            }
            if (interfaceC35192g2 instanceof InterfaceC35192g.b) {
                return C43175k.G(new l(2, null));
            }
            if (!(interfaceC35192g2 instanceof InterfaceC35192g.C8926g)) {
                if (interfaceC35192g2 instanceof InterfaceC35192g.h) {
                    return C43175k.G(new v((InterfaceC35192g.h) interfaceC35192g2, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43152f0 = new C43152f0(C43175k.G(new m(this, null)), new n(3, null));
        }
        return c43152f0;
    }
}

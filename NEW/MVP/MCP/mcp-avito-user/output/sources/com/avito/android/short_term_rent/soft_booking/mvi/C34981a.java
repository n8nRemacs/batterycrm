package com.avito.android.short_term_rent.soft_booking.mvi;

import Xv0.InterfaceC17053a;
import com.avito.android.arch.mvi.a;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ow0.InterfaceC44950a;

/* compiled from: StrSoftBookingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Low0/a;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/state/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.short_term_rent.soft_booking.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34981a implements com.avito.android.arch.mvi.a<InterfaceC44950a, StrSoftBookingInternalAction, com.avito.android.short_term_rent.soft_booking.mvi.state.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.soft_booking.domain.k f282670a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.soft_booking.domain.d f282671b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.soft_booking.domain.a f282672c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC17053a f282673d;

    /* compiled from: StrSoftBookingActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.short_term_rent.soft_booking.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C8446a {
        static {
            int[] iArr = new int[StrSoftBookingContactFieldType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StrSoftBookingContactFieldType strSoftBookingContactFieldType = StrSoftBookingContactFieldType.f282654b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StrSoftBookingContactFieldType strSoftBookingContactFieldType2 = StrSoftBookingContactFieldType.f282654b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public C34981a(@Y61.k com.avito.android.short_term_rent.soft_booking.domain.k kVar, @Y61.k com.avito.android.short_term_rent.soft_booking.domain.d dVar, @Y61.k com.avito.android.short_term_rent.soft_booking.domain.a aVar, @Y61.k InterfaceC17053a interfaceC17053a) {
        this.f282670a = kVar;
        this.f282671b = dVar;
        this.f282672c = aVar;
        this.f282673d = interfaceC17053a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrSoftBookingInternalAction> b(InterfaceC44950a interfaceC44950a, com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar) {
        C43210w c43210w;
        InterfaceC44950a interfaceC44950a2 = interfaceC44950a;
        com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar2 = aVar;
        if (interfaceC44950a2 instanceof InterfaceC44950a.z) {
            return C43175k.G(new o(this, null));
        }
        if ((interfaceC44950a2 instanceof InterfaceC44950a.c) || (interfaceC44950a2 instanceof InterfaceC44950a.j)) {
            c43210w = new C43210w(StrSoftBookingInternalAction.CloseScreen.f282720b);
        } else {
            if (interfaceC44950a2 instanceof InterfaceC44950a.e) {
                return C43175k.G(new d(this, aVar2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.f) {
                return C43175k.G(new e(this, aVar2, (InterfaceC44950a.f) interfaceC44950a2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.g) {
                return C43175k.G(new f(aVar2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.h) {
                return C43175k.G(new g(this, (InterfaceC44950a.h) interfaceC44950a2, aVar2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.i) {
                return C43175k.G(new h(this, aVar2, (InterfaceC44950a.i) interfaceC44950a2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.d) {
                return C43175k.G(new C34983c(this, aVar2, (InterfaceC44950a.d) interfaceC44950a2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.l) {
                return C43175k.G(new j(aVar2, (InterfaceC44950a.l) interfaceC44950a2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.C44951b) {
                return new C43210w(new StrSoftBookingInternalAction.OpenDeeplink(((InterfaceC44950a.C44951b) interfaceC44950a2).f422333a, null, 2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.y) {
                return new C43210w(new StrSoftBookingInternalAction.OpenDeeplink(((InterfaceC44950a.y) interfaceC44950a2).f422362a, null, 2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.C12248a) {
                return C43175k.G(new C34982b(this, aVar2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.t) {
                return C43175k.G(new l(this, aVar2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.r) {
                return C43175k.G(new i(aVar2, (InterfaceC44950a.r) interfaceC44950a2, this, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.u) {
                return C43175k.G(new m(aVar2, (InterfaceC44950a.u) interfaceC44950a2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.s) {
                return C43175k.G(new k(aVar2, (InterfaceC44950a.s) interfaceC44950a2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.x) {
                return this.f282670a.a(aVar2.f282795d, aVar2.f282796e, aVar2.f282797f, aVar2.f282798g, aVar2.f282799h, aVar2.f282804m, aVar2.f282802k);
            }
            boolean z12 = interfaceC44950a2 instanceof InterfaceC44950a.n;
            pw0.h hVar = aVar2.f282804m;
            if (z12) {
                InterfaceC44950a.n nVar = (InterfaceC44950a.n) interfaceC44950a2;
                if (L.f(hVar != null ? hVar.f428877a : null, nVar.f422348a)) {
                    return C43175k.w();
                }
                return this.f282670a.a(aVar2.f282795d, aVar2.f282796e, aVar2.f282797f, aVar2.f282798g, aVar2.f282799h, hVar != null ? pw0.h.a(hVar, nVar.f422348a, null, 6) : null, aVar2.f282802k);
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.q) {
                return new C43137a0(new p(this, interfaceC44950a2, null), this.f282670a.a(aVar2.f282795d, aVar2.f282796e, aVar2.f282797f, aVar2.f282798g, aVar2.f282799h, hVar != null ? pw0.h.a(hVar, null, ((InterfaceC44950a.q) interfaceC44950a2).f422352b, 5) : null, aVar2.f282802k));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.m) {
                return C43175k.G(new q(this, aVar2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.o) {
                return new C43210w(new StrSoftBookingInternalAction.OpenDeeplink(((InterfaceC44950a.o) interfaceC44950a2).f422349a, null, 2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.B) {
                return C43175k.G(new r(this, aVar2, null));
            }
            if (interfaceC44950a2 instanceof InterfaceC44950a.A) {
                pw0.m mVar = aVar2.f282806o;
                c43210w = new C43210w(new StrSoftBookingInternalAction.OpenDeeplink(mVar != null ? mVar.f428896b : null, null, 2, null));
            } else {
                if (interfaceC44950a2 instanceof InterfaceC44950a.v) {
                    return C43175k.G(new n((InterfaceC44950a.v) interfaceC44950a2, aVar2, this, null));
                }
                if (interfaceC44950a2 instanceof InterfaceC44950a.w) {
                    return new C43210w(new StrSoftBookingInternalAction.OpenDeeplink(((InterfaceC44950a.w) interfaceC44950a2).f422360a, null, 2, null));
                }
                if (interfaceC44950a2 instanceof InterfaceC44950a.p) {
                    return C43175k.G(new s(this, aVar2, null));
                }
                if (!(interfaceC44950a2 instanceof InterfaceC44950a.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(StrSoftBookingInternalAction.AnimationLoaderAvailable.f282707b);
            }
        }
        return c43210w;
    }
}

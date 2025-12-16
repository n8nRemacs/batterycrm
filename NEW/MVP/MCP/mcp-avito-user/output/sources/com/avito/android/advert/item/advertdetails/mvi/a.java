package com.avito.android.advert.item.advertdetails.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import k4.C42501e;
import k4.InterfaceC42497a;
import k4.InterfaceC42499c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AdvertDetailsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/advertdetails/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lk4/a;", "Lk4/c;", "Lk4/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC42497a, InterfaceC42499c, C42501e> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.realty_quiz_banner.k f72704a;

    @Inject
    public a(@k com.avito.android.advert.item.realty_quiz_banner.k kVar) {
        this.f72704a = kVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC42499c> b(InterfaceC42497a interfaceC42497a, C42501e c42501e) {
        C43210w c43210w;
        InterfaceC42497a interfaceC42497a2 = interfaceC42497a;
        if (interfaceC42497a2 instanceof InterfaceC42497a.b) {
            InterfaceC42497a.b bVar = (InterfaceC42497a.b) interfaceC42497a2;
            return new C43210w(new InterfaceC42499c.b(bVar.f406040a, bVar.f406041b));
        }
        if (interfaceC42497a2 instanceof InterfaceC42497a.l) {
            InterfaceC42497a.l lVar = (InterfaceC42497a.l) interfaceC42497a2;
            return new C43210w(new InterfaceC42499c.b(lVar.f406054a, lVar.f406055b));
        }
        if (interfaceC42497a2 instanceof InterfaceC42497a.f) {
            return new C43210w(new InterfaceC42499c.k(((InterfaceC42497a.f) interfaceC42497a2).f406046a));
        }
        if (interfaceC42497a2 instanceof InterfaceC42497a.g) {
            InterfaceC42497a.g gVar = (InterfaceC42497a.g) interfaceC42497a2;
            return new C43210w(new InterfaceC42499c.h(gVar.f406047a, gVar.f406048b));
        }
        if (interfaceC42497a2 instanceof InterfaceC42497a.d) {
            return new C43210w(new InterfaceC42499c.f(((InterfaceC42497a.d) interfaceC42497a2).f406043a));
        }
        if (interfaceC42497a2 instanceof InterfaceC42497a.j) {
            this.f72704a.b();
            return new C43210w(new InterfaceC42499c.j(((InterfaceC42497a.j) interfaceC42497a2).f406052a));
        }
        if (interfaceC42497a2 instanceof InterfaceC42497a.h) {
            return new C43210w(new InterfaceC42499c.e(((InterfaceC42497a.h) interfaceC42497a2).f406049a));
        }
        if (interfaceC42497a2 instanceof InterfaceC42497a.i) {
            InterfaceC42497a.i iVar = (InterfaceC42497a.i) interfaceC42497a2;
            return new C43210w(new InterfaceC42499c.i(iVar.f406050a, iVar.f406051b));
        }
        if (interfaceC42497a2 instanceof InterfaceC42497a.e) {
            InterfaceC42497a.e eVar = (InterfaceC42497a.e) interfaceC42497a2;
            return new C43210w(new InterfaceC42499c.g(eVar.f406044a, eVar.f406045b));
        }
        if (interfaceC42497a2 instanceof InterfaceC42497a.o) {
            return new C43210w(new InterfaceC42499c.n(((InterfaceC42497a.o) interfaceC42497a2).f406057a));
        }
        if (interfaceC42497a2 instanceof InterfaceC42497a.m) {
            c43210w = new C43210w(new InterfaceC42499c.l());
        } else {
            if (interfaceC42497a2 instanceof InterfaceC42497a.n) {
                return new C43210w(new InterfaceC42499c.m(((InterfaceC42497a.n) interfaceC42497a2).f406056a));
            }
            if (interfaceC42497a2 instanceof InterfaceC42497a.c) {
                return new C43210w(new InterfaceC42499c.C11603c(((InterfaceC42497a.c) interfaceC42497a2).f406042a));
            }
            if (!(interfaceC42497a2 instanceof InterfaceC42497a.k)) {
                if (!(interfaceC42497a2 instanceof InterfaceC42497a.C11602a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC42497a.C11602a c11602a = (InterfaceC42497a.C11602a) interfaceC42497a2;
                return new C43210w(new InterfaceC42499c.a(c11602a.f406038a, c11602a.f406039b));
            }
            c43210w = new C43210w(InterfaceC42499c.d.f406065a);
        }
        return c43210w;
    }
}

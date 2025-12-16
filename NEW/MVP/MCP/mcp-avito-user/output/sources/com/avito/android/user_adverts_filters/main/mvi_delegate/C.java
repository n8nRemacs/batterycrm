package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinNavBar;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import qJ0.InterfaceC47306b;
import qJ0.InterfaceC47308d;

/* compiled from: FiltersDelegateReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_delegate/C;", "Lcom/avito/android/arch/mvi/u;", "LqJ0/b;", "LqJ0/d;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class C implements com.avito.android.arch.mvi.u<InterfaceC47306b, InterfaceC47308d> {
    @Inject
    public C() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final InterfaceC47308d a(InterfaceC47306b interfaceC47306b, InterfaceC47308d interfaceC47308d) {
        InterfaceC47308d.a aVarA;
        InterfaceC47306b interfaceC47306b2 = interfaceC47306b;
        InterfaceC47308d interfaceC47308d2 = interfaceC47308d;
        if (!(interfaceC47308d2 instanceof InterfaceC47308d.a)) {
            return interfaceC47308d2;
        }
        if (interfaceC47306b2 instanceof InterfaceC47306b.InterfaceC12317b) {
            InterfaceC47306b.InterfaceC12317b interfaceC12317b = (InterfaceC47306b.InterfaceC12317b) interfaceC47306b2;
            InterfaceC47308d.a aVar = (InterfaceC47308d.a) interfaceC47308d2;
            if (interfaceC12317b instanceof InterfaceC47306b.InterfaceC12317b.a) {
                aVarA = InterfaceC47308d.a.a(aVar, null, null, null, InterfaceC47308d.a.b.a(aVar.f429179e, null, null, null, ((InterfaceC47306b.InterfaceC12317b.a) interfaceC12317b).f429167a, 7), 47);
            } else if (interfaceC12317b instanceof InterfaceC47306b.InterfaceC12317b.C12318b) {
                aVarA = InterfaceC47308d.a.a(aVar, null, null, null, InterfaceC47308d.a.b.a(aVar.f429179e, null, null, ((InterfaceC47306b.InterfaceC12317b.C12318b) interfaceC12317b).f429168a, null, 11), 47);
            } else {
                if (!(interfaceC12317b instanceof InterfaceC47306b.InterfaceC12317b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVarA = InterfaceC47308d.a.a(aVar, null, null, null, InterfaceC47308d.a.b.a(aVar.f429179e, null, ((InterfaceC47306b.InterfaceC12317b.c) interfaceC12317b).f429169a, null, null, 13), 47);
            }
        } else {
            if (!(interfaceC47306b2 instanceof InterfaceC47306b.c)) {
                if (interfaceC47306b2 instanceof InterfaceC47306b.d) {
                    InterfaceC47308d.a aVar2 = (InterfaceC47308d.a) interfaceC47308d2;
                    InterfaceC47308d.a.b bVar = aVar2.f429179e;
                    return InterfaceC47308d.a.a(aVar2, null, null, null, InterfaceC47308d.a.b.a(bVar, UserAdvertsFiltersBeduinNavBar.a(bVar.f429183a, ((InterfaceC47306b.d) interfaceC47306b2).f429172a), null, null, null, 14), 47);
                }
                if (interfaceC47306b2 instanceof InterfaceC47306b.f) {
                    return InterfaceC47308d.a.a((InterfaceC47308d.a) interfaceC47308d2, null, null, ((InterfaceC47306b.f) interfaceC47306b2).f429174a, null, 55);
                }
                if (interfaceC47306b2 instanceof InterfaceC47306b.a) {
                    return InterfaceC47308d.a.a((InterfaceC47308d.a) interfaceC47308d2, null, null, C42784z0.f406748b, null, 55);
                }
                if (interfaceC47306b2 instanceof InterfaceC47306b.e) {
                    return interfaceC47308d2;
                }
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC47306b.c cVar = (InterfaceC47306b.c) interfaceC47306b2;
            InterfaceC47308d.a aVar3 = (InterfaceC47308d.a) interfaceC47308d2;
            if (cVar instanceof InterfaceC47306b.c.a) {
                aVarA = InterfaceC47308d.a.a(aVar3, null, ((InterfaceC47306b.c.a) cVar).f429170a, null, null, 59);
            } else {
                if (!(cVar instanceof InterfaceC47306b.c.C12319b)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVarA = InterfaceC47308d.a.a(aVar3, ((InterfaceC47306b.c.C12319b) cVar).f429171a, null, null, null, 61);
            }
        }
        return aVarA;
    }
}

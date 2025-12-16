package com.avito.android.seller_coach.adverts_hint.mvi;

import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import yq0.InterfaceC50282b;
import yq0.InterfaceC50283c;

/* compiled from: ShortAdvicesEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lyq0/c;", "Lyq0/b;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements t<InterfaceC50283c, InterfaceC50282b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC50282b b(InterfaceC50283c interfaceC50283c) {
        InterfaceC50283c interfaceC50283c2 = interfaceC50283c;
        if (interfaceC50283c2 instanceof InterfaceC50283c.f) {
            return new InterfaceC50282b.a(((InterfaceC50283c.f) interfaceC50283c2).f443518a);
        }
        if (interfaceC50283c2 instanceof InterfaceC50283c.g) {
            return new InterfaceC50282b.C12920b(((InterfaceC50283c.g) interfaceC50283c2).f443519a);
        }
        if (interfaceC50283c2 instanceof InterfaceC50283c.a ? true : interfaceC50283c2 instanceof InterfaceC50283c.b ? true : interfaceC50283c2 instanceof InterfaceC50283c.C12921c ? true : interfaceC50283c2 instanceof InterfaceC50283c.d ? true : interfaceC50283c2 instanceof InterfaceC50283c.e ? true : interfaceC50283c2 instanceof InterfaceC50283c.h) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}

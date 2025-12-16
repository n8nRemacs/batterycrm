package com.avito.android.social.esia.mvi;

import Yw0.InterfaceC18342b;
import Yw0.InterfaceC18344d;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EsiaReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/social/esia/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "LYw0/b;", "LYw0/d;", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements u<InterfaceC18342b, InterfaceC18344d> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final InterfaceC18344d a(InterfaceC18342b interfaceC18342b, InterfaceC18344d interfaceC18344d) {
        InterfaceC18342b interfaceC18342b2 = interfaceC18342b;
        InterfaceC18344d interfaceC18344d2 = interfaceC18344d;
        if (interfaceC18342b2.equals(InterfaceC18342b.c.f19745a)) {
            return InterfaceC18344d.c.f19752a;
        }
        if (interfaceC18342b2 instanceof InterfaceC18342b.C1408b) {
            return new InterfaceC18344d.b(((InterfaceC18342b.C1408b) interfaceC18342b2).f19744a);
        }
        if (interfaceC18342b2 instanceof InterfaceC18342b.a) {
            return interfaceC18344d2;
        }
        throw new NoWhenBranchMatchedException();
    }
}

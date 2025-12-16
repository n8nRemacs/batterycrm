package com.avito.android.profile_settings_basic.mvi;

import Qb0.InterfaceC14878a;
import Qb0.InterfaceC14879b;
import Qb0.InterfaceC14880c;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_basic.mvi.entity.BasicInfoAvatarAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BasicProfileSettingsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_settings_basic/mvi/r;", "Lcom/avito/android/arch/mvi/t;", "LQb0/b;", "LQb0/c;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class r implements com.avito.android.arch.mvi.t<InterfaceC14879b, InterfaceC14880c> {
    @Inject
    public r() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14880c b(InterfaceC14879b interfaceC14879b) {
        InterfaceC14879b interfaceC14879b2 = interfaceC14879b;
        if (interfaceC14879b2 instanceof InterfaceC14879b.n) {
            InterfaceC14879b.n nVar = (InterfaceC14879b.n) interfaceC14879b2;
            return new InterfaceC14880c.C0915c(nVar.f13885a, nVar.f13886b, nVar.f13887c, nVar.f13888d);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.l) {
            return new InterfaceC14880c.a(((InterfaceC14879b.l) interfaceC14879b2).f13883a);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.f) {
            InterfaceC14879b.f fVar = (InterfaceC14879b.f) interfaceC14879b2;
            return new InterfaceC14880c.d(fVar.f13874a, new InterfaceC14878a.b(fVar.f13875b));
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.m) {
            return InterfaceC14880c.b.f13897a;
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.C0914b) {
            InterfaceC14879b.C0914b c0914b = (InterfaceC14879b.C0914b) interfaceC14879b2;
            return new InterfaceC14880c.d(c0914b.f13869a, new BasicInfoAvatarAction.DeleteAvatarImage(c0914b.f13870b));
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.q) {
            return new InterfaceC14880c.e(((InterfaceC14879b.q) interfaceC14879b2).f13892a);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.p) {
            InterfaceC14879b.p pVar = (InterfaceC14879b.p) interfaceC14879b2;
            return new InterfaceC14880c.d(pVar.f13890a, pVar.f13891b);
        }
        if (interfaceC14879b2 instanceof InterfaceC14879b.c ? true : interfaceC14879b2 instanceof InterfaceC14879b.d ? true : interfaceC14879b2 instanceof InterfaceC14879b.g ? true : interfaceC14879b2 instanceof InterfaceC14879b.h ? true : interfaceC14879b2 instanceof InterfaceC14879b.e ? true : interfaceC14879b2 instanceof InterfaceC14879b.i ? true : interfaceC14879b2 instanceof InterfaceC14879b.j ? true : interfaceC14879b2 instanceof InterfaceC14879b.k ? true : interfaceC14879b2 instanceof InterfaceC14879b.a ? true : interfaceC14879b2 instanceof InterfaceC14879b.o ? true : interfaceC14879b2 instanceof InterfaceC14879b.r ? true : interfaceC14879b2 instanceof InterfaceC14879b.s ? true : interfaceC14879b2 instanceof InterfaceC14879b.t) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}

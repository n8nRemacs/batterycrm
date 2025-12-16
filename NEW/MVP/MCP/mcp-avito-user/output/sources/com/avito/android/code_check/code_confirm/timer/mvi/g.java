package com.avito.android.code_check.code_confirm.timer.mvi;

import Ko.InterfaceC14335a;
import Ko.InterfaceC14336b;
import Y61.k;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TimerReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check/code_confirm/timer/mvi/g;", "Lcom/avito/android/arch/mvi/u;", "LKo/a;", "LKo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements u<InterfaceC14335a, InterfaceC14336b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.ticking_button.d f118795b;

    @Inject
    public g(@k com.avito.android.lib.design.ticking_button.d dVar) {
        this.f118795b = dVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final InterfaceC14336b a(InterfaceC14335a interfaceC14335a, InterfaceC14336b interfaceC14336b) {
        InterfaceC14335a interfaceC14335a2 = interfaceC14335a;
        if (interfaceC14335a2 instanceof InterfaceC14335a.b) {
            return new InterfaceC14336b.C0597b(this.f118795b.a(((InterfaceC14335a.b) interfaceC14335a2).f9654a));
        }
        if (interfaceC14335a2.equals(InterfaceC14335a.C0596a.f9653a)) {
            return InterfaceC14336b.a.f9655a;
        }
        throw new NoWhenBranchMatchedException();
    }
}

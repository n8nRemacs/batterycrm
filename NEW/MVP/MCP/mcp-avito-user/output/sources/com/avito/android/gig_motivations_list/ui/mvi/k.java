package com.avito.android.gig_motivations_list.ui.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import zH.C50465d;
import zH.InterfaceC50463b;

/* compiled from: MotivationsListReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gig_motivations_list/ui/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "LzH/b;", "LzH/d;", "<init>", "()V", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements u<InterfaceC50463b, C50465d> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C50465d a(InterfaceC50463b interfaceC50463b, C50465d c50465d) {
        InterfaceC50463b interfaceC50463b2 = interfaceC50463b;
        C50465d c50465d2 = c50465d;
        return interfaceC50463b2 instanceof InterfaceC50463b.c ? C50465d.a(c50465d2, true, false) : interfaceC50463b2 instanceof InterfaceC50463b.a ? new C50465d(false, false, ((InterfaceC50463b.a) interfaceC50463b2).f443994a) : interfaceC50463b2 instanceof InterfaceC50463b.C12950b ? C50465d.a(c50465d2, false, true) : c50465d2;
    }
}

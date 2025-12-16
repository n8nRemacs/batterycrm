package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.mvi;

import Ke0.InterfaceC14308b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MergedPretendPremoderationReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "LKe0/b;", "LKe0/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements u<InterfaceC14308b, Ke0.d> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ke0.d a(InterfaceC14308b interfaceC14308b, Ke0.d dVar) {
        InterfaceC14308b interfaceC14308b2 = interfaceC14308b;
        Ke0.d dVar2 = dVar;
        if (interfaceC14308b2.equals(InterfaceC14308b.d.f9582a)) {
            return new Ke0.d(true, dVar2.f9591c);
        }
        if (interfaceC14308b2 instanceof InterfaceC14308b.e ? true : interfaceC14308b2 instanceof InterfaceC14308b.C0587b) {
            return new Ke0.d(false, null);
        }
        if (interfaceC14308b2 instanceof InterfaceC14308b.c) {
            return new Ke0.d(false, ((InterfaceC14308b.c) interfaceC14308b2).f9581a);
        }
        if (interfaceC14308b2 instanceof InterfaceC14308b.a) {
            return dVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}

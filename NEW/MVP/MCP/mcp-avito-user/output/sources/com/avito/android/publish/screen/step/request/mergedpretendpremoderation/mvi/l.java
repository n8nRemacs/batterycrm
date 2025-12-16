package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.mvi;

import Ke0.InterfaceC14308b;
import Ke0.InterfaceC14309c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MergedPretendPremoderationOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "LKe0/b;", "LKe0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements t<InterfaceC14308b, InterfaceC14309c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14309c b(InterfaceC14308b interfaceC14308b) {
        InterfaceC14308b interfaceC14308b2 = interfaceC14308b;
        if (interfaceC14308b2 instanceof InterfaceC14308b.a) {
            InterfaceC14308b.a aVar = (InterfaceC14308b.a) interfaceC14308b2;
            return new InterfaceC14309c.a(aVar.f9578a, aVar.f9579b);
        }
        if (interfaceC14308b2 instanceof InterfaceC14308b.C0587b) {
            return new InterfaceC14309c.b(((InterfaceC14308b.C0587b) interfaceC14308b2).f9580a);
        }
        if (interfaceC14308b2 instanceof InterfaceC14308b.e) {
            return new InterfaceC14309c.C0588c(((InterfaceC14308b.e) interfaceC14308b2).f9583a);
        }
        if (interfaceC14308b2 instanceof InterfaceC14308b.c ? true : interfaceC14308b2.equals(InterfaceC14308b.d.f9582a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}

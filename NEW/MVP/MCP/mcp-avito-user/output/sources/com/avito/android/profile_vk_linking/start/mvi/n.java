package com.avito.android.profile_vk_linking.start.mvi;

import ad0.InterfaceC19870a;
import ad0.InterfaceC19871b;
import ad0.InterfaceC19872c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkLinkingStartOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_vk_linking/start/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lad0/b;", "Lad0/c;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements t<InterfaceC19871b, InterfaceC19872c> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC19872c b(InterfaceC19871b interfaceC19871b) {
        InterfaceC19871b interfaceC19871b2 = interfaceC19871b;
        if (interfaceC19871b2 instanceof InterfaceC19871b.e) {
            return new InterfaceC19872c.b(((InterfaceC19871b.e) interfaceC19871b2).f21092a);
        }
        if (interfaceC19871b2 instanceof InterfaceC19871b.f) {
            InterfaceC19871b.f fVar = (InterfaceC19871b.f) interfaceC19871b2;
            return new InterfaceC19872c.C1502c(fVar.f21093a, fVar.f21094b, new InterfaceC19870a.d(fVar.f21095c, fVar.f21096d));
        }
        if (interfaceC19871b2 instanceof InterfaceC19871b.a) {
            return InterfaceC19872c.a.f21099a;
        }
        if (interfaceC19871b2 instanceof InterfaceC19871b.d ? true : interfaceC19871b2 instanceof InterfaceC19871b.C1501b ? true : interfaceC19871b2 instanceof InterfaceC19871b.c ? true : interfaceC19871b2 instanceof InterfaceC19871b.h ? true : interfaceC19871b2 instanceof InterfaceC19871b.g) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}

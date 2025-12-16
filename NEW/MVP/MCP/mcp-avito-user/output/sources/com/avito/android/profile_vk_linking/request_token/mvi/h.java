package com.avito.android.profile_vk_linking.request_token.mvi;

import Zc0.InterfaceC19539b;
import Zc0.InterfaceC19540c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkRequestTokenOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_vk_linking/request_token/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "LZc0/b;", "LZc0/c;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements t<InterfaceC19539b, InterfaceC19540c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC19540c b(InterfaceC19539b interfaceC19539b) {
        InterfaceC19539b interfaceC19539b2 = interfaceC19539b;
        if (interfaceC19539b2 instanceof InterfaceC19539b.c) {
            return new InterfaceC19540c.C1443c(((InterfaceC19539b.c) interfaceC19539b2).f20299a);
        }
        if (interfaceC19539b2 instanceof InterfaceC19539b.C1442b) {
            InterfaceC19539b.C1442b c1442b = (InterfaceC19539b.C1442b) interfaceC19539b2;
            return new InterfaceC19540c.b(c1442b.f20297a, c1442b.f20298b);
        }
        if (interfaceC19539b2 instanceof InterfaceC19539b.a) {
            return InterfaceC19540c.a.f20302a;
        }
        if (interfaceC19539b2 instanceof InterfaceC19539b.e ? true : interfaceC19539b2 instanceof InterfaceC19539b.d) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}

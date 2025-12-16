package com.avito.android.profile_vk_linking.start.mvi;

import Ic0.C14059a;
import ad0.InterfaceC19871b;
import bd0.C25633b;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkLinkingStartReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_vk_linking/start/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lad0/b;", "Lbd0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements u<InterfaceC19871b, C25633b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f231481b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f231482c;

    @Inject
    public p(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f231481b = interfaceC28373a;
        this.f231482c = e12;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C25633b a(InterfaceC19871b interfaceC19871b, C25633b c25633b) {
        InterfaceC19871b interfaceC19871b2 = interfaceC19871b;
        C25633b c25633b2 = c25633b;
        if (interfaceC19871b2 instanceof InterfaceC19871b.d) {
            return C25633b.a(c25633b2, true, null, null, false, 8);
        }
        if (interfaceC19871b2 instanceof InterfaceC19871b.C1501b) {
            return C25633b.a(c25633b2, false, ((InterfaceC19871b.C1501b) interfaceC19871b2).f21089a, null, false, 8);
        }
        if (interfaceC19871b2 instanceof InterfaceC19871b.c) {
            InterfaceC19871b.c cVar = (InterfaceC19871b.c) interfaceC19871b2;
            b(cVar.f21090a);
            return C25633b.a(c25633b2, false, null, cVar.f21090a, false, 8);
        }
        if (interfaceC19871b2 instanceof InterfaceC19871b.e) {
            b(((InterfaceC19871b.e) interfaceC19871b2).f21092a);
            return C25633b.a(c25633b2, false, null, null, false, 7);
        }
        if (interfaceC19871b2 instanceof InterfaceC19871b.f) {
            b(((InterfaceC19871b.f) interfaceC19871b2).f21093a);
            return C25633b.a(c25633b2, false, null, null, false, 7);
        }
        if (interfaceC19871b2 instanceof InterfaceC19871b.g) {
            return C25633b.a(c25633b2, false, null, null, true, 7);
        }
        if (interfaceC19871b2 instanceof InterfaceC19871b.h) {
            return C25633b.a(c25633b2, false, null, null, false, 7);
        }
        if (interfaceC19871b2 instanceof InterfaceC19871b.a) {
            return c25633b2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(String str) {
        String strA = this.f231482c.a();
        if (strA == null) {
            strA = "";
        }
        this.f231481b.c(new C14059a(strA, str));
    }
}

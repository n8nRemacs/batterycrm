package com.avito.android.profile_vk_linking.request_token.mvi;

import Ic0.C14059a;
import Zc0.C19541d;
import Zc0.InterfaceC19539b;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkRequestTokenReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_vk_linking/request_token/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "LZc0/b;", "LZc0/d;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements u<InterfaceC19539b, C19541d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f231388b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f231389c;

    @Inject
    public j(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f231388b = interfaceC28373a;
        this.f231389c = e12;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C19541d a(InterfaceC19539b interfaceC19539b, C19541d c19541d) {
        InterfaceC19539b interfaceC19539b2 = interfaceC19539b;
        C19541d c19541d2 = c19541d;
        if (interfaceC19539b2 instanceof InterfaceC19539b.c) {
            return new C19541d(true, false);
        }
        if (interfaceC19539b2 instanceof InterfaceC19539b.e) {
            return new C19541d(false, c19541d2.f20309b);
        }
        if (!(interfaceC19539b2 instanceof InterfaceC19539b.d)) {
            if (interfaceC19539b2 instanceof InterfaceC19539b.C1442b ? true : interfaceC19539b2.equals(InterfaceC19539b.a.f20296a)) {
                return c19541d2;
            }
            throw new NoWhenBranchMatchedException();
        }
        String strA = this.f231389c.a();
        if (strA == null) {
            strA = "";
        }
        String message = ((InterfaceC19539b.d) interfaceC19539b2).f20300a.getMessage();
        this.f231388b.c(new C14059a(strA, message != null ? message : ""));
        return new C19541d(false, true);
    }
}

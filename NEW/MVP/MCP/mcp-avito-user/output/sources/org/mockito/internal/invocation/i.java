package org.mockito.internal.invocation;

import e81.InterfaceC39967a;
import e81.InterfaceC39968b;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* compiled from: InvocationMatcher.java */
/* loaded from: classes7.dex */
public class i implements e81.g, InterfaceC39967a, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC39968b f421660b;

    /* renamed from: c, reason: collision with root package name */
    public final List<org.mockito.d<?>> f421661c;

    public i(InterfaceC39968b interfaceC39968b, List<org.mockito.d> list) {
        this.f421660b = interfaceC39968b;
        if (list.isEmpty()) {
            this.f421661c = interfaceC39968b.r6();
        } else {
            this.f421661c = list;
        }
    }

    public final InterfaceC39968b a() {
        return this.f421660b;
    }

    @Override // e81.g
    public final boolean c(InterfaceC39968b interfaceC39968b) {
        if (this.f421660b.v3() == interfaceC39968b.v3()) {
            Method method = this.f421660b.getMethod();
            Method method2 = interfaceC39968b.getMethod();
            if (((method.getName() == null || !method.getName().equals(method2.getName())) ? false : Arrays.equals(method.getParameterTypes(), method2.getParameterTypes())) && k.b(interfaceC39968b, this.f421661c).a(q.f421676a)) {
                return true;
            }
        }
        return false;
    }

    @Override // e81.g
    public final void e(InterfaceC39968b interfaceC39968b) {
        k.b(interfaceC39968b, this.f421661c).a(new h());
    }

    @Override // e81.InterfaceC39967a
    public final e81.f j() {
        return this.f421660b.j();
    }

    @Override // e81.InterfaceC39967a
    public String toString() {
        return new W71.c().a(this.f421660b, this.f421661c);
    }
}

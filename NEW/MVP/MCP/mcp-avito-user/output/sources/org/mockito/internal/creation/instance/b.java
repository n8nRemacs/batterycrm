package org.mockito.internal.creation.instance;

import i81.InterfaceC41244d;

/* compiled from: DefaultInstantiatorProvider.java */
/* loaded from: classes7.dex */
public class b implements InterfaceC41244d {

    /* renamed from: a, reason: collision with root package name */
    public static final D71.a f421616a = new c();

    @Override // i81.InterfaceC41244d
    public final D71.a a(N71.a aVar) {
        Object[] objArr;
        if (aVar == null || (objArr = aVar.f11221l) == null) {
            return f421616a;
        }
        return new a(aVar.f11220k != null, objArr);
    }
}

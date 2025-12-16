package org.mockito.internal.stubbing;

import e81.InterfaceC39968b;
import java.util.Comparator;
import l81.l;

/* compiled from: StubbingComparator.java */
/* loaded from: classes7.dex */
public class j implements Comparator<l> {

    /* renamed from: b, reason: collision with root package name */
    public final org.mockito.internal.invocation.f f421732b = new org.mockito.internal.invocation.f();

    @Override // java.util.Comparator
    public final int compare(l lVar, l lVar2) {
        InterfaceC39968b interfaceC39968bA = lVar.a();
        InterfaceC39968b interfaceC39968bA2 = lVar2.a();
        this.f421732b.getClass();
        return Integer.compare(interfaceC39968bA.a4(), interfaceC39968bA2.a4());
    }
}

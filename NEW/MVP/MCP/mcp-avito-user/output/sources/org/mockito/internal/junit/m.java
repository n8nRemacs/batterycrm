package org.mockito.internal.junit;

import org.mockito.quality.Strictness;

/* compiled from: StrictStubsRunnerTestListener.java */
/* loaded from: classes7.dex */
public class m implements k {

    /* renamed from: a, reason: collision with root package name */
    public final b f421679a;

    public m() {
        Strictness strictness = Strictness.f421789c;
        b bVar = new b();
        bVar.f421677b = strictness;
        this.f421679a = bVar;
    }

    @Override // g81.c
    public final void a(Object obj, N71.a aVar) {
        aVar.f11217h.add(this.f421679a);
    }
}

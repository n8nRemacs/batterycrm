package org.mockito;

import e81.InterfaceC39968b;

/* loaded from: classes7.dex */
public enum Answers implements l81.g<Object> {
    RETURNS_DEFAULTS(new org.mockito.internal.stubbing.defaultanswers.b()),
    /* JADX INFO: Fake field, exist only in values array */
    RETURNS_SMART_NULLS(new org.mockito.internal.stubbing.defaultanswers.j()),
    /* JADX INFO: Fake field, exist only in values array */
    RETURNS_MOCKS(new org.mockito.internal.stubbing.defaultanswers.g()),
    RETURNS_DEEP_STUBS(new org.mockito.internal.stubbing.defaultanswers.d()),
    /* JADX INFO: Fake field, exist only in values array */
    CALLS_REAL_METHODS(new org.mockito.internal.stubbing.answers.p()),
    /* JADX INFO: Fake field, exist only in values array */
    RETURNS_SELF(new org.mockito.internal.stubbing.defaultanswers.k());


    /* renamed from: b, reason: collision with root package name */
    public final Object f421491b;

    Answers(l81.g gVar) {
        this.f421491b = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l81.g] */
    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) {
        return this.f421491b.f(interfaceC39968b);
    }
}

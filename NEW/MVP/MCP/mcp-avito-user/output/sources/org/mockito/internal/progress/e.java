package org.mockito.internal.progress;

import V71.t;
import Y71.l;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Stack;
import m81.InterfaceC43929e;
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import org.mockito.exceptions.misusing.UnfinishedVerificationException;

/* compiled from: MockingProgressImpl.java */
/* loaded from: classes7.dex */
public class e implements c {

    /* renamed from: b, reason: collision with root package name */
    public org.mockito.internal.stubbing.f f421696b;

    /* renamed from: c, reason: collision with root package name */
    public P71.c<InterfaceC43929e> f421697c;

    /* renamed from: a, reason: collision with root package name */
    public final b f421695a = new b();

    /* renamed from: d, reason: collision with root package name */
    public P71.d f421698d = null;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f421699e = new LinkedHashSet();

    public e() {
        new d();
    }

    @Override // org.mockito.internal.progress.c
    public final void a() {
        this.f421698d = null;
    }

    @Override // org.mockito.internal.progress.c
    public final void b(InterfaceC43929e interfaceC43929e) {
        e();
        this.f421696b = null;
        this.f421697c = new P71.c<>(interfaceC43929e);
    }

    @Override // org.mockito.internal.progress.c
    public final void c(org.mockito.internal.stubbing.f fVar) {
        this.f421696b = fVar;
    }

    @Override // org.mockito.internal.progress.c
    public final InterfaceC43929e d() {
        P71.c<InterfaceC43929e> cVar = this.f421697c;
        if (cVar == null) {
            return null;
        }
        InterfaceC43929e interfaceC43929e = cVar.f12850a;
        this.f421697c = null;
        return interfaceC43929e;
    }

    @Override // org.mockito.internal.progress.c
    public final void e() {
        h();
        P71.d dVar = this.f421698d;
        if (dVar == null) {
            return;
        }
        this.f421698d = null;
        throw new UnfinishedStubbingException(l.b("Unfinished stubbing detected here:", dVar, "", "E.g. thenReturn() may be missing.", "Examples of correct stubbing:", "    when(mock.isOk()).thenReturn(true);", "    when(mock.isOk()).thenThrow(exception);", "    doThrow(exception).when(mock).someVoidMethod();", "Hints:", " 1. missing thenReturn()", " 2. you are trying to stub a final method, which is not supported", " 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed", ""));
    }

    @Override // org.mockito.internal.progress.c
    public final void f(Object obj, N71.a aVar) {
        for (g81.d dVar : this.f421699e) {
            if (dVar instanceof g81.c) {
                ((g81.c) dVar).a(obj, aVar);
            }
        }
        h();
    }

    @Override // org.mockito.internal.progress.c
    public final b g() {
        return this.f421695a;
    }

    public final void h() {
        new org.mockito.internal.configuration.f();
        P71.c<InterfaceC43929e> cVar = this.f421697c;
        if (cVar != null) {
            P71.d dVar = cVar.f12851b;
            this.f421697c = null;
            throw new UnfinishedVerificationException(l.b("Missing method call for verify(mock) here:", dVar, "", "Example of correct verification:", "    verify(mock).doSomething()", "", "Also, this error might show up because you verify either of: final/private/equals()/hashCode() methods.", "Those methods *cannot* be stubbed/verified.", "Mocking methods declared on non-public parent classes is not supported.", ""));
        }
        b bVar = this.f421695a;
        if (bVar.f421694a.isEmpty()) {
            return;
        }
        Stack<t> stack = bVar.f421694a;
        ArrayList arrayList = new ArrayList(stack);
        stack.clear();
        throw new InvalidUseOfMatchersException(l.b("Misplaced or misused argument matcher detected here:", Q71.a.e(arrayList), "", "You cannot use argument matchers outside of verification or stubbing.", "Examples of correct usage of argument matchers:", "    when(mock.get(anyInt())).thenReturn(null);", "    doThrow(new RuntimeException()).when(mock).someVoidMethod(any());", "    verify(mock).someMethod(contains(\"foo\"))", "", "This message may appear after an NullPointerException if the last matcher is returning an object ", "like any() but the stubbed method signature expect a primitive argument, in this case,", "use primitive alternatives.", "    when(mock.get(any())); // bad use, will raise NPE", "    when(mock.get(anyInt())); // correct usage use", "", "Also, this error might show up because you use argument matchers with methods that cannot be mocked.", "Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().", "Mocking methods declared on non-public parent classes is not supported.", ""));
    }

    public final String toString() {
        return "ongoingStubbing: " + this.f421696b + ", verificationMode: " + this.f421697c + ", stubbingInProgress: " + this.f421698d;
    }
}

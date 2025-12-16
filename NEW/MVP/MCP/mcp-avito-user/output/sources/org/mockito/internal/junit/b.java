package org.mockito.internal.junit;

import e81.InterfaceC39968b;
import h81.InterfaceC40782a;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import org.mockito.exceptions.misusing.PotentialStubbingProblem;
import org.mockito.quality.Strictness;

/* compiled from: DefaultStubbingLookupListener.java */
/* loaded from: classes7.dex */
class b implements g81.f, Serializable {
    private static final long serialVersionUID = -6789800638070123629L;

    /* renamed from: b, reason: collision with root package name */
    public Strictness f421677b;

    @Override // g81.f
    public final void a(g81.e eVar) {
        Strictness strictness;
        Strictness strictness2;
        l81.l lVarC = eVar.c();
        InterfaceC40782a interfaceC40782aJ0 = eVar.j0();
        if (lVarC == null || (strictness2 = ((org.mockito.internal.stubbing.h) lVarC).f421729e) == null) {
            ((N71.a) interfaceC40782aJ0).getClass();
            strictness = this.f421677b;
        } else {
            strictness = strictness2;
        }
        if (strictness != Strictness.f421789c) {
            return;
        }
        if (eVar.c() != null) {
            ((org.mockito.internal.invocation.e) eVar.a()).f421658i = true;
            return;
        }
        InterfaceC39968b interfaceC39968bA = eVar.a();
        Collection<l81.l> collectionB = eVar.b();
        LinkedList<InterfaceC39968b> linkedList = new LinkedList();
        for (l81.l lVar : collectionB) {
            if (!lVar.b() && lVar.d() != Strictness.f421788b) {
                org.mockito.internal.invocation.e eVar2 = (org.mockito.internal.invocation.e) interfaceC39968bA;
                if (lVar.a().getMethod().getName().equals(eVar2.f421652c.c().getName()) && !lVar.a().j().a().equals(eVar2.f421657h.f12854c)) {
                    linkedList.add(lVar.a());
                }
            }
        }
        if (linkedList.isEmpty()) {
            return;
        }
        InterfaceC39968b interfaceC39968bA2 = eVar.a();
        StringBuilder sb2 = new StringBuilder();
        int i12 = 1;
        for (InterfaceC39968b interfaceC39968b : linkedList) {
            sb2.append("    ");
            sb2.append(i12);
            sb2.append(". ");
            sb2.append(interfaceC39968b);
            sb2.append("\n      ");
            sb2.append(interfaceC39968b.j());
            sb2.append("\n");
            i12++;
        }
        sb2.deleteCharAt(sb2.length() - 1);
        StringBuilder sb3 = new StringBuilder(" - this invocation of '");
        org.mockito.internal.invocation.e eVar3 = (org.mockito.internal.invocation.e) interfaceC39968bA2;
        sb3.append(eVar3.f421652c.c().getName());
        sb3.append("' method:");
        throw new PotentialStubbingProblem(Y71.l.b("Strict stubbing argument mismatch. Please check:", sb3.toString(), "    " + interfaceC39968bA2, "    " + eVar3.f421657h, " - has following stubbing(s) with different arguments:", sb2, "Typically, stubbing argument mismatch indicates user mistake when writing tests.", "Mockito fails early so that you can debug potential problem easily.", "However, there are legit scenarios when this exception generates false negative signal:", "  - stubbing the same method multiple times using 'given().will()' or 'when().then()' API", "    Please use 'will().given()' or 'doReturn().when()' API for stubbing.", "  - stubbed method is intentionally invoked with different arguments by code under test", "    Please use default or 'silent' JUnit Rule (equivalent of Strictness.LENIENT).", "For more information see javadoc for PotentialStubbingProblem class."));
    }
}

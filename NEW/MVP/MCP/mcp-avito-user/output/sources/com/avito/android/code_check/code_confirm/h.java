package com.avito.android.code_check.code_confirm;

import Jo.InterfaceC14225b;
import Ro.b;
import com.avito.android.code_check.code_confirm.CodeConfirmFragment;
import com.avito.android.code_check_public.a;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import xn0.C49971a;

/* compiled from: CodeConfirmFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class h extends H implements Y41.l<Object, G0> {
    @Override // Y41.l
    public final G0 invoke(Object obj) {
        CodeConfirmFragment codeConfirmFragment = (CodeConfirmFragment) this.receiver;
        CodeConfirmFragment.a aVar = CodeConfirmFragment.f118629G0;
        codeConfirmFragment.getClass();
        Ro.b bVar = obj instanceof Ro.b ? (Ro.b) obj : null;
        if (bVar instanceof b.C0979b) {
            Input.t(codeConfirmFragment.y5(), "", false, 6);
        } else if (bVar instanceof b.a) {
            b.a aVar2 = (b.a) bVar;
            codeConfirmFragment.v5(aVar2.f14623a, aVar2.f14624b, aVar2.f14625c);
        } else if (bVar instanceof b.f) {
            ((b.f) bVar).getClass();
            codeConfirmFragment.w5(null);
        } else if (bVar instanceof b.g) {
            com.avito.android.code_check.p.a(codeConfirmFragment, new a.InterfaceC3494a.c(((b.g) bVar).f14630a, null, 2, null));
        } else if (bVar instanceof b.c) {
            com.avito.android.code_check.p.a(codeConfirmFragment, ((b.c) bVar).f14627a);
        } else if (bVar instanceof b.d) {
            codeConfirmFragment.v5(((b.d) bVar).f14628a, null, null);
        } else {
            boolean z12 = bVar instanceof b.e;
        }
        InterfaceC14225b interfaceC14225b = obj instanceof InterfaceC14225b ? (InterfaceC14225b) obj : null;
        if (interfaceC14225b instanceof InterfaceC14225b.C0542b) {
            InterfaceC14225b.C0542b c0542b = (InterfaceC14225b.C0542b) interfaceC14225b;
            codeConfirmFragment.v5(c0542b.f9139a, c0542b.f9140b, c0542b.f9141c);
        } else if (interfaceC14225b instanceof InterfaceC14225b.c) {
            com.avito.android.code_check_public.screen.c cVar = codeConfirmFragment.f118638t0;
            com.avito.android.code_check_public.a aVar3 = (cVar != null ? cVar : null).f119334b.f119385a;
            if (aVar3 instanceof a.b.C3497b) {
                a.b.C3497b c3497b = (a.b.C3497b) aVar3;
                com.avito.android.code_check.p.a(codeConfirmFragment, new a.b.C3497b(((InterfaceC14225b.c) interfaceC14225b).f9142a, c3497b.f119279b, c3497b.f119280c, c3497b.f119281d, c3497b.f119282e));
            } else {
                com.avito.android.code_check.p.a(codeConfirmFragment, aVar3);
            }
        } else if (interfaceC14225b instanceof InterfaceC14225b.e) {
            com.avito.android.code_check.p.a(codeConfirmFragment, ((InterfaceC14225b.e) interfaceC14225b).f9144a);
        } else if (interfaceC14225b instanceof InterfaceC14225b.g) {
            codeConfirmFragment.w5(((InterfaceC14225b.g) interfaceC14225b).f9146a);
        } else if (interfaceC14225b instanceof InterfaceC14225b.h) {
            com.avito.android.code_check.p.a(codeConfirmFragment, new a.InterfaceC3494a.c(((InterfaceC14225b.h) interfaceC14225b).f9147a, null, 2, null));
        } else if (interfaceC14225b instanceof InterfaceC14225b.d) {
            codeConfirmFragment.y5().post(new com.avito.android.app.coldstart.d(codeConfirmFragment, 12));
        } else if (L.f(interfaceC14225b, InterfaceC14225b.a.f9138a)) {
            C49971a.a(codeConfirmFragment.requireActivity());
        } else if (interfaceC14225b instanceof InterfaceC14225b.f) {
            Input.t(codeConfirmFragment.y5(), ((InterfaceC14225b.f) interfaceC14225b).f9145a, false, 6);
        }
        return G0.f406611a;
    }
}

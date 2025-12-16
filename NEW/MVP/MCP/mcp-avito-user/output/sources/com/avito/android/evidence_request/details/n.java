package com.avito.android.evidence_request.details;

import Vz.C15731a;
import Vz.C15732b;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.validation.InterfaceC36030r0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EvidenceDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVz/b;", "it", "Lkotlin/G0;", "accept", "(LVz/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f148539b;

    public n(h hVar) {
        this.f148539b = hVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C15732b c15732b = (C15732b) obj;
        List<ParameterSlot> list = c15732b.f17536a;
        h hVar = this.f148539b;
        hVar.f148505U = list;
        SimpleParametersTree simpleParametersTree = new SimpleParametersTree(hVar.f148505U);
        InterfaceC36030r0 interfaceC36030r0 = hVar.f148494J;
        interfaceC36030r0.f(simpleParametersTree, null);
        interfaceC36030r0.getF319331j().accept(hVar.le());
        C15731a c15731a = c15732b.f17537b;
        hVar.f148506V = c15731a.f17535b;
        hVar.f148507W = c15731a.f17534a;
    }
}

package com.avito.android.validation;

import com.avito.android.item_map.view.C31075l;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ParametersListPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class N0 extends kotlin.jvm.internal.N implements Y41.l<kotlin.G0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y0 f319278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Set<TV0.d<?, ?>> f319279m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public N0(Y0 y02, Set<? extends TV0.d<?, ?>> set) {
        super(1);
        this.f319278l = y02;
        this.f319279m = set;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(kotlin.G0 g02) {
        Y0 y02 = this.f319278l;
        y02.j(new M0(y02));
        Iterator<T> it = this.f319279m.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            boolean z12 = dVar instanceof com.avito.android.blueprints.switcher.b;
            io.reactivex.rxjava3.disposables.c cVar = y02.f319329h;
            if (z12) {
                cVar.b(y02.p(((com.avito.android.blueprints.switcher.b) dVar).b()));
            } else if (dVar instanceof com.avito.android.blueprints.publish.delivery_toggles.e) {
                cVar.b(((com.avito.android.blueprints.publish.delivery_toggles.e) dVar).b().x0(y02.f319323b.e()).v0(new C31075l(23, new S0(y02)), new C31075l(29, T0.f319300l), io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.switcher.c) {
                cVar.b(y02.p(((com.avito.android.blueprint.switcher.c) dVar).b()));
            } else if (dVar instanceof com.avito.android.blueprints.input.d) {
                cVar.b(y02.q(((com.avito.android.blueprints.input.d) dVar).b()));
            } else if (dVar instanceof com.avito.android.blueprint.input.c) {
                cVar.b(y02.q(((com.avito.android.blueprint.input.c) dVar).b()));
            } else if (dVar instanceof j1) {
                cVar.b(y02.q(((j1) dVar).b()));
            }
        }
        return kotlin.G0.f406611a;
    }
}

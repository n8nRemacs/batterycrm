package com.avito.android.select.bottom_sheet.blueprints.group;

import androidx.compose.runtime.internal.P;
import com.avito.android.select.bottom_sheet.blueprints.group.diff_util.b;
import dq0.InterfaceC39781c;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableGroupItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/group/q;", "Lcom/avito/android/select/bottom_sheet/blueprints/group/h;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.l<InterfaceC39781c, G0> f265122b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f265123c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f265124d = new com.jakewharton.rxrelay3.c<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public q(@Y61.l Y41.l<? super InterfaceC39781c, G0> lVar) {
        this.f265122b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((s) eVar, (a) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        s sVar = (s) eVar;
        a aVar2 = (a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof b.a) {
                obj = obj2;
            }
        }
        b.a aVar3 = (b.a) (obj instanceof b.a ? obj : null);
        if (aVar3 instanceof b.a.C7916a) {
            sVar.Da(((b.a.C7916a) aVar3).f265099a);
            sVar.lb(new k(this, aVar2));
            sVar.Y7(new l(this, aVar2));
        } else {
            if (aVar3 instanceof b.a.c) {
                b.a.c cVar = (b.a.c) aVar3;
                sVar.d9(cVar.f265103a, cVar.f265104b);
                sVar.lb(new m(this, aVar2));
                sVar.Y7(new n(this, aVar2));
                return;
            }
            if (!(aVar3 instanceof b.a.C7917b)) {
                k(sVar, aVar2);
                return;
            }
            b.a.C7917b c7917b = (b.a.C7917b) aVar3;
            sVar.d9(c7917b.f265100a, c7917b.f265101b);
            sVar.Da(c7917b.f265102c);
            sVar.lb(new o(this, aVar2));
            sVar.Y7(new p(this, aVar2));
        }
    }

    public final void k(@Y61.k s sVar, @Y61.k a aVar) {
        sVar.setTitle(aVar.f265090c);
        sVar.lb(new i(this, aVar));
        sVar.Y7(new j(this, aVar));
        sVar.d9(aVar.f265092e, aVar.f265093f);
        sVar.Da(aVar.f265094g);
    }
}

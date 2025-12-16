package com.avito.android.mortgage.landing.list.items.programs;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.programs.payload.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import u00.InterfaceC48753a;
import w00.InterfaceC49409a;

/* compiled from: ProgramsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/programs/h;", "LTV0/f;", "Lcom/avito/android/mortgage/landing/list/items/programs/j;", "Lcom/avito/android/mortgage/landing/list/items/programs/ProgramsItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements TV0.f<j, ProgramsItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC49409a, G0> f199902b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48753a f199903c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super InterfaceC49409a, G0> lVar, @Y61.k InterfaceC48753a interfaceC48753a) {
        this.f199902b = lVar;
        this.f199903c = interfaceC48753a;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (ProgramsItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        ProgramsItem programsItem = (ProgramsItem) aVar;
        G0 g02 = null;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<com.avito.android.mortgage.landing.list.items.programs.payload.a> list2 = (List) obj;
        if (list2 != null) {
            for (com.avito.android.mortgage.landing.list.items.programs.payload.a aVar2 : list2) {
                if (aVar2 instanceof a.C5910a) {
                    jVar.el(((a.C5910a) aVar2).f199919a);
                }
            }
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            k(jVar, programsItem);
        }
    }

    public final void k(@Y61.k j jVar, @Y61.k ProgramsItem programsItem) {
        jVar.el(programsItem.f199881e);
        jVar.Tc(programsItem.f199879c);
        jVar.s70(programsItem.f199880d);
        jVar.vZ(new c(this));
        jVar.c30(new d(this));
        jVar.e3(this.f199903c.a(programsItem.f199878b));
        jVar.FM(new e(jVar, this, programsItem));
        jVar.sI(new f(this));
        jVar.tI(new g(this));
    }
}

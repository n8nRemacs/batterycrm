package com.avito.android.ticket_view.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.reward_program.ab_tests.configs.ShowTicketEntryTestGroup;
import com.avito.android.ticket_view.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import nn0.C44453a;
import oE0.C44632b;
import oE0.C44633c;

/* compiled from: TicketViewActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ticket_view/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/ticket_view/mvi/a;", "Lcom/avito/android/ticket_view/mvi/k;", "Lcom/avito/android/ticket_view/a;", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<a, k, com.avito.android.ticket_view.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C44633c f301408a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.l<ShowTicketEntryTestGroup> f301409b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ticket_view.b f301410c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C44453a f301411d;

    @Inject
    public d(@Y61.k C44633c c44633c, @Y61.k @nn0.f u3.l<ShowTicketEntryTestGroup> lVar, @Y61.k com.avito.android.ticket_view.b bVar, @Y61.k C44453a c44453a) {
        this.f301408a = c44633c;
        this.f301409b = lVar;
        this.f301410c = bVar;
        this.f301411d = c44453a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<k> b(a aVar, com.avito.android.ticket_view.a aVar2) {
        a aVar3 = aVar;
        if (aVar3 instanceof a.C9222a) {
            return C43175k.G(new b(this, null));
        }
        if (!(aVar3 instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        u3.l<ShowTicketEntryTestGroup> lVar = this.f301409b;
        lVar.b();
        ShowTicketEntryTestGroup showTicketEntryTestGroup = lVar.f439745a.f439749b;
        showTicketEntryTestGroup.getClass();
        if (showTicketEntryTestGroup == ShowTicketEntryTestGroup.f255685d) {
            C44453a c44453a = this.f301411d;
            c44453a.getClass();
            kotlin.reflect.n<Object> nVar = C44453a.f419152d[1];
            if (((Boolean) c44453a.f419154c.a().invoke()).booleanValue()) {
                return this.f301410c.a();
            }
        }
        C44633c c44633c = this.f301408a;
        c44633c.f419637b = 0L;
        c44633c.f419636a.c(new C44632b(0L));
        return C43175k.G(new c(2, null));
    }
}

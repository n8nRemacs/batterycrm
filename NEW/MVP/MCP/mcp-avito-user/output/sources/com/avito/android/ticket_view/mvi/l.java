package com.avito.android.ticket_view.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.ticket_view.a;
import com.avito.android.ticket_view.mvi.k;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import oE0.C44632b;
import oE0.C44633c;

/* compiled from: TicketViewReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/ticket_view/mvi/k;", "Lcom/avito/android/ticket_view/a;", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements u<k, com.avito.android.ticket_view.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C44633c f301437b;

    @Inject
    public l(@Y61.k C44633c c44633c) {
        this.f301437b = c44633c;
    }

    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.ticket_view.a a(k kVar, com.avito.android.ticket_view.a aVar) {
        k kVar2 = kVar;
        boolean z12 = kVar2 instanceof k.b;
        C44633c c44633c = this.f301437b;
        if (z12) {
            int i12 = ((k.b) kVar2).f301434a;
            long j12 = i12;
            c44633c.f419637b = j12;
            c44633c.f419636a.c(new C44632b(j12));
            return new a.C9221a(i12);
        }
        if (kVar2 instanceof k.a) {
            V2.f318762a.f(((k.a) kVar2).f301433a);
            c44633c.f419637b = 0L;
            c44633c.f419636a.c(new C44632b(0L));
            return a.c.f301389a;
        }
        if (kVar2 instanceof k.d) {
            return a.c.f301389a;
        }
        if (kVar2 instanceof k.c) {
            return a.b.f301388a;
        }
        throw new NoWhenBranchMatchedException();
    }
}

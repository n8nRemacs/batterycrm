package com.avito.android.ticket_view.mvi;

import com.avito.android.account.E;
import com.avito.android.reward_program.ab_tests.configs.OctoberRewardTestGroup;
import com.avito.android.reward_program.ab_tests.configs.ShowTicketEntryTestGroup;
import com.avito.android.ticket_view.mvi.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import nn0.C44453a;

/* compiled from: TicketViewBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ticket_view/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/ticket_view/mvi/k;", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.b<k> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u3.l<ShowTicketEntryTestGroup> f301417a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.h<OctoberRewardTestGroup> f301418b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f301419c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C44453a f301420d;

    @Inject
    public f(@Y61.k @nn0.f u3.l<ShowTicketEntryTestGroup> lVar, @Y61.k @nn0.f u3.h<OctoberRewardTestGroup> hVar, @Y61.k E e12, @Y61.k C44453a c44453a) {
        this.f301417a = lVar;
        this.f301418b = hVar;
        this.f301419c = e12;
        this.f301420d = c44453a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<k> a() {
        if (!this.f301419c.b()) {
            return new C43210w(k.c.f301435a);
        }
        OctoberRewardTestGroup octoberRewardTestGroup = this.f301418b.f439744a.f439749b;
        octoberRewardTestGroup.getClass();
        if (octoberRewardTestGroup != OctoberRewardTestGroup.f255680c) {
            u3.l<ShowTicketEntryTestGroup> lVar = this.f301417a;
            ShowTicketEntryTestGroup showTicketEntryTestGroup = lVar.f439745a.f439749b;
            showTicketEntryTestGroup.getClass();
            if (showTicketEntryTestGroup != ShowTicketEntryTestGroup.f255684c) {
                C44453a c44453a = this.f301420d;
                c44453a.getClass();
                kotlin.reflect.n<Object> nVar = C44453a.f419152d[1];
                if (!((Boolean) c44453a.f419154c.a().invoke()).booleanValue()) {
                    return new C43210w(k.d.f301436a);
                }
                ShowTicketEntryTestGroup showTicketEntryTestGroup2 = lVar.f439745a.f439749b;
                showTicketEntryTestGroup2.getClass();
                return showTicketEntryTestGroup2 == ShowTicketEntryTestGroup.f255685d ? new C43210w(k.d.f301436a) : new C43207v(new k[0]);
            }
        }
        return new C43210w(k.c.f301435a);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

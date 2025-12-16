package com.avito.android.ticket_view.mvi;

import com.avito.android.reward_program.ab_tests.configs.ShowTicketEntryTestGroup;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import nn0.C44453a;
import oE0.C44633c;

/* compiled from: TicketViewActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/e;", "Ldagger/internal/h;", "Lcom/avito/android/ticket_view/mvi/d;", "a", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f301412e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<C44633c> f301413a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<u3.l<ShowTicketEntryTestGroup>> f301414b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ticket_view.c f301415c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<C44453a> f301416d;

    /* compiled from: TicketViewActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/e$a;", "", "<init>", "()V", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k com.avito.android.ticket_view.c cVar, @Y61.k Provider provider3) {
        this.f301413a = provider;
        this.f301414b = provider2;
        this.f301415c = cVar;
        this.f301416d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C44633c c44633c = this.f301413a.get();
        u3.l<ShowTicketEntryTestGroup> lVar = this.f301414b.get();
        com.avito.android.ticket_view.b bVar = (com.avito.android.ticket_view.b) this.f301415c.get();
        C44453a c44453a = this.f301416d.get();
        f301412e.getClass();
        return new d(c44633c, lVar, bVar, c44453a);
    }
}

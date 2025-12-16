package com.avito.android.ticket_view.mvi;

import com.avito.android.account.E;
import com.avito.android.reward_program.ab_tests.configs.OctoberRewardTestGroup;
import com.avito.android.reward_program.ab_tests.configs.ShowTicketEntryTestGroup;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import nn0.C44453a;

/* compiled from: TicketViewBootstrap_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/g;", "Ldagger/internal/h;", "Lcom/avito/android/ticket_view/mvi/f;", "a", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f301421e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<u3.l<ShowTicketEntryTestGroup>> f301422a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<u3.h<OctoberRewardTestGroup>> f301423b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<E> f301424c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<C44453a> f301425d;

    /* compiled from: TicketViewBootstrap_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/g$a;", "", "<init>", "()V", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k Provider<u3.l<ShowTicketEntryTestGroup>> provider, @Y61.k Provider<u3.h<OctoberRewardTestGroup>> provider2, @Y61.k Provider<E> provider3, @Y61.k Provider<C44453a> provider4) {
        this.f301422a = provider;
        this.f301423b = provider2;
        this.f301424c = provider3;
        this.f301425d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        u3.l<ShowTicketEntryTestGroup> lVar = this.f301422a.get();
        u3.h<OctoberRewardTestGroup> hVar = this.f301423b.get();
        E e12 = this.f301424c.get();
        C44453a c44453a = this.f301425d.get();
        f301421e.getClass();
        return new f(lVar, hVar, e12, c44453a);
    }
}

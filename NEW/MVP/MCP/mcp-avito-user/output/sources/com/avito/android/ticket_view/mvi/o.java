package com.avito.android.ticket_view.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TicketViewViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/o;", "Ldagger/internal/h;", "Lcom/avito/android/ticket_view/mvi/n;", "a", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f301440b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f301441a;

    /* compiled from: TicketViewViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/o$a;", "", "<init>", "()V", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public o(@Y61.k j jVar) {
        this.f301441a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f301441a.get();
        f301440b.getClass();
        return new n(iVar, null, 2, null);
    }
}

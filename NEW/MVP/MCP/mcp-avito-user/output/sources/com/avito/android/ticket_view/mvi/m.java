package com.avito.android.ticket_view.mvi;

import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import oE0.C44633c;

/* compiled from: TicketViewReducer_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/m;", "Ldagger/internal/h;", "Lcom/avito/android/ticket_view/mvi/l;", "a", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f301438b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f301439a;

    /* compiled from: TicketViewReducer_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/m$a;", "", "<init>", "()V", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public m(@Y61.k u uVar) {
        this.f301439a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C44633c c44633c = (C44633c) this.f301439a.get();
        f301438b.getClass();
        return new l(c44633c);
    }
}

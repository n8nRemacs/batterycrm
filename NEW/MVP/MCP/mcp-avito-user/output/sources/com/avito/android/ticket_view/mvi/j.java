package com.avito.android.ticket_view.mvi;

import com.avito.android.ticket_view.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TicketViewFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/j;", "Ldagger/internal/h;", "Lcom/avito/android/ticket_view/mvi/i;", "a", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f301429d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f301430a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f301431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e f301432c;

    /* compiled from: TicketViewFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/j$a;", "", "<init>", "()V", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k g gVar, @Y61.k m mVar, @Y61.k e eVar) {
        this.f301430a = gVar;
        this.f301431b = mVar;
        this.f301432c = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f301430a.get();
        l lVar = (l) this.f301431b.get();
        d dVar = (d) this.f301432c.get();
        f301429d.getClass();
        return new i("TicketView", a.b.f301388a, new h(fVar, lVar, dVar));
    }
}

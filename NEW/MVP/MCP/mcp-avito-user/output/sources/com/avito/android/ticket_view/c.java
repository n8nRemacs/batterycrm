package com.avito.android.ticket_view;

import Y61.k;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TicketMenuIconInteractor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/c;", "Ldagger/internal/h;", "Lcom/avito/android/ticket_view/b;", "a", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f301395c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f301396a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<R0> f301397b;

    /* compiled from: TicketMenuIconInteractor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/c$a;", "", "<init>", "()V", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar, @k Provider provider) {
        this.f301396a = fVar;
        this.f301397b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f301396a.get();
        R0 r02 = this.f301397b.get();
        f301395c.getClass();
        return new b(eVar, r02);
    }
}

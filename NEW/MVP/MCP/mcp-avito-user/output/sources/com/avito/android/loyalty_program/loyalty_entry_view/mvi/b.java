package com.avito.android.loyalty_program.loyalty_entry_view.mvi;

import com.avito.android.deep_linking.x;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import vX.InterfaceC49276a;

/* compiled from: LoyaltyEntryViewActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/mvi/b;", "Ldagger/internal/h;", "Lcom/avito/android/loyalty_program/loyalty_entry_view/mvi/a;", "a", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<com.avito.android.loyalty_program.loyalty_entry_view.mvi.a> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f184171e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.loyalty_program.loyalty_entry_view.domain.c f184172a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC49276a> f184173b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<x> f184174c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f184175d;

    /* compiled from: LoyaltyEntryViewActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/mvi/b$a;", "", "<init>", "()V", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@Y61.k com.avito.android.loyalty_program.loyalty_entry_view.domain.c cVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3) {
        this.f184172a = cVar;
        this.f184173b = provider;
        this.f184174c = provider2;
        this.f184175d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.loyalty_program.loyalty_entry_view.domain.a aVar = (com.avito.android.loyalty_program.loyalty_entry_view.domain.a) this.f184172a.get();
        InterfaceC49276a interfaceC49276a = this.f184173b.get();
        x xVar = this.f184174c.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f184175d.get();
        f184171e.getClass();
        return new com.avito.android.loyalty_program.loyalty_entry_view.mvi.a(aVar, interfaceC49276a, xVar, aVar2);
    }
}

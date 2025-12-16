package com.avito.android.loyalty_program.loyalty_entry_view.mvi;

import BX.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LoyaltyEntryViewFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/mvi/g;", "Ldagger/internal/h;", "Lcom/avito/android/loyalty_program/loyalty_entry_view/mvi/f;", "a", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f184182d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f184183a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f184184b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final k f184185c;

    /* compiled from: LoyaltyEntryViewFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/mvi/g$a;", "", "<init>", "()V", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k d dVar, @Y61.k b bVar, @Y61.k k kVar) {
        this.f184183a = dVar;
        this.f184184b = bVar;
        this.f184185c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f184183a.getClass();
        c cVar = new c();
        com.avito.android.loyalty_program.loyalty_entry_view.mvi.a aVar = (com.avito.android.loyalty_program.loyalty_entry_view.mvi.a) this.f184184b.get();
        j jVar = (j) this.f184185c.get();
        f184182d.getClass();
        return new f("LoyaltyEntryView", d.b.f1459d, new e(cVar, aVar, jVar));
    }
}

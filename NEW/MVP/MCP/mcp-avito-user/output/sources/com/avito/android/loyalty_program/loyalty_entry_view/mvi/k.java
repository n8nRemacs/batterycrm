package com.avito.android.loyalty_program.loyalty_entry_view.mvi;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import vX.InterfaceC49276a;

/* compiled from: LoyaltyEntryViewReducer_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/mvi/k;", "Ldagger/internal/h;", "Lcom/avito/android/loyalty_program/loyalty_entry_view/mvi/j;", "a", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f184187b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC49276a> f184188a;

    /* compiled from: LoyaltyEntryViewReducer_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/mvi/k$a;", "", "<init>", "()V", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k Provider<InterfaceC49276a> provider) {
        this.f184188a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49276a interfaceC49276a = this.f184188a.get();
        f184187b.getClass();
        return new j(interfaceC49276a);
    }
}

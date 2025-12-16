package com.avito.android.toggle_comparison_state;

import Uq.InterfaceC15558a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChangeComparisonStateRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/j;", "Ldagger/internal/h;", "Lcom/avito/android/toggle_comparison_state/i;", "a", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f301611d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC15558a> f301612a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f301613b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f301614c;

    /* compiled from: ChangeComparisonStateRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/j$a;", "", "<init>", "()V", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k Provider provider, @Y61.k d dVar, @Y61.k Provider provider2) {
        this.f301612a = provider;
        this.f301613b = dVar;
        this.f301614c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f301612a);
        this.f301613b.getClass();
        c cVar = new c();
        InterfaceC35745a5 interfaceC35745a5 = this.f301614c.get();
        f301611d.getClass();
        return new i(eVarB, cVar, interfaceC35745a5);
    }
}

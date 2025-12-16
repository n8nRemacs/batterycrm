package com.avito.android.toggle_comparison_state;

import dagger.internal.u;
import f90.InterfaceC40258g;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChangeComparisonStateUseCase_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/n;", "Ldagger/internal/h;", "Lcom/avito/android/toggle_comparison_state/l;", "a", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f301619c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f301620a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f301621b;

    /* compiled from: ChangeComparisonStateUseCase_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/n$a;", "", "<init>", "()V", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public n(@Y61.k j jVar, @Y61.k u uVar) {
        this.f301620a = jVar;
        this.f301621b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f301620a.get();
        InterfaceC40258g interfaceC40258g = (InterfaceC40258g) this.f301621b.get();
        f301619c.getClass();
        return new l(eVar, interfaceC40258g);
    }
}

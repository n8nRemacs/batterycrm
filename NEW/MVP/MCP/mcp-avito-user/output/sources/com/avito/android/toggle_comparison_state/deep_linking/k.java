package com.avito.android.toggle_comparison_state.deep_linking;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ToggleComparisonStateLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/deep_linking/k;", "Ldagger/internal/h;", "Lcom/avito/android/toggle_comparison_state/deep_linking/d;", "a", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<d> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f301596d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C25721c f301597a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.toggle_comparison_state.n f301598b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f301599c;

    /* compiled from: ToggleComparisonStateLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/deep_linking/k$a;", "", "<init>", "()V", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k C25721c c25721c, @Y61.k com.avito.android.toggle_comparison_state.n nVar, @Y61.k Provider provider) {
        this.f301597a = c25721c;
        this.f301598b = nVar;
        this.f301599c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C25719a c25719a = (C25719a) this.f301597a.get();
        com.avito.android.toggle_comparison_state.l lVar = (com.avito.android.toggle_comparison_state.l) this.f301598b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f301599c.get();
        f301596d.getClass();
        return new d(c25719a, lVar, interfaceC35745a5);
    }
}

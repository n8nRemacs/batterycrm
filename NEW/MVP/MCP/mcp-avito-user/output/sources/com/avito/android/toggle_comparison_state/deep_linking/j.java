package com.avito.android.toggle_comparison_state.deep_linking;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: ToggleComparisonStateLinkHandlerModule_ProvideDeeplinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/deep_linking/j;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f301593c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f301594a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f301595b;

    /* compiled from: ToggleComparisonStateLinkHandlerModule_ProvideDeeplinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/deep_linking/j$a;", "", "<init>", "()V", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k k kVar, @Y61.k n nVar) {
        this.f301594a = kVar;
        this.f301595b = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f301595b.getClass();
        l lVar = new l();
        k kVar = this.f301594a;
        f301593c.getClass();
        i.f301592a.getClass();
        return new C43834a(ToggleComparisonStateLink.class, lVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ToggleComparisonStateLink.class), kVar));
    }
}

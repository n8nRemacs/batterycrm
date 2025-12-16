package com.avito.android.calltracking;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CalltrackingViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/N;", "Landroidx/lifecycle/P0$c;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class N implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC29293v f113588a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.calltracking_core.f f113589b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f113590c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f113591d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CalltrackingScreenType f113592e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f113593f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f113594g;

    @Inject
    public N(@Y61.k com.avito.android.account.E e12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC29293v interfaceC29293v, @Y61.k CalltrackingScreenType calltrackingScreenType, @Y61.k com.avito.android.calltracking_core.f fVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f113588a = interfaceC29293v;
        this.f113589b = fVar;
        this.f113590c = interfaceC35745a5;
        this.f113591d = aVar;
        this.f113592e = calltrackingScreenType;
        this.f113593f = e12;
        this.f113594g = interfaceC28373a;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(S.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f113591d;
        return cls.cast(new S(this.f113593f, this.f113594g, this.f113588a, this.f113592e, this.f113589b, aVar, this.f113590c));
    }
}

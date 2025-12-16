package com.avito.android.vas_planning;

import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.J0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlanningViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/r;", "Landroidx/lifecycle/a;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final VasPlanningFragmentArgument f322462d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning.domain.k f322463e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322464f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final J0 f322465g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f322466h;

    @Inject
    public r(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k VasPlanningFragmentArgument vasPlanningFragmentArgument, @Y61.k com.avito.android.vas_planning.domain.k kVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k J0 j02, @Y61.k InterfaceC28373a interfaceC28373a) {
        super(interfaceC23487e, null);
        this.f322462d = vasPlanningFragmentArgument;
        this.f322463e = kVar;
        this.f322464f = interfaceC35745a5;
        this.f322465g = j02;
        this.f322466h = interfaceC28373a;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(t.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new t(c23060r0, this.f322462d, this.f322463e, this.f322464f, this.f322465g, this.f322466h);
    }
}

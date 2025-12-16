package com.avito.android.personal_selections.domain;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import n70.InterfaceC44207a;

/* compiled from: PersonalSelectionsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_selections/domain/d;", "Lcom/avito/android/personal_selections/domain/b;", "_avito_personal-selections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f215789a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44207a> f215790b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f215791c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.personal_selections.mvi.a f215792d;

    @Inject
    public d(@k R0 r02, @k h31.e<InterfaceC44207a> eVar, @k InterfaceC28373a interfaceC28373a, @k com.avito.android.personal_selections.mvi.a aVar) {
        this.f215789a = r02;
        this.f215790b = eVar;
        this.f215791c = interfaceC28373a;
        this.f215792d = aVar;
    }

    @Override // com.avito.android.personal_selections.domain.b
    @l
    public final InterfaceC43160i a() {
        return C43175k.I(this.f215789a.a(), C43175k.G(new c(this, null)));
    }
}

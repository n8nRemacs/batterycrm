package com.avito.android.publish;

import androidx.view.P0;
import com.avito.android.Q1;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.category_parameters.slot.GroupSlotActiveIdProvider;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.util.InterfaceC35745a5;
import hz.InterfaceC41196a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishViewModelFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/L0;", "Landroidx/lifecycle/P0$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class L0 implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.draft_onboarding.a f231927a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f231928b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C50213a f231929c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f231930d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f231931e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Map<SlotType, GroupSlotActiveIdProvider> f231932f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.restriction.e f231933g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f231934h;

    @Inject
    public L0(@Y61.k com.avito.android.publish.draft_onboarding.a aVar, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k C50213a c50213a, @Y61.k Q1 q12, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k Map<SlotType, GroupSlotActiveIdProvider> map, @Y61.k com.avito.android.publish.restriction.e eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f231927a = aVar;
        this.f231928b = interfaceC33535v;
        this.f231929c = c50213a;
        this.f231930d = q12;
        this.f231931e = interfaceC41196a;
        this.f231932f = map;
        this.f231933g = eVar;
        this.f231934h = interfaceC35745a5;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends androidx.view.M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(C0.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new C0(this.f231927a, this.f231928b, this.f231929c, this.f231930d, this.f231931e, this.f231932f, this.f231933g, this.f231934h);
    }
}

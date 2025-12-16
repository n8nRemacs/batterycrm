package com.avito.android.publish_limits_info.history;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.publish_limits_info.ItemId;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishLimitsHistoryViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish_limits_info/history/n;", "Landroidx/lifecycle/P0$c;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ItemId f245866a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f245867b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f245868c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f245869d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish_limits_info.history.tab.a f245870e;

    @Inject
    public n(@Y61.k ItemId itemId, @Y61.k g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k com.avito.android.publish_limits_info.history.tab.a aVar) {
        this.f245866a = itemId;
        this.f245867b = gVar;
        this.f245868c = interfaceC35745a5;
        this.f245869d = interfaceC35863o4;
        this.f245870e = aVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(m.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new m(this.f245866a, this.f245867b, this.f245868c, this.f245869d, this.f245870e);
    }
}

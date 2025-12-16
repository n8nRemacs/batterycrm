package com.avito.android.publish_limits_info.history;

import com.avito.android.publish_limits_info.ItemId;
import com.avito.android.remote.K0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishLimitsHistoryInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish_limits_info/history/j;", "Lcom/avito/android/publish_limits_info/history/g;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final K0 f245845a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f245846b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f245847c;

    @Inject
    public j(@Y61.k K0 k02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar) {
        this.f245845a = k02;
        this.f245846b = interfaceC35745a5;
        this.f245847c = fVar;
    }

    @Override // com.avito.android.publish_limits_info.history.g
    @Y61.k
    public final C41982q1 a(@Y61.k ItemId itemId) {
        return this.f245845a.a(itemId.f245800b, "pay").r(h.f245843b).F().r0(P2.c.f318721a).m0(new i(this)).x0(this.f245846b.a());
    }
}

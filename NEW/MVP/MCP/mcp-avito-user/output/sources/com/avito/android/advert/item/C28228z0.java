package com.avito.android.advert.item;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.advert_poll.AdvertPoll;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.z0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28228z0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f80768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdvertPoll f80769c;

    public C28228z0(C28136i0 c28136i0, AdvertPoll advertPoll) {
        this.f80768b = c28136i0;
        this.f80769c = advertPoll;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ((Number) obj).longValue();
        b.a.a(this.f80768b.f76334c0, this.f80769c.getDeeplink(), null, null, 6);
    }
}

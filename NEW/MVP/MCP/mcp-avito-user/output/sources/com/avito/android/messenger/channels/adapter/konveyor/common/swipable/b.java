package com.avito.android.messenger.channels.adapter.konveyor.common.swipable;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.adapter.konveyor.channel.p;
import com.avito.android.messenger.channels.adapter.konveyor.common.swipable.c;
import com.avito.android.messenger.channels.adapter.konveyor.common.swipable.d.a;
import com.avito.android.messenger.channels.adapter.konveyor.common.swipable.d.b;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: SwipableItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f186911a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<c.a> f186912b = new com.jakewharton.rxrelay3.c<>();

    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f186911a = interfaceC28373a;
    }

    public final void a(@k p pVar, @l String str) {
        a aVar = (str == null || C43066x.K(str)) ? null : new a(this, str);
        d dVar = pVar.f186891e;
        com.jakewharton.rxrelay3.c<c.a> cVar = this.f186912b;
        io.reactivex.rxjava3.disposables.c cVar2 = dVar.f186921h;
        cVar2.e();
        dVar.f186917d = cVar;
        dVar.f186918e = aVar;
        cVar2.b(cVar.t0(dVar.new a()));
        dVar.a().setOnSwipeListener(dVar.new b());
    }
}

package com.avito.android.di;

import com.avito.android.H0;
import com.avito.android.InterfaceC32896n;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.clickstream.C28379d;
import com.avito.android.analytics.inhouse_transport.q;
import com.avito.android.util.C35825j6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35950u;
import com.google.common.collect.H1;
import kotlin.Metadata;
import proto.events.apps.EventOuterClass;

/* compiled from: ClickStreamSendDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/f;", "Lcom/avito/android/di/h;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC29969f extends InterfaceC29971h {
    @Y61.k
    @q.a
    H1 Hl();

    @Y61.k
    com.avito.android.remote.H K();

    @Y61.k
    H0 M();

    @Y61.k
    InterfaceC35950u Og();

    @Y61.k
    com.avito.android.geo.j Uh();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    com.avito.android.util.C j();

    @Y61.k
    InterfaceC32896n kh();

    @Y61.k
    C35825j6 u7();

    @C28379d.a
    @Y61.k
    com.avito.android.analytics.inhouse_transport.u<EventOuterClass.Event> vb();
}

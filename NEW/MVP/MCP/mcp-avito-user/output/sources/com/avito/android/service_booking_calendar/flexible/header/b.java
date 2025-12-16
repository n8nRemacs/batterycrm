package com.avito.android.service_booking_calendar.flexible.header;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import jt0.InterfaceC42425a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarHeaderStateRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CalendarHeaderState.b f275888l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<com.avito.android.service_booking_calendar.flexible.d, G0> f275889m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(CalendarHeaderState.b bVar, l<? super com.avito.android.service_booking_calendar.flexible.d, G0> lVar) {
        super(0);
        this.f275888l = bVar;
        this.f275889m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = ((CalendarHeaderState.b.a) this.f275888l).f276029e;
        if (deepLink != null) {
            this.f275889m.invoke(new InterfaceC42425a.e(deepLink));
        }
        return G0.f406611a;
    }
}

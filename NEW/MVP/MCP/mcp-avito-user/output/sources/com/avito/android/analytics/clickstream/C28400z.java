package com.avito.android.analytics.clickstream;

import Vj.InterfaceC15686a;
import com.avito.android.util.C35755b0;
import fz.InterfaceC40498a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.P0;
import w40.InterfaceC49441a;

/* compiled from: ClickStreamEventSaturatorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/clickstream/z;", "Lcom/avito/android/analytics/clickstream/y;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.clickstream.z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28400z implements InterfaceC28399y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f89844a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40498a f89845b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15686a f89846c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49441a f89847d;

    public C28400z(@Y61.k com.avito.android.account.E e12, @Y61.k InterfaceC40498a interfaceC40498a, @Y61.k InterfaceC15686a interfaceC15686a, @Y61.k InterfaceC49441a interfaceC49441a) {
        this.f89844a = e12;
        this.f89845b = interfaceC40498a;
        this.f89846c = interfaceC15686a;
        this.f89847d = interfaceC49441a;
    }

    @Override // com.avito.android.analytics.clickstream.InterfaceC28399y
    @Y61.k
    public final LinkedHashMap a() {
        kotlin.Q q12 = new kotlin.Q("uid", this.f89844a.a());
        InterfaceC40498a interfaceC40498a = this.f89845b;
        interfaceC40498a.getClass();
        kotlin.Q q13 = new kotlin.Q("is_employee", interfaceC40498a.a());
        InterfaceC15686a interfaceC15686a = this.f89846c;
        interfaceC15686a.getClass();
        return C35755b0.c(P0.g(q12, q13, new kotlin.Q("from_separated_space", interfaceC15686a.a()), new kotlin.Q("is_offline_mode", this.f89847d.isEnabled() ? "1" : null)));
    }
}

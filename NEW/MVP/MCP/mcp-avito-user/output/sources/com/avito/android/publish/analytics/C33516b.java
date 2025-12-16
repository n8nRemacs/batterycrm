package com.avito.android.publish.analytics;

import Cd0.C13271k0;
import Cd0.C13273l0;
import Cd0.C13275m0;
import Cd0.C13286t;
import Cd0.G0;
import Cd0.H0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.text.C43066x;
import m80.C43924a;
import vM.C49232b;
import yc.C50213a;

/* compiled from: PhotoPickerOnPublishEventTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm80/k;", "it", "Lkotlin/G0;", "accept", "(Lm80/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.analytics.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33516b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33517c f232193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0 f232194c;

    public C33516b(C33517c c33517c, C0 c02) {
        this.f232193b = c33517c;
        this.f232194c = c02;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Long lZ02;
        m80.k kVar = (m80.k) obj;
        boolean z12 = kVar instanceof C43924a;
        C33517c c33517c = this.f232193b;
        if (z12) {
            C43924a c43924a = (C43924a) kVar;
            c33517c.f232195a.c(new C13286t(c33517c.f232196b, c43924a.f414336a, c43924a.f414337b, c43924a.f414338c, c43924a.f414339d, c43924a.f414340e));
            return;
        }
        if (kVar instanceof m80.h) {
            c33517c.f232195a.c(new G0(c33517c.f232196b));
            return;
        }
        if (kVar instanceof m80.b) {
            c33517c.f232195a.c(new C13271k0(c33517c.f232196b));
            return;
        }
        boolean z13 = kVar instanceof m80.i;
        C0 c02 = this.f232194c;
        if (z13) {
            c33517c.f232195a.c(new H0(c33517c.f232196b, P0.k(c33517c.e(c02.f231861Y.getNavigation()), C33517c.d(((m80.i) kVar).f414349a))));
            return;
        }
        if (kVar instanceof m80.g) {
            c33517c.f232195a.c(new C13275m0(c33517c.f232196b, c33517c.e(c02.f231861Y.getNavigation())));
            return;
        }
        if (kVar instanceof m80.f) {
            c33517c.f232195a.c(new C13273l0(c33517c.f232196b, P0.k(c33517c.e(c02.f231861Y.getNavigation()), C33517c.d(((m80.f) kVar).f414346a))));
            return;
        }
        if (!(kVar instanceof m80.d)) {
            if (kVar instanceof m80.e) {
                c33517c.f232195a.c(new C49232b(c33517c.f232196b.b(), ((m80.e) kVar).f414345a));
                return;
            } else if (kVar instanceof m80.c) {
                c33517c.f232195a.c(new FM.a(c33517c.f232196b.b(), ((m80.c) kVar).f414342a));
                return;
            } else {
                if (kVar instanceof m80.j) {
                    c33517c.f232195a.c(new FM.d(c33517c.f232196b.b(), ((m80.j) kVar).f414350a));
                    return;
                }
                return;
            }
        }
        m80.d dVar = (m80.d) kVar;
        Map<String, Object> mapE = c33517c.e(c02.f231861Y.getNavigation());
        String str = dVar.f414343a;
        LinkedHashMap linkedHashMapK = P0.k(mapE, C33517c.d(str));
        C50213a c50213a = c33517c.f232196b;
        Cd0.I i12 = new Cd0.I(c50213a, linkedHashMapK);
        InterfaceC28373a interfaceC28373a = c33517c.f232195a;
        interfaceC28373a.c(i12);
        ArrayList arrayList = dVar.f414344b;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        interfaceC28373a.c(new FM.b((str == null || (lZ02 = C43066x.z0(str)) == null) ? -1L : lZ02.longValue(), c50213a.b(), arrayList));
    }
}

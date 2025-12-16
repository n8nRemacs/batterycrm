package t90;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28418h0;
import com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import u90.C48869a;
import u90.g;
import u90.h;
import u90.l;
import yd0.C50229c;

/* compiled from: ProfileProAnalyticsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lt90/b;", "Lt90/a;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements InterfaceC48524a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f439176a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f439176a = interfaceC28373a;
    }

    @Override // t90.InterfaceC48524a
    public final void a(@k String str) {
        this.f439176a.c(new yd0.d(str));
    }

    @Override // t90.InterfaceC48524a
    public final void b() {
        this.f439176a.c(new h());
    }

    @Override // t90.InterfaceC48524a
    public final void c(@k com.avito.android.profile.pro.impl.screen.item.group.row.a aVar) {
        String f223298i = aVar.getF223298i();
        String f223299j = aVar.getF223299j();
        List<String> listL = aVar.L();
        if (listL.isEmpty()) {
            listL = null;
        }
        this.f439176a.c(new g(f223298i, f223299j, listL));
    }

    @Override // t90.InterfaceC48524a
    public final void d(@k String str) {
        this.f439176a.c(new C50229c(str));
    }

    @Override // t90.InterfaceC48524a
    public final void e(@k String str) {
        this.f439176a.c(new C48869a(Integer.parseInt(str)));
    }

    @Override // t90.InterfaceC48524a
    public final void f(@k String str) {
        this.f439176a.c(new Uc.h(str, null, null, null, null, 30, null));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // t90.InterfaceC48524a
    public final void g(@k ProfileProWidgetsParams profileProWidgetsParams) {
        this.f439176a.c(new u90.b(profileProWidgetsParams.f222679g, profileProWidgetsParams.f222675c, profileProWidgetsParams.f222676d, profileProWidgetsParams.f222677e));
    }

    @Override // t90.InterfaceC48524a
    public final void h() {
        this.f439176a.c(new l());
    }

    @Override // t90.InterfaceC48524a
    public final void i() {
        this.f439176a.c(new C28418h0(null, 1, null));
    }
}

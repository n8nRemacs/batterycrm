package com.avito.android.str_seller_orders.orders_seller;

import EN0.a;
import GX0.a;
import TI0.a;
import VO0.a;
import ZO0.b;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.Lifecycle;
import bB0.InterfaceC25488a;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.tariff.cpa.info.CpaInfoFragment;
import com.avito.android.tariff.cpx.info.TariffCpxInfoFragment;
import com.avito.android.tariff_cpt.info.CptInfoV2Fragment;
import com.avito.android.user_adverts.root_screen.adverts_host.b0;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.a;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.j;
import com.avito.android.user_adverts_views.advert_item.p;
import com.avito.android.user_favorites.K;
import com.avito.android.user_favorites.L;
import com.avito.android.user_viewed.screen.ui.UserViewedFragment;
import com.avito.android.virtual_deal_room.base.ClientRoomChildFragmentResult;
import com.avito.android.virtual_deal_room.client_room.ClientRoomFragment;
import com.avito.android.work_profile.profile.about_me.ui.AboutMeFragment;
import com.avito.avcalls.call.J;
import com.google.android.exoplayer2.extractor.AbstractC36511a;
import com.google.android.exoplayer2.extractor.r;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.video.k;
import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.base.InterfaceC37276u;
import com.google.common.graph.D0;
import com.google.common.graph.E;
import com.google.common.graph.InterfaceC37462d0;
import com.google.firebase.crashlytics.internal.common.I;
import com.google.firebase.crashlytics.internal.common.Z;
import com.huawei.hms.adapter.internal.AvailableCode;
import hQ0.InterfaceC40866a;
import iR.C41336a;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.C;
import java.io.File;
import java.util.Iterator;
import java.util.Objects;
import lK0.InterfaceC43650a;
import mQ0.AbstractC44002a;
import tz0.InterfaceC48745a;
import wB0.InterfaceC49481a;
import wZ0.InterfaceC49583a;
import yC0.InterfaceC50099a;
import yq0.InterfaceC50281a;
import zI0.InterfaceC50474d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements SwipeRefreshLayout.f, Toolbar.h, JV.b, C, androidx.fragment.app.C, J.a, a.InterfaceC0354a, AbstractC36511a.d, InterfaceC37276u, k.b.a, androidx.core.view.accessibility.i, InterfaceC49583a.InterfaceC12820a, InterfaceC37020c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f289246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f289247c;

    public /* synthetic */ d(Object obj, int i12) {
        this.f289246b = i12;
        this.f289247c = obj;
    }

    @Override // com.google.android.exoplayer2.extractor.AbstractC36511a.d
    public long a(long j12) {
        return U.l((j12 * r0.f344979e) / 1000000, 0L, ((r) this.f289247c).f344984j - 1);
    }

    @Override // com.google.common.base.InterfaceC37276u
    public Object apply(Object obj) {
        switch (this.f289246b) {
            case 23:
                com.google.android.exoplayer2.extractor.mp4.k kVar = (com.google.android.exoplayer2.extractor.mp4.k) obj;
                ((com.google.android.exoplayer2.extractor.mp4.e) this.f289247c).getClass();
                return kVar;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((InterfaceC37462d0) this.f289247c).l(obj);
            default:
                E e12 = (E) obj;
                Object objF = ((D0) this.f289247c).f(e12.f360173b, e12.f360174c);
                Objects.requireNonNull(objF);
                return objF;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v3, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // JV.b
    public void b(State state) {
        ?? r32;
        int i12 = p.f316523F0;
        int iOrdinal = state.ordinal();
        p pVar = (p) this.f289247c;
        if (iOrdinal != 0) {
            if (iOrdinal == 1 && (r32 = pVar.f316605z0) != 0) {
                r32.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        ?? r33 = pVar.f316605z0;
        if (r33 != 0) {
            r33.invoke(Boolean.TRUE);
        }
    }

    @Override // androidx.core.view.accessibility.i
    public boolean c(View view) {
        int i12 = com.google.android.material.bottomsheet.i.f356059f;
        com.google.android.material.bottomsheet.i iVar = (com.google.android.material.bottomsheet.i) this.f289247c;
        if (!iVar.f356062d) {
            return false;
        }
        BottomSheetBehavior<?> bottomSheetBehavior = iVar.f356060b;
        boolean z12 = bottomSheetBehavior.f355992b;
        int i13 = bottomSheetBehavior.f355975L;
        int i14 = 6;
        int i15 = 3;
        if (i13 == 4) {
            if (z12) {
                i14 = i15;
            }
        } else if (i13 != 3) {
            if (!iVar.f356063e) {
                i15 = 4;
            }
            i14 = i15;
        } else if (z12) {
            i14 = 4;
        }
        bottomSheetBehavior.b(i14);
        return true;
    }

    @Override // wZ0.InterfaceC49583a.InterfaceC12820a
    public void d(wZ0.b bVar) {
        com.google.firebase.crashlytics.internal.e eVar = com.google.firebase.crashlytics.internal.b.f360871c;
        com.google.firebase.crashlytics.internal.b bVar2 = (com.google.firebase.crashlytics.internal.b) this.f289247c;
        bVar2.getClass();
        com.google.firebase.crashlytics.internal.d.f361031a.a(3);
        bVar2.f360873b.set((com.google.firebase.crashlytics.internal.a) bVar.get());
    }

    public void e(Display display) {
        k kVar = (k) this.f289247c;
        if (display == null) {
            kVar.f348296k = -9223372036854775807L;
            kVar.f348297l = -9223372036854775807L;
        } else {
            kVar.getClass();
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            kVar.f348296k = refreshRate;
            kVar.f348297l = (refreshRate * 80) / 100;
        }
    }

    @Override // GX0.a.InterfaceC0354a
    public Object execute() {
        switch (this.f289246b) {
            case 18:
                return ((com.google.android.datatransport.runtime.scheduling.persistence.c) this.f289247c).c();
            case 19:
                return Integer.valueOf(((com.google.android.datatransport.runtime.scheduling.persistence.d) this.f289247c).s());
            case 20:
                ((com.google.android.datatransport.runtime.scheduling.jobscheduling.i) this.f289247c).f343212i.a();
                return null;
            default:
                com.google.android.datatransport.runtime.scheduling.jobscheduling.k kVar = (com.google.android.datatransport.runtime.scheduling.jobscheduling.k) this.f289247c;
                Iterator<com.google.android.datatransport.runtime.r> it = kVar.f343223b.T4().iterator();
                while (it.hasNext()) {
                    kVar.f343224c.b(it.next(), 1);
                }
                return null;
        }
    }

    @Override // io.reactivex.rxjava3.core.C
    public void f(B b12) {
        switch (this.f289246b) {
            case 8:
                K k12 = new K(b12);
                L l12 = (L) this.f289247c;
                l12.f316792d.a(k12);
                b12.f(new com.avito.android.app.work.a(5, l12, k12));
                break;
            default:
                M11.d dVar = new M11.d(b12, 5);
                Lifecycle lifecycle = (Lifecycle) this.f289247c;
                lifecycle.a(dVar);
                b12.f(new com.avito.android.app.work.a(7, lifecycle, dVar));
                break;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void j0() {
        Object obj = this.f289247c;
        switch (this.f289246b) {
            case 0:
                ((e) obj).f289363a.invoke(InterfaceC48745a.i.f439707a);
                break;
            case 1:
                CpaInfoFragment.a aVar = CpaInfoFragment.f294596A0;
                ((CpaInfoFragment) obj).q5(InterfaceC25488a.e.f56984a);
                break;
            case 2:
                TariffCpxInfoFragment.a aVar2 = TariffCpxInfoFragment.f296232A0;
                ((TariffCpxInfoFragment) obj).r5().accept(InterfaceC49481a.f.f441317a);
                break;
            case 3:
                CptInfoV2Fragment.a aVar3 = CptInfoV2Fragment.f298114A0;
                ((CptInfoV2Fragment) obj).q5().accept(InterfaceC50099a.h.f442973a);
                break;
            case 4:
            case 7:
            case 8:
            case 10:
            case 11:
            default:
                ((com.avito.android.work_profile.profile.gig.ui.b) obj).f331168b.invoke();
                break;
            case 5:
                b0 b0Var = (b0) obj;
                b0Var.f312380f.accept(a.e.f15534a);
                InterfaceC50474d interfaceC50474d = b0Var.f312378d;
                interfaceC50474d.p0();
                InterfaceC50474d.a.a(interfaceC50474d, false, false, null, null, false, null, 1523);
                b0Var.f312379e.accept(InterfaceC50281a.f.f443510a);
                break;
            case 6:
                ((j) obj).f313038t.d(a.d.f313003a);
                break;
            case 9:
                UserViewedFragment.a aVar4 = UserViewedFragment.f318464B0;
                ((com.avito.android.user_viewed.screen.ui.e) ((UserViewedFragment) obj).f318467u0.getValue()).accept(InterfaceC43650a.d.f413720a);
                break;
            case 12:
                ((com.avito.android.wallet.page.history.mvi.d) obj).f328056a.invoke(a.d.f17107a);
                break;
            case 13:
                ((com.avito.android.wallet.page.mvi.g) obj).f328215c.invoke(b.d.f20121a);
                break;
            case 14:
                AboutMeFragment.a aVar5 = AboutMeFragment.f330814x0;
                ((AboutMeFragment) obj).t5().accept(new InterfaceC40866a.b(false));
                break;
            case 15:
                ((com.avito.android.work_profile.profile.cvs.ui.c) obj).f331090c.invoke(AbstractC44002a.d.f414500a);
                break;
        }
    }

    @Override // androidx.fragment.app.C
    public void k(Bundle bundle, String str) {
        ClientRoomFragment.a aVar = ClientRoomFragment.f326248u0;
        if (str.equals("ClientRoomChildFragmentResult")) {
            ClientRoomChildFragmentResult clientRoomChildFragmentResult = (ClientRoomChildFragmentResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("ClientRoomChildFragmentResultData", ClientRoomChildFragmentResult.class) : bundle.getParcelable("ClientRoomChildFragmentResultData"));
            if (clientRoomChildFragmentResult == null || !clientRoomChildFragmentResult.f326099b) {
                return;
            }
            ((ClientRoomFragment) this.f289247c).q5().accept(a.b.f3946a);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        C41336a.C11375a.a();
        return ((Toolbar.h) this.f289247c).onMenuItemClick(menuItem);
    }

    @Override // com.google.android.gms.tasks.InterfaceC37020c
    public Object then(Task task) {
        boolean z12;
        ((Z) this.f289247c).getClass();
        boolean zR2 = task.r();
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        if (zR2) {
            I i12 = (I) task.n();
            i12.getClass();
            dVar.a(3);
            File fileB = i12.b();
            if (fileB.delete()) {
                fileB.getPath();
                dVar.a(3);
            } else {
                fileB.getPath();
                dVar.a(5);
            }
            z12 = true;
        } else {
            task.m();
            dVar.a(5);
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}

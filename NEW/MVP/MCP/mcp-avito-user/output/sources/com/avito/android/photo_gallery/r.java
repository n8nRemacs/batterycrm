package com.avito.android.photo_gallery;

import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.V0;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.C29640d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.photo_gallery.LegacyPhotoGalleryActivity;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.player.player_fragment.PlayerFragmentAction;
import com.avito.android.ui.SafeViewPager;
import com.avito.android.util.D6;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.C43259k;

/* compiled from: LegacyPhotoGalleryActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/r;", "Landroidx/viewpager/widget/ViewPager$l;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r extends ViewPager.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LegacyPhotoGalleryActivity f217576b;

    public r(LegacyPhotoGalleryActivity legacyPhotoGalleryActivity) {
        this.f217576b = legacyPhotoGalleryActivity;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
        int iIntValue;
        TreeClickStreamParent treeClickStreamParent;
        String str;
        String str2;
        int i13;
        P p12;
        PlayerFragmentAction playerFragmentAction = PlayerFragmentAction.f220209b;
        LegacyPhotoGalleryActivity.a aVar = LegacyPhotoGalleryActivity.f216531m0;
        LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = this.f217576b;
        legacyPhotoGalleryActivity.k2(playerFragmentAction);
        legacyPhotoGalleryActivity.f216566i0 = i12;
        P p13 = legacyPhotoGalleryActivity.f216568k0;
        if (p13 != null) {
            p13.f216642u = i12;
            if (p13.f216647z == null) {
                p13.f216647z = Integer.valueOf(i12);
            }
        }
        InterfaceC42726C interfaceC42726C = legacyPhotoGalleryActivity.f216565h0;
        if (!((Boolean) interfaceC42726C.getValue()).booleanValue() || (p12 = legacyPhotoGalleryActivity.f216568k0) == null) {
            iIntValue = i12;
        } else if (p12.f216646y && !p12.f216645x) {
            iIntValue = p12.f216641t;
        } else if (p12.f216643v) {
            Integer num = (Integer) C42745f0.K(p12.f216642u - 1, p12.f216637p);
            iIntValue = num != null ? num.intValue() : p12.f216642u;
        } else {
            iIntValue = p12.f216642u;
        }
        legacyPhotoGalleryActivity.getIntent().putExtra("image_position", iIntValue);
        P p14 = legacyPhotoGalleryActivity.f216568k0;
        if (p14 != null && p14.f216643v && ((i13 = p14.f216642u) == 0 || i13 == C42745f0.J(p14.f216640s))) {
            p14.f216643v = false;
            p14.f216646y = false;
            SafeViewPager safeViewPager = p14.f216628g;
            safeViewPager.setPagingEnabled(false);
            p14.f216644w = true;
            com.avito.android.photo_gallery.ui.g gVar = p14.f216629h;
            if (gVar != null) {
                gVar.a(p14.f216641t, Integer.valueOf(p14.f216627f.size()));
            }
            ((C33206t) p14.f216634m).invoke();
            D6.w(p14.f216625d);
            M m12 = new M(p14);
            InterfaceC22983P interfaceC22983PA = V0.a(safeViewPager);
            if (interfaceC22983PA != null) {
                C43259k.d(C22981N.a(interfaceC22983PA.getLifecycle()), null, null, new Q(m12, null), 3);
            }
            if (p14.f216642u != p14.f216641t) {
                return;
            }
        }
        P p15 = legacyPhotoGalleryActivity.f216568k0;
        if (p15 != null) {
            p15.g(i12);
        }
        P p16 = legacyPhotoGalleryActivity.f216568k0;
        if (p16 != null) {
            p16.h();
        }
        P p17 = legacyPhotoGalleryActivity.f216568k0;
        if (p17 != null) {
            p17.f216645x = true;
        }
        if (((Boolean) interfaceC42726C.getValue()).booleanValue()) {
            P p18 = legacyPhotoGalleryActivity.f216568k0;
            if (p18 != null) {
                boolean z12 = p18.f216643v;
                com.avito.android.photo_gallery.ui.g gVar2 = p18.f216629h;
                if (z12) {
                    if (gVar2 != null) {
                        gVar2.a(p18.f216642u - 1, Integer.valueOf(p18.f216638q.size()));
                    }
                } else if (gVar2 != null) {
                    gVar2.a(p18.f216642u, Integer.valueOf(p18.f216627f.size()));
                }
            }
        } else {
            com.avito.android.photo_gallery.ui.g gVar3 = legacyPhotoGalleryActivity.f216574q;
            if (gVar3 != null) {
                gVar3.a(legacyPhotoGalleryActivity.f216566i0, Integer.valueOf(legacyPhotoGalleryActivity.f216554W.size()));
            }
        }
        legacyPhotoGalleryActivity.g2();
        boolean z13 = legacyPhotoGalleryActivity.b2() instanceof q.b;
        com.avito.android.advert_core.contactbar.A a12 = legacyPhotoGalleryActivity.f216553V;
        if (a12 != null) {
            a12.b(z13);
        }
        legacyPhotoGalleryActivity.a2(z13, true);
        legacyPhotoGalleryActivity.k2(PlayerFragmentAction.f220210c);
        if (legacyPhotoGalleryActivity.f216561d0 && i12 > C42745f0.J(legacyPhotoGalleryActivity.f216554W) - 2) {
            boolean z14 = C42745f0.J(legacyPhotoGalleryActivity.f216554W) == i12;
            if (z14) {
                com.avito.android.advert_core.contactbar.A a13 = legacyPhotoGalleryActivity.f216553V;
                if (a13 != null) {
                    a13.W6(true, (4 & 2) == 0, false);
                }
                legacyPhotoGalleryActivity.a2(true, false);
                legacyPhotoGalleryActivity.h2(false);
                legacyPhotoGalleryActivity.f216557Z = true;
            } else if (legacyPhotoGalleryActivity.f216557Z) {
                com.avito.android.advert_core.contactbar.A a14 = legacyPhotoGalleryActivity.f216553V;
                if (a14 != null) {
                    a14.W6(false, (4 & 2) == 0, false);
                }
                legacyPhotoGalleryActivity.a2(false, false);
            } else {
                com.avito.android.advert_core.contactbar.A a15 = legacyPhotoGalleryActivity.f216553V;
                if (a15 != null) {
                    a15.W6(true, (4 & 2) == 0, false);
                }
                legacyPhotoGalleryActivity.a2(true, false);
            }
            legacyPhotoGalleryActivity.f216560c0 = z14;
        }
        for (InterfaceC23487e interfaceC23487e : legacyPhotoGalleryActivity.getSupportFragmentManager().P()) {
            if (interfaceC23487e instanceof T) {
                ((T) interfaceC23487e).l0();
            }
        }
        C29640d c29640d = legacyPhotoGalleryActivity.f216532A;
        if (c29640d == null) {
            c29640d = null;
        }
        if (!c29640d.v().invoke().booleanValue() || (treeClickStreamParent = legacyPhotoGalleryActivity.f216548Q) == null || (str = legacyPhotoGalleryActivity.f216546O) == null || (str2 = legacyPhotoGalleryActivity.f216547P) == null) {
            return;
        }
        InterfaceC28373a interfaceC28373a = legacyPhotoGalleryActivity.f216533B;
        (interfaceC28373a != null ? interfaceC28373a : null).c(new P70.b(treeClickStreamParent, str, str2));
    }
}

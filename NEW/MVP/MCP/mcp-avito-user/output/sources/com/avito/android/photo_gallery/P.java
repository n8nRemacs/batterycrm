package com.avito.android.photo_gallery;

import LV.c;
import VU.b;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.ui.SafeViewPager;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: RealtyLayoutsDelegate.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/P;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class P {

    /* renamed from: A, reason: collision with root package name */
    public boolean f216618A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public ArrayList f216619B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final ArrayList f216620C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final ArrayList f216621D;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f216622a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f216623b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f216624c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f216625d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.photo_gallery.adapter.a f216626e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f216627f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SafeViewPager f216628g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.photo_gallery.ui.g f216629h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Button f216630i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Y41.l<List<? extends com.avito.android.photo_gallery.adapter.q>, com.avito.android.photo_gallery.adapter.a> f216631j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f216632k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f216633l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f216634m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Button f216635n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f216636o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ArrayList f216637p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ArrayList f216638q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C43238h f216639r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public Object f216640s;

    /* renamed from: t, reason: collision with root package name */
    public int f216641t;

    /* renamed from: u, reason: collision with root package name */
    public int f216642u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f216643v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f216644w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f216645x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f216646y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public Integer f216647z;

    public P(@Y61.k InterfaceC28265d interfaceC28265d, @Y61.l String str, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Button button, @Y61.l com.avito.android.photo_gallery.adapter.a aVar, @Y61.k List list, @Y61.k SafeViewPager safeViewPager, @Y61.l com.avito.android.photo_gallery.ui.g gVar, @Y61.k Button button2, @Y61.k Y41.l lVar, boolean z12, boolean z13, @Y61.k Y41.a aVar2, @Y61.k Button button3, boolean z14, @Y61.k R0 r02) {
        this.f216622a = interfaceC28265d;
        this.f216623b = str;
        this.f216624c = interfaceC28373a;
        this.f216625d = button;
        this.f216626e = aVar;
        this.f216627f = list;
        this.f216628g = safeViewPager;
        this.f216629h = gVar;
        this.f216630i = button2;
        this.f216631j = lVar;
        this.f216632k = z12;
        this.f216633l = z13;
        this.f216634m = aVar2;
        this.f216635n = button3;
        this.f216636o = z14;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            if (((com.avito.android.photo_gallery.adapter.q) obj) instanceof q.e) {
                this.f216637p.add(Integer.valueOf(i12));
                arrayList.add(obj);
            }
            i12 = i13;
        }
        this.f216638q = arrayList;
        this.f216639r = U.a(r02.b());
        this.f216640s = C42784z0.f406748b;
        this.f216619B = new ArrayList();
        this.f216620C = new ArrayList();
        this.f216621D = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Y61.k
    public final com.avito.android.photo_gallery.adapter.q a() {
        boolean z12 = this.f216643v;
        ?? r12 = this.f216627f;
        com.avito.android.photo_gallery.adapter.q qVar = z12 ? (com.avito.android.photo_gallery.adapter.q) C42745f0.K(this.f216642u, this.f216640s) : (com.avito.android.photo_gallery.adapter.q) C42745f0.K(this.f216642u, r12);
        return qVar == null ? (com.avito.android.photo_gallery.adapter.q) r12.get(0) : qVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final com.avito.android.photo_gallery.adapter.a b(int i12) {
        com.avito.android.photo_gallery.adapter.q qVar = (com.avito.android.photo_gallery.adapter.q) C42745f0.K(i12, this.f216627f);
        ArrayList arrayList = new ArrayList();
        if (qVar != null) {
            arrayList.add(qVar);
        }
        arrayList.addAll(this.f216638q);
        if (qVar != null) {
            arrayList.add(qVar);
        }
        this.f216640s = arrayList;
        return (com.avito.android.photo_gallery.adapter.a) ((u) this.f216631j).invoke(arrayList);
    }

    public final void c() {
        if (this.f216644w) {
            return;
        }
        boolean z12 = this.f216643v;
        Button button = this.f216625d;
        SafeViewPager safeViewPager = this.f216628g;
        if (z12) {
            this.f216643v = false;
            safeViewPager.setAdapter(this.f216626e);
            safeViewPager.x(this.f216641t, false);
            D6.w(button);
            this.f216646y = false;
            return;
        }
        String str = this.f216623b;
        if (str != null) {
            this.f216624c.c(new R8.a(str));
        }
        this.f216643v = true;
        this.f216641t = safeViewPager.getCurrentItem();
        safeViewPager.setAdapter(b(this.f216642u));
        safeViewPager.x(1, false);
        if (this.f216646y) {
            return;
        }
        D6.H(button);
    }

    public final void d() {
        ArrayList arrayList = this.f216621D;
        if (arrayList.contains(Integer.valueOf(this.f216642u))) {
            return;
        }
        this.f216624c.c(new P8.a(String.valueOf(this.f216623b)));
        arrayList.add(Integer.valueOf(this.f216642u));
    }

    public final void e(boolean z12) {
        Button button = this.f216635n;
        if (z12) {
            b.a aVar = VU.b.f17147t;
            Context context = button.getContext();
            aVar.getClass();
            button.setStyle((VU.b) c.a.a(aVar, context, R.attr.buttonSecondaryMedium));
        } else {
            b.a aVar2 = VU.b.f17147t;
            Context context2 = button.getContext();
            aVar2.getClass();
            button.setStyle((VU.b) c.a.a(aVar2, context2, R.attr.buttonPrimaryMedium));
        }
        this.f216618A = z12;
    }

    public final void f(boolean z12) {
        GalleryFragment galleryFragment;
        com.avito.android.photo_gallery.adapter.a aVar = this.f216626e;
        if (z12) {
            if (aVar != null) {
                int i12 = this.f216642u;
                Fragment fragment = aVar.f216685A.get(i12);
                galleryFragment = fragment instanceof GalleryFragment ? (GalleryFragment) fragment : null;
                if (galleryFragment == null) {
                    aVar.f216686B = Integer.valueOf(i12);
                } else if (galleryFragment.f216489I0 != null) {
                    D6.w(galleryFragment.f216502n0);
                    D6.H(galleryFragment.f216489I0);
                }
            }
        } else if (aVar != null) {
            Fragment fragment2 = aVar.f216685A.get(this.f216642u);
            galleryFragment = fragment2 instanceof GalleryFragment ? (GalleryFragment) fragment2 : null;
            if (galleryFragment != null) {
                D6.H(galleryFragment.f216502n0);
                D6.w(galleryFragment.f216489I0);
            }
        }
        e(z12);
    }

    public final void g(int i12) {
        Integer num = this.f216647z;
        if (num != null) {
            int iIntValue = num.intValue();
            com.avito.android.photo_gallery.adapter.a aVar = this.f216626e;
            if (aVar != null) {
                Fragment fragment = aVar.f216685A.get(iIntValue);
                GalleryFragment galleryFragment = fragment instanceof GalleryFragment ? (GalleryFragment) fragment : null;
                if (galleryFragment != null) {
                    D6.H(galleryFragment.f216502n0);
                    D6.w(galleryFragment.f216489I0);
                }
            }
        }
        Button button = this.f216635n;
        Context context = button.getContext();
        button.setState(new UU.a(context.getString(R.string.photo_gallery_ai_design_button_title), null, false, false, false, null, C35835l0.m(context, R.attr.ic_ai16, R.attr.black), null, null, false, 958, null));
        e(false);
        if (this.f216619B.contains(Integer.valueOf(i12))) {
            d();
            D6.H(button);
        } else {
            D6.w(button);
        }
        this.f216647z = Integer.valueOf(i12);
    }

    public final void h() {
        Button button = this.f216630i;
        Context context = button.getContext();
        D6.w(button);
        Button button2 = this.f216625d;
        D6.w(button2);
        button.setState(new UU.a(null, null, false, false, false, null, C35835l0.m(context, R.attr.ic_apartmentBold16, R.attr.black), null, null, false, 959, null));
        button2.setState(new UU.a(null, null, false, false, false, null, C35835l0.m(context, R.attr.ic_close24, R.attr.white), null, null, false, 959, null));
        if (this.f216646y) {
            return;
        }
        com.avito.android.photo_gallery.adapter.q qVarA = a();
        boolean z12 = qVarA instanceof q.e;
        Button button3 = this.f216635n;
        if (z12 && this.f216643v) {
            D6.H(button2);
            D6.w(button3);
        } else if (z12) {
            D6.w(button3);
        } else if (this.f216636o) {
            if ((qVarA instanceof q.c) || (qVarA instanceof q.a)) {
                D6.H(button);
            }
        }
    }
}

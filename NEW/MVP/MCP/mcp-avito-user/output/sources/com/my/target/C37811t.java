package com.my.target;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.my.target.C0;
import com.my.target.C0.a;
import com.my.target.C37796l;
import com.my.target.C37798m;
import com.my.target.C37802o;
import com.my.target.H;
import com.my.target.M0;
import com.my.target.S0;
import com.my.target.nativeads.d;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import e11.C39874i;
import e11.C39876i1;
import e11.C39911u1;
import e11.C39913v0;
import e11.C39922y0;
import e11.InterfaceC39918x;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37811t implements C37798m.a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f365140b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final e11.Z0 f365141c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final e11.Q0 f365142d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final C37803o0 f365143e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final S0.a f365144f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final C37809s f365145g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final C0 f365146h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f365148j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f365149k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f365151m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public C37796l f365152n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public Parcelable f365153o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    public C39876i1 f365154p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public a f365155q;

    /* renamed from: i, reason: collision with root package name */
    public int f365147i = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f365150l = true;

    /* renamed from: com.my.target.t$a */
    public static final class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final C39911u1 f365156b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        public final S0.a f365157c;

        public a(@j.N C39911u1 c39911u1, @j.N S0.a aVar) {
            this.f365156b = c39911u1;
            this.f365157c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            M0 m02 = new M0(this.f365156b);
            m02.f364467f = this.f365157c;
            V v12 = new V(m02, view.getContext());
            m02.f364465d = new WeakReference<>(v12);
            try {
                v12.show();
            } catch (Throwable th2) {
                th2.printStackTrace();
                m02.q();
            }
        }
    }

    /* renamed from: com.my.target.t$b */
    public interface b extends C37796l.b, H.a, View.OnClickListener, M0.a, C37802o.a {
    }

    public C37811t(@j.N e11.Q0 q02, @j.N S0.a aVar, @j.N e11.Z0 z02, @j.P h11.d dVar) {
        this.f365144f = aVar;
        this.f365142d = q02;
        this.f365140b = q02.d().size() > 0;
        this.f365141c = z02;
        C37788h c37788h = q02.f394698D;
        C0 c02 = new C0(c37788h, dVar, aVar);
        if (c37788h != null) {
            c02.f364356g = c02.new a();
        }
        this.f365146h = c02;
        C39913v0<com.my.target.common.models.e> c39913v0 = q02.f394464I;
        this.f365148j = (c39913v0 == null || c39913v0.f394856J == 0) ? false : true;
        this.f365143e = new C37803o0(q02.f394703b, q02.f394702a, c39913v0 == null);
        this.f365145g = new C37809s(this);
    }

    @Override // com.my.target.C37798m.a
    public final void a(@j.N Context context) {
        S0.a aVar = this.f365144f;
        com.my.target.nativeads.d dVar = aVar.f364597c;
        d.b bVar = dVar.f365006j;
        S0 s02 = aVar.f364596b;
        if (bVar == null) {
            s02.b(context);
        } else if (!bVar.k()) {
            bVar.l(dVar);
        } else {
            s02.b(context);
            bVar.m(dVar);
        }
    }

    public final void b(@j.N MediaAdView mediaAdView, @j.P com.my.target.common.models.b bVar) {
        if (bVar == null) {
            mediaAdView.b(0, 0);
            return;
        }
        int i12 = bVar.f394305b;
        int i13 = bVar.f394306c;
        if (!this.f365149k && i12 > 0 && i13 > 0) {
            mediaAdView.b(i12, i13);
        } else {
            mediaAdView.b(16, 9);
            this.f365149k = true;
        }
    }

    public final void c(boolean z12) {
        C37796l c37796l = this.f365152n;
        if (c37796l == null) {
            return;
        }
        if (!z12) {
            c37796l.t();
            return;
        }
        MediaAdView mediaAdViewS = c37796l.s();
        if (mediaAdViewS != null) {
            if (mediaAdViewS.getWindowVisibility() != 0) {
                if (c37796l.f364909r == 1) {
                    P0 p02 = c37796l.f364903l;
                    if (p02 != null) {
                        c37796l.f364914w = p02.q();
                    }
                    c37796l.r();
                    c37796l.f364909r = 4;
                    c37796l.f364904m = false;
                    c37796l.g();
                    return;
                }
            } else {
                if (c37796l.f364904m) {
                    return;
                }
                WeakReference<Context> weakReference = c37796l.f364912u;
                Context context = weakReference != null ? weakReference.get() : null;
                if (context != null) {
                    c37796l.b(mediaAdViewS, context);
                }
                c37796l.f364904m = true;
                U0 u02 = mediaAdViewS.getChildAt(1) instanceof U0 ? (U0) mediaAdViewS.getChildAt(1) : null;
                if (u02 != null) {
                    P0 p03 = c37796l.f364903l;
                    if (p03 != null && !c37796l.f364910s.equals(p03.n())) {
                        c37796l.r();
                    }
                    if (!c37796l.f364905n) {
                        if (!c37796l.f364915x) {
                            mediaAdViewS.getPlayButtonView().setVisibility(0);
                        }
                        mediaAdViewS.getProgressBarView().setVisibility(8);
                    }
                    if (!c37796l.f364905n || c37796l.f364906o) {
                        return;
                    }
                    P0 p04 = c37796l.f364903l;
                    if (p04 == null || !p04.i()) {
                        c37796l.c(u02, true);
                    } else {
                        c37796l.f364903l.b(u02);
                        com.my.target.common.models.e eVar = c37796l.f364895d;
                        u02.b(eVar.f394305b, eVar.f394306c);
                        c37796l.f364903l.a(c37796l);
                        c37796l.f364903l.a();
                    }
                    c37796l.e(true);
                    return;
                }
            }
        }
        c37796l.r();
    }

    @j.P
    public final InterfaceC39918x d(@j.N MediaAdView mediaAdView) {
        if (!this.f365140b) {
            return null;
        }
        for (int i12 = 0; i12 < mediaAdView.getChildCount(); i12++) {
            KeyEvent.Callback childAt = mediaAdView.getChildAt(i12);
            if (childAt instanceof H) {
                return (InterfaceC39918x) childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        C39874i c39874i;
        C37803o0 c37803o0 = this.f365143e;
        c37803o0.f();
        c37803o0.f365051i = null;
        C37796l c37796l = this.f365152n;
        if (c37796l != null) {
            c37796l.w();
        }
        C39876i1 c39876i1 = this.f365154p;
        if (c39876i1 == null) {
            return;
        }
        IconAdView iconAdViewE = c39876i1.e();
        e11.Q0 q02 = this.f365142d;
        if (iconAdViewE != null) {
            iconAdViewE.setOnClickListener(null);
            ImageView imageView = iconAdViewE.getImageView();
            imageView.setImageBitmap(null);
            if (imageView instanceof C39922y0) {
                C39922y0 c39922y0 = (C39922y0) imageView;
                c39922y0.f394908e = 0;
                c39922y0.f394907d = 0;
            }
            com.my.target.common.models.b bVar = q02.f394717p;
            if (bVar != null) {
                C37802o.b(bVar, imageView);
            }
        }
        MediaAdView mediaAdViewF = this.f365154p.f();
        if (mediaAdViewF != null) {
            com.my.target.common.models.b bVar2 = q02.f394716o;
            C39922y0 c39922y02 = (C39922y0) mediaAdViewF.getImageView();
            if (bVar2 != null) {
                C37802o.b(bVar2, c39922y02);
            }
            c39922y02.setImageData(null);
            mediaAdViewF.getProgressBarView().setVisibility(8);
            mediaAdViewF.getPlayButtonView().setVisibility(8);
            mediaAdViewF.b(0, 0);
            mediaAdViewF.setOnClickListener(null);
            mediaAdViewF.setBackgroundColor(-1118482);
            InterfaceC39918x interfaceC39918xD = d(mediaAdViewF);
            if (interfaceC39918xD != 0) {
                this.f365153o = interfaceC39918xD.getState();
                interfaceC39918xD.dispose();
                ((View) interfaceC39918xD).setVisibility(8);
            }
            int childCount = mediaAdViewF.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    c39874i = null;
                    break;
                }
                View childAt = mediaAdViewF.getChildAt(i12);
                if (childAt instanceof C39874i) {
                    c39874i = (C39874i) childAt;
                    break;
                }
                i12++;
            }
            if (c39874i != null) {
                mediaAdViewF.removeView(c39874i);
            }
        }
        WeakReference<H> weakReference = this.f365154p.f394617f;
        H h12 = weakReference != null ? weakReference.get() : null;
        if (h12 != null) {
            h12.setPromoCardSliderListener(null);
            this.f365153o = h12.getState();
            h12.dispose();
        }
        ViewGroup viewGroupH = this.f365154p.h();
        if (viewGroupH != null) {
            C0 c02 = this.f365146h;
            c02.a();
            C0.a aVar = c02.f364356g;
            if (aVar != null) {
                viewGroupH.removeOnLayoutChangeListener(aVar);
            }
            viewGroupH.setVisibility(0);
        }
        this.f365154p.a();
        this.f365154p = null;
        this.f365155q = null;
    }
}

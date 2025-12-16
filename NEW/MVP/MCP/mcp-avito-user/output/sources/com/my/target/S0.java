package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.my.target.C37802o;
import com.my.target.C37811t;
import com.my.target.S0;
import com.my.target.Y0;
import com.my.target.nativeads.d;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import e11.AbstractC39895p;
import e11.C39867f1;
import e11.C39874i;
import e11.C39875i0;
import e11.C39876i1;
import e11.C39911u1;
import e11.C39913v0;
import e11.C39921y;
import e11.C39922y0;
import e11.C39924z;
import e11.InterfaceC39918x;
import e11.J1;
import e11.e2;
import e11.h2;
import e11.k2;
import e11.m2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class S0 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final com.my.target.nativeads.d f364586a;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final e11.Q0 f364589d;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C37811t f364591f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public final k11.c f364592g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public final Y0 f364593h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public com.avito.android.advertising.loaders.my_target.i f364594i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f364595j;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final ArrayList<C39867f1> f364587b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final ArrayList<C39867f1> f364588c = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final J1 f364590e = new J1();

    public S0(@j.N com.my.target.nativeads.d dVar, @j.N e11.Q0 q02, @j.P h11.d dVar2, @j.N Context context) {
        this.f364586a = dVar;
        this.f364589d = q02;
        this.f364592g = new k11.c(q02);
        C39913v0<com.my.target.common.models.e> c39913v0 = q02.f394464I;
        Y0 y0A = Y0.a(q02, c39913v0 != null ? 3 : 2, c39913v0, context);
        this.f364593h = y0A;
        e11.Z0 z02 = new e11.Z0(y0A, context);
        z02.f394522c = dVar.f365007k;
        this.f364591f = new C37811t(q02, new a(this, dVar), z02, dVar2);
    }

    @Override // e11.h2
    public final void a(@j.N View view, @j.P ArrayList arrayList) {
        C39875i0 c39875i0;
        C39874i c39874i;
        boolean z12;
        int i12;
        com.my.target.common.models.e eVar;
        j();
        final int i13 = 0;
        Y0 y02 = this.f364593h;
        if (y02 != null) {
            y02.c(view, new Y0.c[0]);
        }
        final C37811t c37811t = this.f364591f;
        c37811t.getClass();
        if (!(view instanceof ViewGroup)) {
            Objects.toString(view);
            return;
        }
        if (c37811t.f365151m) {
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) view;
        a aVar = c37811t.f365144f;
        C39876i1 c39876i1 = new C39876i1(viewGroup, arrayList, aVar);
        c37811t.f365154p = c39876i1;
        WeakReference<H> weakReference = c39876i1.f394617f;
        H h12 = weakReference != null ? weakReference.get() : null;
        C39876i1 c39876i12 = c37811t.f365154p;
        c37811t.f365150l = c39876i12.f394613b == null || c39876i12.f394618g;
        e11.Q0 q02 = c37811t.f365142d;
        C39911u1 c39911u1 = q02.f394465J;
        if (c39911u1 != null) {
            c37811t.f365155q = new C37811t.a(c39911u1, aVar);
        }
        IconAdView iconAdViewE = c39876i12.e();
        if (iconAdViewE != null) {
            C39921y.f394904a |= 8;
        }
        MediaAdView mediaAdViewF = c37811t.f365154p.f();
        if (mediaAdViewF != null) {
            C39921y.f394904a |= 4;
        }
        C37809s c37809s = c37811t.f365145g;
        C37803o0 c37803o0 = c37811t.f365143e;
        c37803o0.f365051i = c37809s;
        WeakReference<C39875i0> weakReference2 = c37811t.f365154p.f394616e;
        C39875i0 c39875i02 = weakReference2 != null ? weakReference2.get() : null;
        C0 c02 = c37811t.f365146h;
        if (c02.f364920a != null) {
            if (c39875i02 == null) {
                Context context = viewGroup.getContext();
                c39875i0 = new C39875i0(context);
                C39924z.m(c39875i0, "ad_choices");
                int iC2 = C39924z.c(2, context);
                c39875i0.setPadding(iC2, iC2, iC2, iC2);
            } else {
                c39875i0 = c39875i02;
            }
            if (c39875i0.getParent() == null) {
                try {
                    viewGroup.addView(c39875i0);
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
            viewGroup.addOnLayoutChangeListener(c02.f364356g);
            c02.b(c39875i0, c37811t);
        } else if (c39875i02 != null) {
            c39875i02.setImageBitmap(null);
            c39875i02.setImageDrawable(null);
            c39875i02.setVisibility(8);
            c39875i02.setOnClickListener(null);
        }
        boolean z13 = c37811t.f365140b;
        if (z13 && h12 != null) {
            c37811t.f365147i = 2;
            h12.setPromoCardSliderListener(aVar);
            Parcelable parcelable = c37811t.f365153o;
            if (parcelable != null) {
                h12.a(parcelable);
            }
        } else if (mediaAdViewF != null) {
            com.my.target.common.models.b bVar = q02.f394716o;
            if (z13) {
                c37811t.b(mediaAdViewF, bVar);
                if (c37811t.f365147i != 2) {
                    c37811t.f365147i = 3;
                    Context context2 = mediaAdViewF.getContext();
                    InterfaceC39918x interfaceC39918xD = c37811t.d(mediaAdViewF);
                    if (interfaceC39918xD == null) {
                        interfaceC39918xD = new c7(context2);
                        mediaAdViewF.addView(interfaceC39918xD.getView(), new ViewGroup.LayoutParams(-1, -1));
                    }
                    Parcelable parcelable2 = c37811t.f365153o;
                    if (parcelable2 != null) {
                        interfaceC39918xD.a(parcelable2);
                    }
                    interfaceC39918xD.getView().setClickable(c37811t.f365150l);
                    interfaceC39918xD.setupCards(q02.d());
                    interfaceC39918xD.setPromoCardSliderListener(aVar);
                    interfaceC39918xD.setVisibility(0);
                    mediaAdViewF.setBackgroundColor(0);
                }
            } else {
                C39922y0 c39922y0 = (C39922y0) mediaAdViewF.getImageView();
                if (bVar == null) {
                    c39922y0.setImageBitmap(null);
                } else {
                    Bitmap bitmapA = bVar.a();
                    if (bitmapA != null) {
                        c39922y0.setImageBitmap(bitmapA);
                    } else {
                        c39922y0.setImageBitmap(null);
                        final int i14 = 1;
                        C37802o.c(bVar, c39922y0, new C37802o.a() { // from class: e11.w
                            @Override // com.my.target.C37802o.a
                            public final void a(boolean z14) {
                                switch (i14) {
                                    case 0:
                                        C37811t c37811t2 = c37811t;
                                        if (!z14) {
                                            c37811t2.getClass();
                                            break;
                                        } else {
                                            com.avito.android.advertising.loaders.my_target.i iVar = c37811t2.f365144f.f364596b.f364594i;
                                            break;
                                        }
                                    default:
                                        C37811t c37811t3 = c37811t;
                                        if (!z14) {
                                            c37811t3.getClass();
                                            break;
                                        } else {
                                            S0.a aVar2 = c37811t3.f365144f;
                                            com.avito.android.advertising.loaders.my_target.i iVar2 = aVar2.f364596b.f364594i;
                                            if (iVar2 != null) {
                                                iVar2.a(aVar2.f364597c);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                    }
                }
                if (c37811t.f365155q != null) {
                    int childCount = mediaAdViewF.getChildCount();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= childCount) {
                            c39874i = null;
                            break;
                        }
                        View childAt = mediaAdViewF.getChildAt(i15);
                        if (childAt instanceof C39874i) {
                            c39874i = (C39874i) childAt;
                            break;
                        }
                        i15++;
                    }
                    if (c39874i == null) {
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                        c39874i = new C39874i(mediaAdViewF.getContext());
                        mediaAdViewF.addView(c39874i, layoutParams);
                    }
                    String str = q02.f394466K;
                    com.my.target.common.models.b bVar2 = q02.f394467L;
                    TextView textView = c39874i.f394609b;
                    textView.setText(str);
                    c39874i.f394610c.setImageData(bVar2);
                    ((LinearLayout.LayoutParams) textView.getLayoutParams()).leftMargin = bVar2 == null ? 0 : C39924z.c(4, c39874i.getContext()) * 2;
                    c39874i.setOnClickListener(c37811t.f365155q);
                } else {
                    c39874i = null;
                }
                if (c37811t.f365148j) {
                    if (c39874i != null) {
                        i12 = 1;
                        z12 = true;
                    } else {
                        z12 = false;
                        i12 = 1;
                    }
                    c37811t.f365147i = i12;
                    C39913v0<com.my.target.common.models.e> c39913v0 = q02.f394464I;
                    if (c39913v0 != null) {
                        mediaAdViewF.b(c39913v0.c(), c39913v0.b());
                        eVar = (com.my.target.common.models.e) c39913v0.f394856J;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        if (c37811t.f365152n == null) {
                            c37811t.f365152n = new C37796l(q02, c39913v0, eVar, c37811t.f365141c);
                        }
                        View.OnClickListener gVar = c37811t.f365155q;
                        if (gVar == null) {
                            gVar = new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(c37811t, 29);
                        }
                        mediaAdViewF.setOnClickListener(gVar);
                        C37796l c37796l = c37811t.f365152n;
                        c37796l.f364913v = aVar;
                        c37796l.f364915x = z12;
                        c37796l.f364916y = z12;
                        c37796l.f364911t = aVar;
                        C39876i1 c39876i13 = c37811t.f365154p;
                        if (c39876i13 != null) {
                            ViewGroup viewGroup2 = c39876i13.f394612a.get();
                            c37796l.b(mediaAdViewF, viewGroup2 != null ? viewGroup2.getContext() : null);
                        }
                    }
                } else {
                    c37811t.b(mediaAdViewF, bVar);
                    c37811t.f365147i = 0;
                    mediaAdViewF.getImageView().setVisibility(0);
                    mediaAdViewF.getPlayButtonView().setVisibility(8);
                    mediaAdViewF.getProgressBarView().setVisibility(8);
                    if (c37811t.f365150l) {
                        C37811t.a aVar2 = c37811t.f365155q;
                        if (aVar2 != null) {
                            mediaAdViewF.setOnClickListener(aVar2);
                        } else {
                            mediaAdViewF.setOnClickListener(aVar);
                        }
                    }
                }
            }
        }
        if (iconAdViewE != null) {
            ImageView imageView = iconAdViewE.getImageView();
            if (imageView instanceof C39922y0) {
                C39922y0 c39922y02 = (C39922y0) imageView;
                com.my.target.common.models.b bVar3 = q02.f394717p;
                if (bVar3 == null) {
                    imageView.setImageBitmap(null);
                    c39922y02.f394908e = 0;
                    c39922y02.f394907d = 0;
                } else {
                    int i16 = bVar3.f394305b;
                    int i17 = bVar3.f394306c;
                    if (i16 <= 0 || i17 <= 0) {
                        i16 = 100;
                        i17 = 100;
                    }
                    c39922y02.f394908e = i16;
                    c39922y02.f394907d = i17;
                    Bitmap bitmapA2 = bVar3.a();
                    if (bitmapA2 != null) {
                        imageView.setImageBitmap(bitmapA2);
                    } else {
                        C37802o.c(bVar3, imageView, new C37802o.a() { // from class: e11.w
                            @Override // com.my.target.C37802o.a
                            public final void a(boolean z14) {
                                switch (i13) {
                                    case 0:
                                        C37811t c37811t2 = c37811t;
                                        if (!z14) {
                                            c37811t2.getClass();
                                            break;
                                        } else {
                                            com.avito.android.advertising.loaders.my_target.i iVar = c37811t2.f365144f.f364596b.f364594i;
                                            break;
                                        }
                                    default:
                                        C37811t c37811t3 = c37811t;
                                        if (!z14) {
                                            c37811t3.getClass();
                                            break;
                                        } else {
                                            S0.a aVar22 = c37811t3.f365144f;
                                            com.avito.android.advertising.loaders.my_target.i iVar2 = aVar22.f364596b.f364594i;
                                            if (iVar2 != null) {
                                                iVar2.a(aVar22.f364597c);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                    }
                }
            }
        }
        Context context3 = viewGroup.getContext();
        int i18 = C39921y.f394904a;
        m2.c(new androidx.profileinstaller.h(context3, 2));
        c37803o0.c(viewGroup);
    }

    public final void b(@j.N Context context) {
        C37811t c37811t = this.f364591f;
        k2.a(context, c37811t.f365142d.f394702a.e("closedByUser"));
        C37803o0 c37803o0 = c37811t.f365143e;
        c37803o0.f();
        c37803o0.f365051i = null;
        c37811t.c(false);
        c37811t.f365151m = true;
        C39876i1 c39876i1 = c37811t.f365154p;
        ViewGroup viewGroupH = c39876i1 != null ? c39876i1.h() : null;
        if (viewGroupH != null) {
            viewGroupH.setVisibility(4);
        }
    }

    public final void c(@j.P AbstractC39895p abstractC39895p, @j.P String str, @j.N Context context) {
        if (abstractC39895p != null) {
            J1 j12 = this.f364590e;
            if (str != null) {
                j12.a(abstractC39895p, str, context);
            } else {
                j12.getClass();
                j12.a(abstractC39895p, abstractC39895p.f394697C, context);
            }
        }
        d.c cVar = this.f364586a.f365003g;
        if (cVar != null) {
            cVar.onClick();
        }
    }

    @Override // e11.h2
    public final void d(@j.P com.avito.android.advertising.loaders.my_target.i iVar) {
        this.f364594i = iVar;
    }

    public final void e(@j.N int[] iArr, @j.N Context context) {
        if (this.f364595j) {
            String strQ = C39924z.q(context);
            ArrayList arrayListD = this.f364589d.d();
            int length = iArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                int i13 = iArr[i12];
                C39867f1 c39867f1 = (i13 < 0 || i13 >= arrayListD.size()) ? null : (C39867f1) arrayListD.get(i13);
                if (c39867f1 != null) {
                    ArrayList<C39867f1> arrayList = this.f364587b;
                    if (!arrayList.contains(c39867f1)) {
                        e2 e2Var = c39867f1.f394702a;
                        if (strQ != null) {
                            k2.a(context, e2Var.a(strQ));
                        }
                        k2.a(context, e2Var.e("playbackStarted"));
                        k2.a(context, e2Var.e("show"));
                        arrayList.add(c39867f1);
                    }
                }
            }
        }
    }

    @Override // e11.h2
    @j.P
    public final k11.c g() {
        return this.f364592g;
    }

    @Override // e11.h2
    public final void j() {
        this.f364591f.f();
        Y0 y02 = this.f364593h;
        if (y02 != null) {
            y02.f();
        }
    }

    public static class a implements C37811t.b {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final S0 f364596b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        public final com.my.target.nativeads.d f364597c;

        public a(@j.N S0 s02, @j.N com.my.target.nativeads.d dVar) {
            this.f364596b = s02;
            this.f364597c = dVar;
        }

        @Override // com.my.target.C37802o.a
        public final void a(boolean z12) {
            com.my.target.nativeads.d dVar = this.f364597c;
            d.a aVar = dVar.f365004h;
            if (aVar == null) {
                return;
            }
            if (!z12) {
                aVar.f(null, false);
                return;
            }
            k11.c cVarA = dVar.a();
            if (cVarA == null) {
                aVar.f(null, false);
                return;
            }
            com.my.target.common.models.b bVar = cVarA.f406015l;
            if (bVar == null) {
                aVar.f(null, false);
            } else {
                aVar.f(bVar, true);
            }
        }

        @Override // com.my.target.H.a
        public final void b(int i12, @j.N Context context) {
            S0 s02 = this.f364596b;
            ArrayList arrayListD = s02.f364589d.d();
            C39867f1 c39867f1 = (i12 < 0 || i12 >= arrayListD.size()) ? null : (C39867f1) arrayListD.get(i12);
            if (c39867f1 != null) {
                ArrayList<C39867f1> arrayList = s02.f364588c;
                if (arrayList.contains(c39867f1)) {
                    return;
                }
                k2.a(context, c39867f1.f394702a.e("render"));
                arrayList.add(c39867f1);
            }
        }

        @Override // com.my.target.H.a
        public final void c(@j.N View view, int i12) {
            S0 s02 = this.f364596b;
            e11.Q0 q02 = s02.f364589d;
            ArrayList arrayListD = q02.d();
            if (i12 >= 0 && i12 < arrayListD.size()) {
                s02.c((C39867f1) arrayListD.get(i12), null, view.getContext());
            }
            Context context = view.getContext();
            if (context != null) {
                k2.a(context, q02.f394702a.e("click"));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d() {
            MediaAdView mediaAdViewF;
            C37811t c37811t = this.f364596b.f364591f;
            c37811t.f365148j = false;
            c37811t.f365147i = 0;
            C37796l c37796l = c37811t.f365152n;
            if (c37796l != null) {
                c37796l.w();
            }
            C39876i1 c39876i1 = c37811t.f365154p;
            if (c39876i1 == null || (mediaAdViewF = c39876i1.f()) == null) {
                return;
            }
            mediaAdViewF.setBackgroundColor(-1118482);
            InterfaceC39918x interfaceC39918xD = c37811t.d(mediaAdViewF);
            if (interfaceC39918xD != 0) {
                c37811t.f365153o = interfaceC39918xD.getState();
                interfaceC39918xD.dispose();
                ((View) interfaceC39918xD).setVisibility(8);
            }
            c37811t.b(mediaAdViewF, c37811t.f365142d.f394716o);
            mediaAdViewF.getImageView().setVisibility(0);
            mediaAdViewF.getProgressBarView().setVisibility(8);
            mediaAdViewF.getPlayButtonView().setVisibility(8);
            if (c37811t.f365150l) {
                mediaAdViewF.setOnClickListener(c37811t.f365144f);
            }
        }

        public final void e() {
            d.c cVar = this.f364596b.f364586a.f365003g;
            if (cVar != null) {
                cVar.d();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@j.P View view) {
            S0 s02 = this.f364596b;
            s02.getClass();
            if (view != null) {
                s02.c(s02.f364589d, null, view.getContext());
            }
        }

        @Override // com.my.target.H.a
        public final void a(@j.N int[] iArr, @j.N Context context) {
            this.f364596b.e(iArr, context);
        }
    }
}

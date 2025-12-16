package com.my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.my.target.C0;
import com.my.target.C37795k0;
import com.my.target.nativeads.h;
import com.my.target.nativeads.views.IconAdView;
import e11.C39876i1;
import e11.C39922y0;
import e11.J1;
import e11.k2;
import e11.o2;

/* renamed from: com.my.target.g0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37787g0 implements o2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final com.my.target.nativeads.h f364843a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final e11.Q0 f364844b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final J1 f364845c = new J1();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final C37795k0 f364846d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final k11.b f364847e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final Y0 f364848f;

    /* renamed from: com.my.target.g0$a */
    public static class a implements C37795k0.a {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final C37787g0 f364849b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        public final com.my.target.nativeads.h f364850c;

        public a(@j.N C37787g0 c37787g0, @j.N com.my.target.nativeads.h hVar) {
            this.f364849b = c37787g0;
            this.f364850c = hVar;
        }

        @Override // com.my.target.C37802o.a
        public final void a(boolean z12) {
            com.my.target.nativeads.h hVar = this.f364850c;
            h.a aVar = hVar.f365012h;
            if (aVar == null) {
                return;
            }
            if (!z12) {
                aVar.d(null, false);
                return;
            }
            o2 o2Var = hVar.f365010f;
            k11.b bVarH = o2Var == null ? null : o2Var.h();
            if (bVarH == null) {
                aVar.d(null, false);
                return;
            }
            com.my.target.common.models.b bVar = bVarH.f406015l;
            if (bVar == null) {
                aVar.d(null, false);
            } else {
                aVar.d(bVar, true);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@j.P View view) {
            Context context;
            C37787g0 c37787g0 = this.f364849b;
            if (view == null) {
                c37787g0.getClass();
                return;
            }
            e11.Q0 q02 = c37787g0.f364844b;
            if (q02 != null && (context = view.getContext()) != null) {
                J1 j12 = c37787g0.f364845c;
                j12.getClass();
                j12.a(q02, q02.f394697C, context);
            }
            h.c cVar = c37787g0.f364843a.f365011g;
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    public C37787g0(@j.N com.my.target.nativeads.h hVar, @j.N e11.Q0 q02, @j.P h11.d dVar, @j.N Context context) {
        this.f364843a = hVar;
        this.f364844b = q02;
        this.f364847e = new k11.b(q02);
        this.f364846d = new C37795k0(q02, new a(this, hVar), dVar);
        this.f364848f = Y0.a(q02, 2, null, context);
    }

    public final void a(@j.N Context context) {
        C37795k0 c37795k0 = this.f364846d;
        k2.a(context, c37795k0.f364888b.f394702a.e("closedByUser"));
        C39876i1 c39876i1 = c37795k0.f364892f;
        ViewGroup viewGroupH = c39876i1 != null ? c39876i1.h() : null;
        C37803o0 c37803o0 = c37795k0.f364889c;
        c37803o0.f();
        c37803o0.f365051i = null;
        if (viewGroupH != null) {
            viewGroupH.setVisibility(4);
        }
    }

    @Override // e11.o2
    @j.N
    public final k11.b h() {
        return this.f364847e;
    }

    @Override // e11.o2
    public final void j() {
        C37795k0 c37795k0 = this.f364846d;
        C37803o0 c37803o0 = c37795k0.f364889c;
        c37803o0.f();
        c37803o0.f365051i = null;
        C39876i1 c39876i1 = c37795k0.f364892f;
        if (c39876i1 != null) {
            IconAdView iconAdViewE = c39876i1.e();
            if (iconAdViewE != null) {
                iconAdViewE.setOnClickListener(null);
                ImageView imageView = iconAdViewE.getImageView();
                imageView.setImageBitmap(null);
                if (imageView instanceof C39922y0) {
                    C39922y0 c39922y0 = (C39922y0) imageView;
                    c39922y0.f394908e = 0;
                    c39922y0.f394907d = 0;
                }
                com.my.target.common.models.b bVar = c37795k0.f364888b.f394717p;
                if (bVar != null) {
                    C37802o.b(bVar, imageView);
                }
            }
            ViewGroup viewGroupH = c37795k0.f364892f.h();
            if (viewGroupH != null) {
                C0 c02 = c37795k0.f364891e;
                c02.a();
                C0.a aVar = c02.f364356g;
                if (aVar != null) {
                    viewGroupH.removeOnLayoutChangeListener(aVar);
                }
                viewGroupH.setVisibility(0);
            }
            c37795k0.f364892f.a();
            c37795k0.f364892f = null;
        }
        Y0 y02 = this.f364848f;
        if (y02 != null) {
            y02.f();
        }
    }
}

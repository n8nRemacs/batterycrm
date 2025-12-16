package com.my.target;

import android.view.ViewGroup;
import com.my.target.C37803o0;
import com.my.target.nativeads.h;
import e11.C39876i1;
import e11.k2;

/* renamed from: com.my.target.j0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37793j0 extends C37803o0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37795k0 f364878a;

    public C37793j0(C37795k0 c37795k0) {
        this.f364878a = c37795k0;
    }

    @Override // com.my.target.C37803o0.a
    public final void a() {
        C37795k0 c37795k0 = this.f364878a;
        C39876i1 c39876i1 = c37795k0.f364892f;
        ViewGroup viewGroupH = c39876i1 != null ? c39876i1.h() : null;
        if (viewGroupH != null) {
            C37787g0 c37787g0 = c37795k0.f364890d.f364849b;
            Y0 y02 = c37787g0.f364848f;
            if (y02 != null) {
                y02.g();
            }
            k2.a(viewGroupH.getContext(), c37787g0.f364844b.f394702a.e("playbackStarted"));
            h.c cVar = c37787g0.f364843a.f365011g;
            if (cVar != null) {
                cVar.b();
            }
        }
    }
}

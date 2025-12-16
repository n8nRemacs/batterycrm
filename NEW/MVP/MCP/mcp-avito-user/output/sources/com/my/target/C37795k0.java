package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.C0.a;
import com.my.target.C37787g0;
import com.my.target.C37798m;
import com.my.target.C37802o;
import com.my.target.nativeads.h;
import e11.C39876i1;

/* renamed from: com.my.target.k0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37795k0 implements C37798m.a {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final e11.Q0 f364888b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C37803o0 f364889c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final C37787g0.a f364890d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final C0 f364891e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public C39876i1 f364892f;

    /* renamed from: com.my.target.k0$a */
    public interface a extends View.OnClickListener, C37802o.a {
    }

    public C37795k0(@j.N e11.Q0 q02, @j.N C37787g0.a aVar, @j.P h11.d dVar) {
        this.f364890d = aVar;
        this.f364888b = q02;
        C37788h c37788h = q02.f394698D;
        C0 c02 = new C0(c37788h, dVar, aVar);
        if (c37788h != null) {
            c02.f364356g = c02.new a();
        }
        this.f364891e = c02;
        this.f364889c = new C37803o0(q02.f394703b, q02.f394702a, true);
        new C37793j0(this);
    }

    @Override // com.my.target.C37798m.a
    public final void a(@j.N Context context) {
        C37787g0.a aVar = this.f364890d;
        com.my.target.nativeads.h hVar = aVar.f364850c;
        h.b bVar = hVar.f365013i;
        C37787g0 c37787g0 = aVar.f364849b;
        if (bVar == null) {
            c37787g0.a(context);
        } else if (!bVar.k()) {
            bVar.f(hVar);
        } else {
            c37787g0.a(context);
            bVar.g(hVar);
        }
    }
}

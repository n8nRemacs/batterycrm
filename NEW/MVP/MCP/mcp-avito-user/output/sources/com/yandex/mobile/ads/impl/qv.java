package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.gv;
import java.util.List;

/* loaded from: classes8.dex */
public final class qv {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n2 f389299a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final oy0 f389300b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.w f389301c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final pv f389302d = new pv();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.k f389303e;

    public qv(@j.N n2 n2Var, @j.N oy0 oy0Var, @j.N com.yandex.mobile.ads.nativeads.w wVar, @j.N com.yandex.mobile.ads.nativeads.k kVar) {
        this.f389299a = n2Var;
        this.f389300b = oy0Var;
        this.f389301c = wVar;
        this.f389303e = kVar;
    }

    public final void a(@j.N Context context, @j.N gv gvVar) {
        ImageView imageViewG = this.f389301c.g().g();
        if (imageViewG != null) {
            List<gv.a> listB = gvVar.b();
            if (listB.isEmpty()) {
                return;
            }
            try {
                x6 x6Var = new x6(context, this.f389299a);
                this.f389302d.getClass();
                PopupMenu popupMenuA = pv.a(context, imageViewG, listB);
                popupMenuA.setOnMenuItemClickListener(new cu0(x6Var, listB, this.f389300b, this.f389303e));
                popupMenuA.show();
            } catch (Exception unused) {
            }
        }
    }
}

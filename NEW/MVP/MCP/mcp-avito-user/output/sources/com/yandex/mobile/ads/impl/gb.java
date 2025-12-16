package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.nativeads.Rating;

/* loaded from: classes8.dex */
public final class gb {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final w20 f385626a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final wd0 f385627b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final om0 f385628c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final cm0 f385629d;

    public gb(@Y61.k w20 w20Var, @Y61.k wd0 wd0Var, @Y61.k om0 om0Var, @Y61.k cm0 cm0Var) {
        this.f385626a = w20Var;
        this.f385627b = wd0Var;
        this.f385628c = om0Var;
        this.f385629d = cm0Var;
    }

    @Y61.l
    public static go a(@Y61.l TextView textView) {
        sj sjVar = textView != null ? new sj(textView) : null;
        if (sjVar != null) {
            return new go(sjVar);
        }
        return null;
    }

    @Y61.l
    public static go b(@Y61.l View view) {
        nw0 nw0Var = view instanceof Rating ? new nw0(view) : null;
        if (nw0Var != null) {
            return new go(nw0Var);
        }
        return null;
    }

    @Y61.l
    public final ub0 a(@Y61.l ImageView imageView, @Y61.l CustomizableMediaView customizableMediaView) {
        j30 j30Var = imageView != null ? new j30(imageView, this.f385626a) : null;
        vd0 vd0VarA = customizableMediaView != null ? this.f385627b.a(customizableMediaView, this.f385626a, this.f385628c, this.f385629d) : null;
        if (j30Var == null && vd0VarA == null) {
            return null;
        }
        return new ub0(j30Var, vd0VarA);
    }

    @Y61.l
    public final m20 a(@Y61.l ImageView imageView) {
        tv tvVar = imageView != null ? new tv(imageView, this.f385626a) : null;
        if (tvVar != null) {
            return new m20(tvVar);
        }
        return null;
    }

    @Y61.l
    public final fb<?> a(@Y61.l View view, @Y61.k String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1034364087) {
            if (iHashCode != -891985903) {
                if (iHashCode == 100313435) {
                    if (!str.equals("image")) {
                        return null;
                    }
                    if ((view instanceof ImageView ? (ImageView) view : null) != null) {
                        return new m20(new j30((ImageView) view, this.f385626a));
                    }
                    return null;
                }
                if (iHashCode != 103772132 || !str.equals("media")) {
                    return null;
                }
                if ((view instanceof CustomizableMediaView ? (CustomizableMediaView) view : null) != null) {
                    return a((ImageView) null, (CustomizableMediaView) view);
                }
                return null;
            }
            if (!str.equals("string")) {
                return null;
            }
        } else if (!str.equals("number")) {
            return null;
        }
        if ((view instanceof TextView ? (TextView) view : null) != null) {
            return new go(new x81((TextView) view));
        }
        return null;
    }

    @Y61.k
    public static go a(@Y61.k View view) {
        return new go(new pp(view));
    }
}

package com.airbnb.lottie.manager;

import O2.h;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.C27263b;
import com.airbnb.lottie.utils.e;
import j.P;
import java.util.HashMap;

/* compiled from: FontAssetManager.java */
/* loaded from: classes10.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public final AssetManager f59609d;

    /* renamed from: a, reason: collision with root package name */
    public final h<String> f59606a = new h<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f59607b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f59608c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public String f59610e = ".ttf";

    public a(Drawable.Callback callback, @P C27263b c27263b) {
        if (callback instanceof View) {
            this.f59609d = ((View) callback).getContext().getAssets();
        } else {
            e.b("LottieDrawable must be inside of a view for images to work.");
            this.f59609d = null;
        }
    }
}

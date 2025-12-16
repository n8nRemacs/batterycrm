package com.airbnb.lottie.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.D;
import com.airbnb.lottie.InterfaceC27264c;
import j.P;
import java.util.Map;

/* compiled from: ImageAssetManager.java */
/* loaded from: classes10.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f59611e = new Object();

    /* renamed from: a, reason: collision with root package name */
    @P
    public final Context f59612a;

    /* renamed from: b, reason: collision with root package name */
    public final String f59613b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public InterfaceC27264c f59614c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, D> f59615d;

    public b(Drawable.Callback callback, String str, InterfaceC27264c interfaceC27264c, Map<String, D> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f59613b = str;
        } else {
            this.f59613b = str.concat("/");
        }
        this.f59615d = map;
        this.f59614c = interfaceC27264c;
        if (callback instanceof View) {
            this.f59612a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f59612a = null;
        }
    }

    public final void a(@P Bitmap bitmap, String str) {
        synchronized (f59611e) {
            this.f59615d.get(str).f59070f = bitmap;
        }
    }
}

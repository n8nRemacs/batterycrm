package com.airbnb.lottie;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.collection.C20204c0;
import androidx.collection.q1;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LottieComposition.java */
/* renamed from: com.airbnb.lottie.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27291k {

    /* renamed from: c, reason: collision with root package name */
    public HashMap f59584c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f59585d;

    /* renamed from: e, reason: collision with root package name */
    public float f59586e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f59587f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f59588g;

    /* renamed from: h, reason: collision with root package name */
    public q1<O2.c> f59589h;

    /* renamed from: i, reason: collision with root package name */
    public C20204c0<Layer> f59590i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f59591j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f59592k;

    /* renamed from: l, reason: collision with root package name */
    public float f59593l;

    /* renamed from: m, reason: collision with root package name */
    public float f59594m;

    /* renamed from: n, reason: collision with root package name */
    public float f59595n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f59596o;

    /* renamed from: a, reason: collision with root package name */
    public final M f59582a = new M();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet<String> f59583b = new HashSet<>();

    /* renamed from: p, reason: collision with root package name */
    public int f59597p = 0;

    /* compiled from: LottieComposition.java */
    @Deprecated
    /* renamed from: com.airbnb.lottie.k$b */
    public static class b {

        /* compiled from: LottieComposition.java */
        /* renamed from: com.airbnb.lottie.k$b$a */
        public static final class a implements E<C27291k>, InterfaceC27262a {

            /* renamed from: a, reason: collision with root package name */
            public final L f59598a;

            public a(L l12, a aVar) {
                this.f59598a = l12;
            }

            @Override // com.airbnb.lottie.E
            public final void onResult(C27291k c27291k) {
                this.f59598a.a();
            }
        }
    }

    @RestrictTo
    public final void a(String str) {
        com.airbnb.lottie.utils.e.b(str);
        this.f59583b.add(str);
    }

    public final float b() {
        return (long) (((this.f59594m - this.f59593l) / this.f59595n) * 1000.0f);
    }

    public final Map<String, D> c() {
        float fC2 = com.airbnb.lottie.utils.k.c();
        if (fC2 != this.f59586e) {
            for (Map.Entry entry : this.f59585d.entrySet()) {
                HashMap map = this.f59585d;
                String str = (String) entry.getKey();
                D d12 = (D) entry.getValue();
                float f12 = this.f59586e / fC2;
                int i12 = (int) (d12.f59065a * f12);
                int i13 = (int) (d12.f59066b * f12);
                D d13 = new D(i12, i13, d12.f59067c, d12.f59068d, d12.f59069e);
                Bitmap bitmap = d12.f59070f;
                if (bitmap != null) {
                    d13.f59070f = Bitmap.createScaledBitmap(bitmap, i12, i13, true);
                }
                map.put(str, d13);
            }
        }
        this.f59586e = fC2;
        return this.f59585d;
    }

    @j.P
    public final O2.g d(String str) {
        int size = this.f59588g.size();
        for (int i12 = 0; i12 < size; i12++) {
            O2.g gVar = (O2.g) this.f59588g.get(i12);
            String str2 = gVar.f11946a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return gVar;
            }
        }
        return null;
    }

    @j.N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f59591j.iterator();
        while (it.hasNext()) {
            sb2.append(((Layer) it.next()).a("\t"));
        }
        return sb2.toString();
    }
}

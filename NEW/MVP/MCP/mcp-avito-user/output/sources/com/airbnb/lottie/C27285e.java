package com.airbnb.lottie;

import android.content.Context;
import android.os.Trace;
import androidx.annotation.RestrictTo;
import java.io.File;

/* compiled from: L.java */
@RestrictTo
/* renamed from: com.airbnb.lottie.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27285e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f59567a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f59568b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f59569c = true;

    /* renamed from: e, reason: collision with root package name */
    public static com.airbnb.lottie.network.e f59571e;

    /* renamed from: f, reason: collision with root package name */
    public static com.airbnb.lottie.network.d f59572f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile com.airbnb.lottie.network.g f59573g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile com.airbnb.lottie.network.f f59574h;

    /* renamed from: i, reason: collision with root package name */
    public static ThreadLocal<com.airbnb.lottie.utils.g> f59575i;

    /* renamed from: d, reason: collision with root package name */
    public static AsyncUpdates f59570d = AsyncUpdates.f59010b;

    /* renamed from: j, reason: collision with root package name */
    public static N2.b f59576j = new N2.c();

    public static void a(String str) {
        if (f59567a) {
            com.airbnb.lottie.utils.g gVar = f59575i.get();
            if (gVar == null) {
                gVar = new com.airbnb.lottie.utils.g();
                f59575i.set(gVar);
            }
            int i12 = gVar.f60108c;
            if (i12 == 5) {
                gVar.f60109d++;
                return;
            }
            gVar.f60106a[i12] = str;
            gVar.f60107b[i12] = System.nanoTime();
            int i13 = androidx.core.os.K.f44794a;
            Trace.beginSection(str);
            gVar.f60108c++;
        }
    }

    public static float b(String str) {
        if (!f59567a) {
            return 0.0f;
        }
        com.airbnb.lottie.utils.g gVar = f59575i.get();
        if (gVar == null) {
            gVar = new com.airbnb.lottie.utils.g();
            f59575i.set(gVar);
        }
        int i12 = gVar.f60109d;
        if (i12 > 0) {
            gVar.f60109d = i12 - 1;
            return 0.0f;
        }
        int i13 = gVar.f60108c - 1;
        gVar.f60108c = i13;
        if (i13 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        String[] strArr = gVar.f60106a;
        if (!str.equals(strArr[i13])) {
            throw new IllegalStateException(AK.c.s(androidx.appcompat.app.r.A("Unbalanced trace call ", str, ". Expected "), strArr[gVar.f60108c], "."));
        }
        int i14 = androidx.core.os.K.f44794a;
        Trace.endSection();
        return (System.nanoTime() - gVar.f60107b[gVar.f60108c]) / 1000000.0f;
    }

    @j.P
    public static com.airbnb.lottie.network.f c(@j.N Context context) {
        if (!f59568b) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.airbnb.lottie.network.f fVar = f59574h;
        if (fVar == null) {
            synchronized (com.airbnb.lottie.network.f.class) {
                try {
                    fVar = f59574h;
                    if (fVar == null) {
                        com.airbnb.lottie.network.d dVar = f59572f;
                        if (dVar == null) {
                            dVar = new com.airbnb.lottie.network.d() { // from class: com.airbnb.lottie.d
                                @Override // com.airbnb.lottie.network.d
                                public final File a() {
                                    boolean z12 = C27285e.f59567a;
                                    return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                                }
                            };
                        }
                        fVar = new com.airbnb.lottie.network.f(dVar);
                        f59574h = fVar;
                    }
                } finally {
                }
            }
        }
        return fVar;
    }
}

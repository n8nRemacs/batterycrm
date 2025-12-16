package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C42756l;

/* loaded from: classes8.dex */
public final class bh0 {

    public interface a {

        /* renamed from: com.yandex.mobile.ads.impl.bh0$a$a, reason: collision with other inner class name */
        public static final class C10973a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C10973a f383962a = new C10973a();

            private C10973a() {
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            private final List<g70> f383963a;

            public b(@Y61.k List<g70> list) {
                this.f383963a = list;
            }

            @Y61.k
            public final List<g70> a() {
                return this.f383963a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f383963a, ((b) obj).f383963a);
            }

            public final int hashCode() {
                return this.f383963a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return androidx.compose.foundation.H.p(Cif.a("IncorrectIntegration(causes="), this.f383963a, ')');
            }
        }
    }

    @Y61.k
    public static a a(@Y61.k Context context) throws PackageManager.NameNotFoundException {
        tg0 tg0Var = new tg0();
        C39374w0 c39374w0 = new C39374w0();
        pa paVar = new pa();
        g70 e12 = null;
        try {
            tg0Var.a();
            e = null;
        } catch (g70 e13) {
            e = e13;
        }
        try {
            c39374w0.a(context);
            e = null;
        } catch (g70 e14) {
            e = e14;
        }
        try {
            gs0.a(context);
            e = null;
        } catch (g70 e15) {
            e = e15;
        }
        try {
            paVar.a();
        } catch (g70 e16) {
            e12 = e16;
        }
        ArrayList arrayListB = C42756l.B(new g70[]{e, e, e, e12});
        return !arrayListB.isEmpty() ? new a.b(arrayListB) : a.C10973a.f383962a;
    }
}

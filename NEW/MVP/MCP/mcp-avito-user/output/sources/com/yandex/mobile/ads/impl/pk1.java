package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class pk1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f388875a = Log.isLoggable("Volley", 2);

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f388876c = pk1.f388875a;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f388877a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f388878b = false;

        /* renamed from: com.yandex.mobile.ads.impl.pk1$a$a, reason: collision with other inner class name */
        public static class C10982a {

            /* renamed from: a, reason: collision with root package name */
            public final long f388879a;

            public C10982a(String str, long j12, long j13) {
                this.f388879a = j13;
            }
        }

        public final synchronized void a(String str, long j12) {
            if (this.f388878b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f388877a.add(new C10982a(str, j12, SystemClock.elapsedRealtime()));
        }

        public final void finalize() {
            if (this.f388878b) {
                return;
            }
            a();
            boolean z12 = pk1.f388875a;
        }

        public final synchronized void a() {
            long j12;
            this.f388878b = true;
            if (this.f388877a.size() == 0) {
                j12 = 0;
            } else {
                long j13 = ((C10982a) this.f388877a.get(0)).f388879a;
                ArrayList arrayList = this.f388877a;
                j12 = ((C10982a) arrayList.get(arrayList.size() - 1)).f388879a - j13;
            }
            if (j12 <= 0) {
                return;
            }
            long j14 = ((C10982a) this.f388877a.get(0)).f388879a;
            boolean z12 = pk1.f388875a;
            Iterator it = this.f388877a.iterator();
            while (it.hasNext()) {
                long j15 = ((C10982a) it.next()).f388879a;
                boolean z13 = pk1.f388875a;
            }
        }
    }
}

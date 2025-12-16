package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes8.dex */
abstract class gc {

    /* renamed from: a, reason: collision with root package name */
    public final int f385630a;

    public static final class a extends gc {

        /* renamed from: b, reason: collision with root package name */
        public final long f385631b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f385632c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f385633d;

        public a(int i12, long j12) {
            super(i12);
            this.f385631b = j12;
            this.f385632c = new ArrayList();
            this.f385633d = new ArrayList();
        }

        @j.P
        public final a c(int i12) {
            int size = this.f385633d.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = (a) this.f385633d.get(i13);
                if (aVar.f385630a == i12) {
                    return aVar;
                }
            }
            return null;
        }

        @j.P
        public final b d(int i12) {
            int size = this.f385632c.size();
            for (int i13 = 0; i13 < size; i13++) {
                b bVar = (b) this.f385632c.get(i13);
                if (bVar.f385630a == i12) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.yandex.mobile.ads.impl.gc
        public final String toString() {
            return gc.a(this.f385630a) + " leaves: " + Arrays.toString(this.f385632c.toArray()) + " containers: " + Arrays.toString(this.f385633d.toArray());
        }
    }

    public static final class b extends gc {

        /* renamed from: b, reason: collision with root package name */
        public final pr0 f385634b;

        public b(int i12, pr0 pr0Var) {
            super(i12);
            this.f385634b = pr0Var;
        }
    }

    public gc(int i12) {
        this.f385630a = i12;
    }

    public static String a(int i12) {
        StringBuilder sbA = Cif.a("");
        sbA.append((char) ((i12 >> 24) & 255));
        sbA.append((char) ((i12 >> 16) & 255));
        sbA.append((char) ((i12 >> 8) & 255));
        sbA.append((char) (i12 & 255));
        return sbA.toString();
    }

    public static int b(int i12) {
        return (i12 >> 24) & 255;
    }

    public String toString() {
        return a(this.f385630a);
    }
}

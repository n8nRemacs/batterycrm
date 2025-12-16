package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.F;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Atom.java */
/* loaded from: classes6.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f344737a;

    /* compiled from: Atom.java */
    /* renamed from: com.google.android.exoplayer2.extractor.mp4.a$a, reason: collision with other inner class name */
    public static final class C10581a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final long f344738b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f344739c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f344740d;

        public C10581a(int i12, long j12) {
            super(i12);
            this.f344738b = j12;
            this.f344739c = new ArrayList();
            this.f344740d = new ArrayList();
        }

        @P
        public final C10581a c(int i12) {
            ArrayList arrayList = this.f344740d;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                C10581a c10581a = (C10581a) arrayList.get(i13);
                if (c10581a.f344737a == i12) {
                    return c10581a;
                }
            }
            return null;
        }

        @P
        public final b d(int i12) {
            ArrayList arrayList = this.f344739c;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                b bVar = (b) arrayList.get(i13);
                if (bVar.f344737a == i12) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.a
        public final String toString() {
            return a.a(this.f344737a) + " leaves: " + Arrays.toString(this.f344739c.toArray()) + " containers: " + Arrays.toString(this.f344740d.toArray());
        }
    }

    /* compiled from: Atom.java */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final F f344741b;

        public b(int i12, F f12) {
            super(i12);
            this.f344741b = f12;
        }
    }

    public a(int i12) {
        this.f344737a = i12;
    }

    public static String a(int i12) {
        return "" + ((char) ((i12 >> 24) & 255)) + ((char) ((i12 >> 16) & 255)) + ((char) ((i12 >> 8) & 255)) + ((char) (i12 & 255));
    }

    public static int b(int i12) {
        return (i12 >> 24) & 255;
    }

    public String toString() {
        return a(this.f344737a);
    }
}

package androidx.media3.extractor.mp4;

import androidx.media3.common.util.z;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Atom.java */
/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f50910a;

    /* compiled from: Atom.java */
    /* renamed from: androidx.media3.extractor.mp4.a$a, reason: collision with other inner class name */
    public static final class C1856a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final long f50911b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f50912c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f50913d;

        public C1856a(int i12, long j12) {
            super(i12);
            this.f50911b = j12;
            this.f50912c = new ArrayList();
            this.f50913d = new ArrayList();
        }

        @P
        public final C1856a c(int i12) {
            ArrayList arrayList = this.f50913d;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                C1856a c1856a = (C1856a) arrayList.get(i13);
                if (c1856a.f50910a == i12) {
                    return c1856a;
                }
            }
            return null;
        }

        @P
        public final b d(int i12) {
            ArrayList arrayList = this.f50912c;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                b bVar = (b) arrayList.get(i13);
                if (bVar.f50910a == i12) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // androidx.media3.extractor.mp4.a
        public final String toString() {
            return a.a(this.f50910a) + " leaves: " + Arrays.toString(this.f50912c.toArray()) + " containers: " + Arrays.toString(this.f50913d.toArray());
        }
    }

    /* compiled from: Atom.java */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final z f50914b;

        public b(int i12, z zVar) {
            super(i12);
            this.f50914b = zVar;
        }
    }

    public a(int i12) {
        this.f50910a = i12;
    }

    public static String a(int i12) {
        return "" + ((char) ((i12 >> 24) & 255)) + ((char) ((i12 >> 16) & 255)) + ((char) ((i12 >> 8) & 255)) + ((char) (i12 & 255));
    }

    public static int b(int i12) {
        return (i12 >> 24) & 255;
    }

    public String toString() {
        return a(this.f50910a);
    }
}

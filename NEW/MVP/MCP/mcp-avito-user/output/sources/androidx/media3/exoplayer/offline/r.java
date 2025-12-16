package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.B;
import androidx.media3.common.util.J;
import androidx.media3.datasource.cache.g;
import androidx.media3.exoplayer.offline.n;
import java.io.IOException;

/* compiled from: SegmentDownloader.java */
@J
/* loaded from: classes.dex */
public abstract class r<M extends n<M>> implements l {

    /* compiled from: SegmentDownloader.java */
    public static final class a implements g.a {
    }

    /* compiled from: SegmentDownloader.java */
    public static class b implements Comparable<b> {
        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            throw null;
        }
    }

    /* compiled from: SegmentDownloader.java */
    public static final class c extends B<Void, IOException> {
        @Override // androidx.media3.common.util.B
        public final void a() {
            throw null;
        }

        @Override // androidx.media3.common.util.B
        public final Void b() {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // androidx.media3.exoplayer.offline.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@j.P androidx.media3.exoplayer.offline.l.a r1) {
        /*
            r0 = this;
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> Lc
        Lc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.offline.r.a(androidx.media3.exoplayer.offline.l$a):void");
    }

    @Override // androidx.media3.exoplayer.offline.l
    public final void remove() {
        throw null;
    }
}

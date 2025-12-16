package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.J;
import j.P;
import java.util.Collections;
import java.util.List;

/* compiled from: PlaybackStats.java */
@J
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final List<c> f48750a;

    /* renamed from: b, reason: collision with root package name */
    public final List<long[]> f48751b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f48752c;

    /* renamed from: d, reason: collision with root package name */
    public final List<b> f48753d;

    /* renamed from: e, reason: collision with root package name */
    public final List<a> f48754e;

    /* renamed from: f, reason: collision with root package name */
    public final List<a> f48755f;

    /* compiled from: PlaybackStats.java */
    public static final class a {
        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* compiled from: PlaybackStats.java */
    public static final class b {
        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* compiled from: PlaybackStats.java */
    public static final class c {
        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    static {
        new u(0, new long[16], Collections.emptyList(), Collections.emptyList(), -9223372036854775807L, 0, 0, 0, 0, -9223372036854775807L, 0, 0, 0, 0, 0, -9223372036854775807L, 0, Collections.emptyList(), Collections.emptyList(), 0L, 0L, 0L, 0L, 0L, 0L, 0, 0, -1, -1L, 0, -1L, 0L, 0L, 0L, 0L, 0, 0, 0, Collections.emptyList(), Collections.emptyList());
    }

    public u(int i12, long[] jArr, List<c> list, List<long[]> list2, long j12, int i13, int i14, int i15, int i16, long j13, int i17, int i18, int i19, int i22, int i23, long j14, int i24, List<b> list3, List<b> list4, long j15, long j16, long j17, long j18, long j19, long j22, int i25, int i26, int i27, long j23, int i28, long j24, long j25, long j26, long j27, long j28, int i29, int i32, int i33, List<a> list5, List<a> list6) {
        this.f48750a = Collections.unmodifiableList(list);
        this.f48751b = Collections.unmodifiableList(list2);
        this.f48752c = Collections.unmodifiableList(list3);
        this.f48753d = Collections.unmodifiableList(list4);
        this.f48754e = Collections.unmodifiableList(list5);
        this.f48755f = Collections.unmodifiableList(list6);
    }
}

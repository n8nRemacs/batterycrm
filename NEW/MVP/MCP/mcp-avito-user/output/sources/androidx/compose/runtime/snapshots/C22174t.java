package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.H0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.sequences.AbstractC43032o;
import kotlin.sequences.C43033p;
import kotlin.sequences.C43034q;

/* compiled from: SnapshotIdSet.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/t;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22174t implements Iterable<Long>, Z41.a {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f38734f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C22174t f38735g = new C22174t(0, 0, 0, null);

    /* renamed from: b, reason: collision with root package name */
    public final long f38736b;

    /* renamed from: c, reason: collision with root package name */
    public final long f38737c;

    /* renamed from: d, reason: collision with root package name */
    public final long f38738d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final long[] f38739e;

    /* compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/t$a;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.t$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SnapshotIdSet.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/sequences/o;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {252, 256, 263}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    /* renamed from: androidx.compose.runtime.snapshots.t$b */
    public static final class b extends RestrictedSuspendLambda implements Y41.p<AbstractC43032o<? super Long>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public long[] f38740q;

        /* renamed from: r, reason: collision with root package name */
        public int f38741r;

        /* renamed from: s, reason: collision with root package name */
        public int f38742s;

        /* renamed from: t, reason: collision with root package name */
        public int f38743t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f38744u;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            b bVar = C22174t.this.new b(continuation);
            bVar.f38744u = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(AbstractC43032o<? super Long> abstractC43032o, Continuation<? super G0> continuation) {
            return ((b) create(abstractC43032o, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0077 -> B:19:0x007a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a6 -> B:32:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a9 -> B:32:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d7 -> B:44:0x00dc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00da -> B:44:0x00dc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C22174t.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C22174t(long j12, long j13, long j14, long[] jArr) {
        this.f38736b = j12;
        this.f38737c = j13;
        this.f38738d = j14;
        this.f38739e = jArr;
    }

    @Y61.k
    public final C22174t a(@Y61.k C22174t c22174t) {
        C22174t c22174tB;
        long[] jArr;
        C22174t c22174t2 = f38735g;
        if (c22174t == c22174t2) {
            return this;
        }
        if (this == c22174t2) {
            return c22174t2;
        }
        long j12 = c22174t.f38738d;
        long j13 = this.f38738d;
        long[] jArr2 = c22174t.f38739e;
        long j14 = c22174t.f38737c;
        long j15 = c22174t.f38736b;
        if (j12 == j13 && jArr2 == (jArr = this.f38739e)) {
            return new C22174t(this.f38736b & (~j15), this.f38737c & (~j14), j13, jArr);
        }
        if (jArr2 != null) {
            c22174tB = this;
            for (long j16 : jArr2) {
                c22174tB = c22174tB.b(j16);
            }
        } else {
            c22174tB = this;
        }
        long j17 = 0;
        long j18 = c22174t.f38738d;
        if (j14 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((j14 & (1 << i12)) != 0) {
                    c22174tB = c22174tB.b(i12 + j18);
                }
            }
        }
        if (j15 != 0) {
            int i13 = 0;
            while (i13 < 64) {
                if (((1 << i13) & j15) != j17) {
                    c22174tB = c22174tB.b(i13 + j18 + 64);
                }
                i13++;
                j17 = 0;
            }
        }
        return c22174tB;
    }

    @Y61.k
    public final C22174t b(long j12) {
        long[] jArr;
        int iA2;
        long[] jArr2;
        long j13 = this.f38738d;
        long j14 = j12 - j13;
        if (j14 >= 0 && j14 < 64) {
            long j15 = 1 << ((int) j14);
            long j16 = this.f38737c;
            if ((j16 & j15) != 0) {
                return new C22174t(this.f38736b, j16 & (~j15), j13, this.f38739e);
            }
        } else if (j14 >= 64 && j14 < 128) {
            long j17 = 1 << (((int) j14) - 64);
            long j18 = this.f38736b;
            if ((j18 & j17) != 0) {
                return new C22174t(j18 & (~j17), this.f38737c, j13, this.f38739e);
            }
        } else if (j14 < 0 && (jArr = this.f38739e) != null && (iA2 = C22175u.a(jArr, j12)) >= 0) {
            int length = jArr.length;
            int i12 = length - 1;
            if (i12 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i12];
                if (iA2 > 0) {
                    C42756l.n(jArr, jArr3, 0, 0, iA2);
                }
                if (iA2 < i12) {
                    C42756l.n(jArr, jArr3, iA2, iA2 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new C22174t(this.f38736b, this.f38737c, this.f38738d, jArr2);
        }
        return this;
    }

    public final boolean d(long j12) {
        long[] jArr;
        long j13 = j12 - this.f38738d;
        if (j13 < 0 || j13 >= 64) {
            if (j13 < 64 || j13 >= 128) {
                if (j13 <= 0 && (jArr = this.f38739e) != null && C22175u.a(jArr, j12) >= 0) {
                    return true;
                }
            } else if (((1 << (((int) j13) - 64)) & this.f38736b) != 0) {
                return true;
            }
        } else if (((1 << ((int) j13)) & this.f38737c) != 0) {
            return true;
        }
        return false;
    }

    @Y61.k
    public final C22174t e(@Y61.k C22174t c22174t) {
        C22174t c22174tG;
        long[] jArr;
        C22174t c22174tG2 = c22174t;
        C22174t c22174t2 = f38735g;
        if (c22174tG2 == c22174t2) {
            return this;
        }
        if (this == c22174t2) {
            return c22174tG2;
        }
        long j12 = c22174tG2.f38738d;
        long j13 = this.f38738d;
        long j14 = this.f38737c;
        long j15 = this.f38736b;
        long[] jArr2 = c22174tG2.f38739e;
        long j16 = c22174tG2.f38737c;
        long j17 = c22174tG2.f38736b;
        if (j12 == j13 && jArr2 == (jArr = this.f38739e)) {
            return new C22174t(j15 | j17, j14 | j16, j13, jArr);
        }
        long j18 = 1;
        long[] jArr3 = this.f38739e;
        if (jArr3 == null) {
            if (jArr3 != null) {
                for (long j19 : jArr3) {
                    c22174tG2 = c22174tG2.g(j19);
                }
            }
            long j22 = this.f38738d;
            if (j14 != 0) {
                for (int i12 = 0; i12 < 64; i12++) {
                    if (((1 << i12) & j14) != 0) {
                        c22174tG2 = c22174tG2.g(i12 + j22);
                    }
                }
            }
            if (j15 == 0) {
                return c22174tG2;
            }
            int i13 = 0;
            while (i13 < 64) {
                if (((j18 << i13) & j15) != 0) {
                    c22174tG2 = c22174tG2.g(i13 + j22 + 64);
                }
                i13++;
                j18 = 1;
            }
            return c22174tG2;
        }
        if (jArr2 != null) {
            c22174tG = this;
            for (long j23 : jArr2) {
                c22174tG = c22174tG.g(j23);
            }
        } else {
            c22174tG = this;
        }
        long j24 = c22174tG2.f38738d;
        if (j16 != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if ((j16 & (1 << i14)) != 0) {
                    c22174tG = c22174tG.g(i14 + j24);
                }
            }
        }
        if (j17 != 0) {
            for (int i15 = 0; i15 < 64; i15++) {
                if (((1 << i15) & j17) != 0) {
                    c22174tG = c22174tG.g(i15 + j24 + 64);
                }
            }
        }
        return c22174tG;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.snapshots.C22174t g(long r31) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C22174t.g(long):androidx.compose.runtime.snapshots.t");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.p, kotlin.coroutines.jvm.internal.RestrictedSuspendLambda] */
    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<Long> iterator() {
        return C43033p.v(new C43034q(new b(null)).f410561a);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(C42745f0.q(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            i12++;
            if (i12 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) String.valueOf(obj));
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}

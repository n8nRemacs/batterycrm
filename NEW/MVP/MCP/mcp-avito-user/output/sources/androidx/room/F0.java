package androidx.room;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RoomSQLiteQuery.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/F0;", "LZ1/g;", "LZ1/f;", "a", "b", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public final class F0 implements Z1.g, Z1.f {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final b f54255j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final TreeMap<Integer, F0> f54256k = new TreeMap<>();

    /* renamed from: b, reason: collision with root package name */
    @j.k0
    public final int f54257b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public volatile String f54258c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final long[] f54259d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final double[] f54260e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String[] f54261f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final byte[][] f54262g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final int[] f54263h;

    /* renamed from: i, reason: collision with root package name */
    public int f54264i;

    /* compiled from: RoomSQLiteQuery.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/F0$a;", "", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface a {
    }

    /* compiled from: RoomSQLiteQuery.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/room/F0$b;", "", "<init>", "()V", "", "BLOB", "I", "DOUBLE", "LONG", "NULL", "STRING", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public F0(int i12, C42822w c42822w) {
        this.f54257b = i12;
        int i13 = i12 + 1;
        this.f54263h = new int[i13];
        this.f54259d = new long[i13];
        this.f54260e = new double[i13];
        this.f54261f = new String[i13];
        this.f54262g = new byte[i13][];
    }

    @X41.n
    @Y61.k
    public static final F0 c(int i12, @Y61.k String str) {
        f54255j.getClass();
        TreeMap<Integer, F0> treeMap = f54256k;
        synchronized (treeMap) {
            Map.Entry<Integer, F0> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i12));
            if (entryCeilingEntry != null) {
                treeMap.remove(entryCeilingEntry.getKey());
                F0 value = entryCeilingEntry.getValue();
                value.f54258c = str;
                value.f54264i = i12;
                return value;
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            F0 f02 = new F0(i12, null);
            f02.f54258c = str;
            f02.f54264i = i12;
            return f02;
        }
    }

    @Override // Z1.f
    public final void B4(int i12) {
        this.f54263h[i12] = 1;
    }

    @Override // Z1.g
    @Y61.k
    /* renamed from: a */
    public final String getF19815b() {
        String str = this.f54258c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // Z1.g
    public final void b(@Y61.k Z1.f fVar) {
        int i12 = this.f54264i;
        if (1 > i12) {
            return;
        }
        int i13 = 1;
        while (true) {
            int i14 = this.f54263h[i13];
            if (i14 == 1) {
                fVar.B4(i13);
            } else if (i14 == 2) {
                fVar.g1(i13, this.f54259d[i13]);
            } else if (i14 == 3) {
                fVar.f3(this.f54260e[i13], i13);
            } else if (i14 == 4) {
                String str = this.f54261f[i13];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                fVar.h4(i13, str);
            } else if (i14 == 5) {
                byte[] bArr = this.f54262g[i13];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                fVar.u4(i13, bArr);
            }
            if (i13 == i12) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void d() {
        TreeMap<Integer, F0> treeMap = f54256k;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f54257b), this);
            f54255j.getClass();
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i12 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i12;
                }
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    @Override // Z1.f
    public final void f3(double d12, int i12) {
        this.f54263h[i12] = 3;
        this.f54260e[i12] = d12;
    }

    @Override // Z1.f
    public final void g1(int i12, long j12) {
        this.f54263h[i12] = 2;
        this.f54259d[i12] = j12;
    }

    @Override // Z1.f
    public final void h4(int i12, @Y61.k String str) {
        this.f54263h[i12] = 4;
        this.f54261f[i12] = str;
    }

    @Override // Z1.f
    public final void u4(int i12, @Y61.k byte[] bArr) {
        this.f54263h[i12] = 5;
        this.f54262g[i12] = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

package androidx.constraintlayout.core;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Arrays;

/* loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {

    /* renamed from: b, reason: collision with root package name */
    public boolean f43175b;

    /* renamed from: f, reason: collision with root package name */
    public float f43179f;

    /* renamed from: j, reason: collision with root package name */
    public Type f43183j;

    /* renamed from: c, reason: collision with root package name */
    public int f43176c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f43177d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f43178e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43180g = false;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f43181h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f43182i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    public b[] f43184k = new b[16];

    /* renamed from: l, reason: collision with root package name */
    public int f43185l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f43186m = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f43187b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f43188c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f43189d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f43190e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Type[] f43191f;

        static {
            Type type = new Type("UNRESTRICTED", 0);
            f43187b = type;
            Type type2 = new Type("CONSTANT", 1);
            Type type3 = new Type("SLACK", 2);
            f43188c = type3;
            Type type4 = new Type("ERROR", 3);
            f43189d = type4;
            Type type5 = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
            f43190e = type5;
            f43191f = new Type[]{type, type2, type3, type4, type5};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f43191f.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43192a;

        static {
            int[] iArr = new int[Type.values().length];
            f43192a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43192a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43192a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43192a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43192a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SolverVariable(Type type) {
        this.f43183j = type;
    }

    public final void a(b bVar) {
        int i12 = 0;
        while (true) {
            int i13 = this.f43185l;
            if (i12 >= i13) {
                b[] bVarArr = this.f43184k;
                if (i13 >= bVarArr.length) {
                    this.f43184k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f43184k;
                int i14 = this.f43185l;
                bVarArr2[i14] = bVar;
                this.f43185l = i14 + 1;
                return;
            }
            if (this.f43184k[i12] == bVar) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void b(b bVar) {
        int i12 = this.f43185l;
        int i13 = 0;
        while (i13 < i12) {
            if (this.f43184k[i13] == bVar) {
                while (i13 < i12 - 1) {
                    b[] bVarArr = this.f43184k;
                    int i14 = i13 + 1;
                    bVarArr[i13] = bVarArr[i14];
                    i13 = i14;
                }
                this.f43185l--;
                return;
            }
            i13++;
        }
    }

    public final void c() {
        this.f43183j = Type.f43190e;
        this.f43178e = 0;
        this.f43176c = -1;
        this.f43177d = -1;
        this.f43179f = 0.0f;
        this.f43180g = false;
        int i12 = this.f43185l;
        for (int i13 = 0; i13 < i12; i13++) {
            this.f43184k[i13] = null;
        }
        this.f43185l = 0;
        this.f43186m = 0;
        this.f43175b = false;
        Arrays.fill(this.f43182i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(SolverVariable solverVariable) {
        return this.f43176c - solverVariable.f43176c;
    }

    public final void d(e eVar, float f12) {
        this.f43179f = f12;
        this.f43180g = true;
        int i12 = this.f43185l;
        this.f43177d = -1;
        for (int i13 = 0; i13 < i12; i13++) {
            this.f43184k[i13].h(eVar, this, false);
        }
        this.f43185l = 0;
    }

    public final void e(e eVar, b bVar) {
        int i12 = this.f43185l;
        for (int i13 = 0; i13 < i12; i13++) {
            this.f43184k[i13].i(eVar, bVar, false);
        }
        this.f43185l = 0;
    }

    public final String toString() {
        return "" + this.f43176c;
    }
}

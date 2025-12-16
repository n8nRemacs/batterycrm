package e11;

import com.my.target.C37788h;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: e11.k1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39882k1 {

    /* renamed from: A, reason: collision with root package name */
    @j.P
    public Boolean f394632A;

    /* renamed from: B, reason: collision with root package name */
    @j.P
    public Boolean f394633B;

    /* renamed from: C, reason: collision with root package name */
    @j.P
    public Boolean f394634C;

    /* renamed from: D, reason: collision with root package name */
    @j.P
    public Boolean f394635D;

    /* renamed from: E, reason: collision with root package name */
    @j.P
    public Boolean f394636E;

    /* renamed from: F, reason: collision with root package name */
    @j.P
    public Boolean f394637F;

    /* renamed from: G, reason: collision with root package name */
    @j.P
    public Boolean f394638G;

    /* renamed from: H, reason: collision with root package name */
    @j.P
    public Boolean f394639H;

    /* renamed from: I, reason: collision with root package name */
    @j.P
    public Boolean f394640I;

    /* renamed from: J, reason: collision with root package name */
    @j.P
    public C1 f394641J;

    /* renamed from: K, reason: collision with root package name */
    @j.P
    public C37788h f394642K;

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f394643a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final String f394644b;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public ArrayList<X1> f394648f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public ArrayList<n2> f394649g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public C39882k1 f394650h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public String f394651i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public String f394652j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public String f394653k;

    /* renamed from: l, reason: collision with root package name */
    public int f394654l;

    /* renamed from: t, reason: collision with root package name */
    public boolean f394662t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f394663u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f394664v;

    /* renamed from: x, reason: collision with root package name */
    @j.P
    public Boolean f394666x;

    /* renamed from: y, reason: collision with root package name */
    @j.P
    public Boolean f394667y;

    /* renamed from: z, reason: collision with root package name */
    @j.P
    public Boolean f394668z;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final ArrayList<C39882k1> f394645c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final ArrayList<X1> f394646d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final e2 f394647e = new e2();

    /* renamed from: m, reason: collision with root package name */
    public int f394655m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f394656n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f394657o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f394658p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f394659q = -1;

    /* renamed from: r, reason: collision with root package name */
    public float f394660r = -1.0f;

    /* renamed from: s, reason: collision with root package name */
    public float f394661s = -1.0f;

    /* renamed from: w, reason: collision with root package name */
    public float f394665w = -1.0f;

    public C39882k1(@j.N String str, @j.P String str2) {
        this.f394644b = str;
        this.f394643a = str2;
    }

    @j.N
    public final ArrayList<X1> a(@j.N String str) {
        ArrayList<X1> arrayList = new ArrayList<>();
        Iterator<X1> it = this.f394646d.iterator();
        while (it.hasNext()) {
            X1 next = it.next();
            if (str.equals(next.f394506a)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final void b(int i12) {
        this.f394656n = i12;
        C39882k1 c39882k1 = this.f394650h;
        if (c39882k1 != null) {
            c39882k1.b(i12);
        }
    }
}

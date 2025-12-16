package Cb1;

import Db1.a;
import Fc1.W4;
import Fc1.X6;
import Fc1.a8;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCb1/i;", "", "a", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class i {

    /* renamed from: C, reason: collision with root package name */
    @k
    public static final a f2318C = new a(null);

    /* renamed from: A, reason: collision with root package name */
    @k
    public final d f2319A;

    /* renamed from: B, reason: collision with root package name */
    @k
    public final d f2320B;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f2321a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f2322b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f2323c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f2324d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final b f2325e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final b f2326f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final b f2327g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final b f2328h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final b f2329i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final b f2330j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final b f2331k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final b f2332l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final b f2333m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final b f2334n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final b f2335o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final b f2336p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final b f2337q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final b f2338r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final b f2339s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final b f2340t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final c f2341u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final c f2342v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2343w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final d f2344x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public final d f2345y;

    /* renamed from: z, reason: collision with root package name */
    @k
    public final d f2346z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCb1/i$a;", "", "<init>", "()V", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public a() {
        }

        @k
        public static i a(@f0 int i12) {
            X6 x62 = W4.a.f5280a;
            if (x62 == null) {
                x62 = null;
            }
            TypedArray typedArrayObtainStyledAttributes = x62.f5319a.obtainStyledAttributes(i12, a.o.f3260c);
            try {
                return new i(typedArrayObtainStyledAttributes);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public i(@k TypedArray typedArray) {
        b bVar = new b(typedArray, 0, Color.parseColor("#FFFFFF"));
        b bVar2 = new b(typedArray, 16, Color.parseColor("#B5B8C2"));
        b bVar3 = new b(typedArray, 25, Color.parseColor("#232735"));
        b bVar4 = new b(typedArray, 26, Color.parseColor("#505565"));
        b bVar5 = new b(typedArray, 27, Color.parseColor("#8B90A0"));
        b bVar6 = new b(typedArray, 24, Color.parseColor("#0076C2"));
        b bVar7 = new b(typedArray, 8, Color.parseColor("#E84047"));
        b bVar8 = new b(typedArray, 9, Color.parseColor("#7FE84047"));
        b bVar9 = new b(typedArray, 1, Color.parseColor("#0076C2"));
        b bVar10 = new b(typedArray, 2, Color.parseColor("#1983C8"));
        b bVar11 = new b(typedArray, 4, Color.parseColor("#FFFFFF"));
        b bVar12 = new b(typedArray, 21, Color.parseColor("#F3F3F3"));
        b bVar13 = new b(typedArray, 22, Color.parseColor("#D3D4D8"));
        b bVar14 = new b(typedArray, 5, Color.parseColor("#F3F3F3"));
        b bVar15 = new b(typedArray, 6, Color.parseColor("#DBF1FF"));
        b bVar16 = new b(typedArray, 7, Color.parseColor("#FFFFFF"));
        b bVar17 = new b(typedArray, 20, Color.parseColor("#FECA00"));
        b bVar18 = new b(typedArray, 17, Color.parseColor("#FECA00"));
        b bVar19 = new b(typedArray, 18, Color.parseColor("#232735"));
        b bVar20 = new b(typedArray, 19, Color.parseColor("#E84047"));
        c cVar = new c(typedArray, 15, Resources.getSystem().getDisplayMetrics().density * 8.0f);
        c cVar2 = new c(typedArray, 3, Resources.getSystem().getDisplayMetrics().density * 4.0f);
        boolean z12 = typedArray.getBoolean(23, false);
        d dVar = new d(typedArray, 11, 500, 24);
        d dVar2 = new d(typedArray, 12, 500, 20);
        d dVar3 = new d(typedArray, 13, Constants.MINIMAL_ERROR_STATUS_CODE, 16);
        d dVar4 = new d(typedArray, 14, Constants.MINIMAL_ERROR_STATUS_CODE, 14);
        d dVar5 = new d(typedArray, 10, 500, 14);
        this.f2321a = bVar;
        this.f2322b = bVar2;
        this.f2323c = bVar3;
        this.f2324d = bVar4;
        this.f2325e = bVar5;
        this.f2326f = bVar6;
        this.f2327g = bVar7;
        this.f2328h = bVar8;
        this.f2329i = bVar9;
        this.f2330j = bVar10;
        this.f2331k = bVar11;
        this.f2332l = bVar12;
        this.f2333m = bVar13;
        this.f2334n = bVar14;
        this.f2335o = bVar15;
        this.f2336p = bVar16;
        this.f2337q = bVar17;
        this.f2338r = bVar18;
        this.f2339s = bVar19;
        this.f2340t = bVar20;
        this.f2341u = cVar;
        this.f2342v = cVar2;
        this.f2343w = z12;
        this.f2344x = dVar;
        this.f2345y = dVar2;
        this.f2346z = dVar3;
        this.f2319A = dVar4;
        this.f2320B = dVar5;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f2321a, iVar.f2321a) && L.f(this.f2322b, iVar.f2322b) && L.f(this.f2323c, iVar.f2323c) && L.f(this.f2324d, iVar.f2324d) && L.f(this.f2325e, iVar.f2325e) && L.f(this.f2326f, iVar.f2326f) && L.f(this.f2327g, iVar.f2327g) && L.f(this.f2328h, iVar.f2328h) && L.f(this.f2329i, iVar.f2329i) && L.f(this.f2330j, iVar.f2330j) && L.f(this.f2331k, iVar.f2331k) && L.f(this.f2332l, iVar.f2332l) && L.f(this.f2333m, iVar.f2333m) && L.f(this.f2334n, iVar.f2334n) && L.f(this.f2335o, iVar.f2335o) && L.f(this.f2336p, iVar.f2336p) && L.f(this.f2337q, iVar.f2337q) && L.f(this.f2338r, iVar.f2338r) && L.f(this.f2339s, iVar.f2339s) && L.f(this.f2340t, iVar.f2340t) && L.f(this.f2341u, iVar.f2341u) && L.f(this.f2342v, iVar.f2342v) && this.f2343w == iVar.f2343w && L.f(this.f2344x, iVar.f2344x) && L.f(this.f2345y, iVar.f2345y) && L.f(this.f2346z, iVar.f2346z) && L.f(this.f2319A, iVar.f2319A) && L.f(this.f2320B, iVar.f2320B);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f2342v.hashCode() + ((this.f2341u.hashCode() + a8.a(this.f2340t, a8.a(this.f2339s, a8.a(this.f2338r, a8.a(this.f2337q, a8.a(this.f2336p, a8.a(this.f2335o, a8.a(this.f2334n, a8.a(this.f2333m, a8.a(this.f2332l, a8.a(this.f2331k, a8.a(this.f2330j, a8.a(this.f2329i, a8.a(this.f2328h, a8.a(this.f2327g, a8.a(this.f2326f, a8.a(this.f2325e, a8.a(this.f2324d, a8.a(this.f2323c, a8.a(this.f2322b, this.f2321a.hashCode() * 31)))))))))))))))))))) * 31)) * 31;
        boolean z12 = this.f2343w;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return this.f2320B.hashCode() + ((this.f2319A.hashCode() + ((this.f2346z.hashCode() + ((this.f2345y.hashCode() + ((this.f2344x.hashCode() + ((iHashCode + i12) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "UxFbTheme(bgColor=" + this.f2321a + ", iconColor=" + this.f2322b + ", text01Color=" + this.f2323c + ", text02Color=" + this.f2324d + ", text03Color=" + this.f2325e + ", mainColor=" + this.f2326f + ", errorColorPrimary=" + this.f2327g + ", errorColorSecondary=" + this.f2328h + ", btnBgColor=" + this.f2329i + ", btnBgColorActive=" + this.f2330j + ", btnTextColor=" + this.f2331k + ", inputBgColor=" + this.f2332l + ", inputBorderColor=" + this.f2333m + ", controlBgColor=" + this.f2334n + ", controlBgColorActive=" + this.f2335o + ", controlIconColor=" + this.f2336p + ", iconStarColor=" + this.f2337q + ", iconSmile1Color=" + this.f2338r + ", iconSmile2Color=" + this.f2339s + ", iconSmile3Color=" + this.f2340t + ", formBorderRadius=" + this.f2341u + ", btnBorderRadius=" + this.f2342v + ", lightNavigationBar=" + this.f2343w + ", fontH1=" + this.f2344x + ", fontH2=" + this.f2345y + ", fontP1=" + this.f2346z + ", fontP2=" + this.f2319A + ", fontBtn=" + this.f2320B + ')';
    }
}

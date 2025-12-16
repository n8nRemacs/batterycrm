package androidx.window.core;

import androidx.camera.camera2.internal.G;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: Version.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/core/p;", "", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p implements Comparable<p> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f55200g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final p f55201h;

    /* renamed from: b, reason: collision with root package name */
    public final int f55202b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55203c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55204d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f55205e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f55206f;

    /* compiled from: Version.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/core/p$a;", "", "<init>", "()V", "", "VERSION_PATTERN_STRING", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.l
        public static p a(@Y61.l String str) throws NumberFormatException {
            String strGroup;
            if (str != null && !C43066x.K(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                    int i12 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    if (strGroup2 != null) {
                        int i13 = Integer.parseInt(strGroup2);
                        String strGroup3 = matcher.group(3);
                        if (strGroup3 != null) {
                            return new p(i12, i13, Integer.parseInt(strGroup3), matcher.group(4) != null ? matcher.group(4) : "", null);
                        }
                    }
                }
            }
            return null;
        }

        public a() {
        }
    }

    /* compiled from: Version.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends N implements Y41.a<BigInteger> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final BigInteger invoke() {
            p pVar = p.this;
            return BigInteger.valueOf(pVar.f55202b).shiftLeft(32).or(BigInteger.valueOf(pVar.f55203c)).shiftLeft(32).or(BigInteger.valueOf(pVar.f55204d));
        }
    }

    static {
        new p(0, 0, "", 0);
        f55201h = new p(0, 1, "", 0);
        new p(1, 0, "", 0);
    }

    public /* synthetic */ p(int i12, int i13, int i14, String str, C42822w c42822w) {
        this(i12, i13, str, i14);
    }

    @Override // java.lang.Comparable
    public final int compareTo(p pVar) {
        return ((BigInteger) this.f55206f.getValue()).compareTo((BigInteger) pVar.f55206f.getValue());
    }

    public final boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f55202b == pVar.f55202b && this.f55203c == pVar.f55203c && this.f55204d == pVar.f55204d;
    }

    public final int hashCode() {
        return ((((527 + this.f55202b) * 31) + this.f55203c) * 31) + this.f55204d;
    }

    @Y61.k
    public final String toString() {
        String str = this.f55205e;
        String strF = !C43066x.K(str) ? G.f("-", str) : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f55202b);
        sb2.append('.');
        sb2.append(this.f55203c);
        sb2.append('.');
        return AK.c.i(this.f55204d, strF, sb2);
    }

    public p(int i12, int i13, String str, int i14) {
        this.f55202b = i12;
        this.f55203c = i13;
        this.f55204d = i14;
        this.f55205e = str;
        this.f55206f = C42727D.c(new b());
    }
}

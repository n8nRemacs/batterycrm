package IZ0;

/* compiled from: Bounds.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f8198a;

    /* renamed from: b, reason: collision with root package name */
    public final double f8199b;

    /* renamed from: c, reason: collision with root package name */
    public final double f8200c;

    /* renamed from: d, reason: collision with root package name */
    public final double f8201d;

    /* renamed from: e, reason: collision with root package name */
    public final double f8202e;

    /* renamed from: f, reason: collision with root package name */
    public final double f8203f;

    public a(double d12, double d13, double d14, double d15) {
        this.f8198a = d12;
        this.f8199b = d14;
        this.f8200c = d13;
        this.f8201d = d15;
        this.f8202e = (d12 + d13) / 2.0d;
        this.f8203f = (d14 + d15) / 2.0d;
    }

    public final boolean a(double d12, double d13) {
        return this.f8198a <= d12 && d12 <= this.f8200c && this.f8199b <= d13 && d13 <= this.f8201d;
    }
}

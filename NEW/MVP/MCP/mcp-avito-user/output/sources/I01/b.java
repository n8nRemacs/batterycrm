package i01;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f398338b = new b();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f398339a;

    public b() throws ClassNotFoundException {
        try {
            Class.forName("com.huawei.appgallery.log.LogAdaptor");
            this.f398339a = true;
        } catch (ClassNotFoundException unused) {
            this.f398339a = false;
        }
    }

    public final void a(String str, String str2) {
        if (this.f398339a) {
            C41206a.f398337a.e(str, str2);
        }
    }

    public final void b(String str, String str2, Exception exc) {
        if (this.f398339a) {
            C41206a.f398337a.e(str, str2, exc);
        }
    }

    public final void c(String str, String str2) {
        if (this.f398339a) {
            C41206a.f398337a.i(str, str2);
        }
    }

    public final void d(String str) {
        if (this.f398339a) {
            C41206a.f398337a.w("X509CertUtil", str);
        }
    }
}

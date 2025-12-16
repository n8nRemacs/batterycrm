package x01;

/* loaded from: classes7.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    public G f441986a;

    /* renamed from: b, reason: collision with root package name */
    public G f441987b;

    public final G a(String str) {
        if (str.equals("oper")) {
            return this.f441987b;
        }
        if (str.equals("maint")) {
            return this.f441986a;
        }
        if (str.equals("diffprivacy") || str.equals("preins")) {
            return null;
        }
        m0.e("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: ".concat(str));
        return null;
    }
}

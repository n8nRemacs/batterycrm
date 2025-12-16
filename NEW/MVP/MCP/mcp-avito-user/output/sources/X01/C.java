package x01;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public String f441946a;

    /* renamed from: b, reason: collision with root package name */
    public M f441947b;

    public final boolean a(int i12) {
        G g12;
        if (i12 == 2) {
            if ("_default_config_tag".equals(this.f441946a)) {
                return true;
            }
            m0.d("hmsSdk", "verifyURL(): type: preins. Only default config can report Pre-install data.");
            return false;
        }
        M m12 = this.f441947b;
        if (i12 == 0) {
            g12 = m12.f441987b;
        } else if (i12 != 1) {
            g12 = null;
            if (i12 == 2 || i12 == 3) {
                m12.getClass();
            }
        } else {
            g12 = m12.f441986a;
        }
        if (g12 != null && !TextUtils.isEmpty(g12.f441952a)) {
            return true;
        }
        m0.d("hmsSdk", "verifyURL(): URL check failed. type: " + i12);
        return false;
    }
}

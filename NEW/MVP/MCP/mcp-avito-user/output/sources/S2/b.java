package s2;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.L;
import kotlin.text.C43059p;
import org.webrtc.h;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final C43059p f437302e = new C43059p("\\r\\n|\\r|\\n|\\t");

    /* renamed from: a, reason: collision with root package name */
    public final String f437303a;

    /* renamed from: b, reason: collision with root package name */
    public final String f437304b = a(null, "");

    /* renamed from: c, reason: collision with root package name */
    public final String f437305c = a(null, "");

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f437306d = new LinkedHashMap();

    public b(String str) {
        this.f437303a = a(str, "unknownAction");
    }

    public static String a(String str, String str2) {
        String strF;
        if (str == null || str.length() == 0) {
            strF = "";
        } else {
            strF = f437302e.f(str.replace('=', '-'), " ");
            if (strF.length() > 256) {
                strF = strF.substring(0, 256);
            }
        }
        return strF.length() == 0 ? str2 : strF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null) || hashCode() != obj.hashCode()) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f437303a, bVar.f437303a) && L.f(this.f437304b, bVar.f437304b) && L.f(this.f437305c, bVar.f437305c) && L.f(this.f437306d, bVar.f437306d);
    }

    public final int hashCode() {
        return this.f437306d.hashCode() + AbstractC47961a.a(this.f437305c, AbstractC47961a.a(this.f437304b, ((this.f437303a.hashCode() * 31) - 1146830912) * 31));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClickstreamEvent(eventAction=");
        sb2.append(this.f437303a);
        sb2.append(", internalEventType=business, internalEventCategory=");
        sb2.append(this.f437304b);
        sb2.append(", internalValue=");
        sb2.append(this.f437305c);
        sb2.append(", properties=");
        return h.e(sb2, this.f437306d, ')');
    }
}

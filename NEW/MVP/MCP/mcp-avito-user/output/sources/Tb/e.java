package Tb;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AssistantChatResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTb/e;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DeepLink f15741a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15742b;

    public e(@k DeepLink deepLink, boolean z12) {
        this.f15741a = deepLink;
        this.f15742b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f15741a, eVar.f15741a) && this.f15742b == eVar.f15742b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15742b) + (this.f15741a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Feedback(deeplink=");
        sb2.append(this.f15741a);
        sb2.append(", shouldTrigger=");
        return r.x(sb2, this.f15742b, ')');
    }
}

package oB;

import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/b;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oB.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C44616b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<Image> f419504b;

    /* renamed from: c, reason: collision with root package name */
    public final int f419505c;

    public C44616b(@Y61.k List<Image> list, int i12) {
        this.f419504b = list;
        this.f419505c = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44616b)) {
            return false;
        }
        C44616b c44616b = (C44616b) obj;
        return L.f(this.f419504b, c44616b.f419504b) && this.f419505c == c44616b.f419505c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f419505c) + (this.f419504b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AboutV2ImageClickAction(images=");
        sb2.append(this.f419504b);
        sb2.append(", index=");
        return androidx.appcompat.app.r.t(sb2, this.f419505c, ')');
    }
}

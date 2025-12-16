package Ry0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: StrCancellationSettingsResponse.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRy0/e;", "", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f14771a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f14772b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f14773c;

    public e(@k ArrayList arrayList, @k ArrayList arrayList2, @k ArrayList arrayList3) {
        this.f14771a = arrayList;
        this.f14772b = arrayList2;
        this.f14773c = arrayList3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f14771a.equals(eVar.f14771a) && this.f14772b.equals(eVar.f14772b) && this.f14773c.equals(eVar.f14773c);
    }

    public final int hashCode() {
        return this.f14773c.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f14772b, this.f14771a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrCancellationExplanationBlocks(cancellationNotEnabled=");
        sb2.append(this.f14771a);
        sb2.append(", cancellationEnabled=");
        sb2.append(this.f14772b);
        sb2.append(", discountEnabled=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f14773c, ')');
    }
}

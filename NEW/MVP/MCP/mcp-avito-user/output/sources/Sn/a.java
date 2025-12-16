package SN;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsFakedoor.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSN/a;", "", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f14940a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f14941b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f14942c;

    public a(@l AttributedText attributedText, @k String str, @k ArrayList arrayList) {
        this.f14940a = str;
        this.f14941b = attributedText;
        this.f14942c = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f14940a, aVar.f14940a) && L.f(this.f14941b, aVar.f14941b) && this.f14942c.equals(aVar.f14942c);
    }

    public final int hashCode() {
        int iHashCode = this.f14940a.hashCode() * 31;
        AttributedText attributedText = this.f14941b;
        return this.f14942c.hashCode() + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsFakedoor(title=");
        sb2.append(this.f14940a);
        sb2.append(", subtitle=");
        sb2.append(this.f14941b);
        sb2.append(", blocks=");
        return e.p(sb2, this.f14942c, ')');
    }
}

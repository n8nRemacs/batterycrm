package B10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TitleAttributedValueBlock.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB10/d;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f798a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f799b;

    public d(@k String str, @k AttributedText attributedText) {
        this.f798a = str;
        this.f799b = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f798a, dVar.f798a) && L.f(this.f799b, dVar.f799b);
    }

    public final int hashCode() {
        return this.f799b.hashCode() + (this.f798a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleAttributedValueBlock(title=");
        sb2.append(this.f798a);
        sb2.append(", value=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f799b, ')');
    }
}

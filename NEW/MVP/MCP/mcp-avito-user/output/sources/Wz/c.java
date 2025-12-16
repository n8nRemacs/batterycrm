package WZ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ConsultationForm.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWZ/c;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f17947a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f17948b;

    public c(@k String str, @k ArrayList arrayList) {
        this.f17947a = str;
        this.f17948b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17947a.equals(cVar.f17947a) && this.f17948b.equals(cVar.f17948b);
    }

    public final int hashCode() {
        return this.f17948b.hashCode() + (this.f17947a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConsultationForm(phone=");
        sb2.append(this.f17947a);
        sb2.append(", slots=");
        return e.p(sb2, this.f17948b, ')');
    }
}

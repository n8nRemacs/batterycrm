package x10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DisclaimerItem.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx10/c;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f442087a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f442088b;

    public c(@k AttributedText attributedText, @k String str) {
        this.f442087a = attributedText;
        this.f442088b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f442087a, cVar.f442087a) && L.f(this.f442088b, cVar.f442088b);
    }

    public final int hashCode() {
        return this.f442088b.hashCode() + (this.f442087a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisclaimerText(text=");
        sb2.append(this.f442087a);
        sb2.append(", descriptionAttrName=");
        return C22026a.c(sb2, this.f442088b, ')');
    }
}

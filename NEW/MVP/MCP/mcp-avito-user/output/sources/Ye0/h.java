package YE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingBlocksInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYE0/h;", "", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f19405a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19406b;

    public h(@k AttributedText attributedText, @k String str) {
        this.f19405a = attributedText;
        this.f19406b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f19405a, hVar.f19405a) && L.f(this.f19406b, hVar.f19406b);
    }

    public final int hashCode() {
        return this.f19406b.hashCode() + (this.f19405a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TravelOnboardingDisclaimerBlock(disclaimer=");
        sb2.append(this.f19405a);
        sb2.append(", textIcon=");
        return C22026a.c(sb2, this.f19406b, ')');
    }
}

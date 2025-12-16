package eR;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import kotlin.Metadata;

/* compiled from: LanguageSelectorState.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeR/a;", "", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eR.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C40040a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f395183a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f395184b;

    public C40040a(boolean z12, @k String str) {
        this.f395183a = z12;
        this.f395184b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40040a)) {
            return false;
        }
        C40040a c40040a = (C40040a) obj;
        return this.f395183a == c40040a.f395183a && this.f395184b.equals(c40040a.f395184b);
    }

    public final int hashCode() {
        return this.f395184b.hashCode() + (Boolean.hashCode(this.f395183a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LanguageSelectConfirmationState(showConfirmation=");
        sb2.append(this.f395183a);
        sb2.append(", previousLanguage=");
        return C22026a.c(sb2, this.f395184b, ')');
    }
}

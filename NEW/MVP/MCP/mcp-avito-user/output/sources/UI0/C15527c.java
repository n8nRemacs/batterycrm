package Ui0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReferralContactsUiState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUi0/c;", "", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ui0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C15527c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f16561a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f16562b;

    /* JADX WARN: Multi-variable type inference failed */
    public C15527c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15527c)) {
            return false;
        }
        C15527c c15527c = (C15527c) obj;
        return L.f(this.f16561a, c15527c.f16561a) && L.f(this.f16562b, c15527c.f16562b);
    }

    public final int hashCode() {
        String str = this.f16561a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16562b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Placeholder(title=");
        sb2.append(this.f16561a);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f16562b, ')');
    }

    public C15527c(@l String str, @l String str2) {
        this.f16561a = str;
        this.f16562b = str2;
    }

    public /* synthetic */ C15527c(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }
}

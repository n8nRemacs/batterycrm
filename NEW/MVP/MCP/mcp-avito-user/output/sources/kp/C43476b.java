package kp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientsState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/b;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C43476b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DeepLink f413192a;

    public C43476b(@k DeepLink deepLink) {
        this.f413192a = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43476b)) {
            return false;
        }
        C43476b c43476b = (C43476b) obj;
        c43476b.getClass();
        return L.f(this.f413192a, c43476b.f413192a);
    }

    public final int hashCode() {
        return this.f413192a.hashCode() + (Integer.hashCode(R.string.clients_mortgage_entry_point) * 31);
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("ClientsBottomButtonState(textRes=2131952842, link="), this.f413192a, ')');
    }
}

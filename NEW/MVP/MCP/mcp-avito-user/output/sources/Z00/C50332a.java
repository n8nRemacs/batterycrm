package z00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ManagerUspState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz00/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z00.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C50332a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f443681a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f443682b;

    public C50332a(@k String str, @k DeepLink deepLink) {
        this.f443681a = str;
        this.f443682b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50332a)) {
            return false;
        }
        C50332a c50332a = (C50332a) obj;
        return L.f(this.f443681a, c50332a.f443681a) && L.f(this.f443682b, c50332a.f443682b);
    }

    public final int hashCode() {
        return this.f443682b.hashCode() + (this.f443681a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Action(title=");
        sb2.append(this.f443681a);
        sb2.append(", link=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f443682b, ')');
    }
}

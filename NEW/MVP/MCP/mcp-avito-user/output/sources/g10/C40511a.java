package g10;

import KZ.A;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FloatingNavigationConfig.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg10/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C40511a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final A f396231a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final A f396232b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ApplicationProcessType f396233c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f396234d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f396235e;

    public C40511a(@l A a12, @l A a13, @l ApplicationProcessType applicationProcessType, @l AttributedText attributedText, boolean z12) {
        this.f396231a = a12;
        this.f396232b = a13;
        this.f396233c = applicationProcessType;
        this.f396234d = attributedText;
        this.f396235e = z12;
    }

    public static C40511a a(C40511a c40511a, ApplicationProcessType applicationProcessType, int i12) {
        A a12 = c40511a.f396231a;
        A a13 = c40511a.f396232b;
        if ((i12 & 4) != 0) {
            applicationProcessType = c40511a.f396233c;
        }
        ApplicationProcessType applicationProcessType2 = applicationProcessType;
        AttributedText attributedText = c40511a.f396234d;
        boolean z12 = (i12 & 16) != 0 ? c40511a.f396235e : false;
        c40511a.getClass();
        return new C40511a(a12, a13, applicationProcessType2, attributedText, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40511a)) {
            return false;
        }
        C40511a c40511a = (C40511a) obj;
        return L.f(this.f396231a, c40511a.f396231a) && L.f(this.f396232b, c40511a.f396232b) && this.f396233c == c40511a.f396233c && L.f(this.f396234d, c40511a.f396234d) && this.f396235e == c40511a.f396235e;
    }

    public final int hashCode() {
        A a12 = this.f396231a;
        int iHashCode = (a12 == null ? 0 : a12.hashCode()) * 31;
        A a13 = this.f396232b;
        int iHashCode2 = (iHashCode + (a13 == null ? 0 : a13.hashCode())) * 31;
        ApplicationProcessType applicationProcessType = this.f396233c;
        int iHashCode3 = (iHashCode2 + (applicationProcessType == null ? 0 : applicationProcessType.hashCode())) * 31;
        AttributedText attributedText = this.f396234d;
        return Boolean.hashCode(this.f396235e) + ((iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FloatingNavigationConfig(nextButtonAction=");
        sb2.append(this.f396231a);
        sb2.append(", previousButtonAction=");
        sb2.append(this.f396232b);
        sb2.append(", loadingButtonType=");
        sb2.append(this.f396233c);
        sb2.append(", legalText=");
        sb2.append(this.f396234d);
        sb2.append(", enabled=");
        return r.x(sb2, this.f396235e, ')');
    }

    public /* synthetic */ C40511a(A a12, A a13, ApplicationProcessType applicationProcessType, AttributedText attributedText, boolean z12, int i12, C42822w c42822w) {
        this(a12, a13, (i12 & 4) != 0 ? null : applicationProcessType, (i12 & 8) != 0 ? null : attributedText, (i12 & 16) != 0 ? true : z12);
    }
}

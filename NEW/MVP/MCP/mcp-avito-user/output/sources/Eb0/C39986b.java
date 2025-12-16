package eB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureAdvanceManualLabelModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeB0/b;", "", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eB0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C39986b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f395050a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f395051b;

    public C39986b(@l String str, boolean z12) {
        this.f395050a = str;
        this.f395051b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39986b)) {
            return false;
        }
        C39986b c39986b = (C39986b) obj;
        return L.f(this.f395050a, c39986b.f395050a) && this.f395051b == c39986b.f395051b;
    }

    public final int hashCode() {
        String str = this.f395050a;
        return Boolean.hashCode(this.f395051b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CprConfigureAdvanceManualLabelModel(text=");
        sb2.append(this.f395050a);
        sb2.append(", isBiggerThenMinValue=");
        return r.x(sb2, this.f395051b, ')');
    }
}

package kP0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletSecuritySettingsViewState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkP0/b;", "", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kP0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C42616b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f406268a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f406269b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f406270c;

    public C42616b(@k String str, @k String str2, boolean z12) {
        this.f406268a = str;
        this.f406269b = str2;
        this.f406270c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42616b)) {
            return false;
        }
        C42616b c42616b = (C42616b) obj;
        return L.f(this.f406268a, c42616b.f406268a) && L.f(this.f406269b, c42616b.f406269b) && this.f406270c == c42616b.f406270c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f406270c) + H.d(this.f406268a.hashCode() * 31, 31, this.f406269b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletSecuritySettingsBiometryItem(title=");
        sb2.append(this.f406268a);
        sb2.append(", subtitle=");
        sb2.append(this.f406269b);
        sb2.append(", switchOn=");
        return r.x(sb2, this.f406270c, ')');
    }
}

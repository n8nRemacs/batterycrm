package kP0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletSecuritySettingsViewState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkP0/c;", "", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kP0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C42617c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f406271a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C42616b f406272b;

    public C42617c(@k String str, @k C42616b c42616b) {
        this.f406271a = str;
        this.f406272b = c42616b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42617c)) {
            return false;
        }
        C42617c c42617c = (C42617c) obj;
        return L.f(this.f406271a, c42617c.f406271a) && L.f(this.f406272b, c42617c.f406272b);
    }

    public final int hashCode() {
        return this.f406272b.hashCode() + (this.f406271a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "WalletSecuritySettingsLoginSection(title=" + this.f406271a + ", biometryItem=" + this.f406272b + ')';
    }
}

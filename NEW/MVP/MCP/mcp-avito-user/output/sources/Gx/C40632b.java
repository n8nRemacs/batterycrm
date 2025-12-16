package gX;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42158n;
import kotlin.Metadata;

/* compiled from: Utils.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgX/b;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C40632b {

    /* renamed from: a, reason: collision with root package name */
    public final int f396483a;

    /* renamed from: b, reason: collision with root package name */
    public final int f396484b;

    public C40632b(@InterfaceC42158n int i12, @InterfaceC42158n int i13) {
        this.f396483a = i12;
        this.f396484b = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40632b)) {
            return false;
        }
        C40632b c40632b = (C40632b) obj;
        return this.f396483a == c40632b.f396483a && this.f396484b == c40632b.f396484b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f396484b) + (Integer.hashCode(this.f396483a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QualityProgressBarColors(trackColorId=");
        sb2.append(this.f396483a);
        sb2.append(", indicatorColorId=");
        return r.t(sb2, this.f396484b, ')');
    }
}

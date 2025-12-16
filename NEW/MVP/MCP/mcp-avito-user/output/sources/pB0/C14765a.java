package Pb0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPb0/a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pb0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C14765a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f13145a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f13146b;

    public C14765a(@l String str, @k ArrayList arrayList) {
        this.f13145a = str;
        this.f13146b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14765a)) {
            return false;
        }
        C14765a c14765a = (C14765a) obj;
        return L.f(this.f13145a, c14765a.f13145a) && this.f13146b.equals(c14765a.f13146b);
    }

    public final int hashCode() {
        String str = this.f13145a;
        return this.f13146b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationData(description=");
        sb2.append(this.f13145a);
        sb2.append(", verifications=");
        return e.p(sb2, this.f13146b, ')');
    }
}

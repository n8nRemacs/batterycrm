package com.avito.android.license.data;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LicenseInfoDescriptor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/license/data/a;", "", "a", "_avito_license_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f181505a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f181506b;

    /* compiled from: LicenseInfoDescriptor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/license/data/a$a;", "", "<init>", "()V", "", "LICENCES_DIR", "Ljava/lang/String;", "_avito_license_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.license.data.a$a, reason: collision with other inner class name */
    public static final class C5333a {
        public /* synthetic */ C5333a(C42822w c42822w) {
            this();
        }

        public C5333a() {
        }
    }

    static {
        new C5333a(null);
    }

    public a(@k String str, @k List<String> list) {
        this.f181505a = str;
        this.f181506b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f181505a, aVar.f181505a) && L.f(this.f181506b, aVar.f181506b);
    }

    public final int hashCode() {
        return this.f181506b.hashCode() + (this.f181505a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LicenseInfoDescriptor(fileName=");
        sb2.append(this.f181505a);
        sb2.append(", titles=");
        return H.p(sb2, this.f181506b, ')');
    }
}

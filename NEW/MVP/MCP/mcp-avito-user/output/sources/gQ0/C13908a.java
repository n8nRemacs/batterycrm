package Gq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HintsDialogInitialData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGq0/a;", "", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C13908a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f6747a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f6748b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6749c;

    public C13908a(@k String str, @k String str2, boolean z12) {
        this.f6747a = str;
        this.f6748b = str2;
        this.f6749c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13908a)) {
            return false;
        }
        C13908a c13908a = (C13908a) obj;
        return L.f(this.f6747a, c13908a.f6747a) && this.f6748b.equals(c13908a.f6748b) && this.f6749c == c13908a.f6749c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6749c) + H.d(this.f6747a.hashCode() * 31, 31, this.f6748b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HintsDialogInitialData(hintId=");
        sb2.append(this.f6747a);
        sb2.append(", hintOpenPlace=");
        sb2.append(this.f6748b);
        sb2.append(", showHintMenu=");
        return r.x(sb2, this.f6749c, ')');
    }
}

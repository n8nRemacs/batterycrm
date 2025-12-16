package yi;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qi.C47400a;

/* compiled from: BeduinTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyi/a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C50254a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f443469a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f443470b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f443471c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f443472d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f443473e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C47400a f443474f;

    public C50254a(@k String str, @k String str2, @l String str3, @l String str4, @l String str5, @l C47400a c47400a) {
        this.f443469a = str;
        this.f443470b = str2;
        this.f443471c = str3;
        this.f443472d = str4;
        this.f443473e = str5;
        this.f443474f = c47400a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50254a)) {
            return false;
        }
        C50254a c50254a = (C50254a) obj;
        return L.f(this.f443469a, c50254a.f443469a) && L.f(this.f443470b, c50254a.f443470b) && L.f(this.f443471c, c50254a.f443471c) && L.f(this.f443472d, c50254a.f443472d) && L.f(this.f443473e, c50254a.f443473e) && L.f(this.f443474f, c50254a.f443474f);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f443469a.hashCode() * 31, 31, this.f443470b);
        String str = this.f443471c;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f443472d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f443473e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C47400a c47400a = this.f443474f;
        return iHashCode3 + (c47400a != null ? c47400a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BeduinTab(id=" + this.f443469a + ", title=" + this.f443470b + ", topId=" + this.f443471c + ", mainId=" + this.f443472d + ", bottomId=" + this.f443473e + ", onSelectedTabEvent=" + this.f443474f + ')';
    }
}

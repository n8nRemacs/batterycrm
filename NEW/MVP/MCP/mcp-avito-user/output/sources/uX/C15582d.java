package Ux;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessAdvertFeedbackState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUx/d;", "", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ux.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C15582d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f16795a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f16796b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f16797c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f16798d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f16799e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f16800f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16801g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16802h;

    public C15582d(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, boolean z12, boolean z13, @l String str6) {
        this.f16795a = str;
        this.f16796b = str2;
        this.f16797c = str3;
        this.f16798d = str4;
        this.f16799e = str5;
        this.f16800f = str6;
        this.f16801g = z12;
        this.f16802h = z13;
    }

    public static C15582d a(C15582d c15582d, String str, String str2, boolean z12, boolean z13, int i12) {
        String str3 = c15582d.f16795a;
        String str4 = c15582d.f16796b;
        String str5 = c15582d.f16797c;
        String str6 = c15582d.f16798d;
        if ((i12 & 16) != 0) {
            str = c15582d.f16799e;
        }
        String str7 = str;
        if ((i12 & 32) != 0) {
            str2 = c15582d.f16800f;
        }
        String str8 = str2;
        if ((i12 & 64) != 0) {
            z12 = c15582d.f16801g;
        }
        boolean z14 = z12;
        if ((i12 & 128) != 0) {
            z13 = c15582d.f16802h;
        }
        c15582d.getClass();
        return new C15582d(str3, str4, str5, str6, str7, z14, z13, str8);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15582d)) {
            return false;
        }
        C15582d c15582d = (C15582d) obj;
        return L.f(this.f16795a, c15582d.f16795a) && L.f(this.f16796b, c15582d.f16796b) && L.f(this.f16797c, c15582d.f16797c) && L.f(this.f16798d, c15582d.f16798d) && L.f(this.f16799e, c15582d.f16799e) && L.f(this.f16800f, c15582d.f16800f) && this.f16801g == c15582d.f16801g && this.f16802h == c15582d.f16802h;
    }

    public final int hashCode() {
        String str = this.f16795a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16796b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16797c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16798d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f16799e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f16800f;
        return Boolean.hashCode(this.f16802h) + r.i((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.f16801g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessAdvertFeedbackViewState(title=");
        sb2.append(this.f16795a);
        sb2.append(", subtitle=");
        sb2.append(this.f16796b);
        sb2.append(", reason=");
        sb2.append(this.f16797c);
        sb2.append(", hint=");
        sb2.append(this.f16798d);
        sb2.append(", feedbackText=");
        sb2.append(this.f16799e);
        sb2.append(", buttonText=");
        sb2.append(this.f16800f);
        sb2.append(", isButtonLoading=");
        sb2.append(this.f16801g);
        sb2.append(", isButtonVisible=");
        return r.x(sb2, this.f16802h, ')');
    }
}

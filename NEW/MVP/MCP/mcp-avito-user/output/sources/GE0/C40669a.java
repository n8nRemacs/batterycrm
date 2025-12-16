package ge0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySubsidySettingsResponse.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lge0/a;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ge0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C40669a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f396652a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f396653b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f396654c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f396655d;

    /* renamed from: e, reason: collision with root package name */
    public final int f396656e;

    /* renamed from: f, reason: collision with root package name */
    public final int f396657f;

    /* renamed from: g, reason: collision with root package name */
    public final int f396658g;

    /* renamed from: h, reason: collision with root package name */
    public final int f396659h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f396660i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f396661j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final AttributedText f396662k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f396663l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f396664m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f396665n;

    /* compiled from: DeliverySubsidySettingsResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lge0/a$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ge0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11217a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Image f396666a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f396667b;

        public C11217a(@k Image image, @k String str) {
            this.f396666a = image;
            this.f396667b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11217a)) {
                return false;
            }
            C11217a c11217a = (C11217a) obj;
            return L.f(this.f396666a, c11217a.f396666a) && L.f(this.f396667b, c11217a.f396667b);
        }

        public final int hashCode() {
            return this.f396667b.hashCode() + (this.f396666a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TrustFactor(image=");
            sb2.append(this.f396666a);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f396667b, ')');
        }
    }

    public C40669a(@k String str, @k ArrayList arrayList, @k String str2, @k String str3, int i12, int i13, int i14, int i15, @l String str4, @l String str5, @k AttributedText attributedText, @k String str6, @k String str7, @l String str8) {
        this.f396652a = str;
        this.f396653b = arrayList;
        this.f396654c = str2;
        this.f396655d = str3;
        this.f396656e = i12;
        this.f396657f = i13;
        this.f396658g = i14;
        this.f396659h = i15;
        this.f396660i = str4;
        this.f396661j = str5;
        this.f396662k = attributedText;
        this.f396663l = str6;
        this.f396664m = str7;
        this.f396665n = str8;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40669a)) {
            return false;
        }
        C40669a c40669a = (C40669a) obj;
        return L.f(this.f396652a, c40669a.f396652a) && this.f396653b.equals(c40669a.f396653b) && L.f(this.f396654c, c40669a.f396654c) && L.f(this.f396655d, c40669a.f396655d) && this.f396656e == c40669a.f396656e && this.f396657f == c40669a.f396657f && this.f396658g == c40669a.f396658g && this.f396659h == c40669a.f396659h && L.f(this.f396660i, c40669a.f396660i) && L.f(this.f396661j, c40669a.f396661j) && L.f(this.f396662k, c40669a.f396662k) && L.f(this.f396663l, c40669a.f396663l) && L.f(this.f396664m, c40669a.f396664m) && L.f(this.f396665n, c40669a.f396665n);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f396659h, r.e(this.f396658g, r.e(this.f396657f, r.e(this.f396656e, H.d(H.d(e.g(this.f396653b, this.f396652a.hashCode() * 31, 31), 31, this.f396654c), 31, this.f396655d), 31), 31), 31), 31);
        String str = this.f396660i;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f396661j;
        int iD2 = H.d(H.d(com.avito.android.actions_sheet.a.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f396662k), 31, this.f396663l), 31, this.f396664m);
        String str3 = this.f396665n;
        return iD2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliverySubsidySettingsResponse(title=");
        sb2.append(this.f396652a);
        sb2.append(", trustFactors=");
        sb2.append(this.f396653b);
        sb2.append(", inputTitle=");
        sb2.append(this.f396654c);
        sb2.append(", currencySymbol=");
        sb2.append(this.f396655d);
        sb2.append(", minDiscount=");
        sb2.append(this.f396656e);
        sb2.append(", maxDiscount=");
        sb2.append(this.f396657f);
        sb2.append(", sliderStep=");
        sb2.append(this.f396658g);
        sb2.append(", discount=");
        sb2.append(this.f396659h);
        sb2.append(", discountTooSmallHint=");
        sb2.append(this.f396660i);
        sb2.append(", discountTooBigHint=");
        sb2.append(this.f396661j);
        sb2.append(", bannerText=");
        sb2.append(this.f396662k);
        sb2.append(", acceptButtonTitle=");
        sb2.append(this.f396663l);
        sb2.append(", cancelButtonTitle=");
        sb2.append(this.f396664m);
        sb2.append(", toastText=");
        return C22026a.c(sb2, this.f396665n, ')');
    }
}

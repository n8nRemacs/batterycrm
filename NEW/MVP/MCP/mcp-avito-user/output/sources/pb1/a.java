package Pb1;

import Y61.k;
import Y61.l;
import android.graphics.Color;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import sberid.sdk.auth.model.ButtonText;
import sberid.sdk.auth.model.ButtonType;

@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPb1/a;", "", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f13147a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f13148b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f13149c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ButtonType f13150d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ButtonText f13151e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f13152f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f13153g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13154h;

    public a() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f13147a, aVar.f13147a) && L.f(this.f13148b, aVar.f13148b) && L.f(this.f13149c, aVar.f13149c) && this.f13150d == aVar.f13150d && this.f13151e == aVar.f13151e && L.f(this.f13152f, aVar.f13152f) && L.f(this.f13153g, aVar.f13153g) && this.f13154h == aVar.f13154h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f13147a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f13148b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f13149c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ButtonType buttonType = this.f13150d;
        int iHashCode4 = (iHashCode3 + (buttonType == null ? 0 : buttonType.hashCode())) * 31;
        ButtonText buttonText = this.f13151e;
        int iHashCode5 = (iHashCode4 + (buttonText == null ? 0 : buttonText.hashCode())) * 31;
        Integer num3 = this.f13152f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f13153g;
        int iHashCode7 = (iHashCode6 + (num4 != null ? num4.hashCode() : 0)) * 31;
        boolean z12 = this.f13154h;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return iHashCode7 + i12;
    }

    @k
    public final String toString() {
        return "SberIDButtonModel(clientId=" + this.f13147a + ", width=" + this.f13148b + ", height=" + this.f13149c + ", type=" + this.f13150d + ", text=" + this.f13151e + ", cornerRadius=" + this.f13152f + ", strokeColor=" + this.f13153g + ", buttonLoader=" + this.f13154h + ")";
    }

    public a(String str, Integer num, Integer num2, ButtonType buttonType, ButtonText buttonText, Integer num3, Integer num4, boolean z12, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? null : str;
        num = (i12 & 2) != 0 ? null : num;
        num2 = (i12 & 4) != 0 ? null : num2;
        buttonType = (i12 & 8) != 0 ? ButtonType.f437752c : buttonType;
        buttonText = (i12 & 16) != 0 ? ButtonText.f437748c : buttonText;
        num3 = (i12 & 32) != 0 ? 0 : num3;
        num4 = (i12 & 64) != 0 ? Integer.valueOf(Color.rgb(76, 76, 76)) : num4;
        z12 = (i12 & 128) != 0 ? false : z12;
        this.f13147a = str;
        this.f13148b = num;
        this.f13149c = num2;
        this.f13150d = buttonType;
        this.f13151e = buttonText;
        this.f13152f = num3;
        this.f13153g = num4;
        this.f13154h = z12;
    }
}

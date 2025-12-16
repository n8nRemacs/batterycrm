package rw0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.CostInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import tw0.InterfaceC48733a;

/* compiled from: Payment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/j;", "Ltw0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class j implements InterfaceC48733a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437216b;

    /* renamed from: c, reason: collision with root package name */
    public final int f437217c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AttributedText f437218d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f437219e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f437220f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<CostInfo> f437221g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f437222h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Boolean f437223i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f437224j;

    public j(@Y61.k String str, int i12, @Y61.k AttributedText attributedText, boolean z12, boolean z13, @Y61.k List<CostInfo> list, @Y61.l String str2, @Y61.l Boolean bool, @Y61.l String str3) {
        this.f437216b = str;
        this.f437217c = i12;
        this.f437218d = attributedText;
        this.f437219e = z12;
        this.f437220f = z13;
        this.f437221g = list;
        this.f437222h = str2;
        this.f437223i = bool;
        this.f437224j = str3;
    }

    @Override // tw0.InterfaceC48733a
    public final boolean a(@Y61.k Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return L.f(this.f437216b, ((j) obj).f437216b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f437216b, jVar.f437216b) && this.f437217c == jVar.f437217c && L.f(this.f437218d, jVar.f437218d) && this.f437219e == jVar.f437219e && this.f437220f == jVar.f437220f && L.f(this.f437221g, jVar.f437221g) && L.f(this.f437222h, jVar.f437222h) && L.f(this.f437223i, jVar.f437223i) && L.f(this.f437224j, jVar.f437224j);
    }

    @Override // tw0.InterfaceC48733a
    @Y61.k
    /* renamed from: getText, reason: from getter */
    public final AttributedText getF437218d() {
        return this.f437218d;
    }

    public final int hashCode() {
        int iE2 = H.e(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(com.avito.android.actions_sheet.a.b(androidx.appcompat.app.r.e(this.f437217c, this.f437216b.hashCode() * 31, 31), 31, this.f437218d), 31, this.f437219e), 31, this.f437220f), 31, this.f437221g);
        String str = this.f437222h;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f437223i;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f437224j;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // tw0.InterfaceC48733a
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF437219e() {
        return this.f437219e;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Payment(id=");
        sb2.append(this.f437216b);
        sb2.append(", amount=");
        sb2.append(this.f437217c);
        sb2.append(", text=");
        sb2.append(this.f437218d);
        sb2.append(", isEnabled=");
        sb2.append(this.f437219e);
        sb2.append(", isSelected=");
        sb2.append(this.f437220f);
        sb2.append(", costInfo=");
        sb2.append(this.f437221g);
        sb2.append(", clickMessage=");
        sb2.append(this.f437222h);
        sb2.append(", shouldDisablePromoCodeInfo=");
        sb2.append(this.f437223i);
        sb2.append(", promoCodeDisabledText=");
        return C22026a.c(sb2, this.f437224j, ')');
    }
}

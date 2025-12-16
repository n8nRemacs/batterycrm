package rp;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.deeplink.SubmittingSuccessLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderCallModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp/e;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rp.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47702e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f430203a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f430204b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f430205c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f430206d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f430207e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SubmittingSuccessLink f430208f;

    public C47702e(@l String str, @l String str2, @k AttributedText attributedText, @l String str3, @k String str4, @k SubmittingSuccessLink submittingSuccessLink) {
        this.f430203a = str;
        this.f430204b = str2;
        this.f430205c = attributedText;
        this.f430206d = str3;
        this.f430207e = str4;
        this.f430208f = submittingSuccessLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47702e)) {
            return false;
        }
        C47702e c47702e = (C47702e) obj;
        return L.f(this.f430203a, c47702e.f430203a) && L.f(this.f430204b, c47702e.f430204b) && this.f430205c.equals(c47702e.f430205c) && L.f(this.f430206d, c47702e.f430206d) && L.f(this.f430207e, c47702e.f430207e) && this.f430208f.equals(c47702e.f430208f);
    }

    public final int hashCode() {
        String str = this.f430203a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        int iHashCode2 = (((this.f430205c.hashCode() + ((iHashCode + (this.f430204b == null ? 0 : r3.hashCode())) * 961)) * 31) - 1318915715) * 31;
        String str2 = this.f430206d;
        return this.f430208f.hashCode() + H.d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f430207e);
    }

    @k
    public final String toString() {
        return "OrderCallBody(title=" + this.f430203a + ", subtitle=" + this.f430204b + ", value=, hintText=" + this.f430205c + ", errorText=Укажите правильный номер, placeholderText=" + this.f430206d + ", proceedButtonText=" + this.f430207e + ", nextLink=" + this.f430208f + ')';
    }
}

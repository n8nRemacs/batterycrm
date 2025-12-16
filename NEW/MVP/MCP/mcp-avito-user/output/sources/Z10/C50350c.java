package z10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferDynamicDescription.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz10/c;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C50350c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final AttributedText f443773a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f443774b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final g f443775c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f443776d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final B10.b f443777e;

    public C50350c(@l AttributedText attributedText, @l String str, @l g gVar, @l ArrayList arrayList, @l B10.b bVar) {
        this.f443773a = attributedText;
        this.f443774b = str;
        this.f443775c = gVar;
        this.f443776d = arrayList;
        this.f443777e = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50350c)) {
            return false;
        }
        C50350c c50350c = (C50350c) obj;
        return L.f(this.f443773a, c50350c.f443773a) && L.f(this.f443774b, c50350c.f443774b) && L.f(this.f443775c, c50350c.f443775c) && L.f(this.f443776d, c50350c.f443776d) && L.f(this.f443777e, c50350c.f443777e);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f443773a;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        String str = this.f443774b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        g gVar = this.f443775c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        ArrayList arrayList = this.f443776d;
        int iHashCode4 = (iHashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        B10.b bVar = this.f443777e;
        return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "OfferDynamicDescription(banksTitle=" + this.f443773a + ", banksImageUrl=" + this.f443774b + ", paymentOffer=" + this.f443775c + ", conditions=" + this.f443776d + ", discounts=" + this.f443777e + ')';
    }
}

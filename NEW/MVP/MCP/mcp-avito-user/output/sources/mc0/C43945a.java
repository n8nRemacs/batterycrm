package mC0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptForbiddenModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmC0/a;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C43945a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final UniversalImage f414399a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414400b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f414401c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ButtonAction f414402d;

    public C43945a(@k UniversalImage universalImage, @k String str, @l AttributedText attributedText, @k ButtonAction buttonAction) {
        this.f414399a = universalImage;
        this.f414400b = str;
        this.f414401c = attributedText;
        this.f414402d = buttonAction;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43945a)) {
            return false;
        }
        C43945a c43945a = (C43945a) obj;
        return L.f(this.f414399a, c43945a.f414399a) && L.f(this.f414400b, c43945a.f414400b) && L.f(this.f414401c, c43945a.f414401c) && L.f(this.f414402d, c43945a.f414402d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f414399a.hashCode() * 31, 31, this.f414400b);
        AttributedText attributedText = this.f414401c;
        return this.f414402d.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptForbiddenModel(image=");
        sb2.append(this.f414399a);
        sb2.append(", title=");
        sb2.append(this.f414400b);
        sb2.append(", subtitle=");
        sb2.append(this.f414401c);
        sb2.append(", button=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.f414402d, ')');
    }
}

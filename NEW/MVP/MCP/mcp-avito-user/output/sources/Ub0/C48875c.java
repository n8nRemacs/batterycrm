package uB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoCardContentDottedTextItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuB0/c;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uB0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48875c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f439843a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f439844b;

    public C48875c(@k AttributedText attributedText, @k AttributedText attributedText2) {
        this.f439843a = attributedText;
        this.f439844b = attributedText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48875c)) {
            return false;
        }
        C48875c c48875c = (C48875c) obj;
        return L.f(this.f439843a, c48875c.f439843a) && L.f(this.f439844b, c48875c.f439844b);
    }

    public final int hashCode() {
        return this.f439844b.hashCode() + (this.f439843a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoCardContentDottedTextItem(leftText=");
        sb2.append(this.f439843a);
        sb2.append(", rightText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f439844b, ')');
    }
}

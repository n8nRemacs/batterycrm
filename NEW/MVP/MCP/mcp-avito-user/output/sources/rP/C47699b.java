package rp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SubmittingSelectModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp/b;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47699b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f430194a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f430195b;

    public C47699b(@k AttributedText attributedText, @l AttributedText attributedText2) {
        this.f430194a = attributedText;
        this.f430195b = attributedText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47699b)) {
            return false;
        }
        C47699b c47699b = (C47699b) obj;
        return L.f(this.f430194a, c47699b.f430194a) && L.f(this.f430195b, c47699b.f430195b);
    }

    public final int hashCode() {
        int iHashCode = this.f430194a.hashCode() * 31;
        AttributedText attributedText = this.f430195b;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DealSelectItemDescription(text=");
        sb2.append(this.f430194a);
        sb2.append(", bulletText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f430195b, ')');
    }
}

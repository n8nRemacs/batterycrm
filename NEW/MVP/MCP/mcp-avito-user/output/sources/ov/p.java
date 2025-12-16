package Ov;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TarifikatorUiData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOv/p;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final AttributedText f12704a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f12705b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<C14739b> f12706c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12707d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final C14740c f12708e;

    public p(@Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.k List<C14739b> list, boolean z12, @Y61.l C14740c c14740c) {
        this.f12704a = attributedText;
        this.f12705b = attributedText2;
        this.f12706c = list;
        this.f12707d = z12;
        this.f12708e = c14740c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f12704a, pVar.f12704a) && L.f(this.f12705b, pVar.f12705b) && L.f(this.f12706c, pVar.f12706c) && this.f12707d == pVar.f12707d && L.f(this.f12708e, pVar.f12708e);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f12704a;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.f12705b;
        int i12 = r.i(H.e((iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31, 31, this.f12706c), 31, this.f12707d);
        C14740c c14740c = this.f12708e;
        return i12 + (c14740c != null ? c14740c.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "TarifikatorUiData(header=" + this.f12704a + ", footer=" + this.f12705b + ", sellerCustomTariffs=" + this.f12706c + ", isCustomTariffsEditorEnabled=" + this.f12707d + ", customTariffsCardOnboarding=" + this.f12708e + ')';
    }
}

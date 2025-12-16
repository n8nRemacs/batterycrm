package PE0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedPlanBlock.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPE0/d;", "LOE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d implements OE0.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final UniversalImage f12887a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f12888b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<AttributedText> f12889c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e f12890d;

    public d(@k UniversalImage universalImage, @k AttributedText attributedText, @k List<AttributedText> list, @k e eVar) {
        this.f12887a = universalImage;
        this.f12888b = attributedText;
        this.f12889c = list;
        this.f12890d = eVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f12887a, dVar.f12887a) && L.f(this.f12888b, dVar.f12888b) && L.f(this.f12889c, dVar.f12889c) && L.f(this.f12890d, dVar.f12890d);
    }

    public final int hashCode() {
        return this.f12890d.hashCode() + H.e(com.avito.android.actions_sheet.a.b(this.f12887a.hashCode() * 31, 31, this.f12888b), 31, this.f12889c);
    }

    @k
    public final String toString() {
        return "ExtendedPlanBlock(promoImage=" + this.f12887a + ", title=" + this.f12888b + ", benefits=" + this.f12889c + ", button=" + this.f12890d + ')';
    }
}

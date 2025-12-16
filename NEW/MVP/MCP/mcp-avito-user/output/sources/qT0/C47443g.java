package qt0;

import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbOfferItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/g;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qt0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47443g implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f429443b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f429444c;

    public C47443g(@Y61.k String str, @l AttributedText attributedText) {
        this.f429443b = str;
        this.f429444c = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47443g)) {
            return false;
        }
        C47443g c47443g = (C47443g) obj;
        return L.f(this.f429443b, c47443g.f429443b) && L.f(this.f429444c, c47443g.f429444c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return getF429430f().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF429430f() {
        return this.f429443b;
    }

    public final int hashCode() {
        int iHashCode = this.f429443b.hashCode() * 31;
        AttributedText attributedText = this.f429444c;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbOfferItem(stringId=");
        sb2.append(this.f429443b);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f429444c, ')');
    }
}

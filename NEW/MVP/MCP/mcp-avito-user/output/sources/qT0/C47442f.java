package qt0;

import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbInfoBannerBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/f;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qt0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47442f implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f429439b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f429440c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f429441d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f429442e;

    public C47442f(@l String str, @l AttributedText attributedText, @l String str2, @Y61.k String str3) {
        this.f429439b = str;
        this.f429440c = attributedText;
        this.f429441d = str2;
        this.f429442e = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47442f)) {
            return false;
        }
        C47442f c47442f = (C47442f) obj;
        return L.f(this.f429439b, c47442f.f429439b) && L.f(this.f429440c, c47442f.f429440c) && L.f(this.f429441d, c47442f.f429441d) && L.f(this.f429442e, c47442f.f429442e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF288414b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288414b() {
        return this.f429442e;
    }

    public final int hashCode() {
        String str = this.f429439b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f429440c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str2 = this.f429441d;
        return this.f429442e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbInfoBannerBlockItem(title=");
        sb2.append(this.f429439b);
        sb2.append(", description=");
        sb2.append(this.f429440c);
        sb2.append(", style=");
        sb2.append(this.f429441d);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f429442e, ')');
    }
}

package JF0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LJF0/f;", "", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "value", "LJF0/f$a;", "dateFormat", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;LJF0/f$a;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "d", "LJF0/f$a;", "a", "()LJF0/f$a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class f {

    @com.google.gson.annotations.c("dateFormat")
    @k
    private final a dateFormat;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    @k
    private final String value;

    /* compiled from: TrxPromoGoodsConfigureResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LJF0/f$a;", "", "", PluralsKeys.OTHER, "today", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        @com.google.gson.annotations.c(PluralsKeys.OTHER)
        @k
        private final String other;

        @com.google.gson.annotations.c("today")
        @l
        private final String today;

        public a(@k String str, @l String str2) {
            this.other = str;
            this.today = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getOther() {
            return this.other;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getToday() {
            return this.today;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.other, aVar.other) && L.f(this.today, aVar.today);
        }

        public final int hashCode() {
            int iHashCode = this.other.hashCode() * 31;
            String str = this.today;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DateFormat(other=");
            sb2.append(this.other);
            sb2.append(", today=");
            return C22026a.c(sb2, this.today, ')');
        }
    }

    public f(@k String str, @k DeepLink deepLink, @k String str2, @k a aVar) {
        this.title = str;
        this.deeplink = deepLink;
        this.value = str2;
        this.dateFormat = aVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final a getDateFormat() {
        return this.dateFormat;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.title, fVar.title) && L.f(this.deeplink, fVar.deeplink) && L.f(this.value, fVar.value) && L.f(this.dateFormat, fVar.dateFormat);
    }

    public final int hashCode() {
        return this.dateFormat.hashCode() + H.d(com.avito.android.actions_sheet.a.e(this.deeplink, this.title.hashCode() * 31, 31), 31, this.value);
    }

    @k
    public final String toString() {
        return "TrxPromoGoodsConfigureSingleDate(title=" + this.title + ", deeplink=" + this.deeplink + ", value=" + this.value + ", dateFormat=" + this.dateFormat + ')';
    }
}

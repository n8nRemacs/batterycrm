package bu0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActiveBookingsResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB?\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lbu0/b;", "", "", "Lbu0/a;", "items", "Lbu0/c;", "detailedInfo", "", "subtitle", "badgeTitle", "Lbu0/b$a;", "action", "<init>", "(Ljava/util/List;Lbu0/c;Ljava/lang/String;Ljava/lang/String;Lbu0/b$a;)V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lbu0/c;", "getDetailedInfo", "()Lbu0/c;", "Ljava/lang/String;", "getSubtitle", "()Ljava/lang/String;", "getBadgeTitle", "Lbu0/b$a;", "getAction", "()Lbu0/b$a;", "a", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bu0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C25717b {

    @com.google.gson.annotations.c("action")
    @l
    private final a action;

    @com.google.gson.annotations.c("badgeTitle")
    @l
    private final String badgeTitle;

    @com.google.gson.annotations.c("allTransactions")
    @l
    private final C25718c detailedInfo;

    @com.google.gson.annotations.c("items")
    @l
    private final List<C25716a> items;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    /* compiled from: ActiveBookingsResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbu0/b$a;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/remote/model/text/AttributedText;", "value", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/text/AttributedText;", "getValue", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bu0.b$a */
    public static final /* data */ class a {

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        @com.google.gson.annotations.c("value")
        @k
        private final AttributedText value;

        public a(@l DeepLink deepLink, @k AttributedText attributedText) {
            this.uri = deepLink;
            this.value = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.uri, aVar.uri) && L.f(this.value, aVar.value);
        }

        public final int hashCode() {
            DeepLink deepLink = this.uri;
            return this.value.hashCode() + ((deepLink == null ? 0 : deepLink.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(uri=");
            sb2.append(this.uri);
            sb2.append(", value=");
            return com.avito.android.actions_sheet.a.w(sb2, this.value, ')');
        }
    }

    public C25717b(@l List<C25716a> list, @l C25718c c25718c, @l String str, @l String str2, @l a aVar) {
        this.items = list;
        this.detailedInfo = c25718c;
        this.subtitle = str;
        this.badgeTitle = str2;
        this.action = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25717b)) {
            return false;
        }
        C25717b c25717b = (C25717b) obj;
        return L.f(this.items, c25717b.items) && L.f(this.detailedInfo, c25717b.detailedInfo) && L.f(this.subtitle, c25717b.subtitle) && L.f(this.badgeTitle, c25717b.badgeTitle) && L.f(this.action, c25717b.action);
    }

    public final int hashCode() {
        List<C25716a> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C25718c c25718c = this.detailedInfo;
        int iHashCode2 = (iHashCode + (c25718c == null ? 0 : c25718c.hashCode())) * 31;
        String str = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.badgeTitle;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.action;
        return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ActiveBookingsResult(items=" + this.items + ", detailedInfo=" + this.detailedInfo + ", subtitle=" + this.subtitle + ", badgeTitle=" + this.badgeTitle + ", action=" + this.action + ')';
    }
}

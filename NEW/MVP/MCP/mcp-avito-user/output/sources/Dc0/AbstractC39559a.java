package dC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bC0.C25493b;
import bC0.C25494c;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.remote.model.edit.TariffBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpaInfoResult.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LdC0/a;", "", "<init>", "()V", "a", "b", "LdC0/a$a;", "LdC0/a$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC39559a {

    /* compiled from: CpaInfoResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LdC0/a$a;", "LdC0/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dC0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11016a extends AbstractC39559a {

        @com.google.gson.annotations.c("action")
        @k
        private final DeepLink deeplink;

        public C11016a(@k DeepLink deepLink) {
            super(null);
            this.deeplink = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11016a) && L.f(this.deeplink, ((C11016a) obj).deeplink);
        }

        public final int hashCode() {
            return this.deeplink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Action(deeplink="), this.deeplink, ')');
        }
    }

    /* compiled from: CpaInfoResult.kt */
    @P
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"LdC0/a$b;", "LdC0/a;", "", "title", "LbC0/c;", "balanceInfo", "Lcom/avito/android/remote/model/text/AttributedText;", "thresholdInfo", "extraInfo", "Lcom/avito/android/tariff/remote/model/edit/TariffBanner;", "alert", "LbC0/b;", "advanceRefill", "LdC0/d;", "statistics", "LdC0/b;", "level", "LdC0/e;", "cpxLevel", "LdC0/i;", "infoBanner", "<init>", "(Ljava/lang/String;LbC0/c;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/tariff/remote/model/edit/TariffBanner;LbC0/b;LdC0/d;LdC0/b;LdC0/e;LdC0/i;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "LbC0/c;", "c", "()LbC0/c;", "Lcom/avito/android/remote/model/text/AttributedText;", "i", "()Lcom/avito/android/remote/model/text/AttributedText;", "e", "Lcom/avito/android/tariff/remote/model/edit/TariffBanner;", "b", "()Lcom/avito/android/tariff/remote/model/edit/TariffBanner;", "LbC0/b;", "a", "()LbC0/b;", "LdC0/d;", "h", "()LdC0/d;", "LdC0/b;", "g", "()LdC0/b;", "LdC0/e;", "d", "()LdC0/e;", "LdC0/i;", "f", "()LdC0/i;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dC0.a$b */
    public static final /* data */ class b extends AbstractC39559a {

        @com.google.gson.annotations.c("advanceRefill")
        @l
        private final C25493b advanceRefill;

        @com.google.gson.annotations.c("alert")
        @l
        private final TariffBanner alert;

        @com.google.gson.annotations.c("balanceInfo")
        @k
        private final C25494c balanceInfo;

        @com.google.gson.annotations.c("cpxLevel")
        @l
        private final C39563e cpxLevel;

        @com.google.gson.annotations.c("extraInfo")
        @l
        private final AttributedText extraInfo;

        @com.google.gson.annotations.c("infoBanner")
        @l
        private final i infoBanner;

        @com.google.gson.annotations.c("level")
        @l
        private final C39560b level;

        @com.google.gson.annotations.c("statistics")
        @l
        private final C39562d statistics;

        @com.google.gson.annotations.c("thresholdInfo")
        @l
        private final AttributedText thresholdInfo;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        public b(@k String str, @k C25494c c25494c, @l AttributedText attributedText, @l AttributedText attributedText2, @l TariffBanner tariffBanner, @l C25493b c25493b, @l C39562d c39562d, @l C39560b c39560b, @l C39563e c39563e, @l i iVar) {
            super(null);
            this.title = str;
            this.balanceInfo = c25494c;
            this.thresholdInfo = attributedText;
            this.extraInfo = attributedText2;
            this.alert = tariffBanner;
            this.advanceRefill = c25493b;
            this.statistics = c39562d;
            this.level = c39560b;
            this.cpxLevel = c39563e;
            this.infoBanner = iVar;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final C25493b getAdvanceRefill() {
            return this.advanceRefill;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final TariffBanner getAlert() {
            return this.alert;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final C25494c getBalanceInfo() {
            return this.balanceInfo;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final C39563e getCpxLevel() {
            return this.cpxLevel;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final AttributedText getExtraInfo() {
            return this.extraInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.title, bVar.title) && L.f(this.balanceInfo, bVar.balanceInfo) && L.f(this.thresholdInfo, bVar.thresholdInfo) && L.f(this.extraInfo, bVar.extraInfo) && L.f(this.alert, bVar.alert) && L.f(this.advanceRefill, bVar.advanceRefill) && L.f(this.statistics, bVar.statistics) && L.f(this.level, bVar.level) && L.f(this.cpxLevel, bVar.cpxLevel) && L.f(this.infoBanner, bVar.infoBanner);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final i getInfoBanner() {
            return this.infoBanner;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final C39560b getLevel() {
            return this.level;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final C39562d getStatistics() {
            return this.statistics;
        }

        public final int hashCode() {
            int iHashCode = (this.balanceInfo.hashCode() + (this.title.hashCode() * 31)) * 31;
            AttributedText attributedText = this.thresholdInfo;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            AttributedText attributedText2 = this.extraInfo;
            int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            TariffBanner tariffBanner = this.alert;
            int iHashCode4 = (iHashCode3 + (tariffBanner == null ? 0 : tariffBanner.hashCode())) * 31;
            C25493b c25493b = this.advanceRefill;
            int iHashCode5 = (iHashCode4 + (c25493b == null ? 0 : c25493b.hashCode())) * 31;
            C39562d c39562d = this.statistics;
            int iHashCode6 = (iHashCode5 + (c39562d == null ? 0 : c39562d.hashCode())) * 31;
            C39560b c39560b = this.level;
            int iHashCode7 = (iHashCode6 + (c39560b == null ? 0 : c39560b.hashCode())) * 31;
            C39563e c39563e = this.cpxLevel;
            int iHashCode8 = (iHashCode7 + (c39563e == null ? 0 : c39563e.hashCode())) * 31;
            i iVar = this.infoBanner;
            return iHashCode8 + (iVar != null ? iVar.hashCode() : 0);
        }

        @l
        /* renamed from: i, reason: from getter */
        public final AttributedText getThresholdInfo() {
            return this.thresholdInfo;
        }

        @k
        /* renamed from: j, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String toString() {
            return "Ok(title=" + this.title + ", balanceInfo=" + this.balanceInfo + ", thresholdInfo=" + this.thresholdInfo + ", extraInfo=" + this.extraInfo + ", alert=" + this.alert + ", advanceRefill=" + this.advanceRefill + ", statistics=" + this.statistics + ", level=" + this.level + ", cpxLevel=" + this.cpxLevel + ", infoBanner=" + this.infoBanner + ')';
        }
    }

    public /* synthetic */ AbstractC39559a(C42822w c42822w) {
        this();
    }

    private AbstractC39559a() {
    }
}

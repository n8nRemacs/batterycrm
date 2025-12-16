package Oq0;

import Nq0.C14603a;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.seller_promotions.model.BeduinFormType;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import lj.d;

/* compiled from: SellerPromotionsOneTimeEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LOq0/f;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LOq0/f$a;", "LOq0/f$b;", "LOq0/f$c;", "LOq0/f$d;", "LOq0/f$e;", "LOq0/f$f;", "LOq0/f$g;", "LOq0/f$h;", "LOq0/f$i;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface f {

    /* compiled from: SellerPromotionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/f$a;", "LOq0/f;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final d.e f12592a;

        public a(@k d.e eVar) {
            this.f12592a = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f12592a.equals(((a) obj).f12592a);
        }

        public final int hashCode() {
            return this.f12592a.f414160a.hashCode();
        }

        @k
        public final String toString() {
            return "ApplyBeduinTransforms(componentsFormTransform=" + this.f12592a + ')';
        }
    }

    /* compiled from: SellerPromotionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOq0/f$b;", "LOq0/f;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f12593a = new b();
    }

    /* compiled from: SellerPromotionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/f$c;", "LOq0/f;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<BeduinAction> f12594a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@k List<? extends BeduinAction> list) {
            this.f12594a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f12594a, ((c) obj).f12594a);
        }

        public final int hashCode() {
            return this.f12594a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("HandleBeduinActions(actions="), this.f12594a, ')');
        }
    }

    /* compiled from: SellerPromotionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/f$e;", "LOq0/f;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f12599a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f12600b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f12601c;

        public e(DeepLink deepLink, String str, Bundle bundle, int i12, C42822w c42822w) {
            str = (i12 & 2) != 0 ? null : str;
            bundle = (i12 & 4) != 0 ? null : bundle;
            this.f12599a = deepLink;
            this.f12600b = str;
            this.f12601c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f12599a, eVar.f12599a) && L.f(this.f12600b, eVar.f12600b) && L.f(this.f12601c, eVar.f12601c);
        }

        public final int hashCode() {
            int iHashCode = this.f12599a.hashCode() * 31;
            String str = this.f12600b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Bundle bundle = this.f12601c;
            return iHashCode2 + (bundle != null ? bundle.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f12599a);
            sb2.append(", requestKey=");
            sb2.append(this.f12600b);
            sb2.append(", args=");
            return H.m(sb2, this.f12601c, ')');
        }
    }

    /* compiled from: SellerPromotionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/f$f;", "LOq0/f;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oq0.f$f, reason: collision with other inner class name */
    public static final /* data */ class C0812f implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinFormType f12602a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f12603b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<BeduinModel> f12604c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0812f(@k BeduinFormType beduinFormType, @k String str, @k List<? extends BeduinModel> list) {
            this.f12602a = beduinFormType;
            this.f12603b = str;
            this.f12604c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0812f)) {
                return false;
            }
            C0812f c0812f = (C0812f) obj;
            return this.f12602a == c0812f.f12602a && L.f(this.f12603b, c0812f.f12603b) && L.f(this.f12604c, c0812f.f12604c);
        }

        public final int hashCode() {
            return this.f12604c.hashCode() + H.d(this.f12602a.hashCode() * 31, 31, this.f12603b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetBeduinForm(formType=");
            sb2.append(this.f12602a);
            sb2.append(", formId=");
            sb2.append(this.f12603b);
            sb2.append(", models=");
            return H.p(sb2, this.f12604c, ')');
        }
    }

    /* compiled from: SellerPromotionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LOq0/f$g;", "LOq0/f;", "a", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f12605a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f12606b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final a f12607c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f12608d;

        /* compiled from: SellerPromotionsOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/f$g$a;", "", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f12609a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Y41.l<Y41.l<? super Oq0.d, G0>, G0> f12610b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(@k PrintableText printableText, @k Y41.l<? super Y41.l<? super Oq0.d, G0>, G0> lVar) {
                this.f12609a = printableText;
                this.f12610b = lVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f12609a, aVar.f12609a) && L.f(this.f12610b, aVar.f12610b);
            }

            public final int hashCode() {
                return this.f12610b.hashCode() + (this.f12609a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Action(text=");
                sb2.append(this.f12609a);
                sb2.append(", onClick=");
                return H.l(sb2, this.f12610b, ')');
            }
        }

        public g(ApiError apiError, PrintableText printableText, a aVar, boolean z12, int i12, C42822w c42822w) {
            aVar = (i12 & 4) != 0 ? null : aVar;
            z12 = (i12 & 8) != 0 ? false : z12;
            this.f12605a = apiError;
            this.f12606b = printableText;
            this.f12607c = aVar;
            this.f12608d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f12605a, gVar.f12605a) && L.f(this.f12606b, gVar.f12606b) && L.f(this.f12607c, gVar.f12607c) && this.f12608d == gVar.f12608d;
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f12606b, this.f12605a.hashCode() * 31, 31);
            a aVar = this.f12607c;
            return Boolean.hashCode(this.f12608d) + ((iF2 + (aVar == null ? 0 : aVar.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(cause=");
            sb2.append(this.f12605a);
            sb2.append(", message=");
            sb2.append(this.f12606b);
            sb2.append(", button=");
            sb2.append(this.f12607c);
            sb2.append(", performHapticFeedback=");
            return r.x(sb2, this.f12608d, ')');
        }
    }

    /* compiled from: SellerPromotionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/f$h;", "LOq0/f;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f12611a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f12612b;

        public h(@k PrintableText printableText, @k ApiError apiError) {
            this.f12611a = apiError;
            this.f12612b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f12611a, hVar.f12611a) && L.f(this.f12612b, hVar.f12612b);
        }

        public final int hashCode() {
            return this.f12612b.hashCode() + (this.f12611a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowPageLoadingError(cause=");
            sb2.append(this.f12611a);
            sb2.append(", message=");
            return AK.c.m(sb2, this.f12612b, ')');
        }
    }

    /* compiled from: SellerPromotionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/f$i;", "LOq0/f;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements f {

        /* renamed from: a, reason: collision with root package name */
        public final int f12613a;

        public i(int i12) {
            this.f12613a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f12613a == ((i) obj).f12613a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f12613a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateCartIconQuantity(newQuantity="), this.f12613a, ')');
        }
    }

    /* compiled from: SellerPromotionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/f$d;", "LOq0/f;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f12595a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f12596b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f12597c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final C14603a f12598d;

        public d(@k String str, @l String str2, @k DeepLink deepLink, @l C14603a c14603a) {
            this.f12595a = str;
            this.f12596b = str2;
            this.f12597c = deepLink;
            this.f12598d = c14603a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f12595a, dVar.f12595a) && L.f(this.f12596b, dVar.f12596b) && L.f(this.f12597c, dVar.f12597c) && L.f(this.f12598d, dVar.f12598d);
        }

        public final int hashCode() {
            int iHashCode = this.f12595a.hashCode() * 31;
            String str = this.f12596b;
            int iE2 = com.avito.android.actions_sheet.a.e(this.f12597c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            C14603a c14603a = this.f12598d;
            return iE2 + (c14603a != null ? c14603a.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OpenAdvertDetails(itemId=" + this.f12595a + ", context=" + this.f12596b + ", onTapDeepLink=" + this.f12597c + ", args=" + this.f12598d + ')';
        }

        public /* synthetic */ d(String str, String str2, DeepLink deepLink, C14603a c14603a, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, deepLink, (i12 & 8) != 0 ? null : c14603a);
        }
    }
}

package Bj0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.autoteka.generated.api.get_step_order_v_4.GetStepOrderDataAnalytics;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: GetStepOrderV4Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LBj0/c;", "", "a", "b", "LBj0/c$a;", "LBj0/c$b;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface c {

    /* compiled from: GetStepOrderV4Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LBj0/c$a;", "LBj0/c;", "", "code", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        @com.google.gson.annotations.c("code")
        @k
        private final String code;

        public a(@k String str) {
            this.code = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }
    }

    /* compiled from: GetStepOrderV4Response.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"LBj0/c$b;", "LBj0/c;", "Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/GetStepOrderDataAnalytics;", "analytics", "LBj0/a;", "contestAgreement", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LBj0/b;", "emailForm", "Lcom/avito/android/remote/model/Image;", "image", "", "isPromocodeLessProfitable", "licenseAgreement", "LBj0/d;", "priceDetails", "", "title", "<init>", "(Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/GetStepOrderDataAnalytics;LBj0/a;Lcom/avito/android/remote/model/text/AttributedText;LBj0/b;Lcom/avito/android/remote/model/Image;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;LBj0/d;Ljava/lang/String;)V", "Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/GetStepOrderDataAnalytics;", "a", "()Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/GetStepOrderDataAnalytics;", "LBj0/a;", "b", "()LBj0/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "LBj0/b;", "d", "()LBj0/b;", "Lcom/avito/android/remote/model/Image;", "e", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "f", "LBj0/d;", "g", "()LBj0/d;", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        @com.google.gson.annotations.c("analytics")
        @k
        private final GetStepOrderDataAnalytics analytics;

        @com.google.gson.annotations.c("contestAgreement")
        @l
        private final C13156a contestAgreement;

        @com.google.gson.annotations.c("description")
        @l
        private final AttributedText description;

        @com.google.gson.annotations.c("emailForm")
        @l
        private final Bj0.b emailForm;

        @com.google.gson.annotations.c("image")
        @l
        private final Image image;

        @com.google.gson.annotations.c("isPromocodeLessProfitable")
        @l
        private final Boolean isPromocodeLessProfitable;

        @com.google.gson.annotations.c("licenseAgreement")
        @k
        private final AttributedText licenseAgreement;

        @com.google.gson.annotations.c("priceDetails")
        @k
        private final d priceDetails;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        public b(@k GetStepOrderDataAnalytics getStepOrderDataAnalytics, @l C13156a c13156a, @l AttributedText attributedText, @l Bj0.b bVar, @l Image image, @l Boolean bool, @k AttributedText attributedText2, @k d dVar, @k String str) {
            this.analytics = getStepOrderDataAnalytics;
            this.contestAgreement = c13156a;
            this.description = attributedText;
            this.emailForm = bVar;
            this.image = image;
            this.isPromocodeLessProfitable = bool;
            this.licenseAgreement = attributedText2;
            this.priceDetails = dVar;
            this.title = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final GetStepOrderDataAnalytics getAnalytics() {
            return this.analytics;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final C13156a getContestAgreement() {
            return this.contestAgreement;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Bj0.b getEmailForm() {
            return this.emailForm;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        /* renamed from: f, reason: from getter */
        public final AttributedText getLicenseAgreement() {
            return this.licenseAgreement;
        }

        @k
        /* renamed from: g, reason: from getter */
        public final d getPriceDetails() {
            return this.priceDetails;
        }

        @k
        /* renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: i, reason: from getter */
        public final Boolean getIsPromocodeLessProfitable() {
            return this.isPromocodeLessProfitable;
        }
    }
}

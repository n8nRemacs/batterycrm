package Rs0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data.ServiceBookingAdditionalSettingsElement;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdditionalSettingsResult.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LRs0/a;", "", "", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/screen_data/ServiceBookingAdditionalSettingsElement;", "elements", "", "hasCloseButton", "", "title", "LRs0/a$a;", "helpButton", "Lcom/avito/android/remote/model/text/AttributedText;", "licenseAgreement", "<init>", "(Ljava/util/List;ZLjava/lang/String;LRs0/a$a;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Z", "b", "()Z", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "LRs0/a$a;", "c", "()LRs0/a$a;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rs0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C15078a {

    @c("elements")
    @k
    private final List<ServiceBookingAdditionalSettingsElement> elements;

    @c("hasCloseButton")
    private final boolean hasCloseButton;

    @c("helpButton")
    @l
    private final C0989a helpButton;

    @c("licenseAgreement")
    @l
    private final AttributedText licenseAgreement;

    @c("title")
    @k
    private final String title;

    /* compiled from: AdditionalSettingsResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LRs0/a$a;", "", "", "text", ContextActionHandler.Link.URL, "textColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "b", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rs0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0989a {

        @c("text")
        @k
        private final String text;

        @c("textColor")
        @k
        private final String textColor;

        @c(ContextActionHandler.Link.URL)
        @k
        private final String url;

        public C0989a(@k String str, @k String str2, @k String str3) {
            this.text = str;
            this.url = str2;
            this.textColor = str3;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0989a)) {
                return false;
            }
            C0989a c0989a = (C0989a) obj;
            return L.f(this.text, c0989a.text) && L.f(this.url, c0989a.url) && L.f(this.textColor, c0989a.textColor);
        }

        public final int hashCode() {
            return this.textColor.hashCode() + H.d(this.text.hashCode() * 31, 31, this.url);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingAdditionalSettingsHelpButton(text=");
            sb2.append(this.text);
            sb2.append(", url=");
            sb2.append(this.url);
            sb2.append(", textColor=");
            return C22026a.c(sb2, this.textColor, ')');
        }
    }

    public C15078a(@k List<ServiceBookingAdditionalSettingsElement> list, boolean z12, @k String str, @l C0989a c0989a, @l AttributedText attributedText) {
        this.elements = list;
        this.hasCloseButton = z12;
        this.title = str;
        this.helpButton = c0989a;
        this.licenseAgreement = attributedText;
    }

    @k
    public final List<ServiceBookingAdditionalSettingsElement> a() {
        return this.elements;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHasCloseButton() {
        return this.hasCloseButton;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C0989a getHelpButton() {
        return this.helpButton;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getLicenseAgreement() {
        return this.licenseAgreement;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15078a)) {
            return false;
        }
        C15078a c15078a = (C15078a) obj;
        return L.f(this.elements, c15078a.elements) && this.hasCloseButton == c15078a.hasCloseButton && L.f(this.title, c15078a.title) && L.f(this.helpButton, c15078a.helpButton) && L.f(this.licenseAgreement, c15078a.licenseAgreement);
    }

    public final int hashCode() {
        int iD2 = H.d(r.i(this.elements.hashCode() * 31, 31, this.hasCloseButton), 31, this.title);
        C0989a c0989a = this.helpButton;
        int iHashCode = (iD2 + (c0989a == null ? 0 : c0989a.hashCode())) * 31;
        AttributedText attributedText = this.licenseAgreement;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdditionalSettingsResult(elements=");
        sb2.append(this.elements);
        sb2.append(", hasCloseButton=");
        sb2.append(this.hasCloseButton);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", helpButton=");
        sb2.append(this.helpButton);
        sb2.append(", licenseAgreement=");
        return com.avito.android.actions_sheet.a.w(sb2, this.licenseAgreement, ')');
    }
}

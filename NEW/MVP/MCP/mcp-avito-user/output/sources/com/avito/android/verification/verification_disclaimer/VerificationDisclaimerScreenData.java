package com.avito.android.verification.verification_disclaimer;

import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationDisclaimerScreenData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/VerificationDisclaimerScreenData;", "", "a", "Button", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VerificationDisclaimerScreenData {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f325035a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f325036b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f325037c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ArrayList f325038d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f325039e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f325040f;

    /* compiled from: VerificationDisclaimerScreenData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/VerificationDisclaimerScreenData$Button;", "", "Style", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f325041a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f325042b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f325043c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Style f325044d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VerificationDisclaimerScreenData.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/VerificationDisclaimerScreenData$Button$Style;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Style {

            /* renamed from: b, reason: collision with root package name */
            public static final Style f325045b;

            /* renamed from: c, reason: collision with root package name */
            public static final Style f325046c;

            /* renamed from: d, reason: collision with root package name */
            public static final Style f325047d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ Style[] f325048e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f325049f;

            static {
                Style style = new Style("DEFAULT", 0);
                f325045b = style;
                Style style2 = new Style("PRIMARY", 1);
                f325046c = style2;
                Style style3 = new Style("SECONDARY", 2);
                f325047d = style3;
                Style[] styleArr = {style, style2, style3};
                f325048e = styleArr;
                f325049f = kotlin.enums.c.a(styleArr);
            }

            public Style() {
                throw null;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) f325048e.clone();
            }
        }

        public Button(@Y61.k String str, @Y61.k DeepLink deepLink, boolean z12, @Y61.k Style style) {
            this.f325041a = str;
            this.f325042b = deepLink;
            this.f325043c = z12;
            this.f325044d = style;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f325041a, button.f325041a) && L.f(this.f325042b, button.f325042b) && this.f325043c == button.f325043c && this.f325044d == button.f325044d;
        }

        public final int hashCode() {
            return this.f325044d.hashCode() + r.i(com.avito.android.actions_sheet.a.e(this.f325042b, this.f325041a.hashCode() * 31, 31), 31, this.f325043c);
        }

        @Y61.k
        public final String toString() {
            return "Button(text=" + this.f325041a + ", deepLink=" + this.f325042b + ", disabled=" + this.f325043c + ", style=" + this.f325044d + ')';
        }
    }

    /* compiled from: VerificationDisclaimerScreenData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/VerificationDisclaimerScreenData$a;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f325050a;

        /* renamed from: b, reason: collision with root package name */
        public final int f325051b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f325052c;

        public a(@InterfaceC42150f int i12, @Y61.k DeepLink deepLink, @Y61.k String str) {
            this.f325050a = str;
            this.f325051b = i12;
            this.f325052c = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f325050a, aVar.f325050a) && this.f325051b == aVar.f325051b && L.f(this.f325052c, aVar.f325052c);
        }

        public final int hashCode() {
            return this.f325052c.hashCode() + r.e(this.f325051b, this.f325050a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.f325050a);
            sb2.append(", actionIcon=");
            sb2.append(this.f325051b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f325052c, ')');
        }
    }

    public VerificationDisclaimerScreenData(@Y61.k ArrayList arrayList, @Y61.k Button button, @Y61.l AttributedText attributedText, @Y61.l ArrayList arrayList2, @Y61.l UniversalImage universalImage, boolean z12) {
        this.f325035a = arrayList;
        this.f325036b = button;
        this.f325037c = attributedText;
        this.f325038d = arrayList2;
        this.f325039e = universalImage;
        this.f325040f = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationDisclaimerScreenData)) {
            return false;
        }
        VerificationDisclaimerScreenData verificationDisclaimerScreenData = (VerificationDisclaimerScreenData) obj;
        return this.f325035a.equals(verificationDisclaimerScreenData.f325035a) && this.f325036b.equals(verificationDisclaimerScreenData.f325036b) && L.f(this.f325037c, verificationDisclaimerScreenData.f325037c) && L.f(this.f325038d, verificationDisclaimerScreenData.f325038d) && L.f(this.f325039e, verificationDisclaimerScreenData.f325039e) && this.f325040f == verificationDisclaimerScreenData.f325040f;
    }

    public final int hashCode() {
        int iHashCode = (this.f325036b.hashCode() + (this.f325035a.hashCode() * 31)) * 31;
        AttributedText attributedText = this.f325037c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ArrayList arrayList = this.f325038d;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        UniversalImage universalImage = this.f325039e;
        return Boolean.hashCode(this.f325040f) + ((iHashCode3 + (universalImage != null ? universalImage.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationDisclaimerScreenData(items=");
        sb2.append(this.f325035a);
        sb2.append(", button=");
        sb2.append(this.f325036b);
        sb2.append(", footer=");
        sb2.append(this.f325037c);
        sb2.append(", secondaryActions=");
        sb2.append(this.f325038d);
        sb2.append(", image=");
        sb2.append(this.f325039e);
        sb2.append(", isClosable=");
        return r.x(sb2, this.f325040f, ')');
    }
}

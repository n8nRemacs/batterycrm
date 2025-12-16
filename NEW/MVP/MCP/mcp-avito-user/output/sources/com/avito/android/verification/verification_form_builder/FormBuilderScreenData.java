package com.avito.android.verification.verification_form_builder;

import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FormBuilderScreenData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData;", "", "Button", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormBuilderScreenData {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Button f325350a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f325351b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f325352c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f325353d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.conveyor_item.a> f325354e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Integer f325355f;

    /* JADX WARN: Multi-variable type inference failed */
    public FormBuilderScreenData(@Y61.l Button button, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, boolean z12, @Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.l Integer num) {
        this.f325350a = button;
        this.f325351b = attributedText;
        this.f325352c = attributedText2;
        this.f325353d = z12;
        this.f325354e = list;
        this.f325355f = num;
    }

    public static FormBuilderScreenData a(FormBuilderScreenData formBuilderScreenData, Button button, List list, Integer num, int i12) {
        if ((i12 & 1) != 0) {
            button = formBuilderScreenData.f325350a;
        }
        Button button2 = button;
        AttributedText attributedText = formBuilderScreenData.f325351b;
        AttributedText attributedText2 = formBuilderScreenData.f325352c;
        boolean z12 = formBuilderScreenData.f325353d;
        if ((i12 & 16) != 0) {
            list = formBuilderScreenData.f325354e;
        }
        List list2 = list;
        if ((i12 & 32) != 0) {
            num = formBuilderScreenData.f325355f;
        }
        formBuilderScreenData.getClass();
        return new FormBuilderScreenData(button2, attributedText, attributedText2, z12, list2, num);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormBuilderScreenData)) {
            return false;
        }
        FormBuilderScreenData formBuilderScreenData = (FormBuilderScreenData) obj;
        return L.f(this.f325350a, formBuilderScreenData.f325350a) && L.f(this.f325351b, formBuilderScreenData.f325351b) && L.f(this.f325352c, formBuilderScreenData.f325352c) && this.f325353d == formBuilderScreenData.f325353d && L.f(this.f325354e, formBuilderScreenData.f325354e) && L.f(this.f325355f, formBuilderScreenData.f325355f);
    }

    public final int hashCode() {
        Button button = this.f325350a;
        int iHashCode = (button == null ? 0 : button.hashCode()) * 31;
        AttributedText attributedText = this.f325351b;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f325352c;
        int iE2 = H.e(androidx.appcompat.app.r.i((iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31, 31, this.f325353d), 31, this.f325354e);
        Integer num = this.f325355f;
        return iE2 + (num != null ? num.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FormBuilderScreenData(action=");
        sb2.append(this.f325350a);
        sb2.append(", footerBottom=");
        sb2.append(this.f325351b);
        sb2.append(", footerTop=");
        sb2.append(this.f325352c);
        sb2.append(", isClosable=");
        sb2.append(this.f325353d);
        sb2.append(", items=");
        sb2.append(this.f325354e);
        sb2.append(", scrollTo=");
        return s.j(sb2, this.f325355f, ')');
    }

    /* compiled from: FormBuilderScreenData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData$Button;", "", "Style", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f325356a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final a f325357b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Style f325358c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f325359d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FormBuilderScreenData.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData$Button$Style;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Style {

            /* renamed from: b, reason: collision with root package name */
            public static final Style f325360b;

            /* renamed from: c, reason: collision with root package name */
            public static final Style f325361c;

            /* renamed from: d, reason: collision with root package name */
            public static final Style f325362d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ Style[] f325363e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f325364f;

            static {
                Style style = new Style("DEFAULT", 0);
                f325360b = style;
                Style style2 = new Style("PRIMARY", 1);
                f325361c = style2;
                Style style3 = new Style("SECONDARY", 2);
                f325362d = style3;
                Style[] styleArr = {style, style2, style3};
                f325363e = styleArr;
                f325364f = kotlin.enums.c.a(styleArr);
            }

            public Style() {
                throw null;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) f325363e.clone();
            }
        }

        /* compiled from: FormBuilderScreenData.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData$Button$a;", "", "a", "b", "c", "Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData$Button$a$a;", "Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData$Button$a$b;", "Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData$Button$a$c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface a {

            /* compiled from: FormBuilderScreenData.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData$Button$a$a;", "Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData$Button$a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.verification.verification_form_builder.FormBuilderScreenData$Button$a$a, reason: collision with other inner class name */
            public static final /* data */ class C10060a implements a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C10060a f325365a = new C10060a();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C10060a);
                }

                public final int hashCode() {
                    return -1912553742;
                }

                @Y61.k
                public final String toString() {
                    return "Back";
                }
            }

            /* compiled from: FormBuilderScreenData.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData$Button$a$b;", "Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData$Button$a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class b implements a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final DeepLink f325366a;

                public b(@Y61.k DeepLink deepLink) {
                    this.f325366a = deepLink;
                }
            }

            /* compiled from: FormBuilderScreenData.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData$Button$a$c;", "Lcom/avito/android/verification/verification_form_builder/FormBuilderScreenData$Button$a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class c implements a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final c f325367a = new c();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 1036637601;
                }

                @Y61.k
                public final String toString() {
                    return "Validate";
                }
            }
        }

        public Button(@Y61.k String str, @Y61.k a aVar, @Y61.k Style style, boolean z12) {
            this.f325356a = str;
            this.f325357b = aVar;
            this.f325358c = style;
            this.f325359d = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f325356a, button.f325356a) && L.f(this.f325357b, button.f325357b) && this.f325358c == button.f325358c && this.f325359d == button.f325359d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f325359d) + ((this.f325358c.hashCode() + ((this.f325357b.hashCode() + (this.f325356a.hashCode() * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f325356a);
            sb2.append(", type=");
            sb2.append(this.f325357b);
            sb2.append(", style=");
            sb2.append(this.f325358c);
            sb2.append(", isLoading=");
            return androidx.appcompat.app.r.x(sb2, this.f325359d, ')');
        }

        public /* synthetic */ Button(String str, a aVar, Style style, boolean z12, int i12, C42822w c42822w) {
            this(str, aVar, style, (i12 & 8) != 0 ? false : z12);
        }
    }

    public /* synthetic */ FormBuilderScreenData(Button button, AttributedText attributedText, AttributedText attributedText2, boolean z12, List list, Integer num, int i12, C42822w c42822w) {
        this(button, attributedText, attributedText2, z12, list, (i12 & 32) != 0 ? null : num);
    }
}

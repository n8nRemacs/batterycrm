package com.avito.android.verification.inn.list.button;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ButtonItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/button/ButtonItem;", "Lcom/avito/conveyor_item/a;", "Style", "Type", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ButtonItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323901b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f323902c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f323903d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f323904e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f323905f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Style f323906g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Type f323907h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f323908i;

    /* renamed from: j, reason: collision with root package name */
    public final int f323909j;

    /* renamed from: k, reason: collision with root package name */
    public final int f323910k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ButtonItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/button/ButtonItem$Style;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        /* renamed from: c, reason: collision with root package name */
        public static final Style f323911c;

        /* renamed from: d, reason: collision with root package name */
        public static final Style f323912d;

        /* renamed from: e, reason: collision with root package name */
        public static final Style f323913e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Style[] f323914f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f323915g;

        /* renamed from: b, reason: collision with root package name */
        public final int f323916b;

        static {
            Style style = new Style("DEFAULT", 0, R.attr.buttonDefaultLarge);
            f323911c = style;
            Style style2 = new Style("PRIMARY", 1, R.attr.buttonPrimaryLarge);
            f323912d = style2;
            Style style3 = new Style("SECONDARY", 2, R.attr.buttonSecondaryLarge);
            f323913e = style3;
            Style[] styleArr = {style, style2, style3};
            f323914f = styleArr;
            f323915g = kotlin.enums.c.a(styleArr);
        }

        public Style(@InterfaceC42150f String str, int i12, int i13) {
            this.f323916b = i13;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f323914f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ButtonItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/button/ButtonItem$Type;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f323917b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f323918c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f323919d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Type[] f323920e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f323921f;

        static {
            Type type = new Type("DEEPLINK", 0);
            f323917b = type;
            Type type2 = new Type("VALIDATE", 1);
            f323918c = type2;
            Type type3 = new Type("BACK", 2);
            f323919d = type3;
            Type[] typeArr = {type, type2, type3};
            f323920e = typeArr;
            f323921f = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f323920e.clone();
        }
    }

    public ButtonItem(@k String str, @k String str2, @k DeepLink deepLink, boolean z12, boolean z13, @k Style style, @k Type type, @InterfaceC42150f @l Integer num, int i12, int i13) {
        this.f323901b = str;
        this.f323902c = str2;
        this.f323903d = deepLink;
        this.f323904e = z12;
        this.f323905f = z13;
        this.f323906g = style;
        this.f323907h = type;
        this.f323908i = num;
        this.f323909j = i12;
        this.f323910k = i13;
    }

    public static ButtonItem a(ButtonItem buttonItem, boolean z12) {
        String str = buttonItem.f323901b;
        String str2 = buttonItem.f323902c;
        DeepLink deepLink = buttonItem.f323903d;
        boolean z13 = buttonItem.f323904e;
        Style style = buttonItem.f323906g;
        Type type = buttonItem.f323907h;
        Integer num = buttonItem.f323908i;
        int i12 = buttonItem.f323909j;
        int i13 = buttonItem.f323910k;
        buttonItem.getClass();
        return new ButtonItem(str, str2, deepLink, z13, z12, style, type, num, i12, i13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonItem)) {
            return false;
        }
        ButtonItem buttonItem = (ButtonItem) obj;
        return L.f(this.f323901b, buttonItem.f323901b) && L.f(this.f323902c, buttonItem.f323902c) && L.f(this.f323903d, buttonItem.f323903d) && this.f323904e == buttonItem.f323904e && this.f323905f == buttonItem.f323905f && this.f323906g == buttonItem.f323906g && this.f323907h == buttonItem.f323907h && L.f(this.f323908i, buttonItem.f323908i) && this.f323909j == buttonItem.f323909j && this.f323910k == buttonItem.f323910k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269930b() {
        return getF322985b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF322985b() {
        return this.f323901b;
    }

    public final int hashCode() {
        int iHashCode = (this.f323907h.hashCode() + ((this.f323906g.hashCode() + r.i(r.i(com.avito.android.actions_sheet.a.e(this.f323903d, H.d(this.f323901b.hashCode() * 31, 31, this.f323902c), 31), 31, this.f323904e), 31, this.f323905f)) * 31)) * 31;
        Integer num = this.f323908i;
        return Integer.hashCode(this.f323910k) + r.e(this.f323909j, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonItem(stringId=");
        sb2.append(this.f323901b);
        sb2.append(", text=");
        sb2.append(this.f323902c);
        sb2.append(", uri=");
        sb2.append(this.f323903d);
        sb2.append(", isDisabled=");
        sb2.append(this.f323904e);
        sb2.append(", isLoading=");
        sb2.append(this.f323905f);
        sb2.append(", style=");
        sb2.append(this.f323906g);
        sb2.append(", type=");
        sb2.append(this.f323907h);
        sb2.append(", iconAttr=");
        sb2.append(this.f323908i);
        sb2.append(", marginTop=");
        sb2.append(this.f323909j);
        sb2.append(", marginBottom=");
        return r.t(sb2, this.f323910k, ')');
    }

    public /* synthetic */ ButtonItem(String str, String str2, DeepLink deepLink, boolean z12, boolean z13, Style style, Type type, Integer num, int i12, int i13, int i14, C42822w c42822w) {
        this(str, str2, deepLink, (i14 & 8) != 0 ? false : z12, (i14 & 16) != 0 ? false : z13, (i14 & 32) != 0 ? Style.f323912d : style, (i14 & 64) != 0 ? Type.f323918c : type, (i14 & 128) != 0 ? 0 : num, (i14 & 256) != 0 ? 0 : i12, (i14 & 512) != 0 ? 0 : i13);
    }
}

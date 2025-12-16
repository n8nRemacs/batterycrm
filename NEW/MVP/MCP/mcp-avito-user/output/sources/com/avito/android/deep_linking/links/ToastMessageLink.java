package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ToastMessageLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/ToastMessageLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "c", "ToastBarPosition", "ToastTheme", "ToastType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ToastMessageLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ToastMessageLink> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133718b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ToastType f133719c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ToastBarPosition f133720d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133721e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133722f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f133723g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final ToastTheme f133724h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToastMessageLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ToastMessageLink$ToastBarPosition;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ToastBarPosition {

        /* renamed from: c, reason: collision with root package name */
        public static final ToastBarPosition f133725c;

        /* renamed from: d, reason: collision with root package name */
        public static final ToastBarPosition f133726d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ToastBarPosition[] f133727e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133728f;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f133729b;

        static {
            ToastBarPosition toastBarPosition = new ToastBarPosition("TOP", 0, "top");
            f133725c = toastBarPosition;
            ToastBarPosition toastBarPosition2 = new ToastBarPosition("BOTTOM", 1, "bottom");
            f133726d = toastBarPosition2;
            ToastBarPosition[] toastBarPositionArr = {toastBarPosition, toastBarPosition2};
            f133727e = toastBarPositionArr;
            f133728f = kotlin.enums.c.a(toastBarPositionArr);
        }

        public ToastBarPosition(String str, int i12, String str2) {
            this.f133729b = str2;
        }

        public static ToastBarPosition valueOf(String str) {
            return (ToastBarPosition) Enum.valueOf(ToastBarPosition.class, str);
        }

        public static ToastBarPosition[] values() {
            return (ToastBarPosition[]) f133727e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToastMessageLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ToastMessageLink$ToastTheme;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ToastTheme {

        /* renamed from: c, reason: collision with root package name */
        public static final ToastTheme f133730c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ToastTheme[] f133731d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133732e;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f133733b;

        static {
            ToastTheme toastTheme = new ToastTheme("AVITO_RE_23", 0, "avitoRe23");
            f133730c = toastTheme;
            ToastTheme[] toastThemeArr = {toastTheme, new ToastTheme("RE_23", 1, "re23")};
            f133731d = toastThemeArr;
            f133732e = kotlin.enums.c.a(toastThemeArr);
        }

        public ToastTheme(String str, int i12, String str2) {
            this.f133733b = str2;
        }

        public static ToastTheme valueOf(String str) {
            return (ToastTheme) Enum.valueOf(ToastTheme.class, str);
        }

        public static ToastTheme[] values() {
            return (ToastTheme[]) f133731d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToastMessageLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ToastMessageLink$ToastType;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ToastType {

        /* renamed from: c, reason: collision with root package name */
        public static final ToastType f133734c;

        /* renamed from: d, reason: collision with root package name */
        public static final ToastType f133735d;

        /* renamed from: e, reason: collision with root package name */
        public static final ToastType f133736e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ToastType[] f133737f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133738g;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f133739b;

        static {
            ToastType toastType = new ToastType("TOAST", 0, "toast");
            f133734c = toastType;
            ToastType toastType2 = new ToastType("TOAST_BAR", 1, "toastBar");
            f133735d = toastType2;
            ToastType toastType3 = new ToastType("TOAST_BAR_ERROR", 2, "toastBarError");
            f133736e = toastType3;
            ToastType[] toastTypeArr = {toastType, toastType2, toastType3};
            f133737f = toastTypeArr;
            f133738g = kotlin.enums.c.a(toastTypeArr);
        }

        public ToastType(String str, int i12, String str2) {
            this.f133739b = str2;
        }

        public static ToastType valueOf(String str) {
            return (ToastType) Enum.valueOf(ToastType.class, str);
        }

        public static ToastType[] values() {
            return (ToastType[]) f133737f.clone();
        }
    }

    /* compiled from: ToastMessageLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ToastMessageLink$a;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: ToastMessageLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ToastMessageLink> {
        @Override // android.os.Parcelable.Creator
        public final ToastMessageLink createFromParcel(Parcel parcel) {
            return new ToastMessageLink(parcel.readString(), ToastType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ToastBarPosition.valueOf(parcel.readString()), parcel.readString(), (DeepLink) parcel.readParcelable(ToastMessageLink.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : ToastTheme.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ToastMessageLink[] newArray(int i12) {
            return new ToastMessageLink[i12];
        }
    }

    /* compiled from: ToastMessageLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/ToastMessageLink$c;", "", "a", "b", "Lcom/avito/android/deep_linking/links/ToastMessageLink$c$a;", "Lcom/avito/android/deep_linking/links/ToastMessageLink$c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: ToastMessageLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/ToastMessageLink$c$a;", "LJu/c$a;", "Lcom/avito/android/deep_linking/links/ToastMessageLink$c;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.a, c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133740b = new a();
        }

        /* compiled from: ToastMessageLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/ToastMessageLink$c$b;", "LJu/c$b;", "Lcom/avito/android/deep_linking/links/ToastMessageLink$c;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC14249c.b, c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f133741b = new b();
        }
    }

    public /* synthetic */ ToastMessageLink(String str, ToastType toastType, ToastBarPosition toastBarPosition, String str2, DeepLink deepLink, boolean z12, ToastTheme toastTheme, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? ToastType.f133734c : toastType, (i12 & 4) != 0 ? null : toastBarPosition, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : deepLink, (i12 & 32) != 0 ? false : z12, (i12 & 64) == 0 ? toastTheme : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastMessageLink)) {
            return false;
        }
        ToastMessageLink toastMessageLink = (ToastMessageLink) obj;
        return kotlin.jvm.internal.L.f(this.f133718b, toastMessageLink.f133718b) && this.f133719c == toastMessageLink.f133719c && this.f133720d == toastMessageLink.f133720d && kotlin.jvm.internal.L.f(this.f133721e, toastMessageLink.f133721e) && kotlin.jvm.internal.L.f(this.f133722f, toastMessageLink.f133722f) && this.f133723g == toastMessageLink.f133723g && this.f133724h == toastMessageLink.f133724h;
    }

    public final int hashCode() {
        int iHashCode = (this.f133719c.hashCode() + (this.f133718b.hashCode() * 31)) * 31;
        ToastBarPosition toastBarPosition = this.f133720d;
        int iHashCode2 = (iHashCode + (toastBarPosition == null ? 0 : toastBarPosition.hashCode())) * 31;
        String str = this.f133721e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f133722f;
        int i12 = androidx.appcompat.app.r.i((iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f133723g);
        ToastTheme toastTheme = this.f133724h;
        return i12 + (toastTheme != null ? toastTheme.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ToastMessageLink(message=" + this.f133718b + ", type=" + this.f133719c + ", barPosition=" + this.f133720d + ", actionTitle=" + this.f133721e + ", actionLink=" + this.f133722f + ", closeOnAction=" + this.f133723g + ", theme=" + this.f133724h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133718b);
        parcel.writeString(this.f133719c.name());
        ToastBarPosition toastBarPosition = this.f133720d;
        if (toastBarPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(toastBarPosition.name());
        }
        parcel.writeString(this.f133721e);
        parcel.writeParcelable(this.f133722f, i12);
        parcel.writeInt(this.f133723g ? 1 : 0);
        ToastTheme toastTheme = this.f133724h;
        if (toastTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(toastTheme.name());
        }
    }

    public ToastMessageLink(@Y61.k String str, @Y61.k ToastType toastType, @Y61.l ToastBarPosition toastBarPosition, @Y61.l String str2, @Y61.l DeepLink deepLink, boolean z12, @Y61.l ToastTheme toastTheme) {
        this.f133718b = str;
        this.f133719c = toastType;
        this.f133720d = toastBarPosition;
        this.f133721e = str2;
        this.f133722f = deepLink;
        this.f133723g = z12;
        this.f133724h = toastTheme;
    }
}

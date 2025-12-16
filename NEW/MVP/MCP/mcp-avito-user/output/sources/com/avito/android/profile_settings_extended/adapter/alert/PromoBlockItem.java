package com.avito.android.profile_settings_extended.adapter.alert;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.grid.GridElementType;
import com.avito.android.lib.util.groupable_item.GroupingOutput;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.promoblock.TnsPromoBlockItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PromoBlockItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/alert/PromoBlockItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "Lcom/avito/android/promoblock/TnsPromoBlockItem;", "Button", "ButtonAnalyticParams", "CloseParams", "CommonAnalyticParams", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes16.dex */
public final /* data */ class PromoBlockItem implements SettingsListItem, TnsPromoBlockItem {

    @k
    public static final Parcelable.Creator<PromoBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229129b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229130c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f229131d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f229132e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TnsPromoBlockItem.Style f229133f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f229134g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f229135h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final GroupingOutput f229136i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f229137j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Button f229138k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Button f229139l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final CommonAnalyticParams f229140m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final CloseParams f229141n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229142o;

    /* compiled from: PromoBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/alert/PromoBlockItem$Button;", "Lcom/avito/android/promoblock/TnsPromoBlockItem$Button;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Button extends TnsPromoBlockItem.Button {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f229143e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final DeepLink f229144f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f229145g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final ButtonAnalyticParams f229146h;

        /* compiled from: PromoBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : ButtonAnalyticParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public /* synthetic */ Button(String str, DeepLink deepLink, boolean z12, ButtonAnalyticParams buttonAnalyticParams, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? false : z12, buttonAnalyticParams);
        }

        public static Button d(Button button, boolean z12) {
            String str = button.f229143e;
            DeepLink deepLink = button.f229144f;
            ButtonAnalyticParams buttonAnalyticParams = button.f229146h;
            button.getClass();
            return new Button(str, deepLink, z12, buttonAnalyticParams);
        }

        @Override // com.avito.android.promoblock.TnsPromoBlockItem.Button
        /* renamed from: c, reason: from getter */
        public final boolean getF229145g() {
            return this.f229145g;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f229143e, button.f229143e) && L.f(this.f229144f, button.f229144f) && this.f229145g == button.f229145g && L.f(this.f229146h, button.f229146h);
        }

        @Override // com.avito.android.promoblock.TnsPromoBlockItem.Button
        @k
        /* renamed from: getDeeplink, reason: from getter */
        public final DeepLink getF229144f() {
            return this.f229144f;
        }

        @Override // com.avito.android.promoblock.TnsPromoBlockItem.Button
        @k
        /* renamed from: getText, reason: from getter */
        public final String getF229143e() {
            return this.f229143e;
        }

        public final int hashCode() {
            int i12 = r.i(com.avito.android.actions_sheet.a.e(this.f229144f, this.f229143e.hashCode() * 31, 31), 31, this.f229145g);
            ButtonAnalyticParams buttonAnalyticParams = this.f229146h;
            return i12 + (buttonAnalyticParams == null ? 0 : buttonAnalyticParams.hashCode());
        }

        @k
        public final String toString() {
            return "Button(text=" + this.f229143e + ", deeplink=" + this.f229144f + ", isActionInProgress=" + this.f229145g + ", analyticParams=" + this.f229146h + ')';
        }

        @Override // com.avito.android.promoblock.TnsPromoBlockItem.Button, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f229143e);
            parcel.writeParcelable(this.f229144f, i12);
            parcel.writeInt(this.f229145g ? 1 : 0);
            ButtonAnalyticParams buttonAnalyticParams = this.f229146h;
            if (buttonAnalyticParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonAnalyticParams.writeToParcel(parcel, i12);
            }
        }

        public Button(@k String str, @k DeepLink deepLink, boolean z12, @l ButtonAnalyticParams buttonAnalyticParams) {
            super(str, deepLink, z12);
            this.f229143e = str;
            this.f229144f = deepLink;
            this.f229145g = z12;
            this.f229146h = buttonAnalyticParams;
        }
    }

    /* compiled from: PromoBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/alert/PromoBlockItem$ButtonAnalyticParams;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ButtonAnalyticParams implements Parcelable {

        @k
        public static final Parcelable.Creator<ButtonAnalyticParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229147b;

        /* compiled from: PromoBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ButtonAnalyticParams> {
            @Override // android.os.Parcelable.Creator
            public final ButtonAnalyticParams createFromParcel(Parcel parcel) {
                return new ButtonAnalyticParams(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonAnalyticParams[] newArray(int i12) {
                return new ButtonAnalyticParams[i12];
            }
        }

        public ButtonAnalyticParams(@k String str) {
            this.f229147b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f229147b);
        }
    }

    /* compiled from: PromoBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/alert/PromoBlockItem$CloseParams;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class CloseParams implements Parcelable {

        @k
        public static final Parcelable.Creator<CloseParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229148b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f229149c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f229150d;

        /* compiled from: PromoBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CloseParams> {
            @Override // android.os.Parcelable.Creator
            public final CloseParams createFromParcel(Parcel parcel) {
                return new CloseParams(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CloseParams[] newArray(int i12) {
                return new CloseParams[i12];
            }
        }

        public CloseParams(@k String str, @k String str2, @k String str3) {
            this.f229148b = str;
            this.f229149c = str2;
            this.f229150d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f229148b);
            parcel.writeString(this.f229149c);
            parcel.writeString(this.f229150d);
        }
    }

    /* compiled from: PromoBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/alert/PromoBlockItem$CommonAnalyticParams;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class CommonAnalyticParams implements Parcelable {

        @k
        public static final Parcelable.Creator<CommonAnalyticParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229151b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f229152c;

        /* compiled from: PromoBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CommonAnalyticParams> {
            @Override // android.os.Parcelable.Creator
            public final CommonAnalyticParams createFromParcel(Parcel parcel) {
                return new CommonAnalyticParams(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CommonAnalyticParams[] newArray(int i12) {
                return new CommonAnalyticParams[i12];
            }
        }

        public CommonAnalyticParams(@k String str, @k String str2) {
            this.f229151b = str;
            this.f229152c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f229151b);
            parcel.writeString(this.f229152c);
        }
    }

    /* compiled from: PromoBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final PromoBlockItem createFromParcel(Parcel parcel) {
            return new PromoBlockItem(parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(PromoBlockItem.class.getClassLoader()), TnsPromoBlockItem.Style.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, (GroupingOutput) parcel.readParcelable(PromoBlockItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CommonAnalyticParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CloseParams.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoBlockItem[] newArray(int i12) {
            return new PromoBlockItem[i12];
        }
    }

    public PromoBlockItem(@k String str, @l String str2, @l String str3, @l AttributedText attributedText, @k TnsPromoBlockItem.Style style, boolean z12, boolean z13, @k GroupingOutput groupingOutput, @k String str4, @l Button button, @l Button button2, @l CommonAnalyticParams commonAnalyticParams, @l CloseParams closeParams) {
        this.f229129b = str;
        this.f229130c = str2;
        this.f229131d = str3;
        this.f229132e = attributedText;
        this.f229133f = style;
        this.f229134g = z12;
        this.f229135h = z13;
        this.f229136i = groupingOutput;
        this.f229137j = str4;
        this.f229138k = button;
        this.f229139l = button2;
        this.f229140m = commonAnalyticParams;
        this.f229141n = closeParams;
        this.f229142o = GridElementType.FullWidth.f161209b;
    }

    public static PromoBlockItem a(PromoBlockItem promoBlockItem, Button button, Button button2, int i12) {
        String str = promoBlockItem.f229129b;
        String str2 = promoBlockItem.f229130c;
        String str3 = promoBlockItem.f229131d;
        AttributedText attributedText = promoBlockItem.f229132e;
        TnsPromoBlockItem.Style style = promoBlockItem.f229133f;
        boolean z12 = promoBlockItem.f229134g;
        boolean z13 = promoBlockItem.f229135h;
        GroupingOutput groupingOutput = promoBlockItem.f229136i;
        String str4 = promoBlockItem.f229137j;
        Button button3 = (i12 & 512) != 0 ? promoBlockItem.f229138k : button;
        Button button4 = (i12 & 1024) != 0 ? promoBlockItem.f229139l : button2;
        CommonAnalyticParams commonAnalyticParams = promoBlockItem.f229140m;
        CloseParams closeParams = promoBlockItem.f229141n;
        promoBlockItem.getClass();
        return new PromoBlockItem(str, str2, str3, attributedText, style, z12, z13, groupingOutput, str4, button3, button4, commonAnalyticParams, closeParams);
    }

    @Override // com.avito.android.promoblock.TnsPromoBlockItem
    /* renamed from: T2 */
    public final TnsPromoBlockItem.Button getF224509m() {
        return this.f229139l;
    }

    @Override // com.avito.android.promoblock.TnsPromoBlockItem
    /* renamed from: T3 */
    public final TnsPromoBlockItem.Button getF224508l() {
        return this.f229138k;
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    /* renamed from: W, reason: from getter */
    public final boolean getF229135h() {
        return this.f229135h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoBlockItem)) {
            return false;
        }
        PromoBlockItem promoBlockItem = (PromoBlockItem) obj;
        return L.f(this.f229129b, promoBlockItem.f229129b) && L.f(this.f229130c, promoBlockItem.f229130c) && L.f(this.f229131d, promoBlockItem.f229131d) && L.f(this.f229132e, promoBlockItem.f229132e) && this.f229133f == promoBlockItem.f229133f && this.f229134g == promoBlockItem.f229134g && this.f229135h == promoBlockItem.f229135h && L.f(this.f229136i, promoBlockItem.f229136i) && L.f(this.f229137j, promoBlockItem.f229137j) && L.f(this.f229138k, promoBlockItem.f229138k) && L.f(this.f229139l, promoBlockItem.f229139l) && L.f(this.f229140m, promoBlockItem.f229140m) && L.f(this.f229141n, promoBlockItem.f229141n);
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    @k
    /* renamed from: f, reason: from getter */
    public final GroupingOutput getF229136i() {
        return this.f229136i;
    }

    @Override // com.avito.android.promoblock.TnsPromoBlockItem
    @l
    /* renamed from: getDescription, reason: from getter */
    public final String getF229131d() {
        return this.f229131d;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154248c() {
        return this.f229142o;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229164b() {
        return this.f229129b;
    }

    @Override // com.avito.android.promoblock.TnsPromoBlockItem
    @k
    /* renamed from: getStyle, reason: from getter */
    public final TnsPromoBlockItem.Style getF229133f() {
        return this.f229133f;
    }

    @Override // com.avito.android.promoblock.TnsPromoBlockItem
    @l
    /* renamed from: getTitle, reason: from getter */
    public final String getF229130c() {
        return this.f229130c;
    }

    public final int hashCode() {
        int iHashCode = this.f229129b.hashCode() * 31;
        String str = this.f229130c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f229131d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f229132e;
        int iD2 = H.d((this.f229136i.hashCode() + r.i(r.i((this.f229133f.hashCode() + ((iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31, 31, this.f229134g), 31, this.f229135h)) * 31, 31, this.f229137j);
        Button button = this.f229138k;
        int iHashCode4 = (iD2 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.f229139l;
        int iHashCode5 = (iHashCode4 + (button2 == null ? 0 : button2.hashCode())) * 31;
        CommonAnalyticParams commonAnalyticParams = this.f229140m;
        int iHashCode6 = (iHashCode5 + (commonAnalyticParams == null ? 0 : commonAnalyticParams.hashCode())) * 31;
        CloseParams closeParams = this.f229141n;
        return iHashCode6 + (closeParams != null ? closeParams.hashCode() : 0);
    }

    @Override // com.avito.android.promoblock.TnsPromoBlockItem
    @l
    /* renamed from: l3, reason: from getter */
    public final AttributedText getF229132e() {
        return this.f229132e;
    }

    @k
    public final String toString() {
        return "PromoBlockItem(stringId=" + this.f229129b + ", title=" + this.f229130c + ", description=" + this.f229131d + ", attributedDescription=" + this.f229132e + ", style=" + this.f229133f + ", isCloseable=" + this.f229134g + ", closeable=" + this.f229135h + ", output=" + this.f229136i + ", position=" + this.f229137j + ", firstActionButton=" + this.f229138k + ", secondActionButton=" + this.f229139l + ", analyticParams=" + this.f229140m + ", closeParams=" + this.f229141n + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229129b);
        parcel.writeString(this.f229130c);
        parcel.writeString(this.f229131d);
        parcel.writeParcelable(this.f229132e, i12);
        parcel.writeString(this.f229133f.name());
        parcel.writeInt(this.f229134g ? 1 : 0);
        parcel.writeInt(this.f229135h ? 1 : 0);
        parcel.writeParcelable(this.f229136i, i12);
        parcel.writeString(this.f229137j);
        Button button = this.f229138k;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i12);
        }
        Button button2 = this.f229139l;
        if (button2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button2.writeToParcel(parcel, i12);
        }
        CommonAnalyticParams commonAnalyticParams = this.f229140m;
        if (commonAnalyticParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonAnalyticParams.writeToParcel(parcel, i12);
        }
        CloseParams closeParams = this.f229141n;
        if (closeParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            closeParams.writeToParcel(parcel, i12);
        }
    }

    @Override // com.avito.android.promoblock.TnsPromoBlockItem
    /* renamed from: x1, reason: from getter */
    public final boolean getF229134g() {
        return this.f229134g;
    }

    public /* synthetic */ PromoBlockItem(String str, String str2, String str3, AttributedText attributedText, TnsPromoBlockItem.Style style, boolean z12, boolean z13, GroupingOutput groupingOutput, String str4, Button button, Button button2, CommonAnalyticParams commonAnalyticParams, CloseParams closeParams, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "alert_item" : str, str2, str3, attributedText, style, z12, z13, (i12 & 128) != 0 ? new GroupingOutput() : groupingOutput, (i12 & 256) != 0 ? "" : str4, button, button2, commonAnalyticParams, closeParams);
    }
}

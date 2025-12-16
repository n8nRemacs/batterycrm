package com.avito.android.profile_settings_extended.adapter.banner;

import Rb0.InterfaceC15025a;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedSettingsBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/banner/ExtendedSettingsBannerItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "ChangeDialog", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ExtendedSettingsBannerItem implements SettingsListItem, InterfaceC15025a {

    @Y61.k
    public static final Parcelable.Creator<ExtendedSettingsBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f229164b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f229165c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f229166d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f229167e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f229168f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f229169g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<UploadImage> f229170h;

    /* renamed from: i, reason: collision with root package name */
    public final int f229171i;

    /* renamed from: j, reason: collision with root package name */
    public final int f229172j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ChangeDialog f229173k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f229174l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final String f229175m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f229176n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final GridElementType.FullWidth f229177o;

    /* compiled from: ExtendedSettingsBannerItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/banner/ExtendedSettingsBannerItem$ChangeDialog;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ChangeDialog implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ChangeDialog> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f229178b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f229179c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f229180d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f229181e;

        /* compiled from: ExtendedSettingsBannerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ChangeDialog> {
            @Override // android.os.Parcelable.Creator
            public final ChangeDialog createFromParcel(Parcel parcel) {
                return new ChangeDialog(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ChangeDialog[] newArray(int i12) {
                return new ChangeDialog[i12];
            }
        }

        public ChangeDialog(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
            this.f229178b = str;
            this.f229179c = str2;
            this.f229180d = str3;
            this.f229181e = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeDialog)) {
                return false;
            }
            ChangeDialog changeDialog = (ChangeDialog) obj;
            return L.f(this.f229178b, changeDialog.f229178b) && L.f(this.f229179c, changeDialog.f229179c) && L.f(this.f229180d, changeDialog.f229180d) && L.f(this.f229181e, changeDialog.f229181e);
        }

        public final int hashCode() {
            return this.f229181e.hashCode() + H.d(H.d(this.f229178b.hashCode() * 31, 31, this.f229179c), 31, this.f229180d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeDialog(title=");
            sb2.append(this.f229178b);
            sb2.append(", message=");
            sb2.append(this.f229179c);
            sb2.append(", submitButtonTitle=");
            sb2.append(this.f229180d);
            sb2.append(", cancelButtonTitle=");
            return C22026a.c(sb2, this.f229181e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f229178b);
            parcel.writeString(this.f229179c);
            parcel.writeString(this.f229180d);
            parcel.writeString(this.f229181e);
        }
    }

    /* compiled from: ExtendedSettingsBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedSettingsBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsBannerItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ExtendedSettingsBannerItem.class.getClassLoader());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ExtendedSettingsBannerItem.class, parcel, arrayList, iL2, 1);
            }
            return new ExtendedSettingsBannerItem(string, string2, string3, attributedText, string4, string5, arrayList, parcel.readInt(), parcel.readInt(), ChangeDialog.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsBannerItem[] newArray(int i12) {
            return new ExtendedSettingsBannerItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedSettingsBannerItem(@Y61.k String str, @Y61.k String str2, @l String str3, @l AttributedText attributedText, @Y61.k String str4, @Y61.k String str5, @Y61.k List<? extends UploadImage> list, int i12, int i13, @Y61.k ChangeDialog changeDialog, @Y61.k String str6, @Y61.k String str7, boolean z12) {
        this.f229164b = str;
        this.f229165c = str2;
        this.f229166d = str3;
        this.f229167e = attributedText;
        this.f229168f = str4;
        this.f229169g = str5;
        this.f229170h = list;
        this.f229171i = i12;
        this.f229172j = i13;
        this.f229173k = changeDialog;
        this.f229174l = str6;
        this.f229175m = str7;
        this.f229176n = z12;
        this.f229177o = GridElementType.FullWidth.f161209b;
    }

    public static ExtendedSettingsBannerItem a(ExtendedSettingsBannerItem extendedSettingsBannerItem, ArrayList arrayList) {
        return new ExtendedSettingsBannerItem(extendedSettingsBannerItem.f229164b, extendedSettingsBannerItem.f229165c, extendedSettingsBannerItem.f229166d, extendedSettingsBannerItem.f229167e, extendedSettingsBannerItem.f229168f, extendedSettingsBannerItem.f229169g, arrayList, extendedSettingsBannerItem.f229171i, extendedSettingsBannerItem.f229172j, extendedSettingsBannerItem.f229173k, extendedSettingsBannerItem.f229174l, extendedSettingsBannerItem.f229175m, extendedSettingsBannerItem.f229176n);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedSettingsBannerItem)) {
            return false;
        }
        ExtendedSettingsBannerItem extendedSettingsBannerItem = (ExtendedSettingsBannerItem) obj;
        return L.f(this.f229164b, extendedSettingsBannerItem.f229164b) && L.f(this.f229165c, extendedSettingsBannerItem.f229165c) && L.f(this.f229166d, extendedSettingsBannerItem.f229166d) && L.f(this.f229167e, extendedSettingsBannerItem.f229167e) && L.f(this.f229168f, extendedSettingsBannerItem.f229168f) && L.f(this.f229169g, extendedSettingsBannerItem.f229169g) && L.f(this.f229170h, extendedSettingsBannerItem.f229170h) && this.f229171i == extendedSettingsBannerItem.f229171i && this.f229172j == extendedSettingsBannerItem.f229172j && L.f(this.f229173k, extendedSettingsBannerItem.f229173k) && L.f(this.f229174l, extendedSettingsBannerItem.f229174l) && L.f(this.f229175m, extendedSettingsBannerItem.f229175m) && this.f229176n == extendedSettingsBannerItem.f229176n;
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public final GridElementType getF154248c() {
        return this.f229177o;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF228582b() {
        return this.f229164b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f229164b.hashCode() * 31, 31, this.f229165c);
        String str = this.f229166d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f229167e;
        return Boolean.hashCode(this.f229176n) + H.d(H.d((this.f229173k.hashCode() + r.e(this.f229172j, r.e(this.f229171i, H.e(H.d(H.d((iHashCode + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.f229168f), 31, this.f229169g), 31, this.f229170h), 31), 31)) * 31, 31, this.f229174l), 31, this.f229175m);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedSettingsBannerItem(stringId=");
        sb2.append(this.f229164b);
        sb2.append(", fieldName=");
        sb2.append(this.f229165c);
        sb2.append(", title=");
        sb2.append(this.f229166d);
        sb2.append(", description=");
        sb2.append(this.f229167e);
        sb2.append(", uploadButtonTitle=");
        sb2.append(this.f229168f);
        sb2.append(", changeButtonTitle=");
        sb2.append(this.f229169g);
        sb2.append(", images=");
        sb2.append(this.f229170h);
        sb2.append(", imageWidth=");
        sb2.append(this.f229171i);
        sb2.append(", imageHeight=");
        sb2.append(this.f229172j);
        sb2.append(", changeDialog=");
        sb2.append(this.f229173k);
        sb2.append(", imageModificationWarningTitle=");
        sb2.append(this.f229174l);
        sb2.append(", imageModificationWarningBody=");
        sb2.append(this.f229175m);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229176n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f229164b);
        parcel.writeString(this.f229165c);
        parcel.writeString(this.f229166d);
        parcel.writeParcelable(this.f229167e, i12);
        parcel.writeString(this.f229168f);
        parcel.writeString(this.f229169g);
        Iterator itJ = C0.j(this.f229170h, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f229171i);
        parcel.writeInt(this.f229172j);
        this.f229173k.writeToParcel(parcel, i12);
        parcel.writeString(this.f229174l);
        parcel.writeString(this.f229175m);
        parcel.writeInt(this.f229176n ? 1 : 0);
    }

    public /* synthetic */ ExtendedSettingsBannerItem(String str, String str2, String str3, AttributedText attributedText, String str4, String str5, List list, int i12, int i13, ChangeDialog changeDialog, String str6, String str7, boolean z12, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? "extended_settings_banner" : str, str2, str3, attributedText, str4, str5, list, i12, i13, changeDialog, str6, str7, z12);
    }
}

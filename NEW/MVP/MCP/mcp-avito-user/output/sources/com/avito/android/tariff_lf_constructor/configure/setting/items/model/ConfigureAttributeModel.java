package com.avito.android.tariff_lf_constructor.configure.setting.items.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConfigureAttributeModel.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/items/model/ConfigureAttributeModel;", "Landroid/os/Parcelable;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ConfigureAttributeModel implements Parcelable {

    @k
    public static final Parcelable.Creator<ConfigureAttributeModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f300086b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f300087c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f300088d;

    /* compiled from: ConfigureAttributeModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConfigureAttributeModel> {
        @Override // android.os.Parcelable.Creator
        public final ConfigureAttributeModel createFromParcel(Parcel parcel) {
            return new ConfigureAttributeModel(parcel.readString(), (AttributedText) parcel.readParcelable(ConfigureAttributeModel.class.getClassLoader()), (AttributedText) parcel.readParcelable(ConfigureAttributeModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ConfigureAttributeModel[] newArray(int i12) {
            return new ConfigureAttributeModel[i12];
        }
    }

    public ConfigureAttributeModel(@k String str, @l AttributedText attributedText, @l AttributedText attributedText2) {
        this.f300086b = str;
        this.f300087c = attributedText;
        this.f300088d = attributedText2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigureAttributeModel)) {
            return false;
        }
        ConfigureAttributeModel configureAttributeModel = (ConfigureAttributeModel) obj;
        return L.f(this.f300086b, configureAttributeModel.f300086b) && L.f(this.f300087c, configureAttributeModel.f300087c) && L.f(this.f300088d, configureAttributeModel.f300088d);
    }

    public final int hashCode() {
        int iHashCode = this.f300086b.hashCode() * 31;
        AttributedText attributedText = this.f300087c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f300088d;
        return iHashCode2 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigureAttributeModel(title=");
        sb2.append(this.f300086b);
        sb2.append(", value=");
        sb2.append(this.f300087c);
        sb2.append(", oldValue=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f300088d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f300086b);
        parcel.writeParcelable(this.f300087c, i12);
        parcel.writeParcelable(this.f300088d, i12);
    }

    public /* synthetic */ ConfigureAttributeModel(String str, AttributedText attributedText, AttributedText attributedText2, int i12, C42822w c42822w) {
        this(str, attributedText, (i12 & 4) != 0 ? null : attributedText2);
    }
}

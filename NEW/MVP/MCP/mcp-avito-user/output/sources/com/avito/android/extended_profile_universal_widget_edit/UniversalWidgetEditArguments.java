package com.avito.android.extended_profile_universal_widget_edit;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.remote.model.extended.UniversalWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetEditArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/UniversalWidgetEditArguments;", "Landroid/os/Parcelable;", "_avito_extended-profile-universal-widget-edit_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UniversalWidgetEditArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<UniversalWidgetEditArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f153652b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f153653c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetSectionModel.Section f153654d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f153655e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final UniversalWidget.UniversalWidgetSectionVisibilityStatus f153656f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final UniversalWidget.Config f153657g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f153658h;

    /* compiled from: UniversalWidgetEditArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalWidgetEditArguments> {
        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetEditArguments createFromParcel(Parcel parcel) {
            return new UniversalWidgetEditArguments(parcel.readString(), parcel.readString(), (UniversalWidgetSectionModel.Section) parcel.readParcelable(UniversalWidgetEditArguments.class.getClassLoader()), parcel.readInt() != 0, (UniversalWidget.UniversalWidgetSectionVisibilityStatus) parcel.readParcelable(UniversalWidgetEditArguments.class.getClassLoader()), (UniversalWidget.Config) parcel.readParcelable(UniversalWidgetEditArguments.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetEditArguments[] newArray(int i12) {
            return new UniversalWidgetEditArguments[i12];
        }
    }

    public UniversalWidgetEditArguments(@Y61.k String str, @Y61.k String str2, @Y61.k UniversalWidgetSectionModel.Section section, boolean z12, @Y61.k UniversalWidget.UniversalWidgetSectionVisibilityStatus universalWidgetSectionVisibilityStatus, @Y61.k UniversalWidget.Config config, boolean z13) {
        this.f153652b = str;
        this.f153653c = str2;
        this.f153654d = section;
        this.f153655e = z12;
        this.f153656f = universalWidgetSectionVisibilityStatus;
        this.f153657g = config;
        this.f153658h = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalWidgetEditArguments)) {
            return false;
        }
        UniversalWidgetEditArguments universalWidgetEditArguments = (UniversalWidgetEditArguments) obj;
        return L.f(this.f153652b, universalWidgetEditArguments.f153652b) && L.f(this.f153653c, universalWidgetEditArguments.f153653c) && L.f(this.f153654d, universalWidgetEditArguments.f153654d) && this.f153655e == universalWidgetEditArguments.f153655e && L.f(this.f153656f, universalWidgetEditArguments.f153656f) && L.f(this.f153657g, universalWidgetEditArguments.f153657g) && this.f153658h == universalWidgetEditArguments.f153658h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153658h) + ((this.f153657g.hashCode() + ((this.f153656f.hashCode() + r.i((this.f153654d.hashCode() + H.d(this.f153652b.hashCode() * 31, 31, this.f153653c)) * 31, 31, this.f153655e)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidgetEditArguments(fieldName=");
        sb2.append(this.f153652b);
        sb2.append(", valueId=");
        sb2.append(this.f153653c);
        sb2.append(", universalWidgetSection=");
        sb2.append(this.f153654d);
        sb2.append(", isVisibleByUser=");
        sb2.append(this.f153655e);
        sb2.append(", visibilityStatus=");
        sb2.append(this.f153656f);
        sb2.append(", config=");
        sb2.append(this.f153657g);
        sb2.append(", afterCreate=");
        return r.x(sb2, this.f153658h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f153652b);
        parcel.writeString(this.f153653c);
        parcel.writeParcelable(this.f153654d, i12);
        parcel.writeInt(this.f153655e ? 1 : 0);
        parcel.writeParcelable(this.f153656f, i12);
        parcel.writeParcelable(this.f153657g, i12);
        parcel.writeInt(this.f153658h ? 1 : 0);
    }
}

package com.avito.android.extended_profile_universal_widget_edit.edit_block;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.remote.model.extended.UniversalWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetEditBlockArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetEditBlockArguments;", "Landroid/os/Parcelable;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UniversalWidgetEditBlockArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<UniversalWidgetEditBlockArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetSectionModel.Section f153962b;

    /* renamed from: c, reason: collision with root package name */
    public final int f153963c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f153964d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final UniversalWidget.Config f153965e;

    /* compiled from: UniversalWidgetEditBlockArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalWidgetEditBlockArguments> {
        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetEditBlockArguments createFromParcel(Parcel parcel) {
            return new UniversalWidgetEditBlockArguments((UniversalWidgetSectionModel.Section) parcel.readParcelable(UniversalWidgetEditBlockArguments.class.getClassLoader()), parcel.readInt(), parcel.readString(), (UniversalWidget.Config) parcel.readParcelable(UniversalWidgetEditBlockArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetEditBlockArguments[] newArray(int i12) {
            return new UniversalWidgetEditBlockArguments[i12];
        }
    }

    public UniversalWidgetEditBlockArguments(@Y61.k UniversalWidgetSectionModel.Section section, int i12, @Y61.k String str, @Y61.k UniversalWidget.Config config) {
        this.f153962b = section;
        this.f153963c = i12;
        this.f153964d = str;
        this.f153965e = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalWidgetEditBlockArguments)) {
            return false;
        }
        UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments = (UniversalWidgetEditBlockArguments) obj;
        return L.f(this.f153962b, universalWidgetEditBlockArguments.f153962b) && this.f153963c == universalWidgetEditBlockArguments.f153963c && L.f(this.f153964d, universalWidgetEditBlockArguments.f153964d) && L.f(this.f153965e, universalWidgetEditBlockArguments.f153965e);
    }

    public final int hashCode() {
        return this.f153965e.hashCode() + H.d(androidx.appcompat.app.r.e(this.f153963c, this.f153962b.hashCode() * 31, 31), 31, this.f153964d);
    }

    @Y61.k
    public final String toString() {
        return "UniversalWidgetEditBlockArguments(section=" + this.f153962b + ", blockIndex=" + this.f153963c + ", sectionValueId=" + this.f153964d + ", config=" + this.f153965e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f153962b, i12);
        parcel.writeInt(this.f153963c);
        parcel.writeString(this.f153964d);
        parcel.writeParcelable(this.f153965e, i12);
    }
}

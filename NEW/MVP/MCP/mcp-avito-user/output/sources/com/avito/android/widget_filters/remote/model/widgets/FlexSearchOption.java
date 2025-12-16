package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersDatesWidget.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/FlexSearchOption;", "Landroid/os/Parcelable;", "", "id", "", "title", "", "isSelected", "needDisplaySelected", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "d", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FlexSearchOption implements Parcelable {

    @k
    public static final Parcelable.Creator<FlexSearchOption> CREATOR = new a();

    @c("id")
    @l
    private final Integer id;

    @c("isSelected")
    @l
    private final Boolean isSelected;

    @c("needDisplaySelected")
    @l
    private final Boolean needDisplaySelected;

    @c("title")
    @l
    private final String title;

    /* compiled from: WidgetFiltersDatesWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexSearchOption> {
        @Override // android.os.Parcelable.Creator
        public final FlexSearchOption createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2 = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FlexSearchOption(numValueOf, string, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexSearchOption[] newArray(int i12) {
            return new FlexSearchOption[i12];
        }
    }

    public FlexSearchOption(@l Integer num, @l String str, @l Boolean bool, @l Boolean bool2) {
        this.id = num;
        this.title = str;
        this.isSelected = bool;
        this.needDisplaySelected = bool2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getNeedDisplaySelected() {
        return this.needDisplaySelected;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexSearchOption)) {
            return false;
        }
        FlexSearchOption flexSearchOption = (FlexSearchOption) obj;
        return L.f(this.id, flexSearchOption.id) && L.f(this.title, flexSearchOption.title) && L.f(this.isSelected, flexSearchOption.isSelected) && L.f(this.needDisplaySelected, flexSearchOption.needDisplaySelected);
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isSelected;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.needDisplaySelected;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlexSearchOption(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", isSelected=");
        sb2.append(this.isSelected);
        sb2.append(", needDisplaySelected=");
        return C0.g(sb2, this.needDisplaySelected, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.title);
        Boolean bool = this.isSelected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.needDisplaySelected;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }
}

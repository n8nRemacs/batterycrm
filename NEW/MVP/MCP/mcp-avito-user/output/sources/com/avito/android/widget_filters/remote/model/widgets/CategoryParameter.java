package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersCategoryWidget.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/CategoryParameter;", "Landroid/os/Parcelable;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersContentParameter;", "", "id", "", "isRequired", "updatesForm", "isVisible", "notSelectedErrorText", "", "Lcom/avito/android/widget_filters/remote/model/widgets/Category;", "_categories", "isMultiselect", "hintText", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "f", "i", "e", "Ljava/util/List;", "g", "d", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CategoryParameter implements Parcelable, WidgetFiltersContentParameter {

    @k
    public static final Parcelable.Creator<CategoryParameter> CREATOR = new a();

    @c("categories")
    @l
    private final List<Category> _categories;

    @c("hintText")
    @l
    private final String hintText;

    @c("id")
    @l
    private final String id;

    @c("isMultiselect")
    @l
    private final Boolean isMultiselect;

    @c("isRequired")
    @l
    private final Boolean isRequired;

    @c("isVisible")
    @l
    private final Boolean isVisible;

    @c("notSelectedErrorText")
    @l
    private final String notSelectedErrorText;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    /* compiled from: WidgetFiltersCategoryWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryParameter> {
        @Override // android.os.Parcelable.Creator
        public final CategoryParameter createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            ArrayList arrayList;
            Boolean boolValueOf4;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Category.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CategoryParameter(string, boolValueOf, boolValueOf2, boolValueOf3, string2, arrayList, boolValueOf4, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryParameter[] newArray(int i12) {
            return new CategoryParameter[i12];
        }
    }

    public CategoryParameter(@l String str, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l String str2, @l List<Category> list, @l Boolean bool4, @l String str3) {
        this.id = str;
        this.isRequired = bool;
        this.updatesForm = bool2;
        this.isVisible = bool3;
        this.notSelectedErrorText = str2;
        this._categories = list;
        this.isMultiselect = bool4;
        this.hintText = str3;
    }

    @k
    public final List<Category> c() {
        List<Category> list = this._categories;
        return list == null ? C42784z0.f406748b : list;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getNotSelectedErrorText() {
        return this.notSelectedErrorText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryParameter)) {
            return false;
        }
        CategoryParameter categoryParameter = (CategoryParameter) obj;
        return L.f(this.id, categoryParameter.id) && L.f(this.isRequired, categoryParameter.isRequired) && L.f(this.updatesForm, categoryParameter.updatesForm) && L.f(this.isVisible, categoryParameter.isVisible) && L.f(this.notSelectedErrorText, categoryParameter.notSelectedErrorText) && L.f(this._categories, categoryParameter._categories) && L.f(this.isMultiselect, categoryParameter.isMultiselect) && L.f(this.hintText, categoryParameter.hintText);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getIsMultiselect() {
        return this.isMultiselect;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Boolean getIsRequired() {
        return this.isRequired;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isRequired;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.updatesForm;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isVisible;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.notSelectedErrorText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Category> list = this._categories;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool4 = this.isMultiselect;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str3 = this.hintText;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryParameter(id=");
        sb2.append(this.id);
        sb2.append(", isRequired=");
        sb2.append(this.isRequired);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", isVisible=");
        sb2.append(this.isVisible);
        sb2.append(", notSelectedErrorText=");
        sb2.append(this.notSelectedErrorText);
        sb2.append(", _categories=");
        sb2.append(this._categories);
        sb2.append(", isMultiselect=");
        sb2.append(this.isMultiselect);
        sb2.append(", hintText=");
        return C22026a.c(sb2, this.hintText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        Boolean bool = this.isRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.updatesForm;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.isVisible;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        parcel.writeString(this.notSelectedErrorText);
        List<Category> list = this._categories;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Category) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Boolean bool4 = this.isMultiselect;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        parcel.writeString(this.hintText);
    }
}

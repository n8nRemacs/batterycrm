package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculation.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJj\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020 HÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020 HÖ\u0001¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u0018R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b5\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010\u001cR\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b8\u0010\u0012R\u0011\u0010:\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b<\u0010;¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/StrBookingCalculation;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "", "Lcom/avito/android/remote/model/StrBookingCollapsedCalculation;", "_collapsedCalculations", "", "_isCollapsed", "hint", "Lcom/avito/android/remote/model/StrBookingCalculationIcon;", "icon", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/StrBookingCalculationIcon;)V", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Boolean;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "component6", "component7", "()Lcom/avito/android/remote/model/StrBookingCalculationIcon;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/StrBookingCalculationIcon;)Lcom/avito/android/remote/model/StrBookingCalculation;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getDescription", "Ljava/util/List;", "Ljava/lang/Boolean;", "getHint", "Lcom/avito/android/remote/model/StrBookingCalculationIcon;", "getIcon", "getCollapsedCalculations", "collapsedCalculations", "isCollapsable", "()Z", "isCollapsed", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrBookingCalculation implements Parcelable {

    @k
    public static final Parcelable.Creator<StrBookingCalculation> CREATOR = new Creator();

    @c("collapsedItems")
    @l
    private final List<StrBookingCollapsedCalculation> _collapsedCalculations;

    @c("collapsed")
    @l
    private final Boolean _isCollapsed;

    @c("description")
    @l
    private final AttributedText description;

    @c("hint")
    @l
    private final String hint;

    @c("icon")
    @l
    private final StrBookingCalculationIcon icon;

    @c("id")
    @l
    private final String id;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: StrBookingCalculation.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrBookingCalculation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrBookingCalculation createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(StrBookingCalculation.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(StrBookingCalculation.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(StrBookingCollapsedCalculation.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StrBookingCalculation(string, attributedText, attributedText2, arrayList, boolValueOf, parcel.readString(), parcel.readInt() != 0 ? StrBookingCalculationIcon.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrBookingCalculation[] newArray(int i12) {
            return new StrBookingCalculation[i12];
        }
    }

    public StrBookingCalculation(@l String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l List<StrBookingCollapsedCalculation> list, @l Boolean bool, @l String str2, @l StrBookingCalculationIcon strBookingCalculationIcon) {
        this.id = str;
        this.title = attributedText;
        this.description = attributedText2;
        this._collapsedCalculations = list;
        this._isCollapsed = bool;
        this.hint = str2;
        this.icon = strBookingCalculationIcon;
    }

    private final List<StrBookingCollapsedCalculation> component4() {
        return this._collapsedCalculations;
    }

    /* renamed from: component5, reason: from getter */
    private final Boolean get_isCollapsed() {
        return this._isCollapsed;
    }

    public static /* synthetic */ StrBookingCalculation copy$default(StrBookingCalculation strBookingCalculation, String str, AttributedText attributedText, AttributedText attributedText2, List list, Boolean bool, String str2, StrBookingCalculationIcon strBookingCalculationIcon, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strBookingCalculation.id;
        }
        if ((i12 & 2) != 0) {
            attributedText = strBookingCalculation.title;
        }
        AttributedText attributedText3 = attributedText;
        if ((i12 & 4) != 0) {
            attributedText2 = strBookingCalculation.description;
        }
        AttributedText attributedText4 = attributedText2;
        if ((i12 & 8) != 0) {
            list = strBookingCalculation._collapsedCalculations;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            bool = strBookingCalculation._isCollapsed;
        }
        Boolean bool2 = bool;
        if ((i12 & 32) != 0) {
            str2 = strBookingCalculation.hint;
        }
        String str3 = str2;
        if ((i12 & 64) != 0) {
            strBookingCalculationIcon = strBookingCalculation.icon;
        }
        return strBookingCalculation.copy(str, attributedText3, attributedText4, list2, bool2, str3, strBookingCalculationIcon);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final StrBookingCalculationIcon getIcon() {
        return this.icon;
    }

    @k
    public final StrBookingCalculation copy(@l String id2, @l AttributedText title, @l AttributedText description, @l List<StrBookingCollapsedCalculation> _collapsedCalculations, @l Boolean _isCollapsed, @l String hint, @l StrBookingCalculationIcon icon) {
        return new StrBookingCalculation(id2, title, description, _collapsedCalculations, _isCollapsed, hint, icon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrBookingCalculation)) {
            return false;
        }
        StrBookingCalculation strBookingCalculation = (StrBookingCalculation) other;
        return L.f(this.id, strBookingCalculation.id) && L.f(this.title, strBookingCalculation.title) && L.f(this.description, strBookingCalculation.description) && L.f(this._collapsedCalculations, strBookingCalculation._collapsedCalculations) && L.f(this._isCollapsed, strBookingCalculation._isCollapsed) && L.f(this.hint, strBookingCalculation.hint) && L.f(this.icon, strBookingCalculation.icon);
    }

    @k
    public final List<StrBookingCollapsedCalculation> getCollapsedCalculations() {
        List<StrBookingCollapsedCalculation> list = this._collapsedCalculations;
        return list == null ? C42784z0.f406748b : list;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final String getHint() {
        return this.hint;
    }

    @l
    public final StrBookingCalculationIcon getIcon() {
        return this.icon;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.title;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.description;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        List<StrBookingCollapsedCalculation> list = this._collapsedCalculations;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this._isCollapsed;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.hint;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StrBookingCalculationIcon strBookingCalculationIcon = this.icon;
        return iHashCode6 + (strBookingCalculationIcon != null ? strBookingCalculationIcon.hashCode() : 0);
    }

    public final boolean isCollapsable() {
        return !getCollapsedCalculations().isEmpty();
    }

    public final boolean isCollapsed() {
        Boolean bool = this._isCollapsed;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @k
    public String toString() {
        return "StrBookingCalculation(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", _collapsedCalculations=" + this._collapsedCalculations + ", _isCollapsed=" + this._isCollapsed + ", hint=" + this.hint + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.description, flags);
        List<StrBookingCollapsedCalculation> list = this._collapsedCalculations;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((StrBookingCollapsedCalculation) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Boolean bool = this._isCollapsed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.hint);
        StrBookingCalculationIcon strBookingCalculationIcon = this.icon;
        if (strBookingCalculationIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strBookingCalculationIcon.writeToParcel(parcel, flags);
        }
    }
}

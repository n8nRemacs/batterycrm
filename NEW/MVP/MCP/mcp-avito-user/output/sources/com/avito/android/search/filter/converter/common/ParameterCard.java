package com.avito.android.search.filter.converter.common;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecommendationCardsItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/search/filter/converter/common/ParameterCard;", "Landroid/os/Parcelable;", "Lcom/avito/android/lib/design/selector_card/r;", "MultiSelect", "Select", "Lcom/avito/android/search/filter/converter/common/ParameterCard$MultiSelect;", "Lcom/avito/android/search/filter/converter/common/ParameterCard$Select;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ParameterCard extends Parcelable, r {

    /* compiled from: RecommendationCardsItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/common/ParameterCard$MultiSelect;", "Lcom/avito/android/search/filter/converter/common/ParameterCard;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MultiSelect implements ParameterCard {

        @k
        public static final Parcelable.Creator<MultiSelect> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f262915b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f262916c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f262917d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final UniversalColor f262918e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f262919f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f262920g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f262921h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final String f262922i;

        /* compiled from: RecommendationCardsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MultiSelect> {
            @Override // android.os.Parcelable.Creator
            public final MultiSelect createFromParcel(Parcel parcel) {
                return new MultiSelect(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(MultiSelect.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MultiSelect[] newArray(int i12) {
                return new MultiSelect[i12];
            }
        }

        public MultiSelect(@k String str, @l String str2, @l String str3, @l UniversalColor universalColor, @k String str4, boolean z12, @k String str5, @k String str6) {
            this.f262915b = str;
            this.f262916c = str2;
            this.f262917d = str3;
            this.f262918e = universalColor;
            this.f262919f = str4;
            this.f262920g = z12;
            this.f262921h = str5;
            this.f262922i = str6;
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        @k
        /* renamed from: E5, reason: from getter */
        public final String getF262929h() {
            return this.f262921h;
        }

        @Override // com.avito.android.lib.design.selector_card.r
        public final boolean a(@k r rVar) {
            return (rVar instanceof ParameterCard) && equals(rVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiSelect)) {
                return false;
            }
            MultiSelect multiSelect = (MultiSelect) obj;
            return L.f(this.f262915b, multiSelect.f262915b) && L.f(this.f262916c, multiSelect.f262916c) && L.f(this.f262917d, multiSelect.f262917d) && L.f(this.f262918e, multiSelect.f262918e) && L.f(this.f262919f, multiSelect.f262919f) && this.f262920g == multiSelect.f262920g && L.f(this.f262921h, multiSelect.f262921h) && L.f(this.f262922i, multiSelect.f262922i);
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        @k
        /* renamed from: getFormParameterId, reason: from getter */
        public final String getF262923b() {
            return this.f262915b;
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        @l
        /* renamed from: getIcon, reason: from getter */
        public final String getF262925d() {
            return this.f262917d;
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        @l
        /* renamed from: getIconColor, reason: from getter */
        public final UniversalColor getF262926e() {
            return this.f262918e;
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        @l
        /* renamed from: getParameterId, reason: from getter */
        public final String getF262924c() {
            return this.f262916c;
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF262927f() {
            return this.f262919f;
        }

        public final int hashCode() {
            int iHashCode = this.f262915b.hashCode() * 31;
            String str = this.f262916c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f262917d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            UniversalColor universalColor = this.f262918e;
            return this.f262922i.hashCode() + H.d(androidx.appcompat.app.r.i(H.d((iHashCode3 + (universalColor != null ? universalColor.hashCode() : 0)) * 31, 31, this.f262919f), 31, this.f262920g), 31, this.f262921h);
        }

        @Override // com.avito.android.lib.design.selector_card.r
        /* renamed from: isEnabled */
        public final boolean getF309669f() {
            return true;
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        /* renamed from: isSelected, reason: from getter */
        public final boolean getF262928g() {
            return this.f262920g;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultiSelect(formParameterId=");
            sb2.append(this.f262915b);
            sb2.append(", parameterId=");
            sb2.append(this.f262916c);
            sb2.append(", icon=");
            sb2.append(this.f262917d);
            sb2.append(", iconColor=");
            sb2.append(this.f262918e);
            sb2.append(", title=");
            sb2.append(this.f262919f);
            sb2.append(", isSelected=");
            sb2.append(this.f262920g);
            sb2.append(", itemStyle=");
            sb2.append(this.f262921h);
            sb2.append(", valueIds=");
            return C22026a.c(sb2, this.f262922i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f262915b);
            parcel.writeString(this.f262916c);
            parcel.writeString(this.f262917d);
            parcel.writeParcelable(this.f262918e, i12);
            parcel.writeString(this.f262919f);
            parcel.writeInt(this.f262920g ? 1 : 0);
            parcel.writeString(this.f262921h);
            parcel.writeString(this.f262922i);
        }
    }

    /* compiled from: RecommendationCardsItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/common/ParameterCard$Select;", "Lcom/avito/android/search/filter/converter/common/ParameterCard;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Select implements ParameterCard {

        @k
        public static final Parcelable.Creator<Select> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f262923b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f262924c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f262925d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final UniversalColor f262926e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f262927f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f262928g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f262929h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final String f262930i;

        /* compiled from: RecommendationCardsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Select> {
            @Override // android.os.Parcelable.Creator
            public final Select createFromParcel(Parcel parcel) {
                return new Select(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(Select.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Select[] newArray(int i12) {
                return new Select[i12];
            }
        }

        public Select(@k String str, @l String str2, @l String str3, @l UniversalColor universalColor, @k String str4, boolean z12, @k String str5, @k String str6) {
            this.f262923b = str;
            this.f262924c = str2;
            this.f262925d = str3;
            this.f262926e = universalColor;
            this.f262927f = str4;
            this.f262928g = z12;
            this.f262929h = str5;
            this.f262930i = str6;
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        @k
        /* renamed from: E5, reason: from getter */
        public final String getF262929h() {
            return this.f262929h;
        }

        @Override // com.avito.android.lib.design.selector_card.r
        public final boolean a(@k r rVar) {
            return (rVar instanceof ParameterCard) && equals(rVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Select)) {
                return false;
            }
            Select select = (Select) obj;
            return L.f(this.f262923b, select.f262923b) && L.f(this.f262924c, select.f262924c) && L.f(this.f262925d, select.f262925d) && L.f(this.f262926e, select.f262926e) && L.f(this.f262927f, select.f262927f) && this.f262928g == select.f262928g && L.f(this.f262929h, select.f262929h) && L.f(this.f262930i, select.f262930i);
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        @k
        /* renamed from: getFormParameterId, reason: from getter */
        public final String getF262923b() {
            return this.f262923b;
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        @l
        /* renamed from: getIcon, reason: from getter */
        public final String getF262925d() {
            return this.f262925d;
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        @l
        /* renamed from: getIconColor, reason: from getter */
        public final UniversalColor getF262926e() {
            return this.f262926e;
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        @l
        /* renamed from: getParameterId, reason: from getter */
        public final String getF262924c() {
            return this.f262924c;
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF262927f() {
            return this.f262927f;
        }

        public final int hashCode() {
            int iHashCode = this.f262923b.hashCode() * 31;
            String str = this.f262924c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f262925d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            UniversalColor universalColor = this.f262926e;
            return this.f262930i.hashCode() + H.d(androidx.appcompat.app.r.i(H.d((iHashCode3 + (universalColor != null ? universalColor.hashCode() : 0)) * 31, 31, this.f262927f), 31, this.f262928g), 31, this.f262929h);
        }

        @Override // com.avito.android.lib.design.selector_card.r
        /* renamed from: isEnabled */
        public final boolean getF309669f() {
            return true;
        }

        @Override // com.avito.android.search.filter.converter.common.ParameterCard
        /* renamed from: isSelected, reason: from getter */
        public final boolean getF262928g() {
            return this.f262928g;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Select(formParameterId=");
            sb2.append(this.f262923b);
            sb2.append(", parameterId=");
            sb2.append(this.f262924c);
            sb2.append(", icon=");
            sb2.append(this.f262925d);
            sb2.append(", iconColor=");
            sb2.append(this.f262926e);
            sb2.append(", title=");
            sb2.append(this.f262927f);
            sb2.append(", isSelected=");
            sb2.append(this.f262928g);
            sb2.append(", itemStyle=");
            sb2.append(this.f262929h);
            sb2.append(", valueId=");
            return C22026a.c(sb2, this.f262930i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f262923b);
            parcel.writeString(this.f262924c);
            parcel.writeString(this.f262925d);
            parcel.writeParcelable(this.f262926e, i12);
            parcel.writeString(this.f262927f);
            parcel.writeInt(this.f262928g ? 1 : 0);
            parcel.writeString(this.f262929h);
            parcel.writeString(this.f262930i);
        }
    }

    /* compiled from: RecommendationCardsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    /* renamed from: E5 */
    String getF262929h();

    @k
    /* renamed from: getFormParameterId */
    String getF262923b();

    @l
    /* renamed from: getIcon */
    String getF262925d();

    @l
    /* renamed from: getIconColor */
    UniversalColor getF262926e();

    @l
    /* renamed from: getParameterId */
    String getF262924c();

    @k
    /* renamed from: getTitle */
    String getF262927f();

    /* renamed from: isSelected */
    boolean getF262928g();
}

package com.avito.android.beduin.common.component.chips;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.q;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledOptionTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.SelectedIdsTransform;
import com.avito.android.beduin.common.form.transforms.ShowErrorMessageTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinChipsModel.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003/01B\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b\f\u0010'R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010+R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b,\u0010-R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b.\u0010-¨\u00062"}, d2 = {"Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/common/component/q;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "errorMessage", "", "isRequired", "_isEnabled", "", "_selectedIds", "Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel$SelectionType;", "_selectionType", "Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel$DisplayType;", "_displayType", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectChangedActions", "Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel$Option;", "options", "showErrorMessage", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel$SelectionType;Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel$DisplayType;Ljava/util/List;Ljava/util/List;Z)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getStyle", "getErrorMessage", "Z", "()Z", "Ljava/lang/Boolean;", "Ljava/util/List;", "Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel$SelectionType;", "Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel$DisplayType;", "d", "()Ljava/util/List;", "getOptions", "DisplayType", "Option", "SelectionType", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinChipsModel extends LeafBeduinModel implements q {

    @k
    public static final Parcelable.Creator<BeduinChipsModel> CREATOR = new a();

    @com.google.gson.annotations.c("displayType")
    @l
    private final DisplayType _displayType;

    @com.google.gson.annotations.c("isEnabled")
    @l
    private final Boolean _isEnabled;

    @com.google.gson.annotations.c("selectedIds")
    @l
    private final List<String> _selectedIds;

    @com.google.gson.annotations.c("selectionType")
    @l
    private final SelectionType _selectionType;

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f101006b;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("errorMessage")
    @l
    private final String errorMessage;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isRequired")
    private final boolean isRequired;

    @com.google.gson.annotations.c("onSelectChangedActions")
    @l
    private final List<BeduinAction> onSelectChangedActions;

    @com.google.gson.annotations.c("options")
    @k
    private final List<Option> options;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final BeduinComponentTheme theme;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinChipsModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel$DisplayType;", "", "(Ljava/lang/String;I)V", "SingleLineFixed", "SingleLineScrollable", "SingleLineStretched", "MultiLine", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DisplayType {

        @com.google.gson.annotations.c("multiLine")
        public static final DisplayType MultiLine;

        @com.google.gson.annotations.c("singleLineFixed")
        public static final DisplayType SingleLineFixed;

        @com.google.gson.annotations.c("singleLineScrollable")
        public static final DisplayType SingleLineScrollable;

        @com.google.gson.annotations.c("singleLineStretched")
        public static final DisplayType SingleLineStretched;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ DisplayType[] f101008b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101009c;

        static {
            DisplayType displayType = new DisplayType("SingleLineFixed", 0);
            SingleLineFixed = displayType;
            DisplayType displayType2 = new DisplayType("SingleLineScrollable", 1);
            SingleLineScrollable = displayType2;
            DisplayType displayType3 = new DisplayType("SingleLineStretched", 2);
            SingleLineStretched = displayType3;
            DisplayType displayType4 = new DisplayType("MultiLine", 3);
            MultiLine = displayType4;
            DisplayType[] displayTypeArr = {displayType, displayType2, displayType3, displayType4};
            f101008b = displayTypeArr;
            f101009c = kotlin.enums.c.a(displayTypeArr);
        }

        private DisplayType(String str, int i12) {
        }

        public static DisplayType valueOf(String str) {
            return (DisplayType) Enum.valueOf(DisplayType.class, str);
        }

        public static DisplayType[] values() {
            return (DisplayType[]) f101008b.clone();
        }
    }

    /* compiled from: BeduinChipsModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel$Option;", "Landroid/os/Parcelable;", "", "id", "title", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectChangedActions", "", "_isEnabled", "leftIconName", "rightIconName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/Boolean;", "c", "e", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Option implements Parcelable {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        @com.google.gson.annotations.c("isEnabled")
        @l
        private final Boolean _isEnabled;

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("leftIconName")
        @l
        private final String leftIconName;

        @com.google.gson.annotations.c("onSelectChangedActions")
        @l
        private final List<BeduinAction> onSelectChangedActions;

        @com.google.gson.annotations.c("rightIconName")
        @l
        private final String rightIconName;

        @com.google.gson.annotations.c("title")
        @l
        private final String title;

        /* compiled from: BeduinChipsModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                Boolean boolValueOf = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(Option.class, parcel, arrayList, iL2, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Option(string, string2, arrayList, boolValueOf, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Option(@k String str, @l String str2, @l List<? extends BeduinAction> list, @l Boolean bool, @l String str3, @l String str4) {
            this.id = str;
            this.title = str2;
            this.onSelectChangedActions = list;
            this._isEnabled = bool;
            this.leftIconName = str3;
            this.rightIconName = str4;
        }

        public static Option a(Option option, Boolean bool) {
            String str = option.id;
            String str2 = option.title;
            List<BeduinAction> list = option.onSelectChangedActions;
            String str3 = option.leftIconName;
            String str4 = option.rightIconName;
            option.getClass();
            return new Option(str, str2, list, bool, str3, str4);
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getLeftIconName() {
            return this.leftIconName;
        }

        @l
        public final List<BeduinAction> d() {
            return this.onSelectChangedActions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final String getRightIconName() {
            return this.rightIconName;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return L.f(this.id, option.id) && L.f(this.title, option.title) && L.f(this.onSelectChangedActions, option.onSelectChangedActions) && L.f(this._isEnabled, option._isEnabled) && L.f(this.leftIconName, option.leftIconName) && L.f(this.rightIconName, option.rightIconName);
        }

        public final boolean f() {
            Boolean bool = this._isEnabled;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<BeduinAction> list = this.onSelectChangedActions;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this._isEnabled;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.leftIconName;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.rightIconName;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", onSelectChangedActions=");
            sb2.append(this.onSelectChangedActions);
            sb2.append(", _isEnabled=");
            sb2.append(this._isEnabled);
            sb2.append(", leftIconName=");
            sb2.append(this.leftIconName);
            sb2.append(", rightIconName=");
            return C22026a.c(sb2, this.rightIconName, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            List<BeduinAction> list = this.onSelectChangedActions;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), i12);
                }
            }
            Boolean bool = this._isEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.leftIconName);
            parcel.writeString(this.rightIconName);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinChipsModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel$SelectionType;", "", "(Ljava/lang/String;I)V", "Single", "SingleOptional", "Multiple", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectionType {

        @com.google.gson.annotations.c("multiple")
        public static final SelectionType Multiple;

        @com.google.gson.annotations.c("single")
        public static final SelectionType Single;

        @com.google.gson.annotations.c("singleOptional")
        public static final SelectionType SingleOptional;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SelectionType[] f101011b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101012c;

        static {
            SelectionType selectionType = new SelectionType("Single", 0);
            Single = selectionType;
            SelectionType selectionType2 = new SelectionType("SingleOptional", 1);
            SingleOptional = selectionType2;
            SelectionType selectionType3 = new SelectionType("Multiple", 2);
            Multiple = selectionType3;
            SelectionType[] selectionTypeArr = {selectionType, selectionType2, selectionType3};
            f101011b = selectionTypeArr;
            f101012c = kotlin.enums.c.a(selectionTypeArr);
        }

        private SelectionType(String str, int i12) {
        }

        public static SelectionType valueOf(String str) {
            return (SelectionType) Enum.valueOf(SelectionType.class, str);
        }

        public static SelectionType[] values() {
            return (SelectionType[]) f101011b.clone();
        }
    }

    /* compiled from: BeduinChipsModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinChipsModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinChipsModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinChipsModel.class.getClassLoader());
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            SelectionType selectionTypeValueOf = parcel.readInt() == 0 ? null : SelectionType.valueOf(parcel.readString());
            DisplayType displayTypeValueOf = parcel.readInt() == 0 ? null : DisplayType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinChipsModel.class, parcel, arrayList, iL2, 1);
                }
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList2, iC2, 1);
                i13 = i13;
            }
            return new BeduinChipsModel(string, displayingPredicate, beduinComponentThemeCreateFromParcel, string2, string3, z12, boolValueOf, arrayListCreateStringArrayList, selectionTypeValueOf, displayTypeValueOf, arrayList, arrayList2, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinChipsModel[] newArray(int i12) {
            return new BeduinChipsModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinChipsModel(@k String str, @l DisplayingPredicate displayingPredicate, @l BeduinComponentTheme beduinComponentTheme, @l String str2, @l String str3, boolean z12, @l Boolean bool, @l List<String> list, @l SelectionType selectionType, @l DisplayType displayType, @l List<? extends BeduinAction> list2, @k List<Option> list3, boolean z13) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.theme = beduinComponentTheme;
        this.style = str2;
        this.errorMessage = str3;
        this.isRequired = z12;
        this._isEnabled = bool;
        this._selectedIds = list;
        this._selectionType = selectionType;
        this._displayType = displayType;
        this.onSelectChangedActions = list2;
        this.options = list3;
        this.f101006b = z13;
    }

    public static BeduinChipsModel a(BeduinChipsModel beduinChipsModel, DisplayingPredicate displayingPredicate, String str, Boolean bool, List list, ArrayList arrayList, boolean z12, int i12) {
        String str2 = beduinChipsModel.id;
        DisplayingPredicate displayingPredicate2 = (i12 & 2) != 0 ? beduinChipsModel.displayingPredicate : displayingPredicate;
        BeduinComponentTheme beduinComponentTheme = beduinChipsModel.theme;
        String str3 = beduinChipsModel.style;
        String str4 = (i12 & 16) != 0 ? beduinChipsModel.errorMessage : str;
        boolean z13 = beduinChipsModel.isRequired;
        Boolean bool2 = (i12 & 64) != 0 ? beduinChipsModel._isEnabled : bool;
        List list2 = (i12 & 128) != 0 ? beduinChipsModel._selectedIds : list;
        SelectionType selectionType = beduinChipsModel._selectionType;
        DisplayType displayType = beduinChipsModel._displayType;
        List<BeduinAction> list3 = beduinChipsModel.onSelectChangedActions;
        List<Option> list4 = (i12 & 2048) != 0 ? beduinChipsModel.options : arrayList;
        boolean z14 = (i12 & 4096) != 0 ? beduinChipsModel.f101006b : z12;
        beduinChipsModel.getClass();
        return new BeduinChipsModel(str2, displayingPredicate2, beduinComponentTheme, str3, str4, z13, bool2, list2, selectionType, displayType, list3, list4, z14);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public final BeduinModel apply(@k BeduinModelTransform beduinModelTransform) {
        Object next;
        if (beduinModelTransform instanceof DisplayPredicateTransform) {
            return a(this, ((DisplayPredicateTransform) beduinModelTransform).getDisplayingPredicate(), null, null, null, null, false, 8189);
        }
        if (beduinModelTransform instanceof IsEnabledTransform) {
            return a(this, null, null, Boolean.valueOf(((IsEnabledTransform) beduinModelTransform).isEnabled()), null, null, false, 8127);
        }
        if (beduinModelTransform instanceof SelectedIdsTransform) {
            return a(this, null, null, null, ((SelectedIdsTransform) beduinModelTransform).getSelectedIds(), null, false, 8063);
        }
        if (beduinModelTransform instanceof ErrorMessageTransform) {
            return a(this, null, ((ErrorMessageTransform) beduinModelTransform).getErrorMessage(), null, null, null, false, 8175);
        }
        if (beduinModelTransform instanceof ShowErrorMessageTransform) {
            return a(this, null, null, null, null, null, ((ShowErrorMessageTransform) beduinModelTransform).getShowErrorMessage(), 4095);
        }
        if (!(beduinModelTransform instanceof IsEnabledOptionTransform)) {
            return super.apply(beduinModelTransform);
        }
        List<Option> list = this.options;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Option optionA : list) {
            Iterator<T> it = ((IsEnabledOptionTransform) beduinModelTransform).getTransformOptions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(optionA.getId(), ((IsEnabledOptionTransform.Option) next).getOptionId())) {
                    break;
                }
            }
            IsEnabledOptionTransform.Option option = (IsEnabledOptionTransform.Option) next;
            if (option != null) {
                optionA = Option.a(optionA, Boolean.valueOf(option.isEnabled()));
            }
            arrayList.add(optionA);
        }
        return a(this, null, null, null, null, arrayList, false, 6143);
    }

    @k
    public final DisplayType c() {
        DisplayType displayType = this._displayType;
        return displayType == null ? DisplayType.SingleLineScrollable : displayType;
    }

    @l
    public final List<BeduinAction> d() {
        return this.onSelectChangedActions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final List<String> e() {
        List<String> list = this._selectedIds;
        return list == null ? C42784z0.f406748b : list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinChipsModel)) {
            return false;
        }
        BeduinChipsModel beduinChipsModel = (BeduinChipsModel) obj;
        return L.f(this.id, beduinChipsModel.id) && L.f(this.displayingPredicate, beduinChipsModel.displayingPredicate) && this.theme == beduinChipsModel.theme && L.f(this.style, beduinChipsModel.style) && L.f(this.errorMessage, beduinChipsModel.errorMessage) && this.isRequired == beduinChipsModel.isRequired && L.f(this._isEnabled, beduinChipsModel._isEnabled) && L.f(this._selectedIds, beduinChipsModel._selectedIds) && this._selectionType == beduinChipsModel._selectionType && this._displayType == beduinChipsModel._displayType && L.f(this.onSelectChangedActions, beduinChipsModel.onSelectChangedActions) && L.f(this.options, beduinChipsModel.options) && this.f101006b == beduinChipsModel.f101006b;
    }

    @k
    public final SelectionType f() {
        SelectionType selectionType = this._selectionType;
        return selectionType == null ? SelectionType.Single : selectionType;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final String getErrorMessageToDisplay() {
        String str = this.errorMessage;
        if (this.f101006b) {
            return str;
        }
        return null;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final List<Option> getOptions() {
        return this.options;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode3 = (iHashCode2 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        String str = this.style;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        int i12 = r.i((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isRequired);
        Boolean bool = this._isEnabled;
        int iHashCode5 = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this._selectedIds;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        SelectionType selectionType = this._selectionType;
        int iHashCode7 = (iHashCode6 + (selectionType == null ? 0 : selectionType.hashCode())) * 31;
        DisplayType displayType = this._displayType;
        int iHashCode8 = (iHashCode7 + (displayType == null ? 0 : displayType.hashCode())) * 31;
        List<BeduinAction> list2 = this.onSelectChangedActions;
        return Boolean.hashCode(this.f101006b) + H.e((iHashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.options);
    }

    public final boolean isEnabled() {
        Boolean bool = this._isEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    public final boolean isValid() {
        return (this.isRequired && e().isEmpty()) ? false : true;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinChipsModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", errorMessage=");
        sb2.append(this.errorMessage);
        sb2.append(", isRequired=");
        sb2.append(this.isRequired);
        sb2.append(", _isEnabled=");
        sb2.append(this._isEnabled);
        sb2.append(", _selectedIds=");
        sb2.append(this._selectedIds);
        sb2.append(", _selectionType=");
        sb2.append(this._selectionType);
        sb2.append(", _displayType=");
        sb2.append(this._displayType);
        sb2.append(", onSelectChangedActions=");
        sb2.append(this.onSelectChangedActions);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", showErrorMessage=");
        return r.x(sb2, this.f101006b, ')');
    }

    @Override // com.avito.android.beduin.common.component.q
    @k
    public final BeduinModel validateModelByConstraints() {
        return a(this, null, null, null, null, null, !isValid(), 4095);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, i12);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.style);
        parcel.writeString(this.errorMessage);
        parcel.writeInt(this.isRequired ? 1 : 0);
        Boolean bool = this._isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeStringList(this._selectedIds);
        SelectionType selectionType = this._selectionType;
        if (selectionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(selectionType.name());
        }
        DisplayType displayType = this._displayType;
        if (displayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(displayType.name());
        }
        List<BeduinAction> list = this.onSelectChangedActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((Option) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f101006b ? 1 : 0);
    }
}

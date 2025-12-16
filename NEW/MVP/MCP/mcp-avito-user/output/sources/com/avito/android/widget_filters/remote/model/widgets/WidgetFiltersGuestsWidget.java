package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersGuestsWidget.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0019\u001a\u001b\u001c\u001dBM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\b\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\t\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersWidget;", "", "id", "title", "defaultPlaceholder", "", "isExpanded", "isEnabled", "isNew", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$GuestsContent;", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$GuestsContent;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "d", "Ljava/lang/Boolean;", "o0", "()Ljava/lang/Boolean;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$GuestsContent;", "c", "()Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$GuestsContent;", "AnimalsParameter", "ChildrenAvailableAge", "GuestsChild", "GuestsContent", "GuestsParameter", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WidgetFiltersGuestsWidget implements WidgetFiltersWidget {

    @k
    public static final Parcelable.Creator<WidgetFiltersGuestsWidget> CREATOR = new a();

    @c("content")
    @l
    private final GuestsContent content;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String defaultPlaceholder;

    @c("id")
    @l
    private final String id;

    @c("isEnabled")
    @l
    private final Boolean isEnabled;

    @c("isExpanded")
    @l
    private final Boolean isExpanded;

    @c("isNew")
    @l
    private final Boolean isNew;

    @c("title")
    @l
    private final String title;

    /* compiled from: WidgetFiltersGuestsWidget.kt */
    @d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$AnimalsParameter;", "Landroid/os/Parcelable;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersContentParameter;", "", "id", "", "isRequired", "updatesForm", "isVisible", "notSelectedErrorText", "title", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "d", "g", "c", "getTitle", "f", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnimalsParameter implements Parcelable, WidgetFiltersContentParameter {

        @k
        public static final Parcelable.Creator<AnimalsParameter> CREATOR = new a();

        @c("id")
        @l
        private final String id;

        @c("isRequired")
        @l
        private final Boolean isRequired;

        @c("isSelected")
        @l
        private final Boolean isSelected;

        @c("isVisible")
        @l
        private final Boolean isVisible;

        @c("notSelectedErrorText")
        @l
        private final String notSelectedErrorText;

        @c("title")
        @l
        private final String title;

        @c("updatesForm")
        @l
        private final Boolean updatesForm;

        /* compiled from: WidgetFiltersGuestsWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AnimalsParameter> {
            @Override // android.os.Parcelable.Creator
            public final AnimalsParameter createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Boolean boolValueOf3;
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
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new AnimalsParameter(string, boolValueOf, boolValueOf2, boolValueOf3, string2, string3, boolValueOf4);
            }

            @Override // android.os.Parcelable.Creator
            public final AnimalsParameter[] newArray(int i12) {
                return new AnimalsParameter[i12];
            }
        }

        public AnimalsParameter(@l String str, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l String str2, @l String str3, @l Boolean bool4) {
            this.id = str;
            this.isRequired = bool;
            this.updatesForm = bool2;
            this.isVisible = bool3;
            this.notSelectedErrorText = str2;
            this.title = str3;
            this.isSelected = bool4;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getNotSelectedErrorText() {
            return this.notSelectedErrorText;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Boolean getUpdatesForm() {
            return this.updatesForm;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final Boolean getIsRequired() {
            return this.isRequired;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimalsParameter)) {
                return false;
            }
            AnimalsParameter animalsParameter = (AnimalsParameter) obj;
            return L.f(this.id, animalsParameter.id) && L.f(this.isRequired, animalsParameter.isRequired) && L.f(this.updatesForm, animalsParameter.updatesForm) && L.f(this.isVisible, animalsParameter.isVisible) && L.f(this.notSelectedErrorText, animalsParameter.notSelectedErrorText) && L.f(this.title, animalsParameter.title) && L.f(this.isSelected, animalsParameter.isSelected);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final Boolean getIsVisible() {
            return this.isVisible;
        }

        @l
        public final String getId() {
            return this.id;
        }

        @l
        public final String getTitle() {
            return this.title;
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
            String str3 = this.title;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool4 = this.isSelected;
            return iHashCode6 + (bool4 != null ? bool4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnimalsParameter(id=");
            sb2.append(this.id);
            sb2.append(", isRequired=");
            sb2.append(this.isRequired);
            sb2.append(", updatesForm=");
            sb2.append(this.updatesForm);
            sb2.append(", isVisible=");
            sb2.append(this.isVisible);
            sb2.append(", notSelectedErrorText=");
            sb2.append(this.notSelectedErrorText);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", isSelected=");
            return C0.g(sb2, this.isSelected, ')');
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
            parcel.writeString(this.title);
            Boolean bool4 = this.isSelected;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool4);
            }
        }
    }

    /* compiled from: WidgetFiltersGuestsWidget.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$ChildrenAvailableAge;", "Landroid/os/Parcelable;", "", "id", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getValue", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChildrenAvailableAge implements Parcelable {

        @k
        public static final Parcelable.Creator<ChildrenAvailableAge> CREATOR = new a();

        @c("id")
        @k
        private final String id;

        @c("value")
        @k
        private final String value;

        /* compiled from: WidgetFiltersGuestsWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ChildrenAvailableAge> {
            @Override // android.os.Parcelable.Creator
            public final ChildrenAvailableAge createFromParcel(Parcel parcel) {
                return new ChildrenAvailableAge(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ChildrenAvailableAge[] newArray(int i12) {
                return new ChildrenAvailableAge[i12];
            }
        }

        public ChildrenAvailableAge(@k String str, @k String str2) {
            this.id = str;
            this.value = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChildrenAvailableAge)) {
                return false;
            }
            ChildrenAvailableAge childrenAvailableAge = (ChildrenAvailableAge) obj;
            return L.f(this.id, childrenAvailableAge.id) && L.f(this.value, childrenAvailableAge.value);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.id.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChildrenAvailableAge(id=");
            sb2.append(this.id);
            sb2.append(", value=");
            return C22026a.c(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            parcel.writeString(this.value);
        }
    }

    /* compiled from: WidgetFiltersGuestsWidget.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$GuestsChild;", "Landroid/os/Parcelable;", "", "ageId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GuestsChild implements Parcelable {

        @k
        public static final Parcelable.Creator<GuestsChild> CREATOR = new a();

        @c("ageId")
        @k
        private final String ageId;

        /* compiled from: WidgetFiltersGuestsWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GuestsChild> {
            @Override // android.os.Parcelable.Creator
            public final GuestsChild createFromParcel(Parcel parcel) {
                return new GuestsChild(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GuestsChild[] newArray(int i12) {
                return new GuestsChild[i12];
            }
        }

        public GuestsChild(@k String str) {
            this.ageId = str;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getAgeId() {
            return this.ageId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GuestsChild) && L.f(this.ageId, ((GuestsChild) obj).ageId);
        }

        public final int hashCode() {
            return this.ageId.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("GuestsChild(ageId="), this.ageId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.ageId);
        }
    }

    /* compiled from: WidgetFiltersGuestsWidget.kt */
    @d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$GuestsContent;", "Landroid/os/Parcelable;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersContent;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$GuestsParameter;", "guests", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$AnimalsParameter;", "animals", "<init>", "(Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$GuestsParameter;Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$AnimalsParameter;)V", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$GuestsParameter;", "d", "()Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$GuestsParameter;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$AnimalsParameter;", "c", "()Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$AnimalsParameter;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GuestsContent implements Parcelable, WidgetFiltersContent {

        @k
        public static final Parcelable.Creator<GuestsContent> CREATOR = new a();

        @c("animals")
        @l
        private final AnimalsParameter animals;

        @c("guests")
        @l
        private final GuestsParameter guests;

        /* compiled from: WidgetFiltersGuestsWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GuestsContent> {
            @Override // android.os.Parcelable.Creator
            public final GuestsContent createFromParcel(Parcel parcel) {
                return new GuestsContent(parcel.readInt() == 0 ? null : GuestsParameter.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AnimalsParameter.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final GuestsContent[] newArray(int i12) {
                return new GuestsContent[i12];
            }
        }

        public GuestsContent(@l GuestsParameter guestsParameter, @l AnimalsParameter animalsParameter) {
            this.guests = guestsParameter;
            this.animals = animalsParameter;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AnimalsParameter getAnimals() {
            return this.animals;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final GuestsParameter getGuests() {
            return this.guests;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GuestsContent)) {
                return false;
            }
            GuestsContent guestsContent = (GuestsContent) obj;
            return L.f(this.guests, guestsContent.guests) && L.f(this.animals, guestsContent.animals);
        }

        public final int hashCode() {
            GuestsParameter guestsParameter = this.guests;
            int iHashCode = (guestsParameter == null ? 0 : guestsParameter.hashCode()) * 31;
            AnimalsParameter animalsParameter = this.animals;
            return iHashCode + (animalsParameter != null ? animalsParameter.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "GuestsContent(guests=" + this.guests + ", animals=" + this.animals + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            GuestsParameter guestsParameter = this.guests;
            if (guestsParameter == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                guestsParameter.writeToParcel(parcel, i12);
            }
            AnimalsParameter animalsParameter = this.animals;
            if (animalsParameter == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                animalsParameter.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: WidgetFiltersGuestsWidget.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b&\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b'\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b(\u0010#R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010+R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b,\u0010+¨\u0006-"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$GuestsParameter;", "Landroid/os/Parcelable;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersContentParameter;", "", "id", "", "isRequired", "updatesForm", "isVisible", "notSelectedErrorText", "", "minGuests", "maxGuests", "maxAdultsCount", "maxChildrenCount", "initialAdultGuests", "defaultAdultGuests", "", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$GuestsChild;", "initialChildren", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget$ChildrenAvailableAge;", "availableAges", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "l", "()Ljava/lang/Boolean;", "k", "m", "j", "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", "h", "f", "g", "d", "getDefaultAdultGuests", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GuestsParameter implements Parcelable, WidgetFiltersContentParameter {

        @k
        public static final Parcelable.Creator<GuestsParameter> CREATOR = new a();

        @c("availableAges")
        @l
        private final List<ChildrenAvailableAge> availableAges;

        @c("defaultAdultGuests")
        @l
        private final Integer defaultAdultGuests;

        @c("id")
        @l
        private final String id;

        @c("initialAdultGuests")
        @l
        private final Integer initialAdultGuests;

        @c("initialChildren")
        @l
        private final List<GuestsChild> initialChildren;

        @c("isRequired")
        @l
        private final Boolean isRequired;

        @c("isVisible")
        @l
        private final Boolean isVisible;

        @c("maxAdultsCount")
        @l
        private final Integer maxAdultsCount;

        @c("maxChildrenCount")
        @l
        private final Integer maxChildrenCount;

        @c("maxGuests")
        @l
        private final Integer maxGuests;

        @c("minGuests")
        @l
        private final Integer minGuests;

        @c("notSelectedErrorText")
        @l
        private final String notSelectedErrorText;

        @c("updatesForm")
        @l
        private final Boolean updatesForm;

        /* compiled from: WidgetFiltersGuestsWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GuestsParameter> {
            @Override // android.os.Parcelable.Creator
            public final GuestsParameter createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Boolean boolValueOf3;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
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
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(GuestsChild.CREATOR, parcel, arrayList, iC2, 1);
                        i12 = i12;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = arrayList;
                    arrayList3 = null;
                } else {
                    int i13 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i13);
                    int iC3 = 0;
                    while (iC3 != i13) {
                        iC3 = com.avito.android.actions_sheet.a.c(ChildrenAvailableAge.CREATOR, parcel, arrayList4, iC3, 1);
                        i13 = i13;
                        arrayList = arrayList;
                    }
                    arrayList2 = arrayList;
                    arrayList3 = arrayList4;
                }
                return new GuestsParameter(string, boolValueOf, boolValueOf2, boolValueOf3, string2, numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final GuestsParameter[] newArray(int i12) {
                return new GuestsParameter[i12];
            }
        }

        public GuestsParameter(@l String str, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l String str2, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5, @l Integer num6, @l List<GuestsChild> list, @l List<ChildrenAvailableAge> list2) {
            this.id = str;
            this.isRequired = bool;
            this.updatesForm = bool2;
            this.isVisible = bool3;
            this.notSelectedErrorText = str2;
            this.minGuests = num;
            this.maxGuests = num2;
            this.maxAdultsCount = num3;
            this.maxChildrenCount = num4;
            this.initialAdultGuests = num5;
            this.defaultAdultGuests = num6;
            this.initialChildren = list;
            this.availableAges = list2;
        }

        @l
        public final List<ChildrenAvailableAge> c() {
            return this.availableAges;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Integer getInitialAdultGuests() {
            return this.initialAdultGuests;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        public final List<GuestsChild> e() {
            return this.initialChildren;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GuestsParameter)) {
                return false;
            }
            GuestsParameter guestsParameter = (GuestsParameter) obj;
            return L.f(this.id, guestsParameter.id) && L.f(this.isRequired, guestsParameter.isRequired) && L.f(this.updatesForm, guestsParameter.updatesForm) && L.f(this.isVisible, guestsParameter.isVisible) && L.f(this.notSelectedErrorText, guestsParameter.notSelectedErrorText) && L.f(this.minGuests, guestsParameter.minGuests) && L.f(this.maxGuests, guestsParameter.maxGuests) && L.f(this.maxAdultsCount, guestsParameter.maxAdultsCount) && L.f(this.maxChildrenCount, guestsParameter.maxChildrenCount) && L.f(this.initialAdultGuests, guestsParameter.initialAdultGuests) && L.f(this.defaultAdultGuests, guestsParameter.defaultAdultGuests) && L.f(this.initialChildren, guestsParameter.initialChildren) && L.f(this.availableAges, guestsParameter.availableAges);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final Integer getMaxAdultsCount() {
            return this.maxAdultsCount;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final Integer getMaxChildrenCount() {
            return this.maxChildrenCount;
        }

        @l
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final Integer getMaxGuests() {
            return this.maxGuests;
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
            Integer num = this.minGuests;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.maxGuests;
            int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.maxAdultsCount;
            int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.maxChildrenCount;
            int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.initialAdultGuests;
            int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.defaultAdultGuests;
            int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
            List<GuestsChild> list = this.initialChildren;
            int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
            List<ChildrenAvailableAge> list2 = this.availableAges;
            return iHashCode12 + (list2 != null ? list2.hashCode() : 0);
        }

        @l
        /* renamed from: i, reason: from getter */
        public final Integer getMinGuests() {
            return this.minGuests;
        }

        @l
        /* renamed from: j, reason: from getter */
        public final String getNotSelectedErrorText() {
            return this.notSelectedErrorText;
        }

        @l
        /* renamed from: k, reason: from getter */
        public final Boolean getUpdatesForm() {
            return this.updatesForm;
        }

        @l
        /* renamed from: l, reason: from getter */
        public final Boolean getIsRequired() {
            return this.isRequired;
        }

        @l
        /* renamed from: m, reason: from getter */
        public final Boolean getIsVisible() {
            return this.isVisible;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GuestsParameter(id=");
            sb2.append(this.id);
            sb2.append(", isRequired=");
            sb2.append(this.isRequired);
            sb2.append(", updatesForm=");
            sb2.append(this.updatesForm);
            sb2.append(", isVisible=");
            sb2.append(this.isVisible);
            sb2.append(", notSelectedErrorText=");
            sb2.append(this.notSelectedErrorText);
            sb2.append(", minGuests=");
            sb2.append(this.minGuests);
            sb2.append(", maxGuests=");
            sb2.append(this.maxGuests);
            sb2.append(", maxAdultsCount=");
            sb2.append(this.maxAdultsCount);
            sb2.append(", maxChildrenCount=");
            sb2.append(this.maxChildrenCount);
            sb2.append(", initialAdultGuests=");
            sb2.append(this.initialAdultGuests);
            sb2.append(", defaultAdultGuests=");
            sb2.append(this.defaultAdultGuests);
            sb2.append(", initialChildren=");
            sb2.append(this.initialChildren);
            sb2.append(", availableAges=");
            return H.p(sb2, this.availableAges, ')');
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
            Integer num = this.minGuests;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.maxGuests;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            Integer num3 = this.maxAdultsCount;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num3);
            }
            Integer num4 = this.maxChildrenCount;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num4);
            }
            Integer num5 = this.initialAdultGuests;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num5);
            }
            Integer num6 = this.defaultAdultGuests;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num6);
            }
            List<GuestsChild> list = this.initialChildren;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((GuestsChild) itA.next()).writeToParcel(parcel, i12);
                }
            }
            List<ChildrenAvailableAge> list2 = this.availableAges;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((ChildrenAvailableAge) itA2.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: WidgetFiltersGuestsWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WidgetFiltersGuestsWidget> {
        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersGuestsWidget createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
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
            return new WidgetFiltersGuestsWidget(string, string2, string3, boolValueOf, boolValueOf2, boolValueOf3, parcel.readInt() != 0 ? GuestsContent.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersGuestsWidget[] newArray(int i12) {
            return new WidgetFiltersGuestsWidget[i12];
        }
    }

    public WidgetFiltersGuestsWidget(@l String str, @l String str2, @l String str3, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l GuestsContent guestsContent) {
        this.id = str;
        this.title = str2;
        this.defaultPlaceholder = str3;
        this.isExpanded = bool;
        this.isEnabled = bool2;
        this.isNew = bool3;
        this.content = guestsContent;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final GuestsContent getContent() {
        return this.content;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getDefaultPlaceholder() {
        return this.defaultPlaceholder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetFiltersGuestsWidget)) {
            return false;
        }
        WidgetFiltersGuestsWidget widgetFiltersGuestsWidget = (WidgetFiltersGuestsWidget) obj;
        return L.f(this.id, widgetFiltersGuestsWidget.id) && L.f(this.title, widgetFiltersGuestsWidget.title) && L.f(this.defaultPlaceholder, widgetFiltersGuestsWidget.defaultPlaceholder) && L.f(this.isExpanded, widgetFiltersGuestsWidget.isExpanded) && L.f(this.isEnabled, widgetFiltersGuestsWidget.isEnabled) && L.f(this.isNew, widgetFiltersGuestsWidget.isNew) && L.f(this.content, widgetFiltersGuestsWidget.content);
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget
    @k
    public final WidgetFiltersWidget.WidgetType getType() {
        return WidgetFiltersWidget.WidgetType.f330265e;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.defaultPlaceholder;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isExpanded;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEnabled;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isNew;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        GuestsContent guestsContent = this.content;
        return iHashCode6 + (guestsContent != null ? guestsContent.hashCode() : 0);
    }

    @Override // com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget
    @l
    /* renamed from: isEnabled, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @l
    /* renamed from: isNew, reason: from getter */
    public final Boolean getIsNew() {
        return this.isNew;
    }

    @Override // com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget
    @l
    /* renamed from: o0, reason: from getter */
    public final Boolean getIsExpanded() {
        return this.isExpanded;
    }

    @k
    public final String toString() {
        return "WidgetFiltersGuestsWidget(id=" + this.id + ", title=" + this.title + ", defaultPlaceholder=" + this.defaultPlaceholder + ", isExpanded=" + this.isExpanded + ", isEnabled=" + this.isEnabled + ", isNew=" + this.isNew + ", content=" + this.content + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.defaultPlaceholder);
        Boolean bool = this.isExpanded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.isNew;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        GuestsContent guestsContent = this.content;
        if (guestsContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            guestsContent.writeToParcel(parcel, i12);
        }
    }
}

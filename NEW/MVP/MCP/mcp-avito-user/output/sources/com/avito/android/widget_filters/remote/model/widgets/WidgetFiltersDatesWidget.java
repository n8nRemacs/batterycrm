package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersDatesWidget.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\b\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\t\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersDatesWidget;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersWidget;", "", "id", "title", "defaultPlaceholder", "", "isExpanded", "isEnabled", "isNew", "Lcom/avito/android/widget_filters/remote/model/widgets/DatesContent;", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/widget_filters/remote/model/widgets/DatesContent;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "d", "Ljava/lang/Boolean;", "o0", "()Ljava/lang/Boolean;", "Lcom/avito/android/widget_filters/remote/model/widgets/DatesContent;", "c", "()Lcom/avito/android/widget_filters/remote/model/widgets/DatesContent;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WidgetFiltersDatesWidget implements WidgetFiltersWidget {

    @k
    public static final Parcelable.Creator<WidgetFiltersDatesWidget> CREATOR = new a();

    @c("content")
    @l
    private final DatesContent content;

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

    /* compiled from: WidgetFiltersDatesWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WidgetFiltersDatesWidget> {
        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersDatesWidget createFromParcel(Parcel parcel) {
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
            return new WidgetFiltersDatesWidget(string, string2, string3, boolValueOf, boolValueOf2, boolValueOf3, parcel.readInt() != 0 ? DatesContent.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersDatesWidget[] newArray(int i12) {
            return new WidgetFiltersDatesWidget[i12];
        }
    }

    public WidgetFiltersDatesWidget(@l String str, @l String str2, @l String str3, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l DatesContent datesContent) {
        this.id = str;
        this.title = str2;
        this.defaultPlaceholder = str3;
        this.isExpanded = bool;
        this.isEnabled = bool2;
        this.isNew = bool3;
        this.content = datesContent;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DatesContent getContent() {
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
        if (!(obj instanceof WidgetFiltersDatesWidget)) {
            return false;
        }
        WidgetFiltersDatesWidget widgetFiltersDatesWidget = (WidgetFiltersDatesWidget) obj;
        return L.f(this.id, widgetFiltersDatesWidget.id) && L.f(this.title, widgetFiltersDatesWidget.title) && L.f(this.defaultPlaceholder, widgetFiltersDatesWidget.defaultPlaceholder) && L.f(this.isExpanded, widgetFiltersDatesWidget.isExpanded) && L.f(this.isEnabled, widgetFiltersDatesWidget.isEnabled) && L.f(this.isNew, widgetFiltersDatesWidget.isNew) && L.f(this.content, widgetFiltersDatesWidget.content);
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
        return WidgetFiltersWidget.WidgetType.f330264d;
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
        DatesContent datesContent = this.content;
        return iHashCode6 + (datesContent != null ? datesContent.hashCode() : 0);
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
        return "WidgetFiltersDatesWidget(id=" + this.id + ", title=" + this.title + ", defaultPlaceholder=" + this.defaultPlaceholder + ", isExpanded=" + this.isExpanded + ", isEnabled=" + this.isEnabled + ", isNew=" + this.isNew + ", content=" + this.content + ')';
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
        DatesContent datesContent = this.content;
        if (datesContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            datesContent.writeToParcel(parcel, i12);
        }
    }
}

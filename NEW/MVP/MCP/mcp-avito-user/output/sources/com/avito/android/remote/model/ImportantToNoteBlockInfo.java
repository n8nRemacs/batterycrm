package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersListResponse.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/ImportantToNoteBlockInfo;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "bottomSheetTitle", "iconName", "Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "analytics", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;)Lcom/avito/android/remote/model/ImportantToNoteBlockInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "getBottomSheetTitle", "getIconName", "Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "getAnalytics", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImportantToNoteBlockInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<ImportantToNoteBlockInfo> CREATOR = new Creator();

    @c("clickstream")
    @l
    private final SuggestAnalyticsEvent analytics;

    @c("bottomSheetTitle")
    @l
    private final AttributedText bottomSheetTitle;

    @c("iconName")
    @l
    private final String iconName;

    @c("id")
    @l
    private final String id;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: StrSellerOrdersListResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImportantToNoteBlockInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImportantToNoteBlockInfo createFromParcel(@k Parcel parcel) {
            return new ImportantToNoteBlockInfo(parcel.readString(), (AttributedText) parcel.readParcelable(ImportantToNoteBlockInfo.class.getClassLoader()), (AttributedText) parcel.readParcelable(ImportantToNoteBlockInfo.class.getClassLoader()), (AttributedText) parcel.readParcelable(ImportantToNoteBlockInfo.class.getClassLoader()), parcel.readString(), (SuggestAnalyticsEvent) parcel.readParcelable(ImportantToNoteBlockInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImportantToNoteBlockInfo[] newArray(int i12) {
            return new ImportantToNoteBlockInfo[i12];
        }
    }

    public ImportantToNoteBlockInfo(@l String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @l String str2, @l SuggestAnalyticsEvent suggestAnalyticsEvent) {
        this.id = str;
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.bottomSheetTitle = attributedText3;
        this.iconName = str2;
        this.analytics = suggestAnalyticsEvent;
    }

    public static /* synthetic */ ImportantToNoteBlockInfo copy$default(ImportantToNoteBlockInfo importantToNoteBlockInfo, String str, AttributedText attributedText, AttributedText attributedText2, AttributedText attributedText3, String str2, SuggestAnalyticsEvent suggestAnalyticsEvent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = importantToNoteBlockInfo.id;
        }
        if ((i12 & 2) != 0) {
            attributedText = importantToNoteBlockInfo.title;
        }
        AttributedText attributedText4 = attributedText;
        if ((i12 & 4) != 0) {
            attributedText2 = importantToNoteBlockInfo.subtitle;
        }
        AttributedText attributedText5 = attributedText2;
        if ((i12 & 8) != 0) {
            attributedText3 = importantToNoteBlockInfo.bottomSheetTitle;
        }
        AttributedText attributedText6 = attributedText3;
        if ((i12 & 16) != 0) {
            str2 = importantToNoteBlockInfo.iconName;
        }
        String str3 = str2;
        if ((i12 & 32) != 0) {
            suggestAnalyticsEvent = importantToNoteBlockInfo.analytics;
        }
        return importantToNoteBlockInfo.copy(str, attributedText4, attributedText5, attributedText6, str3, suggestAnalyticsEvent);
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
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final SuggestAnalyticsEvent getAnalytics() {
        return this.analytics;
    }

    @k
    public final ImportantToNoteBlockInfo copy(@l String id2, @l AttributedText title, @l AttributedText subtitle, @l AttributedText bottomSheetTitle, @l String iconName, @l SuggestAnalyticsEvent analytics) {
        return new ImportantToNoteBlockInfo(id2, title, subtitle, bottomSheetTitle, iconName, analytics);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImportantToNoteBlockInfo)) {
            return false;
        }
        ImportantToNoteBlockInfo importantToNoteBlockInfo = (ImportantToNoteBlockInfo) other;
        return L.f(this.id, importantToNoteBlockInfo.id) && L.f(this.title, importantToNoteBlockInfo.title) && L.f(this.subtitle, importantToNoteBlockInfo.subtitle) && L.f(this.bottomSheetTitle, importantToNoteBlockInfo.bottomSheetTitle) && L.f(this.iconName, importantToNoteBlockInfo.iconName) && L.f(this.analytics, importantToNoteBlockInfo.analytics);
    }

    @l
    public final SuggestAnalyticsEvent getAnalytics() {
        return this.analytics;
    }

    @l
    public final AttributedText getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    @l
    public final String getIconName() {
        return this.iconName;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
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
        AttributedText attributedText2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        AttributedText attributedText3 = this.bottomSheetTitle;
        int iHashCode4 = (iHashCode3 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        String str2 = this.iconName;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SuggestAnalyticsEvent suggestAnalyticsEvent = this.analytics;
        return iHashCode5 + (suggestAnalyticsEvent != null ? suggestAnalyticsEvent.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ImportantToNoteBlockInfo(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", bottomSheetTitle=" + this.bottomSheetTitle + ", iconName=" + this.iconName + ", analytics=" + this.analytics + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        parcel.writeParcelable(this.bottomSheetTitle, flags);
        parcel.writeString(this.iconName);
        parcel.writeParcelable(this.analytics, flags);
    }
}

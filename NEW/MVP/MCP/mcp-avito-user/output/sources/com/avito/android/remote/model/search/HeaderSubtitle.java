package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InlineFilters.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/search/HeaderSubtitle;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/search/HeaderSubtitleAction;", "action", "Lcom/avito/android/remote/model/text/AttributedText;", "richTitle", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/search/HeaderSubtitleAction;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/search/HeaderSubtitleAction;", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/search/HeaderSubtitleAction;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/search/HeaderSubtitle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/search/HeaderSubtitleAction;", "getAction", "Lcom/avito/android/remote/model/text/AttributedText;", "getRichTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class HeaderSubtitle implements Parcelable {

    @k
    public static final Parcelable.Creator<HeaderSubtitle> CREATOR = new Creator();

    @c("action")
    @l
    private final HeaderSubtitleAction action;

    @c("richTitle")
    @l
    private final AttributedText richTitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: InlineFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HeaderSubtitle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final HeaderSubtitle createFromParcel(@k Parcel parcel) {
            return new HeaderSubtitle(parcel.readString(), parcel.readInt() == 0 ? null : HeaderSubtitleAction.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(HeaderSubtitle.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final HeaderSubtitle[] newArray(int i12) {
            return new HeaderSubtitle[i12];
        }
    }

    public HeaderSubtitle(@k String str, @l HeaderSubtitleAction headerSubtitleAction, @l AttributedText attributedText) {
        this.title = str;
        this.action = headerSubtitleAction;
        this.richTitle = attributedText;
    }

    public static /* synthetic */ HeaderSubtitle copy$default(HeaderSubtitle headerSubtitle, String str, HeaderSubtitleAction headerSubtitleAction, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = headerSubtitle.title;
        }
        if ((i12 & 2) != 0) {
            headerSubtitleAction = headerSubtitle.action;
        }
        if ((i12 & 4) != 0) {
            attributedText = headerSubtitle.richTitle;
        }
        return headerSubtitle.copy(str, headerSubtitleAction, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final HeaderSubtitleAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getRichTitle() {
        return this.richTitle;
    }

    @k
    public final HeaderSubtitle copy(@k String title, @l HeaderSubtitleAction action, @l AttributedText richTitle) {
        return new HeaderSubtitle(title, action, richTitle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderSubtitle)) {
            return false;
        }
        HeaderSubtitle headerSubtitle = (HeaderSubtitle) other;
        return L.f(this.title, headerSubtitle.title) && L.f(this.action, headerSubtitle.action) && L.f(this.richTitle, headerSubtitle.richTitle);
    }

    @l
    public final HeaderSubtitleAction getAction() {
        return this.action;
    }

    @l
    public final AttributedText getRichTitle() {
        return this.richTitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        HeaderSubtitleAction headerSubtitleAction = this.action;
        int iHashCode2 = (iHashCode + (headerSubtitleAction == null ? 0 : headerSubtitleAction.hashCode())) * 31;
        AttributedText attributedText = this.richTitle;
        return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderSubtitle(title=");
        sb2.append(this.title);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", richTitle=");
        return a.w(sb2, this.richTitle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        HeaderSubtitleAction headerSubtitleAction = this.action;
        if (headerSubtitleAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            headerSubtitleAction.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.richTitle, flags);
    }

    public /* synthetic */ HeaderSubtitle(String str, HeaderSubtitleAction headerSubtitleAction, AttributedText attributedText, int i12, C42822w c42822w) {
        this(str, headerSubtitleAction, (i12 & 4) != 0 ? null : attributedText);
    }
}

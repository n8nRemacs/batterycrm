package com.avito.android.remote.model.autoteka_teaser_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.auto_select.SelectButtonParams;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserSelectItemResponse.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectResult;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "title", "Lcom/avito/android/remote/model/auto_select/SelectButtonParams;", "callRequestLink", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/auto_select/SelectButtonParams;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/auto_select/SelectButtonParams;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/auto_select/SelectButtonParams;)Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectResult;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/auto_select/SelectButtonParams;", "getCallRequestLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaTeaserSelectResult implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaTeaserSelectResult> CREATOR = new Creator();

    @c("callRequestLink")
    @l
    private final SelectButtonParams callRequestLink;

    @c("description")
    @l
    private final AttributedText description;

    @c("title")
    @l
    private final String title;

    /* compiled from: AutotekaTeaserSelectItemResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaTeaserSelectResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserSelectResult createFromParcel(@k Parcel parcel) {
            return new AutotekaTeaserSelectResult((AttributedText) parcel.readParcelable(AutotekaTeaserSelectResult.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : SelectButtonParams.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserSelectResult[] newArray(int i12) {
            return new AutotekaTeaserSelectResult[i12];
        }
    }

    public AutotekaTeaserSelectResult(@l AttributedText attributedText, @l String str, @l SelectButtonParams selectButtonParams) {
        this.description = attributedText;
        this.title = str;
        this.callRequestLink = selectButtonParams;
    }

    public static /* synthetic */ AutotekaTeaserSelectResult copy$default(AutotekaTeaserSelectResult autotekaTeaserSelectResult, AttributedText attributedText, String str, SelectButtonParams selectButtonParams, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = autotekaTeaserSelectResult.description;
        }
        if ((i12 & 2) != 0) {
            str = autotekaTeaserSelectResult.title;
        }
        if ((i12 & 4) != 0) {
            selectButtonParams = autotekaTeaserSelectResult.callRequestLink;
        }
        return autotekaTeaserSelectResult.copy(attributedText, str, selectButtonParams);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final SelectButtonParams getCallRequestLink() {
        return this.callRequestLink;
    }

    @k
    public final AutotekaTeaserSelectResult copy(@l AttributedText description, @l String title, @l SelectButtonParams callRequestLink) {
        return new AutotekaTeaserSelectResult(description, title, callRequestLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaTeaserSelectResult)) {
            return false;
        }
        AutotekaTeaserSelectResult autotekaTeaserSelectResult = (AutotekaTeaserSelectResult) other;
        return L.f(this.description, autotekaTeaserSelectResult.description) && L.f(this.title, autotekaTeaserSelectResult.title) && L.f(this.callRequestLink, autotekaTeaserSelectResult.callRequestLink);
    }

    @l
    public final SelectButtonParams getCallRequestLink() {
        return this.callRequestLink;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        AttributedText attributedText = this.description;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SelectButtonParams selectButtonParams = this.callRequestLink;
        return iHashCode2 + (selectButtonParams != null ? selectButtonParams.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AutotekaTeaserSelectResult(description=" + this.description + ", title=" + this.title + ", callRequestLink=" + this.callRequestLink + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.description, flags);
        parcel.writeString(this.title);
        SelectButtonParams selectButtonParams = this.callRequestLink;
        if (selectButtonParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectButtonParams.writeToParcel(parcel, flags);
        }
    }
}

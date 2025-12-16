package com.avito.android.extended_profile_ui_components.search_input.suggest;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/suggest/SuggestItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestItem implements com.avito.conveyor_item.a, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SuggestItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f153423b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CharSequence f153424c;

    /* compiled from: SuggestItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestItem> {
        @Override // android.os.Parcelable.Creator
        public final SuggestItem createFromParcel(Parcel parcel) {
            return new SuggestItem(parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestItem[] newArray(int i12) {
            return new SuggestItem[i12];
        }
    }

    public SuggestItem(@Y61.k String str, @Y61.k CharSequence charSequence) {
        this.f153423b = str;
        this.f153424c = charSequence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestItem)) {
            return false;
        }
        SuggestItem suggestItem = (SuggestItem) obj;
        return L.f(this.f153423b, suggestItem.f153423b) && L.f(this.f153424c, suggestItem.f153424c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124046b() {
        return getF153423b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF153423b() {
        return this.f153423b;
    }

    public final int hashCode() {
        return this.f153424c.hashCode() + (this.f153423b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestItem(stringId=");
        sb2.append(this.f153423b);
        sb2.append(", text=");
        return AK.c.r(sb2, this.f153424c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f153423b);
        TextUtils.writeToParcel(this.f153424c, parcel, i12);
    }
}

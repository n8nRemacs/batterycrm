package com.avito.android.profile.user_profile.cards.recommendations.item;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.user_profile.items.RecommendationsItem;
import kotlin.Metadata;

/* compiled from: RecommendationSnippetItem.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/recommendations/item/RecommendationSnippetItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RecommendationSnippetItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<RecommendationSnippetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f225291b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecommendationsItem.SnippetItem f225292c;

    /* compiled from: RecommendationSnippetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecommendationSnippetItem> {
        @Override // android.os.Parcelable.Creator
        public final RecommendationSnippetItem createFromParcel(Parcel parcel) {
            return new RecommendationSnippetItem(parcel.readString(), (RecommendationsItem.SnippetItem) parcel.readParcelable(RecommendationSnippetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendationSnippetItem[] newArray(int i12) {
            return new RecommendationSnippetItem[i12];
        }
    }

    public RecommendationSnippetItem(@k String str, @k RecommendationsItem.SnippetItem snippetItem) {
        this.f225291b = str;
        this.f225292c = snippetItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    public final long getId() {
        return getF225291b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF225291b() {
        return this.f225291b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f225291b);
        parcel.writeParcelable(this.f225292c, i12);
    }
}
